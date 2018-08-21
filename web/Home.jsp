<%-- 
    Document   : test2
    Created on : Aug 6, 2018, 9:56:47 AM
    Author     : fasla faseel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
  <style>+
      .dropdown-submenu {
    position:relative;
}
body, html {
    height: 100%;
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
.center {
    margin: auto;
    width: 50%;
/*    border: 3px solid green;*/
    padding: 200px;
/*    background-image: url('./homeTag.PNG');*/
    background-size: cover;
}
.imgcontainer {
/*    vertical-align: middle;*/
    
    height: 100%; 

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    
}
#welcomeHeading{
    font: bold italic 2em Georgia , Times, "Times New Roman", serif;
    
   
   color:black;
    text-shadow: 3px 2px red;
    text-transform: uppercase;
/* border-bottom: 2px dashed #008B8B;
 border-top: 10px solid #008B8B;*/
 margin: 0;
 padding: 0.5em 0 0.5em 0;
 font-size:50px
}
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
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
            <center><h1 id ="welcomeHeading">Library Management System</h1></center>
        </div>
            
    <div  >
        
            
        
        <div class="imgcontainer">
            
            <img src="lin.jpg" alt=""   >
        </div>
     </div>
            
   <div class="footer">
 <p>Copyright &copy; SGITC.com 2018 </p>  
</div>

    </body>
</html>
