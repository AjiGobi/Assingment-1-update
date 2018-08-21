/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.data;

import com.sgc.model.SubClass;
import com.sgc.model.SubClassModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gobishanth
 */
public class SubDao {
    public void subClass(SubClassModel sclass) throws SQLException{
        
         MyDB db=new MyDB();
           Connection con=db.connect();
            Statement stmt=con.createStatement();
            
                   try{
        stmt.executeUpdate("INSERT INTO subclasstable(subid,subname,mainid) VALUES ('"+sclass.getSubId()+"','"+sclass.getSubName()+"','"+sclass.getMainid()+"')");
        System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
        
    }
    
}
