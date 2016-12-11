package FORMS;

import DEV.Metodos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Listado_de_pedidos_pendientes extends javax.swing.JFrame {

    public Listado_de_pedidos_pendientes() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Pedidos Pendientes");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Pedidos_cargar_listado();

        Timer timer = new Timer(0, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//                try {
                    Metodos.Pedidos_cargar_listado();
                   // Metodos.Pedido_interno_cargar_detalle();

//                    if (Metodos.dato == true) {
//                        Clip sonido = AudioSystem.getClip();
//                        File a = new File("c:\\beep.wav");
//                        sonido.open(AudioSystem.getAudioInputStream(a));
//                        sonido.start();
//                        Thread.sleep(1000); // 1000 milisegundos (10 segundos)
//                        sonido.close();
//                    }

//                } catch (LineUnavailableException ex) {
//                    Logger.getLogger(Listado_de_pedidos_pendientes.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(Listado_de_pedidos_pendientes.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (UnsupportedAudioFileException ex) {
//                    Logger.getLogger(Listado_de_pedidos_pendientes.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(Listado_de_pedidos_pendientes.class.getName()).log(Level.SEVERE, null, ex);
//                }

            }

        });

        timer.setDelay(10000); // delay for 30 seconds
        timer.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_pedidos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_pedidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_pedidos.setForeground(new java.awt.Color(204, 0, 0));
        jTable_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Descripcion", "Producto", "Unidades"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pedidosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_pedidos);
        if (jTable_pedidos.getColumnModel().getColumnCount() > 0) {
            jTable_pedidos.getColumnModel().getColumn(0).setResizable(false);
            jTable_pedidos.getColumnModel().getColumn(1).setResizable(false);
            jTable_pedidos.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable_pedidos.getColumnModel().getColumn(2).setResizable(false);
            jTable_pedidos.getColumnModel().getColumn(2).setPreferredWidth(400);
            jTable_pedidos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pedidos Pendientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 674, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTable_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pedidosMouseClicked
        Metodos.Pedido_interno_seleccionado();
    }//GEN-LAST:event_jTable_pedidosMouseClicked


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado_de_pedidos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Listado_de_pedidos_pendientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_pedidos;
    // End of variables declaration//GEN-END:variables
}
