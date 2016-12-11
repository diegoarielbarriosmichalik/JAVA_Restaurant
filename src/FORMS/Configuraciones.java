package FORMS;

import DEV.Metodos;
import javax.swing.ImageIcon;

public class Configuraciones extends javax.swing.JFrame {

    public Configuraciones() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Configuraciones");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        jTextField_comercio.setText(Metodos.comercio);
        jTextField_direccion.setText(Metodos.comercio_direccion);
        jTextField_email.setText(Metodos.comercio_email);
        jTextField_telefono.setText(Metodos.comercio_telefono);
        jTextField_ruc.setText(Metodos.comercio_ruc);

        Metodos.Configuracion_obtener_datos();

        jTextField_comercio.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_informacion = new javax.swing.JPanel();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jTextField_comercio = new javax.swing.JTextField();
        jTextField_ruc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_productos = new javax.swing.JTextField();
        jPanel_Configuracion = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox_precio_automatico = new javax.swing.JCheckBox();
        jCheckBox_pedidos = new javax.swing.JCheckBox();
        jCheckBox_pagado = new javax.swing.JCheckBox();
        jCheckBox_alerta_stock = new javax.swing.JCheckBox();
        jCheckBox_ventas_a_credito = new javax.swing.JCheckBox();
        jCheckBox_medio_de_pago = new javax.swing.JCheckBox();
        jCheckBox_bloquear = new javax.swing.JCheckBox();
        jCheckBox_recargo = new javax.swing.JCheckBox();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_informacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_informacion.setPreferredSize(new java.awt.Dimension(400, 298));

