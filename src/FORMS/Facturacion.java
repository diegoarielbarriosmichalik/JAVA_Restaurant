package FORMS;

import static DEV.Conexion.conexion;
import DEV.Metodos;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Facturacion extends javax.swing.JFrame {

    public Facturacion() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Facturación");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        Metodos.getFacturaMax();
        Metodos.BuscarFactura_facturacion();

        jT_buscador.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_cantidad = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jTextField_cantidad = new javax.swing.JTextField();
        jDialog_precio = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jTextField_precio = new javax.swing.JTextField();
        jDialog_numero_de_factura = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jTextField_nuevo_numero_de_factura = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton_cursor_buscar = new javax.swing.JButton();
        jButton_buscar_cliente = new javax.swing.JButton();
        jButton_precio = new javax.swing.JButton();
        jButton_cotizacion = new javax.swing.JButton();
        jT_buscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Venta_Detalle = new javax.swing.JTable();
        jTextField_factura = new javax.swing.JTextField();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jT_Cliente = new javax.swing.JTextField();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_ruc = new javax.swing.JTextField();
        jTextField_ci = new javax.swing.JTextField();
        jT_total = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_sub_total_cinco = new javax.swing.JTextField();
        jTextField_sub_total_exentas = new javax.swing.JTextField();
        Jt_pesos = new javax.swing.JTextField();
        jT_dolares = new javax.swing.JTextField();
        jT_Reales = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_sub_total_diez = new javax.swing.JTextField();
        jTextField_sub_total_cinco_iva = new javax.swing.JTextField();
        jLabel_sub_total = new javax.swing.JLabel();
        jLabel_iva = new javax.swing.JLabel();
        jTextField_sub_total_diez_iva = new javax.swing.JTextField();
        jLabel_estado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton_anular = new javax.swing.JButton();
        jCheckBox_Contado = new javax.swing.JCheckBox();
        jCheckBox_credito = new javax.swing.JCheckBox();
        jLabel_cursor_buscar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_imagen = new javax.swing.JLabel();
        jButton_unidades = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField_estado = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_cantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_cantidad.setForeground(new java.awt.Color(204, 0, 0));
        jTextField_cantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cantidadActionPerformed(evt);
            }
        });
        jTextField_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_cantidadKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cantidadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_cantidadLayout = new javax.swing.GroupLayout(jDialog_cantidad.getContentPane());
        jDialog_cantidad.getContentPane().setLayout(jDialog_cantidadLayout);
        jDialog_cantidadLayout.setHorizontalGroup(
            jDialog_cantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog_cantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog_cantidadLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog_cantidadLayout.setVerticalGroup(
            jDialog_cantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog_cantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog_cantidadLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_precio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_precio.setForeground(new java.awt.Color(204, 0, 0));
        jTextField_precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_precioActionPerformed(evt);
            }
        });
        jTextField_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_precioLayout = new javax.swing.GroupLayout(jDialog_precio.getContentPane());
        jDialog_precio.getContentPane().setLayout(jDialog_precioLayout);
        jDialog_precioLayout.setHorizontalGroup(
            jDialog_precioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog_precioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog_precioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog_precioLayout.setVerticalGroup(
            jDialog_precioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog_precioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog_precioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_nuevo_numero_de_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nuevo_numero_de_facturaActionPerformed(evt);
            }
        });
        jTextField_nuevo_numero_de_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_nuevo_numero_de_facturaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTextField_nuevo_numero_de_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_nuevo_numero_de_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_numero_de_facturaLayout = new javax.swing.GroupLayout(jDialog_numero_de_factura.getContentPane());
        jDialog_numero_de_factura.getContentPane().setLayout(jDialog_numero_de_facturaLayout);
        jDialog_numero_de_facturaLayout.setHorizontalGroup(
            jDialog_numero_de_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog_numero_de_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog_numero_de_facturaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog_numero_de_facturaLayout.setVerticalGroup(
            jDialog_numero_de_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog_numero_de_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog_numero_de_facturaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jButton_cursor_buscar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_cursor_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blanco.png"))); // NOI18N
        jButton_cursor_buscar.setMnemonic('R');
        jButton_cursor_buscar.setToolTipText("");
        jButton_cursor_buscar.setBorderPainted(false);
        jButton_cursor_buscar.setFocusPainted(false);
        jButton_cursor_buscar.setOpaque(false);
        jButton_cursor_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cursor_buscarActionPerformed(evt);
            }
        });

        jButton_buscar_cliente.setBackground(new java.awt.Color(255, 255, 255));
        jButton_buscar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blanco.png"))); // NOI18N
        jButton_buscar_cliente.setMnemonic('b');
        jButton_buscar_cliente.setToolTipText("");
        jButton_buscar_cliente.setBorderPainted(false);
        jButton_buscar_cliente.setFocusPainted(false);
        jButton_buscar_cliente.setOpaque(false);
        jButton_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_clienteActionPerformed(evt);
            }
        });

        jButton_precio.setBackground(new java.awt.Color(255, 255, 255));
        jButton_precio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blanco.png"))); // NOI18N
        jButton_precio.setMnemonic('p');
        jButton_precio.setToolTipText("");
        jButton_precio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_precio.setBorderPainted(false);
        jButton_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_precio.setFocusPainted(false);
        jButton_precio.setOpaque(false);
        jButton_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_precioActionPerformed(evt);
            }
        });

        jButton_cotizacion.setBackground(new java.awt.Color(255, 255, 255));
        jButton_cotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blanco.png"))); // NOI18N
        jButton_cotizacion.setMnemonic('z');
        jButton_cotizacion.setBorderPainted(false);
        jButton_cotizacion.setFocusPainted(false);
        jButton_cotizacion.setOpaque(false);
        jButton_cotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cotizacionActionPerformed(evt);
            }
        });

        jT_buscador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_buscador.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre o códigos de barra ( TAB para buscar )"));
        jT_buscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jT_buscadorFocusLost(evt);
            }
        });
        jT_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_buscadorKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_buscadorKeyPressed(evt);
            }
        });

        jT_Venta_Detalle.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jT_Venta_Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Unidades", "Precio Unitario", "Exentas", "5%", "10%"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Venta_Detalle.setIntercellSpacing(new java.awt.Dimension(1, 7));
        jT_Venta_Detalle.getTableHeader().setReorderingAllowed(false);
        jT_Venta_Detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_Venta_DetalleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jT_Venta_DetalleMouseEntered(evt);
            }
        });
        jT_Venta_Detalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_Venta_DetalleKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Venta_Detalle);
        if (jT_Venta_Detalle.getColumnModel().getColumnCount() > 0) {
            jT_Venta_Detalle.getColumnModel().getColumn(0).setResizable(false);
            jT_Venta_Detalle.getColumnModel().getColumn(0).setPreferredWidth(0);
            jT_Venta_Detalle.getColumnModel().getColumn(1).setResizable(false);
            jT_Venta_Detalle.getColumnModel().getColumn(1).setPreferredWidth(450);
            jT_Venta_Detalle.getColumnModel().getColumn(2).setResizable(false);
            jT_Venta_Detalle.getColumnModel().getColumn(2).setPreferredWidth(15);
            jT_Venta_Detalle.getColumnModel().getColumn(3).setResizable(false);
            jT_Venta_Detalle.getColumnModel().getColumn(3).setPreferredWidth(50);
            jT_Venta_Detalle.getColumnModel().getColumn(4).setResizable(false);
            jT_Venta_Detalle.getColumnModel().getColumn(4).setPreferredWidth(15);
            jT_Venta_Detalle.getColumnModel().getColumn(5).setResizable(false);
            jT_Venta_Detalle.getColumnModel().getColumn(5).setPreferredWidth(15);
            jT_Venta_Detalle.getColumnModel().getColumn(6).setResizable(false);
            jT_Venta_Detalle.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        jTextField_factura.setEditable(false);
        jTextField_factura.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_factura.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));
        jTextField_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_facturaMouseClicked(evt);
            }
        });

        jDateChooser_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser_fecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_fechaPropertyChange(evt);
            }
        });

        jT_Cliente.setEditable(false);
        jT_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        jT_Cliente.setText("Cliente no registrado");
        jT_Cliente.setToolTipText("Haga click aqui para cambiar el cliente");
        jT_Cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente "));
        jT_Cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jT_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_ClienteMouseClicked(evt);
            }
        });
        jT_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_ClienteActionPerformed(evt);
            }
        });

        jTextField_direccion.setEditable(false);
        jTextField_direccion.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_direccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));

        jTextField_telefono.setEditable(false);
        jTextField_telefono.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

        jTextField_ruc.setEditable(false);
        jTextField_ruc.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ruc.setBorder(javax.swing.BorderFactory.createTitledBorder("RUC"));

        jTextField_ci.setEditable(false);
        jTextField_ci.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ci.setBorder(javax.swing.BorderFactory.createTitledBorder("CI"));

        jT_total.setEditable(false);
        jT_total.setBackground(new java.awt.Color(255, 255, 255));
        jT_total.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jT_total.setForeground(new java.awt.Color(0, 153, 0));
        jT_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jT_total.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jT_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_totalActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eeuu.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arg.png"))); // NOI18N
        jLabel5.setToolTipText("");

        jTextField_sub_total_cinco.setEditable(false);
        jTextField_sub_total_cinco.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_cinco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_cinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_sub_total_exentas.setEditable(false);
        jTextField_sub_total_exentas.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_exentas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_exentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Jt_pesos.setEditable(false);
        Jt_pesos.setBackground(new java.awt.Color(255, 255, 255));
        Jt_pesos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jT_dolares.setEditable(false);
        jT_dolares.setBackground(new java.awt.Color(255, 255, 255));
        jT_dolares.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jT_Reales.setEditable(false);
        jT_Reales.setBackground(new java.awt.Color(255, 255, 255));
        jT_Reales.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/brasil.png"))); // NOI18N

        jTextField_sub_total_diez.setEditable(false);
        jTextField_sub_total_diez.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_diez.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_diez.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_sub_total_cinco_iva.setEditable(false);
        jTextField_sub_total_cinco_iva.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_cinco_iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_cinco_iva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_sub_total.setText("Sub Totales");

        jLabel_iva.setText("I.V.A.");

        jTextField_sub_total_diez_iva.setEditable(false);
        jTextField_sub_total_diez_iva.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_diez_iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_diez_iva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_estado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_estado.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_estado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_mini.png"))); // NOI18N
        jButton2.setMnemonic('N');
        jButton2.setToolTipText("Alt + N (Nueva venta)");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-4);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton3.setMnemonic('T');
        jButton3.setToolTipText("Alt + T");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-4);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton8.setMnemonic('s');
        jButton8.setToolTipText("Alt + S (Buscar ventas)");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton_anular.setBackground(new java.awt.Color(255, 255, 255));
        jButton_anular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del_mini.png"))); // NOI18N
        jButton_anular.setMnemonic('a');
        jButton_anular.setToolTipText("Alt + A (Anular venta)");
        jButton_anular.setBorder(null);
        jButton_anular.setBorderPainted(false);
        jButton_anular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_anular.setIconTextGap(-4);
        jButton_anular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_anularActionPerformed(evt);
            }
        });

        jCheckBox_Contado.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_Contado.setText("Contado");
        jCheckBox_Contado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_ContadoMouseClicked(evt);
            }
        });
        jCheckBox_Contado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ContadoActionPerformed(evt);
            }
        });

        jCheckBox_credito.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_credito.setText("Credito");
        jCheckBox_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_creditoActionPerformed(evt);
            }
        });

        jLabel_cursor_buscar.setDisplayedMnemonic('R');
        jLabel_cursor_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cursor_buscar.setText("Buscar:");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_imagen.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_imagen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_imagen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel_imagen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel_imagen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton_unidades.setBackground(new java.awt.Color(255, 255, 255));
        jButton_unidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blanco.png"))); // NOI18N
        jButton_unidades.setMnemonic('u');
        jButton_unidades.setToolTipText("");
        jButton_unidades.setBorderPainted(false);
        jButton_unidades.setFocusPainted(false);
        jButton_unidades.setOpaque(false);
        jButton_unidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_unidadesActionPerformed(evt);
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

        jButton7.setMnemonic('h');
        jButton7.setText("Ayuda");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField_estado.setEditable(false);
        jTextField_estado.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_estado.setForeground(new java.awt.Color(204, 0, 0));
        jTextField_estado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));
        jTextField_estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_estadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Jt_pesos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jT_dolares, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jT_Reales, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel_iva)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_sub_total_cinco_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_sub_total_diez_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jT_total, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel_sub_total)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_sub_total_exentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_sub_total_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_sub_total_diez, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jT_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_Contado)
                                        .addComponent(jCheckBox_credito))
                                    .addGap(463, 463, 463)
                                    .addComponent(jLabel_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jT_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextField_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jLabel_cursor_buscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_buscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_cursor_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton_unidades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox_Contado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox_credito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jT_buscador)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_cursor_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_buscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_cursor_buscar)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Jt_pesos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jT_dolares, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jT_Reales, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField_sub_total_exentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_sub_total_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_sub_total_diez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_sub_total))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField_sub_total_cinco_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_sub_total_diez_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_iva))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jT_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_buscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jT_buscadorFocusLost
        Metodos.Venta_guardar_facturacion();
    }//GEN-LAST:event_jT_buscadorFocusLost

    private void jT_buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_buscadorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            Metodos.facturacion_terminar();
        }
    }//GEN-LAST:event_jT_buscadorKeyPressed

    private void jT_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_buscadorKeyReleased

    }//GEN-LAST:event_jT_buscadorKeyReleased

    private void jT_Venta_DetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_Venta_DetalleMouseClicked

        if (evt.getClickCount() == 1) {
            DefaultTableModel tm = (DefaultTableModel) jT_Venta_Detalle.getModel();
            Metodos.id_cuenta_detalle_facturacion = Integer.parseInt(String.valueOf(tm.getValueAt(jT_Venta_Detalle.getSelectedRow(), 0)));
            Metodos.id_producto = Integer.parseInt(DEV.Metodos.Producto_id_producto_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion));
            Metodos.Facturacion_mostrar_miniatura_producto();
        }
        if (evt.getClickCount() == 2) {
            Metodos.Facturacion_detalle();
        }

    }//GEN-LAST:event_jT_Venta_DetalleMouseClicked

    private void jT_Venta_DetalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_Venta_DetalleMouseEntered
    }//GEN-LAST:event_jT_Venta_DetalleMouseEntered

    private void jT_Venta_DetalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_Venta_DetalleKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Facturacion_detalle_modificar();
        }
    }//GEN-LAST:event_jT_Venta_DetalleKeyPressed

    private void jTextField_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_facturaMouseClicked
        Jdialog_Numero_de_factura();
    }//GEN-LAST:event_jTextField_facturaMouseClicked

    private void jDateChooser_fechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_fechaPropertyChange
        Metodos.Facturacion_update_fecha();
    }//GEN-LAST:event_jDateChooser_fechaPropertyChange

    private void jT_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_ClienteMouseClicked
