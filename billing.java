
package billing.managementsystem;

import com.itextpdf.text.Paragraph;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.common.ComponentKeyBinding;
 
public class billing extends javax.swing.JFrame {
    loadFile load ;  
    billingData bill;
    newCustomerData customer; 
    sound click;
    soundfile file; 
    PDFAcessFile pdf ; 
    int countitem=0 ; 
    java.sql.Date dat =new java.sql.Date(new Date().getTime());
    
    
    
    
    public billing() {  click= new sound(""); file = new soundfile();
        pdf = new PDFAcessFile();
        bill= new billingData(); load = new loadFile();customer = new newCustomerData();
        initComponents(); find.setVisible(false);payment.setVisible(false);; customername.setVisible(false);
        loadDepart(); errorcontact.setVisible(false);
        this.setCardVesible(false);this.setProductVesible(false);
        contact.setVisible(false); search.setVisible(false);
        method.setVisible(false); customername.setVisible(false);
        viewframe.setVisible(false);
    }

    
   public void loadDepart(){ 
   for(int count =0 ; count<= bill.getDepartment().size()-1 ; count ++)
       selectdepart.addItem(bill.getDepartment().get(count));
   }; 
   
   
   public void loadProduct(int id){
    if(selectproduct.getItemCount()>=1){ selectproduct.removeAllItems(); selectproduct.addItem("Select a product");}
    
       
       ArrayList<String> list= bill.getProduct(id);
       
       if(!list.isEmpty()){ 
     
     countitem = list.size();
     for(int count = 0 ; count<= list.size()-1 ; count ++)
       selectproduct.addItem(list.get(count)); 
   }
   
   };
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewframe = new javax.swing.JInternalFrame();
        save = new javax.swing.JButton();
        view = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        selectdepart = new javax.swing.JComboBox<>();
        selectproduct = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        customername = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        method = new javax.swing.JComboBox<>();
        checkout = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        Proceed = new javax.swing.JButton();
        find = new javax.swing.JLabel();
        errorcontact = new javax.swing.JLabel();
        productname = new javax.swing.JLabel();
        cardnumber = new javax.swing.JLabel();
        experation = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        Cardimage = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        quant = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        selectquantity = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        payment = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 238, 238));
        setBounds(new java.awt.Rectangle(380, 350, 1250, 600));
        setLocation(new java.awt.Point(380, 330));
        setMinimumSize(new java.awt.Dimension(1250, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1250, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewframe.setVisible(true);
        viewframe.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setText("Print and Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        viewframe.getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 110, 40));
        viewframe.getContentPane().add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 640, 420));

        getContentPane().add(viewframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 700, 540));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose Product ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        selectdepart.setMaximumRowCount(1000);
        selectdepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select department" }));
        selectdepart.setToolTipText("");
        selectdepart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectdepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectdepartActionPerformed(evt);
            }
        });
        getContentPane().add(selectdepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 140, 30));

        selectproduct.setMaximumRowCount(1000);
        selectproduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a product" }));
        selectproduct.setName(""); // NOI18N
        selectproduct.setRequestFocusEnabled(false);
        selectproduct.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                selectproductMouseMoved(evt);
            }
        });
        selectproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectproductActionPerformed(evt);
            }
        });
        getContentPane().add(selectproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 130, 30));

        contact.setForeground(new java.awt.Color(204, 204, 204));
        contact.setText("999-999-9999");
        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactFocusLost(evt);
            }
        });
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactKeyPressed(evt);
            }
        });
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, 30));

        customername.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        customername.setForeground(new java.awt.Color(255, 255, 255));
        customername.setText(".");
        getContentPane().add(customername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 270, 30));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 40, -1));

        method.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card" }));
        method.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methodActionPerformed(evt);
            }
        });
        getContentPane().add(method, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 120, 30));

        checkout.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        checkout.setText("Check Out");
        checkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, 110, 40));
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 360, 200));

        Proceed.setText("proceed");
        Proceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });
        getContentPane().add(Proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, -1, 40));

        find.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        find.setForeground(new java.awt.Color(255, 255, 255));
        find.setText("Find a Customer");
        getContentPane().add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        errorcontact.setForeground(new java.awt.Color(255, 51, 51));
        errorcontact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorcontact.setText("Invalid entry");
        getContentPane().add(errorcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 110, 20));

        productname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        productname.setForeground(new java.awt.Color(255, 255, 255));
        productname.setText("Productname");
        productname.setAutoscrolls(true);
        getContentPane().add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 160, 20));

        cardnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cardnumber.setForeground(new java.awt.Color(255, 255, 255));
        cardnumber.setText("Card Number");
        getContentPane().add(cardnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 220, -1));

        experation.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        experation.setForeground(new java.awt.Color(255, 255, 255));
        experation.setText("Experation Date");
        getContentPane().add(experation, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 130, 20));

        type.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setText("Type");
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 210, -1));
        getContentPane().add(Cardimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 300, 140));

        tot.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        tot.setForeground(new java.awt.Color(255, 255, 255));
        tot.setText("Total   =");
        getContentPane().add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 120, 60));

        Total.setBackground(new java.awt.Color(204, 204, 204));
        Total.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Total.setForeground(new java.awt.Color(0, 204, 255));
        Total.setText("0");
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 140, 60));

        quant.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        quant.setText("Quantity");
        getContentPane().add(quant, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 80, 50));

        price.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        price.setText("Price");
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 180, 30));

        selectquantity.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        selectquantity.setMaximumRowCount(1000);
        selectquantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        selectquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectquantityActionPerformed(evt);
            }
        });
        getContentPane().add(selectquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 70, -1));

        cancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, 40));

        payment.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        payment.setForeground(new java.awt.Color(255, 255, 255));
        payment.setText("Payment Method");
        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setText("Shopping Page");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 320, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/product/BEACH4.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -390, 1250, 990));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
        click.playSound(file.clicksound); payment.setVisible(true);; customername.setVisible(true);find.setVisible(true);
        selectdepart.setEnabled(false);selectproduct.setEnabled(false);
      contact.setVisible(true); search.setVisible(true);
    }//GEN-LAST:event_ProceedActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       infos =  customer.getCustomerInfos(contact.getText());
      if(customer.findcustomer){ method.setVisible(true);contact.setEnabled(false); search.setEnabled(false);
      customername.setVisible(true);
      customername.setText(infos[0]);
      }else{JOptionPane.showMessageDialog(null, "customer does't exist");};
    }//GEN-LAST:event_searchActionPerformed

    private void selectquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectquantityActionPerformed
         click.playSound(file.clicksound); int count = Integer.parseInt(selectquantity.getSelectedItem().toString());
       Totalcost = unitprice * count;
       Total.setText(String.valueOf(unitprice * count)+" $");
    }//GEN-LAST:event_selectquantityActionPerformed

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
        if (contact.getText().equals("999-999-9999")){  click.playSound(file.clicksound);
        contact.setText(""); contact.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_contactFocusGained

    private void contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusLost
       if (contact.getText().equals("")){
        contact.setText("999-999-9999"); contact.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_contactFocusLost

    private void contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyPressed
      String s= contact.getText();int i ; 
       
     try{
     
    errorcontact.setVisible(false);
    
    if(s.length() <= 2)b1=true;
     if((s.length() == 3)&& b1) {b1=false;
         i = Integer.parseInt(s);
         contact.setText(s+"-");     
     }
    if((s.length() >= 4)&&(s.length()<=6))b2=true; 
    if((s.length()== 7)&&b2) { i = Integer.parseInt(s.substring(4,6));b2=false;
         contact.setText(s+"-");
         
     }
    
    if(s.length() >= 12) {i = Integer.parseInt(s.substring(8,s.length()));
    
    }
    
    if(s.length() ==12) {
         contact.setText(s.substring(0,s.length()-2));
         }
   
    }
    catch(NumberFormatException e1){
       if (b1) contact.setText(""); 
       if (b2) contact.setText(s.substring(0,s.length()-3));
       if(!b1 && !b2) contact.setText(s.substring(0,s.length()-4)); 
    errorcontact.setVisible(true);
    
    }
    }//GEN-LAST:event_contactKeyPressed

    private void methodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methodActionPerformed
       click.playSound(file.clicksound);
        if(method.getSelectedItem().equals("Card")) {  
       this.setCardVesible(true);
       cardnumber.setText(infos[5]); experation.setText(infos[6]);
       type.setText(infos[8]); 
      load.displaylabelIcon(Cardimage,"/Users/admin/NetBeansProjects/Billing ManagementSystem/src/billing/managementsystem/product/mastercard.png");
       
       }else{
       this.setCardVesible(false);this.checkout.setVisible(true);
       };
        
        
    }//GEN-LAST:event_methodActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
     click.playSound(file.exitsound);this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void selectdepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectdepartActionPerformed
     if(!selectdepart.getSelectedItem().equals("Select department")){
        int id=1;  click.playSound(file.clicksound);
       String s = selectdepart.getSelectedItem().toString(); 
       if(!s.equals("")) {id = Integer.parseInt(s.substring(0,1)); 
       loadProduct(id); 
       }
     };
    }//GEN-LAST:event_selectdepartActionPerformed

    private void selectproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectproductActionPerformed
     if(selectproduct.getItemCount()!=0)
       if(!selectproduct.getSelectedItem().toString().equals("Select a product")){ 
       this.setProductVesible(false); 
       click.playSound(file.selectsound); 
       String[] infos = bill.getProductInfos(selectproduct.getSelectedItem().toString());   
    if(infos!=null){   this.setProductVesible(true); 
     productname.setText(selectproduct.getSelectedItem().toString());
     product_id = infos[0]; unitprice = Double.parseDouble(infos[1]);price.setText(infos[1]+" $ / Unit");load.displaylabelIcon(image,infos[2]);
     Total.setText(infos[1]);
    
    }
       };
       
       
    }//GEN-LAST:event_selectproductActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
    Paragraph p = new Paragraph();// Date dat = new Date();
    String[] info = customer.getCustomerInfos(contact.getText());
    p.add("************************ Customer Receipt *********************************\n"
         +"*                                                                          \n"
         +"*   Product      :  "+productname.getText()+"                              \n "
         +"*   Price / unit :  "+price.getText() +"                                   \n"
         +"*                                    \n"
         +"*   Buyer Name   :  "+customername.getText()+"                             \n"
         +"*   Quantity     :  "+selectquantity.getSelectedItem()+"                                                                  \n"            
         +"*   Email        :  "+info[1] +"                                           \n"       
         +"*   Address      :  "+info[2] +"                                          \n"
         +"*   contact No   :  "+infos[3]+"                                                                 \n"
         +"*                                                                          \n" 
         +"*                  Total Cost  =  "+Total.getText() +"  $                                 \n"  
         +"*                                                                          \n"  
         +"*   Paid in "+method.getSelectedItem()+"                                                                       \n"       
         +"*           "+cardnumber.getText()+"   "+experation.getText()+"                                                                \n"         
         +"*                                                                          \n"        
         +"*                                                                          \n"            
         +"*             Thanks you for your Business                                              \n"               
         +"***************************************************************************");
    
    viewframe.setVisible(true);checkout.setVisible(false);
    String filename = customername.getText()+product_id ; 
    pdf.createNewPDF(p,filename);
    openpdf(filename);
    customer.insertBilling(customer.customerid, product_id,Totalcost,Integer.parseInt(selectquantity.getSelectedItem().toString()), filename,dat,method.getSelectedItem().toString());
    
    }//GEN-LAST:event_checkoutActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_saveActionPerformed

    private void selectproductMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectproductMouseMoved
 
    }//GEN-LAST:event_selectproductMouseMoved

    
    void setProductVesible(boolean visible){
    if(!visible){
     quant.setVisible(false);selectquantity.setVisible(false);price.setVisible(false);
     image.setVisible(false); 
     productname.setVisible(false);Total.setVisible(false);tot.setVisible(false);Proceed.setVisible(false);
    }else{
     quant.setVisible(true);selectquantity.setVisible(true);price.setVisible(true);
     image.setVisible(true);productname.setVisible(true);
     Total.setVisible(true);tot.setVisible(true);Proceed.setVisible(true);
    };
    
    }; 
    
    
   void  setCardVesible(boolean v){
  
     Cardimage.setVisible(v); type.setVisible(v);
     experation.setVisible(v);
     cardnumber.setVisible(v);checkout.setVisible(v);
    
    
    }; 
   
   
   public void openpdf(String filename){
   try{
   SwingController control= new SwingController();
   SwingViewBuilder factory = new SwingViewBuilder(control);
   JPanel pan = factory.buildViewerPanel();
   ComponentKeyBinding.install(control, pan);
   control.getDocumentViewController().setAnnotationCallback(
  new org.icepdf.ri.common.MyAnnotationCallback(
        control.getDocumentViewController()));
   control.openDocument("/Users/admin/NetBeansProjects/Billing ManagementSystem/src/billing/managementsystem/pdffile/"+filename+".pdf");
   view.setViewportView(pan);
  
   }catch(Exception e){
   
   
   };
   
   };
   
   
    String product_id;
    String[] infos;
     boolean b1,b2;
   Double unitprice ; Double Totalcost ;  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cardimage;
    private javax.swing.JButton Proceed;
    private javax.swing.JLabel Total;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel cardnumber;
    private javax.swing.JButton checkout;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel customername;
    private javax.swing.JLabel errorcontact;
    private javax.swing.JLabel experation;
    private javax.swing.JLabel find;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> method;
    private javax.swing.JLabel payment;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productname;
    private javax.swing.JLabel quant;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> selectdepart;
    private javax.swing.JComboBox<String> selectproduct;
    private javax.swing.JComboBox<String> selectquantity;
    private javax.swing.JLabel tot;
    private javax.swing.JLabel type;
    private javax.swing.JScrollPane view;
    private javax.swing.JInternalFrame viewframe;
    // End of variables declaration//GEN-END:variables
}
