<%-- 
    Document   : test2
    Created on : Aug 6, 2018, 9:56:47 AM
    Author     : fasla faseel
--%>
<%@page import="java.sql.*"%> 
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.sgc.data.MyDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <script type="text/javascript"> 
             var xmlHttp;
            //var xmlHttp;
            function showSub(str){
                  if (typeof XMLHttpRequest != "undefined"){
                  xmlHttp= newXMLHttpRequest();
            }
            else if(window.ActiveXObject){
                     xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
            }
            if (xmlHttp==null){
                  alert("Browser does not support XMLHTTP Request")
                  return;
            }
            var url="new2.jsp";
            url +="?count=" +str;
             xmlHttp.onreadystatechange = stateChange;
             xmlHttp.open("GET", url, true);
             xmlHttp.send(null);
            }
     
            functionsubChange(){  
                  if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete") {  
                  document.getElementById("sub").innerHTML=xmlHttp.responseText   
                  }  
                }
           
             
           </script>    
        
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            .dropdown-submenu {
                position:relative;
            }
            .dropdown-submenu>.dropdown-menu {
                top:0;
                left:100%;
                margin-top:-6px;
                margin-left:-1px;
                -webkit-border-radius:0 6px 6px 6px;
                -moz-border-radius:0 6px 6px 6px;
                border-radius:0 6px 6px 6px;
            }
            .dropdown-submenu:hover>.dropdown-menu {
                display:block;
            }
            .dropdown-submenu>a:after {
                display:block;
                content:" ";
                float:right;
                width:0;
                height:0;
                border-color:transparent;
                border-style:solid;
                border-width:5px 0 5px 5px;
                border-left-color:#cccccc;
                margin-top:5px;
                margin-right:-10px;
            }
            .dropdown-submenu:hover>a:after {
                border-left-color:red;
            }
            .dropdown-submenu.pull-left {
                float:none;
            }
            .dropdown-submenu.pull-left>.dropdown-menu {
                left:-100%;
                margin-left:10px;
                -webkit-border-radius:6px 0 6px 6px;
                -moz-border-radius:6px 0 6px 6px;
                border-radius:6px 0 6px 6px;
            }

            input[type=text], input[type=password] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

            #welcomeHeading{
                font: bold italic 2em Georgia , Times, "Times New Roman", serif;
                color:#87CEEB;
                /* border-bottom: 2px dashed #008B8B;
                 border-top: 10px solid #008B8B;*/
                margin: 0;
                padding: 0.5em 0 0.5em 0;
                font-size: 1.5em;
            }
            .footer {
                position: fixed;
                left: 0;
                bottom: 0;
                width: 100%;
                height:4px;
                background-color: black;
                color: white;
                text-align: center;
            }
        </style>
    </head>
    <body>

         <div class="navbar navbar-inverse"  width="100%">
    
        
        
            <ul class="nav navbar-nav"    bg-light>
                <li class="disable">
                                    <a class="navbar-brand" href="Home.jsp">
                                    <img src="log1.jpg"  class="img-circle" alt="" style="width:30px;">
                                    </a>
  
                </li>
                <li class="menu-item dropdown" >
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">BOOK<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li >
                            <a href="AddBookControl" class="dropdown-toggle" > ADD BOOKS</a>
                            
                        </li>
                        <li >
                            <a href="UpdateController" class="dropdown-toggle" >UPDATE BOOKS</a>
                            
                        </li>
                        <li >
                            <a href="Delete.jsp" class="dropdown-toggle">DELETE BOOKS</a>
                            
                        </li>
                        <li >
                            <a href="Search.jsp" class="dropdown-toggle" >FIND BOOKS</a>
                            
                        </li>
                        <li>
                                <a href="ViewAllBooks" class="dropdown-toggle" >VIEW BOOKS</a>
                        </li>
                    </ul>
                </li>
                <li class="menu-item dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">CLASSIFICATION<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li class="menu-item dropdown dropdown-submenu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">MAIN CLASSIFICATION</a>
                            <ul class="dropdown-menu">
                                <li class="menu-item ">
                                    <a href="MainClassification.jsp">Add Main Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="UpdateMain.jsp"> Update Main Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="MainDel.jsp"> Delete Main Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="MainSch.jsp">Search Main Classification</a>
                                </li>
                                 <li >
                                 <a href="ViewMcBooks" class="dropdown-toggle" >View Main Classifications</a>
                                </li>
                            </ul>
                        </li>
                        <li class="menu-item dropdown dropdown-submenu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">SUB CLASSIFICATION</a>
                            <ul class="dropdown-menu">
                                <li class="menu-item ">
                                    <a href="SubAdding">Add Sub Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="SubUp">Update Sub Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="SubDel.jsp">Delete Sub Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="SubSch.jsp">Search Sub Classification</a>
                                </li>
                                <li >
                                <a href="ViewBook" class="dropdown-toggle" >View Sub Classifications</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        
    </div>
        <div>
            <center><h1 id ="welcomeHeading">ADD BOOK DETAILS</h1></center>
        </div>

        <div class="container" >
            <form action="">
                <label for="Book Id"><b>Book Id</b></label>
                <input type="text" placeholder="Enter Username" name="bookid" required>

                <label for="Title"><b>Title</b></label>
                <input type="text" placeholder="Enter Password" name="title" required>

                <label for="Author"><b>Author</b></label>
                <input type="text" placeholder="Enter Username" name="author" required>

                 Main Classification: <select name='main'onchange="showSub(this.value);"> 
             <option value="none">Select Country</option> 
            <%
                  String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
                    String URL = "jdbc:mysql://localhost:3306/gobidoc?useSSL = false";
                     String USER = "root";
                     String PASS = "root";
                     Connection con=null;
                     Class.forName(JDBC_DRIVER);
                     con = DriverManager.getConnection(URL, USER, PASS);
                  Statement stmt = con.createStatement(); 
                  ResultSet rs = stmt.executeQuery("select * from main_classification");
                  while(rs.next()){
            %>
                  <option value="<%=rs.getString(2)%>"><%=rs.getString(2)%></option> 
            <%
                  }
            %>
      </select> 
      <br> 
      <div id='sub'> 
            State :  <select name='sub' > 
                  <option value='-1'>Select State</option> 
            </select> 
      </div> 


                
                <br>
                <label for="Year of publishing"><b>Year of publishing</b></label>
                <input type="text" placeholder="Enter Username" name="yearOfPublishing" required>

                <label for="Last printed year"><b>Last printed year</b></label>
                <input type="text" placeholder="Enter Username" name="lastPrintedYear" required>

                <label for="ISBN no"><b>ISBN no</b></label>
                <input type="text" placeholder="Enter Username" name="isbnNo" required>

                <label for="No of pages"><b>No of pages</b></label>
                <input type="text" placeholder="Enter Username" name="noOfPages" required>
                <button class="btn btn-primary" type="submit">Submit form</button>
            </form>


        </div>

        <footer class="footer">
            <p>Copyright &copy; SGC.com 2018 </p>  
        </footer> 
    </body>
</html>