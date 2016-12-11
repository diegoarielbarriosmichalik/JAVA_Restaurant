package FORMS;

import DEV.Conexion;
import static DEV.Conexion.conexion;
import DEV.Metodos;
import static DEV.Metodos.ubicacion_proyecto;
import static DEV.Metodos.util_Date_to_sql_date;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NO_ventas extends javax.swing.JFrame {

    public NO_ventas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ventas");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jCheckBox_Libreta.setVisible(false);

        Conexion.Verificar_conexion();

        Metodos.getFacturaMax();
        Metodos.BuscarFactura();

    }

    public static int form_cant = 0;
    public static int form_cotizacion = 0;
    public static int form_precio = 0;
    public static int form_cliente = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jT_buscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Venta_Detalle = new javax.swing.JTable();
        jT_Cliente = new javax.swing.JTextField();
        jT_total = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton_anterior = new javax.swing.JButton();
        jButton_siguiente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jT_Reales = new javax.swing.JTextField();
        jT_dolares = new javax.swing.JTextField();
        Jt_pesos = new javax.swing.JTextField();
        jCheckBox_Contado = new javax.swing.JCheckBox();
        jCheckBox_Libreta = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jTextField_factura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton_anular = new javax.swing.JButton();
        jLabel_estado = new javax.swing.JLabel();
        jCheckBox_credito = new javax.swing.JCheckBox();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_ruc = new javax.swing.JTextField();
        jTextField_ci = new javax.swing.JTextField();
        jTextField_id = new javax.swing.JTextField();
        jTextField_sub_total_exentas = new javax.swing.JTextField();
        jTextField_sub_total_cinco = new javax.swing.JTextField();
        jTextField_sub_total_diez = new javax.swing.JTextField();
        jLabel_sub_total = new javax.swing.JLabel();
        jTextField_sub_total_cinco_iva = new javax.swing.JTextField();
        jTextField_sub_total_diez_iva = new javax.swing.JTextField();
        jLabel_iva = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_imagen = new javax.swing.JLabel();

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cantidadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_cantidadKeyReleased(evt);
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyPressed(evt);
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

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jT_buscador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_buscador.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar producto por nombre o códigos de barra"));
        jT_buscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jT_buscadorFocusLost(evt);
            }
        });
        jT_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_buscadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_buscadorKeyReleased(evt);
            }
        });

        jT_Venta_Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Descripcion", "Unidades", "Precio Unitario", "Exentas", "5%", "10%"
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
        jT_Venta_Detalle.getTableHeader().setReorderingAllowed(false);
        jT_Venta_Detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jT_Venta_DetalleMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_Venta_DetalleMouseClicked(evt);
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

        jT_Cliente.setEditable(false);
        jT_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        jT_Cliente.setText("Cliente no registrado");
        jT_Cliente.setToolTipText("Haga click aqui para cambiar el cliente");
        jT_Cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
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

        jButton_anterior.setBackground(new java.awt.Color(153, 153, 255));
        jButton_anterior.setText("Anterior");
        jButton_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_anteriorActionPerformed(evt);
            }
        });

        jButton_siguiente.setBackground(new java.awt.Color(153, 153, 255));
        jButton_siguiente.setText("Siguiente");
        jButton_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_siguienteActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/argentina.png"))); // NOI18N
        jLabel5.setToolTipText("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eeuu.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/brasil.png"))); // NOI18N

        jT_Reales.setEditable(false);
        jT_Reales.setBackground(new java.awt.Color(255, 255, 255));
        jT_Reales.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jT_dolares.setEditable(false);
        jT_dolares.setBackground(new java.awt.Color(255, 255, 255));
        jT_dolares.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Jt_pesos.setEditable(false);
        Jt_pesos.setBackground(new java.awt.Color(255, 255, 255));
        Jt_pesos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

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

        jCheckBox_Libreta.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_Libreta.setText("Libreta");
        jCheckBox_Libreta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_LibretaMouseClicked(evt);
            }
        });

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

        jTextField_factura.setEditable(false);
        jTextField_factura.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_factura.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));
        jTextField_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_facturaMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cotización");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser_fecha.setDateFormatString("dd/MMM/yyyy");
        jDateChooser_fecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_fechaPropertyChange(evt);
            }
        });

        jButton4.setMnemonic('b');
        jButton4.setText("Buscar Cliente");
        jButton4.setToolTipText("ALT + B");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setMnemonic('u');
        jButton5.setText("Modf. unidades");
        jButton5.setToolTipText("ALT + U");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setMnemonic('p');
        jButton6.setText("Modif. precio");
        jButton6.setToolTipText("ALT + P");
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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

        jLabel_estado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_estado.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_estado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jCheckBox_credito.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_credito.setText("Credito");
        jCheckBox_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_creditoActionPerformed(evt);
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

        jTextField_id.setEditable(false);
        jTextField_id.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_id.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        jTextField_sub_total_exentas.setEditable(false);
        jTextField_sub_total_exentas.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_exentas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_exentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_sub_total_cinco.setEditable(false);
        jTextField_sub_total_cinco.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_cinco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_cinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_sub_total_diez.setEditable(false);
        jTextField_sub_total_diez.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_diez.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_diez.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_sub_total.setText("Sub Totales");

        jTextField_sub_total_cinco_iva.setEditable(false);
        jTextField_sub_total_cinco_iva.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_cinco_iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_cinco_iva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_sub_total_diez_iva.setEditable(false);
        jTextField_sub_total_diez_iva.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sub_total_diez_iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_sub_total_diez_iva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_iva.setText("I.V.A.");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
            .addComponent(jLabel_imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jButton_anular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jT_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox_Contado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox_credito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox_Libreta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addComponent(jT_Cliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_anterior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Jt_pesos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jT_Reales, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jT_dolares, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_total, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_sub_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_sub_total_exentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_sub_total_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_sub_total_diez, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_iva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_sub_total_cinco_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_sub_total_diez_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_anterior)
                        .addComponent(jButton_siguiente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jT_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jT_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox_Contado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox_credito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox_Libreta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(1, 1, 1)
                        .addComponent(jButton3)
                        .addGap(1, 1, 1)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jt_pesos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jT_dolares, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jT_Reales, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jT_total))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jButton_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_siguienteActionPerformed
        DEV.Metodos.id_cuenta++;
        DEV.Metodos.BuscarFactura();
        jT_buscador.requestFocus();

    }//GEN-LAST:event_jButton_siguienteActionPerformed

    private void jButton_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_anteriorActionPerformed
        DEV.Metodos.id_cuenta--;
        DEV.Metodos.BuscarFactura();
        jT_buscador.requestFocus();
    }//GEN-LAST:event_jButton_anteriorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            System.err.println(Metodos.id_cuenta);

            PreparedStatement Update3 = conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "set id_estado = '10' "
                    + "WHERE id_cuenta = '" + Metodos.id_cuenta + "'");
            Update3.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex);
        }

        new Facturacion_Terminar().setVisible(true);
        Facturacion_Terminar.jTextField_ingresar_dinero.requestFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jT_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_buscadorKeyReleased

    }//GEN-LAST:event_jT_buscadorKeyReleased

    private void jT_buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_buscadorKeyPressed
    }//GEN-LAST:event_jT_buscadorKeyPressed

    private void jCheckBox_LibretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_LibretaMouseClicked

        try {
            PreparedStatement Update = conexion.prepareStatement("UPDATE cuenta SET tipo='2' WHERE id_cuenta ='" + Metodos.id_cuenta + "'");
            Update.executeUpdate();
            jCheckBox_Contado.setSelected(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el tipo de venta: " + ex);
        }

    }//GEN-LAST:event_jCheckBox_LibretaMouseClicked

    private void jCheckBox_ContadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_ContadoMouseClicked
        try {
            PreparedStatement Update = conexion.prepareStatement("UPDATE cuenta SET tipo='1' WHERE id_cuenta ='" + Metodos.id_cuenta + "'");
            Update.executeUpdate();
            jCheckBox_Libreta.setSelected(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el tipo de venta: " + ex);
        }
    }//GEN-LAST:event_jCheckBox_ContadoMouseClicked

    private void jT_buscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jT_buscadorFocusLost
