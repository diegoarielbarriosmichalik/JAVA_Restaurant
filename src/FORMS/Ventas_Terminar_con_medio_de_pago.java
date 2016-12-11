package FORMS;

import static DEV.Conexion.conexion;
import DEV.Metodos;
import static DEV.Metodos.id_cuenta;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class Ventas_Terminar_con_medio_de_pago extends javax.swing.JFrame {

    public Ventas_Terminar_con_medio_de_pago() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Terminar Venta");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        Metodos.Ventas_terminar_medios_de_pago_cargar_jtable();

    }

    public static long dinero = 0;
    public static long vuelto = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_terminar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jTextField_medio_de_pago = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField_descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_numero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDialog_medio_de_pago = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_medio_de_pago = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField_ingresar_dinero = new javax.swing.JTextField();
        jTextField_vuelto = new javax.swing.JTextField();
        jt_Total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton_agregar = new javax.swing.JButton();
        jTextField_total_medio_de_pago = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cuenta_pagos = new javax.swing.JTable();
        jCheckBox_presupuesto = new javax.swing.JCheckBox();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_medio_de_pago.setEditable(false);
        jTextField_medio_de_pago.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_medio_de_pago.setText("Efectivo");
        jTextField_medio_de_pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_medio_de_pagoMouseClicked(evt);
            }
        });

        jLabel1.setText("Medio de Pago:");

        jLabel2.setText("Descripcion:");

        jLabel3.setText("Numero:");

        jTextField_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_total.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_total.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_totalFocusGained(evt);
            }
        });
        jTextField_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_totalKeyReleased(evt);
            }
        });

        jLabel4.setText("Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_total)
                    .addComponent(jTextField_numero)
                    .addComponent(jTextField_descripcion)
                    .addComponent(jTextField_medio_de_pago, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_medio_de_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_terminarLayout = new javax.swing.GroupLayout(jDialog_terminar.getContentPane());
        jDialog_terminar.getContentPane().setLayout(jDialog_terminarLayout);
        jDialog_terminarLayout.setHorizontalGroup(
            jDialog_terminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog_terminarLayout.setVerticalGroup(
            jDialog_terminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_terminarLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable_medio_de_pago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Medio de Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_medio_de_pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_medio_de_pagoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_medio_de_pago);
        if (jTable_medio_de_pago.getColumnModel().getColumnCount() > 0) {
            jTable_medio_de_pago.getColumnModel().getColumn(0).setResizable(false);
            jTable_medio_de_pago.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_medio_de_pago.getColumnModel().getColumn(1).setResizable(false);
            jTable_medio_de_pago.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_medio_de_pagoLayout = new javax.swing.GroupLayout(jDialog_medio_de_pago.getContentPane());
        jDialog_medio_de_pago.getContentPane().setLayout(jDialog_medio_de_pagoLayout);
        jDialog_medio_de_pagoLayout.setHorizontalGroup(
            jDialog_medio_de_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog_medio_de_pagoLayout.setVerticalGroup(
            jDialog_medio_de_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_ingresar_dinero.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField_ingresar_dinero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_ingresar_dinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ingresar_dineroActionPerformed(evt);
            }
        });
        jTextField_ingresar_dinero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ingresar_dineroFocusLost(evt);
            }
        });
        jTextField_ingresar_dinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ingresar_dineroKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ingresar_dineroKeyPressed(evt);
            }
        });

        jTextField_vuelto.setEditable(false);
        jTextField_vuelto.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField_vuelto.setForeground(new java.awt.Color(204, 0, 0));
        jTextField_vuelto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_vuelto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_vueltoActionPerformed(evt);
            }
        });
        jTextField_vuelto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_vueltoKeyPressed(evt);
            }
        });

        jt_Total.setEditable(false);
        jt_Total.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jt_Total.setForeground(new java.awt.Color(0, 102, 0));
        jt_Total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora_mini.png"))); // NOI18N
        jButton1.setMnemonic('I');
        jButton1.setToolTipText("Alt + i");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_agregar.setMnemonic('P');
        jButton_agregar.setText("Agregar pagos");
        jButton_agregar.setToolTipText("Alt + P");
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });

        jTextField_total_medio_de_pago.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_total_medio_de_pago.setForeground(new java.awt.Color(0, 153, 0));
        jTextField_total_medio_de_pago.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_total_medio_de_pago.setText("0");

        jTable_cuenta_pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Medio de Pago", "Descripcion", "Numero", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_cuenta_pagos);
        if (jTable_cuenta_pagos.getColumnModel().getColumnCount() > 0) {
            jTable_cuenta_pagos.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuenta_pagos.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_cuenta_pagos.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuenta_pagos.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable_cuenta_pagos.getColumnModel().getColumn(2).setResizable(false);
            jTable_cuenta_pagos.getColumnModel().getColumn(3).setResizable(false);
            jTable_cuenta_pagos.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable_cuenta_pagos.getColumnModel().getColumn(4).setResizable(false);
            jTable_cuenta_pagos.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        jCheckBox_presupuesto.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_presupuesto.setText("Imprimir presupuesto");
        jCheckBox_presupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_presupuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_presupuesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jTextField_ingresar_dinero, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Total, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_vuelto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_total_medio_de_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ingresar_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_vuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_total_medio_de_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addComponent(jCheckBox_presupuesto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);

    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        String enteroString = Long.toString(Metodos.total);

        String strLong = Long.toString(Metodos.total);
        String nuevo = DEV.Metodos.getSepararMiles(strLong);

        jt_Total.setText(nuevo);
        jTextField_ingresar_dinero.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void jTextField_vueltoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_vueltoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_vueltoKeyPressed

    private void jTextField_vueltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_vueltoActionPerformed

    }//GEN-LAST:event_jTextField_vueltoActionPerformed

    private void jTextField_ingresar_dineroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ingresar_dineroKeyReleased

        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            getTerinarVenta();
            this.setVisible(false);
            DEV.Metodos.ventaNuevo();
        }

        if (jTextField_ingresar_dinero.getText().length() > 1) {

            String strDinero = jTextField_ingresar_dinero.getText();
            strDinero = strDinero.replace(".", "");

            dinero = Integer.parseInt(strDinero);

            System.err.println("Dinero: " + strDinero);

            vuelto = dinero - Metodos.total;

            String strLong = Long.toString(vuelto);
            String nuevo = DEV.Metodos.getSepararMiles(strLong);
            String nuevo_dinero = DEV.Metodos.getSepararMiles(strDinero);

            jTextField_vuelto.setText(nuevo);

            jTextField_ingresar_dinero.setText(nuevo_dinero);
        }


    }//GEN-LAST:event_jTextField_ingresar_dineroKeyReleased

    private void jTextField_ingresar_dineroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ingresar_dineroKeyPressed

    }//GEN-LAST:event_jTextField_ingresar_dineroKeyPressed

    private void jTextField_ingresar_dineroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ingresar_dineroFocusLost

        int dinero = Integer.parseInt(jTextField_ingresar_dinero.getText());
        int total = Integer.parseInt(jt_Total.getText());
        int vuelto = dinero - total;

        String strLong = Long.toString(vuelto);
        String nuevo = DEV.Metodos.getSepararMiles(strLong);

        jTextField_vuelto.setText(String.valueOf(nuevo));
    }//GEN-LAST:event_jTextField_ingresar_dineroFocusLost

    public static void getTerinarVenta() {

        try {
            PreparedStatement Update3 = conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "set id_estado = '10', "
                    + "dinero = '" + Ventas_Terminar_con_medio_de_pago.dinero + "', "
                    + "vuelto = '" + Ventas_Terminar_con_medio_de_pago.vuelto + "' "
                    + "WHERE id_cuenta='" + id_cuenta + "'");
            Update3.executeUpdate();

            long iva0 = 0;
            long iva5 = 0;
            long iva10 = 0;
            long total0 = 0;
            long total5 = 0;
            long total10 = 0;
            long total_letras = 0;
            long total_iva = 0;

            Statement st4 = conexion.createStatement();
            ResultSet result4 = st4.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
            while (result4.next()) {
                total0 = result4.getLong("exentas") + total0;
                total5 = result4.getLong("cinco") + total5;
                total10 = result4.getLong("diez") + total0;
            }

            Metodos.total = total0 + total5 + total10;

            //  String letras = Numero_a_String(total);
            PreparedStatement Update5 = conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET "
                    + "exentas = '0', "
                    + "cinco = '" + total5 / 21 + "', "
                    + "diez = '" + total10 / 11 + "' "
                    + "WHERE id_cuenta='" + id_cuenta + "'");
            Update5.executeUpdate();

            Metodos.total = 0;

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Metodos.venta_terminar_con_nedio_de_pago = 1;
        Metodos.Cuenta_imprimir("0");
