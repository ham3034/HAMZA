/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encoreimpex;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class DBConnect{
    
    public static Connection connect(){
       Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:8889/encoreImpexDB","root","root");
              
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
}
    