package org.apache.jsp.temp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.mypackage.helper.User;

public final class edit_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");

    
    if(!"logged_in".equals(session.getAttribute("status"))){
        response.sendRedirect("index.jsp");
    }
    String email = (String)session.getAttribute("user");
    User userObj = new User(email);
    String addressLine1 = userObj.getAddressLine1(),addressLine2 = userObj.getAddressLine2(), city = userObj.getCity(), zip =userObj.getCity();

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Edit details</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"edit-details-styles.css\">\n");
      out.write("        <script>\n");
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
      out.write("</head>\n");
      out.write("<body onload=\"check()\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div id=\"app-name\">Space Portal</div>\n");
      out.write("\t\t<div id=\"block\"></div>\n");
      out.write("\t\t<div id=\"right-buttons\">\n");
      out.write("\t\t\t<div id=\"user-name\">\n");
      out.write("                            Hi ");
 out.print(userObj.getFirstName()); 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" id=\"deactivate-button-box\" onClick=\"parent.location='deactivate'\" value=\"Deactivate!\"/>\n");
      out.write("                        <input type=\"submit\" id=\"logout-button-box\" onClick=\"parent.location='index.jsp'\" value=\"Logout\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"app-container\">\n");
      out.write("\t\t<div id=\"app-welcome-container\">\n");
      out.write("\t\t\tEdit details\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"edit-container\">\n");
      out.write("\t\t\t<form name=\"login-form\" method=\"POST\" action=\"edit_detail\">\n");
      out.write("\t\t\t\t<div id=\"name-block\">\n");
      out.write("\t\t\t\t\t<div id=\"name-label-box\">Name:</div>\n");
      out.write("\t\t\t\t\t<div i=\"name-box\">\n");
      out.write("\t\t\t\t\t\t<div id=\"user-input-firstname-box\">\n");
      out.write("                                                    <input type=\"text\" class=\"input-box\" name=\"firstname\" maxlength=\"10\" value=\"");
out.print(userObj.getFirstName());
      out.write("\" placeholder=\"First Name\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"user-input-lastname-box\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"input-box\" name=\"lastname\" maxlength=\"10\" value=\"");
out.print(userObj.getLastName());
      out.write("\" placeholder=\"Last Name\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"email-block\">\n");
      out.write("\t\t\t\t\t<div id=\"email-label-box\">Email:</div>\n");
      out.write("\t\t\t\t\t<div id=\"email-box\">\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" id=\"email-input-box\" name=\"email_id\" value=\"");
out.print(userObj.getEmail()); 
      out.write("\" readonly>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"address-block\">\n");
      out.write("\t\t\t\t\t<div id=\"address-label-box\">Address</div>\n");
      out.write("\t\t\t\t\t<div id=\"address-box\">\n");
      out.write("\t\t\t\t\t\t<div id=\"address-line\">\n");
      out.write("                                                    <input type=\"text\" class=\"address-input-box\" name=\"address_line_1\" value=\"");
out.print(addressLine1);
      out.write("\" placeholder=\"Address Line 1\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"address-line\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"address-input-box\" name=\"address_line_2\" value=\"");
out.print(addressLine2);
      out.write("\" placeholder=\"Address Line 2\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"address-line\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"input-box\" name=\"city\" value=\"");
out.print(city);
      out.write("\" placeholder=\"City\" required>\n");
      out.write("\t\t\t\t\t\t\t<select name=\"state\" class=\"input-box\" required>\n");
      out.write("                                                          <option value=\"\" disabled selected>State</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"Karnataka\">Karnataka</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"Tamil nadu\">Tamil nadu</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"Kerala\">Kerala</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"Orissa\">Orissa</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"address-line\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"input-box\" maxlength=\"10\" name=\"zip\" value=\"");
out.print(zip);
      out.write("\" placeholder=\"Zip\" required>\n");
      out.write("\t\t\t\t\t\t\t<select name=\"country\" class=\"input-box\" required>\n");
      out.write("                                                           <option value=\"\" disabled selected>Country</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"India\">India</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"U.S.A\">U.S.A</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"Sri Lanka\">Sri Lanka</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id = \"edit-details-box\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"save-btn\" value=\"Save details\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <form name=\"ignore_me\">\n");
      out.write("            <input type=\"hidden\" id=\"page_is_dirty\" name=\"page_is_dirty\" value=\"0\" />\n");
      out.write("        </form> \n");
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