//        Metodos.Imprimir_ticket();

    }//GEN-LAST:event_jButton1ActionPerformed

    public void Jdialog_Terminar() {

        Metodos.id_medio_de_pago = 1;

        jDialog_terminar.setVisible(true);
        jDialog_terminar.setTitle("Opciones de Pago");
        jDialog_terminar.setSize(285, 180);
        jDialog_terminar.setLocationRelativeTo(null);
        jDialog_terminar.setAlwaysOnTop(true);
        jDialog_terminar.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_descripcion.requestFocus();

    }

    public void Jdialog_Medio_de_pago() {

        jTextField_medio_de_pago.setText("");
        jTextField_descripcion.setText("");
        jTextField_numero.setText("");
        jTextField_total.setText("0");

        jDialog_medio_de_pago.setVisible(true);
        jDialog_medio_de_pago.setTitle("Medio  de Pago");
        jDialog_medio_de_pago.setSize(330, 330);
        jDialog_medio_de_pago.setLocationRelativeTo(null);
        jDialog_medio_de_pago.setAlwaysOnTop(true);
        jDialog_medio_de_pago.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        Metodos.Ventas_cargar_medio_de_pago_jtable();

    }


    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
        Jdialog_Terminar();
    }//GEN-LAST:event_jButton_agregarActionPerformed

    private void jTextField_medio_de_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_medio_de_pagoMouseClicked
        Jdialog_Medio_de_pago();
    }//GEN-LAST:event_jTextField_medio_de_pagoMouseClicked

    private void jTable_medio_de_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_medio_de_pagoMouseClicked
        jDialog_medio_de_pago.setVisible(false);
        Metodos.Tipo_de_pago_selected();
        jTextField_descripcion.requestFocus();
    }//GEN-LAST:event_jTable_medio_de_pagoMouseClicked

    private void jTextField_totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_totalKeyReleased

