package FORMS;

import DEV.Metodos;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Pedidos_agregar_producto extends javax.swing.JFrame {

    public Pedidos_agregar_producto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Detalle del Pedido");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public static int id_producto = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_Unidades = new javax.swing.JTextField();
        jTextField_Precio_Unitario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Descripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_Unidades.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Unidades.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_Unidades.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Unidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_UnidadesKeyReleased(evt);
            }
        });

        jTextField_Precio_Unitario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Precio_Unitario.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_Precio_Unitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Precio_Unitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Precio_UnitarioKeyReleased(evt);
            }
        });

        jLabel1.setText("Unidades");

        jLabel2.setText("Precio Unitario");

        jTextField_Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Total.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_Total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TotalKeyReleased(evt);
            }
        });

        jLabel3.setText("Total");

        jTextField_Descripcion.setEditable(false);
        jTextField_Descripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Descripcion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setText("Descripcion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Total)
                    .addComponent(jTextField_Precio_Unitario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Descripcion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Precio_Unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField_Unidades.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void jTextField_Precio_UnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Precio_UnitarioKeyReleased
        Hacer_calculo();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Pedidos_guardar_productos_en_detalle();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_Precio_UnitarioKeyReleased


    private void jTextField_TotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TotalKeyReleased

        Hacer_calculo();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Pedidos_guardar_productos_en_detalle();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_TotalKeyReleased

    public static void Hacer_calculo() {
        long precio = 0;
        long cantidad = 0;
        long total = 0;

        if (jTextField_Precio_Unitario.getText().length() > 0) {
            precio = Long.parseLong(jTextField_Precio_Unitario.getText());
        }
        if (jTextField_Unidades.getText().length() > 0) {
            cantidad = Long.parseLong(jTextField_Unidades.getText());
        }

        total = precio * cantidad;
        String totalString = String.valueOf(total);
        totalString = DEV.Metodos.getSepararMiles(totalString);
        jTextField_Total.setText(totalString);

    }


    private void jTextField_UnidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UnidadesKeyReleased
        Hacer_calculo();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Pedidos_guardar_productos_en_detalle();
            this.setVisible(false);
            Pedidos.jTextField_producto.setText("");
        }

    }//GEN-LAST:event_jTextField_UnidadesKeyReleased

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
            java.util.logging.Logger.getLogger(Pedidos_agregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos_agregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos_agregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos_agregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos_agregar_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField_Descripcion;
    public static javax.swing.JTextField jTextField_Precio_Unitario;
    public static javax.swing.JTextField jTextField_Total;
    public static javax.swing.JTextField jTextField_Unidades;
    // End of variables declaration//GEN-END:variables
}