//        Venta_guardar();
//        jT_buscador.requestFocus();
//        jT_buscador.selectAll();
    }//GEN-LAST:event_jT_buscadorFocusLost

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jT_Venta_DetalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_Venta_DetalleKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {

                boolean facturada = false;

                DefaultTableModel tm = (DefaultTableModel) jT_Venta_Detalle.getModel();
                Metodos.id_cuenta_detalle = Integer.parseInt(String.valueOf(tm.getValueAt(jT_Venta_Detalle.getSelectedRow(), 0)));

                Statement ST_Productos = DEV.Conexion.conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery(""
                        + "SELECT * FROM cuenta "
                        + "where id_cuenta = '" + Metodos.id_cuenta + "' and id_estado = '10'");
                if (RS_Productos.next()) {
                    facturada = true;
                }

                if (facturada == false) {

                    new Ventas_modificar_precio_cantidad().setVisible(true);
                    String unidades = String.valueOf(tm.getValueAt(jT_Venta_Detalle.getSelectedRow(), 2));
                    String nombre = DEV.Metodos.Producto_nombre_x_id_venta_detalle(Metodos.id_cuenta_detalle);
                    Metodos.id_producto = Integer.parseInt(DEV.Metodos.Producto_id_producto_x_id_venta_detalle(Metodos.id_cuenta_detalle));
                    String precio = DEV.Metodos.Producto_precio_x_id_venta_detalle(Metodos.id_cuenta_detalle);

//                Ventas_modificar_precio_cantidad.id_producto = id_producto;
//                Ventas_modificar_precio_cantidad.id_cuenta_detalle = String.valueOf(Metodos.id_cuenta_detalle);
                    Ventas_modificar_precio_cantidad.jTextField_Producto.setText(nombre);
                    Ventas_modificar_precio_cantidad.jTextField_Precio_Unitario.setText(precio);
                    Ventas_modificar_precio_cantidad.jTextField_Unidades.setText(unidades);
                    Ventas_modificar_precio_cantidad.jTextField_Unidades.select(0, 10);
                } else {
                    JOptionPane.showMessageDialog(null, "La factura se encuentra contabilizada, no se puede modificar.");
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }//GEN-LAST:event_jT_Venta_DetalleKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DEV.Metodos.ventaNuevo();
        jT_buscador.setText("");
        jT_buscador.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jT_Venta_DetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_Venta_DetalleMouseClicked

        if (evt.getClickCount() == 1) {
            DefaultTableModel tm = (DefaultTableModel) jT_Venta_Detalle.getModel();
            Metodos.id_cuenta_detalle = Integer.parseInt(String.valueOf(tm.getValueAt(jT_Venta_Detalle.getSelectedRow(), 0)));
            Metodos.id_producto = Integer.parseInt(DEV.Metodos.Producto_id_producto_x_id_venta_detalle(Metodos.id_cuenta_detalle));
            Metodos.Ventas_mostrar_miniatura_producto();
        }
        if (evt.getClickCount() == 2) {

            try {

                boolean facturada = false;

                DefaultTableModel tm = (DefaultTableModel) jT_Venta_Detalle.getModel();
                Metodos.id_cuenta_detalle = Integer.parseInt(String.valueOf(tm.getValueAt(jT_Venta_Detalle.getSelectedRow(), 0)));
                Metodos.id_producto = Integer.parseInt(DEV.Metodos.Producto_id_producto_x_id_venta_detalle(Metodos.id_cuenta_detalle));

                Statement ST_Productos = DEV.Conexion.conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery(""
                        + "SELECT * FROM cuenta "
                        + "where id_cuenta = '" + Metodos.id_cuenta + "' and (id_estado = '10' or id_estado = '11') ");
                if (RS_Productos.next()) {
                    facturada = true;
                }

                if (facturada == false) {

                    String unidades = String.valueOf(tm.getValueAt(jT_Venta_Detalle.getSelectedRow(), 2));
                    String nombre = DEV.Metodos.Producto_nombre_x_id_venta_detalle(Metodos.id_cuenta_detalle);
                    String precio = DEV.Metodos.Producto_precio_x_id_venta_detalle(Metodos.id_cuenta_detalle);
                    String precio_compra = DEV.Metodos.Producto_precio_compra_x_id_venta_detalle(Metodos.id_cuenta_detalle);
                    new Ventas_modificar_precio_cantidad().setVisible(true);

//                Ventas_modificar_precio_cantidad.id_producto = id_producto;
//                Ventas_modificar_precio_cantidad.id_cuenta_detalle = String.valueOf(Metodos.id_cuenta_detalle);
                    Ventas_modificar_precio_cantidad.jTextField_Producto.setText(nombre);
                    Ventas_modificar_precio_cantidad.jTextField_Precio_Unitario.setText(precio);
                    Ventas_modificar_precio_cantidad.jTextField_Unidades.setText(unidades);
                    Ventas_modificar_precio_cantidad.jTextField_Precio_compra.setText(precio_compra);
                    Ventas_modificar_precio_cantidad.jTextField_Unidades.select(0, 10);

                } else {
                    Metodos.Ventas_mostrar_miniatura_producto();
                    JOptionPane.showMessageDialog(null, "Esta factura no se puede modificar");
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }

    }//GEN-LAST:event_jT_Venta_DetalleMouseClicked

    private void jCheckBox_ContadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ContadoActionPerformed
        Metodos.Ventas_update_contado();
    }//GEN-LAST:event_jCheckBox_ContadoActionPerformed

    private void jT_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_ClienteMouseClicked

        new Ventas_buscar_cliente().setVisible(true);
    }//GEN-LAST:event_jT_ClienteMouseClicked

    private void jT_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_ClienteActionPerformed

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

    public void Jdialog_Numero_de_factura() {
        jTextField_nuevo_numero_de_factura.setText("");
        jDialog_numero_de_factura.setVisible(true);
        jDialog_numero_de_factura.setTitle("Numero de Factura");
        jDialog_numero_de_factura.setSize(220, 90);
        jDialog_numero_de_factura.setLocationRelativeTo(null);
        jDialog_numero_de_factura.setAlwaysOnTop(true);
        jDialog_numero_de_factura.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Cotizacion().setVisible(true);

//        Jdialog_Cantidad();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser_fechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_fechaPropertyChange
        Metodos.Ventas_update_fecha();
    }//GEN-LAST:event_jDateChooser_fechaPropertyChange

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Ventas_buscar_cliente().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        new Ventas_modificar_precio_ultimo_registro().setVisible(true);
        Jdialog_precio();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//        new Ventas_modificar_cantidad_ultimo_registro().setVisible(true);
        Jdialog_Cantidad();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cantidadKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            NO_ventas.jT_buscador.requestFocus();
            jDialog_cantidad.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            jDialog_cantidad.setVisible(false);
            Metodos.Ventas_actualizar_cantidad();
            jT_buscador.requestFocus();
        }
    }//GEN-LAST:event_jTextField_cantidadKeyReleased

    private void jTextField_cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cantidadKeyPressed

    private void jTextField_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cantidadActionPerformed

    private void jTextField_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyReleased

        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_precio.setVisible(false);
            NO_ventas.jT_buscador.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            jDialog_precio.setVisible(false);
            Metodos.Ventas_actualizar_precio();
        }

        String puntitos = Metodos.getSepararMiles(jTextField_precio.getText().replace(".", ""));

        jTextField_precio.setText(puntitos);
