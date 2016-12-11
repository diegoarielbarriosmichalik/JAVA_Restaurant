package FORMS;

import DEV.Metodos;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.ImageIcon;

public class Cliente_historial extends javax.swing.JFrame {

    public Cliente_historial() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Listado de ventas");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        Date dnow = new Date();
        jd_desde.setDate(dnow);
        jd_hasta.setDate(dnow);

        jTextField_cliente.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_tipo_de_venta = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jTextField_todos = new javax.swing.JTextField();
        jTextField_credito = new javax.swing.JTextField();
        jTextField_contado = new javax.swing.JTextField();
        jDialog_clientes = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jTextField_buscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        id_producto = new javax.swing.JLabel();
        jd_desde = new com.toedter.calendar.JDateChooser();
        jd_hasta = new com.toedter.calendar.JDateChooser();
        jTextField_cliente = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_todos.setEditable(false);
        jTextField_todos.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_todos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_todos.setText("TODOS");
        jTextField_todos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_todosMouseClicked(evt);
            }
        });
        jTextField_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_todosActionPerformed(evt);
            }
        });

        jTextField_credito.setEditable(false);
        jTextField_credito.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_credito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_credito.setText("CREDITO");
        jTextField_credito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_creditoMouseClicked(evt);
            }
        });

        jTextField_contado.setEditable(false);
        jTextField_contado.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_contado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_contado.setText("CONTADO");
        jTextField_contado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_contadoMouseClicked(evt);
            }
        });
        jTextField_contado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_contadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_todos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_contado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_credito, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_todos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_contado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_tipo_de_ventaLayout = new javax.swing.GroupLayout(jDialog_tipo_de_venta.getContentPane());
        jDialog_tipo_de_venta.getContentPane().setLayout(jDialog_tipo_de_ventaLayout);
        jDialog_tipo_de_ventaLayout.setHorizontalGroup(
            jDialog_tipo_de_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_tipo_de_ventaLayout.setVerticalGroup(
            jDialog_tipo_de_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog_clientes.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar cliente"));
        jTextField_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscarActionPerformed(evt);
            }
        });
        jTextField_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscarKeyReleased(evt);
            }
        });

        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "CI", "RUC", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clientesMouseClicked(evt);
            }
        });
        jTable_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_clientesKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_clientes);
        if (jTable_clientes.getColumnModel().getColumnCount() > 0) {
            jTable_clientes.getColumnModel().getColumn(0).setResizable(false);
            jTable_clientes.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_clientes.getColumnModel().getColumn(1).setResizable(false);
            jTable_clientes.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable_clientes.getColumnModel().getColumn(2).setResizable(false);
            jTable_clientes.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable_clientes.getColumnModel().getColumn(3).setResizable(false);
            jTable_clientes.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable_clientes.getColumnModel().getColumn(4).setResizable(false);
            jTable_clientes.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_clientesLayout = new javax.swing.GroupLayout(jDialog_clientes.getContentPane());
        jDialog_clientes.getContentPane().setLayout(jDialog_clientesLayout);
        jDialog_clientesLayout.setHorizontalGroup(
            jDialog_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
            .addGroup(jDialog_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog_clientesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog_clientesLayout.setVerticalGroup(
            jDialog_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(jDialog_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog_clientesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora_mini.png"))); // NOI18N
        jButton1.setToolTipText("Ver listado");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jd_desde.setBackground(new java.awt.Color(255, 255, 255));
        jd_desde.setBorder(javax.swing.BorderFactory.createTitledBorder("Desde"));
        jd_desde.setDateFormatString("dd/MMM/yyyy");

        jd_hasta.setBackground(new java.awt.Color(255, 255, 255));
        jd_hasta.setBorder(javax.swing.BorderFactory.createTitledBorder("Hasta"));
        jd_hasta.setDateFormatString("dd/MMM/yyyy");

        jTextField_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes (ENTER para buscar)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 255)));
        jTextField_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_clienteMouseClicked(evt);
            }
        });
        jTextField_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_clienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(id_producto))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jd_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jd_hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(id_producto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jd_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Metodos.Listado_de_ventas_por_factura_print();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    public void Jdialog_tipo_de_venta() {
        jDialog_tipo_de_venta.setVisible(true);
        jDialog_tipo_de_venta.setTitle("Tipo de venta");
        jDialog_tipo_de_venta.setSize(330, 90);
        jDialog_tipo_de_venta.setLocationRelativeTo(null);
        jDialog_tipo_de_venta.setAlwaysOnTop(true);
        jDialog_tipo_de_venta.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_clientes() {
        jDialog_clientes.setVisible(true);
        jDialog_clientes.setTitle("Clientes");
        jDialog_clientes.setSize(640, 500);
        jDialog_clientes.setLocationRelativeTo(null);
        jDialog_clientes.setAlwaysOnTop(true);
        jDialog_clientes.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    private void jTextField_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_todosActionPerformed

    }//GEN-LAST:event_jTextField_todosActionPerformed

    private void jTextField_todosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_todosMouseClicked
        jDialog_tipo_de_venta.setVisible(false);
    }//GEN-LAST:event_jTextField_todosMouseClicked

    private void jTextField_creditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_creditoMouseClicked
        jDialog_tipo_de_venta.setVisible(false);
    }//GEN-LAST:event_jTextField_creditoMouseClicked

    private void jTextField_contadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_contadoMouseClicked
        jDialog_tipo_de_venta.setVisible(false);
    }//GEN-LAST:event_jTextField_contadoMouseClicked

    private void jTextField_contadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_contadoActionPerformed
    }//GEN-LAST:event_jTextField_contadoActionPerformed

    private void jTable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientesMouseClicked
        Metodos.Listado_clientes_selected();
        jDialog_clientes.setVisible(false);
    }//GEN-LAST:event_jTable_clientesMouseClicked

    private void jTextField_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
        Metodos.Listado_de_ventas_Buscar_cliente_cargar_lista();
    }//GEN-LAST:event_jTextField_buscarKeyReleased

    private void jTextField_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_clienteMouseClicked
    }//GEN-LAST:event_jTextField_clienteMouseClicked

    private void jTextField_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_clienteKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            jDialog_clientes();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_clienteKeyPressed

    private void jTextField_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            jTable_clientes.requestFocus();
        }
    }//GEN-LAST:event_jTextField_buscarKeyPressed

    private void jTextField_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscarActionPerformed

    private void jTable_clientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_clientesKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Listado_clientes_selected();
            jDialog_clientes.setVisible(false);
        }
    }//GEN-LAST:event_jTable_clientesKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cliente_historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id_producto;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog_clientes;
    private javax.swing.JDialog jDialog_tipo_de_venta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_clientes;
    public static javax.swing.JTextField jTextField_buscar;
    public static javax.swing.JTextField jTextField_cliente;
    private javax.swing.JTextField jTextField_contado;
    private javax.swing.JTextField jTextField_credito;
    private javax.swing.JTextField jTextField_todos;
    public static com.toedter.calendar.JDateChooser jd_desde;
    public static com.toedter.calendar.JDateChooser jd_hasta;
    // End of variables declaration//GEN-END:variables
}