//        new Ventas_buscar_cliente().setVisible(true);
    }//GEN-LAST:event_jT_ClienteMouseClicked

    private void jT_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_ClienteActionPerformed
    }//GEN-LAST:event_jT_ClienteActionPerformed

    private void jT_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_totalActionPerformed
    }//GEN-LAST:event_jT_totalActionPerformed

    private void jButton_unidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_unidadesActionPerformed
        Jdialog_Cantidad();
    }//GEN-LAST:event_jButton_unidadesActionPerformed

    public void Jdialog_Cantidad() {
        jTextField_cantidad.setText("1");
        jDialog_cantidad.setVisible(true);
        jDialog_cantidad.setTitle("Unidades");
        jDialog_cantidad.setSize(220, 90);
        jDialog_cantidad.setLocationRelativeTo(null);
        jDialog_cantidad.setAlwaysOnTop(true);
        jDialog_cantidad.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_cantidad.selectAll();
    }

    public void Jdialog_precio() {
        jTextField_precio.setText("");
        jDialog_precio.setVisible(true);
        jDialog_precio.setTitle("Precio");
        jDialog_precio.setSize(220, 90);
        jDialog_precio.setLocationRelativeTo(null);
        jDialog_precio.setAlwaysOnTop(true);
        jDialog_precio.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

    }

    public void Jdialog_Numero_de_factura() {
        jTextField_nuevo_numero_de_factura.setText("");
        jDialog_numero_de_factura.setVisible(true);
        jDialog_numero_de_factura.setTitle("Numero de Factura");
        jDialog_numero_de_factura.setSize(220, 90);
        jDialog_numero_de_factura.setLocationRelativeTo(null);
        jDialog_numero_de_factura.setAlwaysOnTop(true);
        jDialog_numero_de_factura.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    private void jButton_cotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cotizacionActionPerformed
        new Cotizacion().setVisible(true);
    }//GEN-LAST:event_jButton_cotizacionActionPerformed

    private void jButton_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_clienteActionPerformed
        new Ventas_buscar_cliente().setVisible(true);
    }//GEN-LAST:event_jButton_buscar_clienteActionPerformed

    private void jButton_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_precioActionPerformed
        Jdialog_precio();
    }//GEN-LAST:event_jButton_precioActionPerformed

    private void jTextField_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cantidadActionPerformed
    }//GEN-LAST:event_jTextField_cantidadActionPerformed

    private void jTextField_cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cantidadKeyPressed
    }//GEN-LAST:event_jTextField_cantidadKeyPressed

    private void jTextField_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cantidadKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            Facturacion.jT_buscador.requestFocus();
            jDialog_cantidad.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            jDialog_cantidad.setVisible(false);
            Metodos.Ventas_actualizar_cantidad();
            Facturacion.jT_buscador.requestFocus();
        }
    }//GEN-LAST:event_jTextField_cantidadKeyReleased

    private void jTextField_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precioActionPerformed

    private void jTextField_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyReleased

        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_precio.setVisible(false);
            Facturacion.jT_buscador.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            jDialog_precio.setVisible(false);
            Metodos.Ventas_actualizar_precio();
        }

        String puntitos = Metodos.getSepararMiles(jTextField_precio.getText().replace(".", ""));

        jTextField_precio.setText(puntitos);
        //        jTextField_precio.selectAll();
    }//GEN-LAST:event_jTextField_precioKeyReleased

    private void jTextField_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precioKeyPressed

    private void jTextField_nuevo_numero_de_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nuevo_numero_de_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nuevo_numero_de_facturaActionPerformed

    private void jTextField_nuevo_numero_de_facturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nuevo_numero_de_facturaKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_numero_de_factura.setVisible(false);
            Facturacion.jT_buscador.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            jDialog_numero_de_factura.setVisible(false);
            Metodos.Ventas_actualizar_numero_de_factura();
        }
    }//GEN-LAST:event_jTextField_nuevo_numero_de_facturaKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DEV.Metodos.ventaNuevo();
        jT_buscador.setText("");
        jT_buscador.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        this.setVisible(false);
        Metodos.facturacion_terminar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new Facturacion_listado().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_anularActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea anular esta factura?", "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Metodos.Factura_anular();
        }
    }//GEN-LAST:event_jButton_anularActionPerformed

    private void jCheckBox_ContadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_ContadoMouseClicked
        try {
            PreparedStatement Update = conexion.prepareStatement(""
                    + "UPDATE cuenta SET tipo='1' "
                    + "WHERE id_cuenta ='" + Metodos.id_cuenta + "'");
            Update.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el tipo de venta: " + ex);
        }
    }//GEN-LAST:event_jCheckBox_ContadoMouseClicked

    private void jCheckBox_ContadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ContadoActionPerformed
        Metodos.Ventas_update_contado();
    }//GEN-LAST:event_jCheckBox_ContadoActionPerformed

    private void jCheckBox_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_creditoActionPerformed
        Metodos.Ventas_update_credito();
    }//GEN-LAST:event_jCheckBox_creditoActionPerformed

    private void jButton_cursor_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cursor_buscarActionPerformed
        jT_buscador.requestFocus();
    }//GEN-LAST:event_jButton_cursor_buscarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Comandos_de_ayuda().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_estadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_estadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_estadoMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Facturacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Jt_pesos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton_anular;
    private javax.swing.JButton jButton_buscar_cliente;
    private javax.swing.JButton jButton_cotizacion;
    private javax.swing.JButton jButton_cursor_buscar;
    private javax.swing.JButton jButton_precio;
    private javax.swing.JButton jButton_unidades;
    public static javax.swing.JCheckBox jCheckBox_Contado;
    public static javax.swing.JCheckBox jCheckBox_credito;
    public static com.toedter.calendar.JDateChooser jDateChooser_fecha;
    public static javax.swing.JDialog jDialog_cantidad;
    private javax.swing.JDialog jDialog_numero_de_factura;
    private javax.swing.JDialog jDialog_precio;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_cursor_buscar;
    public static javax.swing.JLabel jLabel_estado;
    public static javax.swing.JLabel jLabel_imagen;
    private javax.swing.JLabel jLabel_iva;
    private javax.swing.JLabel jLabel_sub_total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jT_Cliente;
    public static javax.swing.JTextField jT_Reales;
    public static javax.swing.JTable jT_Venta_Detalle;
    public static javax.swing.JTextField jT_buscador;
    public static javax.swing.JTextField jT_dolares;
    public static javax.swing.JTextField jT_total;
    public static javax.swing.JTextField jTextField_cantidad;
    public static javax.swing.JTextField jTextField_ci;
    public static javax.swing.JTextField jTextField_direccion;
    public static javax.swing.JTextField jTextField_estado;
    public static javax.swing.JTextField jTextField_factura;
    public static javax.swing.JTextField jTextField_nuevo_numero_de_factura;
    public static javax.swing.JTextField jTextField_precio;
    public static javax.swing.JTextField jTextField_ruc;
    public static javax.swing.JTextField jTextField_sub_total_cinco;
    public static javax.swing.JTextField jTextField_sub_total_cinco_iva;
    public static javax.swing.JTextField jTextField_sub_total_diez;
    public static javax.swing.JTextField jTextField_sub_total_diez_iva;
    public static javax.swing.JTextField jTextField_sub_total_exentas;
    public static javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
