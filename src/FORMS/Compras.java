package FORMS;

import DEV.Conexion;
import DEV.Metodos;
import static DEV.Metodos.Factura_de_compra_Max;
import java.awt.event.KeyEvent;
import java.sql.ResultSetMetaData;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compras extends javax.swing.JFrame {

    String hoy = null;
    public static int id_factura = Factura_de_compra_Max();
    public static ResultSetMetaData rsm;
    public static DefaultTableModel dtm;
    public static int max = 0;

    public Compras() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Compras");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Conexion.Verificar_conexion();
        hoy = DEV.Metodos.getHoy_format2();
        jButton_borrar.setVisible(false);
        jT_Proveedor.requestFocus();
        Date fecha = new Date();
        jDateChooser.setDate(fecha);
        Metodos.Compras_clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jT_factura_nro = new javax.swing.JTextField();
        jT_Proveedor = new javax.swing.JTextField();
        jT_Buscar_Productos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jL_Total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton_borrar = new javax.swing.JButton();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_ruc = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton_guardar = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Facturación");

        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jT_factura_nro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_factura_nro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura Número", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        jT_factura_nro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_factura_nroMouseClicked(evt);
            }
        });
        jT_factura_nro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_factura_nroActionPerformed(evt);
            }
        });
        jT_factura_nro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jT_factura_nroFocusLost(evt);
            }
        });
        jT_factura_nro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_factura_nroKeyPressed(evt);
            }
        });

        jT_Proveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_Proveedor.setToolTipText("");
        jT_Proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor (enter para buscar)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 255)));
        jT_Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_ProveedorMouseClicked(evt);
            }
        });
        jT_Proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_ProveedorKeyPressed(evt);
            }
        });

        jT_Buscar_Productos.setEditable(false);
        jT_Buscar_Productos.setBackground(new java.awt.Color(255, 255, 255));
        jT_Buscar_Productos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto (enter para buscar)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 255)));
        jT_Buscar_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Buscar_ProductosActionPerformed(evt);
            }
        });
        jT_Buscar_Productos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jT_Buscar_ProductosFocusLost(evt);
            }
        });
        jT_Buscar_Productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_Buscar_ProductosKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_Buscar_ProductosKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción", "Unidades", "Precio Unitario", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(450);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        jL_Total.setBackground(new java.awt.Color(255, 255, 255));
        jL_Total.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jL_Total.setForeground(new java.awt.Color(0, 102, 0));
        jL_Total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Total.setText("0");
        jL_Total.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jL_Total.setOpaque(true);
        jL_Total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jL_TotalKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_mini.png"))); // NOI18N
        jButton1.setMnemonic('n');
        jButton1.setToolTipText("Alt + N");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserFocusLost(evt);
            }
        });
        jDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserPropertyChange(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton2.setMnemonic('s');
        jButton2.setToolTipText("Alt + S");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del_mini.png"))); // NOI18N
        jButton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrarActionPerformed(evt);
            }
        });

        jTextField_direccion.setEditable(false);
        jTextField_direccion.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_direccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));

        jTextField_telefono.setEditable(false);
        jTextField_telefono.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono"));

        jTextField_ruc.setEditable(false);
        jTextField_ruc.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ruc.setBorder(javax.swing.BorderFactory.createTitledBorder("RUC"));
        jTextField_ruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_rucActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton3.setMnemonic('x');
        jButton3.setToolTipText("Alt + X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jT_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jT_factura_nro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jT_Buscar_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jL_Total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_factura_nro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jT_Buscar_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jL_Total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void jT_Buscar_ProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_Buscar_ProductosKeyReleased

    }//GEN-LAST:event_jT_Buscar_ProductosKeyReleased

    private void jL_TotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jL_TotalKeyPressed

    }//GEN-LAST:event_jL_TotalKeyPressed

    private void jT_factura_nroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_factura_nroKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
//            jButton_guardar.requestFocus();
//        }
    }//GEN-LAST:event_jT_factura_nroKeyPressed

    private void jT_ProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_ProveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F6) {
            Proveedor_buscar jFrame = new Proveedor_buscar();
            jFrame.setVisible(true);
            Proveedor_buscar.jL_Formulario_que_pide.setText("Compras");
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new FORMS.Compras_proveedor_buscar().setVisible(true);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jT_ProveedorKeyPressed


    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    }//GEN-LAST:event_formWindowGainedFocus


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened


    private void jT_factura_nroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jT_factura_nroFocusLost

        //jT_Buscar_Productos.requestFocus();
    }//GEN-LAST:event_jT_factura_nroFocusLost

    private void jT_factura_nroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_factura_nroActionPerformed

    }//GEN-LAST:event_jT_factura_nroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Metodos.Compras_clear();
        // Nueva_Compra();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jT_ProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_ProveedorMouseClicked
//        new FORMS.Compras_proveedor_buscar().setVisible(true);
    }//GEN-LAST:event_jT_ProveedorMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        new Compras_detalle_opciones().setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jT_Buscar_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Buscar_ProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Buscar_ProductosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Compras_listado().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea anular esta factura?", "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Metodos.Compras_update_borrar();
        }
        Metodos.Compras_clear();
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jT_factura_nroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_factura_nroMouseClicked

    }//GEN-LAST:event_jT_factura_nroMouseClicked

    private void jTextField_rucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_rucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_rucActionPerformed

    private void jT_Buscar_ProductosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jT_Buscar_ProductosFocusLost
        if (jT_Buscar_Productos.getText().length() > 0) {
            new buscar_productos_en_compras().setVisible(true);
            buscar_productos_en_compras.jTextField_buscar.setText(jT_Buscar_Productos.getText());
        }
    }//GEN-LAST:event_jT_Buscar_ProductosFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jT_Buscar_ProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_Buscar_ProductosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new buscar_productos_en_compras().setVisible(true);
        }

    }//GEN-LAST:event_jT_Buscar_ProductosKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void jDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserPropertyChange

    }//GEN-LAST:event_jDateChooserPropertyChange

    private void jDateChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserFocusLost
//        Metodos.Compras_fecha_actualizar();
    }//GEN-LAST:event_jDateChooserFocusLost

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        Metodos.Compras_Verificar_Numero_de_Factura();
    }//GEN-LAST:event_jButton_guardarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            new Compras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_guardar;
    public static com.toedter.calendar.JDateChooser jDateChooser;
    public static javax.swing.JLabel jL_Total;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jT_Buscar_Productos;
    public static javax.swing.JTextField jT_Proveedor;
    public static javax.swing.JTextField jT_factura_nro;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField_direccion;
    public static javax.swing.JTextField jTextField_ruc;
    public static javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
