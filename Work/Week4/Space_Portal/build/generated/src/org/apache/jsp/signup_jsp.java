package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Sign up</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"register-styles.css\">\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction validateForm() {\n");
      out.write("\t\t\tvar email = document.signup_form.email_id.value;\n");
      out.write("\t\t\tvar confirm_email=document.signup_form.confirm_email.value;\n");
      out.write("\t\t\tvar password=document.signup_form.password.value;\n");
      out.write("\t\t\tvar confirm_password=document.signup_form.confirm_password.value;\n");
      out.write("\t\t\tif(email !== confirm_email){\n");
      out.write("\t\t\t\talert(\"Emails do not match\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (password !== confirm_password) {\n");
      out.write("\t\t\t\talert(\"Passwords do not match\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"main-container\">\n");
      out.write("\t\t<div id=\"app-name-container\">\n");
      out.write("\t\t\t<div id=\"function\">\n");
      out.write("\t\t\t\t\tRegister to\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"app-name\">\n");
      out.write("\t\t\t\tSpace Portal\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"registration-box\">\n");
      out.write("\n");
      out.write("\t\t\t\t<form name=\"signup_form\" method=\"POST\" action=\"create_user\" onSubmit=\"return validateForm();\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-box\" name=\"firstname\" placeholder=\"  First Name\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-box\" name=\"lastname\" placeholder=\"  Last Name\" required>\n");
      out.write("\t\t\t\t\t<input type=\"email\" class=\"input-box\" name=\"email_id\" placeholder=\"  Email\" required>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<input type=\"email\" class=\"input-box\" name=\"confirm_email\" placeholder=\"  Confirm Email\" required>\n");
      out.write("                                        ");
 
                                            if("email_exists".equals(session.getAttribute("status"))){
                                                out.print("&nbsp;&nbsp;&nbsp;Email id " +(String)session.getAttribute("attempted_email") + " already exists,try again<br>");
                                            }
                                            session.invalidate();
                                        
      out.write("\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"input-box\"name=\"password\" placeholder=\"  Password\" required>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"input-box\"name=\"confirm_password\" placeholder=\"  Confirm Password\" required>\n");
      out.write("\t\t\t\t\t<div id=\"submit-box\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"submit-btn\" value=\"Create account\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
