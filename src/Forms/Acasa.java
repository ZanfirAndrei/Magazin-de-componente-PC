package Forms;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import magazin.*;
/**
 * @author becky
 */

public class Acasa extends javax.swing.JFrame {

    public Acasa() {
        initComponents();
    }

    public void close() {
        this.setVisible(false);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButonAfisarePro = new javax.swing.JButton();
        ButonAdaugProdTast = new javax.swing.JButton();
        ButonIncarcareStoc = new javax.swing.JButton();
        ButonIncarcFisier = new javax.swing.JButton();
        ButonVanzareProdus = new javax.swing.JButton();
        ButonStergereProdus = new javax.swing.JButton();
        ButonSortarePret = new javax.swing.JButton();
        EtichetaTitlu = new javax.swing.JLabel();
        ButonCalcSumaCateg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acasa");
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(500, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName("Acasa"); // NOI18N

        ButonAfisarePro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButonAfisarePro.setText("Afisare Produse & Componente ");
        ButonAfisarePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonAfisareProActionPerformed(evt);
            }
        });

        ButonAdaugProdTast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButonAdaugProdTast.setText("Adaugare produs de la tastatura");
        ButonAdaugProdTast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonAdaugProdTastActionPerformed(evt);
            }
        });

        ButonIncarcareStoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButonIncarcareStoc.setText("Incarcare stoc");
        ButonIncarcareStoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonIncarcareStocActionPerformed(evt);
            }
        });

        ButonIncarcFisier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButonIncarcFisier.setText("Incarcare componente din fisier");
        ButonIncarcFisier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonIncarcFisierActionPerformed(evt);
            }
        });

        ButonVanzareProdus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButonVanzareProdus.setText("Vanzare produs");
        ButonVanzareProdus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonVanzareProdusActionPerformed(evt);
            }
        });

        ButonStergereProdus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButonStergereProdus.setText("Stergere produs");
        ButonStergereProdus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonStergereProdusActionPerformed(evt);
            }
        });

        ButonSortarePret.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButonSortarePret.setText("Pret dupa producator");
        ButonSortarePret.setToolTipText("");
        ButonSortarePret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonSortarePretActionPerformed(evt);
            }
        });

        EtichetaTitlu.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        EtichetaTitlu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtichetaTitlu.setText("Magazin de componente PC");

        ButonCalcSumaCateg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButonCalcSumaCateg.setText("Pret total per categorie");
        ButonCalcSumaCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonCalcSumaCategActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(EtichetaTitlu, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButonVanzareProdus, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButonAfisarePro))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButonIncarcareStoc, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButonStergereProdus, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButonCalcSumaCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ButonAdaugProdTast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButonSortarePret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButonIncarcFisier, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(EtichetaTitlu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButonIncarcFisier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButonAdaugProdTast, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButonSortarePret, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButonCalcSumaCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButonAfisarePro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButonIncarcareStoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButonVanzareProdus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButonStergereProdus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButonIncarcFisierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonIncarcFisierActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acasa().setVisible(true);
            }
        });
        Produs s  = new Produs();
        //System.out.println(s.readFromFile());
        if(s.getLastId()!= -1 )
            JOptionPane.showMessageDialog(null , s.readFromFile());
        else    
             JOptionPane.showMessageDialog(null , "Produsele sunt deja inserate din fisier");
        close();
    }//GEN-LAST:event_ButonIncarcFisierActionPerformed

    private void ButonAdaugProdTastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonAdaugProdTastActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdaugareProdus().setVisible(true);
                close();
            }
        });
    }//GEN-LAST:event_ButonAdaugProdTastActionPerformed

    private void ButonStergereProdusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonStergereProdusActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProduseDelete().setVisible(true);
                close();
            }
        });
    }//GEN-LAST:event_ButonStergereProdusActionPerformed

    private void ButonSortarePretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonSortarePretActionPerformed
        //showPretByProducator(String producator)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfisarePretByProducator().setVisible(true);
                close();
            }
        });
    }//GEN-LAST:event_ButonSortarePretActionPerformed

    private void ButonAfisareProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonAfisareProActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfisareProduse().setVisible(true);
                close();
            }
        });
    }//GEN-LAST:event_ButonAfisareProActionPerformed

    private void ButonCalcSumaCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonCalcSumaCategActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PretPerCategorie().setVisible(true);
                close();
            }
        });
    }//GEN-LAST:event_ButonCalcSumaCategActionPerformed

    private void ButonIncarcareStocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonIncarcareStocActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProduseStoc().setVisible(true);
                close();
            }
        });
    }//GEN-LAST:event_ButonIncarcareStocActionPerformed

    private void ButonVanzareProdusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonVanzareProdusActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProduseVanzare().setVisible(true);
                close();
            }
        });
    }//GEN-LAST:event_ButonVanzareProdusActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonAdaugProdTast;
    private javax.swing.JButton ButonAfisarePro;
    private javax.swing.JButton ButonCalcSumaCateg;
    private javax.swing.JButton ButonIncarcFisier;
    private javax.swing.JButton ButonIncarcareStoc;
    private javax.swing.JButton ButonSortarePret;
    private javax.swing.JButton ButonStergereProdus;
    private javax.swing.JButton ButonVanzareProdus;
    private javax.swing.JLabel EtichetaTitlu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