        jTextField_direccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));
        jTextField_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_direccionActionPerformed(evt);
            }
        });

        jTextField_email.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo Electrónico"));

        jTextField_comercio.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre de la empresa"));

        jTextField_ruc.setBorder(javax.swing.BorderFactory.createTitledBorder("RUC"));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Imagen de fondo (500 x 500)");
        jButton1.setToolTipText("");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton4.setMnemonic('g');
        jButton4.setToolTipText("Guardar los cambios");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

        jTextField_productos.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad de productos por factura"));
        jTextField_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_productosActionPerformed(evt);
            }
        });
        jTextField_productos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_productosFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel_informacionLayout = new javax.swing.GroupLayout(jPanel_informacion);
        jPanel_informacion.setLayout(jPanel_informacionLayout);
        jPanel_informacionLayout.setHorizontalGroup(
            jPanel_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_informacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_informacionLayout.createSequentialGroup()
                        .addComponent(jTextField_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_productos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel_informacionLayout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                            .addComponent(jButton4))
                        .addComponent(jTextField_email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_comercio, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel_informacionLayout.setVerticalGroup(
            jPanel_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_informacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_comercio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Información General", jPanel_informacion);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");

        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("* Es necesario reiniciar el sistema para que los cambios tengan efecto.");

        jCheckBox_precio_automatico.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_precio_automatico.setText("Habilitar precio de venta automatico");
        jCheckBox_precio_automatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_precio_automaticoActionPerformed(evt);
            }
        });

        jCheckBox_pedidos.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_pedidos.setText("Habilitar Pedidos");
        jCheckBox_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_pedidosActionPerformed(evt);
            }
        });
        jCheckBox_pedidos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCheckBox_pedidosPropertyChange(evt);
            }
        });

        jCheckBox_pagado.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_pagado.setText("Habilitar control individual de pagos");
        jCheckBox_pagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_pagadoActionPerformed(evt);
            }
        });

        jCheckBox_alerta_stock.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_alerta_stock.setText("Bloquear venta de productos sin stock");
        jCheckBox_alerta_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_alerta_stockActionPerformed(evt);
            }
        });

        jCheckBox_ventas_a_credito.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_ventas_a_credito.setText("Habilitar ventas a credito");
        jCheckBox_ventas_a_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ventas_a_creditoActionPerformed(evt);
            }
        });

        jCheckBox_medio_de_pago.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_medio_de_pago.setText("Habilitar medios de pagos alternativos");
        jCheckBox_medio_de_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_medio_de_pagoActionPerformed(evt);
            }
        });

        jCheckBox_bloquear.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_bloquear.setText("Bloquear facturas de ventas terminadas");
        jCheckBox_bloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_bloquearActionPerformed(evt);
            }
        });

        jCheckBox_recargo.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_recargo.setText("Habilitar recargo en productos");
        jCheckBox_recargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_recargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_ventas_a_credito)
                    .addComponent(jCheckBox_alerta_stock)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox_pedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox_pagado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_precio_automatico)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBox_medio_de_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_bloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_recargo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_pedidos)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_pagado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_precio_automatico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_alerta_stock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_ventas_a_credito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_medio_de_pago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_bloquear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_recargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_ConfiguracionLayout = new javax.swing.GroupLayout(jPanel_Configuracion);
        jPanel_Configuracion.setLayout(jPanel_ConfiguracionLayout);
        jPanel_ConfiguracionLayout.setHorizontalGroup(
            jPanel_ConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ConfiguracionLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_ConfiguracionLayout.setVerticalGroup(
            jPanel_ConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Configuraciones del Sistema", jPanel_Configuracion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Metodos.Comercios_Guardar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox_precio_automaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_precio_automaticoActionPerformed
        Metodos.Configuracion_update_precio_automatico();
    }//GEN-LAST:event_jCheckBox_precio_automaticoActionPerformed

    private void jCheckBox_pagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_pagadoActionPerformed
        Metodos.Configuracion_update_pagados();
    }//GEN-LAST:event_jCheckBox_pagadoActionPerformed

    private void jCheckBox_pedidosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCheckBox_pedidosPropertyChange
        //   Metodos.Configuracion_update_pedidos();
    }//GEN-LAST:event_jCheckBox_pedidosPropertyChange

    private void jCheckBox_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_pedidosActionPerformed
        Metodos.Configuracion_update_pedidos();
    }//GEN-LAST:event_jCheckBox_pedidosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Imagen_de_fondo().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox_alerta_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_alerta_stockActionPerformed
        Metodos.Configuracion_update_alerta_stock();
    }//GEN-LAST:event_jCheckBox_alerta_stockActionPerformed

    private void jCheckBox_ventas_a_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ventas_a_creditoActionPerformed
        Metodos.Configuracion_update_ventas_a_credito();
    }//GEN-LAST:event_jCheckBox_ventas_a_creditoActionPerformed

    private void jTextField_productosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_productosFocusLost
        Metodos.Configuracion_update_productos_por_factura();
    }//GEN-LAST:event_jTextField_productosFocusLost

    private void jTextField_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direccionActionPerformed

    private void jTextField_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_productosActionPerformed

    private void jCheckBox_medio_de_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_medio_de_pagoActionPerformed
        Metodos.Configuracion_update_habilitar_medio_de_pago();
    }//GEN-LAST:event_jCheckBox_medio_de_pagoActionPerformed

    private void jCheckBox_bloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_bloquearActionPerformed
        Metodos.Configuracion_update_bloquear_facturas();
    }//GEN-LAST:event_jCheckBox_bloquearActionPerformed

    private void jCheckBox_recargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_recargoActionPerformed
        Metodos.Configuracion_update_recargo();
    }//GEN-LAST:event_jCheckBox_recargoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Configuraciones().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JCheckBox jCheckBox_alerta_stock;
    public static javax.swing.JCheckBox jCheckBox_bloquear;
    public static javax.swing.JCheckBox jCheckBox_medio_de_pago;
    public static javax.swing.JCheckBox jCheckBox_pagado;
    public static javax.swing.JCheckBox jCheckBox_pedidos;
    public static javax.swing.JCheckBox jCheckBox_precio_automatico;
    public static javax.swing.JCheckBox jCheckBox_recargo;
    public static javax.swing.JCheckBox jCheckBox_ventas_a_credito;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Configuracion;
    private javax.swing.JPanel jPanel_informacion;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextField jTextField_comercio;
    public static javax.swing.JTextField jTextField_direccion;
    public static javax.swing.JTextField jTextField_email;
    public static javax.swing.JTextField jTextField_productos;
    public static javax.swing.JTextField jTextField_ruc;
    public static javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
