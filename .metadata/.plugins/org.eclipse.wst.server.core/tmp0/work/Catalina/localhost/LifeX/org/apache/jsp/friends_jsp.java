/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.7
 * Generated at: 2022-06-12 10:25:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.JSONArray;
import org.json.JSONObject;
import Utils.GetImage;

public final class friends_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.json.JSONObject");
    _jspx_imports_classes.add("Utils.GetImage");
    _jspx_imports_classes.add("org.json.JSONArray");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "addBootstrap.jsp", out, false);
      out.write('\r');
      out.write('\n');

response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1
response.setHeader("Pragma", "no-cache"); //HTTP 1.0
response.setHeader("Expires", "0"); //Proxies

if(session.getAttribute("username") == null) {
	request.getRequestDispatcher("Login.jsp").forward(request,response);
}



      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#myInput {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tpadding: 11px;\r\n");
      out.write("\tborder:1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#myTable {\r\n");
      out.write("\tborder: 1px solid #fff;\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("\toverflow-y: scroll;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btnSel {\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: #000;\r\n");
      out.write("    padding: 15px 32px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    margin: 4px 2px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #fafafa;\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\" style=\"margin-top: 80px;\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4 text-center\">\r\n");
      out.write("\t\t\t\t<h1>Search for username</h1>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"myInput\" onkeyup=\"ContactsearchFX()\" autocomplete=\"off\" placeholder=\"Search for users..\">\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t");

				
				JSONArray allUsersList = (JSONArray) session.getAttribute("allUsers");
				
				if(allUsersList.length() == 0) {
				
				} else {
				
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<table id=\"myTable\" class=\"ard\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

					for(int i = 0; i < allUsersList.length(); i++) {
						JSONObject jsonObj = allUsersList.getJSONObject(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<form action=\"OtherUserDetails\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"background-color: #fff; border-bottom: 1px solid #fafafa; width: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"data:image/png;base64,");
      out.print(GetImage.getImage(jsonObj));
      out.write("\" width=\"50px\" style=\"border-radius: 50%; position: absolute; left: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"btnSel\" type=\"submit\" name=\"btnClicked\" value=\"");
      out.print(jsonObj.get("username"));
      out.write("\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"userID\" type=\"hidden\" name=\"indexUser\" value=\"");
      out.print(i);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\twindow.onload = function() {\r\n");
      out.write("\t\tvar rows = document.querySelectorAll('tr:not(.header)');\r\n");
      out.write("\r\n");
      out.write("\t\tfor (var i = 0; i < rows.length; i++) {\r\n");
      out.write("\t\t  rows[i].style.display = 'none';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction ContactsearchFX() {\r\n");
      out.write("\t  var input, filter, table, tr, td, i;\r\n");
      out.write("\t \r\n");
      out.write("\t  input = document.getElementById(\"myInput\");\r\n");
      out.write("\r\n");
      out.write("\t  filter = input.value.toUpperCase();\r\n");
      out.write("\t  table = document.getElementById(\"myTable\");\r\n");
      out.write("\t  tr = table.getElementsByTagName(\"tr\");\r\n");
      out.write("\t  for (i = 0; i < tr.length; i++) {\r\n");
      out.write("\t  \ttd = tr[i].getElementsByTagName(\"td\")[0];\r\n");
      out.write("\t    if (td) {\r\n");
      out.write("\t      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\r\n");
      out.write("\t        tr[i].style.display = \"\";\r\n");
      out.write("\t      } else {\r\n");
      out.write("\t        tr[i].style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("\t      }\r\n");
      out.write("\t    }\r\n");
      out.write("\t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t   var rows = document.querySelectorAll('tr:not(.header)');\r\n");
      out.write("\t   \r\n");
      out.write("\t   if (input.value.length == 0) {\r\n");
      out.write("\t    for (var i = 0; i < rows.length; i++) {\r\n");
      out.write("\t      rows[i].style.display = 'none';\r\n");
      out.write("\t    }\r\n");
      out.write("\t  }\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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