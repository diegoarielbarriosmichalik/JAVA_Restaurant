package FORMS;

import DEV.Metodos;
import static DEV.Metodos.Generar_recibos_poner_cero;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Facturas_a_credito extends javax.swing.JFrame {

    public Facturas_a_credito() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Facturas a credito");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Generar_recibos_poner_cero();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_facturas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField_total = new javax.swing.JTextField();

        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jTextField_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscarActionPerformed(evt);
            }
        });
        jTextField_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscarKeyReleased(evt);
            }
        });

        jTable_facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Fecha", "Factura", "Total", "Opciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_facturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_facturas);
        if (jTable_facturas.getColumnModel().getColumnCount() > 0) {
            jTable_facturas.getColumnModel().getColumn(0).setResizable(false);
            jTable_facturas.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_facturas.getColumnModel().getColumn(1).setResizable(false);
            jTable_facturas.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable_facturas.getColumnModel().getColumn(2).setResizable(false);
            jTable_facturas.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable_facturas.getColumnModel().getColumn(3).setResizable(false);
            jTable_facturas.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable_facturas.getColumnModel().getColumn(4).setResizable(false);
            jTable_facturas.getColumnModel().getColumn(4).setPreferredWidth(5);
            jTable_facturas.getColumnModel().getColumn(5).setResizable(false);
            jTable_facturas.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jButton1.setText("GENERAR RECIBO DE DINERO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField_total.setEditable(false);
        jTextField_total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_total.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_total.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_total))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyReleased
        Metodos.Facturas_credito_buscar_cliente_cargar_lista();
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }

    }//GEN-LAST:event_jTextField_buscarKeyReleased

    private void jTable_facturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_facturasMouseClicked
        Metodos.Facturas_a_credito_detalle_selected();
    }//GEN-LAST:event_jTable_facturasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Recibo_de_dinero().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas_a_credito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_facturas;
    public static javax.swing.JTextField jTextField_buscar;
    public static javax.swing.JTextField jTextField_total;
    // End of variables declaration//GEN-END:variables
}
