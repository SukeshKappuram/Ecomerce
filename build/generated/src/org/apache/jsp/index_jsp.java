package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/SignUp.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .header{\n");
      out.write("                width:100%;\n");
      out.write("                height: 130px;\n");
      out.write("                background-color: black;             \n");
      out.write("            }\n");
      out.write("            .header h1{\n");
      out.write("                font-size: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .header nav{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 30px;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            .header nav a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 20px 90px 20px 90px;\n");
      out.write("            }\n");
      out.write("            .footer{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                bottom: 0px;\n");
      out.write("                position: fixed;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>E-commerce Online</h1>\n");
      out.write("            <nav>\n");
      out.write("                <a href=\"#\">Home</a> |\n");
      out.write("                <a href=\"#\">Home</a> |\n");
      out.write("                <a href=\"#\">Home</a> |\n");
      out.write("                <a href=\"#\">Home</a> |\n");
      out.write("                <a href=\"#\">Home</a> |\n");
      out.write("                <a href=\"#\">Home</a>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"section1\">\n");
      out.write("                <img src=\"images/heroillustration.jpg\" width=\"50%\" height=\"630\" alt=\"heroillustration\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"section2\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <form method='post' action='User'>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Login</legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='email' name='mailId' placeholder='Email Id' required=\"required\"/></td>\n");
      out.write("                        <td><input type='password' name='password' placeholder='Password' required=\"required\"/></td>\n");
      out.write("                        <td><input type='submit' value='Login'/><td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form method='post' action='User'>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Sign Up</legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='text' name='firstName' placeholder='First Name' required=\"required\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='text' name='lastName' placeholder='Last Name' required=\"required\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label> Gender </label>\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"Male\" checked> \n");
      out.write("                            <label> Male </label>\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"Female\"> \n");
      out.write("                            <label> Female </label>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='date' name='dob' placeholder='dd/MM/yyyy' required=\"required\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='email' name='mailId' placeholder='Email Id' required=\"required\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='tel' name='phoneNumber' placeholder='Mobile number' pattern=\"[0-9]{10}\" required=\"required\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='password' name='password' placeholder='Password' required=\"required\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='password' name='cpassword' placeholder='Confirm Password' required=\"required\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type='submit' value='Sign Up'/><td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            &copy Copyrights 2017 To Ecomerce\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
