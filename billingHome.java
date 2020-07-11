

package billing.managementsystem;

public class billingHome extends javax.swing.JFrame {
public boolean show ; 
public sound click ; 
public  soundfile file; 
    public billingHome() { show = false;click = new sound(""); file = new soundfile();
    
        initComponents();manueReset();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hider = new javax.swing.JButton();
        newcustomer = new javax.swing.JButton();
        updatecustomer = new javax.swing.JButton();
        customerinfos = new javax.swing.JButton();
        deletecustomer = new javax.swing.JButton();
        updateproduct = new javax.swing.JButton();
        productdetails = new javax.swing.JButton();
        deleteproduct = new javax.swing.JButton();
        billing = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        newproduct = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 200, 1500, 800));
        setLocation(new java.awt.Point(250, 200));
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/control hide and show.png"))); // NOI18N
        hider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hiderMouseClicked(evt);
            }
        });
        getContentPane().add(hider, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        newcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/new buyer.png"))); // NOI18N
        newcustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newcustomer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                newcustomerComponentShown(evt);
            }
        });
        newcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcustomerActionPerformed(evt);
            }
        });
        getContentPane().add(newcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        updatecustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/Update buyer.png"))); // NOI18N
        updatecustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatecustomer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updatecustomerComponentShown(evt);
            }
        });
        updatecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecustomerActionPerformed(evt);
            }
        });
        getContentPane().add(updatecustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, 70));

        customerinfos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/buyer Details.png"))); // NOI18N
        customerinfos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerinfos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customerinfosComponentShown(evt);
            }
        });
        customerinfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerinfosActionPerformed(evt);
            }
        });
        getContentPane().add(customerinfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, 70));

        deletecustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/delete buyer.png"))); // NOI18N
        deletecustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletecustomer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deletecustomerComponentShown(evt);
            }
        });
        getContentPane().add(deletecustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        updateproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/update product.png"))); // NOI18N
        updateproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateproduct.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateproductComponentShown(evt);
            }
        });
        getContentPane().add(updateproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        productdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/details product.png"))); // NOI18N
        productdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productdetails.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                productdetailsComponentShown(evt);
            }
        });
        getContentPane().add(productdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 70));

        deleteproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/delete product.png"))); // NOI18N
        deleteproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteproduct.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deleteproductComponentShown(evt);
            }
        });
        getContentPane().add(deleteproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/billing.png"))); // NOI18N
        billing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billing.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                billingComponentShown(evt);
            }
        });
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        getContentPane().add(billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 80, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/logout.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                logoutComponentShown(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, -1, 70));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/Close.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                closeComponentShown(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Customer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Customer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delete ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 60, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Statistic");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 70, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Product");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Update ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Details");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jlabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jlabel9.setForeground(new java.awt.Color(255, 255, 255));
        jlabel9.setText("Delete Product");
        getContentPane().add(jlabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Billing");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 70, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Logout");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, 30));

        newproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/new product.png"))); // NOI18N
        newproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newproduct.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                newproductComponentShown(evt);
            }
        });
        newproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newproductActionPerformed(evt);
            }
        });
        getContentPane().add(newproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/product/BEACH5.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiderMouseClicked
       if (!show) try {  click.playSound(file.clicksound);
       Thread.sleep(250);
       newcustomer.setVisible(true);
       jLabel2.setVisible(true);
       }catch(Exception e){}
       else {manueReset(); show=false;};
       
       
    }//GEN-LAST:event_hiderMouseClicked

    private void newcustomerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_newcustomerComponentShown
      if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       updatecustomer.setVisible(true);
       jLabel3.setVisible(true);
       }catch(Exception e){}
     
    }//GEN-LAST:event_newcustomerComponentShown

    private void updatecustomerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updatecustomerComponentShown
      if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       customerinfos.setVisible(true);
       jLabel5.setVisible(true);
       }catch(Exception e){}
      
    }//GEN-LAST:event_updatecustomerComponentShown

    private void customerinfosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customerinfosComponentShown
      if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       deletecustomer.setVisible(true);
       jLabel4.setVisible(true);
       }catch(Exception e){}
     
    }//GEN-LAST:event_customerinfosComponentShown

    private void deletecustomerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deletecustomerComponentShown
        if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       newproduct.setVisible(true);
       jLabel6.setVisible(true);
       }catch(Exception e){}
     
    }//GEN-LAST:event_deletecustomerComponentShown

    private void newproductComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_newproductComponentShown
        if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       updateproduct.setVisible(true);
       jLabel7.setVisible(true);
       }catch(Exception e){}
     
    }//GEN-LAST:event_newproductComponentShown

    private void updateproductComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateproductComponentShown
        if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       productdetails.setVisible(true);
       jLabel8.setVisible(true);
       }catch(Exception e){}
      
    }//GEN-LAST:event_updateproductComponentShown

    private void productdetailsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_productdetailsComponentShown
        if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       deleteproduct.setVisible(true);
       jlabel9.setVisible(true);
       }catch(Exception e){}
       
    }//GEN-LAST:event_productdetailsComponentShown

    private void deleteproductComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteproductComponentShown
          if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
      billing.setVisible(true);
       jLabel10.setVisible(true);
       }catch(Exception e){}
       
    }//GEN-LAST:event_deleteproductComponentShown

    private void billingComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_billingComponentShown
          if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       logout.setVisible(true);
       jLabel11.setVisible(true);
       }catch(Exception e){}
       
    }//GEN-LAST:event_billingComponentShown

    private void logoutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_logoutComponentShown
          if (!show) try {click.playSound(file.clicksound);
       Thread.sleep(250);
       close.setVisible(true);
       show=true;
       }catch(Exception e){}
       
    }//GEN-LAST:event_logoutComponentShown

    private void closeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_closeComponentShown
      
    }//GEN-LAST:event_closeComponentShown

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
   click.playSound(file.exitsound); System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void newcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcustomerActionPerformed
    click.playSound(file.clicksound);
        new newCustomer().setVisible(true);
      
    }//GEN-LAST:event_newcustomerActionPerformed

    private void updatecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecustomerActionPerformed
          click.playSound(file.clicksound);
        new updateCustomer().setVisible(true);
    }//GEN-LAST:event_updatecustomerActionPerformed

    private void newproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newproductActionPerformed
         click.playSound(file.clicksound);
        new newProduct().setVisible(true);
    }//GEN-LAST:event_newproductActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
      click.playSound(file.clicksound);
        new billing().setVisible(true);
    }//GEN-LAST:event_billingActionPerformed

    private void customerinfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerinfosActionPerformed
     new PurchaseInfos().setVisible(true);
    }//GEN-LAST:event_customerinfosActionPerformed

   
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billingHome().setVisible(true);
            }
        });
    }
  public void manueReset(){
  
    close.setVisible(false);
    customerinfos.setVisible(false);
     deletecustomer.setVisible(false);
     deleteproduct.setVisible(false);
     billing.setVisible(false);
     logout.setVisible(false);
     newcustomer.setVisible(false);
     newproduct.setVisible(false);
     productdetails.setVisible(false);
     updatecustomer.setVisible(false);
     updateproduct.setVisible(false);
     jLabel10.setVisible(false);jlabel9.setVisible(false);jLabel8.setVisible(false);
     jLabel7.setVisible(false);jLabel6.setVisible(false);jLabel5.setVisible(false);
     jLabel4.setVisible(false);jLabel3.setVisible(false);jLabel2.setVisible(false);
     jLabel11.setVisible(false);
  };
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billing;
    private javax.swing.JButton close;
    private javax.swing.JButton customerinfos;
    private javax.swing.JButton deletecustomer;
    private javax.swing.JButton deleteproduct;
    private javax.swing.JButton hider;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlabel9;
    private javax.swing.JButton logout;
    private javax.swing.JButton newcustomer;
    private javax.swing.JButton newproduct;
    private javax.swing.JButton productdetails;
    private javax.swing.JButton updatecustomer;
    private javax.swing.JButton updateproduct;
    // End of variables declaration//GEN-END:variables
}
