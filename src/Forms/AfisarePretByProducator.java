package Forms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import magazin.*;

/**
 *
 * @author becky
 */
public class AfisarePretByProducator extends javax.swing.JFrame {

    /**
     * Creates new form AfisarePretByProducator
     */
    public AfisarePretByProducator() {
        initComponents();
        DisplayTable();
        /*String coloane = "Producator";
        //String [] numeColoa = coloane.split(" ");
        DefaultTableModel tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setColumnIdentifiers( coloane );
        Produs prod = new Produs();
        Connection con = prod.getCon();
        String lista = new String () ;
        Statement stmt;
        String sql = "select * from produs";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
               
               lista = rs.getString("Producator"); 
                
               
                tabela.addRow(lista);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AfisareProduse.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
    }
    public void DisplayTable(){
        String coloane = "Producator";
        String [] numeColoa = coloane.split(" ");
        DefaultTableModel tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setColumnIdentifiers( numeColoa );
        tabela.setNumRows(0);
        Produs prod = new Produs();
        Connection con = prod.getCon();
        String[] lista = new String [1] ;
        Statement stmt;
        
        String sql = "select  distinct Producator  from produs ";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
               
                lista[0] = rs.getString("Producator");
               
                
               
                tabela.addRow(lista);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AfisareProduse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DisplayTablePret(String categorie){
        String coloane = "CodProdus Model Pret";
        String [] numeColoa = coloane.split(" ");
        DefaultTableModel tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setColumnIdentifiers( numeColoa );
        tabela.setNumRows(0);
        Produs prod = new Produs();
        Connection con = prod.getCon();
        String[] lista = new String [3] ;
        PreparedStatement pstmt;
        
        String sql = "select * from produs where producator = ? ";
        try {
            pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1,categorie);
            
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
               
                lista[0] = rs.getString("CodProdus"); 
                lista[1] = rs.getString("Model");
                lista[2] = rs.getString("Pretprodus");
                
                tabela.addRow(lista);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AfisareProduse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void close() {
        this.setVisible(false);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        HomeButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ButonVindeProdus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(191, 191, 191));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Magazin de componente PC");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(jTable1);

        HomeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HomeButton.setText("Acasa");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alege producatorul:");

        ButonVindeProdus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButonVindeProdus.setText("Afiseaza pret");
        ButonVindeProdus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonVindeProdusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButonVindeProdus)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButonVindeProdus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeButton.setVisible(true);
                new Acasa().setVisible(true);
                close();
            }
        });
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void ButonVindeProdusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonVindeProdusActionPerformed
        //Afiseaza produsele dupa producator
        Produs prod = new Produs();
        String categorie= jTextField1.getText();
        DisplayTablePret(categorie);
        

    }//GEN-LAST:event_ButonVindeProdusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AfisarePretByProducator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfisarePretByProducator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfisarePretByProducator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfisarePretByProducator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfisarePretByProducator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonVindeProdus;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
}
