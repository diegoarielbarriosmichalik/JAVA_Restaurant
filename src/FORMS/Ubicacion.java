package FORMS;

import DEV.Metodos;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Ubicacion extends javax.swing.JFrame {

    public static int formulario;

    public Ubicacion() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ubicaciones");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Ubicacion_cargar_jtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_Formulario_que_pide = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();

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

        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ubicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
            jTable_clientes.getColumnModel().getColumn(1).setPreferredWidth(230);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Formulario_que_pide)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(jL_Formulario_que_pide)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //   jL_Formulario_que_pide.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void jTable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientesMouseClicked
        Metodos.Ubicacion_editar_cargar_datos();
        Ubicacion_ABM.jButton_borrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTable_clientesMouseClicked

    private void jTable_clientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_clientesKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Ubicacion_editar_cargar_datos();
            Ubicacion_ABM.jButton_borrar.setVisible(true);
            this.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            // NO_ventas.form_cliente = 0;
            this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Ubicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Ubicacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jL_Formulario_que_pide;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_clientes;
    // End of variables declaration//GEN-END:variables
}
