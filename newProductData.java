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


public class newProductData extends myDBase {
    Statement stm ; 
    PreparedStatement pstm ; 
    public newProductData(){
    super();
    
    };
    
    public void insertProduct(String id, String name ,int quantity, int depart_id, String link ,double unit_price,double selling_price ){
      try{
    pstm=conn.prepareStatement("insert into product values(?,?,?,?,?,?,?) ");
    pstm.setString(1,id);
    pstm.setString(2, name);
    pstm.setInt(3,quantity);   
    pstm.setInt(4,depart_id);   
    pstm.setString(5,link);
    pstm.setDouble(6, unit_price);
    pstm.setDouble(7, selling_price);
    pstm.executeUpdate();
    }catch(Exception e){System.out.print(e);};
    };
    
    
    
   
   
}