//        long total = Long.parseLong(Ventas_Terminar.jTextField_total.getText().replace(".", ""));
        String str_puntitos = Metodos.getSepararMiles(Ventas_Terminar_con_medio_de_pago.jTextField_total.getText().replace(".", ""));
        Ventas_Terminar_con_medio_de_pago.jTextField_total.setText(str_puntitos);

        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {

            jDialog_terminar.setVisible(false);
            Metodos.Medio_de_pago_guardar();
            Metodos.Ventas_terminar_medios_de_pago_cargar_jtable();

            jTextField_descripcion.setText("");
            jTextField_numero.setText("");
            jTextField_total.setText("");
            Metodos.id_medio_de_pago = 1;

        }
    }//GEN-LAST:event_jTextField_totalKeyReleased

    private void jTextField_totalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_totalFocusGained
        jTextField_total.selectAll();
    }//GEN-LAST:event_jTextField_totalFocusGained

    private void jTextField_ingresar_dineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ingresar_dineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ingresar_dineroActionPerformed

    private void jCheckBox_presupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_presupuestoActionPerformed
     //   Metodos.Ventas_medio_de_pago_update_presupuesto();
    }//GEN-LAST:event_jCheckBox_presupuestoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas_Terminar_con_medio_de_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas_Terminar_con_medio_de_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas_Terminar_con_medio_de_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas_Terminar_con_medio_de_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas_Terminar_con_medio_de_pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_agregar;
    public static javax.swing.JCheckBox jCheckBox_presupuesto;
    private javax.swing.JDialog jDialog_medio_de_pago;
    private javax.swing.JDialog jDialog_terminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_cuenta_pagos;
    public static javax.swing.JTable jTable_medio_de_pago;
    public static javax.swing.JTextField jTextField_descripcion;
    public static javax.swing.JTextField jTextField_ingresar_dinero;
    public static javax.swing.JTextField jTextField_medio_de_pago;
    public static javax.swing.JTextField jTextField_numero;
    public static javax.swing.JTextField jTextField_total;
    public static javax.swing.JTextField jTextField_total_medio_de_pago;
    private javax.swing.JTextField jTextField_vuelto;
    public static javax.swing.JTextField jt_Total;
    // End of variables declaration//GEN-END:variables
}
