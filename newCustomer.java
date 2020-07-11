/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing.managementsystem;

import java.awt.Color;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;


public class newCustomer extends javax.swing.JFrame {

   myDBase db;
   newCustomerData customer ;
   soundfile file ; 
   sound click;
   boolean valid1,valid2,valid3,valid4,valid5,valid6 ;
   public newCustomer() { db = new myDBase(); customer=new newCustomerData();
   file= new soundfile();
   click= new sound("");
   
        initComponents();
        errorcontact.setVisible(false);errornumber.setVisible(false);errorname.setVisible(false);erroremail.setVisible(false);
        erroraddress.setVisible(false);errorcode.setVisible(false);
        valid1 = false; valid2=false; valid3 = false; valid4=false;valid5 = false; valid6=false;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cardnumber = new javax.swing.JTextField();
        year = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        securitycode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cardtype = new javax.swing.JComboBox<>();
        errorcontact = new javax.swing.JLabel();
        errorcard = new javax.swing.JLabel();
        errorsecurity = new javax.swing.JLabel();
        erroraddress = new javax.swing.JLabel();
        erroremail = new javax.swing.JLabel();
        errorname = new javax.swing.JLabel();
        errornumber = new javax.swing.JLabel();
        errorcode = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(480, 380, 1000, 550));
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/New buyer ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 230, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Fullname");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/new buyer.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 110, 90));

