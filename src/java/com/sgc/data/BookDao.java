/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.data;

import com.sgc.model.Book;
import com.sgc.model.MainClassifyConstruct;
import com.sgc.model.SubClassModel;
import com.sgc.model.SubClassifyConstruct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gobishanth
 */
public class BookDao {
    public void saveBook(Book book)throws ClassNotFoundException,SQLException
    {
        //Book book=new Book();
        MyDB db=new MyDB();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        stmt.executeUpdate("INSERT INTO bookdetails(bookid,title,author,mainid,subid,yearofpublishing,lastprintedyear,isbnno,noofpages) VALUES ('"+book.getBookid()+"','"+book.getAuthor()+"','"+book.getTitle()+"','"+book.getMainClassification()+"','"+book.getSubClassification()+"','"+book.getYearOfPublishing()+"','"+book.getLastPrintedYear()+"','"+book.getIsbnNo()+"','"+book.getNoOfPages()+"')");
        System.out.print("succesfully insert");
        
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
    public List<MainClassifyConstruct> list() throws SQLException 
    {
        MyDB db=new MyDB();
        Connection con=db.connect();
        List<MainClassifyConstruct> listCategory = new ArrayList<>();
//         
        
        try  {
            String sql = "SELECT * FROM mclasstable";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
             
            while (result.next()) {
                String id = result.getString("mainid");
                String name = result.getString("mainname");
                MainClassifyConstruct category = new MainClassifyConstruct(id, name);
                     
                listCategory.add(category);
            }          
             
        } catch (SQLException ex) {
            throw ex;
        }      
        con.close();
        return listCategory;
    }
    public List<SubClassifyConstruct> popSubClassify(String mc) throws SQLException 
    {
        MyDB db=new MyDB();
        Connection con=db.connect();
        List<SubClassifyConstruct> listCategory = new ArrayList<>();
         
        try  {
            String sql = "SELECT * FROM subclasstable where mainid = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, mc);
            ResultSet result = stmt.executeQuery();
             
            while (result.next()) {
                String id = result.getString("mainid");
                String name = result.getString("subid");
                SubClassifyConstruct category = new SubClassifyConstruct(id, name);                     
                listCategory.add(category);
            }          
             
        } catch (SQLException ex) {
            throw ex;
        }      
        con.close();
        return listCategory;
  
    }
    
    
    public void updateBook(Book book)throws ClassNotFoundException,SQLException
    {
        //Book book=new Book();
      MyDB db=new MyDB();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        String sql="update bookdetails set  title=?,author=?, mainid=?,subid=?,yearofpublishing=?,lastprintedyear=?,isbnno=?,noofpages=? where bookid=?";
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setString(1, book.getTitle());
                    pst.setString(2, book.getAuthor());
                   pst.setString(3, book.getMainClassification());
                    pst.setString(4, book.getSubClassification());
                    pst.setString(5, book.getYearOfPublishing());
                    pst.setString(6, book.getLastPrintedYear());
                    pst.setString(7, book.getIsbnNo());
                    pst.setString(8, book.getNoOfPages());
                    pst.setString(9, book.getBookid());
                    
                    pst.executeUpdate();
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
    public void subUpBook(SubClassModel book)throws ClassNotFoundException,SQLException
    {
        //Book book=new Book();
      MyDB db=new MyDB();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        String sql="update subclasstable set subname=?,mainid=? where subid=?";
                    PreparedStatement pst=con.prepareStatement(sql);
                    
                    pst.setString(1, book.getSubName());
                    pst.setString(2, book.getMainid());
                   
                   pst.setString(3, book.getSubId());
                  pst.executeUpdate();
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
    
}
