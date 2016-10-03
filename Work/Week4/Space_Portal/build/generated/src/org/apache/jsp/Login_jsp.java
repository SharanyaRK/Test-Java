package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");

           // Check if this is new comer on your web page.
           String loginMessage = "";
           String passwordMessage = "",attemptedEmail="";
           if(!session.isNew()){
               if("logged_in".equals(session.getAttribute("status"))){
                   response.sendRedirect("details.jsp");
               }
               else if("incorrect_email".equals(session.getAttribute("status"))){
                   loginMessage = "The email does not exist, please sign up";                 
               }
               else if("incorrect_password".equals(session.getAttribute("status"))){
                   attemptedEmail = (String) session.getAttribute("attempted_email");
                   passwordMessage = "Incorrect password,try again";                  
               }
           }

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login-styles.css\">\n");
      out.write("         <script>\n");
      out.write("             function check(){\n");
      out.write("                 var dirty_bit = document.getElementById('page_is_dirty');\n");
      out.write("                \n");
      out.write("                 if (dirty_bit.value === '1') {\n");
      out.write("                     window.location.reload();\n");
      out.write("                 }\n");
      out.write("                 else{\n");
      out.write("                     dirty_bit.value = '1';\n");
      out.write("                 }\n");
      out.write("             }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body onload=\"check()\">\n");
      out.write("\t<div id=\"main-container\">\n");
      out.write("\t\t<div id=\"sub-container\">\n");
      out.write("\t\t\t<div id=\"app-name-container\">\n");
      out.write("\t\t\t\t<div id=\"app-name\">\n");
      out.write("\t\t\t\t\tSpace Portal\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"function\">\n");
      out.write("\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"login-box\">\n");
      out.write("\n");
      out.write("\t\t\t\t<form name=\"login-form\" action=\"login\" method=\"POST\">\n");
      out.write("\t\t\t\t\t<div id=\"user-input-login-box\">\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" class=\"input-box\" value = \"");
 out.print(attemptedEmail); 
      out.write("\" name=\"email_id\" placeholder=\"Username\" required></input>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"login-error-message-box\">\n");
      out.write("\t\t\t\t\t\t");
 out.print(loginMessage); 
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div id=\"user-input-password-box\">\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"input-box\" name=\"password\" placeholder=\"&#9679;&#9679;&#9679;&#9679;&#9679;\" required></input>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"password-error-message-box\">\n");
      out.write("\t\t\t\t\t\t");
 out.print( passwordMessage); 
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div id=\"submit-button-box\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"submit-btn\" value=\"Login\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<input type=\"submit\" onClick=\"parent.location='signup.jsp'\" id=\"sign-up-box\" value=\"New around here?\">\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("        <form name=\"ignore_me\">\n");
      out.write("            <input type=\"hidden\" id=\"page_is_dirty\" name=\"page_is_dirty\" value=\"0\" />\n");
      out.write("        </form>                              \n");
      out.write("</body>\n");
      out.write("</html> ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
