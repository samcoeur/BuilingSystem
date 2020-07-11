/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing.managementsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class billingData extends myDBase {
   PreparedStatement pstm; 
   // Statement stm ;  
    
  billingData(){super();
  // stm=conn.createStatement();
  };  
    
  public ArrayList<String> getDepartment(){
   ArrayList<String> array= new ArrayList<String>();
      try{
   Statement stm=conn.createStatement();
    ResultSet rs =stm.executeQuery("select id , category_name from Department ");
    while(rs.next()) array.add(String.valueOf(rs.getInt("id"))+" "+rs.getString("category_name"));
    }catch(Exception e){System.out.print(e);};
  return array;
  };
  
 public ArrayList<String> getProduct(int id ){
   ArrayList<String> array= new ArrayList<String>();
      try{
   Statement stm=conn.createStatement();
    ResultSet rs =stm.executeQuery("select * from product where depart_id ="+ id);
    while(rs.next()) {array.add(rs.getString("product_name")); System.out.print(rs.getString("product_name"));};
    }catch(Exception e){System.out.print(e);};
  return array;
  };
 
 public String[] getProductInfos(String name){
 String[] list = new String[3] ; 
    try{
    Statement stm=conn.createStatement();    
    stm=conn.createStatement();
    ResultSet rs =stm.executeQuery("select * from product where product_name = '"+ name+"'");
   rs.last(); list[0] = rs.getString("product_id");list[1] =String.valueOf( rs.getDouble("selling_price"));list[2]=rs.getString("link");
    }catch(Exception e){System.out.print(e);};
 
 return list ; 
 }
  
 
 
 public ArrayList<String[]> getBillingInfos(String product_id){
    ArrayList<String[]> list = new ArrayList<String[]>() ; String[] s;
     try{  
    Statement stm=conn.createStatement();         
    stm=conn.createStatement();int customer_id ; 
    ResultSet rs= stm.executeQuery("select customer.fullname,billing.payment_method, billing.total_cost , billing.unit_count,billing.date ,billing.receipt_file  \n" +
"from billing , customer\n" +
"where product_id ="+product_id+ " and customer.customer_id = billing.customer_id; ");
  
    while(rs.next()) {
      s = new String[7];
     s[0]=rs.getString("fullname");
     s[1] =rs.getString("payment_method"); 
     s[2]=  String.valueOf(rs.getInt("unit_count"));
     s[3]=  String.valueOf(rs.getDouble("total_cost"));
     s[4] = rs.getDate("date").toString();
     s[5] = rs.getString("receipt_file");
     list.add(s);
       
   }
    
    
     }catch(Exception e){System.out.print(e);};
   
     
     return list;
   }; 
 
 
}
