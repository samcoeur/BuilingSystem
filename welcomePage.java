/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing.managementsystem;

import javax.swing.JOptionPane;


public class welcomePage extends javax.swing.JFrame {
 loadFile load; 
 sound click; soundfile file; 
 
 
    public welcomePage() {load = new loadFile();
            click = new sound(""); file = new soundfile();
        initComponents();
        username.setText("admin");password.setText("admin");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        selected = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 200, 1450, 800));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1450, 800));
        setMinimumSize(new java.awt.Dimension(1450, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1450, 800));
        setSize(new java.awt.Dimension(1450, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, -1, -1));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 380, 220, 30));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 440, 220, 30));

        login.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/login.png"))); // NOI18N
        login.setText("Login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 540, 100, 50));

        cancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/close Jframe.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 540, -1, 50));

        selected.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        selected.setText("Show password");
        selected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedActionPerformed(evt);
            }
        });
        getContentPane().add(selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 490, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/myresource/login ani.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 200, 360, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/product/BEACH5.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1500, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       if (username.getText().equals("admin")&& password.getText().equals("admin")){
          click.playSound(file.clicksound); this.setVisible(false);  new billingHome().setVisible(true);
       }else JOptionPane.showMessageDialog(null, "incorrect username or password");
    }//GEN-LAST:event_loginActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
      click.playSound(file.clicksound);
     int a = JOptionPane.showConfirmDialog(null, "Do you really want to quit","select",JOptionPane.YES_NO_OPTION);   
    if (a==0) {click.playSound(file.exitsound); System.exit(0);}
    }//GEN-LAST:event_cancelActionPerformed

    private void selectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedActionPerformed
        click.playSound(file.clicksound);
        if(selected.isSelected()){password.setEchoChar((char)0);} 
       else password.setEchoChar('*');
    }//GEN-LAST:event_selectedActionPerformed

    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox selected;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
