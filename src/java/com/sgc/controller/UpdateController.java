/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.controller;

import com.sgc.data.BookDao;
import com.sgc.model.MainClassifyConstruct;
import com.sgc.model.SubClassifyConstruct;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
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
@WebServlet(name = "UpdateController", urlPatterns = {"/UpdateController"})
public class UpdateController extends HttpServlet {

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
            out.println("<title>Servlet UpdateController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateController at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
         listCategory(request, response);
    }
     private void listCategory(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // BookModel book=new BookModel();
          
          
         BookDao dao = new BookDao();
         
         if (request.getAttribute("author")!= null){
             String Author = (String)request.getAttribute("author");
             request.setAttribute("author", Author);
         }
           
         if (request.getAttribute("title")!= null){
             String title = (String)request.getAttribute("title");
             request.setAttribute("title", title);
         }
         if (request.getAttribute("bookId")!= null){
             String bookId = (String)request.getAttribute("bookId");
             request.setAttribute("bookId", bookId);
         }
         if (request.getAttribute("yearOfPublishing")!= null){
             String yearOfPublishing = (String)request.getAttribute("yearOfPublishing");
             request.setAttribute("yearOfPublishing", yearOfPublishing);
         }
         if (request.getAttribute("lastPrintedYear")!= null){
             String lastPrintedYear = (String)request.getAttribute("lastPrintedYear");
             request.setAttribute("lastPrintedYear", lastPrintedYear);
         }
          if (request.getAttribute("isbnNo")!= null){
             String isbnNo = (String)request.getAttribute("isbnNo");
             request.setAttribute("isbnNo", isbnNo);
         }
          if (request.getAttribute("noOfPages")!= null){
             String noOfPages = (String)request.getAttribute("noOfPages");
             request.setAttribute("noOfPages", noOfPages);
         }
         if (request.getAttribute("listSubCategory")!= null){
             List <SubClassifyConstruct> listSub = (List)request.getAttribute("listSubCategory");
             request.setAttribute("listSubCategory", listSub);
         }
         if (request.getAttribute("mainId")!= null){
             String mainId = (String)request.getAttribute("mainId");
             request.setAttribute("mainId", mainId);
         }
        try {
            
            List<MainClassifyConstruct> listCatagory = dao.list();
            request.setAttribute("listCategory", listCatagory);
            
            
                
            RequestDispatcher dispatcher = request.getRequestDispatcher("Update.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            throw new ServletException(e);
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
        //processRequest(request, response);
        String categoryId = request.getParameter("category");
 
        request.setAttribute("selectedCatId", categoryId);
 
        listCategory(request, response);
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
