
package billing.managementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class myDBase {
    public Connection conn ; 
    
   public myDBase(){
    try{ 
         conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/billing","root", "Sberber@123");
        
             }catch(Exception e){System.out.print(e);}; 
          
   }; 
    
    
    
}
