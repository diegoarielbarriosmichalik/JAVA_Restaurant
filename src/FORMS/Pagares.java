package FORMS;

import DEV.Conexion;
import static DEV.Conexion.conexion;
import DEV.Metodos;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class Pagares extends javax.swing.JFrame {

    public Pagares() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            this.setTitle("Pagares");
            setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

            Conexion.Verificar_conexion();

            Statement st5 = conexion.createStatement();
            ResultSet result5 = st5.executeQuery("SELECT MAX(id_pagare) FROM pagares ");
            while (result5.next()) {
                Metodos.id_pagare = result5.getInt(1);
            }

//            Metodos.Pagare_buscar(Integer.parseInt(jTextField_id_pagare.getText()));
            Metodos.Pagare_buscar2();

//            String cero = "0";
//            if (jTextField_id_pagare.equals(cero)) {
////                jTextField_firmantes.setEditable(true);
//            } else {
////                jTextField_firmantes.setEditable(false);
//            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_dinero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_clientes = new javax.swing.JTextField();
        jDateChooser_Fecha = new com.toedter.calendar.JDateChooser();
        jDateChooser_vencimiento = new com.toedter.calendar.JDateChooser();
        jTextField_interes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_comision = new javax.swing.JTextField();
        jLabel_firmantes = new javax.swing.JLabel();
        jTextField_firmantes = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_pagares_detalle = new javax.swing.JTable();
        jTextField_id_pagare = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_moneda = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });

        jLabel2.setText("Fecha:");

        jLabel3.setText("Vencimiento:");

        jTextField_dinero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_dinero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_dineroFocusLost(evt);
            }
        });
        jTextField_dinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_dineroKeyReleased(evt);
            }
        });

        jLabel4.setText("Pagare al señor/a");

        jTextField_clientes.setEditable(false);
        jTextField_clientes.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_clientesMouseClicked(evt);
            }
        });
        jTextField_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_clientesKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_clientesKeyPressed(evt);
            }
        });

        jDateChooser_Fecha.setDateFormatString("dd/MMM/yyyy");
        jDateChooser_Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_FechaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser_FechaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser_FechaMousePressed(evt);
            }
        });
        jDateChooser_Fecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser_FechaFocusLost(evt);
            }
        });
        jDateChooser_Fecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_FechaPropertyChange(evt);
            }
        });

        jDateChooser_vencimiento.setDateFormatString("dd/MMM/yyyy");
        jDateChooser_vencimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_vencimientoPropertyChange(evt);
            }
        });

        jTextField_interes.setText("0");
        jTextField_interes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_interesFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_interesFocusGained(evt);
            }
        });

        jLabel5.setText("interes punitorio %");

        jLabel6.setText("interes moratorio %");

        jTextField_comision.setText("0");
        jTextField_comision.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_comisionFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_comisionFocusGained(evt);
            }
        });

        jLabel_firmantes.setText("Agregar firmantes");

        jTextField_firmantes.setEditable(false);
        jTextField_firmantes.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_firmantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_firmantesMouseClicked(evt);
            }
        });
        jTextField_firmantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_firmantesKeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_mini.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora_mini.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable_pagares_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_pagares_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pagares_detalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_pagares_detalle);
        if (jTable_pagares_detalle.getColumnModel().getColumnCount() > 0) {
            jTable_pagares_detalle.getColumnModel().getColumn(0).setResizable(false);
            jTable_pagares_detalle.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_pagares_detalle.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable_pagares_detalle.getColumnModel().getColumn(2).setResizable(false);
            jTable_pagares_detalle.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        jTextField_id_pagare.setText("0");
        jTextField_id_pagare.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_id_pagareFocusLost(evt);
            }
        });

        jLabel8.setText("ID:");

        jLabel9.setText("Total");

        jTextField_moneda.setEditable(false);
        jTextField_moneda.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_moneda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_moneda.setText("Gs.");
        jTextField_moneda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_monedaMouseClicked(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del_mini.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_interes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_comision, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_clientes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_firmantes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_firmantes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_id_pagare, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateChooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_id_pagare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_Fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jTextField_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateChooser_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_comision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_firmantes)
                            .addComponent(jTextField_firmantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Pagares_generar().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_clientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_clientesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_clientesKeyPressed

    private void jTextField_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_clientesKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            new Pagares_cliente().setVisible(true);
        }
    }//GEN-LAST:event_jTextField_clientesKeyReleased

    private void jTextField_firmantesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_firmantesKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            new Pagares_clientes_firmantes().setVisible(true);
        }
    }//GEN-LAST:event_jTextField_firmantesKeyReleased

    private void jTextField_id_pagareFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_id_pagareFocusLost


    }//GEN-LAST:event_jTextField_id_pagareFocusLost

    private void jTable_pagares_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pagares_detalleMouseClicked
        new Pagares_opciones().setVisible(true);
    }//GEN-LAST:event_jTable_pagares_detalleMouseClicked

    private void jTextField_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_clientesMouseClicked
        new Pagares_cliente().setVisible(true);
    }//GEN-LAST:event_jTextField_clientesMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Pagares_listado().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Metodos.Pagare_nuevo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_monedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_monedaMouseClicked
        new Pagares_moneda().setVisible(true);
    }//GEN-LAST:event_jTextField_monedaMouseClicked

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.id_pagare = Integer.parseInt(jTextField_id_pagare.getText());
            Metodos.Pagare_buscar2();
        }
    }//GEN-LAST:event_jPanel1KeyReleased

    private void jDateChooser_FechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_FechaMouseClicked
        //Metodos.Pagares_update_fecha();
    }//GEN-LAST:event_jDateChooser_FechaMouseClicked

    private void jDateChooser_FechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser_FechaFocusLost

    }//GEN-LAST:event_jDateChooser_FechaFocusLost

    private void jDateChooser_FechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_FechaMouseExited

    }//GEN-LAST:event_jDateChooser_FechaMouseExited

    private void jDateChooser_FechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_FechaMousePressed

    }//GEN-LAST:event_jDateChooser_FechaMousePressed

    private void jDateChooser_FechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_FechaPropertyChange
        Metodos.Pagares_update_fecha();
    }//GEN-LAST:event_jDateChooser_FechaPropertyChange

    private void jDateChooser_vencimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_vencimientoPropertyChange
        Metodos.Pagares_update_fecha_vencimiento();
    }//GEN-LAST:event_jDateChooser_vencimientoPropertyChange

    private void jTextField_dineroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_dineroFocusLost
        Metodos.Pagares_update_dinero();
    }//GEN-LAST:event_jTextField_dineroFocusLost

    private void jTextField_interesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_interesFocusLost
        Metodos.Pagares_update_interes_punitorio();
    }//GEN-LAST:event_jTextField_interesFocusLost

    private void jTextField_comisionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_comisionFocusLost
        Metodos.Pagares_update_interes_moratorio();
    }//GEN-LAST:event_jTextField_comisionFocusLost

    private void jTextField_firmantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_firmantesMouseClicked
        new Pagares_clientes_firmantes().setVisible(true);
    }//GEN-LAST:event_jTextField_firmantesMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Metodos.Pagares_borrar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField_interesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_interesFocusGained
        jTextField_interes.selectAll();
    }//GEN-LAST:event_jTextField_interesFocusGained

    private void jTextField_comisionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_comisionFocusGained
        jTextField_comision.selectAll();
    }//GEN-LAST:event_jTextField_comisionFocusGained

    private void jTextField_dineroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_dineroKeyReleased
        String puntitos = jTextField_dinero.getText().replace(".", "");
        puntitos = Metodos.getSepararMiles(puntitos);
        jTextField_dinero.setText(puntitos);
    }//GEN-LAST:event_jTextField_dineroKeyReleased

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
            java.util.logging.Logger.getLogger(Pagares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    public static com.toedter.calendar.JDateChooser jDateChooser_Fecha;
    public static com.toedter.calendar.JDateChooser jDateChooser_vencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabel_firmantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_pagares_detalle;
    public static javax.swing.JTextField jTextField_clientes;
    public static javax.swing.JTextField jTextField_comision;
    public static javax.swing.JTextField jTextField_dinero;
    public static javax.swing.JTextField jTextField_firmantes;
    public static javax.swing.JTextField jTextField_id_pagare;
    public static javax.swing.JTextField jTextField_interes;
    public static javax.swing.JTextField jTextField_moneda;
    // End of variables declaration//GEN-END:variables
}
