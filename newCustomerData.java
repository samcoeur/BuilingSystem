/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing.managementsystem;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class newCustomerData extends myDBase{
    PreparedStatement pstm; 
    Statement stm ; 
    static  int customer_id=100000;
    int customerid;
    boolean findcustomer;
    
    
    public newCustomerData(){
    super();
    try{ stm= conn.createStatement();findcustomer=false;
    }catch(Exception e){ System.out.print(e);};
    };
    
    public void insertCustomer(String fullname ,String email , String address , String contact , String gender ){
    try{
    pstm=conn.prepareStatement("insert into customer values(?,?,?,?,?,?) ");
    pstm.setInt(1, this.getNextCustomer_id());
    pstm.setString(2, fullname);
    pstm.setString(3, email);   
    pstm.setString(4, address);   
    pstm.setString(5, contact);
    pstm.setString(6, gender);
    pstm.executeUpdate();
    }catch(Exception e){System.out.print(e);};
    };
    
    public void insertCustomerPaymentInfos(String cardnumber ,String experation , String security, String type ){
    try{
    pstm=conn.prepareStatement("insert into payment_info values(?,?,?,?,?) ");
    pstm.setInt(2, this.getNextCustomer_id()-1);
    pstm.setString(1, cardnumber);
    pstm.setString(3, experation);   
    pstm.setString(4, security);   
    pstm.setString(5, type);
   // pstm.setString(6, gender);
    pstm.executeUpdate();
    }catch(Exception e){System.out.print(e);};
    };
   
    public int getNextCustomer_id (){int id =customer_id;
     try{stm=conn.createStatement();
     ResultSet rs= stm.executeQuery("select customer_id from customer");
     rs.last(); id = rs.getInt("customer_id")+1;
    
    }catch(Exception e){System.out.print(e);};
    return id ; 
    };
    
    public String getCustomerNameForId(int customer_id){String name="";
    try{stm=conn.createStatement();
    ResultSet rs= stm.executeQuery("select fullname from customer where customer_id ='" + customer_id+"'");
    rs.last(); name= rs.getString("fullname");
    System.out.print(name);
    }catch(Exception e){System.out.print(e);};
    return name; 
    };
    
    public String[] getCustomerInfos(String contact){
    String[] infos = new String[10]; 
     try{stm=conn.createStatement();int customer_id ; 
    ResultSet rs= stm.executeQuery("select * from customer where contact ='" + contact+"'");
    rs.last(); customer_id = rs.getInt("customer_id");customerid = rs.getInt("customer_id"); infos[0]= rs.getString("fullname");
    infos[1]= rs.getString("email"); infos[2]= rs.getString("address"); infos[3]= rs.getString("contact");
    infos[4]= rs.getString("gender");
    
    ResultSet rs1= stm.executeQuery("select * from payment_info where customer_id ='" +customer_id+"'");
    rs1.last(); infos[5] = rs1.getString("card_number"); infos[6] = rs1.getString("experation_date");
    infos[7] = rs1.getString("security_code");infos[8] = rs1.getString("card_type");
    findcustomer=true;
     }catch(Exception e){System.out.print(e);};
    
    return infos;
    };
    
     
    public void UpdateCustomerInfos(String fullname,String contact,String email,String address ,String gender, String cardnumber,String experation,String security, String type){
    try{pstm = conn.prepareStatement("update customer "
            + "set fullname ='"+fullname+ "',email = '"+email+"' ,address ='"+address+"' , contact='"+contact+"' , gender ='"+gender+"' where customer_id ="+customerid);
    pstm.executeUpdate();
     
     pstm = conn.prepareStatement("update payment_info "
            + "set card_number='"+cardnumber+ "',experation_date = '"+experation+"' ,security_code ='"+security+"' , card_type='"+type+"' where customer_id ="+customerid);
    pstm.executeUpdate();
    
    }catch(Exception e){System.out.print(e);}; 
    };
    
    
public void insertBilling(int customer_id , String product_id , double total_cost ,int unit_sold , String receipt_name, Date dat , String payment_method){
      try{
    pstm=conn.prepareStatement("insert into billing values(?,?,?,?,?,?,?) ");
    pstm.setInt(1,customer_id);
    pstm.setString(2, product_id);
    pstm.setDouble(3,total_cost);   
    pstm.setInt(4,unit_sold);   
    pstm.setString(5,receipt_name);
    pstm.setDate(6,dat);
    pstm.setString(7,payment_method);
    
    pstm.executeUpdate();
    }catch(Exception e){System.out.print(e);};
   
   }; 
    

}
