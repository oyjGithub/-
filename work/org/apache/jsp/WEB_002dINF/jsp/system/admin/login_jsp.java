/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.68
 * Generated at: 2018-04-24 02:58:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.system.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.SYSNAME}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</title>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/login/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/login/css/camera.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/login/bootstrap-responsive.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/login/matrix-login.css\" />\r\n");
      out.write("<link href=\"static/login/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/js/jquery-1.5.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tstyle=\"width:100%;text-align: center;margin: 0 auto;position: absolute;\">\r\n");
      out.write("\t\t<div id=\"loginbox\">\r\n");
      out.write("\t\t\t<form action=\"\" method=\"post\" name=\"loginForm\"\r\n");
      out.write("\t\t\t\tid=\"loginForm\">\r\n");
      out.write("\t\t\t\t<div class=\"control-group normal_text\">\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"static/login/logo.png\" alt=\"Logo\" />\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"main_input_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"add-on bg_lg\">\r\n");
      out.write("\t\t\t\t\t\t\t<i><img height=\"37\" src=\"static/login/user.png\" /></i>\r\n");
      out.write("\t\t\t\t\t\t\t</span><input type=\"text\" name=\"loginname\" id=\"loginname\" value=\"\" placeholder=\"请输入用户名\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"main_input_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"add-on bg_ly\">\r\n");
      out.write("\t\t\t\t\t\t\t<i><img height=\"37\" src=\"static/login/suo.png\" /></i>\r\n");
      out.write("\t\t\t\t\t\t\t</span><input type=\"password\" name=\"password\" id=\"password\" placeholder=\"请输入密码\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"float:right;padding-right:10%;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"float: left;margin-top:3px;margin-right:2px;\">\r\n");
      out.write("\t\t\t\t\t\t<font color=\"white\">记住密码</font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"float: left;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"form-field-checkbox\" id=\"saveid\" type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"savePaw();\" style=\"padding-top:0px;\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t<div style=\"width:86%;padding-left:8%;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"float: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t<i><img src=\"static/login/yan.png\" /></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"float: left;\" class=\"codediv\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"code\" id=\"code\" class=\"login_code\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"height:16px; padding-top:0px;\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"float: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t<i><img style=\"height:22px;\" id=\"codeImg\" alt=\"点击更换\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"点击更换\" src=\"\" /></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"pull-right\" style=\"padding-right:3%;\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:quxiao();\" class=\"btn btn-success\">取消</a></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"pull-right\"><a onclick=\"severCheck();\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"flip-link btn btn-info\" id=\"to-recover\">登录</a></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t<div class=\"main_input_box\">\r\n");
      out.write("\t\t\t\t\t<font color=\"white\"><span id=\"nameerr\">Copyright © FH\r\n");
      out.write("\t\t\t\t\t\t\t2100</span></font>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"templatemo_banner_slide\" class=\"container_wapper\">\r\n");
      out.write("\t\t<div class=\"camera_wrap camera_emboss\" id=\"camera_slide\">\r\n");
      out.write("\t\t\t<div data-src=\"static/login/images/banner_slide_01.jpg\"></div>\r\n");
      out.write("\t\t\t<div data-src=\"static/login/images/banner_slide_02.jpg\"></div>\r\n");
      out.write("\t\t\t<div data-src=\"static/login/images/banner_slide_03.jpg\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- #camera_wrap_3 -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t//服务器校验\r\n");
      out.write("\t\tfunction severCheck(){\r\n");
      out.write("\t\t\tif(check()){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar loginname = $(\"#loginname\").val();\r\n");
      out.write("\t\t\t\tvar password = $(\"#password\").val();\r\n");
      out.write("\t\t\t\tvar code = \"qq123456789fh\"+loginname+\",fh,\"+password+\"QQ987654321fh\"+\",fh,\"+$(\"#code\").val();\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\t\turl: 'login_login',\r\n");
      out.write("\t\t\t    \tdata: {KEYDATA:code,tm:new Date().getTime()},\r\n");
      out.write("\t\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\t\tcache: false,\r\n");
      out.write("\t\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t\tif(\"success\" == data.result){\r\n");
      out.write("\t\t\t\t\t\t\tsaveCookie();\r\n");
      out.write("\t\t\t\t\t\t\twindow.location.href=\"main/index\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"usererror\" == data.result){\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#loginname\").tips({\r\n");
      out.write("\t\t\t\t\t\t\t\tside : 1,\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg : \"用户名或密码有误\",\r\n");
      out.write("\t\t\t\t\t\t\t\tbg : '#FF5080',\r\n");
      out.write("\t\t\t\t\t\t\t\ttime : 15\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#loginname\").focus();\r\n");
      out.write("\t\t\t\t\t\t}else if(\"codeerror\" == data.result){\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#code\").tips({\r\n");
      out.write("\t\t\t\t\t\t\t\tside : 1,\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg : \"验证码输入有误\",\r\n");
      out.write("\t\t\t\t\t\t\t\tbg : '#FF5080',\r\n");
      out.write("\t\t\t\t\t\t\t\ttime : 15\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#code\").focus();\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#loginname\").tips({\r\n");
      out.write("\t\t\t\t\t\t\t\tside : 1,\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg : \"缺少参数\",\r\n");
      out.write("\t\t\t\t\t\t\t\tbg : '#FF5080',\r\n");
      out.write("\t\t\t\t\t\t\t\ttime : 15\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#loginname\").focus();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\tchangeCode();\r\n");
      out.write("\t\t\t$(\"#codeImg\").bind(\"click\", changeCode);\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(document).keyup(function(event) {\r\n");
      out.write("\t\t\tif (event.keyCode == 13) {\r\n");
      out.write("\t\t\t\t$(\"#to-recover\").trigger(\"click\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction genTimestamp() {\r\n");
      out.write("\t\t\tvar time = new Date();\r\n");
      out.write("\t\t\treturn time.getTime();\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction changeCode() {\r\n");
      out.write("\t\t\t$(\"#codeImg\").attr(\"src\", \"code.do?t=\" + genTimestamp());\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t//客户端校验\r\n");
      out.write("\t\tfunction check() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($(\"#loginname\").val() == \"\") {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#loginname\").tips({\r\n");
      out.write("\t\t\t\t\tside : 2,\r\n");
      out.write("\t\t\t\t\tmsg : '用户名不得为空',\r\n");
      out.write("\t\t\t\t\tbg : '#AE81FF',\r\n");
      out.write("\t\t\t\t\ttime : 3\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#loginname\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#loginname\").val(jQuery.trim($('#loginname').val()));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($(\"#password\").val() == \"\") {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#password\").tips({\r\n");
      out.write("\t\t\t\t\tside : 2,\r\n");
      out.write("\t\t\t\t\tmsg : '密码不得为空',\r\n");
      out.write("\t\t\t\t\tbg : '#AE81FF',\r\n");
      out.write("\t\t\t\t\ttime : 3\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#password\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif ($(\"#code\").val() == \"\") {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#code\").tips({\r\n");
      out.write("\t\t\t\t\tside : 1,\r\n");
      out.write("\t\t\t\t\tmsg : '验证码不得为空',\r\n");
      out.write("\t\t\t\t\tbg : '#AE81FF',\r\n");
      out.write("\t\t\t\t\ttime : 3\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#code\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#loginbox\").tips({\r\n");
      out.write("\t\t\t\tside : 1,\r\n");
      out.write("\t\t\t\tmsg : '正在登录 , 请稍后 ...',\r\n");
      out.write("\t\t\t\tbg : '#68B500',\r\n");
      out.write("\t\t\t\ttime : 10\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction savePaw() {\r\n");
      out.write("\t\t\tif (!$(\"#saveid\").attr(\"checked\")) {\r\n");
      out.write("\t\t\t\t$.cookie('loginname', '', {\r\n");
      out.write("\t\t\t\t\texpires : -1\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$.cookie('password', '', {\r\n");
      out.write("\t\t\t\t\texpires : -1\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\"#loginname\").val('');\r\n");
      out.write("\t\t\t\t$(\"#password\").val('');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction saveCookie() {\r\n");
      out.write("\t\t\tif ($(\"#saveid\").attr(\"checked\")) {\r\n");
      out.write("\t\t\t\t$.cookie('loginname', $(\"#loginname\").val(), {\r\n");
      out.write("\t\t\t\t\texpires : 7\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$.cookie('password', $(\"#password\").val(), {\r\n");
      out.write("\t\t\t\t\texpires : 7\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction quxiao() {\r\n");
      out.write("\t\t\t$(\"#loginname\").val('');\r\n");
      out.write("\t\t\t$(\"#password\").val('');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery(function() {\r\n");
      out.write("\t\t\tvar loginname = $.cookie('loginname');\r\n");
      out.write("\t\t\tvar password = $.cookie('password');\r\n");
      out.write("\t\t\tif (typeof(loginname) != \"undefined\"\r\n");
      out.write("\t\t\t\t\t&& typeof(password) != \"undefined\") {\r\n");
      out.write("\t\t\t\t$(\"#loginname\").val(loginname);\r\n");
      out.write("\t\t\t\t$(\"#password\").val(password);\r\n");
      out.write("\t\t\t\t$(\"#saveid\").attr(\"checked\", true);\r\n");
      out.write("\t\t\t\t$(\"#code\").focus();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t//TOCMAT重启之后 点击左侧列表跳转登录首页 \r\n");
      out.write("\t\tif (window != top) {\r\n");
      out.write("\t\t\ttop.location.href = location.href;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"static/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"static/js/jquery-1.7.2.js\"></script>\r\n");
      out.write("\t<script src=\"static/login/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<script src=\"static/login/js/jquery.mobile.customized.min.js\"></script>\r\n");
      out.write("\t<script src=\"static/login/js/camera.min.js\"></script>\r\n");
      out.write("\t<script src=\"static/login/js/templatemo_script.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"static/js/jquery.tips.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"static/js/jquery.cookie.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
