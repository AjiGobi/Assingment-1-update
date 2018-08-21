/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.data;

import com.sgc.model.MainClass;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gobishanth
 */
public class MainDao {
     public void mainClass(MainClass mclass) throws SQLException{
           MyDB db=new MyDB();
           Connection con=db.connect();
            Statement stmt=con.createStatement();
             try{
        stmt.executeUpdate("INSERT INTO mclasstable(mainid,mainname) VALUES ('"+mclass.getMainId()+"','"+mclass.getMainName()+"')");
        System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
     }
}
