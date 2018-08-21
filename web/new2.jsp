<%@page import="com.sgc.data.MyDB"%>
<%@page import="java.sql.*"%>
<%
     String main=request.getParameter("count"); 
      String buffer="Sub: <select name='sub'><option value='-1'>Select</option>"; 
      try{
                   // MyDB db = new MyDB();
                                       // Connection con = db.connect();
                                        //PreparedStatement pst = null;
                                        //ResultSet rs = null;
                                        //String sql = "select * from sub_classification where mainclassification=?";
                                        // pst = con.prepareStatement(sql);
                                       // pst.setString(1, request.getParameter("main"));

                                        //rs = pst.executeQuery();
                    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
                    String URL = "jdbc:mysql://localhost:3306/gobidoc?useSSL = false";
                    String USER = "root";
                   String PASS = "root";
                   Connection con=null;
                   Class.forName(JDBC_DRIVER);
                   con = DriverManager.getConnection(URL, USER, PASS);
           Statement stmt = con.createStatement(); 
           ResultSet rs = stmt.executeQuery("Select * from sub_classification where mainclassification='"+main+"' "); 
            String sql = "select * from sub_classification where mainclassification=?";

            while(rs.next()){
            buffer=buffer+"<option value='"+rs.getString(2)+"'>"+rs.getString(2)+"</option>"; 
            } 
            buffer=buffer+"</select>"; 
            response.getWriter().println(buffer);
      }
      catch(Exception e){
            System.out.println(e);
      }
%>
