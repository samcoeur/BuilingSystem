/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing.managementsystem;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class PurchaseInfos extends javax.swing.JFrame {

    billingData bill; newCustomerData customer ; 
    loadFile load ; 
     java.sql.Date dat =new java.sql.Date(new Date().getTime());
    
    
    public PurchaseInfos() {bill = new billingData();load= new loadFile();
     customer = new newCustomerData();
        initComponents();
        loadProduct(6);infotable.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectproduct = new javax.swing.JComboBox<>();
        productimage = new javax.swing.JLabel();
        productname = new javax.swing.JLabel();
        unitprice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infotable = new javax.swing.JTable();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setLocation(new java.awt.Point(450, 350));
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectproduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a product" }));
        selectproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectproductActionPerformed(evt);
            }
        });
        getContentPane().add(selectproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 40));
        getContentPane().add(productimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 530, 270));

        productname.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        productname.setForeground(new java.awt.Color(255, 255, 255));
        productname.setText("productname");
        getContentPane().add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 170, 20));

        unitprice.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        unitprice.setForeground(new java.awt.Color(255, 255, 255));
        unitprice.setText("price");
        getContentPane().add(unitprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 170, -1));

        infotable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        infotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Buyer name", "Payment methode", "Quantity Sold", "Total Cost", "Date ", "receipt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        infotable.setEditingColumn(0);
        infotable.setEditingRow(0);
        infotable.setGridColor(new java.awt.Color(0, 51, 51));
        infotable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        infotable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(infotable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 910, 150));

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 519, 80, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/managementsystem/product/BEACH4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-610, -1030, 2400, 1720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectproductActionPerformed
      if(!selectproduct.getSelectedItem().equals("Select a product")){ String name= selectproduct.getSelectedItem().toString();
        setProductVisible(true);productname.setText(name); infotable.setVisible(false);
        String[] infos= bill.getProductInfos(name);
        unitprice.setText(infos[1]); load.displaylabelIcon(productimage, 
                infos[2]);System.out.print(infos[0]);
      ArrayList<String[]> list = bill.getBillingInfos(infos[0]);
      if(!list.isEmpty()){infotable.setVisible(true);
        DefaultTableModel tab = (DefaultTableModel)infotable.getModel();
       for(int i=0;i<=list.size()-1;i++) tab.addRow(list.get(i));
      };};
    }//GEN-LAST:event_selectproductActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    
    
   public void loadProduct(int id){
       ArrayList<String> list= bill.getProduct(id);
   
     for(int count = 0 ; count<= list.size()-1 ; count ++)
       selectproduct.addItem(list.get(count)); 
   };
   
   public void setProductVisible(boolean v){
     productname.setVisible(v);productimage.setVisible(v);unitprice.setVisible(v);
   }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseInfos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTable infotable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel productimage;
    private javax.swing.JLabel productname;
    private javax.swing.JComboBox<String> selectproduct;
    private javax.swing.JLabel unitprice;
    // End of variables declaration//GEN-END:variables
}
