package FORMS;

import DEV.Metodos;
import static DEV.Metodos.Proveedor_Buscar;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Compras_proveedor_buscar extends javax.swing.JFrame {
    
    public Compras_proveedor_buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proveedores");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_Buscar_proveedor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_proveedores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_Buscar_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Proveedor"));
        jTextField_Buscar_proveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_Buscar_proveedorFocusLost(evt);
            }
        });
        jTextField_Buscar_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Buscar_proveedorKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Buscar_proveedorKeyPressed(evt);
            }
        });

        jTable_proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_proveedoresMouseClicked(evt);
            }
        });
        jTable_proveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_proveedoresKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_proveedores);
        if (jTable_proveedores.getColumnModel().getColumnCount() > 0) {
            jTable_proveedores.getColumnModel().getColumn(0).setResizable(false);
            jTable_proveedores.getColumnModel().getColumn(0).setPreferredWidth(550);
        }

        jButton1.setMnemonic('a');
        jButton1.setText("Agregar Proveedor");
        jButton1.setToolTipText("Alt + A");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Buscar_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_Buscar_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Buscar_proveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Buscar_proveedorKeyReleased
        Proveedor_Buscar();
    }//GEN-LAST:event_jTextField_Buscar_proveedorKeyReleased

    private void jTable_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_proveedoresMouseClicked
        
        if (jTable_proveedores.getSelectedRow() >= 0) {
            Metodos.Compras_Proveedores_cargar_datos();
            this.setVisible(false);
            Compras.jT_factura_nro.setText(null);
            Compras.jT_factura_nro.requestFocus();
            Compras.jT_Buscar_Productos.setEditable(false);
      //      Compras.jButton_guardar.setVisible(true);
        }
        

    }//GEN-LAST:event_jTable_proveedoresMouseClicked

    private void jTextField_Buscar_proveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_Buscar_proveedorFocusLost
        Proveedor_Buscar();
    }//GEN-LAST:event_jTextField_Buscar_proveedorFocusLost

    private void jTextField_Buscar_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Buscar_proveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTable_proveedores.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_Buscar_proveedorKeyPressed

    private void jTable_proveedoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proveedoresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTable_proveedores.getSelectedRow() >= 0) {
                Metodos.Compras_Proveedores_cargar_datos();
                this.setVisible(false);
                Compras.jT_factura_nro.setText(null);
                Compras.jT_factura_nro.requestFocus();
                Compras.jT_Buscar_Productos.setEditable(false);
          //      Compras.jButton_guardar.setVisible(true);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTable_proveedoresKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Proveedor().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Compras_proveedor_buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras_proveedor_buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras_proveedor_buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras_proveedor_buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras_proveedor_buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_proveedores;
    public static javax.swing.JTextField jTextField_Buscar_proveedor;
    // End of variables declaration//GEN-END:variables
}
