/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.controller;

import com.sgc.data.BookDao;
import com.sgc.data.MainDao;
import com.sgc.data.SubDao;
import com.sgc.model.Book;
import com.sgc.model.MainClass;
import com.sgc.model.SubClass;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gobishanth
 */
@WebServlet(name = "BookController", urlPatterns = {"/BookController"})
public class BookController extends HttpServlet {

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
            out.println("<title>Servlet BookController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BookController at " + request.getContextPath() + "</h1>");
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
         Book book=new Book();
          book.setBookid(request.getParameter("bookId"));
          book.setTitle(request.getParameter("title"));
          book.setAuthor(request.getParameter("author"));
          book.setMainClassification(request.getParameter("mainClassification"));
          book.setSubClassification(request.getParameter("subClassification"));
          book.setYearOfPublishing(request.getParameter("yearOfPublishing"));
          book.setLastPrintedYear(request.getParameter("lastPrintedYear"));
          book.setIsbnNo(request.getParameter("isbnNo"));
          book.setNoOfPages(request.getParameter("noOfPages"));
          BookDao bookdao=new BookDao();
        
          MainClass mclass=new MainClass();
          mclass.setMainId(request.getParameter("mainId"));
          mclass.setMainName(request.getParameter("mainName"));
          MainDao maindao=new MainDao();
        
        
        
         SubClass sclass=new SubClass();
          sclass.setSubId(request.getParameter("SubId"));
          sclass.setSubName(request.getParameter("SubName"));
          sclass.setMainName(request.getParameter("MainName"));
          SubDao subdao=new SubDao();
          try{
              maindao.mainClass(mclass);
          }catch (SQLException ex) {
                 Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
             }
            
           
             
             try {
                 
                 
                 bookdao.saveBook(book);
                  RequestDispatcher dispatcher = request.getRequestDispatcher("AddBook.jsp");
                  dispatcher.forward(request, response);
 
                
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
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
