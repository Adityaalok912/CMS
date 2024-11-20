
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Item;
import java.sql.*;
/**
 *
 * @author romit
 */
public class ItemDao {
    
    public static ArrayList<Item> getAllSnacks(){
        ArrayList<Item> it=new ArrayList();
        String query="select * from item where category='snacks'";
        
        try{
            ResultSet rs = DbOperations.getData(query);
            while(rs.next()){
                Item item=new Item();
                item.setId(Integer.parseInt(rs.getString("id")));
                item.setCategory(rs.getString("category"));
                item.setPrice(rs.getString("price"));
                item.setName(rs.getString("name"));
                it.add(item);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return it;
    }
    public static ArrayList<Item> getAllDrinks(){
        ArrayList<Item> it=new ArrayList();
        String query="select * from item where category='drinks'";
        
        try{
            ResultSet rs = DbOperations.getData(query);
            while(rs.next()){
                Item item=new Item();
                item.setId(Integer.parseInt(rs.getString("id")));
                item.setCategory(rs.getString("category"));
                item.setPrice(rs.getString("price"));
                item.setName(rs.getString("name"));
                it.add(item);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return it;
    }
    public static ArrayList<Item> getAllCombos(){
        ArrayList<Item> it=new ArrayList();
        String query="select * from item where category='combos'";
        
        try{
            ResultSet rs = DbOperations.getData(query);
            while(rs.next()){
                Item item=new Item();
                item.setId(Integer.parseInt(rs.getString("id")));
                item.setCategory(rs.getString("category"));
                item.setPrice(rs.getString("price"));
                item.setName(rs.getString("name"));
                it.add(item);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return it;
    }
    
}
