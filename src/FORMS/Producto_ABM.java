package FORMS;

import DEV.Conexion;
import DEV.Metodos;
import static DEV.Metodos.Producto_Guardar;
import static DEV.Metodos.formulario_externo;
import static DEV.Metodos.getSepararMiles;
import static DEV.Metodos.ubicacion_proyecto;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Producto_ABM extends javax.swing.JFrame {

    public Producto_ABM() {

        initComponents();
        setTitle("Productos");
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jButton_borrar.setVisible(false);
        Conexion.Verificar_conexion();

        ImageIcon imagen = new ImageIcon(ubicacion_proyecto + "\\imagenes\\0.jpg");
        imagen.getImage().flush();
        Producto_ABM.jLabel_imagen.setIcon(imagen);
        Producto_Nuevo();
//        jLabel_mensaje.setVisible(false);

        if (Metodos.recargo == 0) {
            jTextField_porcentaje.setVisible(false);
            jLabel_recargo.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        producto_codigo = new javax.swing.JTextField();
        producto_nombre = new javax.swing.JTextField();
        jTextField_precio_de_compra = new javax.swing.JTextField();
        producto_precio = new javax.swing.JTextField();
        jTextField_porcentaje = new javax.swing.JTextField();
        jLabel_recargo = new javax.swing.JLabel();
        ubicacion = new javax.swing.JTextField();
        producto_stock_bajo = new javax.swing.JTextField();
        jDateChooser_vencimiento = new com.toedter.calendar.JDateChooser();
        jTextField_Tipo = new javax.swing.JTextField();
        producto_proveedor = new javax.swing.JTextField();
        jTextField_iva = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel_imagen = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_historial = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_precios = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton_borrar = new javax.swing.JButton();
        jButton_buscar = new javax.swing.JButton();

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        producto_codigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        producto_codigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        producto_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_codigoActionPerformed(evt);
            }
        });
        producto_codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                producto_codigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                producto_codigoFocusLost(evt);
            }
        });
        producto_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                producto_codigoKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_codigoKeyPressed(evt);
            }
        });

        producto_nombre.setEditable(false);
        producto_nombre.setBackground(new java.awt.Color(255, 255, 255));
        producto_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del producto o servicio (ENTER para buscar)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 255)));
        producto_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_nombreActionPerformed(evt);
            }
        });
        producto_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                producto_nombreFocusLost(evt);
            }
        });
        producto_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_nombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                producto_nombreKeyReleased(evt);
            }
        });

        jTextField_precio_de_compra.setEditable(false);
        jTextField_precio_de_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_precio_de_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_precio_de_compra.setBorder(javax.swing.BorderFactory.createTitledBorder("Pr Compra"));
        jTextField_precio_de_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_precio_de_compraActionPerformed(evt);
            }
        });
        jTextField_precio_de_compra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_precio_de_compraFocusGained(evt);
            }
        });

        producto_precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        producto_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio de venta"));
        producto_precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                producto_precioFocusGained(evt);
            }
        });
        producto_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                producto_precioKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_precioKeyPressed(evt);
            }
        });

        jTextField_porcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_porcentaje.setText("0");
        jTextField_porcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Recargo"));
        jTextField_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_porcentajeActionPerformed(evt);
            }
        });
        jTextField_porcentaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_porcentajeFocusGained(evt);
            }
        });

        jLabel_recargo.setText("% sobre el precio de la última compra");

        ubicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ubicación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 255)));
        ubicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ubicacionKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ubicacionKeyPressed(evt);
            }
        });

        producto_stock_bajo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        producto_stock_bajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Stock bajo"));
        producto_stock_bajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                producto_stock_bajoKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_stock_bajoKeyPressed(evt);
            }
        });

        jDateChooser_vencimiento.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_vencimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Vencimiento"));
        jDateChooser_vencimiento.setDateFormatString("dd/MMM/yyyy");

        jTextField_Tipo.setToolTipText("Click para buscar ");
        jTextField_Tipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rubro del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 255)));
        jTextField_Tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_TipoMouseClicked(evt);
            }
        });
        jTextField_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TipoActionPerformed(evt);
            }
        });
        jTextField_Tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_TipoKeyPressed(evt);
            }
        });

        producto_proveedor.setToolTipText("Click para buscar");
        producto_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 255)));
        producto_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto_proveedorMouseClicked(evt);
            }
        });
        producto_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_proveedorActionPerformed(evt);
            }
        });
        producto_proveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                producto_proveedorFocusGained(evt);
            }
        });
        producto_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_proveedorKeyPressed(evt);
            }
        });

        jTextField_iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_iva.setText("10");
        jTextField_iva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Impuesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 255)));
        jTextField_iva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_ivaMouseClicked(evt);
            }
        });
        jTextField_iva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ivaKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setEnabled(false);

        jLabel_imagen.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel_imagen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel_imagen.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel_imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_imagenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(producto_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(producto_nombre))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField_precio_de_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(producto_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_recargo))
                    .addComponent(ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(producto_stock_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(producto_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(producto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_recargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_precio_de_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(producto_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(producto_stock_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(producto_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Información general", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTable_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Proveedor", "Precio Unitario", "Unidades", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_historial);
        if (jTable_historial.getColumnModel().getColumnCount() > 0) {
            jTable_historial.getColumnModel().getColumn(0).setResizable(false);
            jTable_historial.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable_historial.getColumnModel().getColumn(1).setResizable(false);
            jTable_historial.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable_historial.getColumnModel().getColumn(2).setResizable(false);
            jTable_historial.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable_historial.getColumnModel().getColumn(3).setResizable(false);
            jTable_historial.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable_historial.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Historial de compras", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable_precios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Unidades ", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_precios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_preciosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_precios);
        if (jTable_precios.getColumnModel().getColumnCount() > 0) {
            jTable_precios.getColumnModel().getColumn(0).setResizable(false);
            jTable_precios.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable_precios.getColumnModel().getColumn(1).setResizable(false);
            jTable_precios.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable_precios.getColumnModel().getColumn(2).setResizable(false);
            jTable_precios.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(507, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Precios de venta", jPanel4);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton1.setMnemonic('x');
        jButton1.setToolTipText("Alt + X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton2.setMnemonic('t');
        jButton2.setToolTipText("Alt + T");
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
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_mini.png"))); // NOI18N
        jButton3.setMnemonic('n');
        jButton3.setToolTipText("Alt + N");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-4);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton_borrar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del_mini.png"))); // NOI18N
        jButton_borrar.setToolTipText("Borrar");
        jButton_borrar.setBorder(null);
        jButton_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar.setIconTextGap(-4);
        jButton_borrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrarActionPerformed(evt);
            }
        });

        jButton_buscar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton_buscar.setToolTipText("Borrar");
        jButton_buscar.setBorder(null);
        jButton_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_buscar.setIconTextGap(-4);
        jButton_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void producto_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_nombreActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//        producto_nombre.requestFocus();
//        jB_guardar.setEnabled(false);
//        producto_proveedor.setText("Varios");
    }//GEN-LAST:event_formWindowActivated

    private void producto_proveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_proveedorFocusGained

    }//GEN-LAST:event_producto_proveedorFocusGained

    private void producto_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_proveedorKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Productos_buscar_proveedores().setVisible(true);
        }
    }//GEN-LAST:event_producto_proveedorKeyPressed

    private void producto_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_nombreFocusLost
//        jTextField_precio_de_compra.requestFocus();
    }//GEN-LAST:event_producto_nombreFocusLost

    private void producto_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_nombreKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Producto_buscar().setVisible(true);
            Producto_buscar.formulario = 1;
        }
    }//GEN-LAST:event_producto_nombreKeyPressed

    private void producto_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_precioKeyPressed

    }//GEN-LAST:event_producto_precioKeyPressed

    private void producto_stock_bajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_stock_bajoKeyPressed

    }//GEN-LAST:event_producto_stock_bajoKeyPressed

    private void producto_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_codigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_producto_codigoKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void producto_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_codigoActionPerformed

    private void producto_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_proveedorActionPerformed

    private void producto_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_precioKeyReleased
        String puntitos = getSepararMiles(producto_precio.getText().replace(".", ""));
        producto_precio.setText(puntitos);

        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            Producto_Guardar();
        }
    }//GEN-LAST:event_producto_precioKeyReleased


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Metodos.Producto_Guardar();
        Producto_Nuevo();
        if (formulario_externo == 1) {
            formulario_externo = 0;
            this.setVisible(false);
            Facturacion.jT_buscador.requestFocus();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Producto_Nuevo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void producto_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_nombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            Producto_Guardar();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Producto_Nuevo();
        }
    }//GEN-LAST:event_producto_nombreKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            Producto_Guardar();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Producto_Nuevo();
        }
    }//GEN-LAST:event_formKeyReleased

    private void ubicacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ubicacionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            Producto_Guardar();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Producto_Nuevo();
        }
    }//GEN-LAST:event_ubicacionKeyReleased

    private void producto_stock_bajoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_stock_bajoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            Producto_Guardar();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Producto_Nuevo();
        }
    }//GEN-LAST:event_producto_stock_bajoKeyReleased

    private void producto_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_codigoKeyReleased

    }//GEN-LAST:event_producto_codigoKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        Metodos.id_producto = 0;
    }//GEN-LAST:event_formWindowOpened

    private void jTextField_TipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TipoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Productos_rubro_listado().setVisible(true);

        }
    }//GEN-LAST:event_jTextField_TipoKeyPressed

    private void producto_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto_proveedorMouseClicked
