/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gobishanth
 */
public class MyDB {
     // JDBC Driver Name
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    // Database URL
    static final String URL = "jdbc:mysql://localhost:3306/gobidoc?useSSL = false";
    
    // Database Credentials
    static final String USER = "root";
    static final String PASS = "root";
    
    // Connection variable
    static Connection con=null;
    
    // Create method for the connection
    public static Connection connect(){
        try{
            // Registering JDBC Driver
            Class.forName(JDBC_DRIVER);
            System.out.println("JDBC Registering success");
            // Open a connection
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Opening connection success");
            
           //System.out.println("Database Connection Successful");
        }
        catch(ClassNotFoundException ec){
            // Exception occured for the Class.forName error
            System.out.println("Class Not Found : " + ec);
        }
        catch(SQLException es){
            // Exceptin occured for the con DriverManager.getConnection
            System.out.println("SQL Exception : " + es);
        }
       
        return con;
    }
    
}