        fullname.setForeground(new java.awt.Color(204, 204, 204));
        fullname.setText("fullname");
        fullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fullnameFocusLost(evt);
            }
        });
        getContentPane().add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, 30));

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
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 30));

        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setText("Email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, 30));

        address.setForeground(new java.awt.Color(204, 204, 204));
        address.setText("Address");
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 190, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        gender.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 30));

        submit.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/login.png"))); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 80, 40));

        reset.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/Reset.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 80, 40));

        cancel.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 80, 40));

        jLabel9.setForeground(new java.awt.Color(102, 204, 255));
        jLabel9.setText("Payment information ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 150, 20));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setText("Card Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        month.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 90, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Experation ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, 30));

        cardnumber.setForeground(new java.awt.Color(204, 204, 204));
        cardnumber.setText("xxxx-xxxx-xxxx-xxxx");
        cardnumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardnumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cardnumberFocusLost(evt);
            }
        });
        cardnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cardnumberKeyPressed(evt);
            }
        });
        getContentPane().add(cardnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 170, 30));

        year.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029" }));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 80, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("security code");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, 30));

        securitycode.setForeground(new java.awt.Color(204, 204, 204));
        securitycode.setText("999");
        securitycode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                securitycodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                securitycodeFocusLost(evt);
            }
        });
        securitycode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                securitycodeKeyReleased(evt);
            }
        });
        getContentPane().add(securitycode, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 40, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("card type");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 80, 30));

        cardtype.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cardtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Us Debit ", "Master Card ", "Discovery" }));
        getContentPane().add(cardtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 130, 30));

        errorcontact.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorcontact.setForeground(new java.awt.Color(255, 51, 0));
        errorcontact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorcontact.setText("Invalid entry");
        getContentPane().add(errorcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 130, 30));

        errorcard.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorcard.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 160, 10));

        errorsecurity.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorsecurity.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(errorsecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 100, 10));

        erroraddress.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        erroraddress.setForeground(new java.awt.Color(255, 0, 0));
        erroraddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        erroraddress.setText("Invalid entry");
        getContentPane().add(erroraddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 30));

        erroremail.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        erroremail.setForeground(new java.awt.Color(255, 0, 0));
        erroremail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        erroremail.setText("Invalid entry");
        getContentPane().add(erroremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, 30));

        errorname.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorname.setForeground(new java.awt.Color(255, 0, 0));
        errorname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorname.setText("Invalid entry");
        getContentPane().add(errorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 90, 30));

        errornumber.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errornumber.setForeground(new java.awt.Color(255, 0, 0));
        errornumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errornumber.setText("Invalid Entry");
        getContentPane().add(errornumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 90, 30));

        errorcode.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorcode.setForeground(new java.awt.Color(255, 0, 0));
        errorcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorcode.setText("Invalid entry");
        getContentPane().add(errorcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 226, -1, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/product/BEACH4.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1010, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusGained
     click.playSound(file.clicksound);
        if(fullname.getText().equals("fullname")){
       
      fullname.setText("");
      fullname.setForeground(new Color(0,0,0));
     };
    }//GEN-LAST:event_fullnameFocusGained

    private void fullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusLost
       if(fullname.getText().equals("")){ valid1 = false;
      fullname.setText("fullname");
      fullname.setForeground(new Color(153,153,153));
     };
    }//GEN-LAST:event_fullnameFocusLost

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
        if(contact.getText().equals("999-999-9999")){ click.playSound(file.clicksound);
      contact.setText("");
      contact.setForeground(new Color(0,0,0));
     }; 
    }//GEN-LAST:event_contactFocusGained

    private void contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusLost
       if(contact.getText().equals("")){valid2=false;
      contact.setText("999-999-9999");
      contact.setForeground(new Color(153,153,153));}
    }//GEN-LAST:event_contactFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
      if(email.getText().equals("Email")){click.playSound(file.clicksound);
      email.setText("");
      email.setForeground(new Color(0,0,0));};
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
           if(email.getText().equals("")){
      email.setText("Email"); valid3 = false;
      email.setForeground(new Color(153,153,153));};
    }//GEN-LAST:event_emailFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
   if(address.getText().equals("Address")){click.playSound(file.clicksound);
      address.setText("");
      address.setForeground(new Color(0,0,0));};
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
       if(address.getText().equals("")){
      address.setText("Address"); valid4=false;
      address.setForeground(new Color(153,153,153));};
    }//GEN-LAST:event_addressFocusLost

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
 click.playSound(file.resetsound);this.setVisible(false);new newCustomer().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
  if (this.checkEntry()){click.playSound(file.validsound); customer.insertCustomer(fullname.getText(), email.getText(), address.getText(),contact.getText(), gender.getSelectedItem().toString());
     customer.insertCustomerPaymentInfos(cardnumber.getText(),month.getSelectedItem().toString()+"/"+year.getSelectedItem().toString(), securitycode.getText(),cardtype.getSelectedItem().toString());
  JOptionPane.showMessageDialog(null,"Upload sucessful");this.setVisible(false);}
          else {click.playSound(file.validsound);JOptionPane.showMessageDialog(null,"must fill up all fields");};
    
    }//GEN-LAST:event_submitActionPerformed

    
    
    
    
    private void cardnumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardnumberFocusGained
  if(cardnumber.getText().equals("xxxx-xxxx-xxxx-xxxx")){click.playSound(file.clicksound);
      cardnumber.setText("");
      cardnumber.setForeground(new Color(0,0,0));}
    }//GEN-LAST:event_cardnumberFocusGained

    private void cardnumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardnumberFocusLost
    if(cardnumber.getText().equals("")){ valid5 =false;
      cardnumber.setText("xxxx-xxxx-xxxx-xxxx");
      cardnumber.setForeground(new Color(153,153,153));}
    }//GEN-LAST:event_cardnumberFocusLost

    private void securitycodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securitycodeFocusGained
  if(securitycode.getText().equals("999")){click.playSound(file.clicksound);
     securitycode.setText("");
      securitycode.setForeground(new Color(0,0,0));}
    }//GEN-LAST:event_securitycodeFocusGained

    private void securitycodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securitycodeFocusLost
       if(securitycode.getText().equals("")){
     securitycode.setText("999");  
     valid6 = false;
      securitycode.setForeground(new Color(153,153,153));}
    }//GEN-LAST:event_securitycodeFocusLost

    private void contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyPressed
     String s= contact.getText();int i ; 
       
     try{
     valid2 = true;
    errorcontact.setVisible(false);
    
    if(s.length() <= 2)b1=true;
     if((s.length() == 3)&& b1) {b1=false;
         i = Integer.parseInt(s);
         contact.setText(s+"-");     
     }
    if((s.length() >= 4)&&(s.length() <= 6))b2=true; 
    if((s.length()== 7)&&b2) {b2=false;i = Integer.parseInt(s.substring(4,6));
         contact.setText(s+"-");
         
     }
    
    if(s.length() >= 9) {i = Integer.parseInt(s.substring(8,s.length()));
    
    }
    
    if(s.length() ==12) {
         contact.setText(s.substring(0,s.length()-1));
         }
   
    }
    catch(NumberFormatException e1){valid2 = false;
        contact.setText(s.substring(0,s.length()-1));
    errorcontact.setVisible(true);
    
    }
    
    }//GEN-LAST:event_contactKeyPressed

    private void cardnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardnumberKeyPressed
   try{int i; errornumber.setVisible(false);
    
        valid5 =true;
        if(cardnumber.getText().length()==3) bnum1 =true;
      if ((cardnumber.getText().length()==4)&&bnum1){
      i = Integer.parseInt(cardnumber.getText().substring(0,3));  
      errorcard.setText("");
      cardnumber.setText(cardnumber.getText()+"-");bnum1=false;
    };
    if(cardnumber.getText().length()==8) bnum2 =true;
     if ((cardnumber.getText().length()==9)&&bnum2){
      i = Integer.parseInt(cardnumber.getText().substring(5,8));  
      errorcard.setText("");
      cardnumber.setText(cardnumber.getText()+"-");bnum2=false;
    };
    if(cardnumber.getText().length()==13) bnum3 =true;
     if ((cardnumber.getText().length()==14)&&bnum3){
          i = Integer.parseInt(cardnumber.getText().substring(10,13));  
      errorcard.setText("");
      cardnumber.setText(cardnumber.getText()+"-");bnum3=false;
    };
    if(cardnumber.getText().length() >= 16) 
    { i = Integer.parseInt(cardnumber.getText().substring(15,cardnumber.getText().length()));  
      errorcard.setText("");
    
        };
        
     if(cardnumber.getText().length() == 19)  cardnumber.setText(cardnumber.getText().substring(0, 18));
   }
  
   catch(NumberFormatException e1){  valid5=false;  
   errornumber.setVisible(true);cardnumber.setText(cardnumber.getText().substring(0,cardnumber.getText().length()-1));
   }
    }//GEN-LAST:event_cardnumberKeyPressed

    private void securitycodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_securitycodeKeyReleased
     errorcode.setVisible(false); valid6 = true; 
        String s= securitycode.getText();
        if (s.length()==4){
      securitycode.setText(s.substring(0,s.length()-1));
     };
    try{
    int i = Integer.parseInt(s);   
    errorsecurity.setText("");
   
    }
    catch(NumberFormatException e1){
    errorcode.setVisible(true); valid6 = false;
    securitycode.setText(s.substring(0,s.length()-1));
    }
     
     
     
    }//GEN-LAST:event_securitycodeKeyReleased

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
      click.playSound(file.exitsound); this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    
   public boolean allFieldFilled(){
     boolean filled = false;
    if( !securitycode.getText().equals("999")&&!cardnumber.getText().equals("xxxx-xxxx-xxxx-xxxx")&& !address.getText().equals("Address")&&
         !email.getText().equals("Email")&& !contact.getText().equals("999-999-9999") && !fullname.getText().equals("fullname") ){
      filled=true;
    }else{
    if(securitycode.getText().equals("999")) emptysecurity = false; 
     if(cardnumber.getText().equals("xxxx-xxxx-xxxx-xxxx")) emptycard = false; 
     if(address.getText().equals("Address")) emptyaddress = false; 
     if(email.getText().equals("Email")) emptyemail = false; 
     if(contact.getText().equals("999-999-9999")) emptycontact = false; 
     if(fullname.getText().equals("fullname")) emptyname = false;  
    };
       
   return filled;
   }; 
    
   public boolean checkEntry(){
     if(!address.getText().equals("Address")) {valid4 = true; erroraddress.setVisible(false); }
     if(!email.getText().equals("Email")) {valid3 = true;  erroremail.setVisible(false);}
     if(!contact.getText().equals("999-999-9999")) {valid2 = true;  errorcontact.setVisible(false); }
     if(!fullname.getText().equals("fullname")) {valid1= true;  errorname.setVisible(false); } 
   
   boolean check =  valid1 &&valid2&&valid3&&valid4&&valid5&&valid6;
   
   
      if (!valid1) errorname.setVisible(true);
     if(!valid2)  errorcontact.setVisible(true);
     if(!valid3)   erroremail.setVisible(true); 
      if(!valid4)  erroraddress.setVisible(true);
      if(!valid5)  errornumber.setVisible(true);
        if(!valid6)  errorcode.setVisible(true);
   
   return check;
   };
   
   
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newCustomer().setVisible(true);
            }
        });
    }
      boolean b1,b2,b3 ; 
    boolean bnum1 ;boolean bnum2;boolean bnum3;
   int num1;int num2;int num3; int num4; 
   boolean emptysecurity= true; 
   boolean emptyname = true; 
   boolean emptyemail =true;
   boolean emptyaddress = true;
   boolean emptycard = true; 
   boolean emptycontact =true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cardnumber;
    private javax.swing.JComboBox<String> cardtype;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JLabel erroraddress;
    private javax.swing.JLabel errorcard;
    private javax.swing.JLabel errorcode;
    private javax.swing.JLabel errorcontact;
    private javax.swing.JLabel erroremail;
    private javax.swing.JLabel errorname;
    private javax.swing.JLabel errornumber;
    private javax.swing.JLabel errorsecurity;
    private javax.swing.JTextField fullname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JButton reset;
    private javax.swing.JTextField securitycode;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
