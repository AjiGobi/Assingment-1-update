package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sgc.data.MyDB;
import java.sql.*;

public final class new2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

      String main=request.getParameter("count"); 
      String buffer="Sub: <select name='sub'><option value='-1'>Select</option>"; 
      try{
                    MyDB db = new MyDB();
                                        Connection con = db.connect();
                                        PreparedStatement pst = null;
                                        ResultSet rs = null;
                                        String sql = "select * from sub_classification where mainclassification=?";
                                         pst = con.prepareStatement(sql);
                                        pst.setString(1, request.getParameter("main"));

                                        rs = pst.executeQuery();
                    //String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
                   // String URL = "jdbc:mysql://localhost:3306/gobidoc?useSSL = false";
                   // String USER = "root";
                   // String PASS = "root";
                   // Connection con=null;
                   // Class.forName(JDBC_DRIVER);
                    //con = DriverManager.getConnection(URL, USER, PASS);
           // Statement stmt = con.createStatement(); 
           // ResultSet rs = stmt.executeQuery("Select * from sub_classification where mainclassification='"+main+"' "); 
            // String sql = "select * from sub_classification where mainclassification=?";

            while(rs.next()){
            buffer=buffer+"<option value='"+rs.getString(2)+"'>"+rs.getString(2)+"</option>"; 
            } 
            buffer=buffer+"</select>"; 
            response.getWriter().println(buffer);
      }
      catch(Exception e){
            System.out.println(e);
      }

      out.write('\n');
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