//        new Productos_buscar_proveedores().setVisible(true);
        //buscar_proveedor.formulario = 1;
    }//GEN-LAST:event_producto_proveedorMouseClicked

    private void jTextField_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TipoActionPerformed

    private void jTextField_TipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_TipoMouseClicked
//        new Productos_rubro_listado().setVisible(true);
    }//GEN-LAST:event_jTextField_TipoMouseClicked

    private void jTextField_ivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_ivaMouseClicked
        new Iva().setVisible(true);
    }//GEN-LAST:event_jTextField_ivaMouseClicked

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed

        if (JOptionPane.showConfirmDialog(
                rootPane, "¿Desea borrar este producto?", "AVISO",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Metodos.Productos_delete();
            jButton_borrar.setVisible(false);
        }
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void producto_precioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_precioFocusGained
        producto_precio.selectAll();
    }//GEN-LAST:event_producto_precioFocusGained

    private void jTextField_porcentajeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_porcentajeFocusGained
        jTextField_porcentaje.selectAll();
    }//GEN-LAST:event_jTextField_porcentajeFocusGained

    private void producto_codigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_codigoFocusGained
        producto_codigo.selectAll();
    }//GEN-LAST:event_producto_codigoFocusGained

    private void jLabel_imagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_imagenMouseClicked
        new Imagen_de_producto().setVisible(true);
    }//GEN-LAST:event_jLabel_imagenMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Facturacion.jT_buscador.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void producto_codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_codigoFocusLost

        if (Producto_ABM.producto_codigo.getText().length() > 0) {
            Metodos.Producto_Buscar_por_codigo_de_barras();
            producto_nombre.requestFocus();
        }
    }//GEN-LAST:event_producto_codigoFocusLost

    private void ubicacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ubicacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Productos_ubicacion_buscar().setVisible(true);

        }
    }//GEN-LAST:event_ubicacionKeyPressed

    private void jTextField_ivaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ivaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Iva().setVisible(true);
        }
    }//GEN-LAST:event_jTextField_ivaKeyPressed

    private void jTextField_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_porcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_porcentajeActionPerformed

    private void jTextField_precio_de_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_precio_de_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precio_de_compraActionPerformed

    private void jTextField_precio_de_compraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_precio_de_compraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precio_de_compraFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Metodos.id_producto != 0) {
            new Producto_precio().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Elija un producto la continuar.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable_preciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_preciosMouseClicked
        Metodos.Productos_precio_seleccionar();
        new Productos_precio_opciones().setVisible(true);
    }//GEN-LAST:event_jTable_preciosMouseClicked

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed

        new Producto_buscar().setVisible(true);
        Producto_buscar.formulario = 1;
    }//GEN-LAST:event_jButton_buscarActionPerformed

    public static void Producto_Nuevo() {
        Metodos.id_producto = 0;
        Metodos.id_ubicacion = 0;
        producto_nombre.setText("");
        producto_precio.setText("");
        ubicacion.setText("");
        producto_proveedor.setText("No especificado");
        jTextField_Tipo.setText("No especificado");
        producto_stock_bajo.setText("");
        producto_nombre.requestFocus();
        producto_codigo.setText("");
        Producto_ABM.producto_nombre.setEditable(true);
        Producto_ABM.jTextField_porcentaje.setText("0");
        Producto_ABM.jTextField_precio_de_compra.setText("0");
        jTextField_iva.setText("10");
        jButton_borrar.setVisible(false);
        producto_codigo.requestFocus();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto_ABM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Producto_ABM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton_borrar;
    public static javax.swing.JButton jButton_buscar;
    public static com.toedter.calendar.JDateChooser jDateChooser_vencimiento;
    public static javax.swing.JLabel jLabel_imagen;
    private javax.swing.JLabel jLabel_recargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable_historial;
    public static javax.swing.JTable jTable_precios;
    public static javax.swing.JTextField jTextField_Tipo;
    public static javax.swing.JTextField jTextField_iva;
    public static javax.swing.JTextField jTextField_porcentaje;
    public static javax.swing.JTextField jTextField_precio_de_compra;
    public static javax.swing.JTextField producto_codigo;
    public static javax.swing.JTextField producto_nombre;
    public static javax.swing.JTextField producto_precio;
    public static javax.swing.JTextField producto_proveedor;
    public static javax.swing.JTextField producto_stock_bajo;
    public static javax.swing.JTextField ubicacion;
    // End of variables declaration//GEN-END:variables
}
