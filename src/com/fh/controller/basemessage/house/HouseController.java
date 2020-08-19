package com.fh.controller.basemessage.house;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.entity.system.User;
import com.fh.util.AppUtil;
import com.fh.util.DateUtil;
import com.fh.util.ObjectExcelView;
import com.fh.util.Const;
import com.fh.util.PageData;
import com.fh.util.Tools;
import com.fh.util.Jurisdiction;
import com.fh.service.basemessage.house.HouseService;
import com.fh.service.dictionaries.floor.FloorService;
import com.fh.service.dictionaries.sqmanager.SqmanagerService;

/**
 * 类名称：HouseController 创建人：FH 创建时间：2018-05-02
 */
@Controller
@RequestMapping(value = "/house")
public class HouseController extends BaseController {

  String menuUrl = "house/list.do"; // 菜单地址(权限用)
  @Resource(name = "houseService")
  private HouseService houseService;
  @Resource(name = "floorService")
  private FloorService floorService;
  @Resource(name = "sqmanagerService")
  private SqmanagerService sqmanagerService;

  /**
   * 新增
   */
  @RequestMapping(value = "/save")
  public ModelAndView save() throws Exception {
    logBefore(logger, "新增House");
    if (!Jurisdiction.buttonJurisdiction(menuUrl, "add")) {
      return null;
    } // 校验权限
    ModelAndView mv = this.getModelAndView();
    PageData pd = new PageData();
    pd = this.getPageData();
    pd.put("HOUSE_ID", this.get32UUID()); // 主键
    Subject currentUser = SecurityUtils.getSubject();
    Session session = currentUser.getSession();
    User user = (User) session.getAttribute(Const.SESSION_USER);
    pd.put("CREATOR", user.getUSERNAME()); // 创建人
    pd.put("CREATEDATE", DateUtil.getTime().toString()); // 创建日期
    houseService.save(pd);
    mv.addObject("msg", "success");
    mv.setViewName("save_result");
    return mv;
  }

  /**
   * 删除
   */
  @RequestMapping(value = "/delete")
  public void delete(PrintWriter out) {
    logBefore(logger, "删除House");
    if (!Jurisdiction.buttonJurisdiction(menuUrl, "del")) {
      return;
    } // 校验权限
    PageData pd = new PageData();
    try {
      pd = this.getPageData();
      houseService.delete(pd);
      out.write("success");
      out.close();
    } catch (Exception e) {
      logger.error(e.toString(), e);
    }

  }

  /**
   * 修改
   */
  @RequestMapping(value = "/edit")
  public ModelAndView edit() throws Exception {
    logBefore(logger, "修改House");
    if (!Jurisdiction.buttonJurisdiction(menuUrl, "edit")) {
      return null;
    } // 校验权限
    ModelAndView mv = this.getModelAndView();
    PageData pd = new PageData();
    pd = this.getPageData();
    houseService.edit(pd);
    mv.addObject("msg", "success");
    mv.setViewName("save_result");
    return mv;
  }

  /**
   * 列表
   */
  @RequestMapping(value = "/list")
  public ModelAndView list(Page page,String KEYWORD) {
    logBefore(logger, "列表House");
    // if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;} //校验权限
    ModelAndView mv = this.getModelAndView();
    PageData pd = new PageData();
    try {
      pd = this.getPageData();
      page.setPd(pd);
      Subject currentUser = SecurityUtils.getSubject();
	    Session session = currentUser.getSession();
	    session.setAttribute("house", KEYWORD);
      List<PageData> varList = houseService.list(page); // 列出House列表
      mv.setViewName("basemessage/house/house_list");
      mv.addObject("varList", varList);
      mv.addObject("pd", pd);
      mv.addObject(Const.SESSION_QX, this.getHC()); // 按钮权限
    } catch (Exception e) {
      logger.error(e.toString(), e);
    }
    return mv;
  }

  /**
   * 去新增页面
   */
  @RequestMapping(value = "/goAdd")
  public ModelAndView goAdd() {
    logBefore(logger, "去新增House页面");
    ModelAndView mv = this.getModelAndView();
    PageData pd = new PageData();
    pd = this.getPageData();
    try {
      List<PageData>    gridList = sqmanagerService.listAll(pd);    //列出网格列表
      List<PageData>    floorList = floorService.listAll(pd);  //列出Floor列表
      mv.addObject("floorList", floorList);
      mv.addObject("gridList", gridList);
      mv.setViewName("basemessage/house/house_edit");
      mv.addObject("msg", "save");
      mv.addObject("pd", pd);
    } catch (Exception e) {
      logger.error(e.toString(), e);
    }
    return mv;
  }

