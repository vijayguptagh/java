/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

/**
 *
 * @author Ajay
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;


public class DBConnection {
    
    public static Connection ConnecrDb(){
        try{
            String UserId="vg9833219881";
            String Password="vg9833219881";
            String SQLconn="jdbc:mysql://localhost:3306/LibraryManagementSystem";
            Class.forName("com.mysql.cj.jdbc.Drive");
            Connection conn=DriverManager.getConnection(SQLconn,UserId,Password);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }return null;
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"connection established");
    }
}
    

