/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.7
 * Generated at: 2022-06-11 15:30:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "addBootstrap.jsp", out, false);
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/registration.css\" type=\"text/css\"></link>\r\n");

response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1
response.setHeader("Pragma", "no-cache"); //HTTP 1.0
response.setHeader("Expires", "0"); //Proxies

if (session.getAttribute("username") != null) {
	request.getRequestDispatcher("HomePage.jsp").forward(request, response);	
}


      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("input[type='submit']:disabled{\r\n");
      out.write("\tcursor: not-allowed !important;\r\n");
      out.write("\topacity: .3 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:focus ~ .floating-label,\r\n");
      out.write("input:not(:focus):valid ~ .floating-label{\r\n");
      out.write("  top: 182px;\r\n");
      out.write("  left: 515px;\r\n");
      out.write("  font-size: 9px;\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".floating-label {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  pointer-events: none;\r\n");
      out.write("  left: 515px;\r\n");
      out.write("  top: 185px;\r\n");
      out.write("  transition: 0.2s ease all;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"registerInbox\">\r\n");
      out.write("\t\t\t<h1>LifeX</h1>\r\n");
      out.write("\t\t\t<p style=\"text-align: center;\"><em>Sign up to become a better version of yourself.</em></p>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<form action=\"RegServlet\" method=\"post\" id=\"regForm\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr><td><p id=\"emailResult\" style=\"color: red;\"></p></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Email Address\" required></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><p id=\"usernameResult\" style=\"color: red;\"></p></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><input id=\"username\" type=\"text\" name=\"username\" placeholder=\"Username\" required></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><input id=\"firstName\" type=\"text\" name=\"first_name\" placeholder=\"First Name\" required></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><input id=\"lastName\" type=\"text\" name=\"last_name\" placeholder=\"Last Name\" required></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><input id=\"password\" type=\"password\" name=\"password\" placeholder=\"Password\" required></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><p id=\"passResult\" style=\"color: red\"></p></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><input id=\"cPassword\" type=\"password\" name=\"cPassword\" placeholder=\"Re-enter Password\" required></td></tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<input id=\"signUp\" type=\"submit\" name=\"btnSubmit\" value=\"Sign up\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div class=\"tandc\">\r\n");
      out.write("\t\t\t\t\t<em style=\"color:darkgrey;\">By signing up, you agree to our</em> <p>Terms, Data Policy</p> <em style=\"color:darkgrey;\">and</em> <p>Cookies Policy.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"goBack\">\r\n");
      out.write("\t\t\t<p style=\"font-size: 14px; text-align: center; padding: 10px;\">Already have an account?<a style=\"text-decoration: none; color: blue\" href=\"Login.jsp\"> &nbsp&nbspLogin</a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t$('#email').change(function(){\r\n");
      out.write("\t\t\t\tvar email = $('#email').val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype:'POST',\r\n");
      out.write("\t\t\t\t\tdata:{email:email},\r\n");
      out.write("\t\t\t\t\turl:'CheckUsernameEmailServlet',\r\n");
      out.write("\t\t\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(result);\r\n");
      out.write("\t\t\t\t\t\tif(result == 'Email Already Exists') {\r\n");
      out.write("\t\t\t\t\t\t\t$('#emailResult').html(result);\r\n");
      out.write("\t\t\t\t\t\t    $(\"#signUp\").prop(\"disabled\", true);    \r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$('#emailResult').html('');\r\n");
      out.write("\t\t\t\t\t\t    $(\"#signUp\").prop(\"disabled\", false);    \r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#username').change(function(){\r\n");
      out.write("\t\t\t\tvar username = $('#username').val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype:'POST',\r\n");
      out.write("\t\t\t\t\tdata:{username:username},\r\n");
      out.write("\t\t\t\t\turl:'CheckUsernameEmailServlet',\r\n");
      out.write("\t\t\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(result);\r\n");
      out.write("\t\t\t\t\t\tif(result == 'Username Already Exists') {\r\n");
      out.write("\t\t\t\t\t\t\t$('#usernameResult').html(result);\r\n");
      out.write("\t\t\t\t\t\t    $(\"#signUp\").prop(\"disabled\", true);    \r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$('#usernameResult').html('');\r\n");
      out.write("\t\t\t\t\t\t    $(\"#signUp\").prop(\"disabled\", false);    \r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#password, #cPassword').on('keyup', function () {\r\n");
      out.write("\t\t\t\t  if ($('#password').val() == $('#cPassword').val()) {\r\n");
      out.write("\t\t\t\t    $('#passResult').html('');\r\n");
      out.write("\t\t\t\t    $(\"#signUp\").prop(\"disabled\", false);    \r\n");
      out.write("\t\t\t\t  } else {\r\n");
      out.write("\t\t\t\t    $('#passResult').html('Password Doesn\\'t\\ match');\r\n");
      out.write("\t\t\t\t    $(\"#signUp\").prop(\"disabled\", true);    \r\n");
      out.write("\t\t\t\t}});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
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
