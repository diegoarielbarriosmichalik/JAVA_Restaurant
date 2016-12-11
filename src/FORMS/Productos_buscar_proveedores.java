package FORMS;

import DEV.Metodos;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Productos_buscar_proveedores extends javax.swing.JFrame {

    public static int formulario;

    public Productos_buscar_proveedores() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Proveedores");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Productos_Buscar_proveedor_cargar_lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jT_Buscar_proveedor = new javax.swing.JTextField();
        jL_Formulario_que_pide = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_proveedores = new javax.swing.JTable();

        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jT_Buscar_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar proveedor"));
        jT_Buscar_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_Buscar_proveedorKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_Buscar_proveedorKeyPressed(evt);
            }
        });

        jTable_proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proveedor", "Telefono", "RUC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable_proveedoresMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_proveedoresMouseClicked(evt);
            }
        });
        jTable_proveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_proveedoresKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_proveedores);
        if (jTable_proveedores.getColumnModel().getColumnCount() > 0) {
            jTable_proveedores.getColumnModel().getColumn(0).setResizable(false);
            jTable_proveedores.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_proveedores.getColumnModel().getColumn(1).setResizable(false);
            jTable_proveedores.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable_proveedores.getColumnModel().getColumn(2).setResizable(false);
            jTable_proveedores.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Formulario_que_pide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jT_Buscar_proveedor)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jL_Formulario_que_pide))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jT_Buscar_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_Buscar_proveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_Buscar_proveedorKeyReleased
        Metodos.Productos_Buscar_proveedor_cargar_lista();
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }

    }//GEN-LAST:event_jT_Buscar_proveedorKeyReleased

    private void jT_Buscar_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_Buscar_proveedorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            jTable_proveedores.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }

    }//GEN-LAST:event_jT_Buscar_proveedorKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void jTable_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_proveedoresMouseClicked
        Metodos.Productos_Proveedor_llevar_datos();
        this.setVisible(false);
    }//GEN-LAST:event_jTable_proveedoresMouseClicked

    private void jTable_proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_proveedoresMouseEntered

    }//GEN-LAST:event_jTable_proveedoresMouseEntered

    private void jTable_proveedoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proveedoresKeyPressed

        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Productos_Proveedor_llevar_datos();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTable_proveedoresKeyPressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos_buscar_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Productos_buscar_proveedores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jL_Formulario_que_pide;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField jT_Buscar_proveedor;
    public static javax.swing.JTable jTable_proveedores;
    // End of variables declaration//GEN-END:variables
}
