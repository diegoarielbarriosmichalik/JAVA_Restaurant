package FORMS;

import DEV.Metodos;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Producto_precio extends javax.swing.JFrame {

    public Producto_precio() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Precios");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_unidades.requestFocus();
        Metodos.id_rubro = 0;

        //  jButton_borrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_unidades = new javax.swing.JTextField();
        jTextField_precio = new javax.swing.JTextField();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextField_unidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidades"));
        jTextField_unidades.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_unidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_unidadesKeyPressed(evt);
            }
        });

        jTextField_precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        jTextField_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jTextField_unidades)
                    .addComponent(jTextField_precio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_unidadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_unidadesKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Producto_precio_guardar(jTextField_unidades.getText(), jTextField_precio.getText());
            Metodos.Productos_precio_cargar_lista();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_unidadesKeyPressed

    private void jTextField_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precioKeyPressed

    private void jTextField_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Producto_precio_guardar(jTextField_unidades.getText(), jTextField_precio.getText());
            Metodos.Productos_precio_cargar_lista();
            this.setVisible(false);
        }

        jTextField_precio.setText(Metodos.getSepararMiles(jTextField_precio.getText().replace(".", "")));
    }//GEN-LAST:event_jTextField_precioKeyReleased

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto_precio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Producto_precio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField_precio;
    public static javax.swing.JTextField jTextField_unidades;
    // End of variables declaration//GEN-END:variables
}
