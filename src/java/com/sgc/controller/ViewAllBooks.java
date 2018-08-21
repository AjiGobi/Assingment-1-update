/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.controller;

import com.sgc.data.MyDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gobishanth
 */
@WebServlet(name = "ViewAllBooks", urlPatterns = {"/ViewAllBooks"})
public class ViewAllBooks extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewAllBooks</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ViewAllBooks at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        MyDB db=new MyDB();
         Connection con=db.connect();
         PreparedStatement pst = null;
         ResultSet rs = null;
         
         response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         
         String sql1="select *  from bookdetails";
       
         try{
            
             pst = con.prepareStatement(sql1);
             
           
             rs = pst.executeQuery();
            
             
             String str="<table border=0.8 align=center style='border: 6px solid black;width:500px;'><tr><th style='padding:30px; background-color:#f2f2f2;'>bookid</th><th style='padding:30px; background-color:#f2f2f2;'>title</th><th style='padding:30px; background-color:#f2f2f2;'>author</th><th style='padding:30px; background-color:#f2f2f2;'>mainid</th><th style='padding:30px; background-color:#f2f2f2;'>subid</th><th style='padding:30px; background-color:#f2f2f2;'>yearofpublishing</th><th style='padding:30px; background-color:#f2f2f2;'>lastprintedyear</th><th style='padding:30px; background-color:#f2f2f2;'>isbnno</th><th style='padding:30px; background-color:#f2f2f2;'>noofpages</th></tr>";
              while(rs.next()){
                 str+="<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td></tr>";
             }
              str+="</table>";
             out.println(str);
             
             
         }catch(SQLException e){
             System.err.println(e);
         }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
