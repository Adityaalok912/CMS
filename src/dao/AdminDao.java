/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Admin;
/**
 *
 * @author romit
 */
public class AdminDao {
    public static void addAdmin(Admin admin){
        String query="insert into admin(id,password) values('"+admin.getId()+"','"+admin.getPassword()+"')";
        DbOperations.setDataOrDelete(query, "New admin added");
    }
    public static Admin login(String id,String password){
        Admin admin=null;
        try{
            ResultSet rs = DbOperations.getData("select * from admin where id='"+id+"' and password='"+password+"'");
            while(rs.next()){
                admin =new Admin();
                
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return admin;
    }
    public static void add(String id,String password){
        
    }
}