//        jTextField_precio.selectAll();

    }//GEN-LAST:event_jTextField_precioKeyReleased

    private void jTextField_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precioActionPerformed

    private void jTextField_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precioKeyPressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new Facturacion_listado().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_anularActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea anular esta factura?", "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Metodos.Factura_anular();
        }

    }//GEN-LAST:event_jButton_anularActionPerformed

    private void jCheckBox_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_creditoActionPerformed
        Metodos.Ventas_update_credito();
    }//GEN-LAST:event_jCheckBox_creditoActionPerformed

    private void jTextField_nuevo_numero_de_facturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nuevo_numero_de_facturaKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_numero_de_factura.setVisible(false);
            NO_ventas.jT_buscador.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            jDialog_numero_de_factura.setVisible(false);
            Metodos.Ventas_actualizar_numero_de_factura();
        }
    }//GEN-LAST:event_jTextField_nuevo_numero_de_facturaKeyReleased

    private void jTextField_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_facturaMouseClicked
        Jdialog_Numero_de_factura();
    }//GEN-LAST:event_jTextField_facturaMouseClicked

    private void jTextField_nuevo_numero_de_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nuevo_numero_de_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nuevo_numero_de_facturaActionPerformed

    private void jT_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_totalActionPerformed

    private void jT_Venta_DetalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_Venta_DetalleMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Venta_DetalleMouseEntered

    public static void Venta_guardar() {

        String buscar = null;
        boolean producto_existente_en_detalle = false;
        boolean codigo_encontrado = false;
        double unidades_en_stock = 0;

        if (jT_buscador.getText().length() > 0) {
            buscar = jT_buscador.getText().trim();
        }
        if (buscar != null) {

            try {
                String hoy = DEV.Metodos.getHoy_format2();
                String sql = "select id_producto, precio, codigo, id_comercio,"
                        + " id_iva from productos where codigo ='" + buscar + "' and id_comercio = '" + Metodos.id_comercio + "'";

                Statement ST_Productos = conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery(sql);
                while (RS_Productos.next()) {
                    codigo_encontrado = true;

                    int id_producto = RS_Productos.getInt("id_producto");

                    Statement ST_Productos6 = conexion.createStatement();
                    ResultSet RS_Productos6 = ST_Productos6.executeQuery(""
                            + "select * from productos "
                            + "where id_producto = '" + id_producto + "'");
                    while (RS_Productos6.next()) {
                        unidades_en_stock = RS_Productos6.getDouble("stock");
                    }

                    if ((Metodos.alerta_stock == 1 && unidades_en_stock <= 0)) {
                        JOptionPane.showMessageDialog(null, "Producto no disponible. ");
                        NO_ventas.jT_buscador.requestFocus();
                    } else {
                        Statement ST_Productos3 = conexion.createStatement();
                        ResultSet RS_Productos3 = ST_Productos3.executeQuery(""
                                + "select id_producto, id_cuenta_detalle, cantidad "
                                + "from cuenta_detalle "
                                + "where id_producto ='" + id_producto + "' "
                                + "and id_cuenta = '" + Metodos.id_cuenta + "'");
                        if (RS_Productos3.next()) {
                            producto_existente_en_detalle = true;
                            int id = RS_Productos3.getInt("id_cuenta_detalle");
                            int cantidad = RS_Productos3.getInt("cantidad");

                            double diez = 0;
                            double cinco = 0;
                            double cero = 0;

                            if (RS_Productos.getInt("id_iva") == 1) {
                                diez = (cantidad + 1) * RS_Productos.getInt("precio");
                            }
                            if (RS_Productos.getInt("id_iva") == 2) {
                                cinco = (cantidad + 1) * RS_Productos.getInt("precio");
                            }
                            if (RS_Productos.getInt("id_iva") == 3) {
                                cero = (cantidad + 1) * RS_Productos.getInt("precio");
                            }

                            long diez_long = (long) diez;
                            long cinco_long = (long) cinco;
                            long cero_long = (long) cero;

                            long total = cero_long + cinco_long + diez_long;

                            PreparedStatement Update;

//                        System.out.println("Cantidad: " + cantidad + " Exentas: " + cero + " Cinco: " + cinco + " Diez: " + diez);
                            Update = conexion.prepareStatement(""
                                    + "UPDATE cuenta_detalle "
                                    + "SET cantidad='" + (cantidad + 1) + "', "
                                    + "exentas = '" + cero_long + "', "
                                    + "cinco = '" + cinco_long + "', "
                                    + "diez = '" + diez_long + "' "
                                    + "WHERE id_cuenta_detalle='" + id + "'");
                            Update.executeUpdate();

                            Metodos.Productos_Update(1, id_producto, -1);
                            Metodos.Cuenta_actualizar_total();
                            Metodos.BuscarFactura();
                        }

                        if (producto_existente_en_detalle == false) {

                            double diez = 0;
                            double cinco = 0;
                            double cero = 0;

                            if (RS_Productos.getInt("id_iva") == 1) {
                                diez = RS_Productos.getInt("precio");
                            }
                            if (RS_Productos.getInt("id_iva") == 2) {
                                cinco = RS_Productos.getInt("precio");
                            }
                            if (RS_Productos.getInt("id_iva") == 3) {
                                cero = RS_Productos.getInt("precio");
                            }

                            Date hoy_date = new Date();
                            java.sql.Date fecha_sql_date = util_Date_to_sql_date(hoy_date);

                            int id = 0;
                            Statement ST_Auxiliar_2 = conexion.createStatement();
                            ResultSet RS_Auxiliar_2 = ST_Auxiliar_2.executeQuery("SELECT MAX(id_cuenta_detalle) FROM cuenta_detalle");
                            if (RS_Auxiliar_2.next()) {
                                id = RS_Auxiliar_2.getInt(1) + 1;
                            }

                            PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cuenta_detalle VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                            st2.setInt(1, id);
                            st2.setInt(2, Metodos.id_cuenta);
                            st2.setInt(3, RS_Productos.getInt("id_producto"));
                            st2.setInt(4, RS_Productos.getInt("precio"));
                            st2.setInt(5, 1);
                            st2.setInt(6, RS_Productos.getInt("precio"));
                            st2.setString(7, hoy);
                            st2.setString(8, "--");
                            st2.setDouble(9, cero); // exentas
                            st2.setDouble(10, cinco);// cinco
                            st2.setDouble(11, diez);// diez
                            st2.setInt(12, 0);
                            st2.setInt(13, 0);
                            st2.setInt(14, 1);
                            st2.setInt(15, 0);
                            st2.setDate(16, fecha_sql_date);
                            st2.setInt(17, 0);
                            st2.setString(18, " ");
                            st2.executeUpdate();

                            Metodos.Cuenta_actualizar_total();
                            // restar stock
                            DEV.Metodos.Productos_Update(1, RS_Productos.getInt("id_producto"), -1);
                            jT_buscador.setText("");
                            Metodos.BuscarFactura();

                        }
                    }

                    Metodos.Ventas_mostrar_miniatura_producto();
                }
                if (codigo_encontrado == false) {
                    System.out.println("Codigo no encontrado.. buscando por nombre");
                    new Ventas_Buscar_Productos().setVisible(true);
                    Ventas_Buscar_Productos.Buscar_Productos();
                }

            } catch (SQLException ex) {
                System.err.println("Error: " + ex);
//                ret = 0;
            }
        } else {
//            System.err.println("codigo es null");
        }
        jT_buscador.setText("");
    }
