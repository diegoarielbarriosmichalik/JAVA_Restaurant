package FORMS;

import static DEV.Conexion.conexion;
import DEV.Metodos;
import static DEV.Metodos.Stock_where_id_producto;
import static DEV.Metodos.alerta_stock;
import static DEV.Metodos.ultimo_producto_agregado_id_cuenta_detalle;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventas_modificar_precio_cantidad extends javax.swing.JFrame {

    public Ventas_modificar_precio_cantidad() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Opciones");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        if (Metodos.habilitar_control_individual_de_pago == 0) {
            Ventas_modificar_precio_cantidad.jButton_pagado.setVisible(false);
        } else {
            Ventas_modificar_precio_cantidad.jButton_pagado.setVisible(true);
        }

        //System.err.println("Resultado ="+ Metodos.habilitar_control_individual_de_pago);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_Unidades = new javax.swing.JTextField();
        jTextField_Precio_Unitario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField_Producto = new javax.swing.JTextField();
        jButton_pagado = new javax.swing.JButton();
        jTextField_Precio_compra = new javax.swing.JTextField();
        jTextField_stock = new javax.swing.JTextField();
        jTextField_Proveedor = new javax.swing.JTextField();
        jTextField_fecha = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setAlwaysOnTop(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextField_Unidades.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Unidades.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_Unidades.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Unidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidades"));
        jTextField_Unidades.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UnidadesFocusGained(evt);
            }
        });
        jTextField_Unidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_UnidadesKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_UnidadesKeyPressed(evt);
            }
        });

        jTextField_Precio_Unitario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Precio_Unitario.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_Precio_Unitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Precio_Unitario.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Unitario"));
        jTextField_Precio_Unitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Precio_UnitarioKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del_mini.png"))); // NOI18N
        jButton1.setMnemonic('b');
        jButton1.setToolTipText("Quitar producto de esta venta");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField_Producto.setEditable(false);
        jTextField_Producto.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Producto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Producto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion del producto"));

        jButton_pagado.setText("Pagado");
        jButton_pagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pagadoActionPerformed(evt);
            }
        });

        jTextField_Precio_compra.setEditable(false);
        jTextField_Precio_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Precio_compra.setForeground(new java.awt.Color(0, 51, 255));
        jTextField_Precio_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Precio_compra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio de compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 255)));
        jTextField_Precio_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Precio_compraActionPerformed(evt);
            }
        });
        jTextField_Precio_compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Precio_compraKeyReleased(evt);
            }
        });

        jTextField_stock.setEditable(false);
        jTextField_stock.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_stock.setForeground(new java.awt.Color(0, 51, 255));
        jTextField_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_stock.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 255)));
        jTextField_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_stockKeyReleased(evt);
            }
        });

        jTextField_Proveedor.setEditable(false);
        jTextField_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Proveedor.setForeground(new java.awt.Color(0, 51, 255));
        jTextField_Proveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 255)));
        jTextField_Proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ProveedorKeyReleased(evt);
            }
        });

        jTextField_fecha.setEditable(false);
        jTextField_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fecha.setForeground(new java.awt.Color(0, 51, 255));
        jTextField_fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 51, 255)));
        jTextField_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fechaActionPerformed(evt);
            }
        });
        jTextField_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_fechaKeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton2.setMnemonic('x');
        jButton2.setToolTipText("Alt + X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Producto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jTextField_Precio_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_pagado))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Precio_Unitario)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Precio_Unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Precio_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_pagado))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Precio_UnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Precio_UnitarioKeyReleased

        String strDinero = jTextField_Precio_Unitario.getText();
        strDinero = strDinero.replace(".", "");
        String nuevo = DEV.Metodos.getSepararMiles(strDinero);
        String nuevo_dinero = DEV.Metodos.getSepararMiles(strDinero);

        jTextField_Precio_Unitario.setText(nuevo_dinero);

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Guardar_Cambios();
            this.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }

    }//GEN-LAST:event_jTextField_Precio_UnitarioKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTextField_Unidades.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Metodos.Ventas_modificar_precio_cantidad();
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void Guardar_Cambios() {
        double total = 0;
        String strDinero = jTextField_Precio_Unitario.getText().replace(".", "");
        String unidades = jTextField_Unidades.getText().replace(",", ".");

        double cantidad = Double.parseDouble(unidades);

        double precio = Double.parseDouble(strDinero);
        long precio_int = (new Double(precio)).longValue();
        double stock_real = 0;
        double stock_actualizado = 0;
        try {
            Statement ST_Productos = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle "
                    + "where id_cuenta_detalle = '" + Metodos.id_cuenta_detalle_facturacion + "'");
            if (RS_Productos.next()) {

                double unidades_en_stock = Stock_where_id_producto(RS_Productos.getInt("id_producto"));
                if (alerta_stock == 1 && unidades_en_stock < cantidad) {
                    JOptionPane.showMessageDialog(null, "ALERTA: Stock actual del producto menor al ingresado");
                } else {

                    long exentas_cuenta_detalle = RS_Productos.getLong("exentas");
                    long cinco_cuenta_detalle = RS_Productos.getLong("cinco");
                    long diez_cuenta_detalle = RS_Productos.getLong("diez");

                    long total_cuenta_detalle = exentas_cuenta_detalle + cinco_cuenta_detalle + diez_cuenta_detalle;

                    Double cuenta_detalle_cantidad = RS_Productos.getDouble("cantidad");

                    total = cantidad * precio;
                    Statement ST = DEV.Conexion.conexion.createStatement();
                    ResultSet RS = ST.executeQuery("SELECT * FROM productos "
                            + "where id_producto = '" + RS_Productos.getInt("id_producto") + "'");
                    if (RS.next()) {

                        long diez = 0;
                        long cinco = 0;
                        long exentas = 0;
                        double stock = RS.getDouble("stock");

                        stock_real = stock + cuenta_detalle_cantidad;
                        stock_actualizado = stock_real - cantidad;

                        if (RS.getInt("id_iva") == 1) {
                            diez = (new Double(total)).longValue();
                        }
                        if (RS.getInt("id_iva") == 2) {
                            cinco = (new Double(total)).longValue();
                        }
                        if (RS.getInt("id_iva") == 3) {
                            exentas = (new Double(total)).longValue();
                        }

                        PreparedStatement stUpdateAuxiliar = DEV.Conexion.conexion.prepareStatement(""
                                + "UPDATE cuenta_detalle "
                                + "SET cantidad='" + cantidad + "', "
                                + "diez = '" + diez + "', "
                                + "cinco = '" + cinco + "', "
                                + "exentas = '" + exentas + "', "
                                + "total = '" + (cinco + diez + exentas) + "', "
                                + "precio = '" + precio_int + "'  "
                                + "WHERE id_cuenta_detalle='" + Metodos.id_cuenta_detalle_facturacion + "'");
                        stUpdateAuxiliar.executeUpdate();

                        //---- actualizo el stock
                        PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                                + "UPDATE productos "
                                + "SET stock ='" + stock_actualizado + "' "
                                + "WHERE id_producto='" + RS_Productos.getInt("id_producto") + "'");
                        stUpdateStock.executeUpdate();
                        //---- actualizo el stock

                        if (cantidad == 0) {
                            PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement(""
                                    + "delete from cuenta_detalle "
                                    + "WHERE id_cuenta_detalle ='" + Metodos.id_cuenta_detalle_facturacion + "'");
                            stUpdateAuxiliar2.executeUpdate();
                        }

                        Metodos.Cuenta_actualizar_total();
                        Metodos.BuscarFactura_facturacion();
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }


    private void jTextField_UnidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UnidadesKeyReleased

    }//GEN-LAST:event_jTextField_UnidadesKeyReleased

    private void jTextField_UnidadesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UnidadesFocusGained
        jTextField_Precio_Unitario.select(0, 10);
    }//GEN-LAST:event_jTextField_UnidadesFocusGained

    private void jButton_pagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pagadoActionPerformed
        Metodos.Ventas_update_pagado();
        Metodos.BuscarFactura_facturacion();

        this.setVisible(false);

    }//GEN-LAST:event_jButton_pagadoActionPerformed

    private void jTextField_UnidadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UnidadesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.setVisible(false);
            Guardar_Cambios();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_UnidadesKeyPressed

    private void jTextField_Precio_compraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Precio_compraKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Precio_compraKeyReleased

    private void jTextField_stockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_stockKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_stockKeyReleased

    private void jTextField_ProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ProveedorKeyReleased

    private void jTextField_fechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_fechaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fechaKeyReleased

    private void jTextField_Precio_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Precio_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Precio_compraActionPerformed

    private void jTextField_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fechaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas_modificar_precio_cantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas_modificar_precio_cantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas_modificar_precio_cantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas_modificar_precio_cantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas_modificar_precio_cantidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton_pagado;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField_Precio_Unitario;
    public static javax.swing.JTextField jTextField_Precio_compra;
    public static javax.swing.JTextField jTextField_Producto;
    public static javax.swing.JTextField jTextField_Proveedor;
    public static javax.swing.JTextField jTextField_Unidades;
    public static javax.swing.JTextField jTextField_fecha;
    public static javax.swing.JTextField jTextField_stock;
    // End of variables declaration//GEN-END:variables
}
