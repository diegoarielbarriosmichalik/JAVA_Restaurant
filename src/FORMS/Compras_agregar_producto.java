package FORMS;

import DEV.Metodos;
import static DEV.Metodos.RefreshListCompras;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Compras_agregar_producto extends javax.swing.JFrame {

    public Compras_agregar_producto() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Detalle de compra");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

//        jTextField_Precio_venta.setVisible(false);
    }

    public static int id_producto = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_Unidades = new javax.swing.JTextField();
        jTextField_Precio_Unitario = new javax.swing.JTextField();
        jTextField_Total = new javax.swing.JTextField();
        jTextField_Descripcion = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_Unidades.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Unidades.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_Unidades.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Unidades.setText("0");
        jTextField_Unidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidades compradas"));
        jTextField_Unidades.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UnidadesFocusGained(evt);
            }
        });
        jTextField_Unidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_UnidadesKeyReleased(evt);
            }
        });

        jTextField_Precio_Unitario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Precio_Unitario.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_Precio_Unitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Precio_Unitario.setText("0");
        jTextField_Precio_Unitario.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio unitario"));
        jTextField_Precio_Unitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_Precio_UnitarioFocusGained(evt);
            }
        });
        jTextField_Precio_Unitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Precio_UnitarioKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Precio_UnitarioKeyPressed(evt);
            }
        });

        jTextField_Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Total.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_Total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Total.setText("0");
        jTextField_Total.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));
        jTextField_Total.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_TotalFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_TotalFocusGained(evt);
            }
        });
        jTextField_Total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TotalKeyReleased(evt);
            }
        });

        jTextField_Descripcion.setEditable(false);
        jTextField_Descripcion.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_Descripcion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Descripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción del producto"));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton4.setMnemonic('t');
        jButton4.setToolTipText("Alt + T");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton1.setMnemonic('x');
        jButton1.setToolTipText("Alt + X");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Descripcion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Precio_Unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Precio_Unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField_Unidades.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void jTextField_Precio_UnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Precio_UnitarioKeyReleased

        String totalString = jTextField_Precio_Unitario.getText();
        totalString = totalString.replace(".", "");
        totalString = DEV.Metodos.getSepararMiles(totalString);
        jTextField_Precio_Unitario.setText(totalString);

        double precio_unitario = Integer.parseInt(jTextField_Precio_Unitario.getText().replace(".", ""));
        double unidades = Double.parseDouble(jTextField_Unidades.getText().replace(",", "."));

        double total = precio_unitario * unidades;
        long total_long = Math.round(total);
        totalString = String.valueOf(total_long);

        totalString = DEV.Metodos.getSepararMiles(totalString);
        jTextField_Total.setText(totalString);


    }//GEN-LAST:event_jTextField_Precio_UnitarioKeyReleased


    private void jTextField_TotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TotalKeyReleased
        if (Metodos.isNumeric(jTextField_Precio_Unitario.getText().replace(".", ""))) {
            String totalString = jTextField_Total.getText();
            totalString = totalString.replace(".", "");
            totalString = DEV.Metodos.getSepararMiles(totalString);
            jTextField_Total.setText(totalString);
            long total = Long.valueOf(jTextField_Total.getText().replace(".", ""));
            long unidades = Long.valueOf(jTextField_Unidades.getText());
            long precio = total / unidades;
            jTextField_Precio_Unitario.setText(Metodos.getSepararMiles(String.valueOf(precio)));
        }
    }//GEN-LAST:event_jTextField_TotalKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Metodos.producto_add(jTextField_Unidades.getText(), jTextField_Precio_Unitario.getText(), jTextField_Total.getText());
        FORMS.Compras.jT_Buscar_Productos.setText("");
        FORMS.Compras.jT_Buscar_Productos.requestFocus();
        this.setVisible(false);
        RefreshListCompras();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField_Precio_UnitarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Precio_UnitarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.producto_add(jTextField_Unidades.getText(), jTextField_Precio_Unitario.getText(), jTextField_Total.getText());
            FORMS.Compras.jT_Buscar_Productos.setText("");
            FORMS.Compras.jT_Buscar_Productos.requestFocus();
            this.setVisible(false);
            RefreshListCompras();
        }
    }//GEN-LAST:event_jTextField_Precio_UnitarioKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Compras.jT_Buscar_Productos.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_UnidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UnidadesKeyReleased

        if (Metodos.isNumeric(jTextField_Precio_Unitario.getText().replace(".", ""))) {
            double precio_unitario = Integer.parseInt(jTextField_Precio_Unitario.getText().replace(".", ""));
            double unidades = Double.parseDouble(jTextField_Unidades.getText().replace(",", "."));
            double total = precio_unitario * unidades;
            long total_long = Math.round(total);
            String totalString = String.valueOf(total_long);
            totalString = DEV.Metodos.getSepararMiles(totalString);
            jTextField_Total.setText(totalString);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero");
        }
    }//GEN-LAST:event_jTextField_UnidadesKeyReleased

    private void jTextField_UnidadesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UnidadesFocusGained
        jTextField_Unidades.selectAll();
    }//GEN-LAST:event_jTextField_UnidadesFocusGained

    private void jTextField_Precio_UnitarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_Precio_UnitarioFocusGained
        jTextField_Precio_Unitario.selectAll();
    }//GEN-LAST:event_jTextField_Precio_UnitarioFocusGained

    private void jTextField_TotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TotalFocusGained
        jTextField_Total.selectAll();
    }//GEN-LAST:event_jTextField_TotalFocusGained

    private void jTextField_TotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TotalFocusLost

    }//GEN-LAST:event_jTextField_TotalFocusLost

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras_agregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Compras_agregar_producto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField_Descripcion;
    public static javax.swing.JTextField jTextField_Precio_Unitario;
    public static javax.swing.JTextField jTextField_Total;
    public static javax.swing.JTextField jTextField_Unidades;
    // End of variables declaration//GEN-END:variables
}