//    public static int guardar() {
//
//        int ret = 0;
//        String StringThatCouldBeANumberOrNot = jT_codigo.getText();
//        long codigo = 0;
//        String vacio = "";
//        try {
//
//            if ((StringThatCouldBeANumberOrNot.equals(vacio)) || (StringThatCouldBeANumberOrNot == null)) {
//            } else {
//                codigo = Long.parseLong(StringThatCouldBeANumberOrNot);
//            }
//        } catch (NumberFormatException e) {
//            ret = 3;
//        }
//
//        int producto_no_encontrado = 0;
//
//        int producto_cargado = 0;
////        if (codigo > 0) {
//            try {
//
//                String hoy = DEV.Metodos.getHoy_format2();
//
//                Statement ST_Productos = conexion.createStatement();
//                ResultSet RS_Productos = ST_Productos.executeQuery("select id_producto, precio, codigo, id_comercio,"
//                        + " id_iva from productos where codigo ='" + codigo + "' and id_comercio = '" + Metodos.id_comercio + "'");
//                while (RS_Productos.next()) {
//
//                    Statement ST_Productos3 = conexion.createStatement();
//                    ResultSet RS_Productos3 = ST_Productos3.executeQuery("select id_producto, id_cuenta_detalle, cantidad from cuenta_detalle where id_producto ='" + RS_Productos.getInt("id_producto") + "' and id_cuenta = '" + Metodos.id_cuenta + "'");
//                    while (RS_Productos3.next()) {
//                        producto_cargado = 1;
//                        int id = RS_Productos3.getInt("id_cuenta_detalle");
//                        int cantidad = RS_Productos3.getInt("cantidad");
//
//                        double diez = 0;
//                        double cinco = 0;
//                        double cero = 0;
//
//                        if (RS_Productos.getInt("id_iva") == 1) {
//                            diez = (cantidad + 1) * RS_Productos.getInt("precio");
//                        }
//                        if (RS_Productos.getInt("id_iva") == 2) {
//                            cinco = (cantidad + 1) * RS_Productos.getInt("precio");
//                        }
//                        if (RS_Productos.getInt("id_iva") == 3) {
//                            cero = (cantidad + 1) * RS_Productos.getInt("precio");
//                        }
//
//                        long diez_long = (long) diez;
//                        long cinco_long = (long) cinco;
//                        long cero_long = (long) cero;
//
//                        long total = cero_long + cinco_long + diez_long;
//
//                        PreparedStatement Update;
//
////                        System.out.println("Cantidad: " + cantidad + " Exentas: " + cero + " Cinco: " + cinco + " Diez: " + diez);
//                        Update = conexion.prepareStatement("UPDATE cuenta_detalle SET cantidad='" + (cantidad + 1) + "', exentas = '" + cero_long + "', cinco = '" + cinco_long + "', diez = '" + diez_long + "' WHERE id_cuenta_detalle='" + id + "'");
//                        Update.executeUpdate();
//
//                        Metodos.Cuenta_actualizar_total(total, 1);
//
//                        producto_no_encontrado = 1;
//                        ret = 1;
//                    }
//
//                    if (producto_cargado == 0) {
//
//                        producto_no_encontrado = 1;
//
//                        double diez = 0;
//                        double cinco = 0;
//                        double cero = 0;
//
//                        if (RS_Productos.getInt("id_iva") == 1) {
//                            diez = RS_Productos.getInt("precio");
//                        }
//                        if (RS_Productos.getInt("id_iva") == 2) {
//                            cinco = RS_Productos.getInt("precio");
//                        }
//                        if (RS_Productos.getInt("id_iva") == 3) {
//                            cero = RS_Productos.getInt("precio");
//                        }
//
//                        Date hoy_date = new Date();
//                        java.sql.Date fecha_sql_date = util_Date_to_sql_date(hoy_date);
//
//                        int id = 0;
//                        Statement ST_Auxiliar_2 = conexion.createStatement();
//                        ResultSet RS_Auxiliar_2 = ST_Auxiliar_2.executeQuery("SELECT MAX(id_cuenta_detalle) FROM cuenta_detalle");
//                        if (RS_Auxiliar_2.next()) {
//                            id = RS_Auxiliar_2.getInt(1) + 1;
//                        }
//
//                        PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cuenta_detalle VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//                        st2.setInt(1, id);
//                        st2.setInt(2, Metodos.id_cuenta);
//                        st2.setInt(3, RS_Productos.getInt("id_producto"));
//                        st2.setInt(4, RS_Productos.getInt("precio"));
//                        st2.setInt(5, 1);
//                        st2.setInt(6, RS_Productos.getInt("precio"));
//                        st2.setString(7, hoy);
//                        st2.setString(8, "--");
//                        st2.setDouble(9, cero); // exentas
//                        st2.setDouble(10, cinco);// cinco
//                        st2.setDouble(11, diez);// diez
//                        st2.setInt(12, 0);
//                        st2.setInt(13, 0);
//                        st2.setInt(14, 1);
//                        st2.setInt(15, 0);
//                        st2.setDate(16, fecha_sql_date);
//                        st2.setInt(17, 0);
//                        st2.setString(18, " ");
//                        st2.executeUpdate();
//
//                        Metodos.Cuenta_actualizar_total(total, 1);
//
//                        // restar stock
//                        DEV.Metodos.Productos_Update(1, RS_Productos.getInt("id_producto"), -1);
//
//                        ret = 1;
//                    }
//                }
//                if (producto_no_encontrado == 0) {
////                    JOptionPane.showMessageDialog(jT_Cliente, "No se encuentra el producto.", "Atencion", WIDTH);
//                    ret = 0;
//                }
//            } catch (SQLException ex) {
//                System.err.println("Error: " + ex);
//                ret = 0;
//            }
////        } else if (ret == 3) {
////        } else {
////            ret = 2;
////        }
//        return ret;
//    }

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
            java.util.logging.Logger.getLogger(NO_ventas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NO_ventas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NO_ventas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NO_ventas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NO_ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Jt_pesos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton_anterior;
    public static javax.swing.JButton jButton_anular;
    public static javax.swing.JButton jButton_siguiente;
    public static javax.swing.JCheckBox jCheckBox_Contado;
    public static javax.swing.JCheckBox jCheckBox_Libreta;
    public static javax.swing.JCheckBox jCheckBox_credito;
    public static com.toedter.calendar.JDateChooser jDateChooser_fecha;
    public static javax.swing.JDialog jDialog_cantidad;
    private javax.swing.JDialog jDialog_numero_de_factura;
    private javax.swing.JDialog jDialog_precio;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    public static javax.swing.JTextField jTextField_factura;
    public static javax.swing.JTextField jTextField_id;
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
