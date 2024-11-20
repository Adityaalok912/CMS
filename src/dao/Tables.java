/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author romit
 */
public class Tables {
    public static void main(String[] args){
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),phoneNumber varchar(10),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(100),UNIQUE (email))";
            String adminTable="create table admin(id varchar(20) primary key ,password varchar(200) not null)";
            String itemTable="create table item(id int AUTO_INCREMENT primary key ,name varchar(200) not null, price varchar(20) not null,category varchar(200) not null)";
            String orderinfo="create table orderinfo(id varchar(10) primary key,email varchar(200),FOREIGN KEY(email) REFERENCES user(email))";
            String orderdata="create table orderdata(id varchar(10),item_id varchar(10),price varchar(10),quantity varchar(10),status varchar(20))";
            
            
            
//            DbOperations.setDataorDelete(userTable, "user Table created");
//            DbOperations.setDataorDelete(adminTable, "admin Table created");
//             DbOperations.setDataorDelete(itemTable, "item Table created");
//               DbOperations.setDataOrDelete(orderinfo, "order Table 1 created");
               DbOperations.setDataOrDelete(orderdata, "order Table 2 created");

               
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