  /**
   * 去修改页面
   */
  @RequestMapping(value = "/goEdit")
  public ModelAndView goEdit() {
    logBefore(logger, "去修改House页面");
    ModelAndView mv = this.getModelAndView();
    PageData pd = new PageData();
    pd = this.getPageData();
    try {
      pd = houseService.findById(pd); // 根据ID读取
      List<PageData>    gridList = sqmanagerService.listAll(pd);    //列出网格列表
      List<PageData>    floorList = floorService.listAll(pd);  //列出Floor列表
      mv.addObject("floorList", floorList);
      mv.addObject("gridList", gridList);
      mv.setViewName("basemessage/house/house_edit");
      mv.addObject("msg", "edit");
      mv.addObject("pd", pd);
    } catch (Exception e) {
      logger.error(e.toString(), e);
    }
    return mv;
  }

  /**
   * 批量删除
   */
  @RequestMapping(value = "/deleteAll")
  @ResponseBody
  public Object deleteAll() {
    logBefore(logger, "批量删除House");
    if (!Jurisdiction.buttonJurisdiction(menuUrl, "dell")) {
      return null;
    } // 校验权限
    PageData pd = new PageData();
    Map<String, Object> map = new HashMap<String, Object>();
    try {
      pd = this.getPageData();
      List<PageData> pdList = new ArrayList<PageData>();
      String DATA_IDS = pd.getString("DATA_IDS");
      if (null != DATA_IDS && !"".equals(DATA_IDS)) {
        String ArrayDATA_IDS[] = DATA_IDS.split(",");
        houseService.deleteAll(ArrayDATA_IDS);
        pd.put("msg", "ok");
      } else {
        pd.put("msg", "no");
      }
      pdList.add(pd);
      map.put("list", pdList);
    } catch (Exception e) {
      logger.error(e.toString(), e);
    } finally {
      logAfter(logger);
    }
    return AppUtil.returnObject(pd, map);
  }
  /**
   * 根据楼Id获取房屋列表
   */
  @RequestMapping(value = "/byFloorId")
  @ResponseBody
  public Object byFloorId() {
      Map<String, List<PageData>> map = new HashMap<String, List<PageData>>();
      List<PageData> houseList= new ArrayList<>();
      PageData pd = new PageData();
      try {
          pd = this.getPageData();
          
          houseList=houseService.listAll(pd);
      } catch (Exception e) {
          logger.error(e.toString(), e);
      }
      map.put("houseList", houseList); // 返回结果
      return AppUtil.returnObject(new PageData(), map);
  }
  /*
   * 导出到excel
   * 
   * @return
   */
  @RequestMapping(value = "/excel")
  public ModelAndView exportExcel() {
    logBefore(logger, "导出House到excel");
    if (!Jurisdiction.buttonJurisdiction(menuUrl, "cha")) {
      return null;
    }
    ModelAndView mv = new ModelAndView();
    PageData pd = new PageData();
    pd = this.getPageData();
	Subject currentUser = SecurityUtils.getSubject();
    Session session = currentUser.getSession();
    pd.put("KEYWORD", session.getAttribute("house"));    
    try {
      Map<String, Object> dataMap = new HashMap<String, Object>();
      List<String> titles = new ArrayList<String>();
      titles.add("网格名称"); // 1
      titles.add("楼号"); // 2
      titles.add("房号"); // 3
      titles.add("户主"); // 4
      titles.add("房屋属性"); // 5
      titles.add("房屋状态"); // 6
      titles.add("产权类型"); // 7
      titles.add("创建日期"); // 8
      titles.add("创建人"); // 9
      dataMap.put("titles", titles);
      List<PageData> varOList = houseService.listAll(pd);
      List<PageData> varList = new ArrayList<PageData>();
      for (int i = 0; i < varOList.size(); i++) {
        PageData vpd = new PageData();
        vpd.put("var1", varOList.get(i).getString("GRIDNAME")); // 2
        vpd.put("var2", varOList.get(i).getString("FLOORNAME")); // 4
        vpd.put("var3", varOList.get(i).getString("HOUSENAME")); // 4
        vpd.put("var4", varOList.get(i).getString("HOUSEHOLDER")); // 5
        vpd.put("var5", varOList.get(i).getString("HOUSETYPE")); // 6
        vpd.put("var6", varOList.get(i).getString("HOUSESTATUS")); // 7
        vpd.put("var7", varOList.get(i).getString("PROPERTYRIGHT")); // 8
        vpd.put("var8", varOList.get(i).getString("CREATEDATE")); // 9
        vpd.put("var9", varOList.get(i).getString("CREATOR")); // 10
        varList.add(vpd);
      }
      dataMap.put("varList", varList);
      ObjectExcelView erv = new ObjectExcelView();
      mv = new ModelAndView(erv, dataMap);
    } catch (Exception e) {
      logger.error(e.toString(), e);
    }
    return mv;
  }

  /* ===============================权限================================== */
  public Map<String, String> getHC() {
    Subject currentUser = SecurityUtils.getSubject(); // shiro管理的session
    Session session = currentUser.getSession();
    return (Map<String, String>) session.getAttribute(Const.SESSION_QX);
  }
  /* ===============================权限================================== */

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    binder.registerCustomEditor(Date.class, new CustomDateEditor(format, true));
  }
}
