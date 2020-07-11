
package billing.managementsystem;

import java.awt.Color;
import javax.swing.JOptionPane;


public class updateCustomer extends javax.swing.JFrame {

    newCustomerData customer; 
    sound click ; soundfile file ; 
    public updateCustomer() { 
        customer = new newCustomerData();click = new sound(""); file = new soundfile(); 
        initComponents();
        infopanel.setVisible(false); cardpanel.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        personalinfo = new javax.swing.JLabel();
        infopanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        errorcontact = new javax.swing.JLabel();
        cardpanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cardnumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        securitycode = new javax.swing.JTextField();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        errorcard = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchfield = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        paymentinfo = new javax.swing.JLabel();
        errorsearch = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(480, 350, 80, 550));
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(680, 550));
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/Update buyer.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Customer ");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setMaximumSize(new java.awt.Dimension(600, 550));
        jLabel2.setMinimumSize(new java.awt.Dimension(600, 550));
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 550));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 230, 30));

        personalinfo.setForeground(new java.awt.Color(51, 204, 255));
        personalinfo.setText("Personal information");
        personalinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(personalinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        infopanel.setBackground(new java.awt.Color(255, 255, 255,80));
        infopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Fullname");
        infopanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setText("contact No");
        infopanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel6.setText("Address");
        infopanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel7.setText("Email");
        infopanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

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
        infopanel.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 6, 200, 30));

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
        infopanel.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 46, 200, 30));

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
        infopanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 86, 200, 30));

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
        infopanel.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 126, 200, 30));

        jLabel8.setText("Gender");
        infopanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        gender.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        infopanel.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 167, 90, 30));

        errorcontact.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorcontact.setForeground(new java.awt.Color(255, 51, 51));
        infopanel.add(errorcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 130, 10));

        getContentPane().add(infopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, 240));

        cardpanel.setBackground(new java.awt.Color(255, 255, 255, 80));
        cardpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("card number");
        cardpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

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
        cardpanel.add(cardnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 220, 30));

        jLabel10.setText("Experation");
        cardpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

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
        cardpanel.add(securitycode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 40, 30));

        month.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "October", "Nevember", "December" }));
        cardpanel.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 90, 50));

        year.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029" }));
        cardpanel.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, 50));

        jLabel11.setText("Security No");
        cardpanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel12.setText("Card Type");
        cardpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        type.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Us Debit", "Master Card", "Discovery" }));
        cardpanel.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 30));

        errorcard.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorcard.setForeground(new java.awt.Color(255, 0, 51));
        cardpanel.add(errorcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 160, 10));

        getContentPane().add(cardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 350, 240));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 650, 10));

        searchfield.setForeground(new java.awt.Color(204, 204, 204));
        searchfield.setText("Phone number");
        searchfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchfieldFocusLost(evt);
            }
        });
        searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchfieldKeyPressed(evt);
            }
        });
        getContentPane().add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 150, 30));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 40, -1));

        paymentinfo.setForeground(new java.awt.Color(102, 204, 255));
        paymentinfo.setText("Payment information");
        paymentinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(paymentinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 160, -1));

        errorsearch.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        errorsearch.setForeground(new java.awt.Color(255, 102, 102));
        getContentPane().add(errorsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 130, 10));

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 90, 40));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 90, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/product/BEACH4.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -750, 1000, 1300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
     
      String[] infos = customer.getCustomerInfos(searchfield.getText());
      click.playSound(file.clicksound);
      if (customer.findcustomer){ String s = infos[6];String mon="";String yea =""; String t="" ;int i=0; while(!t.equals("/")&&(i<=s.length()-1))
      {  mon=mon+t;
          t=s.substring(i, i+1);
       i++;
       if(t.equals("/")) yea=s.substring(i,s.length()); System.out.print(yea);
      };
      infopanel.setVisible(true);cardpanel.setVisible(true);
      contact.setForeground(new Color(0,0,0));fullname.setForeground(new Color(0,0,0));
      email.setForeground(new Color(0,0,0));address.setForeground(new Color(0,0,0));
      cardnumber.setForeground(new Color(0,0,0));type.setForeground(new Color(0,0,0));securitycode.setForeground(new Color(0,0,0));
      fullname.setText(infos[0]);email.setText(infos[1]);address.setText(infos[2]);contact.setText(infos[3]);gender.setSelectedItem(infos[4]);
      cardnumber.setText(infos[5]);month.setSelectedItem(mon); year.setSelectedItem(yea);
      securitycode.setText(infos[7]); type.setSelectedItem(infos[8]);
      searchfield.enable(false); search.enable(false);
      }
      else{JOptionPane.showMessageDialog(null, "Customer does't exist"); searchfield.setText("Phone number");searchfield.setForeground(new Color(153,153,153));}
      
    }//GEN-LAST:event_searchActionPerformed

    private void searchfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchfieldFocusGained
        if(searchfield.getText().equals("Phone number")){ click.playSound(file.clicksound);
          searchfield.setText("");
          searchfield.setForeground(new Color(0,0,0));
        };
    }//GEN-LAST:event_searchfieldFocusGained

    private void searchfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchfieldFocusLost
  if(searchfield.getText().equals("")){
          searchfield.setText("Phone number");
          searchfield.setForeground(new Color(153,153,153));
        };
    }//GEN-LAST:event_searchfieldFocusLost

    private void searchfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyPressed
    String s= searchfield.getText();int i ; 
       
     try{
     
    errorsearch.setText("");
    
     if(s.length() <= 2)b1=true;
     if((s.length() == 3)&& b1){
         i = Integer.parseInt(s);b1=false;
         searchfield.setText(s+"-");     
     }
     
    if((s.length() >= 4)&&(s.length()<=6)) b2=true; 
    if((s.length() == 7)&& b2) {b2=false;
        i = Integer.parseInt(s.substring(4,6));
         searchfield.setText(s+"-");
         
     }
    if(s.length() == 8)b3=true;
    if(s.length() >= 9) {i = Integer.parseInt(s.substring(8,s.length()));
    
    }
    
    if(s.length() ==12) {
         searchfield.setText(s.substring(0,s.length()-1));
         }
   
    }
    catch(NumberFormatException e1){ click.playSound(file.errorsound);
        searchfield.setText(s.substring(0,s.length()-1));
    errorsearch.setText("Invalid entry");
    
    }
    }//GEN-LAST:event_searchfieldKeyPressed

    private void cardnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardnumberKeyPressed
try{int i; errorcard.setText("");
    
        
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
  
   catch(NumberFormatException e1){ click.playSound(file.errorsound);
   errorcard.setText("Invalid Entry");cardnumber.setText(cardnumber.getText().substring(0,cardnumber.getText().length()-1));
   }
    }//GEN-LAST:event_cardnumberKeyPressed

    private void contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyPressed
        String s= contact.getText();int i ; 
       
     try{
     
    errorcontact.setText("");
    
    if(s.length() <= 2)b1=true;
     if((s.length() == 3)&& b1) {b1=false;
         i = Integer.parseInt(s);
         contact.setText(s+"-");     
     }
    if((s.length() >= 4)&&(s.length()<=6))b2=true; 
    if((s.length()== 7)&&b2) {b2=false;i = Integer.parseInt(s.substring(4,6));
         contact.setText(s+"-");
         
     }
    
    if(s.length() >= 9) {i = Integer.parseInt(s.substring(8,s.length()));
    
    }
    
    if(s.length() ==12) {
         contact.setText(s.substring(0,s.length()-1));
         }
   
    }
    catch(NumberFormatException e1){ click.playSound(file.errorsound);
        contact.setText(s.substring(0,s.length()-1));
    errorcontact.setText("Invalid number");
    
    }
    }//GEN-LAST:event_contactKeyPressed

    private void fullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusGained
      if(fullname.getText().equals("fullname")){ click.playSound(file.clicksound);
       fullname.setText("");fullname.setForeground(new Color(0,0,0));
      };
    }//GEN-LAST:event_fullnameFocusGained

    private void fullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusLost
          if(fullname.getText().equals("")){
       fullname.setText("fullname");fullname.setForeground(new Color(153,153,153));
      };
    }//GEN-LAST:event_fullnameFocusLost

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
   if(contact.getText().equals("999-999-9999")){ click.playSound(file.clicksound);
       contact.setText("");contact.setForeground(new Color(0,0,0));
      };
    }//GEN-LAST:event_contactFocusGained

    private void contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusLost
       if(contact.getText().equals("")){
       contact.setText("999-999-9999");
       contact.setForeground(new Color(153,153,153));
      };
    }//GEN-LAST:event_contactFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
      if(email.getText().equals("Email")){ click.playSound(file.clicksound);
       email.setText("");email.setForeground(new Color(0,0,0));
      };
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
      if(email.getText().equals("")){
       email.setText("Email");email.setForeground(new Color(153,153,153));
      };
    }//GEN-LAST:event_emailFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
         if(address.getText().equals("Address")){ click.playSound(file.clicksound);
       address.setText("");address.setForeground(new Color(0,0,0));
      };
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
           if(address.getText().equals("")){
       address.setText("Address");address.setForeground(new Color(153,153,153));
      };
    }//GEN-LAST:event_addressFocusLost

    private void cardnumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardnumberFocusGained
         if(cardnumber.getText().equals("xxxx-xxxx-xxxx-xxxx")){ click.playSound(file.clicksound);
       cardnumber.setText("");cardnumber.setForeground(new Color(0,0,0));
      };
    }//GEN-LAST:event_cardnumberFocusGained

    private void cardnumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardnumberFocusLost
            if(cardnumber.getText().equals("")){
       cardnumber.setText("xxxx-xxxx-xxxx-xxxx");cardnumber.setForeground(new Color(153,153,153));
      };
    }//GEN-LAST:event_cardnumberFocusLost

    private void securitycodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securitycodeFocusGained
         if(securitycode.getText().equals("999")){ click.playSound(file.clicksound);
       securitycode.setText("");securitycode.setForeground(new Color(0,0,0));
      };
    }//GEN-LAST:event_securitycodeFocusGained

    private void securitycodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securitycodeFocusLost
        if(securitycode.getText().equals("")){ click.playSound(file.clicksound);
       securitycode.setText("999");securitycode.setForeground(new Color(153,153,153));
      };
    }//GEN-LAST:event_securitycodeFocusLost

    
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
     click.playSound(file.exitsound);  this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
      if(allFieldFilled()){ click.playSound(file.selectsound);
        customer.UpdateCustomerInfos(fullname.getText(), contact.getText(), email.getText(), address.getText(), gender.getSelectedItem().toString()
       ,cardnumber.getText(),month.getSelectedItem().toString()+"/"+year.getSelectedItem().toString(),securitycode.getText(),type.getSelectedItem().toString());
      JOptionPane.showMessageDialog(null, "Update Succesfull");this.setVisible(false);}
      else JOptionPane.showMessageDialog(null, "must fill up all field");
    }//GEN-LAST:event_submitActionPerformed
  
    
    
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
    
    
   boolean emptysecurity= true; 
   boolean emptyname = true; 
   boolean emptyemail =true;
   boolean emptyaddress = true;
   boolean emptycard = true; 
   boolean emptycontact =true;
   boolean b1,b2,b3 ; boolean bnum1,bnum2,bnum3;
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cardnumber;
    private javax.swing.JPanel cardpanel;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JLabel errorcard;
    private javax.swing.JLabel errorcontact;
    private javax.swing.JLabel errorsearch;
    private javax.swing.JTextField fullname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JPanel infopanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JLabel paymentinfo;
    private javax.swing.JLabel personalinfo;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchfield;
    private javax.swing.JTextField securitycode;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
