package FORMS;

import DEV.Metodos;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Pagares_listado extends javax.swing.JFrame {

    public Pagares_listado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Pagares");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        Metodos.Pagares_listado_cargar_jtable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_pagares = new javax.swing.JTable();

        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_pagares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Total", "Moneda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_pagares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pagaresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_pagares);
        if (jTable_pagares.getColumnModel().getColumnCount() > 0) {
            jTable_pagares.getColumnModel().getColumn(0).setResizable(false);
            jTable_pagares.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_pagares.getColumnModel().getColumn(1).setResizable(false);
            jTable_pagares.getColumnModel().getColumn(1).setPreferredWidth(500);
            jTable_pagares.getColumnModel().getColumn(2).setResizable(false);
            jTable_pagares.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable_pagares.getColumnModel().getColumn(3).setResizable(false);
            jTable_pagares.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_pagaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pagaresMouseClicked
        DefaultTableModel tm = (DefaultTableModel) jTable_pagares.getModel();
        Metodos.id_pagare = Integer.parseInt(String.valueOf(tm.getValueAt(jTable_pagares.getSelectedRow(), 0)));
        Metodos.Pagare_buscar2();
        this.setVisible(false);
        
    }//GEN-LAST:event_jTable_pagaresMouseClicked

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
            java.util.logging.Logger.getLogger(Pagares_listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagares_listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagares_listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagares_listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagares_listado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_pagares;
    // End of variables declaration//GEN-END:variables
}
