package Forms;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import magazin.*;
import DataBase.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author becky
 */

public class AfisareProduse extends javax.swing.JFrame {
    public AfisareProduse() {
        initComponents();
        
    }
    public void AfisProd(){
         String coloaneProdus = "CodProdus Producator Model PretProdus AnFabricatie Garantie TaraProvenienta Stoc Tip";
        
        String [] numeColoa = coloaneProdus.split(" ");
        DefaultTableModel tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setNumRows(0);
        tabela.setColumnIdentifiers( numeColoa );
        Produs prod = new Produs();
        Connection con = prod.getCon();
        String[] lista = new String [9] ;
        Statement stmt;
        String sql = "select * from produs";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
               
               lista[0] = rs.getString("CodProdus"); 
                lista[1] = rs.getString("Producator");
                lista[2] = rs.getString("Model");
                lista[3] = rs.getString("PretProdus");
                lista[4] = rs.getString("AnFabricatie");
                lista[5] = rs.getString("Garantie");
                lista[6] = rs.getString("Taraprovenienta");
                lista[7] = rs.getString("Stoc");
                lista[8] = rs.getString("Tip");
               
                tabela.addRow(lista);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AfisareProduse.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void AfisComp(){
        Componenta comp = new Componenta();
        Connection con = comp.getCon();
        String coloaneComponente = "ID NUME";
        String [] numeColoa = coloaneComponente.split(" ");
        DefaultTableModel tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setNumRows(0);
        tabela.setColumnIdentifiers( numeColoa );
        Statement stmtComp;
         String[] lista = new String [2] ;
        String sql_2 = "select * from componenta";
        try {
            stmtComp = con.createStatement();
            ResultSet rs = stmtComp.executeQuery(sql_2);
            while(rs.next()){
               
                lista[0] = rs.getString("Id");
                lista[1] = rs.getString("Nume");
               
                tabela.addRow(lista);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AfisareProduse.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public void close()
    {
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
        Produse = new javax.swing.JButton();
        Componente = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        setSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(191, 191, 191));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Magazin de componente PC");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        Produse.setText("Produse");
        Produse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProduseActionPerformed(evt);
            }
        });

        Componente.setText("Componente");
        Componente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComponenteActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Componente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Produse, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Produse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Componente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(28, 28, 28))
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
    
    
    private void ComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComponenteActionPerformed
        // TODO add your handling code here:
        AfisComp();
    }//GEN-LAST:event_ComponenteActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add Exit:
        close();
        
    }//GEN-LAST:event_ExitActionPerformed

    private void ProduseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProduseActionPerformed

        // TODO  add Produse :
        AfisProd();
        
    }//GEN-LAST:event_ProduseActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AfisareProduse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfisareProduse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfisareProduse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfisareProduse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfisareProduse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Componente;
    private javax.swing.JButton Exit;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton Produse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
