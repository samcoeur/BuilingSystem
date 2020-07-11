
package billing.managementsystem;

import java.awt.Color;
import javax.swing.JOptionPane;



public class newProduct extends javax.swing.JFrame {
   loadFile load ; 
   newProductData product ; 
   sound click ; soundfile file ;
    public newProduct() { load = new loadFile();product = new newProductData();
     click= new sound(""); file = new soundfile(); 
        initComponents();errorquantity.setVisible(false);errorid.setVisible(false);
        errorunit.setVisible(false); errorselling.setVisible(false);errorname.setVisible(false); uploaderror.setVisible(false);
        valid1=false;valid2=false;valid3=false;valid4=false;valid5=false;valid6=false;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        depart = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        errorid = new javax.swing.JLabel();
        errorquantity = new javax.swing.JLabel();
        unitprice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        errorselling = new javax.swing.JLabel();
        errorunit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sellingprice = new javax.swing.JTextField();
        errorname = new javax.swing.JLabel();
        uploaderror = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(480, 380, 1000, 550));
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 550));
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/New Product ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 260, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Product ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        id.setForeground(new java.awt.Color(204, 204, 204));
        id.setText("Enter ID");
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 210, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setText("Enter name");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Depart");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        depart.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        depart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Grocery", "2 Vegetable", "3 Fruit", "4 Canned Food", "5 Pet Food", "6 Electronic", "7 Cosmetic", "8 Cloth", "9 Jawlery", " " }));
        getContentPane().add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/new product.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        quantity.setForeground(new java.awt.Color(204, 204, 204));
        quantity.setText("9999");
        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFocusLost(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityKeyPressed(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 50, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add product image ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        upload.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        getContentPane().add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, 30));
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 400, 290));

        submit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/login.png"))); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 100, 40));

        reset.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/Reset.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 80, 40));

        cancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 90, 40));

        errorid.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorid.setForeground(new java.awt.Color(255, 51, 102));
        errorid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorid.setText(" Invalid Entry ");
        getContentPane().add(errorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 110, 30));

        errorquantity.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorquantity.setForeground(new java.awt.Color(255, 51, 51));
        errorquantity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorquantity.setText("Invalid Entry");
        getContentPane().add(errorquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 90, 30));

        unitprice.setForeground(new java.awt.Color(204, 204, 204));
        unitprice.setText("0.99");
        unitprice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unitpriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unitpriceFocusLost(evt);
            }
        });
        unitprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unitpriceKeyPressed(evt);
            }
        });
        getContentPane().add(unitprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 236, 70, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Unit Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 102));
        jLabel11.setText("$$");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 20));

        errorselling.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorselling.setForeground(new java.awt.Color(255, 0, 0));
        errorselling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorselling.setText("Invalid Entry");
        getContentPane().add(errorselling, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 120, 20));

        errorunit.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorunit.setForeground(new java.awt.Color(255, 0, 0));
        errorunit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorunit.setText("Invalid Entry");
        getContentPane().add(errorunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 110, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Selling Price ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 102));
        jLabel12.setText("$$");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, 20));

        sellingprice.setForeground(new java.awt.Color(204, 204, 204));
        sellingprice.setText("1.25");
        sellingprice.setCaretColor(new java.awt.Color(204, 204, 204));
        sellingprice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sellingpriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sellingpriceFocusLost(evt);
            }
        });
        sellingprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellingpriceKeyPressed(evt);
            }
        });
        getContentPane().add(sellingprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 276, 70, 30));

        errorname.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        errorname.setForeground(new java.awt.Color(255, 51, 51));
        errorname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        errorname.setText("Invalid Entry");
        getContentPane().add(errorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        uploaderror.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        uploaderror.setForeground(new java.awt.Color(255, 0, 0));
        uploaderror.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        uploaderror.setText("must upload image");
        getContentPane().add(uploaderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 376, 160, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/product/BEACH4.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
      click.playSound(file.clicksound); load.pathToImage(image);
      if(!load.filename.equals("")) {valid6=true;uploaderror.setVisible(false);}
    }//GEN-LAST:event_uploadActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
      click.playSound(file.clicksound);
      if(this.checkEntry()){ 
      String s = depart.getSelectedItem().toString();
        product.insertProduct(id.getText(),
              name.getText(),Integer.parseInt(quantity.getText()),
               Integer.parseInt(s.substring(0,1))  ,
      load.filename, this.priceforunit ,this.pricesell);
      JOptionPane.showMessageDialog(null, "prodcut has been created successfully"); this.setVisible(false);
      }else{  JOptionPane.showMessageDialog(null, "check your entries");    };
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
      click.playSound(file.resetsound);  new newProduct().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       click.playSound(file.exitsound); this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
       if(id.getText().equals("Enter ID")){ click.playSound(file.clicksound);
       id.setText("");id.setForeground(new Color(0,0,0));
       };
    }//GEN-LAST:event_idFocusGained

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
      if(id.getText().equals("")){ valid1=false;
       id.setText("Enter ID");id.setForeground(new Color(153,153,153));
       };
    }//GEN-LAST:event_idFocusLost

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
       if(name.getText().equals("Enter name")){ click.playSound(file.clicksound);
       name.setText("");name.setForeground(new Color(0,0,0));valid2 = false;
       };
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
         if(name.getText().equals("")){ valid2 =false;
       name.setText("Enter name");name.setForeground(new Color(153,153,153));
       };
    }//GEN-LAST:event_nameFocusLost

    private void quantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusGained
       if(quantity.getText().equals("9999")){ click.playSound(file.clicksound);
        quantity.setText(""); quantity.setForeground(new Color(0,0,0));
       };
    }//GEN-LAST:event_quantityFocusGained

    private void quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusLost
         if(quantity.getText().equals("")){ valid5 = false;
        quantity.setText("9999"); quantity.setForeground(new Color(153,153,153));
       };
    }//GEN-LAST:event_quantityFocusLost

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
     try{ errorid.setVisible(false);int i;  valid1=true;
    if(id.getText().length() >=1)  i = Integer.parseInt(id.getText()); 
     if(id.getText().length() >= 9) id.setText(id.getText().substring(0,id.getText().length()-1));
     }
     catch(NumberFormatException e1){ valid1=false;errorid.setVisible(true); click.playSound(file.errorsound);
     id.setText(id.getText().substring(0,id.getText().length()-1));
     };
    }//GEN-LAST:event_idKeyPressed

    private void quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyPressed
      try{ errorquantity.setVisible(false);
    int i ;
    if(quantity.getText().length() >=1) i = Integer.parseInt(quantity.getText());  valid5=true;
     if(quantity.getText().length() >= 4) quantity.setText(quantity.getText().substring(0,quantity.getText().length()-1));
     }
     catch(NumberFormatException e1){ valid5=false;errorquantity.setVisible(true);click.playSound(file.errorsound);
     if (quantity.getText().length()==1) quantity.setText(""); 
       else  quantity.setText(quantity.getText().substring(0,quantity.getText().length()-1));
     };
    }//GEN-LAST:event_quantityKeyPressed

    private void unitpriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unitpriceFocusGained
     if(unitprice.getText().equals("0.99")){click.playSound(file.clicksound);
        unitprice.setText(""); unitprice.setForeground(new Color(0,0,0));
       };
    }//GEN-LAST:event_unitpriceFocusGained

    private void unitpriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unitpriceFocusLost
   if(unitprice.getText().equals("")){ valid3=false;
        unitprice.setText("0.99"); unitprice.setForeground(new Color(153,153,153));
       };
    }//GEN-LAST:event_unitpriceFocusLost

    private void sellingpriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellingpriceFocusGained
       if(sellingprice.getText().equals("1.25")){click.playSound(file.clicksound);
        sellingprice.setText(""); sellingprice.setForeground(new Color(0,0,0));
       };
    }//GEN-LAST:event_sellingpriceFocusGained

    private void sellingpriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellingpriceFocusLost
       if(sellingprice.getText().equals("")){ valid4 = false;
        sellingprice.setText("1.25"); sellingprice.setForeground(new Color(153,153,153));
       };
    }//GEN-LAST:event_sellingpriceFocusLost

    private void unitpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitpriceKeyPressed
        try{ errorunit.setVisible(false); valid3 = true;
    if(unitprice.getText().length() >=1) priceforunit = Double.parseDouble(unitprice.getText());
     
    if(unitprice.getText().length() >= 8) unitprice.setText(unitprice.getText().substring(0,unitprice.getText().length()-2));
     }
     catch(NumberFormatException e1){ valid3=false;errorunit.setVisible(true);click.playSound(file.errorsound);
     if (unitprice.getText().length()==1) unitprice.setText("");
       else  unitprice.setText(unitprice.getText().substring(0,unitprice.getText().length()-1));
     };
    }//GEN-LAST:event_unitpriceKeyPressed

    private void sellingpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingpriceKeyPressed
       try{ errorselling.setVisible(false); valid4=true;
    if(sellingprice.getText().length() >=1) pricesell = Double.parseDouble(sellingprice.getText());
     
    if(sellingprice.getText().length() >= 8) sellingprice.setText(sellingprice.getText().substring(0,sellingprice.getText().length()-2));
     }
     catch(NumberFormatException e1){ valid4=false;errorselling.setVisible(true);click.playSound(file.errorsound);
     if (sellingprice.getText().length()==1) sellingprice.setText("");
       else  sellingprice.setText(sellingprice.getText().substring(0,sellingprice.getText().length()-1));
     };
    }//GEN-LAST:event_sellingpriceKeyPressed

    
    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newProduct().setVisible(true);
            }
        });
    }
    
    public boolean checkEntry(){
    if(name.getText().equals("Enter name")) errorname.setVisible(true);
    else{valid2 = true;errorname.setVisible(false);}
        boolean check = valid1&&valid2&&valid3&&valid5&&valid4&&valid6 ;
     if (!valid1) errorid.setVisible(true);
     if(!valid5)  errorquantity.setVisible(true);
     if(!valid3)   errorunit.setVisible(true); 
      if(!valid4)  errorselling.setVisible(true);
      if(!valid6) uploaderror.setVisible(true);
      
       
       
    return check ; 
    };
    
    
  double  priceforunit,pricesell;
  boolean valid1,valid2,valid3,valid4,valid5,valid6;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> depart;
    private javax.swing.JLabel errorid;
    private javax.swing.JLabel errorname;
    private javax.swing.JLabel errorquantity;
    private javax.swing.JLabel errorselling;
    private javax.swing.JLabel errorunit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel image;
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
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton reset;
    private javax.swing.JTextField sellingprice;
    private javax.swing.JButton submit;
    private javax.swing.JTextField unitprice;
    private javax.swing.JButton upload;
    private javax.swing.JLabel uploaderror;
    // End of variables declaration//GEN-END:variables
}
