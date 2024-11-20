/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.Order;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author romit
 */
public class OrderDao {
    public static String getid(){
        int id=1;
        String idd="";
        try{
            ResultSet rs = DbOperations.getData("select max(id) from orderinfo");
            if(rs.next()){
                id=rs.getInt(1);
                id+=1;
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
        
    }
    public static void saveinfo(Order order){
        String query="insert into orderinfo values('"+order.getOrder_id()+"','"+order.getEmail()+"')";
        DbOperations.setDataOrDelete(query, "");
    }
    public static void savedata(Order order){
        
        String Q1="insert into orderdata values('"+order.getOrder_id()+"','"+order.getItem_name()+"','"+order.getPrice()+"','"+order.getQuantity()+"','"+order.getStatus()+"','"+order.getDate()+"')";
        
        DbOperations.setDataOrDelete(Q1, "");
        
    }
    
    public static ArrayList<Order> getallorder(String email){
        
        ArrayList<Order> ordd=new ArrayList();
        
        try{
            String query="select od.* from orderinfo oi join orderdata od ON oi.id=od.id where oi.email='"+email+"'";
            ResultSet rs = DbOperations.getData(query);
            
            while(rs.next()){
                Order o =new Order();
                o.setOrder_id(rs.getString("id"));
                o.setItem_name(rs.getString("item_name"));
                o.setQuantity(rs.getString("quantity"));
                o.setPrice(rs.getString("price"));
                o.setDate(rs.getString("date"));
                o.setStatus(rs.getString("status"));
                
                ordd.add(o);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return ordd;
        
    }
    
//    public static void main(String[] args){
//        
//        String s=getid();
//        System.out.print(s);
//       
//        
//        
//    }
    
}
