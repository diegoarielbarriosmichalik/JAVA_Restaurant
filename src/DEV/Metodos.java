package DEV;

import static DEV.Conexion.conexion;
import FORMS.Producto_buscar;
import FORMS.Productos_ubicacion_buscar;
import FORMS.Proveedor_buscar;
import FORMS.Caja_apertura;
import FORMS.Caja_arqueo;
import FORMS.Cliente_buscar;
import FORMS.Cliente_ABM;
import static FORMS.Cliente_ABM.jt_direccion;
import static FORMS.Cliente_ABM.jt_email;
import static FORMS.Cliente_ABM.jt_nombre;
import static FORMS.Cliente_ABM.jt_ruc;
import static FORMS.Cliente_ABM.jt_telefono;
import FORMS.Cliente_estado_de_cuenta;
import FORMS.Cliente_estado_de_cuenta_buscar_clientes;
import FORMS.Compras;
import static FORMS.Compras.id_factura;
import static FORMS.Compras.jT_factura_nro;
import FORMS.Compras_agregar_producto;
import FORMS.Compras_cambiar_numero_de_factura;
import FORMS.Compras_listado;
import FORMS.Compras_proveedor_buscar;
import FORMS.Configuracion_impresion;
import FORMS.Configuraciones;
import FORMS.Cotizacion;
import FORMS.Facturacion;
import FORMS.Facturas_a_credito;
import FORMS.Imagen_de_fondo;
import FORMS.Imagen_de_producto;
import FORMS.Balance_de_compra_venta;
import FORMS.Listado_de_pedidos_pendientes;
import FORMS.Listado_de_pedidos_terminados;
import FORMS.Listado_de_productos_vendidos_buscar_producto;
import FORMS.Cliente_historial;
import FORMS.Cuentas_por_cobrar;
import FORMS.Listado_de_ventas_por_productos;
import FORMS.Logueo;
import static FORMS.Logueo.id_usuario;
import static FORMS.Logueo.jPasswordField1;
import static FORMS.Logueo.jTextField1;
import FORMS.Pagares;
import FORMS.Pagares_cliente;
import FORMS.Pagares_clientes_firmantes;
import FORMS.Pagares_generar;
import FORMS.Pagares_listado;
import FORMS.Pagares_ver_todos;
import FORMS.Pedidos;
import FORMS.Pedidos_Buscar_producto;
import FORMS.Pedidos_agregar_producto;
import FORMS.Pedidos_buscar_cliente;
import FORMS.Pedidos_en_espera;
import FORMS.Principal;
import FORMS.Producto_ABM;
import static FORMS.Producto_ABM.producto_codigo;
import static FORMS.Producto_ABM.producto_nombre;
import static FORMS.Producto_ABM.producto_precio;
import static FORMS.Producto_ABM.ubicacion;
import FORMS.Productos_buscar_proveedores;
import FORMS.Productos_listado_de_productos_por_rubro;
import FORMS.Rubro_ABM;
import FORMS.Productos_rubro_listado;
import FORMS.Proveedor;
import FORMS.Usuarios;
import FORMS.Usuarios_control;
import FORMS.NO_ventas;
import static FORMS.NO_ventas.Jt_pesos;
import static FORMS.NO_ventas.jCheckBox_Contado;
import static FORMS.NO_ventas.jT_Cliente;
import static FORMS.NO_ventas.jT_Reales;
import static FORMS.NO_ventas.jT_buscador;
import static FORMS.NO_ventas.jT_dolares;
import static FORMS.NO_ventas.jT_total;
import FORMS.Pedidos_pendientes_terminar;
import FORMS.Productos_con_stock_bajo;
import FORMS.Productos_con_stock_bajo_proveedores;
import FORMS.Ubicacion_ABM;
import FORMS.Recibo_de_dinero;
import FORMS.Recibo_de_dinero_clientes;
import FORMS.Ventas_Buscar_Productos;
import FORMS.Facturacion_Terminar;
import FORMS.Ventas_Terminar_con_medio_de_pago;
import FORMS.Ventas_buscar_cliente;
import FORMS.Facturacion_listado;
import FORMS.Listado_de_compras_por_productos;
import FORMS.Rubro;
import FORMS.Ubicacion;
import FORMS.Ventas_modificar_precio_cantidad;
import FORMS.buscar_productos_en_compras;
import static FORMS.buscar_productos_en_compras.jTable_productos;
import FORMS.buscar_productos_nota_pedido_interno;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Metodos {

    // -------------------------------------- Definicion de variables globales
    public static int max = 0;
    public static int id_cuenta = 0;
    public static int id_recibo = 0;
    public static int id_usuario_selected = 0;
    public static int factura = 0;
    public static int id_cuenta_max = 0;
    public static int id_cliente = 0;
    public static int id_ubicacion = 0;
    public static int id_cuenta_detalle = 0;
    public static int id_cuenta_detalle_facturacion = 0;
    public static int id = 0;
    public static int formulario_que_pide = 0;
    public static ResultSetMetaData rsm;
    public static DefaultTableModel dtm;
    public static String comercio;
    public static String titulo;
    public static int id_comercio;
    public static int privilegio;
    public static String comercio_direccion;
    public static String ubicacion_proyecto;
    public static String comercio_telefono;
    public static String comercio_email;
    public static String comercio_ruc;
    public static int id_proveedor = 1;
    public static int id_productos_precio = 1;
    public static int id_medio_de_pago = 0;
    public static int id_producto_listado = 0;
    public static int habilitar_control_individual_de_pago = 0;
    public static int habilitar_medio_de_pago = 0;
    public static int bloquear_facturas = 0;
    public static int recargo = 0;
    public static int alerta_stock = 0;
    public static int habilitar_facturacion = 0;
    public static String caja_numero = "000";
    public static String sucursal_numero = "000";
    public static String rubro = "";
    public static int id_facturas_compra = 0;
    public static int id_productos_tipo = 0;
    public static int id_producto = 0;
    public static int id_rubro = 0;
    public static boolean error;
    public static boolean error_cuenta_detalle;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static int id_pedido_interno = 0;
    public static int id_pagare = 0;
    public static int pedidos = 0;
    public static int precio_automatico = 0;
    public static int venta_terminar = 0;
    public static int venta_terminar_con_nedio_de_pago = 0;
    public static int formulario_externo = 0;
    public static int entro = 0;
    public static String id_pedido_seleccionado = null;
    public static String nombre = null;
    public static String ruta_imagen = null;
    public static ArrayList<String> AI = new ArrayList<>();
    public static boolean existe = false;

    public static int tipo_de_venta = 0;
    public static int id_cliente_listado = 0;

    public static int ultimo_producto_agregado_id_cuenta_detalle = 0;
    public static long total = 0;

    // -------------------------------------- Definicion de variables globales
    public synchronized static void Compras_Proveedores_cargar_datos() {

        int indiceFilaSeleccionada = Compras_proveedor_buscar.jTable_proveedores.getSelectedRow();
        Iterator<String> nombreIterator = AI.iterator();
        int p = 0;
        while (nombreIterator.hasNext()) {
            if (p == indiceFilaSeleccionada) {
                id_proveedor = Integer.parseInt(nombreIterator.next());
                Proveedor_cargar_datos_en_compra(id_proveedor);
                // Compras.jT_Proveedor.setText(nombre);
            } else {
                nombreIterator.next();
            }
            p++;
        }

    }

    public static void Corregir_facturas_de_compra() {
        try {

            // actualizar fecha en facturas compra
//            Statement st1 = conexion.createStatement();
//            ResultSet result = st1.executeQuery("select * from facturas_compra where fecha != ' '");
//            while (result.next()) {
//                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//                Date date = formatter.parse(result.getString("fecha").trim());
//                PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement("UPDATE facturas_compra "
//                        + "SET fecha_date = '" + util_Date_to_sql_date(date) + "' "
//                        + "where id_facturas_compra = '" + result.getInt("id_facturas_compra") + "'");
//                stUpdateAuxiliar2.executeUpdate();
//            }
// funciona
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("select * from facturas_compra");
            while (result.next()) {
                Statement st2 = conexion.createStatement();
                ResultSet result2 = st2.executeQuery(""
                        + "select SUM(total) from facturas_compra_detalle where id_facturas_compra = '" + result.getInt("id_facturas_compra") + "'");
                if (result2.next()) {
                    PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement("UPDATE facturas_compra "
                            + "SET total = '" + result2.getLong(1) + "' "
                            + "where id_facturas_compra = '" + result.getInt("id_facturas_compra") + "'");
                    stUpdateAuxiliar2.executeUpdate();
                }
            }
//            Statement st2 = conexion.createStatement();
//            ResultSet result2 = st2.executeQuery(""
//                    + "select * from facturas_compra_detalle");
//            while (result2.next()) {
//
//                double total_suma = result2.getDouble("precio") * result2.getDouble("cantidad");
//                long l = (new Double(total_suma)).longValue();
//                PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement("UPDATE facturas_compra_detalle "
//                        + "SET total = '" + l +"' "
//                        + "where id_facturas_compra_detalle = '" + result2.getInt("id_facturas_compra_detalle") + "'");
//                stUpdateAuxiliar2.executeUpdate();
//            }
//            Statement st1 = conexion.createStatement();
//            ResultSet result = st1.executeQuery("select * from facturas_compra_detalle where total is null ");
//            while (result.next()) {
//                PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement("UPDATE facturas_compra_detalle "
//                        + "SET total = '" + result.getLong("precio") + "' "
//                        + "where id_facturas_compra_detalle = '" + result.getInt("id_facturas_compra_detalle") + "'");
//                stUpdateAuxiliar2.executeUpdate();
//            }
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void producto_add(String unidades, String precio, String total_total) {
        try {
            int id = 1;

            if (unidades.length() < 1) {
                JOptionPane.showMessageDialog(null, "Complete los campos");
            } else {

//            if (unidades.isEmpty() || precio.isEmpty() || precio.length() < 1 || unidades.length() < 1) {
//                JOptionPane.showMessageDialog(null, "Complete los datos");
//            } else {
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_facturas_compra_detalle) FROM facturas_compra_detalle");
                if (result.next()) {
                    id = result.getInt(1) + 1;
                }
                long total = 0;
                Statement st22 = conexion.createStatement();
                ResultSet result23 = st22.executeQuery("SELECT id_facturas_compra, total FROM facturas_compra "
                        + "where id_facturas_compra = '" + Metodos.id_facturas_compra + "'");
                if (result23.next()) {
                    total = result23.getLong("total");
                }

                double unidades_double = Double.valueOf(unidades);
                double precio_double = Double.valueOf(precio.replace(".", ""));
                double total_double = Double.valueOf(total_total.replace(".", ""));

                Date hoy = new Date();
                java.sql.Date fecha_sql_date = util_Date_to_sql_date(hoy);

                long tot = Math.round(total_double);

                String totalString = String.valueOf(tot);

//            String unidades = jTextField_Unidades.getText().replace(",", ".");
//            double unidades_double = Double.parseDouble(unidades);
//            String precio_unitario = jTextField_Precio_Unitario.getText().replace(",", "");
//            precio_unitario = precio_unitario.replace(".", "");
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO facturas_compra_detalle VALUES(?,?,?,?,?,?,?,?)");
                st2.setInt(1, id);
                st2.setDouble(2, unidades_double);
                st2.setLong(3, Math.round(precio_double));
                st2.setInt(4, 0);
                st2.setInt(5, Metodos.id_facturas_compra);
                st2.setInt(6, id_producto);
                st2.setLong(7, tot);
                st2.setDate(8, fecha_sql_date);
                st2.executeUpdate();

                total = total + Long.parseLong(totalString);

                double cantidad = 0;
                int porcentaje = 0;
                Statement st8 = conexion.createStatement();
                ResultSet result8 = st8.executeQuery("SELECT * FROM productos where id_producto = '" + id_producto + "'");
                if (result8.next()) {
                    cantidad = result8.getDouble("stock") + unidades_double;
                    porcentaje = result8.getInt("porcentaje");
                }
                if (Metodos.precio_automatico == 1) {
                    if (porcentaje > 0) {
                        PreparedStatement stUpdateAuxiliar = conexion.prepareStatement(""
                                + "UPDATE productos "
                                + "SET stock = '" + cantidad + "', "
                                + "precio = '" + ((((Math.round(precio_double)) * porcentaje) / 100) + Math.round(precio_double)) + "' "
                                + "where id_producto = '" + id_producto + "'");
                        stUpdateAuxiliar.executeUpdate();
                    } else {
                        PreparedStatement stUpdateAuxiliar = conexion.prepareStatement(""
                                + "UPDATE productos "
                                + "SET stock = '" + cantidad + "' "
                                + "where id_producto = '" + id_producto + "'");
                        stUpdateAuxiliar.executeUpdate();
                        System.err.println("Stock actualizado");
                    }
                    System.err.println("Stock y precio actualizados");
                } else {
                    PreparedStatement stUpdateAuxiliar = conexion.prepareStatement(""
                            + "UPDATE productos "
                            + "SET stock = '" + cantidad + "' "
                            + "where id_producto = '" + id_producto + "'");
                    stUpdateAuxiliar.executeUpdate();
                    System.err.println("Stock actualizado");

                }
                int precio_de_venta = Integer.parseInt(precio.replace(".", ""));
//                if (precio_de_venta > 0) {
//                    PreparedStatement stUpdateAuxiliar = conexion.prepareStatement(""
//                            + "UPDATE productos "
//                            + "SET precio = '" + precio_de_venta + "' "
//                            + "where id_producto = '" + id_producto + "'");
//                    stUpdateAuxiliar.executeUpdate();
//                    System.err.println("Precio de venta actualizado");
//                }

                PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement("UPDATE facturas_compra "
                        + "SET total = '" + total + "' where id_facturas_compra = '" + Metodos.id_facturas_compra + "'");
                stUpdateAuxiliar2.executeUpdate();

                RefreshListCompras();

            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Facturacion_detalle_modificar() {
        try {
            boolean facturada = false;

            DefaultTableModel tm = (DefaultTableModel) Facturacion.jT_Venta_Detalle.getModel();
            Metodos.id_cuenta_detalle_facturacion = Integer.parseInt(String.valueOf(tm.getValueAt(Facturacion.jT_Venta_Detalle.getSelectedRow(), 0)));
            Metodos.id_producto = Integer.parseInt(DEV.Metodos.Producto_id_producto_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion));

            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(""
                    + "SELECT * FROM cuenta "
                    + "where id_cuenta = '" + Metodos.id_cuenta + "' and (id_estado = '10' or id_estado = '11') ");
            if (RS_Productos.next()) {
                facturada = true;
            }

            if (facturada == false) {

                new Ventas_modificar_precio_cantidad().setVisible(true);
                String unidades = String.valueOf(tm.getValueAt(Facturacion.jT_Venta_Detalle.getSelectedRow(), 2));
                String nombre = DEV.Metodos.Producto_nombre_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion);
                String precio = DEV.Metodos.Producto_precio_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion);
                Ventas_modificar_precio_cantidad.jTextField_Producto.setText(nombre);
                Ventas_modificar_precio_cantidad.jTextField_Precio_Unitario.setText(precio);
                Ventas_modificar_precio_cantidad.jTextField_Unidades.setText(unidades);
                Ventas_modificar_precio_cantidad.jTextField_Unidades.select(0, 10);

            } else {
                Metodos.Facturacion_mostrar_miniatura_producto();
                JOptionPane.showMessageDialog(null, "Esta factura no se puede modificar");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void facturacion_terminar() {
        try {
            boolean tabla_vacia = true;
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle "
                    + "where id_cuenta = '" + Metodos.id_cuenta + "'");
            if (RS_Productos.next()) {
                tabla_vacia = false;
            }

            if (tabla_vacia == false) {
                System.err.println(Metodos.id_cuenta);
                if (Metodos.habilitar_medio_de_pago == 1) {
                    new Ventas_Terminar_con_medio_de_pago().setVisible(true);
                    Ventas_Terminar_con_medio_de_pago.jTextField_ingresar_dinero.requestFocus();
                } else {
                    new Facturacion_Terminar().setVisible(true);
                    Facturacion_Terminar.jTextField_ingresar_dinero.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Factura vacia");
                jT_buscador.requestFocus();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Cliente_nombre_por_ruc(String buscar) {
        try {

            Facturacion_Terminar.jTextField_ci.setText("");
            Facturacion_Terminar.jTextField_nombre.setText("");
            id_cliente = 1;

            if (buscar != null) {
                Statement ST_Productos = conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery(""
                        + "SELECT * FROM cliente "
                        + "where ruc = '" + buscar + "' "
                        + "and borrado_int != '1'");
                if (RS_Productos.next()) {
                    Facturacion_Terminar.jTextField_ci.setText(RS_Productos.getString("ci").trim());
                    Facturacion_Terminar.jTextField_nombre.setText(RS_Productos.getString("nombre").trim());
                    id_cliente = RS_Productos.getInt("id_cliente");
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Cliente_nombre_por_ci(String buscar) {
        try {
            if (isNumeric(buscar)) {
                Statement ST_Productos = conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery(""
                        + "SELECT * FROM cliente "
                        + "where (ci >= '" + buscar + "' and ci <= '" + buscar + "' ) "
                        + "and borrado_int != '1'");
                if (RS_Productos.next()) {
                    Facturacion_Terminar.jTextField_ruc.setText(RS_Productos.getString("ruc").trim());
                    Facturacion_Terminar.jTextField_nombre.setText(RS_Productos.getString("nombre").trim());
                    id_cliente = RS_Productos.getInt("id_cliente");
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Facturacion_detalle() {

        try {

            boolean facturada = false;

            DefaultTableModel tm = (DefaultTableModel) Facturacion.jT_Venta_Detalle.getModel();
            Metodos.id_cuenta_detalle_facturacion = Integer.parseInt(String.valueOf(tm.getValueAt(Facturacion.jT_Venta_Detalle.getSelectedRow(), 0)));
            Metodos.id_producto = Integer.parseInt(DEV.Metodos.Producto_id_producto_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion));
            Statement st1 = conexion.createStatement();
            ResultSet RS_Productos = st1.executeQuery(""
                    + "SELECT * FROM cuenta "
                    + "where id_cuenta = '" + Metodos.id_cuenta + "' and (id_estado = '10' or id_estado = '11') ");
            if (RS_Productos.next()) {
                if (bloquear_facturas == 1) {
                    facturada = true;
                }
            }

            if (facturada == false) {
                String precio_compra = "0";
                String pre = "0";
                pre = Metodos.Producto_precio_compra_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion);
                if (pre != null) {
                    precio_compra = getSepararMiles(pre);
                }

                new Ventas_modificar_precio_cantidad().setVisible(true);
                String unidades = String.valueOf(tm.getValueAt(Facturacion.jT_Venta_Detalle.getSelectedRow(), 2));
                String nombre = Metodos.Producto_nombre_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion);
                String proveedor = Metodos.Producto_proveedor_nombre_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion);
                String stock = Metodos.Producto_stock_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion);
                String precio = getSepararMiles(Metodos.Producto_precio_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion));
                String fecha = Metodos.Producto_fecha_x_id_venta_detalle(Metodos.id_cuenta_detalle_facturacion);
                Ventas_modificar_precio_cantidad.jTextField_Producto.setText(nombre);
                Ventas_modificar_precio_cantidad.jTextField_Precio_Unitario.setText(precio);
                Ventas_modificar_precio_cantidad.jTextField_Precio_compra.setText(precio_compra);
                Ventas_modificar_precio_cantidad.jTextField_fecha.setText(fecha);
                Ventas_modificar_precio_cantidad.jTextField_stock.setText(stock);
                Ventas_modificar_precio_cantidad.jTextField_Proveedor.setText(proveedor);
                Ventas_modificar_precio_cantidad.jTextField_Unidades.setText(unidades);
                Ventas_modificar_precio_cantidad.jTextField_Unidades.select(0, 10);

            } else {
                Metodos.Facturacion_mostrar_miniatura_producto();
                JOptionPane.showMessageDialog(null, "Esta factura no se puede modificar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Proveedor_guardar(String nombre_proveedor, String ruc, String telefono, String descripcion,
            String direccion, String vendedor, String vendedor_telef) {
        try {

            if ((nombre_proveedor == null) && (nombre_proveedor.length() < 1)) {
                JOptionPane.showMessageDialog(null, "Ingresar el Nombre");
            } else if (Metodos.id_proveedor == 0) {

                int id = 0;
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_proveedor) FROM proveedor");
                if (result.next()) {
                    id = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO proveedor VALUES(?,?,?,?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setString(2, nombre_proveedor);
                stUpdateProducto.setString(3, telefono);
                stUpdateProducto.setString(4, ruc);
                stUpdateProducto.setString(5, descripcion);
                stUpdateProducto.setString(6, direccion);
                stUpdateProducto.setString(7, vendedor);
                stUpdateProducto.setString(8, vendedor_telef);
                stUpdateProducto.setInt(9, 0);
                stUpdateProducto.setInt(10, Metodos.id_comercio);
                stUpdateProducto.setInt(11, 0);
                stUpdateProducto.executeUpdate();
                Proveedor.jButton_borrar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE proveedor "
                        + " SET nombre ='" + nombre_proveedor + "',"
                        + " direccion ='" + direccion + "',"
                        + " telefono ='" + telefono + "',"
                        + " ruc ='" + ruc + "',"
                        + " descripcion ='" + descripcion + "',"
                        + " nombre_vendedor ='" + vendedor + "',"
                        + " telefono_vendedor ='" + vendedor_telef + "'"
                        + " WHERE id_proveedor = '" + Metodos.id_proveedor + "'");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Producto_precio_guardar(String unidades, String precio) {
        try {
            if ((unidades == null) || (unidades.length() < 1) || precio == null || precio.length() < 1) {
                JOptionPane.showMessageDialog(null, "Complete los datos");
            } else {

                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_productos_precio) FROM productos_precio");
                if (result.next()) {
                    id = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO productos_precio VALUES(?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setInt(2, id_producto);
                stUpdateProducto.setLong(3, Long.valueOf(unidades));
                stUpdateProducto.setLong(4, Long.valueOf(precio.replace(".", "")));
                stUpdateProducto.executeUpdate();

            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Listado_de_ventas_por_factura_print() {
        try {

            Date desde = Cliente_historial.jd_desde.getDate();
            Date hasta = Cliente_historial.jd_hasta.getDate();

            Statement ST1 = conexion.createStatement();
            ST1.executeUpdate("truncate table reporte_ventas_productos");
            int id = 0;
            String sql = null;

            if (id_cliente_listado == 0) {
                if (tipo_de_venta == 0) {
                    sql = "select id_cuenta, cliente.nombre as cliente_nombre,cuenta.factura, total, fecha_date, tipo from cuenta "
                            + "inner join cliente on cliente.id_cliente = cuenta.id_cliente "
                            + "where cuenta.fecha_date >= '" + desde + "' "
                            + "and (cuenta.fecha_date <= '" + hasta + "') "
                            + "and (cuenta.obs <> 'SI' OR cuenta.obs is null) "
                            + "and cuenta.id_comercio = '" + Metodos.id_comercio + "' "
                            + "and cuenta.id_estado != '9' "
                            + "and cuenta.id_estado != '11' ";
                } else {
                    sql = "select id_cuenta, cliente.nombre as cliente_nombre,cuenta.factura, total, fecha_date, tipo from cuenta "
                            + "inner join cliente on cliente.id_cliente = cuenta.id_cliente "
                            + "where cuenta.fecha_date >= '" + desde + "' "
                            + "and (cuenta.fecha_date <= '" + hasta + "') and (cuenta.obs <> 'SI' OR cuenta.obs is null) "
                            + "and cuenta.id_comercio = '" + Metodos.id_comercio + "' "
                            + "and (cuenta.id_estado != '9') "
                            + "and tipo = '" + tipo_de_venta + "' "
                            + "and cuenta.id_estado != '11'  ";
                }
            }
            if (id_cliente_listado != 0) {
                if (tipo_de_venta == 0) {
                    sql = "select id_cuenta, cliente.nombre as cliente_nombre,cuenta.factura, total, fecha_date, tipo from cuenta "
                            + "inner join cliente on cliente.id_cliente = cuenta.id_cliente "
                            + "where cuenta.fecha_date >= '" + desde + "' "
                            + "and (cuenta.fecha_date <= '" + hasta + "') "
                            + "and (cuenta.obs <> 'SI' OR cuenta.obs is null) "
                            + "and cuenta.id_comercio = '" + Metodos.id_comercio + "' "
                            + "and cuenta.id_estado != '9' "
                            + "and cuenta.id_cliente = '" + id_cliente_listado + "' "
                            + "and cuenta.id_estado != '11' ";
                } else {
                    sql = "select id_cuenta, cliente.nombre as cliente_nombre,cuenta.factura, total, fecha_date, tipo from cuenta "
                            + "inner join cliente on cliente.id_cliente = cuenta.id_cliente "
                            + "where cuenta.fecha_date >= '" + desde + "' "
                            + "and (cuenta.fecha_date <= '" + hasta + "') and (cuenta.obs <> 'SI' OR cuenta.obs is null) "
                            + "and cuenta.id_comercio = '" + Metodos.id_comercio + "' "
                            + "and cuenta.id_estado != '9' "
                            + "and cuenta.id_cliente = '" + id_cliente_listado + "' "
                            + "and tipo = '" + tipo_de_venta + "' "
                            + "and cuenta.id_estado != '11' ";
                }
            }

            Statement stArqueo = conexion.createStatement();
            ResultSet rsArqueo = stArqueo.executeQuery(sql);
            while (rsArqueo.next()) {
                String tipo = null;
                if (rsArqueo.getInt("tipo") == 1) {
                    tipo = "CONTADO";
                }
                if (rsArqueo.getInt("tipo") == 2) {
                    tipo = "CREDITO";
                }

                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id) FROM reporte_ventas_productos");
                if (result.next()) {
                    id = result.getInt(1) + 1;
                }

                java.sql.Date desde_sql = Metodos.util_Date_to_sql_date(desde);
                java.sql.Date hasta_sql = Metodos.util_Date_to_sql_date(hasta);

                java.sql.Date fecha_sql = Metodos.util_Date_to_sql_date(rsArqueo.getDate("fecha_date"));

                PreparedStatement ST = conexion.prepareStatement(""
                        + "INSERT INTO reporte_ventas_productos VALUES(?,?,?,?,?,?,?,?,?,?,?)");
                ST.setInt(1, id);
                ST.setString(2, "");
                ST.setDouble(3, 0);
                ST.setDate(4, desde_sql);
                ST.setDate(5, hasta_sql);
                ST.setLong(6, 0);
                ST.setLong(7, rsArqueo.getLong("total"));
                ST.setString(8, rsArqueo.getString("id_cuenta"));
                ST.setString(9, rsArqueo.getString("cliente_nombre"));
                ST.setDate(10, fecha_sql);
                ST.setString(11, tipo);
                ST.executeUpdate();

            }
            String path = ubicacion_proyecto + "\\reportes\\listado_de_ventas_por_factura.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException e) {
            System.out.println(e);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Recibos_Max() {

        try {
            Statement st4 = conexion.createStatement();
            ResultSet rs2 = st4.executeQuery("SELECT MAX(id_recibo) FROM recibos");
            if (rs2.next()) {
                max = rs2.getInt(1) + 1;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void cierre_de_caja_print() {

        try {

            SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
            String dia = yyyyMMdd.format(Caja_arqueo.jDateChooser2.getDate());

            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table reportecaja");
            Statement stRC = conexion.createStatement();
            int id = 0;
            int entro = 0;

            String sqlArqueo = ""
                    + "select * from cuenta "
                    + "inner join cliente on cliente.id_cliente = cuenta.id_cliente "
                    + "where cuenta.fecha_date >= '" + dia + "' "
                    + "and cuenta.fecha_date <= '" + dia + "' "
                    + "and (cuenta.obs <> 'SI' OR cuenta.obs is null) "
                    + "and cuenta.id_comercio = '1' "
                    + "and cuenta.id_estado != '9' "
                    + "and cuenta.id_estado != '11'"
                    + "and total > '0' "
                    + "order by cuenta.id_cuenta";
            Statement stArqueo = conexion.createStatement();
            ResultSet rsArqueo = stArqueo.executeQuery(sqlArqueo);
            while (rsArqueo.next()) {
//                System.err.println(rsArqueo.getString("id_cuenta"));
                ResultSet resultRC = stRC.executeQuery("SELECT MAX(id_reporte_caja) FROM reportecaja");
                if (resultRC.next()) {
                    id = resultRC.getInt(1) + 1;
                }
                long contado = 0;
                long credito = 0;
                if (rsArqueo.getInt("tipo") == 1) {
                    contado = rsArqueo.getLong("total");
                } else {
                    credito = rsArqueo.getLong("total");
                }
                PreparedStatement stReporteCaja = conexion.prepareStatement("INSERT INTO reportecaja VALUES(?,?,?,?,?,?,?,?)");
                stReporteCaja.setInt(1, id);
                stReporteCaja.setInt(2, rsArqueo.getInt("id_cuenta"));
                stReporteCaja.setString(3, rsArqueo.getString("factura"));
                stReporteCaja.setString(4, rsArqueo.getString("nombre"));
                stReporteCaja.setDate(5, rsArqueo.getDate("fecha_date"));
                stReporteCaja.setLong(6, contado);
                stReporteCaja.setInt(7, 0);
                stReporteCaja.setLong(8, credito);
                stReporteCaja.executeUpdate();

                entro = 1;

            }
            sqlArqueo = ""
                    + "select * from recibos "
                    + "inner join cliente on cliente.id_cliente = recibos.id_cliente "
                    + "where recibos.fecha >= '" + dia + "' "
                    + "and recibos.fecha <= '" + dia + "' "
                    + "order by id_recibo DESC";
            stArqueo = conexion.createStatement();
            rsArqueo = stArqueo.executeQuery(sqlArqueo);
            Date fcha = null;
            while (rsArqueo.next()) {
                //System.err.println(rsArqueo.getString("id_cuenta"));
                ResultSet resultRC = stRC.executeQuery("SELECT MAX(id_reporte_caja) FROM reportecaja");
                if (resultRC.next()) {
                    id = resultRC.getInt(1) + 1;
                }

                fcha = rsArqueo.getDate("fecha");

                PreparedStatement stReporteCaja = conexion.prepareStatement("INSERT INTO reportecaja VALUES(?,?,?,?,?,?,?,?)");
                stReporteCaja.setInt(1, id);
                stReporteCaja.setInt(2, rsArqueo.getInt("id_recibo"));
                stReporteCaja.setString(3, "Recibo N: " + rsArqueo.getString("id_recibo"));
                stReporteCaja.setString(4, rsArqueo.getString("nombre"));
                stReporteCaja.setDate(5, rsArqueo.getDate("fecha"));
                stReporteCaja.setLong(6, 0);
                stReporteCaja.setLong(7, rsArqueo.getLong("dinero_entregado"));
                stReporteCaja.setInt(8, 0);
                stReporteCaja.executeUpdate();

                entro = 1;

            }

            if (entro == 0) {
                ResultSet resultRC = stRC.executeQuery("SELECT MAX(id_reporte_caja) FROM reportecaja");
                if (resultRC.next()) {
                    id = resultRC.getInt(1) + 1;
                }
                PreparedStatement stReporteCaja = conexion.prepareStatement("INSERT INTO reportecaja VALUES(?,?,?,?,?,?,?,?)");
                stReporteCaja.setInt(1, id);
                stReporteCaja.setInt(2, 0);
                stReporteCaja.setLong(3, 0);
                stReporteCaja.setString(4, "");
                stReporteCaja.setDate(5, util_Date_to_sql_date(fcha));
                stReporteCaja.setInt(6, 0);
                stReporteCaja.setInt(7, 0);
                stReporteCaja.setInt(8, 0);
                stReporteCaja.executeUpdate();

                entro = 1;
            }
            long apertura_de_caja = 0;
            Statement stRC2 = conexion.createStatement();
            ResultSet resultRC2 = stRC2.executeQuery("SELECT * FROM caja where fecha_date = '" + Caja_arqueo.jDateChooser2.getDate() + "'");
            if (resultRC2.next()) {
                apertura_de_caja = resultRC2.getLong("monto");
            }
            ResultSet resultRC = stRC.executeQuery("SELECT MAX(id_reporte_caja) FROM reportecaja");
            if (resultRC.next()) {
                id = resultRC.getInt(1) + 1;
            }

            Date hoy2 = new Date();

            PreparedStatement stReporteCaja = conexion.prepareStatement("INSERT INTO reportecaja VALUES(?,?,?,?,?,?,?,?)");
            stReporteCaja.setInt(1, id);
            stReporteCaja.setString(2, "");
            stReporteCaja.setString(3, "");
            stReporteCaja.setString(4, "APERTURA DE CAJA");
            stReporteCaja.setDate(5, util_Date_to_sql_date(hoy2));
            stReporteCaja.setLong(6, apertura_de_caja);
            stReporteCaja.setInt(7, 0);
            stReporteCaja.setInt(8, 0);
            stReporteCaja.executeUpdate();

            String path = ubicacion_proyecto + "\\reportes\\arqueo_de_caja_v2.jasper";
            JasperReport jr = null;

            jr = (JasperReport) JRLoader.loadObjectFromFile(path);

            Map parametros = new HashMap();
            parametros.put("fecha", Caja_arqueo.jDateChooser2.getDate());
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);

            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException | SQLException ex) {
            System.out.println(ex);
        }
    }

    public synchronized static void Listado_de_compras_por_productos() {
        try {
            String path = ubicacion_proyecto + "\\reportes\\reportes_compra_detalle.jasper";
            JasperReport jr = null;
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            Map parametros = new HashMap();
            parametros.put("fecha1", Listado_de_compras_por_productos.jDateChooser_desde.getDate());
            parametros.put("fecha2", Listado_de_compras_por_productos.jDateChooser_hasta.getDate());
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.out.println(ex);
        }
    }

    public static void Recibo_de_dinero_borrar() {
        try {
            PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement(""
                    + "delete from recibos WHERE id_recibo ='" + id_recibo + "'");
            stUpdateAuxiliar2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Productos_precio_borrar() {
        try {
            PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement(""
                    + "delete from productos_precio WHERE id_productos_precio ='" + id_productos_precio + "'");
            stUpdateAuxiliar2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Recibo_imprimir() {
        try {
            String path = ubicacion_proyecto + "\\reportes\\recibo.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_fecha_actualizar() {

    }

    public static void Recibo_marcar_activo() {
    }

    public static void Recibo_de_dinero_clientes_cargar_jtable() {
        try {
            dtm = (DefaultTableModel) Recibo_de_dinero_clientes.jTable_clientes.getModel();
            for (int j = 0; j < Recibo_de_dinero_clientes.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cliente, nombre "
                    + "from cliente "
                    + "where nombre like '%" + Recibo_de_dinero_clientes.jTextField_buscar.getText() + "%' "
                    + "and borrado_int != '1'");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Recibo_de_dinero_clientes.jTable_clientes.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Rubro_cargar_jtable() {
        try {
            dtm = (DefaultTableModel) Rubro.jTable_Rubro.getModel();
            for (int j = 0; j < Rubro.jTable_Rubro.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_productos_tipo, productos_tipo "
                    + "from productos_tipo where id_productos_tipo > '0' order by productos_tipo");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Rubro.jTable_Rubro.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Ubicacion_cargar_jtable() {
        try {
            dtm = (DefaultTableModel) Ubicacion.jTable_clientes.getModel();
            for (int j = 0; j < Ubicacion.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_productos_ubicacion, ubicacion "
                    + "from productos_ubicacion where id_productos_ubicacion > '0' order by ubicacion");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Ubicacion.jTable_clientes.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Cuentas_a_cobrar_cargar_jtable() {
        try {
            Statement ST = conexion.createStatement();
            ST.executeUpdate("truncate table cuentas_a_cobrar");

            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table cuentas_a_cobrar");

            long total_recibo = 0;
            long total_cuenta = 0;
            int id_cliente_in = 0;
            String nombre = "";
            dtm = (DefaultTableModel) Cuentas_por_cobrar.jTable1.getModel();
            for (int j = 0; j < Cuentas_por_cobrar.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            String sql = "select distinct(cliente.id_cliente), nombre from cliente "
                    + "inner join cuenta on cuenta.id_cliente = cliente.id_cliente "
                    + "where tipo = '2' and cliente.borrado != '1' "
                    + "and cuenta.id_estado != '9' "
                    + "and cuenta.id_estado != '11' "
                    + "and total > '0' order by nombre";

            Statement ST2 = conexion.createStatement();
            Statement ST3 = conexion.createStatement();
            Statement ST4 = conexion.createStatement();
            ResultSet rs = ST2.executeQuery(sql);
            while (rs.next()) {
                id_cliente_in = rs.getInt(1);
                nombre = rs.getString("nombre");
                ResultSet rs2 = ST3.executeQuery("select sum(dinero_entregado) from recibos where id_cliente = '" + id_cliente_in + "'");
                while (rs2.next()) {
                    total_recibo = rs2.getLong(1);
                }

                String sql_cuenta = "select sum(total) from cuenta "
                        + "inner join cliente on cuenta.id_cliente = cliente.id_cliente "
                        + "where tipo = '2' and cliente.borrado != '1' "
                        + "and cuenta.id_estado != '9' "
                        + "and cuenta.id_estado != '11' "
                        + "and total > '0'"
                        + "and cuenta.id_cliente = '" + id_cliente_in + "' ";

                ResultSet rs3 = ST4.executeQuery(sql_cuenta);
                while (rs3.next()) {
                    total_cuenta = rs3.getLong(1);
                }

                if (total_cuenta > total_recibo) {

                    Statement st5 = conexion.createStatement();
                    ResultSet rs5 = st5.executeQuery("SELECT MAX(id_cuentas_a_cobrar) FROM cuentas_a_cobrar");
                    if (rs5.next()) {
                        max = rs5.getInt(1) + 1;
                    }

                    PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cuentas_a_cobrar VALUES(?,?,?,?)");
                    st2.setInt(1, max);
                    st2.setInt(2, id_cliente_in);
                    st2.setString(3, nombre);
                    st2.setLong(4, (total_cuenta - total_recibo));
                    st2.executeUpdate();
                }

            }

            Statement st5 = conexion.createStatement();
            ResultSet rs5 = st5.executeQuery("SELECT sum(deuda) FROM cuentas_a_cobrar");
            if (rs5.next()) {
                Cuentas_por_cobrar.jTextField_deuda.setText(getSepararMiles(rs5.getString(1)));
            }

            dtm = (DefaultTableModel) Cuentas_por_cobrar.jTable1.getModel();
            for (int j = 0; j < Cuentas_por_cobrar.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            DecimalFormat formatea = new DecimalFormat("###,###.##");

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select nombre, deuda "
                    + "from cuentas_a_cobrar ");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[0] = rs2.getString("nombre");
                    rows[1] = formatea.format(rs2.getInt("deuda"));
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Cuentas_por_cobrar.jTable1.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Recibo_de_dinero_clientes_clientes_buscar() {
        try {
            dtm = (DefaultTableModel) Cliente_estado_de_cuenta_buscar_clientes.jTable_clientes.getModel();
            for (int j = 0; j < Cliente_estado_de_cuenta_buscar_clientes.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_clientes, nombre "
                    + "from clientes "
                    + "where nombre like '%" + Cliente_estado_de_cuenta_buscar_clientes.jTextField_buscar.getText() + "%'");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Cliente_estado_de_cuenta_buscar_clientes.jTable_clientes.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Recibos_guardar() {
        try {
            String nombre = Clientes_buscar_por_id(id_cliente);

            Date fecha_date = Recibo_de_dinero.jDateChooser2.getDate();

            String dinero = Recibo_de_dinero.jTextField_dinero.getText().replace(".", "");
            String dinero_en_letras = Dinero_a_letras(Integer.parseInt(dinero));

            PreparedStatement stClienteBorrar = conexion.prepareStatement("UPDATE recibos SET activa='0' WHERE activa  ='1'");
            stClienteBorrar.executeUpdate();

            if (id_recibo == 0) {
                Recibos_Max();

                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO recibos VALUES(?,?,?,?,?,?,?,?)");
                st2.setInt(1, max);
                st2.setInt(2, id_cliente);
                st2.setString(3, Recibo_de_dinero.jTextField_concepto.getText());
                st2.setInt(4, Integer.parseInt(dinero));
                st2.setDate(5, util_Date_to_sql_date(fecha_date));
                st2.setString(6, dinero_en_letras);
                st2.setInt(7, 0);
                st2.setInt(8, 1);
                st2.executeUpdate();

            } else {
                PreparedStatement ST2 = conexion.prepareStatement(""
                        + "UPDATE recibos "
                        + "SET id_cliente='" + id_cliente + "', "
                        + "concepto='" + Recibo_de_dinero.jTextField_concepto.getText() + "', "
                        + "dinero_entregado='" + dinero + "', "
                        + "dinero_letras='" + dinero_en_letras + "', "
                        + "fecha ='" + util_Date_to_sql_date(fecha_date) + "', "
                        + "activa ='1' "
                        + "WHERE id_recibo  ='" + id_recibo + "'");
                ST2.executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Buscar_Productos() {
        try {
            ResultSetMetaData rsm;
            DefaultTableModel dtm;
            PreparedStatement ps;
            ResultSet rs;
            ps = conexion.prepareStatement("select id_producto, productos.nombre, proveedor.nombre "
                    + "from productos "
                    + "inner join proveedor on proveedor.id_proveedor = productos.id_proveedor "
                    + "where productos.id_comercio = '" + Metodos.id_comercio + "' "
                    + "and productos.borrado_int != '1' "
                    + "and productos.nombre like '%" + buscar_productos_en_compras.jTextField_buscar.getText() + "%'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) jTable_productos.getModel();
            for (int j = 0; j < jTable_productos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1).toString().trim();
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) jTable_productos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }

        Compras.jT_Buscar_Productos.setText("");
    }

    public synchronized static void Producto_Buscar_por_codigo_de_barras() {

        try {
            Statement ST_Productos = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(""
                    + "select * from productos "
                    + "where codigo = '" + Producto_ABM.producto_codigo.getText() + "' "
                    + "and borrado_int != '1' ");
            if (RS_Productos.next()) {
                JOptionPane.showMessageDialog(null, "Código de barras registrado como: " + RS_Productos.getString("nombre").trim());
                id_producto = RS_Productos.getInt("id_producto");
                Metodos.Productos_cargar_producto_en_editar2();
                Producto_ABM.jButton_borrar.setVisible(true);
                Producto_ABM.producto_nombre.requestFocus();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Producto_Buscar_por_codigo_de_barras " + ex);
        }

    }

    public static void Clientes_historial() {
        try {

            JasperReport jr = null;

            Map parametros = new HashMap();
            parametros.put("id_cliente", Metodos.id_cliente);
            String path = ubicacion_proyecto + "\\reportes\\cliente_historial.jasper";
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException e) {
            System.err.println(e);
        }
    }

    public synchronized static void Ventas_modificar_precio_cantidad() {

        try {
            id_producto = 0;
            double cantidad = 0;
            long total = 0;
            long exentas = 0;
            long cinco = 0;
            long diez = 0;
            double stock_actualizado = 0;
            Statement ST_Productos = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle "
                    + "where id_cuenta_detalle = '" + id_cuenta_detalle_facturacion + "'");
            if (RS_Productos.next()) {
                id_producto = RS_Productos.getInt("id_producto");
                cantidad = RS_Productos.getDouble("cantidad");
                exentas = RS_Productos.getLong("exentas");
                cinco = RS_Productos.getLong("cinco");
                diez = RS_Productos.getLong("diez");
                total = exentas + cinco + diez;
            }

            Statement ST = DEV.Conexion.conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM productos "
                    + "where id_producto = '" + id_producto + "'");
            if (RS.next()) {
                stock_actualizado = RS.getDouble("stock") + cantidad;
            }

            //---- actualizo el stock
            PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE productos "
                    + "SET stock ='" + stock_actualizado + "' "
                    + "WHERE id_producto='" + id_producto + "'");
            stUpdateStock.executeUpdate();
            //---- actualizo el stock

            PreparedStatement stUpdateAuxiliar = DEV.Conexion.conexion.prepareStatement(""
                    + "delete from cuenta_detalle WHERE id_cuenta_detalle='" + Metodos.id_cuenta_detalle_facturacion + "'");
            stUpdateAuxiliar.executeUpdate();

            Metodos.Cuenta_actualizar_total();

            Metodos.BuscarFactura_facturacion();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Pedido_interno_terminar_producto() {
        try {
            PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE pedido_interno_detalle "
                    + "SET estado = '2' "
                    + "WHERE id_pedido_interno_detalle ='" + id_pedido_seleccionado + "'");

            System.err.println("Terminado");

            stUpdateStock.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Facturacion_update_cliente(int id_cliente2) {
        try {
            PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET id_cliente ='" + id_cliente2 + "' "
                    + "WHERE id_cuenta ='" + id_cuenta + "'");
            stUpdateStock.executeUpdate();
            BuscarFactura_facturacion();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Corregir_cuenta() {
        try {
            Statement ST_Productos = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta");
            while (RS_Productos.next()) {
                id_cuenta = RS_Productos.getInt("id_cuenta");
                long total = 0;
                Statement ST_Productos2 = DEV.Conexion.conexion.createStatement();
                ResultSet RS_Productos2 = ST_Productos2.executeQuery("SELECT * FROM cuenta_detalle "
                        + "where id_cuenta = '" + id_cuenta + "'");
                while (RS_Productos2.next()) {
                    total = RS_Productos2.getLong("cinco")
                            + RS_Productos2.getLong("diez")
                            + RS_Productos2.getLong("exentas") + total;
                }
                PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET total ='" + total + "' "
                        + "WHERE id_cuenta ='" + id_cuenta + "'");
                stUpdateStock.executeUpdate();
                total = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Corregir_Fecha_cuenta() {
        try {
            Statement ST_Productos = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta order by id_cuenta DESC");
            while (RS_Productos.next()) {
                id_cuenta = RS_Productos.getInt("id_cuenta");
                long total = 0;

                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formatter.parse(RS_Productos.getString("fecha").trim());

                java.sql.Date fecha_date = util_Date_to_sql_date(date);

                PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET fecha_date ='" + fecha_date + "' "
                        + "WHERE id_cuenta ='" + id_cuenta + "'");
                stUpdateStock.executeUpdate();
                total = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } catch (ParseException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_mostrar_miniatura_producto() {
        ImageIcon imagen = new ImageIcon(ubicacion_proyecto + "\\imagenes\\" + id_producto + "mini");
        imagen.getImage().flush();
        NO_ventas.jLabel_imagen.setIcon(imagen);
    }

    public synchronized static void Facturacion_mostrar_miniatura_producto() {
        ImageIcon imagen = new ImageIcon(ubicacion_proyecto + "\\imagenes\\" + id_producto + "mini");
        imagen.getImage().flush();
        Facturacion.jLabel_imagen.setIcon(imagen);
    }

    public synchronized static void Ventas_selected() {
        DefaultTableModel tm = (DefaultTableModel) Facturacion_listado.jTable1.getModel();
        String selected = String.valueOf(tm.getValueAt(Facturacion_listado.jTable1.getSelectedRow(), 0));
        id_cuenta = Integer.parseInt(selected.replace(".", ""));
        BuscarFactura_facturacion();
    }

    public synchronized static void Cliente_estado_de_cuenta_ver_factura() {
        DefaultTableModel tm = (DefaultTableModel) Cliente_estado_de_cuenta.jTable_facturas.getModel();
        id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Cliente_estado_de_cuenta.jTable_facturas.getSelectedRow(), 0)));
        BuscarFactura_facturacion();
    }

    public synchronized static void Recibo_de_dinero_seleccionar_para_editar() {
        DefaultTableModel tm = (DefaultTableModel) Cliente_estado_de_cuenta.jTable_recibos.getModel();
        id_recibo = Integer.parseInt(String.valueOf(tm.getValueAt(Cliente_estado_de_cuenta.jTable_recibos.getSelectedRow(), 0)));
        Buscar_recibo();
    }

    public synchronized static void Recibo_de_dinero_buscar_cliente_agregar_desde_lista() {
        DefaultTableModel tm = (DefaultTableModel) Recibo_de_dinero_clientes.jTable_clientes.getModel();
        id_cliente = Integer.parseInt(String.valueOf(tm.getValueAt(Recibo_de_dinero_clientes.jTable_clientes.getSelectedRow(), 0)));
        Recibo_de_dinero.jTextField_Cliente.setText(String.valueOf(tm.getValueAt(Recibo_de_dinero_clientes.jTable_clientes.getSelectedRow(), 1)));
    }

    public static void Buscar_recibo() {
        try {
            String sql = "select  * "
                    + "from recibos "
                    + "inner join cliente on cliente.id_cliente = recibos.id_cliente "
                    + "where id_recibo ='" + id_recibo + "' ";
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(sql);
            while (RS_Productos.next()) {
                id_cliente = RS_Productos.getInt("id_cliente");
                Recibo_de_dinero.jTextField_Cliente.setText(RS_Productos.getString("nombre").trim());
                Recibo_de_dinero.jTextField_concepto.setText(RS_Productos.getString("concepto").trim());
                Recibo_de_dinero.jTextField_dinero.setText(RS_Productos.getString("dinero_entregado"));
                Recibo_de_dinero.jDateChooser2.setDate(RS_Productos.getDate("fecha"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void GuardarDesdeLista() {
        DefaultTableModel tm = (DefaultTableModel) Ventas_Buscar_Productos.jTable1.getModel();
        String id_producto_str = String.valueOf(tm.getValueAt(Ventas_Buscar_Productos.jTable1.getSelectedRow(), 0));
        id_producto = Integer.parseInt(id_producto_str.replace(".", ""));

        int id = 0;
        int id_cuenta_detalle = 0;
        Statement ST_Productos;
        double unidades_en_stock = 0;
        boolean encontrado = false;
        try {

            Statement ST_Productos6 = conexion.createStatement();
            ResultSet RS_Productos6 = ST_Productos6.executeQuery(""
                    + "select * from productos "
                    + "where id_producto = '" + id_producto + "'");
            while (RS_Productos6.next()) {
                unidades_en_stock = RS_Productos6.getDouble("stock");
            }

            if ((Metodos.alerta_stock == 1 && unidades_en_stock <= 0)) {
                JOptionPane.showMessageDialog(null, "Producto no disponible en stock ");
                Facturacion.jT_buscador.requestFocus();
            } else {

//            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM productos where nombre = '" + dato + "' and id_comercio = '" + index.id_comercio + "' and (borrado <> 'SI' OR borrado is null)");
                ST_Productos = conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM productos where id_producto = '" + id_producto + "'");
                while (RS_Productos.next()) {

                    try (Statement ST_Auxiliar_2 = conexion.createStatement();
                            ResultSet RS_Auxiliar_2 = ST_Auxiliar_2.executeQuery("SELECT MAX(id_cuenta_detalle) FROM cuenta_detalle")) {
                        if (RS_Auxiliar_2.next()) {
                            id = RS_Auxiliar_2.getInt(1) + 1;
                        }
                    }
                    Date hoydate = null;
                    Statement ST_Productos2 = conexion.createStatement();
                    ResultSet RS_Productos2 = ST_Productos2.executeQuery("SELECT * FROM cuenta where id_cuenta = '" + Metodos.id_cuenta + "'");
                    while (RS_Productos2.next()) {
                        hoydate = RS_Productos2.getDate("fecha_date");
                    }

                    java.sql.Date fecha_sql_date = util_Date_to_sql_date(hoydate);

                    double diez = 0;
                    double cinco = 0;
                    double cero = 0;
                    double cantidad = 0;
                    long precio = RS_Productos.getInt("precio");

                    if (RS_Productos.getInt("id_iva") == 1) {
                        diez = precio;
                    }
                    if (RS_Productos.getInt("id_iva") == 2) {
                        cinco = precio;
                    }
                    if (RS_Productos.getInt("id_iva") == 3) {
                        cero = precio;
                    }
                    Statement ST_Productos3 = conexion.createStatement();
                    ResultSet RS_Productos3 = ST_Productos3.executeQuery(""
                            + "SELECT * FROM cuenta_detalle "
                            + "where id_producto = '" + id_producto + "' and id_cuenta = '" + Metodos.id_cuenta + "'");
                    while (RS_Productos3.next()) {
                        id_cuenta_detalle = RS_Productos3.getInt("id_cuenta_detalle");
                        cantidad = RS_Productos3.getDouble("cantidad");
                        precio = RS_Productos3.getInt("precio");
                        encontrado = true;
                    }
                    if (encontrado == false) {

                        PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cuenta_detalle VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        st2.setInt(1, id);
                        st2.setInt(2, Metodos.id_cuenta);
                        st2.setInt(3, RS_Productos.getInt("id_producto"));
                        st2.setLong(4, precio);
                        st2.setInt(5, 1);
                        st2.setLong(6, precio);
                        st2.setString(7, hoydate.toString());
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

                        Metodos.ultimo_producto_agregado_id_cuenta_detalle = id;

                        st2.executeUpdate();

                    } else {

                        diez = 0;
                        cinco = 0;
                        cero = 0;

                        if (RS_Productos.getInt("id_iva") == 1) {
                            diez = (cantidad + 1) * precio;
                        }
                        if (RS_Productos.getInt("id_iva") == 2) {
                            cinco = (cantidad + 1) * precio;
                        }
                        if (RS_Productos.getInt("id_iva") == 3) {
                            cero = (cantidad + 1) * precio;
                        }

                        long diez_long = (long) diez;
                        long cinco_long = (long) cinco;
                        long cero_long = (long) cero;

                        long total = cero_long + cinco_long + diez_long;

                        PreparedStatement Update;

                        Update = conexion.prepareStatement(""
                                + "UPDATE cuenta_detalle "
                                + "SET cantidad='" + (cantidad + 1) + "', "
                                + "exentas = '" + cero_long + "', "
                                + "cinco = '" + cinco_long + "', "
                                + "diez = '" + diez_long + "' "
                                + "WHERE id_cuenta_detalle='" + id_cuenta_detalle + "'");
                        Update.executeUpdate();
                        Metodos.Cuenta_actualizar_total();

                    }
                    Metodos.Cuenta_actualizar_total();

                    // resta en stock
                    DEV.Metodos.Productos_Update(1, RS_Productos.getInt("id_producto"), -1);
                    Metodos.BuscarFactura_facturacion();
                }

                ImageIcon imagen = new ImageIcon(ubicacion_proyecto + "\\imagenes\\" + id_producto + "mini");
                imagen.getImage().flush();
                Facturacion.jLabel_imagen.setIcon(imagen);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public synchronized static void Venta_guardar_facturacion() {

        String buscar = "";
        boolean producto_existente_en_detalle = false;
        boolean codigo_encontrado = false;
        double unidades_en_stock = 0;
        id_cuenta_detalle = 0;
        String vacio = "";
        if ((Facturacion.jT_buscador.getText().length() > 0)) {
            buscar = Facturacion.jT_buscador.getText();
            buscar = buscar.trim();
            System.err.println(buscar);
        }
        if (!buscar.equals(vacio)) {

            try {
                String hoy = getHoy_format2();
                String sql = "select  * "
                        + "from productos "
                        + "where codigo ='" + buscar + "' "
                        + "and id_comercio = '" + Metodos.id_comercio + "'";

                Statement ST_Productos = conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery(sql);
                while (RS_Productos.next()) {
                    codigo_encontrado = true;

                    id_producto = RS_Productos.getInt("id_producto");
                    unidades_en_stock = RS_Productos.getDouble("stock");

                    long precio = RS_Productos.getInt("precio");

                    if ((Metodos.alerta_stock == 1 && unidades_en_stock <= 0)) {
                        JOptionPane.showMessageDialog(null, "Producto no disponible en stock");
                        Facturacion.jT_buscador.requestFocus();
                    } else {
                        Statement ST_Productos3 = conexion.createStatement();
                        ResultSet RS_Productos3 = ST_Productos3.executeQuery(""
                                + "select id_producto, id_cuenta_detalle, cantidad, precio "
                                + "from cuenta_detalle "
                                + "where id_producto ='" + id_producto + "' "
                                + "and id_cuenta = '" + Metodos.id_cuenta + "'");
                        if (RS_Productos3.next()) {
                            producto_existente_en_detalle = true;

                            precio = RS_Productos3.getInt("precio");

                            id_cuenta_detalle = RS_Productos3.getInt("id_cuenta_detalle");
                            int cantidad = RS_Productos3.getInt("cantidad");

                            double diez = 0;
                            double cinco = 0;
                            double cero = 0;

                            if (RS_Productos.getInt("id_iva") == 1) {
                                diez = (cantidad + 1) * precio;
                            }
                            if (RS_Productos.getInt("id_iva") == 2) {
                                cinco = (cantidad + 1) * precio;
                            }
                            if (RS_Productos.getInt("id_iva") == 3) {
                                cero = (cantidad + 1) * precio;
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
                                    + "total = '" + (cero_long + cinco_long + diez_long) + "', "
                                    + "diez = '" + diez_long + "' "
                                    + "WHERE id_cuenta_detalle='" + id_cuenta_detalle + "'");
                            Update.executeUpdate();

                            Metodos.Productos_Update(1, id_producto, -1);
                            Metodos.Cuenta_actualizar_total();
                            Metodos.BuscarFactura_facturacion();
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
                            Statement ST_Productos2 = conexion.createStatement();
                            ResultSet RS_Auxiliar_2 = ST_Productos2.executeQuery("SELECT MAX(id_cuenta_detalle) FROM cuenta_detalle");
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
                            Metodos.BuscarFactura_facturacion();

                        }
                    }

                    Facturacion_mostrar_miniatura_producto();
                }
                if (codigo_encontrado == false) {
                    //   System.out.println("Codigo no encontrado.. buscando por nombre");
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
        Facturacion.jT_buscador.setText("");
    }

    public synchronized static void Tipo_de_pago_selected() {
        DefaultTableModel tm = (DefaultTableModel) Ventas_Terminar_con_medio_de_pago.jTable_medio_de_pago.getModel();
        id_medio_de_pago = Integer.parseInt(String.valueOf(tm.getValueAt(Ventas_Terminar_con_medio_de_pago.jTable_medio_de_pago.getSelectedRow(), 0)));
        Ventas_Terminar_con_medio_de_pago.jTextField_medio_de_pago.setText(String.valueOf(tm.getValueAt(Ventas_Terminar_con_medio_de_pago.jTable_medio_de_pago.getSelectedRow(), 1)));
    }

    public synchronized static void Productos_listado_de_rubros_selected() {
        int indiceFilaSeleccionada = Productos_listado_de_productos_por_rubro.jTable_rubros.getSelectedRow();
        Iterator<String> nombreIterator = AI.iterator();
        int p = 0;
        while (nombreIterator.hasNext()) {
            if (p == indiceFilaSeleccionada) {
                id_productos_tipo = Integer.parseInt(nombreIterator.next());
                System.err.println(id_productos_tipo);
                Rubros_buscar_por_id();
                Productos_listado_de_productos_por_rubro.jTextField_rubro.setText(rubro);
                System.err.println(rubro);
            } else {
                nombreIterator.next();
            }
            p++;
        }
    }

    public synchronized static void Rubros_buscar_por_id() {
        try {
            Statement ST_Productos6 = conexion.createStatement();
            ResultSet RS_Productos6 = ST_Productos6.executeQuery(""
                    + "select * from productos_tipo "
                    + "where id_productos_tipo = '" + id_productos_tipo + "'");
            while (RS_Productos6.next()) {
                rubro = RS_Productos6.getString("productos_tipo").trim();
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Usuarios_control_selected() {
        try {
            DefaultTableModel tm = (DefaultTableModel) Usuarios_control.jTable_usuarios.getModel();
            id_usuario_selected = Integer.parseInt(String.valueOf(tm.getValueAt(Usuarios_control.jTable_usuarios.getSelectedRow(), 0)));
            Usuarios_control.jTextField_usuario.setText((String.valueOf(tm.getValueAt(Usuarios_control.jTable_usuarios.getSelectedRow(), 1))));

            Statement ST_Productos6 = conexion.createStatement();
            ResultSet RS_Productos6 = ST_Productos6.executeQuery(""
                    + "select * from control_de_acceso "
                    + "where id_usuario = '" + id_usuario_selected + "'");
            while (RS_Productos6.next()) {
                Usuarios_control.jTextField_sucursal.setText(RS_Productos6.getString("sucursal_numero"));
                Usuarios_control.jTextField_caja.setText(RS_Productos6.getString("caja_numero"));
                Usuarios_control.jTextField_numero.setText(RS_Productos6.getString("ultima_factura"));
                if (RS_Productos6.getInt("habilitar_facturacion") == 0) {
                    Usuarios_control.jCheckBox20.setSelected(false);
                } else {
                    Usuarios_control.jCheckBox20.setSelected(true);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Facturas_a_credito_detalle_selected() {

        try {

            int generar = 0;
            String generar_str = null;
            DefaultTableModel tm = (DefaultTableModel) Facturas_a_credito.jTable_facturas.getModel();
            id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Facturas_a_credito.jTable_facturas.getSelectedRow(), 0)));

            Statement ST_Productos6 = conexion.createStatement();
            ResultSet RS_Productos6 = ST_Productos6.executeQuery(""
                    + "select * from cuenta "
                    + "where id_cuenta = '" + id_cuenta + "'");
            while (RS_Productos6.next()) {
                generar = RS_Productos6.getInt("generar_recibo");
                id_cliente = RS_Productos6.getInt("id_cliente");
            }

            if (generar == 1) {
                generar = 0;
                generar_str = " ";

            } else {
                generar = 1;
                generar_str = "Generar recibo";
            }

            PreparedStatement st2 = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET generar_recibo ='0', "
                    + "generar_recibo_str = ' ' "
                    + "WHERE id_cliente != '" + id_cliente + "'");
            st2.executeUpdate();

            PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET generar_recibo ='" + generar + "', "
                    + "generar_recibo_str = '" + generar_str + "' "
                    + "WHERE id_cuenta='" + id_cuenta + "'");
            stUpdateStock.executeUpdate();

            Metodos.Facturas_credito_buscar_cliente_cargar_lista();

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public static void Generar_recibos_poner_cero() {
        try {
            PreparedStatement st2 = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET generar_recibo ='0', "
                    + "generar_recibo_str = ' ' "
                    + "WHERE generar_recibo = '1'");
            st2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Listado_de_productos_vendidos_selected() {

        DefaultTableModel tm = (DefaultTableModel) Listado_de_productos_vendidos_buscar_producto.jTable1.getModel();
        id_producto_listado = Integer.parseInt(String.valueOf(tm.getValueAt(Listado_de_productos_vendidos_buscar_producto.jTable1.getSelectedRow(), 0)));
        Listado_de_ventas_por_productos.jTextField_productos.setText(String.valueOf(tm.getValueAt(Listado_de_productos_vendidos_buscar_producto.jTable1.getSelectedRow(), 1)));
    }

    public synchronized static double Stock_where_id_producto(int x) {
        double stock = 0;
        try {
            Statement ST_Productos6 = conexion.createStatement();
            ResultSet RS_Productos6 = ST_Productos6.executeQuery(""
                    + "select * from productos "
                    + "where id_producto = '" + x + "'");
            while (RS_Productos6.next()) {
                stock = RS_Productos6.getDouble("stock");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return stock;

    }

    public synchronized static void Ventas_actualizar_cantidad() {
        double total = 0;
        double precio = 0;

        double cantidad = Double.parseDouble(Facturacion.jTextField_cantidad.getText());

        try {

            double stock_real = 0;
            double stock_actualizado = 0;
            Statement ST_Productos = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(""
                    + "SELECT * FROM cuenta_detalle "
                    + "where id_cuenta_detalle = '" + ultimo_producto_agregado_id_cuenta_detalle + "'");
            if (RS_Productos.next()) {
                id_producto = RS_Productos.getInt("id_producto");
                precio = RS_Productos.getDouble("precio");
                double unidades_en_stock = Stock_where_id_producto(id_producto);
                if (alerta_stock == 1 && unidades_en_stock < cantidad) {
                    JOptionPane.showMessageDialog(null, "ALERTA: Stock actual del producto menor al ingresado");

                } else {

                    long exentas_cuenta_detalle = RS_Productos.getLong("exentas");
                    long cinco_cuenta_detalle = RS_Productos.getLong("cinco");
                    long diez_cuenta_detalle = RS_Productos.getLong("diez");

                    long total_cuenta_detalle = exentas_cuenta_detalle + cinco_cuenta_detalle + diez_cuenta_detalle;

                    Double cuenta_detalle_cantidad = RS_Productos.getDouble("cantidad");

                    Statement ST2 = conexion.createStatement();
                    ResultSet RS = ST2.executeQuery(""
                            + "SELECT * FROM productos "
                            + "where id_producto = '" + id_producto + "'");
                    if (RS.next()) {
                        //   precio = RS.getDouble("precio");
                        total = cantidad * precio;

                        Statement ST22 = conexion.createStatement();
                        ResultSet RS22 = ST22.executeQuery(""
                                + "SELECT * FROM productos_precio "
                                + "where id_producto = '" + id_producto + "' "
                                + "order by unidades");
                        while (RS22.next()) {
                            if (RS22.getLong("unidades") <= cantidad) {
                                precio = precio;
                                total = cantidad * precio;
                            }
                        }

                        long diez = 0;
                        long cinco = 0;
                        long exentas = 0;
                        double stock = RS.getDouble("stock");

                        stock_real = stock + cuenta_detalle_cantidad;
                        stock_actualizado = stock_real - cantidad;

                        if (RS.getInt("id_iva") == 1) {
                            diez = (new Double(total)).longValue();
                        }
                        if (RS.getInt("id_iva") == 2) {
                            cinco = (new Double(total)).longValue();
                        }
                        if (RS.getInt("id_iva") == 3) {
                            exentas = (new Double(total)).longValue();
                        }

                        PreparedStatement stUpdateAuxiliar = DEV.Conexion.conexion.prepareStatement(""
                                + "UPDATE cuenta_detalle "
                                + "SET cantidad='" + cantidad + "', "
                                + "diez = '" + diez + "', "
                                + "cinco = '" + cinco + "', "
                                + "exentas = '" + exentas + "', "
                                + "total = '" + (cinco + diez + exentas) + "', "
                                + "precio = '" + Math.round(precio) + "'  "
                                + "WHERE id_cuenta_detalle='" + ultimo_producto_agregado_id_cuenta_detalle + "'"
                        );
                        stUpdateAuxiliar.executeUpdate();

                        //---- actualizo el stock
                        PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                                + "UPDATE productos "
                                + "SET stock ='" + stock_actualizado + "' "
                                + "WHERE id_producto='" + id_producto + "'");
                        stUpdateStock.executeUpdate();
                        //---- actualizo el stock

                        if (cantidad == 0) {
                            PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement(""
                                    + "delete from cuenta_detalle "
                                    + "WHERE id_cuenta_detalle ='" + ultimo_producto_agregado_id_cuenta_detalle + "'");
                            stUpdateAuxiliar2.executeUpdate();

                            Facturacion_mostrar_miniatura_producto();
                        }

                        Metodos.Cuenta_actualizar_total();
                        Metodos.BuscarFactura_facturacion();
                    }
                }

            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Factura_anular() {
        double stock_actualizado = 0;
        try {
            Statement ST_Cuenta_detalle = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Cuenta_detalle = ST_Cuenta_detalle.executeQuery(""
                    + "SELECT * FROM cuenta_detalle "
                    + "where id_cuenta = '" + id_cuenta + "'");
            while (RS_Cuenta_detalle.next()) {

                Statement ST_Productos = DEV.Conexion.conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery(""
                        + "SELECT * FROM productos "
                        + "where id_producto = '" + RS_Cuenta_detalle.getInt("id_producto") + "'");
                if (RS_Productos.next()) {

                    stock_actualizado = RS_Productos.getDouble("stock") + RS_Cuenta_detalle.getDouble("cantidad");

                    //---- actualizo el stock
                    PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                            + "UPDATE productos "
                            + "SET stock ='" + stock_actualizado + "' "
                            + "WHERE id_producto='" + RS_Cuenta_detalle.getInt("id_producto") + "'");
                    stUpdateStock.executeUpdate();
                    //---- actualizo el stock
                }
            }

            PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET id_estado ='11' "
                    + "WHERE id_cuenta ='" + id_cuenta + "'");
            stUpdateStock.executeUpdate();

            BuscarFactura_facturacion();

            System.err.println("Factura anulada OK");

//            JOptionPane.showMessageDialog(null, "Factura Anulada");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Factura_presupuesto() {
        double stock_actualizado = 0;
        try {
            Statement ST_Cuenta_detalle = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Cuenta_detalle = ST_Cuenta_detalle.executeQuery(""
                    + "SELECT * FROM cuenta_detalle "
                    + "where id_cuenta = '" + id_cuenta + "'");
            while (RS_Cuenta_detalle.next()) {

                Statement ST_Productos = DEV.Conexion.conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery(""
                        + "SELECT * FROM productos "
                        + "where id_producto = '" + RS_Cuenta_detalle.getInt("id_producto") + "'");
                if (RS_Productos.next()) {

                    stock_actualizado = RS_Productos.getDouble("stock") + RS_Cuenta_detalle.getDouble("cantidad");

                    //---- actualizo el stock
                    PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                            + "UPDATE productos "
                            + "SET stock ='" + stock_actualizado + "' "
                            + "WHERE id_producto='" + RS_Cuenta_detalle.getInt("id_producto") + "'");
                    stUpdateStock.executeUpdate();
                    //---- actualizo el stock
                }
            }

            PreparedStatement stUpdateStock = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET id_estado ='9' "
                    + "WHERE id_cuenta ='" + id_cuenta + "'");
            stUpdateStock.executeUpdate();

//            BuscarFactura_facturacion();
            System.err.println("Factura presupuesto OK");

//            JOptionPane.showMessageDialog(null, "Factura Anulada");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_actualizar_precio() {
        double total = 0;

        int precio = Integer.parseInt(Facturacion.jTextField_precio.getText().replace(".", ""));

        try {
            Statement ST_Productos = DEV.Conexion.conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(""
                    + "SELECT * FROM cuenta_detalle "
                    + "where id_cuenta_detalle = '" + ultimo_producto_agregado_id_cuenta_detalle + "'");
            if (RS_Productos.next()) {

                long exentas_cuenta_detalle = RS_Productos.getLong("exentas");
                long cinco_cuenta_detalle = RS_Productos.getLong("cinco");
                long diez_cuenta_detalle = RS_Productos.getLong("diez");

                long total_cuenta_detalle = exentas_cuenta_detalle + cinco_cuenta_detalle + diez_cuenta_detalle;

                total = precio * RS_Productos.getDouble("cantidad");
                Statement ST = DEV.Conexion.conexion.createStatement();
                ResultSet RS = ST.executeQuery(""
                        + "SELECT * FROM productos "
                        + "where id_producto = '" + RS_Productos.getInt("id_producto") + "'");
                if (RS.next()) {

                    long diez = 0;
                    long cinco = 0;
                    long exentas = 0;

                    if (RS.getInt("id_iva") == 1) {
                        diez = (new Double(total)).longValue();
                    }
                    if (RS.getInt("id_iva") == 2) {
                        cinco = (new Double(total)).longValue();
                    }
                    if (RS.getInt("id_iva") == 3) {
                        exentas = (new Double(total)).longValue();
                    }

                    PreparedStatement stUpdateAuxiliar = DEV.Conexion.conexion.prepareStatement(""
                            + "UPDATE cuenta_detalle "
                            + "SET precio='" + precio + "', "
                            + "diez = '" + diez + "', "
                            + "cinco = '" + cinco + "', "
                            + "total = '" + (cinco + diez + exentas) + "', "
                            + "exentas = '" + exentas + "' "
                            + "WHERE id_cuenta_detalle='" + ultimo_producto_agregado_id_cuenta_detalle + "'");
                    stUpdateAuxiliar.executeUpdate();

                    long diez_long = (long) diez;
                    long cinco_long = (long) cinco;
                    long cero_long = (long) exentas;

                    long total_long = cero_long + cinco_long + diez_long - total_cuenta_detalle;

                    Metodos.Cuenta_actualizar_total();

                    Metodos.BuscarFactura_facturacion();
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_actualizar_numero_de_factura() {
        try {
            PreparedStatement stUpdateAuxiliar = DEV.Conexion.conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET factura ='" + sucursal_numero + "-" + caja_numero + "-" + Facturacion.jTextField_nuevo_numero_de_factura.getText() + "' "
                    + "WHERE id_cuenta ='" + id_cuenta + "'");
            stUpdateAuxiliar.executeUpdate();
            Metodos.BuscarFactura_facturacion();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Borrar_productos() {

    }

    public synchronized static void Reporte_de_ventas_por_productos_imprimir() {
        try {

            Date desde_date = Listado_de_ventas_por_productos.jd_desde.getDate();
            Date hasta_date = Listado_de_ventas_por_productos.jd_hasta.getDate();

            java.sql.Date desde_sql = util_Date_to_sql_date(desde_date);
            java.sql.Date hasta_sql = util_Date_to_sql_date(hasta_date);

            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table reporte_ventas_productos");

            double cantidad = 0;
            long total = 0;

            int entro = 0;
            Statement ST_Productos;
            String sql = "SELECT * FROM productos where "
                    + "id_comercio = '" + Metodos.id_comercio + "' "
                    + "and (borrado <> 'SI' OR borrado is null) "
                    + "and borrado_int != '1' ";

            if (id_producto_listado != 0) {
                sql = "SELECT * FROM productos where "
                        + "id_comercio = '" + Metodos.id_comercio + "' "
                        + "and (borrado <> 'SI' OR borrado is null) "
                        + "and id_producto = '" + id_producto_listado + "'";
            }

            ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(sql);
            while (RS_Productos.next()) {

                Statement ST_Cuenta_detalle;
                ST_Cuenta_detalle = conexion.createStatement();
                ResultSet RS_Cuenta_detalle = ST_Cuenta_detalle.executeQuery(""
                        + "SELECT * FROM cuenta_detalle "
                        + "inner join cuenta on cuenta.id_cuenta = cuenta_detalle.id_cuenta "
                        + "where id_producto = '" + RS_Productos.getInt("id_producto") + "' "
                        + "and (borrado <> 'SI' OR borrado is null) "
                        + "and cuenta.fecha_date >= '" + desde_date + "' "
                        + "and cuenta.fecha_date <= '" + hasta_date + "' "
                        + "and tipo_venta != '9' "
                        + "and cuenta.id_estado != '11' "
                        + "and cuenta.id_estado != '9' ");
                while (RS_Cuenta_detalle.next()) {
                    cantidad = cantidad + RS_Cuenta_detalle.getDouble("cantidad");
                    total = RS_Cuenta_detalle.getLong("diez")
                            + RS_Cuenta_detalle.getLong("cinco")
                            + RS_Cuenta_detalle.getLong("exentas")
                            + total;
                }
                if (cantidad > 0) {
                    int id = 0;
                    Statement st1 = conexion.createStatement();
                    ResultSet result = st1.executeQuery("SELECT MAX(id) FROM reporte_ventas_productos");
                    if (result.next()) {
                        id = result.getInt(1) + 1;
                    }
                    PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO reporte_ventas_productos VALUES(?,?,?,?,?,?,?)");
                    stUpdateProducto.setInt(1, id);
                    stUpdateProducto.setString(2, RS_Productos.getString("nombre"));
                    stUpdateProducto.setDouble(3, cantidad);
                    stUpdateProducto.setDate(4, desde_sql);
                    stUpdateProducto.setDate(5, hasta_sql);
                    stUpdateProducto.setLong(6, 0);
                    stUpdateProducto.setDouble(7, total);
                    total = 0;
                    stUpdateProducto.executeUpdate();
                    cantidad = 0;
                    entro = 1;
                }
            }
            if (entro == 0) {
                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO reporte_ventas_productos VALUES(?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, 1);
                stUpdateProducto.setString(2, "");
                stUpdateProducto.setDouble(3, 0);
                stUpdateProducto.setDate(4, desde_sql);
                stUpdateProducto.setDate(5, hasta_sql);
                stUpdateProducto.setLong(6, 0);
                stUpdateProducto.setDouble(7, total);
                total = 0;
                stUpdateProducto.executeUpdate();
            }

            String path = ubicacion_proyecto + "\\reportes\\venta_de_productos_por_fecha.jasper";

            // String path = "C:\\Sistema\\venta_de_productos_por_fecha.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException | SQLException e) {
            System.err.println(e);
        }
    }

    public synchronized static void Balance_de_compras_ventas_por_factura() {
        try {

            Date desde_date = Balance_de_compra_venta.jDateChooser2.getDate();
            Date hasta_date = Balance_de_compra_venta.jDateChooser3.getDate();

            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table reporte_balance_compras_ventas_por_facturas");

            Statement ST;
            String sql = "SELECT * FROM facturas_compra "
                    + "inner join proveedor on "
                    + "proveedor.id_proveedor = facturas_compra.id_proveedor "
                    + "where facturas_compra.id_comercio = '" + Metodos.id_comercio + "' "
                    + "and facturas_compra.borrado != '1' "
                    + "and fecha_date >= '" + desde_date + "' "
                    + "and fecha_date <= '" + hasta_date + "' "
                    + "and total > '0' ";

            int id = 0;

            ST = conexion.createStatement();
            ResultSet RS_Productos = ST.executeQuery(sql);
            while (RS_Productos.next()) {

                java.sql.Date fecha = util_Date_to_sql_date(RS_Productos.getDate("fecha_date"));

                PreparedStatement stUpdateProducto = conexion.prepareStatement(""
                        + "INSERT INTO reporte_balance_compras_ventas_por_facturas VALUES(?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id++);
                stUpdateProducto.setDate(2, fecha);
                stUpdateProducto.setString(3, RS_Productos.getString("numero"));
                stUpdateProducto.setString(4, RS_Productos.getString("nombre"));
                stUpdateProducto.setLong(5, RS_Productos.getLong("total"));
                stUpdateProducto.setLong(6, 0);
                stUpdateProducto.executeUpdate();
            }

            sql = "select * from cuenta "
                    + "inner join cliente on "
                    + "cuenta.id_cliente = cliente.id_cliente "
                    + "where fecha_date >= '" + desde_date + "' "
                    + "and fecha_date <= '" + hasta_date + "' "
                    + "and id_estado != '11' "
                    + "and id_estado != '9' "
                    + "and total > '0' ";

            String sql_contado = "select sum(total) from cuenta inner join cliente on "
                    + "                    cuenta.id_cliente = cliente.id_cliente "
                    + "                    where fecha_date >= '" + desde_date + "' "
                    + "                    and fecha_date <= '" + hasta_date + "' "
                    + "                    and id_estado != '11' "
                    + "                    and id_estado != '9' "
                    + "                    and tipo = '1'";
            String sql_credito = "select sum(total) from cuenta inner join cliente on "
                    + "                    cuenta.id_cliente = cliente.id_cliente "
                    + "                    where fecha_date >= '" + desde_date + "' "
                    + "                    and fecha_date <= '" + hasta_date + "' "
                    + "                    and id_estado != '11' "
                    + "                    and id_estado != '9' "
                    + "                    and tipo = '2'";

//            String sql_recibo = "select SUM(dinero_entregado) from recibos "
//                    + "inner join cliente on "
//                    + "recibos.id_cliente = cliente.id_cliente "
//                    + "where fecha >= '" + desde_date + "' "
//                    + "and fecha <= '" + hasta_date + "' ";
            long contado = 0;
            long credito = 0;
            long recibo = 0;
            ST = conexion.createStatement();
            ResultSet RS_contado = ST.executeQuery(sql_contado);
            while (RS_contado.next()) {
                contado = RS_contado.getLong(1);
            }
            ResultSet RS_credito = ST.executeQuery(sql_credito);
            while (RS_credito.next()) {
                credito = RS_credito.getLong(1);
            }
//            ResultSet RS_recibo = ST.executeQuery(sql_recibo);
//            while (RS_recibo.next()) {
//                recibo = RS_recibo.getLong(1);
//            }

            ResultSet RS_Ventas = ST.executeQuery(sql);
            while (RS_Ventas.next()) {

                java.sql.Date fecha = util_Date_to_sql_date(RS_Ventas.getDate("fecha_date"));

                PreparedStatement stUpdateProducto = conexion.prepareStatement(""
                        + "INSERT INTO reporte_balance_compras_ventas_por_facturas VALUES(?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id++);
                stUpdateProducto.setDate(2, fecha);
                stUpdateProducto.setString(3, "Nro venta: " + RS_Ventas.getString("id_cuenta") + " Fac. " + RS_Ventas.getString("factura"));
                stUpdateProducto.setString(4, RS_Ventas.getString("nombre"));
                stUpdateProducto.setLong(5, 0);
                stUpdateProducto.setLong(6, RS_Ventas.getLong("total"));
                stUpdateProducto.executeUpdate();
            }

            sql = "select * from recibos "
                    + "inner join cliente on "
                    + "recibos.id_cliente = cliente.id_cliente "
                    + "where fecha >= '" + desde_date + "' "
                    + "and fecha <= '" + hasta_date + "' ";
            ResultSet RS_Recibo = ST.executeQuery(sql);
            while (RS_Recibo.next()) {

                java.sql.Date fecha = util_Date_to_sql_date(RS_Recibo.getDate("fecha"));

                PreparedStatement stUpdateProducto = conexion.prepareStatement(""
                        + "INSERT INTO reporte_balance_compras_ventas_por_facturas VALUES(?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id++);
                stUpdateProducto.setDate(2, fecha);
                stUpdateProducto.setString(3, "Recibo de dinero Nro: " + RS_Recibo.getString("id_recibo"));
                stUpdateProducto.setString(4, RS_Recibo.getString("nombre"));
                stUpdateProducto.setLong(5, 0);
                stUpdateProducto.setLong(6, RS_Recibo.getLong("dinero_entregado"));
                recibo = RS_Recibo.getLong("dinero_entregado") + recibo;
                stUpdateProducto.executeUpdate();
            }

            String path = ubicacion_proyecto + "\\reportes\\balance_compras_ventas.jasper";

            Map parametros = new HashMap();
//            parametros.put("compras",);
            parametros.put("contado", contado);
            parametros.put("credito", credito);
            parametros.put("recibo", recibo);

//            String path = "C:\\Sistema\\Reportes\\balance_compras_ventas.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (SQLException | JRException e) {
            System.err.println(e);
        }
    }

    public synchronized static void Compras_clear() {
        Compras.jT_Buscar_Productos.setText("");
        Compras.jT_Proveedor.setText("");
        Compras.jT_factura_nro.setText("");
        Compras.jL_Total.setText("0");
        id_proveedor = 0;
        id_facturas_compra = 0;

        Compras.jButton_borrar.setVisible(false);

        dtm = (DefaultTableModel) Compras.jTable1.getModel();
        for (int j = 0; j < Compras.jTable1.getRowCount(); j++) {
            dtm.removeRow(j);
            j -= 1;
        }

        Compras.jT_Proveedor.requestFocus();

    }

    public synchronized static void Compras_listado_selecionar_jtable() {

        DefaultTableModel tm = (DefaultTableModel) Compras_listado.jTable1.getModel();
        id_facturas_compra = Integer.parseInt(String.valueOf(tm.getValueAt(Compras_listado.jTable1.getSelectedRow(), 0)));
        String proveedor_jt = String.valueOf(tm.getValueAt(Compras_listado.jTable1.getSelectedRow(), 1));
        Compras.jT_Proveedor.setText(proveedor_jt);
        String factura_jt = String.valueOf(tm.getValueAt(Compras_listado.jTable1.getSelectedRow(), 2));
        Compras.jT_factura_nro.setText(factura_jt);
        Compras_Buscar();
        Compras.jButton_borrar.setVisible(true);
    }

    public synchronized static void Cliente_clear() {
        Cliente_ABM.jt_nombre.setEditable(true);
        Cliente_ABM.jt_direccion.setText("");
        Cliente_ABM.jt_email.setText("");
        Cliente_ABM.jt_nombre.setText("");
        Cliente_ABM.jt_ruc.setText("");
        Cliente_ABM.jTextField_ci.setText("");
        Cliente_ABM.jt_telefono.setText("");
        Cliente_ABM.jt_ruc.requestFocus();
        Metodos.id_cliente = 0;
    }

    public synchronized static void Ubicacion_clear() {
        Ubicacion_ABM.jTextField_ubicacion.setText("");
        Ubicacion_ABM.jTextField_ubicacion.requestFocus();
        Metodos.id_ubicacion = 0;
    }

    public synchronized static void Elegir_imagen() {
        File fichero = Imagen_de_fondo.jFileChooser1.getSelectedFile();
        File origen = new File(fichero.getAbsolutePath());
        File destino = new File(ubicacion_proyecto + "\\logo.png");
        try {
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();

            ImageIcon imagen = new ImageIcon(ubicacion_proyecto + "\\logo.png");
            imagen.getImage().flush();
            Principal.jLabel1.setIcon(imagen);

        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }

    public synchronized static void Elegir_imagen_producto() {
        File fichero = Imagen_de_producto.jFileChooser1.getSelectedFile();
        File origen = new File(fichero.getAbsolutePath());
        File destino = new File(ubicacion_proyecto + "\\imagenes\\" + id_producto);
        try {
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();

            ImageIcon imagen = new ImageIcon(ubicacion_proyecto + "\\imagenes\\" + id_producto);
            imagen.getImage().flush();
            Producto_ABM.jLabel_imagen.setIcon(imagen);

            copyImage(ubicacion_proyecto + "\\imagenes\\" + id_producto, ubicacion_proyecto + "\\imagenes\\" + id_producto + "mini");

        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }

    public synchronized static void Update_imagen() {
        String ruta = null;
        ruta = ubicacion_proyecto + "\\logo.png";
        ImageIcon imagen = new ImageIcon(ruta);
        Principal.jLabel1.setIcon(imagen);

        System.err.println(ruta);
    }

    public synchronized static void Pedidos_buscar_productos() {
        try {
            ps = conexion.prepareStatement("select id_producto, nombre, precio, stock "
                    + "from productos where id_comercio = '" + Metodos.id_comercio + "' "
                    + "and (borrado_int != '1' or borrado_int is null) "
                    + "and nombre like '%" + Pedidos.jTextField_producto.getText() + "%'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Pedidos_Buscar_producto.jTable1.getModel();
            for (int j = 0; j < Pedidos_Buscar_producto.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Pedidos_Buscar_producto.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_terminar_medios_de_pago_cargar_jtable() {
        try {
            ps = conexion.prepareStatement("select id_cuenta_detalle_de_pagos, tipo_de_pago, descripcion, numero, total "
                    + "from cuenta_detalle_de_pagos "
                    + "inner join tipo_de_pago on tipo_de_pago.id_tipo_de_pago = cuenta_detalle_de_pagos.id_tipo_de_pago "
                    + "where id_cuenta = '" + id_cuenta + "' ");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Ventas_Terminar_con_medio_de_pago.jTable_cuenta_pagos.getModel();
            for (int j = 0; j < Ventas_Terminar_con_medio_de_pago.jTable_cuenta_pagos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Ventas_Terminar_con_medio_de_pago.jTable_cuenta_pagos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

            Statement ST_Productos7 = conexion.createStatement();
            ResultSet RS_Productos7 = ST_Productos7.executeQuery(""
                    + "select SUM(total) from cuenta_detalle_de_pagos "
                    + "where id_cuenta = '" + id_cuenta + "' ");
            if (RS_Productos7.next()) {
                if (RS_Productos7.getString(1) != null) {
                    String puntitos = getSepararMiles(RS_Productos7.getString(1));
                    Ventas_Terminar_con_medio_de_pago.jTextField_total_medio_de_pago.setText(puntitos);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_cargar_medio_de_pago_jtable() {
        try {
            ps = conexion.prepareStatement("select * from tipo_de_pago");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Ventas_Terminar_con_medio_de_pago.jTable_medio_de_pago.getModel();
            for (int j = 0; j < Ventas_Terminar_con_medio_de_pago.jTable_medio_de_pago.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Ventas_Terminar_con_medio_de_pago.jTable_medio_de_pago.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_listado_cargar_jtable() {
        try {
            ps = conexion.prepareStatement("select id_cuenta, factura, cuenta.fecha_date, nombre, total, estado  from cliente "
                    + "inner join cuenta on "
                    + "cuenta.id_cliente = cliente.id_cliente "
                    + "inner join estado on estado.id_estado = cuenta.id_estado "
                    + "where nombre like '%" + Facturacion_listado.jTextField_buscar.getText() + "%' "
                    + "and borrado_int != '1' "
                    + "and cuenta.id_comercio = '" + id_comercio + "' "
                    + "and total > '0' "
                    + "order by fecha_date DESC");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Facturacion_listado.jTable1.getModel();
            for (int j = 0; j < Facturacion_listado.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    if (rs.getObject(i + 1) != null) {
                        if (isNumeric(rs.getObject(i + 1).toString())) {
                            rows[i] = getSepararMiles(rs.getObject(i + 1).toString());
                        } else if (rs.getObject(i + 1).toString().length() > 1) {
                            rows[i] = rs.getObject(i + 1).toString().trim();
                        } else {
                            rows[i] = rs.getObject(i + 1);
                        }
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Facturacion_listado.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_listado_cargar_jtable_fecha() {
        try {
            ps = conexion.prepareStatement("select id_cuenta, factura, cuenta.fecha_date, nombre, total, estado  from cliente "
                    + "inner join cuenta on "
                    + "cuenta.id_cliente = cliente.id_cliente "
                    + "inner join estado on estado.id_estado = cuenta.id_estado "
                    + "where fecha_date >= '" + Facturacion_listado.jDateChooser1.getDate() + "' "
                    + "and fecha_date <= '" + Facturacion_listado.jDateChooser2.getDate() + "' "
                    + "and borrado_int != '1' "
                    + "and total > '0' "
                    + "order by id_cuenta DESC");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Facturacion_listado.jTable1.getModel();
            for (int j = 0; j < Facturacion_listado.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    if (rs.getObject(i + 1) != null) {

                        if (isNumeric(rs.getObject(i + 1).toString())) {
                            rows[i] = getSepararMiles(rs.getObject(i + 1).toString());

                        } else if (rs.getObject(i + 1).toString().length() > 1) {
                            rows[i] = rs.getObject(i + 1).toString().trim();
                        } else {
                            rows[i] = rs.getObject(i + 1);
                        }
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Facturacion_listado.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Listado_de_productos_vendidos_cargar_jtable() {
        try {
            ps = conexion.prepareStatement("select id_producto, nombre "
                    + "from productos where id_comercio = '" + Metodos.id_comercio + "' "
                    + "and borrado_int != '1' "
                    + "and nombre like '%" + Listado_de_productos_vendidos_buscar_producto.jTextField_buscar.getText() + "%'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Listado_de_productos_vendidos_buscar_producto.jTable1.getModel();
            for (int j = 0; j < Listado_de_productos_vendidos_buscar_producto.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Listado_de_productos_vendidos_buscar_producto.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_listado_cargar_jtable() {
        try {

            String total_str = "0";
            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery(""
                    + "select SUM(total) from proveedor "
                    + "inner join facturas_compra on "
                    + "facturas_compra.id_proveedor = proveedor.id_proveedor "
                    + "where nombre like '%" + Compras_listado.jTextField_buscar_proveedor.getText() + "%' "
                    + "and facturas_compra.id_comercio = '" + id_comercio + "' "
                    + "and facturas_compra.borrado != '1' "
                    + "");
            if (resultRC.next()) {
                if (resultRC.getString(1) == null) {
                } else {
                    total_str = resultRC.getString(1);
                    Compras_listado.jTextField_total.setText(getSepararMiles(total_str));
                }
            }

            ps = conexion.prepareStatement(""
                    + "select id_facturas_compra, nombre, numero, fecha_date, total from proveedor "
                    + "inner join facturas_compra on "
                    + "facturas_compra.id_proveedor = proveedor.id_proveedor "
                    + "where nombre like '%" + Compras_listado.jTextField_buscar_proveedor.getText() + "%' "
                    + "and facturas_compra.id_comercio = '" + id_comercio + "' "
                    + "and facturas_compra.borrado != '1' "
                    + "order by id_facturas_compra DESC ");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Compras_listado.jTable1.getModel();
            for (int j = 0; j < Compras_listado.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) != null) {
                        if (rs.getObject(i + 1).toString().length() > 1) {
                            rows[0] = rs.getObject(1).toString().trim();
                            rows[1] = rs.getObject(2).toString().trim();
                            rows[2] = rs.getObject(3).toString().trim();

                            if (rs.getObject(4) == null) {
                            } else {
                                rows[3] = rs.getObject(4);
                            }
                            if (rs.getObject(5) == null) {
                            } else {
                                rows[4] = getSepararMiles(rs.getObject(5).toString());
                            }
                        }
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras_listado.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_listado_cargar_jtable_con_fecha() {
        try {
            String total_str = "0";
            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery(""
                    + "select SUM(total) from proveedor "
                    + "inner join facturas_compra on "
                    + "facturas_compra.id_proveedor = proveedor.id_proveedor "
                    + "where fecha_date = '" + Compras_listado.jDateChooser2.getDate() + "' "
                    + "and facturas_compra.id_comercio = '" + id_comercio + "' and facturas_compra.borrado != '1'");
            if (resultRC.next()) {
                if (resultRC.getString(1) == null) {
                } else {
                    total_str = resultRC.getString(1);
                    Compras_listado.jTextField_total.setText(getSepararMiles(total_str));
                }
            }

            ps = conexion.prepareStatement(""
                    + "select id_facturas_compra, nombre, numero, fecha_date, total from proveedor "
                    + "inner join facturas_compra on "
                    + "facturas_compra.id_proveedor = proveedor.id_proveedor "
                    + "where fecha_date = '" + Compras_listado.jDateChooser2.getDate() + "' "
                    + "and facturas_compra.id_comercio = '" + id_comercio + "' and facturas_compra.borrado != '1'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Compras_listado.jTable1.getModel();
            for (int j = 0; j < Compras_listado.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) != null) {
                        rows[0] = rs.getObject(1).toString().trim();
                        rows[1] = rs.getObject(2).toString().trim();
                        rows[2] = rs.getObject(3).toString().trim();

                        if (rs.getObject(4) == null) {
                        } else {
                            rows[3] = rs.getObject(4);
                        }
                        if (rs.getObject(5) == null) {
                        } else {
                            rows[4] = getSepararMiles(rs.getObject(5).toString());
                        }
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras_listado.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_listado_cargar_jtable_con_numero() {
        try {
            ps = conexion.prepareStatement(""
                    + "select id_facturas_compra, nombre, numero, fecha_date, total from proveedor "
                    + "inner join facturas_compra on "
                    + "facturas_compra.id_proveedor = proveedor.id_proveedor "
                    + "where numero like '%" + Compras_listado.jTextField_numero.getText() + "%'"
                    + "and facturas_compra.id_comercio = '" + id_comercio + "' and facturas_compra.borrado != '1'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Compras_listado.jTable1.getModel();
            for (int j = 0; j < Compras_listado.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) != null) {
                        if (rs.getObject(i + 1).toString().length() > 1) {
                            rows[i] = rs.getObject(i + 1).toString().trim();
                        } else {
                            rows[i] = rs.getObject(i + 1);
                        }
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras_listado.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pedido_interno_seleccionado() {
        DefaultTableModel tm = (DefaultTableModel) Listado_de_pedidos_pendientes.jTable_pedidos.getModel();
        id_pedido_seleccionado = String.valueOf(tm.getValueAt(Listado_de_pedidos_pendientes.jTable_pedidos.getSelectedRow(), 0));
        new Pedidos_pendientes_terminar().setVisible(true);
    }

    public synchronized static void Pedido_interno_seleccionado_para_facturacion() {
        DefaultTableModel tm = (DefaultTableModel) Listado_de_pedidos_terminados.jTable_pedidos.getModel();
        id_pedido_seleccionado = String.valueOf(tm.getValueAt(Listado_de_pedidos_terminados.jTable_pedidos.getSelectedRow(), 0));
    }

    public synchronized static void Ventas_buscar_cliente_llevar_datos() {
        try {
            DefaultTableModel tm = (DefaultTableModel) Ventas_buscar_cliente.jTable_clientes.getModel();
            id_cliente = Integer.parseInt(String.valueOf(tm.getValueAt(Ventas_buscar_cliente.jTable_clientes.getSelectedRow(), 0)));
            String cliente_nombre = String.valueOf(tm.getValueAt(Ventas_buscar_cliente.jTable_clientes.getSelectedRow(), 1));

            Facturacion.jT_Cliente.setText(cliente_nombre.trim());

            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery("SELECT * FROM cliente where id_cliente = '" + id_cliente + "'");
            if (resultRC.next()) {
                Facturacion.jTextField_direccion.setText(resultRC.getString("direccion").trim());
                Facturacion.jTextField_telefono.setText(resultRC.getString("telefono").trim());
               Facturacion.jTextField_ruc.setText(resultRC.getString("ruc").trim());

                Facturacion_Terminar.jTextField_ruc.setText(resultRC.getString("ruc").trim());
                Facturacion_Terminar.jTextField_ci.setText(resultRC.getString("ci").trim());
                Facturacion_Terminar.jTextField_nombre.setText(resultRC.getString("nombre").trim());
            }
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET id_cliente = '" + id_cliente + "' "
                    + "WHERE id_cuenta ='" + id_cuenta + "'");
            Update2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Ventas_buscar_cliente_llevar_datos " + ex);
        }
    }

    public synchronized static void Cliente_update() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE cliente "
                    + "SET borrado_int = '1' "
                    + "WHERE id_cliente ='" + id_cliente + "'");
            Update2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Borrado.");
            Cliente_clear();
        } catch (SQLException ex) {
            System.err.println("Cliente_update " + ex);
        }
    }

    public synchronized static void Rubro_update() {
        try {
            error = false;
            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery("SELECT * FROM productos where id_productos_tipo = '" + id_rubro + "'");
            if (resultRC.next()) {
                error = true;
                JOptionPane.showMessageDialog(null, "No se puede borrar. Rubro utilizado en el producto: " + resultRC.getString("nombre").trim());
            }

            if (error == false) {
                PreparedStatement Update2 = conexion.prepareStatement(""
                        + "Delete from productos_tipo "
                        + "WHERE id_productos_tipo ='" + id_rubro + "'");
                Update2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Rubro Borrado");
            }

        } catch (SQLException ex) {
            System.err.println(ex);

        }
    }

    public synchronized static void Ubicacion_delete() {
        try {
            error = false;
            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery("SELECT * FROM productos where id_productos_ubicacion = '" + id_ubicacion + "'");
            if (resultRC.next()) {
                error = true;
                JOptionPane.showMessageDialog(null, "No se puede borrar. Ubicación utilizada en el producto: " + resultRC.getString("nombre").trim());
            }

            if (error == false) {
                PreparedStatement Update2 = conexion.prepareStatement(""
                        + "Delete from productos_ubicacion "
                        + "WHERE id_productos_ubicacion ='" + id_ubicacion + "'");
                Update2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Ubicación borrada");
            }

        } catch (SQLException ex) {
            System.err.println(ex);

        }
    }

    public synchronized static void Compras_update_numero_guardar() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE facturas_compra "
                    + "SET numero = '" + Compras_cambiar_numero_de_factura.jTextField_numero.getText() + "' "
                    + "WHERE id_facturas_compra ='" + id_facturas_compra + "'");
            Update2.executeUpdate();
            Compras_Buscar();
        } catch (SQLException ex) {
            System.err.println("Cliente_update " + ex);
        }
    }

    public synchronized static void Compras_update_borrar() {
        try {

            Statement ST2 = conexion.createStatement();
            ResultSet resultRC2 = ST2.executeQuery("SELECT * FROM facturas_compra_detalle WHERE id_facturas_compra ='" + id_facturas_compra + "'");
            while (resultRC2.next()) {
                double unidades_double = resultRC2.getInt("cantidad");
                id_producto = resultRC2.getInt("id_producto");
                Productos_Update(unidades_double, id_producto, -1);
            }
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE facturas_compra "
                    + "SET borrado = '1' "
                    + "WHERE id_facturas_compra ='" + id_facturas_compra + "'");
            Update2.executeUpdate();
            Compras_clear();
        } catch (SQLException ex) {
            System.err.println("Cliente_update " + ex);
        }
    }

    public synchronized static void Ventas_update_pagado() {
        try {
            int pagado = 0;
            String pagado_str = "";
            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery(""
                    + "SELECT * FROM cuenta_detalle "
                    + "where id_cuenta_detalle = '" + id_cuenta_detalle_facturacion + "'");
            if (resultRC.next()) {
                if (resultRC.getInt("pagado") == 1) {
                    pagado = 0;
                    pagado_str = "";
                }
                if (resultRC.getInt("pagado") == 0) {
                    pagado = 1;
                    pagado_str = " - PAGADO";
                }
            }
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE cuenta_detalle "
                    + "SET pagado = '" + pagado + "', "
                    + "pagado_str = '" + pagado_str + "' "
                    + "WHERE id_cuenta_detalle ='" + id_cuenta_detalle_facturacion + "'");
            Update2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Ventas_update_pagado " + ex);
        }

    }

    public synchronized static void Ventas_update_fecha() {
        try {
            if (NO_ventas.jDateChooser_fecha.getDate() != null) {
                java.sql.Date fecha = util_Date_to_sql_date(NO_ventas.jDateChooser_fecha.getDate());
                PreparedStatement Update2 = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET fecha_date = '" + fecha + "' "
                        + "WHERE id_cuenta ='" + id_cuenta + "'");
                Update2.executeUpdate();
                PreparedStatement Update3 = conexion.prepareStatement(""
                        + "UPDATE cuenta_detalle "
                        + "SET fecha_date = '" + fecha + "' "
                        + "WHERE id_cuenta ='" + id_cuenta + "'");
                Update3.executeUpdate();
            }
        } catch (SQLException ex) {
            System.err.println("Ventas_update_fecha " + ex);
        }
    }

    public synchronized static void Facturacion_update_fecha() {
        try {
            if (Facturacion.jDateChooser_fecha.getDate() != null) {
                java.sql.Date fecha = util_Date_to_sql_date(Facturacion.jDateChooser_fecha.getDate());
                PreparedStatement Update2 = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET fecha_date = '" + fecha + "' "
                        + "WHERE id_cuenta ='" + id_cuenta + "'");
                Update2.executeUpdate();
                PreparedStatement Update3 = conexion.prepareStatement(""
                        + "UPDATE cuenta_detalle "
                        + "SET fecha_date = '" + fecha + "' "
                        + "WHERE id_cuenta ='" + id_cuenta + "'");
                Update3.executeUpdate();
            }
        } catch (SQLException ex) {
            System.err.println("Ventas_update_fecha " + ex);
        }
    }

    public synchronized static void Pedidos_marcar_como_terminado() {
    }

    public synchronized static void Caja_apertura_guardar() {

        try {
            existe = false;
            Statement ST = conexion.createStatement();
            ResultSet RS1 = ST.executeQuery("SELECT * FROM caja where fecha_date = '" + Caja_apertura.jDateChooser2.getDate() + "'");
            if (RS1.next()) {
                existe = true;
            }

            if (existe == false) {

                int id_caja = 0;

                ResultSet resultRC = ST.executeQuery("SELECT MAX(id_caja) FROM caja");
                if (resultRC.next()) {
                    id_caja = resultRC.getInt(1) + 1;
                }

                java.sql.Date fecha_sql_date = util_Date_to_sql_date(Caja_apertura.jDateChooser2.getDate());

                PreparedStatement stReporteCaja = conexion.prepareStatement("INSERT INTO caja VALUES(?,?,?,?,?)");
                stReporteCaja.setInt(1, id_caja);
                stReporteCaja.setString(2, "");
                stReporteCaja.setLong(3, Long.valueOf(Caja_apertura.jTextField_monto.getText().replace(".", "")));
                stReporteCaja.setInt(4, 0);
                stReporteCaja.setDate(5, fecha_sql_date);

                stReporteCaja.executeUpdate();

                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            } else {

                PreparedStatement Update2 = conexion.prepareStatement(""
                        + "UPDATE caja "
                        + "SET monto = '" + Long.valueOf(Caja_apertura.jTextField_monto.getText().replace(".", "")) + "' "
                        + "WHERE fecha_date ='" + Caja_apertura.jDateChooser2.getDate() + "'");
                Update2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            }
        } catch (SQLException ex) {
            System.err.println("Caja_apertura_guardar " + ex);
        }

    }

    public synchronized static void Medio_de_pago_guardar() {

        try {
            int id = 0;
            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery("SELECT MAX(id_cuenta_detalle_de_pagos) FROM cuenta_detalle_de_pagos");
            if (resultRC.next()) {
                id = resultRC.getInt(1) + 1;
            }

            PreparedStatement stReporteCaja = conexion.prepareStatement("INSERT INTO cuenta_detalle_de_pagos VALUES(?,?,?,?,?,?)");
            stReporteCaja.setInt(1, id);
            stReporteCaja.setInt(2, id_cuenta);
            stReporteCaja.setInt(3, id_medio_de_pago);
            stReporteCaja.setString(4, Ventas_Terminar_con_medio_de_pago.jTextField_descripcion.getText());
            stReporteCaja.setString(5, Ventas_Terminar_con_medio_de_pago.jTextField_numero.getText());
            stReporteCaja.setLong(6, Long.parseLong(Ventas_Terminar_con_medio_de_pago.jTextField_total.getText().replace(".", "")));
            stReporteCaja.executeUpdate();

        } catch (SQLException ex) {
            System.err.println("Medio_de_pago_guardar " + ex);
        }

    }

    public synchronized static void Pedidos_cargar_a_factura() {

        try {

            Date hoy = null;
            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery("SELECT * FROM pedido_interno "
                    + "where id_pedido_interno = '" + id_pedido_seleccionado + "'");
            if (resultRC.next()) {
                id_cliente = resultRC.getInt("id_cliente");
                hoy = resultRC.getDate("fecha");
            }

            Statement stCuenta = conexion.createStatement();
            ResultSet rsCuentaSelectId = stCuenta.executeQuery("SELECT MAX(id_cuenta) FROM cuenta");
            if (rsCuentaSelectId.next()) {
                id_cuenta = rsCuentaSelectId.getInt(1) + 1;
            }

            java.sql.Date fecha_sql_date = util_Date_to_sql_date(hoy);

            factura = 0;
            if (habilitar_facturacion == 1) {
                factura = Configuracion_ultimo_numero_de_factura() + 1;
                Configuracion_update_ultima_factura_impresa_mas_1();
            }

            String factura_str = sucursal_numero + "-" + caja_numero + "-" + String.valueOf(factura);

            PreparedStatement stCuentaGuardar = conexion.prepareStatement("INSERT INTO cuenta VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stCuentaGuardar.setInt(1, id_cuenta);
            stCuentaGuardar.setInt(2, id_cliente);
            stCuentaGuardar.setInt(3, 10);
            stCuentaGuardar.setDouble(4, 0);
            stCuentaGuardar.setString(5, "---- -- --");
            stCuentaGuardar.setString(6, "ninguna");
            stCuentaGuardar.setLong(7, 0);
            stCuentaGuardar.setLong(8, 0);
            stCuentaGuardar.setLong(9, 0);
            stCuentaGuardar.setString(10, factura_str);
            stCuentaGuardar.setString(11, "");
            stCuentaGuardar.setString(12, "");
            stCuentaGuardar.setInt(13, Logueo.id_usuario);
            stCuentaGuardar.setInt(14, 0);
            stCuentaGuardar.setInt(15, id_comercio);
            stCuentaGuardar.setInt(16, 1);
            stCuentaGuardar.setDate(17, fecha_sql_date);
            stCuentaGuardar.executeUpdate();

            double total = 0;
            Statement ST2 = conexion.createStatement();
            ResultSet resultRC2 = ST2.executeQuery("SELECT * FROM pedido_interno_detalle "
                    + "where id_pedido_interno = '" + id_pedido_seleccionado + "'");
            while (resultRC2.next()) {

                int id = 0;
                Statement ST_Auxiliar_2 = conexion.createStatement();
                ResultSet RS_Auxiliar_2 = ST_Auxiliar_2.executeQuery("SELECT MAX(id_cuenta_detalle) FROM cuenta_detalle");
                if (RS_Auxiliar_2.next()) {
                    id = RS_Auxiliar_2.getInt(1) + 1;
                }
                int id_iva = 0;
                Statement ST_Auxiliar_3 = conexion.createStatement();
                ResultSet RS_Auxiliar_3 = ST_Auxiliar_3.executeQuery("SELECT * FROM productos where id_producto = '" + resultRC2.getInt("id_producto") + "'");
                if (RS_Auxiliar_3.next()) {
                    id_iva = RS_Auxiliar_3.getInt("id_iva");
                }
                double cero = 0;
                double cinco = 0;
                double diez = 0;

                if (id_iva == 1) {
                    diez = resultRC2.getDouble("total");
                }
                if (id_iva == 2) {
                    cinco = resultRC2.getDouble("total");
                }
                if (id_iva == 3) {
                    cero = resultRC2.getDouble("total");
                }

                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cuenta_detalle VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                st2.setInt(1, id);
                st2.setInt(2, Metodos.id_cuenta);
                st2.setInt(3, resultRC2.getInt("id_producto"));
                st2.setInt(4, resultRC2.getInt("precio"));
                st2.setDouble(5, resultRC2.getDouble("unidades"));
                st2.setDouble(6, diez + cinco + cero);
                st2.setString(7, "---- -- --");
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

                ultimo_producto_agregado_id_cuenta_detalle = id;
                total = total + diez + cinco + cero;
//                double unidades = resultRC2.getDouble("unidades");
                Productos_Update(resultRC2.getDouble("unidades"), resultRC2.getInt("id_producto"), -1);
            }

            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE pedido_interno "
                    + "SET estado = '3' WHERE id_pedido_interno ='" + id_pedido_seleccionado + "'");
            Update2.executeUpdate();
            long total_long = (new Double(total)).longValue();
            PreparedStatement Update3 = conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET total = '" + total_long + "' WHERE id_cuenta ='" + id_cuenta + "'");
            Update3.executeUpdate();

            Pedidos_cargar_listado_terminados();

            new NO_ventas().setVisible(true);

        } catch (SQLException ex) {
            System.err.println("Pedidos_cargar_a_factura " + ex);
        }

    }

    public synchronized static void Pedidos_guardar() {

        try {

            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery("SELECT MAX(id_pedido_interno) FROM pedido_interno");
            if (resultRC.next()) {
                id_pedido_interno = resultRC.getInt(1) + 1;
            }

            java.sql.Date fecha_sql_date = util_Date_to_sql_date(Pedidos.jDateChooser2.getDate());

            PreparedStatement stReporteCaja = conexion.prepareStatement("INSERT INTO pedido_interno VALUES(?,?,?,?,?)");
            stReporteCaja.setInt(1, id_pedido_interno);
            stReporteCaja.setInt(2, id_cliente);
            stReporteCaja.setDate(3, fecha_sql_date);
            stReporteCaja.setInt(4, 1);
            stReporteCaja.setString(5, Pedidos.jTextField_descripcion.getText());
            stReporteCaja.executeUpdate();

            Pedidos.jButton_guardar.setVisible(false);
            Pedidos.jTextField_producto.setEditable(true);
            Pedidos.jTextField_descripcion.setEditable(false);
            Pedidos.jTextField_producto.requestFocus();

            // JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
        } catch (SQLException ex) {
            System.err.println("Pedidos_guardar " + ex);
        }

    }

    public synchronized static void Pedidos_guardar_productos_en_detalle() {

        try {

            int id_pedido_interno_detalle = 0;
            Statement ST = conexion.createStatement();
            ResultSet resultRC = ST.executeQuery("SELECT MAX(id_pedido_interno_detalle) FROM pedido_interno_detalle");
            if (resultRC.next()) {
                id_pedido_interno_detalle = resultRC.getInt(1) + 1;
            }

            String total = Pedidos_agregar_producto.jTextField_Total.getText();
            total = total.replace(".", "");

            PreparedStatement stReporteCaja = conexion.prepareStatement("INSERT INTO pedido_interno_detalle VALUES(?,?,?,?,?,?,?)");
            stReporteCaja.setInt(1, id_pedido_interno_detalle);
            stReporteCaja.setInt(2, id_pedido_interno);
            stReporteCaja.setInt(3, Pedidos_agregar_producto.id_producto);
            stReporteCaja.setInt(4, Integer.parseInt(Pedidos_agregar_producto.jTextField_Unidades.getText()));
            stReporteCaja.setLong(5, Long.parseLong(Pedidos_agregar_producto.jTextField_Precio_Unitario.getText()));
            stReporteCaja.setLong(6, Long.parseLong(total));
            stReporteCaja.setLong(7, 1);
            stReporteCaja.executeUpdate();

            Pedidos.jButton_guardar.setVisible(false);
            Pedidos.jTextField_producto.setEditable(true);
            Pedidos.jTextField_descripcion.setEditable(false);

            Pedidos_actualizar_detalle();
        } catch (SQLException ex) {
            System.err.println("Pedidos_guardar_productos_en_detalle " + ex);
        }
    }

    public synchronized static void Pedidos_clean_detalle() {

        dtm = (DefaultTableModel) Pedidos.jTable_pedidos.getModel();
        for (int j = 0; j < Pedidos.jTable_pedidos.getRowCount(); j++) {
            dtm.removeRow(j);
            j -= 1;
        }
    }

    //Ancho máximo
    public static int MAX_WIDTH = 150;
    //Alto máximo
    public static int MAX_HEIGHT = 150;

    /*Este método es el de la magia recibe la ruta al archivo original y la ruta donde vamos a guardar la copia
     copyImage("C:\\Users\\IngenioDS\\Desktop\\test.png","C:\\Users\\IngenioDS\\Desktop\\Copia\\test2.png");*/
    public static void copyImage(String filePath, String copyPath) {
        BufferedImage bimage = loadImage(filePath);
        if (bimage.getHeight() > bimage.getWidth()) {
            int heigt = (bimage.getHeight() * MAX_WIDTH) / bimage.getWidth();
            bimage = resize(bimage, MAX_WIDTH, heigt);
            int width = (bimage.getWidth() * MAX_HEIGHT) / bimage.getHeight();
            bimage = resize(bimage, width, MAX_HEIGHT);
        } else {
            int width = (bimage.getWidth() * MAX_HEIGHT) / bimage.getHeight();
            bimage = resize(bimage, width, MAX_HEIGHT);
            int heigt = (bimage.getHeight() * MAX_WIDTH) / bimage.getWidth();
            bimage = resize(bimage, MAX_WIDTH, heigt);
        }
        saveImage(bimage, copyPath);
    }

    /*
     Este método se utiliza para cargar la imagen de disco
     */
    public static BufferedImage loadImage(String pathName) {
        BufferedImage bimage = null;
        try {
            bimage = ImageIO.read(new File(pathName));
        } catch (IOException e) {
            System.err.println(e);
        }
        return bimage;
    }

    /*
     Este método se utiliza para almacenar la imagen en disco
     */
    public synchronized static void saveImage(BufferedImage bufferedImage, String pathName) {
        try {
            String format = (pathName.endsWith(".png")) ? "png" : "jpg";
            File file = new File(pathName);
            file.getParentFile().mkdirs();
            ImageIO.write(bufferedImage, format, file);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /*
     Este método se utiliza para redimensionar la imagen
     */
    public synchronized static BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) {
        int w = bufferedImage.getWidth();
        int h = bufferedImage.getHeight();
        BufferedImage bufim = new BufferedImage(newW, newH, bufferedImage.getType());
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(bufferedImage, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return bufim;
    }

    public synchronized static void Pedidos_actualizar_detalle() {

        try {

            ps = conexion.prepareStatement(""
                    + "select id_pedido_interno_detalle, nombre, unidades, pedido_interno_detalle.precio, total "
                    + "from pedido_interno_detalle "
                    + "inner join productos on"
                    + " productos.id_producto = pedido_interno_detalle.id_producto "
                    + "where id_pedido_interno = '" + id_pedido_interno + "' "
                    + " ");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Pedidos.jTable_pedidos.getModel();
            for (int j = 0; j < Pedidos.jTable_pedidos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            long total = 0;

            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {

                total = rs.getLong("total") + total;

                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Pedidos.jTable_pedidos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            String totalString = String.valueOf(total);
            totalString = getSepararMiles(totalString);
            Pedidos.jTextField_total.setText(totalString);

            // Pedidos_actualizar_detalle();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Productos_delete() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE productos "
                    + "SET borrado_int = '1' "
                    + "WHERE id_producto ='" + id_producto + "'");
            Update2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto eliminado.");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Proveedor_buscar_por_ruc() {
        try {
            if (id_proveedor == 0) {
                if (Proveedor.JT_Ruc.getText().length() > 1) {
                    Statement ST = conexion.createStatement();
                    ResultSet RS = ST.executeQuery("Select * "
                            + "from proveedor "
                            + "WHERE ruc ='" + Proveedor.JT_Ruc.getText() + "'");
                    if (RS.next()) {
                        JOptionPane.showMessageDialog(null, "R.U.C. registrado. Se mostrarán los datos del comercio");

                        Proveedor.JT_Nombre.setText(RS.getString("nombre").trim());
                        Proveedor.JT_Direccion.setText(RS.getString("direccion").trim());
                        Proveedor.JT_Descripcion.setText(RS.getString("descripcion").trim());
                        Proveedor.JT_Nombre_Vendedor.setText(RS.getString("nombre_vendedor").trim());
                        Proveedor.JT_Ruc.setText(RS.getString("ruc").trim());
                        Proveedor.JT_Telefono.setText(RS.getString("telefono").trim());
                        Proveedor.JT_Telefono_Vendedor.setText(RS.getString("telefono_vendedor").trim());
                        Proveedor.jButton_borrar.setVisible(true);
                        Proveedor.JT_Nombre.setEditable(true);

                    }
                }
            } else if (Proveedor.JT_Ruc.getText().length() > 1) {
                Statement ST = conexion.createStatement();
                ResultSet RS = ST.executeQuery("Select * "
                        + "from proveedor "
                        + "WHERE ruc ='" + Proveedor.JT_Ruc.getText() + "' "
                        + "and id_proveedor != '" + id_proveedor + "'");
                if (RS.next()) {
                    JOptionPane.showMessageDialog(null, "R.U.C. registrado. Se mostrarán los datos del comercio");

                    Proveedor.JT_Nombre.setText(RS.getString("nombre").trim());
                    Proveedor.JT_Direccion.setText(RS.getString("direccion").trim());
                    Proveedor.JT_Descripcion.setText(RS.getString("descripcion").trim());
                    Proveedor.JT_Nombre_Vendedor.setText(RS.getString("nombre_vendedor").trim());
                    Proveedor.JT_Ruc.setText(RS.getString("ruc").trim());
                    Proveedor.JT_Telefono.setText(RS.getString("telefono").trim());
                    Proveedor.JT_Telefono_Vendedor.setText(RS.getString("telefono_vendedor").trim());
                    Proveedor.jButton_borrar.setVisible(true);
                    Proveedor.JT_Nombre.setEditable(true);
                }
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Proveedores_delete() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE proveedor "
                    + "SET borrado_int = '1' "
                    + "WHERE id_proveedor ='" + id_proveedor + "'");
            Update2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Proveedor eliminado.");

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Productos_Proveedor_cargar_datos() {

        try {
            DefaultTableModel tm = (DefaultTableModel) Proveedor_buscar.jTable_proveedores.getModel();
            id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Proveedor_buscar.jTable_proveedores.getSelectedRow(), 0)));

            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM proveedor where id_proveedor = '" + id_proveedor + "'");
            if (RS.next()) {
                if (RS.getString("nombre") == null) {
                    System.out.println("nombre NULL");
                } else {
                    Proveedor.JT_Nombre.setText(RS.getString("nombre").trim());
                }

                if (RS.getString("direccion") == null) {
                    System.out.println("Direccion NULL");
                } else {
                    Proveedor.JT_Direccion.setText(RS.getString("direccion").trim());
                }

                if (RS.getString("descripcion") == null) {
                    System.out.println("descripcion NULL");
                } else {
                    Proveedor.JT_Descripcion.setText(RS.getString("descripcion").trim());
                }

                if (RS.getString("nombre_vendedor") == null) {
                    System.out.println("nombre_vendedor NULL");
                } else {
                    Proveedor.JT_Nombre_Vendedor.setText(RS.getString("nombre_vendedor").trim());
                }
                if (RS.getString("ruc") == null) {
                    System.out.println("ruc NULL");
                } else {
                    Proveedor.JT_Ruc.setText(RS.getString("ruc").trim());
                }
                if (RS.getString("telefono") == null) {
                    System.out.println("telefono NULL");
                } else {
                    Proveedor.JT_Telefono.setText(RS.getString("telefono").trim());
                }
                if (RS.getString("telefono_vendedor") == null) {
                    System.out.println("telefono_vendedor NULL");
                } else {
                    Proveedor.JT_Telefono_Vendedor.setText(RS.getString("telefono_vendedor").trim());
                }

                Proveedor.jButton_borrar.setVisible(true);

                Proveedor.JT_Nombre.requestFocus();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Stock_bajo_Productos_seleccionar() {
        DefaultTableModel tm = (DefaultTableModel) Productos_con_stock_bajo_proveedores.jTable_proveedores.getModel();
        id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Productos_con_stock_bajo_proveedores.jTable_proveedores.getSelectedRow(), 0)));
        Productos_con_stock_bajo.jTextField_proveedor.setText(String.valueOf(tm.getValueAt(Productos_con_stock_bajo_proveedores.jTable_proveedores.getSelectedRow(), 1)));
    }

    public synchronized static void Productos_precio_seleccionar() {
        DefaultTableModel tm = (DefaultTableModel) Producto_ABM.jTable_precios.getModel();
        id_productos_precio = Integer.parseInt(String.valueOf(tm.getValueAt(Producto_ABM.jTable_precios.getSelectedRow(), 0)));
    }

    public synchronized static void Productos_Proveedor_llevar_datos() {

        DefaultTableModel tm = (DefaultTableModel) Productos_buscar_proveedores.jTable_proveedores.getModel();
        id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Productos_buscar_proveedores.jTable_proveedores.getSelectedRow(), 0)));
        String nombre = String.valueOf(tm.getValueAt(Productos_buscar_proveedores.jTable_proveedores.getSelectedRow(), 1));
        Producto_ABM.producto_proveedor.setText(nombre);

    }

    public synchronized static void Cotizacion_obtener() {
        try {
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM configuracion where id_comercio = '" + id_comercio + "'");
            if (RS.next()) {
                Cotizacion.jt_dolar.setText(RS.getString("dolar"));
                Cotizacion.jt_peso.setText(RS.getString("peso"));
                Cotizacion.jt_real.setText(RS.getString("real_moneda"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Configuracion_obtener_datos() {
        try {
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM configuracion where id_comercio = '" + id_comercio + "'");
            if (RS.next()) {
                if (RS.getInt("pedidos") == 1) {
                    Configuraciones.jCheckBox_pedidos.setSelected(true);
                }
                if (RS.getInt("pedidos") == 0) {
                    Configuraciones.jCheckBox_pedidos.setSelected(false);
                }
                if (RS.getInt("habilitar_pagado_en_cuenta_detalle") == 1) {
                    habilitar_control_individual_de_pago = 1;
                    Configuraciones.jCheckBox_pagado.setSelected(true);
                }
                if (RS.getInt("habilitar_pagado_en_cuenta_detalle") == 0) {
                    habilitar_control_individual_de_pago = 0;
                    Configuraciones.jCheckBox_pagado.setSelected(false);
                }
                if (RS.getInt("precio_automatico") == 1) {
                    Configuraciones.jCheckBox_precio_automatico.setSelected(true);
                }
                if (RS.getInt("precio_automatico") == 0) {
                    Configuraciones.jCheckBox_precio_automatico.setSelected(false);
                }
                if (RS.getInt("alerta_stock") == 0) {
                    Configuraciones.jCheckBox_alerta_stock.setSelected(false);
                } else {
                    Configuraciones.jCheckBox_alerta_stock.setSelected(true);
                }
                if (RS.getInt("ventas_a_credito") == 0) {
                    Configuraciones.jCheckBox_ventas_a_credito.setSelected(false);
                } else {
                    Configuraciones.jCheckBox_ventas_a_credito.setSelected(true);
                }
                if (RS.getInt("habilitar_medio_de_pago") == 0) {
                    Configuraciones.jCheckBox_medio_de_pago.setSelected(false);
                } else {
                    Configuraciones.jCheckBox_medio_de_pago.setSelected(true);
                }
                if (RS.getInt("bloquear_facturas") == 0) {
                    Configuraciones.jCheckBox_bloquear.setSelected(false);
                } else {
                    Configuraciones.jCheckBox_bloquear.setSelected(true);
                }
                if (RS.getInt("recargo") == 0) {
                    recargo = 0;
                    Configuraciones.jCheckBox_recargo.setSelected(false);
                } else {
                    recargo = 1;
                    Configuraciones.jCheckBox_recargo.setSelected(true);
                }
                Configuraciones.jTextField_productos.setText(RS.getString("productos_por_factura"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_iniciar_datos() {
        try {
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM configuracion where id_comercio = '" + id_comercio + "'");
            if (RS.next()) {
                if (RS.getInt("habilitar_pagado_en_cuenta_detalle") == 1) {
                    habilitar_control_individual_de_pago = 1;
                } else {
                    habilitar_control_individual_de_pago = 0;
                }
                if (RS.getInt("habilitar_medio_de_pago") == 1) {
                    habilitar_medio_de_pago = 1;
                } else {
                    habilitar_medio_de_pago = 0;
                }
                if (RS.getInt("bloquear_facturas") == 1) {
                    bloquear_facturas = 1;
                } else {
                    bloquear_facturas = 0;
                }
                if (RS.getInt("alerta_stock") == 1) {
                    alerta_stock = 1;
                } else {
                    alerta_stock = 0;
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Cliente_editar_cargar_datos() {

        DefaultTableModel tm = (DefaultTableModel) Cliente_buscar.jTable_clientes.getModel();
        id_cliente = Integer.parseInt(String.valueOf(tm.getValueAt(Cliente_buscar.jTable_clientes.getSelectedRow(), 0)));

        try {
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM cliente where id_cliente = '" + id_cliente + "'");
            if (RS.next()) {
                Cliente_ABM.jt_nombre.setText(RS.getString("nombre").trim());
                if (RS.getString("ci").length() > 0) {
                    Cliente_ABM.jTextField_ci.setText(RS.getString("ci").trim());
                }
                if (RS.getString("ruc").length() > 0) {
                    Cliente_ABM.jt_ruc.setText(RS.getString("ruc").trim());
                }
                if ((RS.getString("email") != null)) {
                    if ((RS.getString("email").length() > 0)) {
                        Cliente_ABM.jt_email.setText(RS.getString("email").trim());
                    }
                }
                if (RS.getString("direccion").length() > 0) {
                    Cliente_ABM.jt_direccion.setText(RS.getString("direccion").trim());
                }
                if (RS.getString("telefono").length() > 0) {
                    Cliente_ABM.jt_telefono.setText(RS.getString("telefono").trim());
                }
                Cliente_ABM.jDateChooser_cumpleanos.setDate(RS.getDate("cumpleanos"));
                Cliente_ABM.jt_nombre.setEditable(true);
//                Cliente_ABM.jButton_historial.setVisible(true);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Rubro_editar_cargar_datos() {

        DefaultTableModel tm = (DefaultTableModel) Rubro.jTable_Rubro.getModel();
        id_rubro = Integer.parseInt(String.valueOf(tm.getValueAt(Rubro.jTable_Rubro.getSelectedRow(), 0)));

        try {
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM productos_tipo where id_productos_tipo = '" + id_rubro + "'");
            if (RS.next()) {
                Rubro_ABM.jTextField_rubro.setText(RS.getString("productos_tipo").trim());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Ubicacion_editar_cargar_datos() {

        DefaultTableModel tm = (DefaultTableModel) Ubicacion.jTable_clientes.getModel();
        id_ubicacion = Integer.parseInt(String.valueOf(tm.getValueAt(Ubicacion.jTable_clientes.getSelectedRow(), 0)));

        try {
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM productos_ubicacion where id_productos_ubicacion = '" + id_ubicacion + "'");
            if (RS.next()) {
                Ubicacion_ABM.jTextField_ubicacion.setText(RS.getString("ubicacion").trim());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Productos_ubicacion_cargar_desde_lista() {
        DefaultTableModel tm = (DefaultTableModel) Productos_ubicacion_buscar.jTable1.getModel();
        id_ubicacion = Integer.parseInt(String.valueOf(tm.getValueAt(Productos_ubicacion_buscar.jTable1.getSelectedRow(), 0)));
        Producto_ABM.ubicacion.setText(String.valueOf(tm.getValueAt(Productos_ubicacion_buscar.jTable1.getSelectedRow(), 1)));
    }

    public synchronized static void Listado_clientes_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cliente_historial.jTable_clientes.getModel();
        id_cliente_listado = Integer.parseInt(String.valueOf(tm.getValueAt(Cliente_historial.jTable_clientes.getSelectedRow(), 0)));
        Cliente_historial.jTextField_cliente.setText(String.valueOf(tm.getValueAt(Cliente_historial.jTable_clientes.getSelectedRow(), 1)));
    }

    public synchronized static void Pedidos_Cliente_editar_cargar_datos() {

        DefaultTableModel tm = (DefaultTableModel) Pedidos_buscar_cliente.jTable_clientes.getModel();
        id_cliente = Integer.parseInt(String.valueOf(tm.getValueAt(Pedidos_buscar_cliente.jTable_clientes.getSelectedRow(), 0)));
        System.out.println("id_cliente:" + id_cliente);
        Pedidos.jTextField_cliente.setText(String.valueOf(tm.getValueAt(Pedidos_buscar_cliente.jTable_clientes.getSelectedRow(), 1)));

    }

    public synchronized static void Buscar_proveedor_cargar_lista() {
        try {

            ps = conexion.prepareStatement(""
                    + "select * "
                    + "from proveedor "
                    + "where nombre like '%" + Proveedor_buscar.jT_Buscar_proveedor.getText() + "%' "
                    + " and borrado_int != '1' and id_comercio = '" + id_comercio + "'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Proveedor_buscar.jTable_proveedores.getModel();
            for (int j = 0; j < Proveedor_buscar.jTable_proveedores.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) == null) {
                        System.err.println("Es NULL");
                    } else if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Proveedor_buscar.jTable_proveedores.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Stock_bajo_Buscar_proveedor_cargar_lista() {
        try {
            ps = conexion.prepareStatement(""
                    + "select id_proveedor, nombre, telefono, ruc "
                    + "from proveedor "
                    + "where nombre like '%" + Productos_con_stock_bajo_proveedores.jT_Buscar_proveedor.getText() + "%' "
                    + " and borrado_int != '1' and id_comercio = '" + id_comercio + "'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Productos_con_stock_bajo_proveedores.jTable_proveedores.getModel();
            for (int j = 0; j < Productos_con_stock_bajo_proveedores.jTable_proveedores.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Productos_con_stock_bajo_proveedores.jTable_proveedores.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public static boolean dato = false;

    public synchronized static void Pedidos_cargar_listado() {
        try {

            ps = conexion.prepareStatement("select pedido_interno_detalle.id_pedido_interno_detalle, descripcion, nombre, unidades "
                    + "                    from pedido_interno "
                    + "                    inner join pedido_interno_detalle on pedido_interno.id_pedido_interno = pedido_interno_detalle.id_pedido_interno "
                    + "                    inner join productos on productos.id_producto = pedido_interno_detalle.id_producto "
                    + "                    where pedido_interno.estado = '1' and pedido_interno_detalle.estado = '1' ");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Listado_de_pedidos_pendientes.jTable_pedidos.getModel();
            for (int j = 0; j < Listado_de_pedidos_pendientes.jTable_pedidos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            dato = false;
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {

                dato = true;

                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Listado_de_pedidos_pendientes.jTable_pedidos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
//
//            dtm = (DefaultTableModel) Listado_de_pedidos_pendientes.jTable_pedidos_detalle.getModel();
//            for (int j = 0; j < Listado_de_pedidos_pendientes.jTable_pedidos_detalle.getRowCount(); j++) {
//                dtm.removeRow(j);
//                j -= 1;
//            }

        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Pedidos_cargar_listado_espera() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_pedido_interno, descripcion "
                    + "from pedido_interno "
                    + "where estado = '1' or estado = '2'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Pedidos_en_espera.jTable_pedidos.getModel();
            for (int j = 0; j < Pedidos_en_espera.jTable_pedidos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            dato = false;
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {

                dato = true;

                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Pedidos_en_espera.jTable_pedidos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Pedidos_cargar_listado_terminados() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_pedido_interno, descripcion, nombre "
                    + "from pedido_interno "
                    + " inner join cliente on"
                    + " cliente.id_cliente = pedido_interno.id_cliente "
                    + "where estado = '2'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Listado_de_pedidos_terminados.jTable_pedidos.getModel();
            for (int j = 0; j < Listado_de_pedidos_terminados.jTable_pedidos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Listado_de_pedidos_terminados.jTable_pedidos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Productos_Buscar_proveedor_cargar_lista() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_proveedor, nombre, telefono, ruc "
                    + "from proveedor "
                    + "where nombre like '%" + Productos_buscar_proveedores.jT_Buscar_proveedor.getText() + "%' "
                    + "and id_comercio = '" + id_comercio + "' order by nombre");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Productos_buscar_proveedores.jTable_proveedores.getModel();
            for (int j = 0; j < Productos_buscar_proveedores.jTable_proveedores.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Productos_buscar_proveedores.jTable_proveedores.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Buscar_cliente_cargar_lista() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_cliente, nombre, ci, ruc, telefono "
                    + "from cliente "
                    + "where (nombre LIKE '%" + Cliente_buscar.jT_Buscar.getText() + "%')  "
                    + "and borrado_int != '1' "
                    + "order by nombre");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Cliente_buscar.jTable_clientes.getModel();
            for (int j = 0; j < Cliente_buscar.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cliente_buscar.jTable_clientes.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Buscar_ubicaciones_cargar_lista() {
        try {
            ps = conexion.prepareStatement(""
                    + "select id_productos_ubicacion, ubicacion "
                    + "from productos_ubicacion "
                    + "where borrado != '1' and  "
                    + "id_productos_ubicacion > 0 "
                    + "order by ubicacion");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Productos_ubicacion_buscar.jTable1.getModel();
            for (int j = 0; j < Productos_ubicacion_buscar.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Productos_ubicacion_buscar.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Facturas_credito_buscar_cliente_cargar_lista() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_cuenta, nombre, fecha_date, factura, total, generar_recibo_str "
                    + "from cliente "
                    + "inner join cuenta on cuenta.id_cliente = cliente.id_cliente "
                    + "where nombre like '%" + Facturas_a_credito.jTextField_buscar.getText() + "%' "
                    + "and tipo = '2' "
                    + "and id_estado != '11' "
                    + "and cuenta.id_estado != '9' "
                    + "and cliente.borrado_int != '1' "
                    + "order by id_cuenta DESC");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Facturas_a_credito.jTable_facturas.getModel();
            for (int j = 0; j < Facturas_a_credito.jTable_facturas.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    if (rs.getObject(i + 1) != null) {
                        if (rs.getObject(i + 1).toString().length() > 1) {
                            rows[i] = rs.getObject(i + 1).toString().trim();
                        } else {
                            rows[i] = rs.getObject(i + 1);
                        }
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Facturas_a_credito.jTable_facturas.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

            Facturas_a_credito.jTextField_total.setText("0");
            Statement ST_Productos7 = conexion.createStatement();
            ResultSet RS_Productos7 = ST_Productos7.executeQuery(""
                    + "select SUM(total) from cuenta "
                    + "where generar_recibo = '1' ");
            if (RS_Productos7.next()) {
                if (RS_Productos7.getLong(1) > 0) {
                    String str_puntitos = getSepararMiles(RS_Productos7.getString(1));
                    Facturas_a_credito.jTextField_total.setText(str_puntitos);
                }
            }

        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Clientes_estado_de_cuenta_buscar_cliente_cargar_lista() {
        try {
            dtm = (DefaultTableModel) Cliente_estado_de_cuenta.jTable_recibos.getModel();
            for (int j = 0; j < Cliente_estado_de_cuenta.jTable_recibos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            dtm = (DefaultTableModel) Cliente_estado_de_cuenta.jTable_facturas.getModel();
            for (int j = 0; j < Cliente_estado_de_cuenta.jTable_facturas.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ps = conexion.prepareStatement(""
                    + "select id_recibo, id_recibo, fecha, cliente.nombre, concepto, dinero_entregado "
                    + "from cliente "
                    + "inner join recibos on recibos.id_cliente = cliente.id_cliente "
                    + "where cliente.nombre like '%" + Cliente_estado_de_cuenta.jTextField_buscar.getText() + "%' "
                    + "and cliente.borrado_int != '1' "
                    + "order by id_recibo DESC ");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) != null) {
                        if (rs.getObject(i + 1).toString().length() > 1) {
                            rows[0] = rs.getObject(1).toString().trim();
                            rows[1] = rs.getObject(2).toString().trim();
                            rows[2] = rs.getObject(3).toString().trim();
                            rows[3] = rs.getObject(4).toString().trim();
                            rows[4] = rs.getObject(5).toString().trim();
                            rows[5] = getSepararMiles(rs.getObject(6).toString());
                        }
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cliente_estado_de_cuenta.jTable_recibos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            ps = conexion.prepareStatement(""
                    + "select cuenta.id_cuenta, factura,  cuenta.fecha_date, cliente.nombre, productos.nombre, "
                    + "cuenta_detalle.cantidad, cuenta_detalle.precio, cuenta_detalle.total "
                    + "from cliente "
                    + "inner join cuenta on cuenta.id_cliente = cliente.id_cliente "
                    + "inner join cuenta_detalle on cuenta_detalle.id_cuenta = cuenta.id_cuenta "
                    + "inner join productos on productos.id_producto = cuenta_detalle.id_producto "
                    + "where cliente.nombre like '%" + Cliente_estado_de_cuenta.jTextField_buscar.getText() + "%' "
                    + "and tipo = '2' "
                    + "and id_estado != '11' "
                    + "and cuenta.id_estado != '9' "
                    + "and cliente.borrado_int != '1' "
                    + "order by id_cuenta DESC ");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) != null) {
                        if (rs.getObject(i + 1).toString().length() > 1) {
                            rows[0] = rs.getObject(1).toString().trim();
                            rows[1] = rs.getObject(2).toString().trim();
                            rows[2] = rs.getObject(3).toString().trim();
                            rows[3] = rs.getObject(4).toString().trim();
                            rows[4] = rs.getObject(5).toString().trim();
                            rows[5] = rs.getObject(6);
                            rows[6] = getSepararMiles(rs.getObject(7).toString());
                            rows[7] = getSepararMiles(rs.getObject(8).toString());
                        }
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cliente_estado_de_cuenta.jTable_facturas.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

            long recibos = 0;
            Cliente_estado_de_cuenta.jTextField_total.setText("0");

            Statement ST_Productos8 = conexion.createStatement();
            ResultSet RS_Productos8 = ST_Productos8.executeQuery(""
                    + "select SUM(dinero_entregado) "
                    + "from cliente "
                    + "inner join recibos on recibos.id_cliente = cliente.id_cliente "
                    + "where cliente.nombre like '%" + Cliente_estado_de_cuenta.jTextField_buscar.getText() + "%' "
                    + "and cliente.borrado_int != '1' ");
            if (RS_Productos8.next()) {
                recibos = RS_Productos8.getLong(1);
            }

            Statement ST_Productos7 = conexion.createStatement();
            ResultSet RS_Productos7 = ST_Productos7.executeQuery(""
                    + "select SUM(cuenta_detalle.total) "
                    + "from cliente "
                    + "inner join cuenta on cuenta.id_cliente = cliente.id_cliente "
                    + "inner join cuenta_detalle on cuenta_detalle.id_cuenta = cuenta.id_cuenta "
                    + "inner join productos on productos.id_producto = cuenta_detalle.id_producto "
                    + "where cliente.nombre like '%" + Cliente_estado_de_cuenta.jTextField_buscar.getText() + "%' "
                    + "and tipo = '2' "
                    + "and id_estado != '11' "
                    + "and cuenta.id_estado != '9' "
                    + "and cliente.borrado_int != '1' ");
            if (RS_Productos7.next()) {
                if (RS_Productos7.getLong(1) > 0) {
                    long total = RS_Productos7.getLong(1) - recibos;
                    String str_puntitos = getSepararMiles(String.valueOf(total));
                    Cliente_estado_de_cuenta.jTextField_total.setText(str_puntitos);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Listado_de_ventas_Buscar_cliente_cargar_lista() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_cliente, nombre, ci, ruc, telefono "
                    + "from cliente "
                    + "where nombre like '%" + Cliente_historial.jTextField_buscar.getText() + "%' "
                    + "and borrado_int != '1' "
                    + "order by nombre");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Cliente_historial.jTable_clientes.getModel();
            for (int j = 0; j < Cliente_historial.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cliente_historial.jTable_clientes.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Pedidos_Buscar_cliente_cargar_lista() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_cliente, nombre, ci, ruc, telefono "
                    + "from cliente "
                    + "where nombre like '%" + Pedidos_buscar_cliente.jT_Buscar.getText() + "%'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Pedidos_buscar_cliente.jTable_clientes.getModel();
            for (int j = 0; j < Pedidos_buscar_cliente.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Pedidos_buscar_cliente.jTable_clientes.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Ventas_Buscar_cliente_cargar_lista() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_cliente, nombre, ci, ruc, telefono "
                    + "from cliente "
                    + "where nombre like '%" + Ventas_buscar_cliente.jT_Buscar.getText() + "%' "
                    + "and id_comercio = '" + id_comercio + "' "
                    + "and borrado_int != '1' ");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Ventas_buscar_cliente.jTable_clientes.getModel();
            for (int j = 0; j < Ventas_buscar_cliente.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Ventas_buscar_cliente.jTable_clientes.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Usuarios_control_cargar_lista() {
        try {

            ps = conexion.prepareStatement(""
                    + "select id_usuario, nombre_real "
                    + "from usuario "
                    + "where id_comercio = '" + id_comercio + "'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Usuarios_control.jTable_usuarios.getModel();
            for (int j = 0; j < Usuarios_control.jTable_usuarios.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Usuarios_control.jTable_usuarios.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Imprimir_ticket() {

        try {
            PrintService service = PrintServiceLookup.lookupDefaultPrintService();
            DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;

            DocPrintJob pj = service.createPrintJob();
            String SS_Titulo = new String("pipa \nRUC: 4113625-0 Telef: 0761265492");
            byte[] bytesTitulo;
            bytesTitulo = SS_Titulo.getBytes();
            Doc IMP_Titulo = new SimpleDoc(bytesTitulo, flavor, null);
            pj.print(IMP_Titulo, null);

            DocPrintJob PJ_Pago = service.createPrintJob();
            String SS_Pago = new String("\nTipo de Pago: ");
            byte[] bytesPago;
            bytesPago = SS_Pago.getBytes();
            Doc IMP_Pago = new SimpleDoc(bytesPago, flavor, null);
            PJ_Pago.print(IMP_Pago, null);

            DocPrintJob PJ_Cliente = service.createPrintJob();
            String SS_Cliente = new String("\nCliente: ");
            byte[] bytesCliente;
            bytesCliente = SS_Cliente.getBytes();
            Doc IMP_cliente = new SimpleDoc(bytesCliente, flavor, null);
            PJ_Cliente.print(IMP_cliente, null);

            DocPrintJob PJ_Detalle = service.createPrintJob();
            String SS_Detalle = new String("\n ### Detalle de Venta ### - ");
            byte[] bytesDetalle;
            bytesDetalle = SS_Detalle.getBytes();
            Doc IMP_Detalle = new SimpleDoc(bytesDetalle, flavor, null);
            PJ_Detalle.print(IMP_Detalle, null);

            long total_detalle = 0;

            Statement ST = conexion.createStatement();
            ResultSet rsAuxiliar5 = ST.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
            while (rsAuxiliar5.next()) {
                DocPrintJob PJ_Producto = service.createPrintJob();
                String SS_Producto = new String("\n" + rsAuxiliar5.getString("id_cuenta_detralle"));
                byte[] bytesProducto;
                bytesProducto = SS_Producto.getBytes();
                Doc IMP_Producto = new SimpleDoc(bytesProducto, flavor, null);
                PJ_Producto.print(IMP_Producto, null);
                total_detalle = (total_detalle + rsAuxiliar5.getLong("total"));
            }

            DocPrintJob PJ_Pie = service.createPrintJob();
            String SS_Pie = new String("\nTotal: " + total_detalle + " Gs.\n");
            byte[] bytesPie;
            bytesPie = SS_Pie.getBytes();
            Doc IMP_Pie = new SimpleDoc(bytesPie, flavor, null);
            PJ_Pie.print(IMP_Pie, null);

            DocPrintJob PJ_Dinero = service.createPrintJob();
            String SS_Dinero = new String("\nDinero:  Gs. Vuelto:  Gs. \nGracias por su preferencia\n\n\n\n\n\n\n'");
            byte[] bytesDinero;
            bytesDinero = SS_Dinero.getBytes();
            Doc IMP_Dinero = new SimpleDoc(bytesDinero, flavor, null);
            PJ_Dinero.print(IMP_Dinero, null);
        } catch (PrintException | SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized static void Configuracion_impresion_traer_datos() {
        try {
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM configuracion where id_comercio = '" + id_comercio + "'");
            if (RS.next()) {
                Configuracion_impresion.jTextField_ultimo_numero_factura.setText(RS.getString("factura"));
                Configuracion_impresion.jTextField_timbrado.setText(RS.getString("timbrado"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Stock_bajo() {

        try {
            int de = 0;
            int a = 99999;

            if (id_proveedor > 0) {
                de = id_proveedor;
                a = id_proveedor;
            }

            Map parametros = new HashMap();
            parametros.put("de", de);
            parametros.put("a", a);

            String path = ubicacion_proyecto + "\\reportes\\stock_bajo.jasper";

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);

            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException e) {
            System.out.println(e);
        }
    }

    public synchronized static void Cuenta_imprimir(String ruc) {
        try {
            boolean factura_ya_descontada_de_stock = false;
            boolean presupuesto = false;
            long iva_10 = 0;
            long iva_5 = 0;
            long iva_0 = 0;

            long total = 0;
            long total_iva = 0;
            String total_str = null;

            int estado = 10;

            Cliente_nombre_por_ruc(ruc);

            if (venta_terminar == 1) {
                if (Facturacion_Terminar.jCheckBox_presupuesto.isSelected() == true) {
                    estado = 9;
                    presupuesto = true;
                }
            }
            if (venta_terminar_con_nedio_de_pago == 1) {
                if (Ventas_Terminar_con_medio_de_pago.jCheckBox_presupuesto.isSelected() == true) {
                    estado = 9;
                    presupuesto = true;
                }
            }

            Statement ST33 = conexion.createStatement();
            ResultSet RS33 = ST33.executeQuery(""
                    + "SELECT * FROM cuenta "
                    + "where id_cuenta = '" + id_cuenta + "'"
                    + "and id_estado = '9'");
            if (RS33.next()) {
                factura_ya_descontada_de_stock = true;
            }

            Statement ST3 = conexion.createStatement();
            ResultSet RS3 = ST3.executeQuery(""
                    + "SELECT * FROM cuenta "
                    + "where id_cuenta = '" + id_cuenta + "'");
            if (RS3.next()) {

                PreparedStatement Update2 = conexion.prepareStatement("UPDATE cuenta SET print = '0' WHERE print ='1'");
                Update2.executeUpdate();

                PreparedStatement Update3 = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET print = '1', "
                        + "id_estado = '" + estado + "', "
                        + "id_cliente = '" + id_cliente + "', "
                        + "dinero = '" + Facturacion_Terminar.dinero + "', "
                        + "vuelto = '" + Facturacion_Terminar.vuelto + "' "
                        + "WHERE id_cuenta='" + id_cuenta + "'");
                Update3.executeUpdate();

            }

            Statement ST31 = conexion.createStatement();
            ResultSet RS31 = ST31.executeQuery(""
                    + "SELECT * FROM cuenta_detalle "
                    + "where id_cuenta = '" + id_cuenta + "'");
            while (RS31.next()) {
                iva_10 = (iva_10 + RS31.getLong("diez") / 11);
                iva_5 = (iva_5 + RS31.getLong("cinco") / 21);
                iva_0 = iva_0 + RS31.getLong("exentas");
                total_iva = iva_0 + iva_5 + iva_10;
                total = RS31.getLong("diez") + RS31.getLong("cinco") + RS31.getLong("exentas") + total;

            }
            total_str = Numero_a_String(total);
            boolean existe = false;
            Statement st3 = conexion.createStatement();
            ResultSet result3 = st3.executeQuery("SELECT * FROM imprimir_cuenta_pie where id_cuenta ='" + id_cuenta + "'");
            if (result3.next()) {
                existe = true;
            }
            if (existe == false) {

                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id) FROM imprimir_cuenta_pie");
                if (result.next()) {
                    id = result.getInt(1) + 1;
                }

                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO imprimir_cuenta_pie VALUES(?,?,?,?,?,?,?,?)");
                st2.setInt(1, id);
                st2.setInt(2, id_cuenta);
                st2.setLong(3, iva_0);
                st2.setLong(4, iva_5);
                st2.setLong(5, iva_10);
                st2.setLong(6, total);
                st2.setString(7, total_str);
                st2.setLong(8, total_iva);
                st2.executeUpdate();
            } else {
                PreparedStatement Update3 = conexion.prepareStatement(""
                        + "UPDATE imprimir_cuenta_pie "
                        + "SET iva0 = '" + iva_0 + "', "
                        + "iva5 = '" + iva_5 + "', "
                        + "iva10 = '" + iva_10 + "', "
                        + "total = '" + total + "', "
                        + "total_letras = '" + total_str + "', "
                        + "total_iva = '" + total_iva + "' "
                        + "WHERE id_cuenta='" + id_cuenta + "'");
                Update3.executeUpdate();
            }

            if (presupuesto == true) {
                if (factura_ya_descontada_de_stock == false) {
                    Metodos.Factura_presupuesto();
                }

                // BuscarFactura_facturacion();
                Map parametros = new HashMap();
                String path = ubicacion_proyecto + "\\reportes\\presupuesto.jasper"; // pipas bar
                ubicacion_proyecto = ubicacion_proyecto.replace("\\", "\\\\");
                System.err.println(ubicacion_proyecto + "\\\\reportes\\\\factura_con_logo_detalle_pipas.");
                parametros.put("direccion", ubicacion_proyecto + "\\\\reportes\\\\factura_con_logo_detalle_pipas.");
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);

            } else {
                if ((estado == 10) && factura_ya_descontada_de_stock == true) {
                    Statement ST = conexion.createStatement();
                    ResultSet RS = ST.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
                    while (RS.next()) {
//                        System.err.println("tiene que restar del stock");
                        Productos_Update(RS.getDouble("cantidad"), RS.getInt("id_producto"), -1);
                    }
                }
                // BuscarFactura_facturacion();
                if (Facturacion_Terminar.jCheckBox_factura.isSelected() == true) {

                    JasperReport jr = null;
                    Map parametros = new HashMap();
                    String path = ubicacion_proyecto + "\\reportes\\factura_con_logo_pipas.jasper"; // pipas bar
                    ubicacion_proyecto = ubicacion_proyecto.replace("\\", "\\\\");
                    System.err.println(ubicacion_proyecto);
                    parametros.put("direccion", ubicacion_proyecto + "\\\\reportes\\\\factura_con_logo_detalle_pipas.");
                    jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                    JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
                    JasperViewer jv = new JasperViewer(jp, false);
                    jv.setVisible(true);
                }
            }

            venta_terminar = 0;
            venta_terminar_con_nedio_de_pago = 0;

            DEV.Metodos.ventaNuevo();
            Facturacion.jT_buscador.setText("");
            Facturacion.jT_buscador.requestFocus();

        } catch (SQLException | JRException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Listado_de_Productos() {

        String ubicacion_proyecto = new File("").getAbsolutePath();
        String path = ubicacion_proyecto + "\\reportes\\listado_de_productos.jasper";
//        String path = "C:\\Sistema\\reportes\\listado_de_productos.jasper";

        JasperReport jr = null;

        try {

            Map parametros = new HashMap();
            parametros.put("sql", id_comercio);
            parametros.put("comercio", comercio);

            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);

            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException e) {
            System.out.println(e);
        }
    }

    public synchronized static void Cuenta_actualizar_total() {
        try {

            total = 0;

            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
            while (RS.next()) {
                total = RS.getLong("cinco") + RS.getLong("diez") + RS.getLong("exentas") + total;
            }

            String dinero_en_letras = Numero_a_String(total);

            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE cuenta "
                    + "SET total = '" + total + "', "
                    + "obs = '" + dinero_en_letras + "' "
                    + "WHERE id_cuenta='" + id_cuenta + "'");
            Update2.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static String Numero_a_String(long numeroINT) throws ClassNotFoundException, SQLException {

        Numero_a_Letra NumLetra = new Numero_a_Letra();
        String cantidad_string = Long.toString(numeroINT);
        String aRemplazar = NumLetra.Convertir(cantidad_string, true);
        String remplazado = aRemplazar.replace("0", "");
        return remplazado;

    }

    public static class Numero_a_Letra {

        private final String[] UNIDADES = {"", "un ", "dos ", "tres ", "cuatro ", "cinco ", "seis ", "siete ", "ocho ", "nueve "};
        private final String[] DECENAS = {"diez ", "once ", "doce ", "trece ", "catorce ", "quince ", "dieciseis ",
            "diecisiete ", "dieciocho ", "diecinueve", "veinte ", "treinta ", "cuarenta ",
            "cincuenta ", "sesenta ", "setenta ", "ochenta ", "noventa "};
        private final String[] CENTENAS = {"", "ciento ", "doscientos ", "trecientos ", "cuatrocientos ", "quinientos ", "seiscientos ",
            "setecientos ", "ochocientos ", "novecientos "};

        public Numero_a_Letra() {
        }

        public String Convertir(String numero, boolean mayusculas) {
            String literal = "";
            String parte_decimal;
            //si el numero utiliza (.) en lugar de (,) -> se reemplaza
            numero = numero.replace(".", ",");
            //si el numero no tiene parte decimal, se le agrega ,00
            if (numero.indexOf(",") == -1) {
                numero = numero + ",0";
            }
            //se valida formato de entrada -> 0,00 y 999 999 999,00
            if (Pattern.matches("\\d{1,9},\\d{1,2}", numero)) {
                //se divide el numero 0000000,00 -> entero y decimal
                String Num[] = numero.split(",");
                //de da formato al numero decimal
                parte_decimal = Num[1] + "";
                //se convierte el numero a literal
                if (Integer.parseInt(Num[0]) == 0) {//si el valor es cero
                    literal = "cero ";
                } else if (Integer.parseInt(Num[0]) > 999999) {//si es millon
                    literal = getMillones(Num[0]);
                } else if (Integer.parseInt(Num[0]) > 999) {//si es miles
                    literal = getMiles(Num[0]);
                } else if (Integer.parseInt(Num[0]) > 99) {//si es centena
                    literal = getCentenas(Num[0]);
                } else if (Integer.parseInt(Num[0]) > 9) {//si es decena
                    literal = getDecenas(Num[0]);
                } else {//sino unidades -> 9
                    literal = getUnidades(Num[0]);
                }
                //devuelve el resultado en mayusculas o minusculas
                if (mayusculas) {
                    return (literal + parte_decimal).toUpperCase();
                } else {
                    return (literal + parte_decimal);
                }
            } else {//error, no se puede convertir
                return literal = null;
            }
        }

        /* funciones para convertir los numeros a literales */
        private String getUnidades(String numero) {// 1 - 9
            //si tuviera algun 0 antes se lo quita -> 09 = 9 o 009=9
            String num = numero.substring(numero.length() - 1);
            return UNIDADES[Integer.parseInt(num)];
        }

        private String getDecenas(String num) {// 99                        
            int n = Integer.parseInt(num);
            if (n < 10) {//para casos como -> 01 - 09
                return getUnidades(num);
            } else if (n > 19) {//para 20...99
                String u = getUnidades(num);
                if (u.equals("")) { //para 20,30,40,50,60,70,80,90
                    return DECENAS[Integer.parseInt(num.substring(0, 1)) + 8];
                } else {
                    return DECENAS[Integer.parseInt(num.substring(0, 1)) + 8] + "y " + u;
                }
            } else {//numeros entre 11 y 19
                return DECENAS[n - 10];
            }
        }

        private String getCentenas(String num) {// 999 o 099
            if (Integer.parseInt(num) > 99) {//es centena
                if (Integer.parseInt(num) == 100) {//caso especial
                    return " cien ";
                } else {
                    return CENTENAS[Integer.parseInt(num.substring(0, 1))] + getDecenas(num.substring(1));
                }
            } else {//por Ej. 099 
                //se quita el 0 antes de convertir a decenas
                return getDecenas(Integer.parseInt(num) + "");
            }
        }

        private String getMiles(String numero) {// 999 999
            //obtiene las centenas
            String c = numero.substring(numero.length() - 3);
            //obtiene los miles
            String m = numero.substring(0, numero.length() - 3);
            String n = "";
            //se comprueba que miles tenga valor entero
            if (Integer.parseInt(m) > 0) {
                n = getCentenas(m);
                return n + "mil " + getCentenas(c);
            } else {
                return "" + getCentenas(c);
            }

        }

        private String getMillones(String numero) { //000 000 000        
            //se obtiene los miles
            String miles = numero.substring(numero.length() - 6);
            //se obtiene los millones
            String millon = numero.substring(0, numero.length() - 6);
            String n = "";

            int mill = Integer.parseInt(millon);

            if (millon.length() > 1) {
                n = getCentenas(millon) + "millones ";
            } else {
                if (mill == 1) {
                    n = getCentenas(millon) + "millon ";
                }
                if (mill > 1) {
                    n = getCentenas(millon) + "millones ";
                }
            }

            return n + getMiles(miles);
        }
    }

    public synchronized static void Add_producto() {
        DefaultTableModel tm = (DefaultTableModel) buscar_productos_en_compras.jTable_productos.getModel();
        id_producto = Integer.parseInt(String.valueOf(tm.getValueAt(buscar_productos_en_compras.jTable_productos.getSelectedRow(), 0)));
        new FORMS.Compras_agregar_producto().setVisible(true);
        Compras_agregar_producto.jTextField_Descripcion.setText(Producto_nombre_x_id(id_producto));
    }

    public synchronized static void Pedidos_Agregar_producto() {
        new FORMS.Pedidos_agregar_producto().setVisible(true);

        DefaultTableModel tm = (DefaultTableModel) Pedidos_Buscar_producto.jTable1.getModel();
        id_producto = Integer.parseInt(String.valueOf(tm.getValueAt(Pedidos_Buscar_producto.jTable1.getSelectedRow(), 0)));

        FORMS.Pedidos_agregar_producto.id_producto = id_producto;
        String nombre = DEV.Metodos.Producto_nombre_x_id(id_producto);
        String precio = String.valueOf(Producto_precio_x_id(id_producto));
        Pedidos_agregar_producto.jTextField_Descripcion.setText(nombre);
        Pedidos_agregar_producto.jTextField_Precio_Unitario.setText(precio);
    }

    public synchronized static void Productos_cargar_producto_en_editar() {

        try {
            DefaultTableModel tm = (DefaultTableModel) Producto_buscar.jTable1.getModel();
            id_producto = Integer.parseInt(String.valueOf(tm.getValueAt(Producto_buscar.jTable1.getSelectedRow(), 0)));

            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM productos where id_producto = '" + id_producto + "'");
            while (RS.next()) {
                Producto_ABM.producto_nombre.setText(RS.getString("nombre").trim());
                Producto_ABM.ubicacion.setText(RS.getString("ubicacion").trim());
                Producto_ABM.producto_stock_bajo.setText(RS.getString("stock_bajo"));
                Producto_ABM.producto_precio.setText(getSepararMiles(RS.getString("precio")));
                id_productos_tipo = RS.getInt("id_productos_tipo");

                Statement ST2 = conexion.createStatement();
                ResultSet RS2 = ST2.executeQuery("SELECT * FROM productos_tipo where id_productos_tipo = '" + id_productos_tipo + "'");
                while (RS2.next()) {
                    Producto_ABM.jTextField_Tipo.setText(RS2.getString("productos_tipo"));
                }
                if (RS.getString("codigo") != null) {
                    if (RS.getString("codigo").length() > 0) {
                        Producto_ABM.producto_codigo.setText(RS.getString("codigo").trim());
                    }
                }

                Producto_ABM.jTextField_precio_de_compra.setText("0");
                Statement ST23 = conexion.createStatement();
                ResultSet RS23 = ST23.executeQuery(""
                        + "select * from facturas_compra_detalle "
                        + "where id_producto = '" + id_producto + "' "
                        + "order by id_facturas_compra_detalle DESC");
                if (RS23.next()) {
                    Producto_ABM.jTextField_precio_de_compra.setText(getSepararMiles(RS23.getString("precio")));
                }

                id_proveedor = RS.getInt("id_proveedor");
                String proveedor_nombre = Proveedor_nombre_x_id(RS.getInt("id_proveedor"));
                Producto_ABM.producto_proveedor.setText(proveedor_nombre);

                String productos_tipo = Tipo_de_producto_tipo_x_id(RS.getString("id_productos_tipo"));
                Producto_ABM.jTextField_Tipo.setText(productos_tipo);

                String iva = Productos_iva_x_id_iva(RS.getString("id_iva"));
                Producto_ABM.jTextField_iva.setText(iva);

                if (RS.getInt("porcentaje") > 0) {
                    Producto_ABM.jTextField_porcentaje.setText(RS.getString("porcentaje"));
                } else {
                    Producto_ABM.jTextField_porcentaje.setText("0");
                }

                Producto_ABM.jDateChooser_vencimiento.setDate(RS.getDate("vencimiento_date"));

                Producto_ABM.producto_nombre.setEditable(true);

                ImageIcon imagen = new ImageIcon(ubicacion_proyecto + "\\imagenes\\" + id_producto);

                if (imagen != null) {

                    imagen.getImage().flush();
                    Producto_ABM.jLabel_imagen.setIcon(imagen);

                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Productos_cargar_producto_en_editar2() {

        try {

            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM productos where id_producto = '" + id_producto + "'");
            while (RS.next()) {
                Producto_ABM.producto_nombre.setText(RS.getString("nombre").trim());
                Producto_ABM.ubicacion.setText(RS.getString("ubicacion").trim());
                Producto_ABM.producto_stock_bajo.setText(RS.getString("stock_bajo"));
                Producto_ABM.producto_precio.setText(getSepararMiles(RS.getString("precio")));
                id_productos_tipo = RS.getInt("id_productos_tipo");

                Statement ST2 = conexion.createStatement();
                ResultSet RS2 = ST2.executeQuery("SELECT * FROM productos_tipo where id_productos_tipo = '" + id_productos_tipo + "'");
                while (RS2.next()) {
                    Producto_ABM.jTextField_Tipo.setText(RS2.getString("productos_tipo"));
                }
                if (RS.getString("codigo") != null) {
                    if (RS.getString("codigo").length() > 0) {
                        Producto_ABM.producto_codigo.setText(RS.getString("codigo").trim());
                    }
                }

                id_proveedor = RS.getInt("id_proveedor");
                String proveedor_nombre = Proveedor_nombre_x_id(RS.getInt("id_proveedor"));
                Producto_ABM.producto_proveedor.setText(proveedor_nombre);

                String productos_tipo = Tipo_de_producto_tipo_x_id(RS.getString("id_productos_tipo"));
                Producto_ABM.jTextField_Tipo.setText(productos_tipo);

                String iva = Productos_iva_x_id_iva(RS.getString("id_iva"));
                Producto_ABM.jTextField_iva.setText(iva);

                if (RS.getInt("porcentaje") > 0) {
                    Producto_ABM.jTextField_porcentaje.setText(RS.getString("porcentaje"));
                } else {
                    Producto_ABM.jTextField_porcentaje.setText("0");
                }
                Producto_ABM.jDateChooser_vencimiento.setDate(RS.getDate("vencimiento_date"));
                Producto_ABM.producto_nombre.setEditable(true);
                ImageIcon imagen = new ImageIcon(ubicacion_proyecto + "\\imagenes\\" + id_producto);
                if (imagen == null) {
                } else {
                    imagen.getImage().flush();
                    Producto_ABM.jLabel_imagen.setIcon(imagen);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Productos_cargar_producto_en_editar2 " + ex);
        }
    }

    public synchronized static void Compras_detalle_delete() {

        try {
            DefaultTableModel tm = (DefaultTableModel) Compras.jTable1.getModel();
            String id_factura_compra_detalle = String.valueOf(tm.getValueAt(Compras.jTable1.getSelectedRow(), 0));
            String unidades = String.valueOf(tm.getValueAt(Compras.jTable1.getSelectedRow(), 2));

            long total_detalle = 0;
            long total_compra = 0;

            ResultSet RS_Productos2;

            Statement ST_Productos2 = conexion.createStatement();
            RS_Productos2 = ST_Productos2.executeQuery(""
                    + "SELECT * from facturas_compra_detalle "
                    + "where id_facturas_compra_detalle =  '" + id_factura_compra_detalle + "'");
            if (RS_Productos2.next()) {
                id_producto = RS_Productos2.getInt("id_producto");
                total_detalle = RS_Productos2.getLong("total");
                id_facturas_compra = RS_Productos2.getInt("id_facturas_compra");
            }

            ResultSet RS_Productos3;
            Statement ST_Productos = conexion.createStatement();
            RS_Productos3 = ST_Productos.executeQuery(""
                    + "SELECT * from facturas_compra "
                    + "where id_facturas_compra =  '" + id_facturas_compra + "'");
            if (RS_Productos3.next()) {
                total_compra = RS_Productos3.getLong("total");
            }

            total_compra = total_compra - total_detalle;

            double unidades_double = Double.parseDouble(unidades);

            Productos_Update(unidades_double, id_producto, -1);

            PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement(""
                    + "delete from facturas_compra_detalle "
                    + "WHERE id_facturas_compra_detalle ='" + id_factura_compra_detalle + "'");
            stUpdateAuxiliar2.executeUpdate();

            PreparedStatement stUpdateAuxiliar4 = conexion.prepareStatement("UPDATE facturas_compra "
                    + "SET total = '" + total_compra + "' where id_facturas_compra = '" + id_facturas_compra + "'");
            stUpdateAuxiliar4.executeUpdate();

            RefreshListCompras();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void getFacturaMax() {
        try {
            ResultSet RS_Productos;
            Statement ST_Productos = conexion.createStatement();
            RS_Productos = ST_Productos.executeQuery("SELECT MAX(id_cuenta) from cuenta where id_comercio = '" + id_comercio + "'");
            if (RS_Productos.next()) {
                id_cuenta = RS_Productos.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "getFacturaMax: " + ex);
        }
    }

    public synchronized static void getFacturaMax2() {
        try {
            ResultSet RS_Productos;
            try (Statement ST_Productos = conexion.createStatement()) {
                RS_Productos = ST_Productos.executeQuery("SELECT MAX(id_cuenta) from cuenta where id_comercio = '" + id_comercio + "'");
                if (RS_Productos.next()) {
                    id_cuenta_max = RS_Productos.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Productos_tipo_cargar_datos() {

        int indiceFilaSeleccionada = Productos_rubro_listado.jTable_tipos.getSelectedRow();
        Iterator<String> nombreIterator = AI.iterator();
        int p = 0;
        while (nombreIterator.hasNext()) {
            if (p == indiceFilaSeleccionada) {
                id_productos_tipo = Integer.parseInt(nombreIterator.next());
                System.err.println(id_productos_tipo);
                Rubros_buscar_por_id();
                Producto_ABM.jTextField_Tipo.setText(rubro);
                System.err.println(rubro);
            } else {
                nombreIterator.next();
            }
            p++;

        }

    }

    public synchronized static void BuscarFactura() {
        try {

            long precio = 0;
            String nuevo = "0";
            double peso = 0;
            double real = 0;
            double dolar = 0;
            String peso_string = "0";
            String dolar_String = "0";
            String real_String = "0";

            long subtotal_5 = 0;
            long subtotal_10 = 0;
            long subtotal_0 = 0;

            String sub_total_10_str_ = "0";
            String sub_total_10_str = "0";

            String sub_total_10_iva_str_ = "0";
            String sub_total_10_iva_str = "0";

            String sub_total_5_str_ = "0";
            String sub_total_5_str = "0";

            String sub_total_5_iva_str_ = "0";
            String sub_total_5_iva_str = "0";

            String sub_total_0_str_ = "0";
            String sub_total_0_str = "0";

            if (id_cuenta != 0) {

                NO_ventas.jTextField_sub_total_cinco.setText(sub_total_5_str);
                NO_ventas.jTextField_sub_total_diez.setText(sub_total_10_str);
                NO_ventas.jTextField_sub_total_exentas.setText(sub_total_0_str);

                NO_ventas.jTextField_sub_total_diez_iva.setText(sub_total_10_iva_str);
                NO_ventas.jTextField_sub_total_cinco_iva.setText(sub_total_5_iva_str);

                long sub_total_diez_iva = 0;
                long sub_total_cinco_iva = 0;

                ResultSetMetaData rsm;
                DefaultTableModel dtm;

                PreparedStatement ps;
                ResultSet rs;

                error = true;

                getFacturaMax2();

                if (id_cuenta >= id_cuenta_max) {
                    id_cuenta = id_cuenta_max;
                }

                if (id_cuenta <= 0) {
                    id_cuenta = 1;
                }

                Statement ST2 = conexion.createStatement();
                ResultSet RS2 = ST2.executeQuery("SELECT MAX(id_cuenta_detalle) FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
                if (RS2.next()) {
                    ultimo_producto_agregado_id_cuenta_detalle = RS2.getInt(1);
                }

                dtm = (DefaultTableModel) NO_ventas.jT_Venta_Detalle.getModel();
                for (int j = 0; j < NO_ventas.jT_Venta_Detalle.getRowCount(); j++) {
                    dtm.removeRow(j);
                    j -= 1;
                }

                if (ultimo_producto_agregado_id_cuenta_detalle != 0) {

                    Statement ST8 = conexion.createStatement();
                    ResultSet RS8 = ST8.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
                    while (RS8.next()) {
                        subtotal_0 = RS8.getLong("exentas") + subtotal_0;
                        subtotal_5 = RS8.getLong("cinco") + subtotal_5;
                        subtotal_10 = RS8.getLong("diez") + subtotal_10;
                    }

                    Statement ST = conexion.createStatement();
                    ResultSet RS = ST.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
                    if (RS.next()) {
                        error = false;
                    }

                    if (error != true) {

                        ps = conexion.prepareStatement("select cuenta_detalle.id_cuenta_detalle,  "
                                + "coalesce(productos.nombre || pagado_str), "
                                + "cuenta_detalle.cantidad, cuenta_detalle.precio, "
                                + "cuenta_detalle.exentas, cuenta_detalle.cinco, cuenta_detalle.diez, "
                                + "cuenta_detalle.id_producto  from cuenta_detalle inner join productos on "
                                + "productos.id_producto = cuenta_detalle.id_producto  "
                                + "where id_cuenta = '" + id_cuenta + "' "
                                + "order by cuenta_detalle.id_cuenta_detalle DESC");
                        rs = ps.executeQuery();
                        rsm = rs.getMetaData();

                        ArrayList<Object[]> data = new ArrayList<>();

                        while (rs.next()) {

                            precio = rs.getInt("cinco") + rs.getInt("diez") + rs.getInt("exentas") + precio;

                            Object[] rows = new Object[rsm.getColumnCount()];
                            for (int i = 0; i < rows.length; i++) {
                                rows[i] = rs.getObject(i + 1);
                            }
                            data.add(rows);
                            entro = 1;
                        }

                        dtm = (DefaultTableModel) NO_ventas.jT_Venta_Detalle.getModel();
                        for (int i = 0; i < data.size(); i++) {
                            dtm.addRow(data.get(i));
                        }
                        String strLong = Long.toString(precio);
                        nuevo = DEV.Metodos.getSepararMiles(strLong);

                        total = precio;

                        Statement ST_Productos = conexion.createStatement();
                        ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM configuracion where id_comercio = '" + Metodos.id_comercio + "'");

                        if (RS_Productos.next()) {

                            peso = precio / RS_Productos.getDouble("peso");
                            peso = Math.round(peso * 100);
                            peso = peso / 100;
                            peso_string = String.valueOf(peso);

                            dolar = precio / RS_Productos.getDouble("dolar");
                            dolar = Math.round(dolar * 100);
                            dolar = dolar / 100;
                            dolar_String = String.valueOf(dolar);

                            real = precio / RS_Productos.getDouble("real_moneda");
                            real = Math.round(real * 100);
                            real = real / 100;
                            real_String = String.valueOf(real);

                        }

                        sub_total_diez_iva = subtotal_10 / 11;
                        sub_total_cinco_iva = subtotal_5 / 21;

                        sub_total_10_str_ = String.valueOf(subtotal_10);
                        sub_total_10_str = DEV.Metodos.getSepararMiles(sub_total_10_str_);

                        sub_total_10_iva_str_ = String.valueOf(sub_total_diez_iva);
                        sub_total_10_iva_str = DEV.Metodos.getSepararMiles(sub_total_10_iva_str_);

                        sub_total_5_str_ = String.valueOf(subtotal_5);
                        sub_total_5_str = DEV.Metodos.getSepararMiles(sub_total_5_str_);
                        sub_total_5_iva_str_ = String.valueOf(sub_total_cinco_iva);
                        sub_total_5_iva_str = DEV.Metodos.getSepararMiles(sub_total_5_iva_str_);

                        sub_total_0_str_ = String.valueOf(subtotal_0);
                        sub_total_0_str = DEV.Metodos.getSepararMiles(sub_total_0_str_);

                    }
                    NO_ventas.jTextField_sub_total_cinco.setText(sub_total_5_str);
                    NO_ventas.jTextField_sub_total_diez.setText(sub_total_10_str);
                    NO_ventas.jTextField_sub_total_exentas.setText(sub_total_0_str);

                    NO_ventas.jTextField_sub_total_diez_iva.setText(sub_total_10_iva_str);
                    NO_ventas.jTextField_sub_total_cinco_iva.setText(sub_total_5_iva_str);

                    if (entro == 0) {

//                int numero = Integer.parseInt(jT_Factura_nro.getText());
                        int numero = id_cuenta;

                        if (id_cuenta == 1) {
                            if (numero < id_cuenta_max) {
                                numero = (numero + (id_cuenta));
                                BuscarFactura();
                            } else {
                                BuscarFactura();
                            }
                        }
                        if (id_cuenta == -1) {
                            numero = (numero + (id_cuenta));
                            BuscarFactura();
                        }
                    }
                }

                Date fecha = null;

                Statement ST_Factura = conexion.createStatement();
                ResultSet RS_Factura = ST_Factura.executeQuery("SELECT * FROM cuenta where id_cuenta = '" + id_cuenta + "'"
                        + " and id_comercio = '" + id_comercio + "'");
                String tipo = "";
                while (RS_Factura.next()) {

                    NO_ventas.jTextField_id.setText(RS_Factura.getString(1));

                    if (RS_Factura.getDate("fecha_date") != null) {
                        fecha = RS_Factura.getDate("fecha_date");
                        NO_ventas.jDateChooser_fecha.setDate(fecha);
                    }
                    jT_Cliente.setText(DEV.Metodos.getCliente_Nombre_Q_id_cliente(RS_Factura.getInt("id_cliente")));

                    Statement ST6 = conexion.createStatement();
                    ResultSet resultRC6 = ST6.executeQuery("SELECT * FROM cliente where id_cliente = '" + RS_Factura.getInt("id_cliente") + "'");
                    if (resultRC6.next()) {
                        NO_ventas.jTextField_direccion.setText(resultRC6.getString("direccion").trim());
                        NO_ventas.jTextField_telefono.setText(resultRC6.getString("telefono").trim());
                        NO_ventas.jTextField_ruc.setText(resultRC6.getString("ruc").trim());
                        NO_ventas.jTextField_ci.setText(resultRC6.getString("ci").trim());
                    }

                    NO_ventas.jTextField_factura.setText(RS_Factura.getString("factura").trim());

                    if (RS_Factura.getInt("tipo") == 1) {
                        NO_ventas.jCheckBox_credito.setSelected(false);
                        NO_ventas.jCheckBox_Contado.setSelected(true);
                    }

                    if (RS_Factura.getInt("tipo") == 2) {
                        NO_ventas.jCheckBox_credito.setSelected(true);
                        NO_ventas.jCheckBox_Contado.setSelected(false);
                    }

                    if (RS_Factura.getInt("id_estado") == 11) {
                        NO_ventas.jLabel_estado.setText("Fac. Anulada");
                    } else {
                        NO_ventas.jLabel_estado.setText("");
                    }

                }

            } else {
                id_cuenta = 1;
            }
            jT_buscador.requestFocus();

            jT_total.setText(nuevo);
            Jt_pesos.setText(peso_string);
            jT_dolares.setText(dolar_String);
            jT_Reales.setText(real_String);

        } catch (SQLException ex) {
            System.err.println("BuscarFactura " + ex);
        }
    }

    public synchronized static void BuscarFactura_facturacion() {
        try {

            long precio = 0;
            String nuevo = "0";
            double peso = 0;
            double real = 0;
            double dolar = 0;
            String peso_string = "0";
            String dolar_String = "0";
            String real_String = "0";

            long subtotal_5 = 0;
            long subtotal_10 = 0;
            long subtotal_0 = 0;

            String sub_total_10_str_ = "0";
            String sub_total_10_str = "0";

            String sub_total_10_iva_str_ = "0";
            String sub_total_10_iva_str = "0";

            String sub_total_5_str_ = "0";
            String sub_total_5_str = "0";

            String sub_total_5_iva_str_ = "0";
            String sub_total_5_iva_str = "0";

            String sub_total_0_str_ = "0";
            String sub_total_0_str = "0";

            if (id_cuenta != 0) {

                long sub_total_diez_iva = 0;
                long sub_total_cinco_iva = 0;

                ResultSetMetaData rsm;
                DefaultTableModel dtm;

                PreparedStatement ps;
                ResultSet rs;

                error = true;

                getFacturaMax2();

                if (id_cuenta >= id_cuenta_max) {
                    id_cuenta = id_cuenta_max;
                }

                if (id_cuenta <= 0) {
                    id_cuenta = 1;
                }

                Statement ST2 = conexion.createStatement();
                ResultSet RS2 = ST2.executeQuery("SELECT MAX(id_cuenta_detalle) FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
                if (RS2.next()) {
                    ultimo_producto_agregado_id_cuenta_detalle = RS2.getInt(1);
                }

                dtm = (DefaultTableModel) Facturacion.jT_Venta_Detalle.getModel();
                for (int j = 0; j < Facturacion.jT_Venta_Detalle.getRowCount(); j++) {
                    dtm.removeRow(j);
                    j -= 1;
                }

                if (ultimo_producto_agregado_id_cuenta_detalle != 0) {

                    Statement ST8 = conexion.createStatement();
                    ResultSet RS8 = ST8.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
                    while (RS8.next()) {
                        subtotal_0 = RS8.getLong("exentas") + subtotal_0;
                        subtotal_5 = RS8.getLong("cinco") + subtotal_5;
                        subtotal_10 = RS8.getLong("diez") + subtotal_10;
                    }

                    Statement ST = conexion.createStatement();
                    ResultSet RS = ST.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
                    if (RS.next()) {
                        error = false;
                    }

                    if (error != true) {

                        ps = conexion.prepareStatement("select cuenta_detalle.id_cuenta_detalle as cd,  "
                                + "coalesce(productos.nombre || pagado_str) as prod, "
                                + "cuenta_detalle.cantidad as can, cuenta_detalle.precio as precio, "
                                + "cuenta_detalle.exentas as exentas, cuenta_detalle.cinco as cinco , cuenta_detalle.diez as diez, "
                                + "cuenta_detalle.id_producto  from cuenta_detalle inner join productos on "
                                + "productos.id_producto = cuenta_detalle.id_producto  "
                                + "where id_cuenta = '" + id_cuenta + "' "
                                + "order by cuenta_detalle.id_cuenta_detalle DESC");
                        rs = ps.executeQuery();
                        rsm = rs.getMetaData();

                        DecimalFormat formatea = new DecimalFormat("###,###.##");
                        ArrayList<Object[]> data = new ArrayList<>();

                        while (rs.next()) {

                            precio = rs.getInt("cinco") + rs.getInt("diez") + rs.getInt("exentas") + precio;

                            Object[] rows = new Object[rsm.getColumnCount()];
                            for (int i = 0; i < rows.length; i++) {
                                //  rows[i] = rs.getObject(i + 1);
                                // System.err.println(rs.getString("cd"));
                                rows[0] = rs.getString("cd");
                                rows[1] = rs.getString("prod");
                                rows[2] = rs.getDouble("can");
                                rows[3] = formatea.format(rs.getInt("precio"));
                                rows[4] = formatea.format(rs.getInt("exentas"));
                                rows[5] = formatea.format(rs.getInt("cinco"));
                                rows[6] = formatea.format(rs.getInt("diez"));

                            }
                            data.add(rows);
                            entro = 1;
                        }

                        dtm = (DefaultTableModel) Facturacion.jT_Venta_Detalle.getModel();
                        for (int i = 0; i < data.size(); i++) {
                            dtm.addRow(data.get(i));
                        }
                        String strLong = Long.toString(precio);
                        nuevo = DEV.Metodos.getSepararMiles(strLong);

                        total = precio;

                        Statement ST_Productos = conexion.createStatement();
                        ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM configuracion where id_comercio = '" + Metodos.id_comercio + "'");

                        if (RS_Productos.next()) {

                            peso = precio / RS_Productos.getDouble("peso");
                            peso = Math.round(peso * 100);
                            peso = peso / 100;
                            peso_string = String.valueOf(peso);

                            dolar = precio / RS_Productos.getDouble("dolar");
                            dolar = Math.round(dolar * 100);
                            dolar = dolar / 100;
                            dolar_String = String.valueOf(dolar);

                            real = precio / RS_Productos.getDouble("real_moneda");
                            real = Math.round(real * 100);
                            real = real / 100;
                            real_String = String.valueOf(real);

                        }

                        sub_total_diez_iva = subtotal_10 / 11;
                        sub_total_cinco_iva = subtotal_5 / 21;

                        sub_total_10_str_ = String.valueOf(subtotal_10);
                        sub_total_10_str = DEV.Metodos.getSepararMiles(sub_total_10_str_);

                        sub_total_10_iva_str_ = String.valueOf(sub_total_diez_iva);
                        sub_total_10_iva_str = DEV.Metodos.getSepararMiles(sub_total_10_iva_str_);

                        sub_total_5_str_ = String.valueOf(subtotal_5);
                        sub_total_5_str = DEV.Metodos.getSepararMiles(sub_total_5_str_);
                        sub_total_5_iva_str_ = String.valueOf(sub_total_cinco_iva);
                        sub_total_5_iva_str = DEV.Metodos.getSepararMiles(sub_total_5_iva_str_);

                        sub_total_0_str_ = String.valueOf(subtotal_0);
                        sub_total_0_str = DEV.Metodos.getSepararMiles(sub_total_0_str_);

                    }

                    if (entro == 0) {
                        int numero = id_cuenta;
                        if (id_cuenta == 1) {
                            if (numero < id_cuenta_max) {
                                numero = (numero + (id_cuenta));
                                BuscarFactura_facturacion();
                            } else {
                                BuscarFactura_facturacion();
                            }
                        }
                        if (id_cuenta == -1) {
                            numero = (numero + (id_cuenta));
                            BuscarFactura_facturacion();
                        }
                    }
                }

                Date fecha = null;

                Statement ST_Factura = conexion.createStatement();
                ResultSet RS_Factura = ST_Factura.executeQuery(""
                        + "SELECT * FROM cuenta "
                        + "inner join estado on estado.id_estado = cuenta.id_estado "
                        + "where id_cuenta = '" + id_cuenta + "'"
                        + " and id_comercio = '" + id_comercio + "'");
                while (RS_Factura.next()) {
                    
                   Facturacion.jTextField_estado.setText(RS_Factura.getString("estado").trim());

                    if (RS_Factura.getDate("fecha_date") != null) {
                        fecha = RS_Factura.getDate("fecha_date");
                        Facturacion.jDateChooser_fecha.setDate(fecha);
                    }
                    Facturacion.jT_Cliente.setText(DEV.Metodos.getCliente_Nombre_Q_id_cliente(RS_Factura.getInt("id_cliente")));
                    //  Facturacion.jTextField_id.setText(RS_Factura.getString("id_cuenta"));
                    id_cliente = RS_Factura.getInt("id_cliente");
                    Statement ST6 = conexion.createStatement();
                    ResultSet resultRC6 = ST6.executeQuery("SELECT * FROM cliente where id_cliente = '" + id_cliente + "'");
                    if (resultRC6.next()) {
                        Facturacion.jTextField_direccion.setText(resultRC6.getString("direccion").trim());
                        Facturacion.jTextField_telefono.setText(resultRC6.getString("telefono").trim());
                        Facturacion.jTextField_ruc.setText(resultRC6.getString("ruc").trim());
                        Facturacion.jTextField_ci.setText(resultRC6.getString("ci").trim());
                    }

                    Facturacion.jTextField_factura.setText(RS_Factura.getString("factura").trim());
                    if (RS_Factura.getInt("tipo") == 1) {
                        Facturacion.jCheckBox_credito.setSelected(false);
                        Facturacion.jCheckBox_Contado.setSelected(true);
                    }

                    if (RS_Factura.getInt("tipo") == 2) {
                        Facturacion.jCheckBox_credito.setSelected(true);
                        Facturacion.jCheckBox_Contado.setSelected(false);
                    }

                    if (RS_Factura.getInt("id_estado") == 11) {
                        Facturacion.jLabel_estado.setText("Fac. Anulada");
                    } else {
                        Facturacion.jLabel_estado.setText("");
                    }
                    if (RS_Factura.getInt("id_estado") == 9) {
                        Facturacion.jLabel_estado.setText("Presupuesto");
                    } else {
                        Facturacion.jLabel_estado.setText("");
                    }

                }

                Facturacion.jTextField_sub_total_cinco.setText(sub_total_5_str);
                Facturacion.jTextField_sub_total_diez.setText(sub_total_10_str);
                Facturacion.jTextField_sub_total_exentas.setText(sub_total_0_str);

                Facturacion.jTextField_sub_total_diez_iva.setText(sub_total_10_iva_str);
                Facturacion.jTextField_sub_total_cinco_iva.setText(sub_total_5_iva_str);

            } else {
                id_cuenta = 1;
            }
            Facturacion.jT_buscador.requestFocus();
//
            Facturacion.jT_total.setText(nuevo);
            Facturacion.Jt_pesos.setText(peso_string);
            Facturacion.jT_dolares.setText(dolar_String);
            Facturacion.jT_Reales.setText(real_String);

        } catch (SQLException ex) {
            System.err.println("BuscarFactura " + ex);
        }
    }

    public synchronized static void Tipo_de_productos_guardar() {
        error = false;
        if (Rubro_ABM.jTextField_rubro.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "ERROR: Ingrese el tipo de producto");
            error = true;
        }

        if (error != true) {
            try {
                if (id_rubro == 0) {

                    Statement st1 = conexion.createStatement();
                    ResultSet result = st1.executeQuery("SELECT MAX(id_productos_tipo) FROM productos_tipo");
                    if (result.next()) {
                        id_rubro = result.getInt(1) + 1;
                    }
                    PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO productos_tipo VALUES(?,?,?)");
                    stUpdateProducto.setInt(1, id_rubro);
                    stUpdateProducto.setString(2, Rubro_ABM.jTextField_rubro.getText());
                    stUpdateProducto.setInt(3, id_comercio);
                    stUpdateProducto.executeUpdate();
                }
                JOptionPane.showMessageDialog(producto_codigo, "Agregado correctamente");
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public synchronized static void Usuario_guardar() {

        try {
            id = 0;
            Statement st = conexion.createStatement();
            ResultSet result = st.executeQuery("SELECT MAX(id_usuario) FROM usuario");
            if (result.next()) {
                id_usuario = result.getInt(1) + 1;
            }
            int privilegio = 0;
            if (Usuarios.jCheckBox_admin.isSelected() == true) {
                privilegio = 1;
            }

            char[] arrayC = Usuarios.jPasswordField1.getPassword();
            String pass = new String(arrayC);

            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?)");
            stUpdateProducto.setInt(1, id_usuario);
            stUpdateProducto.setString(2, Usuarios.jTextField_usuario.getText());
            stUpdateProducto.setString(3, pass);
            stUpdateProducto.setInt(4, privilegio);
            stUpdateProducto.setInt(5, 1);
            stUpdateProducto.setString(6, Usuarios.jTextField_nombre_real.getText());
            stUpdateProducto.executeUpdate();

            ResultSet rs_2 = st.executeQuery("SELECT MAX(id_control) FROM control_de_acceso");
            if (rs_2.next()) {
                id = rs_2.getInt(1) + 1;
            }

            PreparedStatement st2 = conexion.prepareStatement("INSERT INTO control_de_acceso VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st2.setInt(1, id);
            st2.setInt(2, id_usuario);
            st2.setInt(3, 0);
            st2.setInt(4, 0);
            st2.setInt(5, 0);
            st2.setInt(6, 0);
            st2.setInt(7, 0);
            st2.setInt(8, 0);
            st2.setInt(9, 0);
            st2.setString(10, " ");
            st2.setString(11, " ");
            st2.setInt(12, 1);
            st2.setInt(13, 0);
            st2.setInt(14, 0);
            st2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Agregado correctamente");
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Tipo_de_productos_cargar_lista() {
        try {

            ps = DEV.Conexion.conexion.prepareStatement("SELECT productos_tipo "
                    + "FROM productos_tipo "
                    + "where id_comercio = '" + id_comercio + "' "
                    + "order by productos_tipo");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Productos_rubro_listado.jTable_tipos.getModel();
            for (int j = 0; j < Productos_rubro_listado.jTable_tipos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Productos_rubro_listado.jTable_tipos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            AI.clear();
            // cargar indice de datos
            ps = DEV.Conexion.conexion.prepareStatement("SELECT id_productos_tipo "
                    + "FROM productos_tipo "
                    + "where id_comercio = '" + id_comercio + "' "
                    + "order by productos_tipo");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();

            while (rs.next()) {
                AI.add(rs.getString(1));
            }
            // cargar indice de datos

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Productos_rubros_cargar_lista() {
        try {

            ps = DEV.Conexion.conexion.prepareStatement("SELECT productos_tipo "
                    + "FROM productos_tipo "
                    + "where id_comercio = '" + id_comercio + "' "
                    + "order by productos_tipo");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Productos_listado_de_productos_por_rubro.jTable_rubros.getModel();
            for (int j = 0; j < Productos_listado_de_productos_por_rubro.jTable_rubros.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1).toString().trim();
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Productos_listado_de_productos_por_rubro.jTable_rubros.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

            // cargar indice de datos
            ps = DEV.Conexion.conexion.prepareStatement("SELECT id_productos_tipo "
                    + "FROM productos_tipo "
                    + "where id_comercio = '" + id_comercio + "' "
                    + "order by productos_tipo");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();

            while (rs.next()) {
                AI.add(rs.getString(1));
            }
            // cargar indice de datos

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_buscar_productos_cargar_lista() {
        try {

            ps = DEV.Conexion.conexion.prepareStatement(""
                    + "SELECT id_producto, productos.nombre, proveedor.nombre, precio "
                    + "FROM productos "
                    + "inner join proveedor on proveedor.id_proveedor = productos.id_proveedor "
                    + "where productos.id_comercio = '" + id_comercio + "' "
                    + "and productos.nombre like '%" + buscar_productos_en_compras.jTextField_buscar.getText() + "%' "
                    + "and productos.borrado_int != '1' "
                    + "order by productos.nombre");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) buscar_productos_en_compras.jTable_productos.getModel();
            for (int j = 0; j < buscar_productos_en_compras.jTable_productos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[0] = rs.getObject(1);
                    rows[1] = rs.getObject(2).toString().trim();
                    rows[2] = rs.getObject(3).toString().trim();
                    rows[3] = getSepararMiles(rs.getObject(4).toString());
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) buscar_productos_en_compras.jTable_productos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Productos_buscar_productos_cargar_lista() {
        try {

            ps = DEV.Conexion.conexion.prepareStatement(""
                    + "SELECT id_producto, productos.nombre as producto_nombre, proveedor.nombre as proveedor_nombre, "
                    + "precio, stock, stock_bajo, ubicacion "
                    + "FROM productos inner join proveedor on proveedor.id_proveedor = productos.id_proveedor "
                    + "where productos.id_comercio = '" + id_comercio + "' "
                    + "and productos.nombre like '%" + Producto_buscar.jTextField_buscar.getText() + "%' "
                    + "and (productos.borrado_int != '1') "
                    + "order by productos.nombre");

            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Producto_buscar.jTable1.getModel();
            for (int j = 0; j < Producto_buscar.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            String compra = "";
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    compra = "0";
                    Statement st1 = conexion.createStatement();
                    ResultSet result = st1.executeQuery(""
                            + "select * from facturas_compra_detalle where id_producto = '" + rs.getObject(1) + "' order by id_facturas_compra_detalle DESC");
                    if (result.next()) {
                        compra = result.getString("precio");
                    }

                    rows[0] = rs.getObject(1);
                    rows[1] = rs.getObject(2).toString().trim();
                    rows[2] = rs.getObject(3).toString().trim();
                    rows[3] = getSepararMiles(rs.getObject(4).toString());
                    rows[4] = getSepararMiles(compra);
                    rows[5] = rs.getObject(5);
                    rows[6] = rs.getObject(6);

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Producto_buscar.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Productos_historial_cargar_lista() {
        try {

            ps = DEV.Conexion.conexion.prepareStatement(""
                    + "select facturas_compra.fecha_date as fec, nombre, facturas_compra_detalle.precio as pre,  cantidad, facturas_compra_detalle.total from facturas_compra_detalle \n"
                    + "inner join facturas_compra on facturas_compra.id_facturas_compra = facturas_compra_detalle.id_facturas_compra\n"
                    + "inner join proveedor on proveedor.id_proveedor = facturas_compra.id_proveedor\n"
                    + "where id_producto = '" + id_producto + "' \n"
                    + "order by fec DESC");

            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Producto_ABM.jTable_historial.getModel();
            for (int j = 0; j < Producto_ABM.jTable_historial.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(1) == null) {
                        rows[0] = rs.getObject(1);
                    } else {
                        rows[0] = rs.getObject(1).toString().trim();
                    }
                    rows[1] = rs.getObject(2).toString().trim();
                    rows[2] = getSepararMiles(rs.getObject(3).toString());
                    rows[3] = rs.getObject(4);
                    rows[4] = getSepararMiles(rs.getObject(5).toString());
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Producto_ABM.jTable_historial.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Productos_precio_cargar_lista() {
        try {

            ps = DEV.Conexion.conexion.prepareStatement(""
                    + "select id_productos_precio, unidades, precio from productos_precio "
                    + "where id_producto = '" + id_producto + "' "
                    + "order by id_productos_precio DESC");

            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Producto_ABM.jTable_precios.getModel();
            for (int j = 0; j < Producto_ABM.jTable_precios.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[0] = rs.getObject(1);
                    rows[1] = rs.getObject(2);
                    rows[2] = getSepararMiles(rs.getObject(3).toString());
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Producto_ABM.jTable_precios.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Pedidos_buscar_productos_cargar_lista() {
        try {

            ps = DEV.Conexion.conexion.prepareStatement(""
                    + "SELECT id_producto, productos.nombre as producto_nombre, proveedor.nombre as proveedor_nombre, stock, ubicacion "
                    + "FROM productos inner join proveedor on proveedor.id_proveedor = productos.id_proveedor "
                    + "where productos.id_comercio = '" + id_comercio + "' "
                    + "and productos.nombre like '%" + buscar_productos_nota_pedido_interno.jTextField_buscar.getText() + "%' "
                    + "and (borrado_int != '1' or borrado_int is null) "
                    + "order by productos.nombre");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) buscar_productos_nota_pedido_interno.jTable1.getModel();
            for (int j = 0; j < buscar_productos_nota_pedido_interno.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1).toString().length() > 0) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) buscar_productos_nota_pedido_interno.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Producto_Guardar() {
        try {

            if (id_producto == 0) {
                error = false;
                if (producto_nombre.getText().length() < 1) {
                    JOptionPane.showMessageDialog(null, "ERROR: Ingrese un nombre");
                    error = true;
                }

                if (producto_precio.getText().length() < 1) {
                    JOptionPane.showMessageDialog(producto_codigo, "ERROR: Ingrese un precio");
                    error = true;
                }

                if (error != true) {

                    int iva = 1;

                    int iva_str = Integer.parseInt(Producto_ABM.jTextField_iva.getText());

                    if (iva_str == 5) {
                        iva = 2;
                    }
                    if (iva_str == 0) {
                        iva = 3;
                    }

                    String precio_str = producto_precio.getText();
                    precio_str = precio_str.replace(".", "");
                    precio_str = precio_str.replace(",", "");

                    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                    String strFecha = "2007-12-25";
                    Date fecha = null;

                    fecha = formatoDelTexto.parse(strFecha);
                    boolean entro = false;
                    java.sql.Date fecha_sql_date = null;
                    if (Producto_ABM.jDateChooser_vencimiento.getDate() != null) {
                        fecha_sql_date = util_Date_to_sql_date(Producto_ABM.jDateChooser_vencimiento.getDate());
                        entro = true;
                    }

                    int stock_bajo = 0;

                    if (Producto_ABM.producto_stock_bajo.getText().length() > 0) {
                        stock_bajo = Integer.parseInt(Producto_ABM.producto_stock_bajo.getText());
                    }

//                    if (Producto_ABM.jTextField_Tipo.getText().length() < 1) {
//                        error = true;
//                    }
//                    if (Producto_ABM.producto_proveedor.getText().length() < 1) {
//                        error = true;
//                    }
                    if (error == false) {

                        Statement st1 = conexion.createStatement();
                        ResultSet result = st1.executeQuery("SELECT MAX(id_producto) FROM productos");
                        if (result.next()) {
                            id_producto = result.getInt(1) + 1;
                        }

                        Date vencimeinto_date = Producto_ABM.jDateChooser_vencimiento.getDate();

                        java.sql.Date venc_sql = util_Date_to_sql_date(vencimeinto_date);

                        PreparedStatement stUpdateProducto = conexion.prepareStatement(""
                                + "INSERT INTO productos VALUES(?,? ,?,? ,?,? ,?,? ,?,? ,?,? ,?,? ,?,? ,?,?, ?,?)");
                        stUpdateProducto.setInt(1, id_producto);
                        stUpdateProducto.setInt(2, id_proveedor);
                        stUpdateProducto.setString(3, producto_nombre.getText());
                        stUpdateProducto.setString(4, producto_codigo.getText());
                        stUpdateProducto.setInt(5, Integer.parseInt(precio_str));
                        stUpdateProducto.setInt(6, iva);
                        stUpdateProducto.setInt(7, 0);
                        stUpdateProducto.setInt(8, 0);
                        stUpdateProducto.setInt(9, stock_bajo);
                        stUpdateProducto.setString(10, ubicacion.getText());
                        stUpdateProducto.setString(11, "");
                        stUpdateProducto.setString(12, null);
                        stUpdateProducto.setInt(13, id_comercio);
                        stUpdateProducto.setString(14, null);
                        stUpdateProducto.setString(15, "---- -- --");
                        stUpdateProducto.setInt(16, 0);
                        stUpdateProducto.setInt(17, id_productos_tipo);
                        stUpdateProducto.setDate(18, venc_sql);
                        stUpdateProducto.setInt(19, Integer.parseInt(Producto_ABM.jTextField_porcentaje.getText()));
                        stUpdateProducto.setInt(20, id_ubicacion);

                        if (entro == true) {
                            stUpdateProducto.setDate(18, fecha_sql_date);
                        } else {
                            stUpdateProducto.setDate(18, null);
                        }

                        stUpdateProducto.executeUpdate();
                        Producto_ABM.producto_nombre.setEditable(false);
//                        Producto_ABM.jLabel_mensaje.setVisible(true);
//                        Producto_ABM.jLabel_mensaje.setText("PRODUCTO AGREGADO");
                        JOptionPane.showMessageDialog(null, "Agregado correctamente");

                    } else {
                        JOptionPane.showMessageDialog(null, "Complete todos los campos");
                    }

                }

            } else {

                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                String strFecha = "1990-01-01";
                Date fecha = null;

                fecha = formatoDelTexto.parse(strFecha);
                boolean entro = false;
                java.sql.Date fecha_sql_date = null;
                if (Producto_ABM.jDateChooser_vencimiento.getDate() != null) {
                    fecha_sql_date = util_Date_to_sql_date(Producto_ABM.jDateChooser_vencimiento.getDate());
                    entro = true;
                }

                if (entro == false) {
                    fecha_sql_date = util_Date_to_sql_date(fecha);
                }

                int iva = 1;

                int iva_str = Integer.parseInt(Producto_ABM.jTextField_iva.getText());

                if (iva_str == 5) {
                    iva = 2;
                }
                if (iva_str == 0) {
                    iva = 3;
                }

                String producto_codigo = Producto_ABM.producto_codigo.getText().trim();

                int stock_bajo = 0;

                if (Producto_ABM.producto_stock_bajo.getText().length() > 1) {
                    stock_bajo = Integer.parseInt(Producto_ABM.producto_stock_bajo.getText());
                }

                String precio_str = Producto_ABM.producto_precio.getText();
                precio_str = precio_str.replace(".", "");

                PreparedStatement stUpdateProducto;
                stUpdateProducto = conexion.prepareStatement(""
                        + "UPDATE productos SET nombre='" + Producto_ABM.producto_nombre.getText() + "', "
                        + "precio = '" + precio_str + "', "
                        + "stock_bajo = '" + stock_bajo + "', "
                        + "codigo = '" + producto_codigo + "', "
                        + "id_iva = '" + iva + "', "
                        + "vencimiento_date = '" + fecha_sql_date + "', "
                        + "id_productos_tipo = '" + id_productos_tipo + "', "
                        + "id_proveedor = '" + id_proveedor + "', "
                        + "porcentaje = '" + Integer.parseInt(Producto_ABM.jTextField_porcentaje.getText()) + "', "
                        + "ubicacion = '" + Producto_ABM.ubicacion.getText() + "', "
                        + "id_productos_ubicacion = '" + id_ubicacion + "' "
                        + "WHERE id_producto='" + id_producto + "'");
                stUpdateProducto.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }

        } catch (SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static java.sql.Date util_Date_to_sql_date(Date fecha) {
        java.sql.Date fecha_sql_date = null;
        if (fecha != null) {
            java.util.Date utilDate = fecha;
            fecha_sql_date = new java.sql.Date(utilDate.getTime());
        }
        return fecha_sql_date;
    }

    public synchronized static void RefreshListCompras() {
        DefaultTableModel modelo = (DefaultTableModel) Compras.jTable1.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_facturas_compra_detalle, nombre, cantidad, facturas_compra_detalle.precio, facturas_compra_detalle.total  "
                    + "from facturas_compra_detalle "
                    + "inner join productos "
                    + "on productos.id_producto = facturas_compra_detalle.id_producto "
                    + "where id_facturas_compra = '" + id_facturas_compra + "'");
            ResultSet rs = ps.executeQuery();
            rsm = rs.getMetaData();

            long total = 0;

            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                total = rs.getInt("total") + total;
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) != null) {
                        if (rs.getObject(i + 1).toString().length() > 1) {
                            rows[0] = rs.getObject(1).toString();
                            rows[1] = rs.getObject(2).toString().trim();
                            rows[2] = (rs.getObject(3).toString());
                            if (rs.getObject(4) == null) {
                            } else {
                                rows[3] = getSepararMiles(rs.getObject(4).toString());
                            }
                            if (rs.getObject(5) == null) {
                            } else {
                                rows[4] = getSepararMiles(rs.getObject(5).toString());
                            }
                        }
                    }
                }
                data.add(rows);
            }
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            String strLong = Long.toString(total);
            String nuevo = DEV.Metodos.getSepararMiles(strLong);

            // -------------- SETEAR VALORES EN FORM
            Compras.jL_Total.setText(nuevo);

        } catch (SQLException ex) {
            System.err.println("Error RefreshListCompras() " + ex);
        }
    }

    public synchronized static void Compras_Guardar() {
        try {
            Compras.jT_Buscar_Productos.setEditable(false);
            error = false;
            Statement st1 = conexion.createStatement();
            int id = 0;
            ResultSet result = st1.executeQuery("SELECT MAX(id_facturas_compra) FROM facturas_compra");
            if (result.next()) {
                id = result.getInt(1) + 1;
            }

            java.sql.Date fecha = null;
            if (Compras.jDateChooser.getDate() != null) {
                java.util.Date utilDate = Compras.jDateChooser.getDate();
                fecha = new java.sql.Date(utilDate.getTime());
            } else {
                //JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar una fecha");
                error = true;
            }

            if (id_proveedor == 0) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un proveedor");
                error = true;
            }

            if (Compras.jT_factura_nro.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar una factura");
                error = true;
            }

            if (error != true) {
                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO facturas_compra VALUES(?,?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setString(2, Compras.jT_factura_nro.getText());
                stUpdateProducto.setString(3, null);
                stUpdateProducto.setInt(4, 1);
                stUpdateProducto.setInt(5, 0);
                stUpdateProducto.setInt(6, id_proveedor);
                stUpdateProducto.setInt(7, 1);
                stUpdateProducto.setInt(8, id_comercio);
                stUpdateProducto.setDate(9, fecha);
                stUpdateProducto.executeUpdate();

                JOptionPane.showMessageDialog(null, "Factura agregada");

                id_facturas_compra = id;

                //  Compras.jLabel_mensaje.setVisible(true);
                //  Compras.jLabel_mensaje.setText("AGREGADA CORRECTAMENTE");
                Compras.jT_Buscar_Productos.setEditable(true);
                //  Compras.jButton_guardar.setVisible(false);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_Verificar_Numero_de_Factura() {
        try {

            if (id_facturas_compra == 0) {

                boolean factura_registrada = false;
                String numero = null;
                Compras.jT_Buscar_Productos.setEditable(false);

                if (jT_factura_nro.getText().length() > 1) {

                    String numero_de_factura_ingresado = jT_factura_nro.getText().trim();
                    numero_de_factura_ingresado = numero_de_factura_ingresado.replace("-", "");

                    Statement st1 = conexion.createStatement();
                    ResultSet result = st1.executeQuery(""
                            + "SELECT * FROM facturas_compra "
                            + "where id_comercio = '" + id_comercio + "' "
                            + "and id_proveedor = '" + id_proveedor + "' "
                            + "and borrado != '1'");
                    while (result.next()) {
                        numero = result.getString("numero").trim();
                        numero = numero.replace("-", "");
                        if (numero.equals(numero_de_factura_ingresado)) {
                            id_facturas_compra = result.getInt("id_facturas_compra");
                            Compras.jT_Buscar_Productos.setEditable(true);
                            Compras.jDateChooser.setDate(result.getDate("fecha_date"));

                            //   System.err.println(result.getDate("fecha_date").toString());
                            JOptionPane.showMessageDialog(null, "Factura registrada");
                            RefreshListCompras();
                            factura_registrada = true;
                        }

                    }
                    if (factura_registrada == false) {
                        Metodos.Compras_Guardar();
                    }
                }
            } else {
                Compras_actualizar();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_Buscar() {
        try {
            Compras.jT_Buscar_Productos.setEditable(false);
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT * FROM facturas_compra "
                    + "inner join proveedor on proveedor.id_proveedor = facturas_compra.id_proveedor "
                    + "where id_facturas_compra = '" + id_facturas_compra + "' ");
            while (result.next()) {
                Compras.jT_factura_nro.setText(result.getString("numero").trim());
                if (result.getDate("fecha_date") == null) {
                    System.out.println("fecha_date null");
                } else {
                    Compras.jDateChooser.setDate(result.getDate("fecha_date"));
                }
                if (result.getString("direccion") != null) {
                    Compras.jTextField_direccion.setText(result.getString("direccion").trim());
                } else {
                    Compras.jTextField_direccion.setText("");
                }
                if (result.getString("ruc") != null) {
                    Compras.jTextField_ruc.setText(result.getString("ruc").trim());
                } else {
                    Compras.jTextField_direccion.setText("");
                }
                if (result.getString("telefono") != null) {
                    Compras.jTextField_ruc.setText(result.getString("telefono").trim());
                } else {
                    Compras.jTextField_direccion.setText("");
                }

                Compras.jT_Buscar_Productos.setEditable(true);
                id_proveedor = result.getInt("id_proveedor");
                RefreshListCompras();
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static int Factura_de_compra_Max() {
        try {
            ResultSet RS_Productos;
            try (Statement ST_Productos = conexion.createStatement()) {
                RS_Productos = ST_Productos.executeQuery("SELECT MAX(id_facturas_compra) from facturas_compra");
                if (RS_Productos.next()) {
                    max = RS_Productos.getInt(1);
                }
            }
            RS_Productos.close();

        } catch (SQLException ex) {
            System.err.println(ex);
        }

        return max;

    }

    public synchronized static String Factura_de_compra_numero() {
        String valor = "";
        try {
            ResultSet RS_Productos;
            try (Statement ST_Productos = conexion.createStatement()) {
                max = Factura_de_compra_Max();

                RS_Productos = ST_Productos.executeQuery("SELECT * from facturas_compra where id_facturas_compra = '" + max + "'");
                if (RS_Productos.next()) {
                    valor = RS_Productos.getString("numero");
                }
            }
            RS_Productos.close();

        } catch (SQLException ex) {
            System.err.println(ex);
        }

        return valor;

    }

    public synchronized static void Compras_Buscar_Factura(int valor) {
        try {

            int entro = 0;

            PreparedStatement ps;
            ResultSet rs;

            ps = conexion.prepareStatement("select "
                    + "productos.nombre, "
                    + "facturas_compra_detalle.cantidad, "
                    + "facturas_compra_detalle.precio "
                    + "from facturas_compra_detalle "
                    + "inner join productos on productos.id_producto = facturas_compra_detalle.id_producto  "
                    + "where id_facturas_compra = '" + valor + "' "
                    + "and id_comercio = '" + Metodos.id_comercio + "' "
                    + "order by facturas_compra_detalle.id_facturas_compra_detalle DESC");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();

            for (int j = 0; j < Compras.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            int precio = 0;

            ArrayList<Object[]> data = new ArrayList<>();

            while (rs.next()) {
                precio = rs.getInt("precio") + precio;
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
                entro = 1;
            }

            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            String strLong = Long.toString(precio);
            String nuevo = DEV.Metodos.getSepararMiles(strLong);

            Compras.jL_Total.setText(nuevo);

            if (entro == 0) {

                int numero = Integer.parseInt(jT_factura_nro.getText());

                String max = String.valueOf(Factura_de_compra_Max());

                int maxi = Integer.parseInt(max);
                if (valor == 1) {
                    if (numero < maxi) {
                        numero = (numero + (valor));
                        jT_factura_nro.setText(String.valueOf(numero));
                        Compras_Buscar_Factura(valor);
                    } else {
                        jT_factura_nro.setText(max);
                        Compras_Buscar_Factura(0);
                    }
                }
                if (valor == -1) {
                    numero = (numero + (valor));
                    jT_factura_nro.setText(String.valueOf(numero));
                    Compras_Buscar_Factura(valor);
                }
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void getGuardarCompra() {

        int id = 1;
        try {
            int si = 0;
            Statement st12 = conexion.createStatement();;
            ResultSet result12 = st12.executeQuery("SELECT * FROM facturas_compra "
                    + "where numero = '" + jT_factura_nro.getText() + "' and id_proveedor = '" + Metodos.id_proveedor + "'");
            if (result12.next()) {
                si = 1;
                id_factura = result12.getInt("id_facturas_compra");
                PreparedStatement stUpdateAuxiliar = conexion.prepareStatement("UPDATE facturas_compra "
                        + "SET activo='0' WHERE activo='1' and id_comercio = '" + Metodos.id_comercio + "' ");
                stUpdateAuxiliar.executeUpdate();
                PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement("UPDATE facturas_compra "
                        + "SET activo='1' WHERE id_facturas_compra = '" + id_factura + "'");
                stUpdateAuxiliar2.executeUpdate();
            }
            if (si != 1) {

                Statement st1;
                st1 = conexion.createStatement();

                ResultSet result = st1.executeQuery("SELECT MAX(id_facturas_compra) FROM facturas_compra");
                if (result.next()) {
                    id = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateAuxiliar = conexion.prepareStatement("UPDATE facturas_compra "
                        + "SET activo='0' WHERE activo='1' and id_comercio = '" + Metodos.id_comercio + "' ");
                stUpdateAuxiliar.executeUpdate();

                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO facturas_compra VALUES(?,?,?,?,?,?,?,?)");
                st2.setInt(1, id);
                st2.setString(2, jT_factura_nro.getText());
                st2.setString(3, "");
                st2.setInt(4, 0);
                st2.setInt(5, 0);
                st2.setInt(6, Metodos.id_proveedor);
                st2.setInt(7, 1);
                st2.setInt(8, Metodos.id_comercio);
                id_factura = id;

                st2.executeUpdate();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

        Compras.jT_Buscar_Productos.setEnabled(true);
        Compras.jT_Buscar_Productos.requestFocus();

    }

    public synchronized static void Buscar_Compra_menos() {
        if (id_factura > 0) {
            try {

                id_factura = id_factura - 1;
                int encontro = 0;

                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT * FROM facturas_compra "
                        + "where id_facturas_compra = '" + id_factura + "' and id_comercio = '" + Metodos.id_comercio + "' ");
                if (result.next()) {

                    PreparedStatement stUpdateAuxiliar = conexion.prepareStatement("UPDATE facturas_compra "
                            + "SET activo='0' WHERE activo='1' and id_comercio = '" + Metodos.id_comercio + "' ");
                    stUpdateAuxiliar.executeUpdate();

                    PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement("UPDATE facturas_compra "
                            + "SET activo='1' WHERE id_facturas_compra = '" + id_factura + "' "
                            + "and id_comercio = '" + Metodos.id_comercio + "' ");
                    stUpdateAuxiliar2.executeUpdate();

                    RefreshListCompras();
                    encontro = 1;
//                    jTextField_id_factura_compra.setText(String.valueOf(id_factura));
                }
                if (encontro == 0) {
                    id_factura = id_factura - 1;
//                    jTextField_id_factura_compra.setText(String.valueOf(id_factura));
                    Buscar_Compra_menos();
                }

            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }

    }

    public synchronized static void Buscar_Compra_mas() {

        try {
            int max = 0;
            Statement st0 = conexion.createStatement();
            ResultSet result0 = st0.executeQuery("SELECT max(id_facturas_compra) FROM facturas_compra ");
            if (result0.next()) {
                max = result0.getInt(1);
            }

            if ((id_factura > 0) && (id_factura <= max)) {
                try {

                    id_factura = id_factura + 1;
                    int encontro = 0;

                    Statement st1 = conexion.createStatement();
                    ResultSet result = st1.executeQuery("SELECT * FROM facturas_compra "
                            + "where id_facturas_compra = '" + id_factura + "' and id_comercio = '" + Metodos.id_comercio + "' ");
                    if (result.next()) {
                        PreparedStatement stUpdateAuxiliar = conexion.prepareStatement("UPDATE facturas_compra "
                                + "SET activo='0' WHERE activo='1' and id_comercio = '" + Metodos.id_comercio + "' ");
                        stUpdateAuxiliar.executeUpdate();
                        PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement("UPDATE facturas_compra "
                                + "SET activo='1' WHERE id_facturas_compra = '" + id_factura + "' "
                                + "and id_comercio = '" + Metodos.id_comercio + "' ");
                        stUpdateAuxiliar2.executeUpdate();
                        RefreshListCompras();
                        encontro = 1;
                    }
                    if (encontro == 0) {
                        id_factura = id_factura + 1;
                        Buscar_Compra_mas();
                    }

                } catch (SQLException ex) {
                    System.err.println(ex);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Comercios_Guardar() {
        try {
            PreparedStatement st = conexion.prepareStatement(""
                    + "UPDATE comercio SET nombre ='" + Configuraciones.jTextField_comercio.getText() + "', "
                    + "direccion ='" + Configuraciones.jTextField_direccion.getText() + "', "
                    + "telefono ='" + Configuraciones.jTextField_telefono.getText() + "', "
                    + "ruc ='" + Configuraciones.jTextField_ruc.getText() + "', "
                    + "email ='" + Configuraciones.jTextField_email.getText() + "' "
                    + "WHERE id_comercio = '" + id_comercio + "'");
            st.executeUpdate();
            Comercio_obtener_datos();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_actualizar() {
        try {
            PreparedStatement st = conexion.prepareStatement(""
                    + "UPDATE facturas_compra "
                    + "SET fecha_date ='" + util_Date_to_sql_date(Compras.jDateChooser.getDate()) + "', "
                    + "id_proveedor ='" + id_proveedor + "', "
                    + "numero ='" + jT_factura_nro.getText() + "' "
                    + "WHERE id_facturas_compra = '" + id_facturas_compra + "'");
            st.executeUpdate();
            Comercio_obtener_datos();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_pedidos() {
        try {
            if (Configuraciones.jCheckBox_pedidos.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET pedidos ='1' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
            }
            if (Configuraciones.jCheckBox_pedidos.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET pedidos ='0' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_alerta_stock() {
        try {
            if (Configuraciones.jCheckBox_alerta_stock.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET alerta_stock ='1' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                alerta_stock = 1;
            }
            if (Configuraciones.jCheckBox_alerta_stock.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET alerta_stock ='0' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                alerta_stock = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_ventas_a_credito() {
        try {
            if (Configuraciones.jCheckBox_ventas_a_credito.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET ventas_a_credito ='1' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
            }
            if (Configuraciones.jCheckBox_ventas_a_credito.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET ventas_a_credito ='0' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_habilitar_medio_de_pago() {
        try {
            if (Configuraciones.jCheckBox_medio_de_pago.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET habilitar_medio_de_pago ='1' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                habilitar_medio_de_pago = 1;
            }
            if (Configuraciones.jCheckBox_medio_de_pago.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET habilitar_medio_de_pago ='0' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                habilitar_medio_de_pago = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_bloquear_facturas() {
        try {
            if (Configuraciones.jCheckBox_bloquear.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET bloquear_facturas ='1' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                bloquear_facturas = 1;
            }
            if (Configuraciones.jCheckBox_bloquear.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET bloquear_facturas ='0' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                bloquear_facturas = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    public synchronized static void Configuracion_update_recargo() {
        try {
            if (Configuraciones.jCheckBox_recargo.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET recargo ='1' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                recargo = 1;
            }
            if (Configuraciones.jCheckBox_recargo.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET recargo ='0' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                recargo = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_update_presupuesto() {
        try {
            if (Facturacion_Terminar.jCheckBox_presupuesto.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET id_estado ='9' "
                        + "WHERE id_cuenta = '" + id_cuenta + "'");
                st.executeUpdate();

            }
            if (Facturacion_Terminar.jCheckBox_presupuesto.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET id_estado ='1' "
                        + "WHERE id_cuenta = '" + id_cuenta + "'");
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_medio_de_pago_update_presupuesto() {
        try {
            if (Facturacion_Terminar.jCheckBox_presupuesto.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET id_estado ='9' "
                        + "WHERE id_cuenta = '" + id_cuenta + "'");
                st.executeUpdate();

            }
            if (Facturacion_Terminar.jCheckBox_presupuesto.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET id_estado ='1' "
                        + "WHERE id_cuenta = '" + id_cuenta + "'");
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_productos_por_factura() {
        try {

            PreparedStatement st = conexion.prepareStatement(""
                    + "UPDATE configuracion "
                    + "SET productos_por_factura ='" + Integer.parseInt(Configuraciones.jTextField_productos.getText()) + "' "
                    + "WHERE id_comercio = '" + id_comercio + "'");
            st.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_ultima_factura_impresa() {

    }

    public synchronized static void Configuracion_update_ultima_factura_impresa_mas_1() {
        try {
            PreparedStatement st = conexion.prepareStatement(""
                    + "UPDATE control_de_acceso "
                    + "SET ultima_factura ='" + factura + "' "
                    + "WHERE id_usuario = '" + id_usuario + "'");
            st.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
//
//    public synchronized static void Configuracion_update_habilitar_facturacion() {
//        try {
//            if (Configuraciones.jCheckBox_habilitar_facturacion.isSelected() == true) {
//                PreparedStatement st = conexion.prepareStatement(""
//                        + "UPDATE configuracion "
//                        + "SET habilitar_facturacion ='1' "
//                        + "WHERE id_comercio = '" + id_comercio + "'");
//                st.executeUpdate();
//                habilitar_facturacion = 1;
//            }
//            if (Configuraciones.jCheckBox_habilitar_facturacion.isSelected() == false) {
//                PreparedStatement st = conexion.prepareStatement(""
//                        + "UPDATE configuracion "
//                        + "SET habilitar_facturacion ='0' "
//                        + "WHERE id_comercio = '" + id_comercio + "'");
//                st.executeUpdate();
//                habilitar_facturacion = 0;
//            }
//        } catch (SQLException ex) {
//            System.err.println(ex);
//        }
//    }

    public synchronized static void Control_usuarios_habilitar_facturacion() {
        try {
            if (Usuarios_control.jCheckBox20.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE control_de_acceso "
                        + "SET habilitar_facturacion ='1' "
                        + "WHERE id_usuario = '" + id_usuario_selected + "'");
                st.executeUpdate();
                habilitar_facturacion = 1;
            }
            if (Usuarios_control.jCheckBox20.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE control_de_acceso "
                        + "SET habilitar_facturacion ='0' "
                        + "WHERE id_usuario = '" + id_usuario_selected + "'");
                st.executeUpdate();
                habilitar_facturacion = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_update_contado() {
        try {
            Facturacion.jCheckBox_credito.setSelected(false);
            Facturacion.jCheckBox_Contado.setSelected(true);

            if (Facturacion.jCheckBox_Contado.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET tipo = '1' " // contado
                        + "WHERE id_cuenta = '" + id_cuenta + "'");

                st.executeUpdate();

            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_update_credito() {
        try {
            Facturacion.jCheckBox_credito.setSelected(true);
            Facturacion.jCheckBox_Contado.setSelected(false);

            if (Facturacion.jCheckBox_credito.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET tipo = '2' " // credito
                        + "WHERE id_cuenta = '" + id_cuenta + "'");

                st.executeUpdate();

            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_pagados() {
        try {
            if (Configuraciones.jCheckBox_pagado.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET habilitar_pagado_en_cuenta_detalle ='1' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                habilitar_control_individual_de_pago = 1;
            }
            if (Configuraciones.jCheckBox_pagado.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET habilitar_pagado_en_cuenta_detalle ='0' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                habilitar_control_individual_de_pago = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
//
//    public synchronized static void Configuracion_update_porcentaje() {
//        try {
//            PreparedStatement st = conexion.prepareStatement(""
//                    + "UPDATE configuracion "
//                    + "SET porcentaje ='" + Integer.parseInt(Configuraciones.jTextField_porcentaje.getText()) + "' "
//                    + "WHERE id_comercio = '" + id_comercio + "'");
//            st.executeUpdate();
//        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "Ingrese un valor correcto.");
//        }
//    }

    public synchronized static void Configuracion_update_precio_automatico() {
        try {
            if (Configuraciones.jCheckBox_precio_automatico.isSelected() == true) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET precio_automatico ='1' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                precio_automatico = 1;
            }
            if (Configuraciones.jCheckBox_precio_automatico.isSelected() == false) {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE configuracion "
                        + "SET precio_automatico ='0' "
                        + "WHERE id_comercio = '" + id_comercio + "'");
                st.executeUpdate();
                precio_automatico = 0;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Control_usuarios_update_sucursal() {
        try {
            PreparedStatement st = conexion.prepareStatement(""
                    + "UPDATE control_de_acceso "
                    + "SET sucursal_numero ='" + Usuarios_control.jTextField_sucursal.getText() + "' "
                    + "WHERE id_usuario = '" + id_usuario_selected + "'");
            st.executeUpdate();

//            sucursal_numero = Usuarios_control.jTextField_sucursal.getText();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Control_usuarios_update_caja() {
        try {
            PreparedStatement st = conexion.prepareStatement(""
                    + "UPDATE control_de_acceso "
                    + "SET caja_numero ='" + Usuarios_control.jTextField_caja.getText() + "' "
                    + "WHERE id_usuario = '" + id_usuario_selected + "'");
            st.executeUpdate();
//            caja_numero = Usuarios_control.jTextField_caja.getText();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Control_usuarios_update_numero() {
        try {
            PreparedStatement st = conexion.prepareStatement(""
                    + "UPDATE control_de_acceso "
                    + "SET ultima_factura ='" + Usuarios_control.jTextField_numero.getText() + "' "
                    + "WHERE id_usuario = '" + id_usuario_selected + "'");
            st.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_update_imagen() {

    }

    public synchronized static void Configuracion_impresora_guardar() {
        try {

            // convertir date
            java.sql.Date inicio = null;
            java.sql.Date vencimiento = null;

            java.util.Date utilDate = Configuracion_impresion.jDateChooser_inicio.getDate();
            inicio = new java.sql.Date(utilDate.getTime());

            java.util.Date utilDate_hasta = Configuracion_impresion.jDateChooser_vencimiento.getDate();
            vencimiento = new java.sql.Date(utilDate_hasta.getTime());

            PreparedStatement st = conexion.prepareStatement(""
                    + "UPDATE configuracion SET "
                    + "timbrado ='" + Configuracion_impresion.jTextField_timbrado.getText() + "', "
                    + "timbrado_vencimiento ='" + inicio + "', "
                    + "timbrado_inicio_vigencia ='" + vencimiento + "' "
                    + "WHERE id_configuracion = '1'");
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_facturacion_guardar() {

    }

    public synchronized static void Comercio_obtener_datos() {
        try {
            PreparedStatement ps3 = conexion.prepareStatement("select * from comercio where id_comercio = '" + id_comercio + "'");
            ResultSet rs3 = ps3.executeQuery();
            while (rs3.next()) {
                titulo = rs3.getString("nombre").trim() + " - Usuario: " + nombre;
                comercio = rs3.getString("nombre").trim();
                comercio_ruc = rs3.getString("ruc").trim();
                comercio_direccion = rs3.getString("direccion").trim();
                comercio_telefono = rs3.getString("telefono").trim();
                comercio_email = rs3.getString("email").trim();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static boolean getIngresar() {

        boolean entro = false;
        try {
            Metodos.nombre = jTextField1.getText();
            char[] arrayC = jPasswordField1.getPassword();
            String pass = new String(arrayC);

            PreparedStatement ps = conexion.prepareStatement("select * from usuario where nombre ='" + nombre + "' and contrasenha = '" + pass + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                nombre = rs.getString("nombre_real").trim();

                id_usuario = rs.getInt("id_usuario");
                id_comercio = rs.getInt("id_comercio");
                privilegio = rs.getInt("privilegio");

                Comercio_obtener_datos();

                Configuracion_inicial();
                ubicacion_proyecto = new File("").getAbsolutePath();

                new Principal().setVisible(true);
                entro = true;
                String hoy = DEV.Metodos.getHoy_format3();
//                Principal.jTextField_info.setText(hoy);

                Metodos.Configuracion_iniciar_datos();
                Metodos.Control_de_acceso();

            }
            if (entro == false) {
                //new Logueo().setVisible(true);
                JOptionPane.showMessageDialog(null, "Error de usuario y/o contraseña.");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return entro;
    }

    public synchronized static void Configuracion_inicial() {
        try {
            PreparedStatement ps4 = conexion.prepareStatement("select * from configuracion where id_comercio = '" + id_comercio + "'");
            ResultSet rs4 = ps4.executeQuery();
            while (rs4.next()) {
                pedidos = rs4.getInt("pedidos");
                precio_automatico = rs4.getInt("precio_automatico");
                ruta_imagen = rs4.getString("imagen");
                habilitar_facturacion = rs4.getInt("habilitar_facturacion");
            }
            System.out.println("Configuracion OK");
        } catch (SQLException ex) {
            System.err.println("");
        }
    }

    public synchronized static void Control_de_acceso() {
        try {
            PreparedStatement ps4 = conexion.prepareStatement("select * from control_de_acceso where id_usuario = '" + id_usuario + "'");
            ResultSet rs4 = ps4.executeQuery();
            while (rs4.next()) {
                caja_numero = rs4.getString("caja_numero");
                sucursal_numero = rs4.getString("sucursal_numero");
                factura = rs4.getInt("ultima_factura");
                habilitar_facturacion = rs4.getInt("habilitar_facturacion");
            }
            System.out.println("Control de acceso OK");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Productos_ubicacion_Guardar() {
        try {

            if (id_ubicacion == 0) {

                if ((Ubicacion_ABM.jTextField_ubicacion.getText().length() < 1)) {
                    JOptionPane.showMessageDialog(null, "Complete los campos");
                } else {
                    Statement st1 = conexion.createStatement();
                    ResultSet result = st1.executeQuery("SELECT MAX(id_productos_ubicacion) FROM productos_ubicacion");
                    if (result.next()) {
                        id_ubicacion = result.getInt(1) + 1;
                    }
                    PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO productos_ubicacion VALUES(?,?,?)");
                    stUpdateProducto.setInt(1, id_ubicacion);
                    stUpdateProducto.setString(2, Ubicacion_ABM.jTextField_ubicacion.getText().trim());
                    stUpdateProducto.setInt(3, 0);
                    stUpdateProducto.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Guardado correctamente");
                    Ubicacion_clear();
                }
            } else {
                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE productos_ubicacion "
                        + "SET ubicacion ='" + Ubicacion_ABM.jTextField_ubicacion.getText().trim() + "' "
                        + "WHERE id_productos_ubicacion = '" + id_ubicacion + "'");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public synchronized static void Cliente_Guardar() {
        try {

            long ci = 0;
            existe = false;
            error = false;
            if (isNumeric(Cliente_ABM.jTextField_ci.getText())) {
                ci = Long.parseLong(Cliente_ABM.jTextField_ci.getText());
            }

            java.sql.Date cumple = null;
            if (Cliente_ABM.jDateChooser_cumpleanos.getDate() == null) {
            } else {
                java.util.Date utilDate = Cliente_ABM.jDateChooser_cumpleanos.getDate();
                cumple = new java.sql.Date(utilDate.getTime());
            }

            if (("".equals(jt_nombre.getText())) || (" ".equals(jt_nombre.getText())) || (jt_nombre.getText() == null)) {
                JOptionPane.showMessageDialog(null, "ERROR. Nombre no puede ser vacío.");
                error = true;
            }

            String ruc = jt_ruc.getText();
            if (("".equals(ruc)) || (" ".equals(ruc)) || (ruc == null)) {
                ruc = "0";
            }

            if (error == false) {

                if (id_cliente == 0) {

                    Statement st12 = conexion.createStatement();
                    ResultSet result2 = st12.executeQuery(""
                            + "SELECT * FROM cliente where ruc = '" + Cliente_ABM.jt_ruc.getText() + "' "
                            + "and ruc is not null and ruc != '' and ruc > '0'");
                    if (result2.next()) {
                        JOptionPane.showMessageDialog(null, "ERROR. RUC registrado a nombre de: " + result2.getString("nombre").trim());
                        error = true;
                    }
                    Statement st122 = conexion.createStatement();
                    ResultSet result22 = st122.executeQuery(""
                            + "SELECT * FROM cliente where ci = '" + ci + "' "
                            + "and ci > '0' ");
                    if (result22.next()) {
                        JOptionPane.showMessageDialog(null, "ERROR. CI registrado a nombre de: " + result22.getString("nombre").trim());
                        error = true;
                    }

                    if (existe == false && error == false) {

                        Statement st1 = conexion.createStatement();
                        ResultSet result = st1.executeQuery("SELECT MAX(id_cliente) FROM cliente");
                        if (result.next()) {
                            id_cliente = result.getInt(1) + 1;
                        }

                        PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        stUpdateProducto.setInt(1, id_cliente);
                        stUpdateProducto.setString(2, jt_nombre.getText());
                        stUpdateProducto.setString(3, jt_direccion.getText());
                        stUpdateProducto.setString(4, jt_telefono.getText());
                        stUpdateProducto.setString(5, "");
                        stUpdateProducto.setInt(6, 0);
                        stUpdateProducto.setString(7, ruc);
                        stUpdateProducto.setInt(8, id_comercio);
                        stUpdateProducto.setString(9, jt_email.getText());
                        stUpdateProducto.setInt(10, 0);
                        stUpdateProducto.setDate(11, cumple);
                        stUpdateProducto.setLong(12, ci);
                        stUpdateProducto.setLong(13, 0);
                        stUpdateProducto.setLong(14, 0);
                        stUpdateProducto.setLong(15, 0);
                        stUpdateProducto.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Guardado correctamente");

                    }

                } else if (cumple == null) {
                    PreparedStatement st = conexion.prepareStatement(""
                            + "UPDATE cliente "
                            + "SET nombre ='" + jt_nombre.getText() + "', "
                            + "direccion ='" + jt_direccion.getText() + "', "
                            + "telefono ='" + jt_telefono.getText() + "', "
                            + "ruc ='" + ruc + "', "
                            + "email = '" + jt_email.getText() + "', "
                            + "ci = '" + ci + "' "
                            + "WHERE id_cliente = '" + id_cliente + "'");
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Guardado correctamente");
                } else {

                    PreparedStatement st = conexion.prepareStatement(""
                            + "UPDATE cliente "
                            + "SET nombre ='" + jt_nombre.getText() + "', "
                            + "direccion ='" + jt_direccion.getText() + "', "
                            + "telefono ='" + jt_telefono.getText() + "', "
                            + "ruc ='" + ruc + "', "
                            + "email = '" + jt_email.getText() + "', "
                            + "cumpleanos = '" + util_Date_to_sql_date(cumple) + "', "
                            + "ci = '" + ci + "' "
                            + "WHERE id_cliente = '" + id_cliente + "'");
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Guardado correctamente");
                }
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Productos_Tipo_Cargar_Jtable() {

        try {

            ps = DEV.Conexion.conexion.prepareStatement("SELECT id_productos_tipo, productos_tipo FROM productos_tipo where id_comercio = '" + id_comercio + "' and productos_tipo like '%" + Producto_ABM.jTextField_Tipo.getText() + "%'");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Productos_rubro_listado.jTable_tipos.getModel();
            for (int j = 0; j < Productos_rubro_listado.jTable_tipos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Productos_rubro_listado.jTable_tipos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Productos_Tipo_Guardar() {

        try {
            Statement st1 = conexion.createStatement();

            ResultSet result = st1.executeQuery("SELECT MAX(id_productos_tipo) FROM productos_tipo");
            if (result.next()) {
                id = result.getInt(1) + 1;
            }

            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO productos_tipo VALUES(?,?,?)");
            stUpdateProducto.setInt(1, id);
            // stUpdateProducto.setString(2, Rubro_ABM.jTextField_productos_tipo.getText());
            stUpdateProducto.setInt(3, id_comercio);
            stUpdateProducto.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Buscar_Factura_Siguiente() {
        try {

            long precio = 0;
            String nuevo = "";
            double peso = 0.0;
            double real = 0.0;
            double dolar = 0.0;
            String peso_string = "0";
            String dolar_String = "0";
            String real_String = "0";

            boolean encontrado = false;
            int max = 0;
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT MAX(id_cuenta) from cuenta where id_comercio = '" + id_comercio + "'");
            if (RS.next()) {
                max = RS.getInt("MAX");
            }

            if (id_cuenta >= max) {
                id_cuenta = max;
            }

            error = true;
            error_cuenta_detalle = true;

            Statement ST2 = conexion.createStatement();
            ResultSet RS2 = ST2.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + id_cuenta + "'");
            if (RS2.next()) {
                error_cuenta_detalle = false;
            }

            DefaultTableModel dtm = (DefaultTableModel) NO_ventas.jT_Venta_Detalle.getModel();
            for (int j = 0; j < NO_ventas.jT_Venta_Detalle.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            if (error_cuenta_detalle == false) {

                PreparedStatement ps = conexion.prepareStatement("select cuenta_detalle.id_cuenta_detalle,   "
                        + "productos.nombre, pagado, cuenta_detalle.cantidad, cuenta_detalle.precio, cuenta_detalle.exentas, cuenta_detalle.cinco, "
                        + "cuenta_detalle.diez, cuenta_detalle.id_producto  from cuenta_detalle inner join productos "
                        + "on productos.id_producto = cuenta_detalle.id_producto  where id_cuenta = '" + id_cuenta + "' "
                        + "order by cuenta_detalle.id_cuenta_detalle DESC");
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData rsm = rs.getMetaData();

                ArrayList<Object[]> data = new ArrayList<>();
                while (rs.next()) {
                    precio = rs.getInt("cinco") + rs.getInt("diez") + rs.getInt("exentas") + precio;
                    Object[] rows = new Object[rsm.getColumnCount()];
                    for (int i = 0; i < rows.length; i++) {
                        rows[i] = rs.getObject(i + 1);
                    }
                    data.add(rows);
                    encontrado = true;
                }

                if (encontrado == false) {
                    if (max > id_cuenta) {
                        id_cuenta++;
                        Buscar_Factura_Siguiente();
                    } else {
                        id_cuenta--;
                        Buscar_Factura_Siguiente();
                    }
                }

                dtm = (DefaultTableModel) NO_ventas.jT_Venta_Detalle.getModel();
                for (int i = 0; i < data.size(); i++) {
                    dtm.addRow(data.get(i));
                }
                String strLong = Long.toString(precio);
                nuevo = DEV.Metodos.getSepararMiles(strLong);

                Statement ST_Productos = conexion.createStatement();
                ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM configuracion where id_comercio = '" + id_comercio + "'");

                if (RS_Productos.next()) {

                    peso = precio / RS_Productos.getDouble("peso");
                    peso = Math.round(peso * 100);
                    peso = peso / 100;
                    peso_string = String.valueOf(peso);

                    dolar = precio / RS_Productos.getDouble("dolar");
                    dolar = Math.round(dolar * 100);
                    dolar = dolar / 100;
                    dolar_String = String.valueOf(dolar);

                    real = precio / RS_Productos.getDouble("real_moneda");
                    real = Math.round(real * 100);
                    real = real / 100;
                    real_String = String.valueOf(real);

                }

            }

            Date fecha = null;

            Statement ST_Factura = conexion.createStatement();
            ResultSet RS_Factura = ST_Factura.executeQuery("SELECT * FROM cuenta where id_cuenta = '" + id_cuenta + "' "
                    + "and id_comercio = '" + id_comercio + "'");
            String tipo = "";
            while (RS_Factura.next()) {
                NO_ventas.jTextField_factura.setText(RS_Factura.getString("factura"));
                fecha = RS_Factura.getDate("fecha_date");
                jT_Cliente.setText(DEV.Metodos.getCliente_Nombre_Q_id_cliente(RS_Factura.getInt("id_cliente")));

                if (RS_Factura.getInt("tipo") == 1) {
                    jCheckBox_Contado.setSelected(true);
                } else {
                    jCheckBox_Contado.setSelected(false);
                }

                if (RS_Factura.getInt("tipo") == 2) {
                    //  jCheckBox_Libreta.setSelected(true);
                } else {
                    // jCheckBox_Libreta.setSelected(false);
                }
            }
            NO_ventas.jDateChooser_fecha.setDate(fecha);
            jT_buscador.requestFocus();

            Jt_pesos.setText(peso_string);
            jT_dolares.setText(dolar_String);
            jT_Reales.setText(real_String);
            jT_total.setText(nuevo);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static String getHoy_format2() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String hoy = ft.format(dNow);
        return hoy;
    }

    public synchronized static String Compras_MAX() {

        String dato = "";
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT max(id_facturas_compra)"
                    + " FROM facturas_compra where id_comercio = '" + id_comercio + "'");
            while (RS_Productos.next()) {
                dato = RS_Productos.getString("max");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return dato;
    }

    public synchronized static void Nueva_Compra() {
        try {
            Statement st1;
            st1 = conexion.createStatement();
            int id = 0;
            ResultSet result = st1.executeQuery("SELECT MAX(id_facturas_compra) FROM facturas_compra");
            if (result.next()) {
                id = result.getInt(1) + 1;
            }

            String fecha = DEV.Metodos.getHoy_format1();

            PreparedStatement stUpdateAuxiliar = conexion.prepareStatement("UPDATE facturas_compra SET activo='0' WHERE activo='1' and id_comercio = '" + Metodos.id_comercio + "' ");
            stUpdateAuxiliar.executeUpdate();

            PreparedStatement st2 = conexion.prepareStatement("INSERT INTO facturas_compra VALUES(?,?,?,?,?,?,?,?)");
            st2.setInt(1, id);
            st2.setString(2, "");
            st2.setString(3, fecha);
            st2.setInt(4, 0);
            st2.setInt(5, 0);
            st2.setInt(6, 1);
            st2.setInt(7, 1);
            st2.setInt(8, Metodos.id_comercio);
            id_factura = id;

            st2.executeUpdate();

            RefreshListCompras();
            Compras.jButton_borrar.setVisible(false);

            Compras.jT_Proveedor.requestFocus();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Proveedor_Buscar() {
        try {
            ResultSetMetaData rsm;
            DefaultTableModel dtm;
            PreparedStatement ps;
            ResultSet rs;
            ps = DEV.Conexion.conexion.prepareStatement(""
                    + "select nombre "
                    + "from proveedor "
                    + "where nombre like '%" + Compras_proveedor_buscar.jTextField_Buscar_proveedor.getText() + "%' "
                    + "and id_comercio = '" + id_comercio + "' order by nombre");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            dtm = (DefaultTableModel) Compras_proveedor_buscar.jTable_proveedores.getModel();
            for (int j = 0; j < Compras_proveedor_buscar.jTable_proveedores.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) != null) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras_proveedor_buscar.jTable_proveedores.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

            // cargar indice de datos
            AI.clear();

            ps = DEV.Conexion.conexion.prepareStatement(""
                    + "select id_proveedor "
                    + "from proveedor "
                    + "where nombre like '%" + Compras_proveedor_buscar.jTextField_Buscar_proveedor.getText() + "%' "
                    + "and id_comercio = '" + id_comercio + "' order by nombre");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            while (rs.next()) {
                AI.add(rs.getString(1));
            }
            // cargar indice de datos

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static String getHoy_format3() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String hoy = ft.format(dNow);
        return hoy;
    }

    public synchronized static String getHoy_format1() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String hoy = ft.format(dNow);
        return hoy;
    }

    public synchronized static String Fecha_formato_ddMMyyyy(Date dNow) {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String hoy = ft.format(dNow);
        return hoy;
    }

    public synchronized static String Ventas_Del_Dia(String dia) {
        long total_long = 0;
        dia = dia.substring(0, 10);
        try {

            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cuenta where fecha >= '" + dia + " "
                    + "00:00:00' and fecha <= '" + dia + " 24:59:59' and id_comercio = '" + id_comercio + "'");
            while (rs.next()) {

                Statement st2 = conexion.createStatement();
                ResultSet rs2 = st2.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta = '" + rs.getInt("id_cuenta") + "' ");
                while (rs2.next()) {
                    total_long = rs2.getLong("diez") + rs2.getLong("cinco") + rs2.getLong("exentas") + total_long;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return String.valueOf(total_long);
    }

    public synchronized static int getLibreta() {

        int lib = 0;
        Statement stAuxiliar5;
        try {

            stAuxiliar5 = conexion.createStatement();
            ResultSet rsAuxiliar5 = stAuxiliar5.executeQuery("SELECT * FROM configuracion where id_comercio = '" + id_comercio + "'");
            while (rsAuxiliar5.next()) {
                lib = rsAuxiliar5.getInt("libreta");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return lib;
    }

    public synchronized static String getCliente_Nombre_Q_id_cliente(int id_cliente) {

        String nombre = "";
        Statement stAuxiliar5;
        try {
            stAuxiliar5 = conexion.createStatement();
            ResultSet rsAuxiliar5 = stAuxiliar5.executeQuery("SELECT * FROM cliente where id_cliente = '" + id_cliente + "'");
            while (rsAuxiliar5.next()) {
                nombre = rsAuxiliar5.getString("nombre").trim();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return nombre;
    }

    public synchronized static String getSepararMiles(String txtprec) {
        String valor = txtprec;

        int largo = valor.length();
        if (largo > 8) {
            valor = valor.substring(largo - 9, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 7) {
            valor = valor.substring(largo - 8, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 6) {
            valor = valor.substring(largo - 7, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 5) {
            valor = valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 4) {
            valor = valor.substring(largo - 5, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 3) {
            valor = valor.substring(largo - 4, largo - 3) + "." + valor.substring(largo - 3, largo);
        }
        txtprec = valor;
        return valor;
    }

    public synchronized static int Configuracion_ultimo_numero_de_factura() {
        int x = 0;
        try {
            Statement stCuenta = conexion.createStatement();
            ResultSet rsCuentaSelectId = stCuenta.executeQuery("SELECT ultima_factura FROM control_de_acceso where id_usuario = '" + id_usuario + "'");
            if (rsCuentaSelectId.next()) {
                x = rsCuentaSelectId.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return x;
    }

    public synchronized static void ventaNuevo() {
        try {
            id_cliente = 0;
            id_cuenta = 1;
            Statement stCuenta = conexion.createStatement();
            ResultSet rsCuentaSelectId = stCuenta.executeQuery("SELECT MAX(id_cuenta) FROM cuenta");
            if (rsCuentaSelectId.next()) {
                id_cuenta = rsCuentaSelectId.getInt(1) + 1;
            }
            factura = 0;
            if (habilitar_facturacion == 1) {
                factura = Configuracion_ultimo_numero_de_factura() + 1;
                Configuracion_update_ultima_factura_impresa_mas_1();
            }

            String factura_str = sucursal_numero + "-" + caja_numero + "-" + String.valueOf(factura);

//            String hoy = getHoy_format1();
            Date hoy = new Date();
            java.sql.Date fecha_sql_date = util_Date_to_sql_date(hoy);

//            SimpleDateFormat ft = new SimpleDateFormat("dd                     MMM                                                yy");
//            String hoy2 = ft.format(hoy);
            //     if (id_cuenta < 100){
            PreparedStatement stCuentaGuardar = conexion.prepareStatement("INSERT INTO cuenta VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stCuentaGuardar.setInt(1, id_cuenta);
            stCuentaGuardar.setInt(2, id_cliente);
            stCuentaGuardar.setInt(3, 1);
            stCuentaGuardar.setDouble(4, 0);
            stCuentaGuardar.setString(5, " ");
            stCuentaGuardar.setString(6, "ninguna");
            stCuentaGuardar.setLong(7, 0);
            stCuentaGuardar.setLong(8, 0);
            stCuentaGuardar.setLong(9, 0);
            stCuentaGuardar.setString(10, factura_str);
            stCuentaGuardar.setString(11, "");
            stCuentaGuardar.setString(12, "");
            stCuentaGuardar.setInt(13, Logueo.id_usuario);
            stCuentaGuardar.setInt(14, 0);
            stCuentaGuardar.setInt(15, id_comercio);
            stCuentaGuardar.setInt(16, 1);
            stCuentaGuardar.setDate(17, fecha_sql_date);
            stCuentaGuardar.setInt(18, 0);
            stCuentaGuardar.setInt(19, 0);
            stCuentaGuardar.executeUpdate();

//            }else{
//                JOptionPane.showMessageDialog(null, "El periodo de prueba ha terminado.");
//            }
            Metodos.BuscarFactura_facturacion();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

//        NO_ventas.jT_buscador.setText("");
//        NO_ventas.jT_buscador.requestFocus();
        Facturacion.jT_buscador.setText("");
        Facturacion.jT_buscador.requestFocus();
    }

    public synchronized static String Producto_nombre_x_id(int id) {
        String nombre = null;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM productos where id_producto = '" + id + "'");
            while (RS_Productos.next()) {
                nombre = RS_Productos.getString("nombre").trim();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return nombre;
    }

    public synchronized static Long Producto_precio_x_id(int id) {
        long precio = 0;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM productos where id_producto = '" + id + "'");
            while (RS_Productos.next()) {
                precio = RS_Productos.getLong("precio");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return precio;
    }

    public synchronized static String Producto_nombre_x_id_venta_detalle(int id_venta_detalle) {
        String nombre = null;
        try {

            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta_detalle = '" + id_venta_detalle + "'");
            while (RS_Productos.next()) {

                Statement ST_Productos2 = conexion.createStatement();
                ResultSet RS_Productos2 = ST_Productos2.executeQuery("SELECT * FROM productos where id_producto = '" + RS_Productos.getInt("id_producto") + "'");
                while (RS_Productos2.next()) {
                    nombre = RS_Productos2.getString("nombre").trim();
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return nombre;
    }

    public synchronized static String Producto_proveedor_nombre_x_id_venta_detalle(int id_venta_detalle) {
        String nombre = null;
        try {

            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(""
                    + "select proveedor.nombre "
                    + "from cuenta_detalle "
                    + "inner join productos on productos.id_producto = cuenta_detalle.id_producto "
                    + "inner join proveedor on proveedor.id_proveedor = productos.id_proveedor "
                    + "where id_cuenta_detalle = '" + id_venta_detalle + "'");
            if (RS_Productos.next()) {
                nombre = RS_Productos.getString(1).trim();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return nombre;
    }

    public synchronized static String Producto_id_producto_x_id_venta_detalle(int id_venta_detalle) {
        String dato = null;
        try {

            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta_detalle = '" + id_venta_detalle + "'");
            while (RS_Productos.next()) {

                dato = RS_Productos.getString("id_producto");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return dato;
    }

    public synchronized static String Producto_precio_x_id_venta_detalle(int id_venta_detalle) {
        String dato = null;
        try {

            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(""
                    + "SELECT * FROM cuenta_detalle where id_cuenta_detalle = '" + id_venta_detalle + "'");
            while (RS_Productos.next()) {
                dato = RS_Productos.getString("precio");
            }

        } catch (SQLException ex) {
            System.err.println("Error en: Producto_nombre_x_id() " + ex);
        }
        return dato;
    }

    public synchronized static String Producto_stock_x_id_venta_detalle(int id_venta_detalle) {
        String dato = null;
        try {

            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(""
                    + "select stock "
                    + "from cuenta_detalle "
                    + "inner join productos on productos.id_producto = cuenta_detalle.id_producto "
                    + "where id_cuenta_detalle = '" + id_venta_detalle + "' ");
            if (RS_Productos.next()) {
                dato = RS_Productos.getString(1).trim();
            }

        } catch (SQLException ex) {
            System.err.println("Error en: Producto_nombre_x_id() " + ex);
        }
        return dato;
    }

    public synchronized static String Producto_precio_compra_x_id_venta_detalle(int id_venta_detalle) {

        String dato = null;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta_detalle = '" + id_venta_detalle + "'");
            while (RS_Productos.next()) {
                Statement ST_Productos3 = conexion.createStatement();
                ResultSet RS_Productos3 = ST_Productos3.executeQuery(""
                        + "SELECT * FROM facturas_compra_detalle "
                        + "where id_producto = '" + RS_Productos.getInt("id_producto") + "' "
                        + "order by facturas_compra_detalle  DESC");
                if (RS_Productos3.next()) {
                    dato = RS_Productos3.getString("precio");
                }
                System.err.println(dato);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return dato;
    }

    public synchronized static String Producto_fecha_x_id_venta_detalle(int id_venta_detalle) {

        System.err.println("entro");
        String dato = null;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta_detalle = '" + id_venta_detalle + "'");
            while (RS_Productos.next()) {
                Statement ST_Productos3 = conexion.createStatement();
                ResultSet RS_Productos3 = ST_Productos3.executeQuery(""
                        + "SELECT * FROM facturas_compra_detalle "
                        + "where id_producto = '" + RS_Productos.getInt("id_producto") + "' "
                        + "order by facturas_compra_detalle  DESC ");
                if (RS_Productos3.next()) {

                    if (RS_Productos3.getDate("fecha") != null) {
                        dato = Fecha_formato_ddMMyyyy(RS_Productos3.getDate("fecha")).toString();
                    }
                }
                System.err.println(dato);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return dato;
    }

    public synchronized static String Proveedor_nombre_x_id(int id) {
        String nombre = null;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM proveedor where id_proveedor = '" + id + "'");
            while (RS_Productos.next()) {
                nombre = RS_Productos.getString("nombre").trim();
            }

        } catch (SQLException ex) {
            System.err.println("Error en: Proveedor_nombre_x_id() " + ex);
        }
        return nombre;
    }

    public synchronized static void Proveedor_cargar_datos_en_compra(int id_proveedor) {
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM proveedor where id_proveedor = '" + id_proveedor + "'");
            while (RS_Productos.next()) {
                Compras.jT_Proveedor.setText(RS_Productos.getString("nombre").trim());
                if (RS_Productos.getString("direccion") == null) {
                } else {
                    Compras.jTextField_direccion.setText(RS_Productos.getString("direccion").trim());
                }
                if (RS_Productos.getString("telefono") == null) {
                } else {
                    Compras.jTextField_telefono.setText(RS_Productos.getString("telefono").trim());
                }
                if (RS_Productos.getString("ruc") == null) {
                } else {
                    Compras.jTextField_ruc.setText(RS_Productos.getString("ruc").trim());
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error en: Proveedor_nombre_x_id() " + ex);
        }
    }

    public synchronized static String Tipo_de_producto_tipo_x_id(String id_productos_tipo) {
        String nombre = null;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery(""
                    + "SELECT * FROM productos_tipo "
                    + "where id_productos_tipo = '" + id_productos_tipo + "'");
            while (RS_Productos.next()) {
                nombre = RS_Productos.getString("productos_tipo").trim();
            }
        } catch (SQLException ex) {
            System.err.println("Error en: Tipo_de_producto_tipo_x_id() " + ex);
        }
        return nombre;
    }

    public synchronized static String Productos_iva_x_id_iva(String id_iva) {
        String nombre = null;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM iva where id_iva = '" + id_iva + "'");
            while (RS_Productos.next()) {
                if (Conexion.db.equals("mca") || Conexion.db.equals("mca_novedades_nuevo")) {
                    nombre = RS_Productos.getString("int").trim();
                } else {
                    nombre = RS_Productos.getString("iva").trim();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return nombre;
    }

    public synchronized static void Productos_Update(double unidades, int id_producto, int mas_menos) {
        try {
            Statement ST_Productos;
            ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM productos where id_producto = '" + id_producto + "'");
            while (RS_Productos.next()) {
                if (mas_menos < 0) {
                    unidades = RS_Productos.getDouble("stock") - unidades;
                }
                if (mas_menos > 0) {
                    unidades = RS_Productos.getDouble("stock") + unidades;
                }
            }
            PreparedStatement stUpdateAuxiliar = conexion.prepareStatement("UPDATE productos SET stock = '" + unidades + "' where id_producto = '" + id_producto + "'");
            stUpdateAuxiliar.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error en productos update: " + ex);
        }
    }

    public synchronized static int Obtener_id_producto_desde_id_cuenta_detalle(int id_cuenta_detalle) {
        int id = 0;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta_detalle = '" + id_cuenta_detalle + "'");
            while (RS_Productos.next()) {
                id = RS_Productos.getInt("id_producto");
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
        return id;
    }

    public synchronized static int Obtener_unidades_desde_id_cuenta_detalle(int id_cuenta_detalle) {
        int id = 0;
        try {
            Statement ST_Productos = conexion.createStatement();
            ResultSet RS_Productos = ST_Productos.executeQuery("SELECT * FROM cuenta_detalle where id_cuenta_detalle = '" + id_cuenta_detalle + "'");
            while (RS_Productos.next()) {
                id = RS_Productos.getInt("cantidad");
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
        return id;
    }

    public synchronized static String Fecha_yyyymmdd_to_ddmmyyyy(Date fecha) {
        SimpleDateFormat ddMMyyyy = new SimpleDateFormat("dd-MM-YYYY");
        String fecha_string = ddMMyyyy.format(fecha);
        return fecha_string;
    }

    ///
    public synchronized static void Pagare_buscar2() {
        try {
            int max = 0;
            Statement st6 = conexion.createStatement();
            ResultSet result6 = st6.executeQuery("SELECT MAX(id_pagare) FROM pagares ");
            while (result6.next()) {
                max = result6.getInt(1);
            }

            if (id_pagare <= 0) {
                Statement st5 = conexion.createStatement();
                ResultSet result5 = st5.executeQuery("SELECT MAX(id_pagare) FROM pagares ");
                while (result5.next()) {
                    id_pagare = result5.getInt(1);
                }
            }

            if (max < id_pagare) {
                id_pagare = max;

            }

            Statement st5 = conexion.createStatement();
            ResultSet result5 = st5.executeQuery("SELECT * FROM pagares where id_pagare = '" + id_pagare + "'");
            while (result5.next()) {
                Pagares.jTextField_id_pagare.setText(result5.getString("id_pagare"));
                Pagares.jTextField_clientes.setText(result5.getString("cliente"));
                Pagares.jTextField_interes.setText(String.valueOf(result5.getInt("interes_int")));
                Pagares.jTextField_comision.setText(String.valueOf(result5.getInt("comision_int")));
                Pagares.jDateChooser_Fecha.setDate(result5.getDate("fecha"));
                Pagares.jDateChooser_vencimiento.setDate(result5.getDate("fecha_vencimiento"));
                Pagares.jTextField_moneda.setText(result5.getString("moneda_short").trim());
//                Pagares.jTextField_numero.setText(result5.getString("nro_str"));
                String dinero = getSepararMiles(String.valueOf(result5.getInt("cantidad")));

                Pagares.jTextField_dinero.setText(dinero);

                dtm = (DefaultTableModel) Pagares.jTable_pagares_detalle.getModel();
                for (int j = 0; j < Pagares.jTable_pagares_detalle.getRowCount(); j++) {
                    dtm.removeRow(j);
                    j -= 1;
                }

                PreparedStatement ps2 = conexion.prepareStatement(""
                        + "select id_pagares_detalles, nombre, pagares_detalle.empresa "
                        + "from pagares_detalle inner join cliente on cliente.id_cliente = pagares_detalle.cliente "
                        + "where id_pagare = '" + id_pagare + "'");
                ResultSet rs2 = ps2.executeQuery();
                rsm = rs2.getMetaData();
                ArrayList<Object[]> data2 = new ArrayList<>();
                while (rs2.next()) {
                    Object[] rows = new Object[rsm.getColumnCount()];
                    for (int i = 0; i < rows.length; i++) {
                        if (rs2.getObject(i + 1) != null) {
                            rows[i] = rs2.getObject(i + 1).toString().trim();
                        } else {
                            rows[i] = rs2.getObject(i + 1);
                        }
                    }
                    data2.add(rows);
                }
                dtm = (DefaultTableModel) Pagares.jTable_pagares_detalle.getModel();
                for (int i = 0; i < data2.size(); i++) {
                    dtm.addRow(data2.get(i));
                }
//                Pagares.jTextField_firmantes.setEditable(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pagare_buscar2 " + ex);
        }
    }

    public synchronized static void Pagares_guardar() {

        if (id_pagare == 0) { // nuevo
            try {

                String moneda = Pagares.jTextField_moneda.getText().trim();
                String gs = "Gs.";

                Date vence_date = Pagares.jDateChooser_vencimiento.getDate();
                Date hoy_date = Pagares.jDateChooser_Fecha.getDate();

                Calendar calendar = null;
                calendar = Calendar.getInstance();
                calendar.setTime(hoy_date);

                int hoy_anho = calendar.get(Calendar.YEAR);
                int hoy_mes = calendar.get(Calendar.MONTH) + 1;
                int hoy_dia = calendar.get(Calendar.DAY_OF_MONTH);

                calendar.setTime(vence_date);
                int vence_anho = calendar.get(Calendar.YEAR);
                int vence_mes = calendar.get(Calendar.MONTH) + 1;
                int vence_dia = calendar.get(Calendar.DAY_OF_MONTH);

                int mes_int = hoy_mes;
                int mes_int2 = vence_mes;

                String moneda2 = "";
                if (moneda.equals(gs)) {
                    moneda = "GUARANIES";
                    moneda2 = "Gs.";
                } else {
                    moneda = "DOLARES AMERICANOS";
                    moneda2 = "USD";
                }

                String mes_str = null;
                String mes_str2 = null;
                if (mes_int == 1) {
                    mes_str = "ENERO";
                }
                if (mes_int == 2) {
                    mes_str = "FEBRERO";
                }
                if (mes_int == 3) {
                    mes_str = "MARZO";
                }
                if (mes_int == 4) {
                    mes_str = "ABRIL";
                }
                if (mes_int == 5) {
                    mes_str = "MAYO";
                }
                if (mes_int == 6) {
                    mes_str = "JUNIO";
                }
                if (mes_int == 7) {
                    mes_str = "JULIO";
                }
                if (mes_int == 8) {
                    mes_str = "AGOSTO";
                }
                if (mes_int == 9) {
                    mes_str = "SETIEMBRE";
                }
                if (mes_int == 10) {
                    mes_str = "OCTUBRE";
                }
                if (mes_int == 11) {
                    mes_str = "NOVIEMBRE";
                }
                if (mes_int == 12) {
                    mes_str = "DICIEMBRE";
                }
                if (mes_int2 == 1) {
                    mes_str2 = "ENERO";
                }
                if (mes_int2 == 2) {
                    mes_str2 = "FEBRERO";
                }
                if (mes_int2 == 3) {
                    mes_str2 = "MARZO";
                }
                if (mes_int2 == 4) {
                    mes_str2 = "ABRIL";
                }
                if (mes_int2 == 5) {
                    mes_str2 = "MAYO";
                }
                if (mes_int2 == 6) {
                    mes_str2 = "JUNIO";
                }
                if (mes_int2 == 7) {
                    mes_str2 = "JULIO";
                }
                if (mes_int2 == 8) {
                    mes_str2 = "AGOSTO";
                }
                if (mes_int2 == 9) {
                    mes_str2 = "SETIEMBRE";
                }
                if (mes_int2 == 10) {
                    mes_str2 = "OCTUBRE";
                }
                if (mes_int2 == 11) {
                    mes_str2 = "NOVIEMBRE";
                }
                if (mes_int2 == 12) {
                    mes_str2 = "DICIEMBRE";
                }

                Numero_a_Letra NumLetra = new Numero_a_Letra();
                int id = 1;
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_pagare) FROM pagares");
                if (result.next()) {
                    id = result.getInt(1) + 1;
                }
                String cantidad = "0";
                String aRemplazar = NumLetra.Convertir(Pagares.jTextField_dinero.getText(), true);
                String remplazado = aRemplazar.replace("0", "");

                PreparedStatement stClienteBorrar = conexion.prepareStatement("UPDATE pagares SET activa = '0'  WHERE activa = '1' ");
                stClienteBorrar.executeUpdate();

                String cliente = Clientes_buscar_por_id(id_cliente);

                java.sql.Date fecha_sql = util_Date_to_sql_date(Pagares.jDateChooser_Fecha.getDate());
                java.sql.Date vencimiento_sql = util_Date_to_sql_date(Pagares.jDateChooser_vencimiento.getDate());

                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO pagares VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                st2.setInt(1, id);
                st2.setInt(2, id);
                st2.setString(3, moneda);
                st2.setInt(4, Integer.parseInt(Pagares.jTextField_dinero.getText()));
                st2.setString(5, String.valueOf(hoy_dia));
                st2.setString(6, mes_str);
                st2.setString(7, String.valueOf(hoy_anho));
                st2.setString(8, String.valueOf(vence_dia));
                st2.setString(9, mes_str2);
                st2.setString(10, String.valueOf(vence_anho));
                st2.setString(11, cliente);
                st2.setString(12, moneda.trim() + " " + remplazado);
                st2.setString(13, "0");
                st2.setString(14, "0");
                st2.setString(15, "0");
                st2.setString(16, "0");
                st2.setString(17, "0");
                st2.setInt(18, 0);
                st2.setInt(19, 1);
                st2.setString(20, "0");
                st2.setString(21, "0");
                st2.setString(22, "0");
                st2.setString(23, "0");
                st2.setString(24, "0");
                st2.setInt(25, 0);
                st2.setString(26, "1/1");
                st2.setString(27, moneda2);
                st2.setDate(27, fecha_sql);
                st2.setDate(27, vencimiento_sql);

                st2.executeUpdate();

                JOptionPane.showMessageDialog(null, "Guardado correctamente.");

                Pagares.jTextField_id_pagare.setText(String.valueOf(id));
//                Pagares.jTextField_firmantes.setEditable(true);
//                Pagares.jTextField_firmantes.requestFocus();

            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public synchronized static String Clientes_buscar_por_id(int id_cliente) {

        String nombre = null;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from cliente where id_cliente = '" + id_cliente + "'");
            while (rs.next()) {
                nombre = rs.getString("nombre").trim();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

        return nombre;
    }

    public synchronized static void Pagare_nuevo() {

        Pagares.jTextField_clientes.setText("");
        Pagares.jTextField_dinero.setText("");
        Pagares.jTextField_id_pagare.setText("0");
        Pagares.jTextField_comision.setText("0");
        Pagares.jTextField_interes.setText("0");
        Pagares.jTextField_moneda.setText("Gs.");
        Pagares.jDateChooser_Fecha.setDate(null);
        Pagares.jDateChooser_vencimiento.setDate(null);
        Pagares_detalle_jtable_clear();

        Pagare_insertar_nuevo();

    }

    public synchronized static void Pagares_detalle_jtable_clear() {
        dtm = (DefaultTableModel) Pagares.jTable_pagares_detalle.getModel();
        for (int j = 0; j < Pagares.jTable_pagares_detalle.getRowCount(); j++) {
            dtm.removeRow(j);
            j -= 1;
        }
    }

    public synchronized static void Pagare_insertar_nuevo() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_pagare) FROM pagares");
            if (result.next()) {
                id_pagare = result.getInt(1) + 1;
            }

            PreparedStatement st2 = conexion.prepareStatement("INSERT INTO pagares VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st2.setInt(1, id_pagare);
            st2.setInt(2, id_pagare);
            st2.setString(3, "GUARANIES");
            st2.setInt(4, 0);
            st2.setString(5, "");
            st2.setString(6, "");
            st2.setString(7, "");
            st2.setString(8, "");
            st2.setString(9, "");
            st2.setString(10, "");
            st2.setString(11, "");
            st2.setString(12, "");
            st2.setString(13, "");
            st2.setString(14, "");
            st2.setString(15, "");
            st2.setString(16, "");
            st2.setString(17, "");
            st2.setInt(18, 0);
            st2.setInt(19, 1);
            st2.setString(20, "");
            st2.setString(21, "");
            st2.setString(22, "");
            st2.setString(23, "");
            st2.setString(24, "");
            st2.setInt(25, 0);
            st2.setString(26, "");
            st2.setString(27, "Gs.");
            st2.setDate(28, null);
            st2.setDate(29, null);
            st2.executeUpdate();

            Pagares.jTextField_id_pagare.setText(String.valueOf(id_pagare));

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pagares_update_fecha() {
        // System.err.println("entro");
        try {
            if (Pagares.jDateChooser_Fecha.getDate() != null) {

                Calendar calendario = Calendar.getInstance();
                calendario.setTime(Pagares.jDateChooser_Fecha.getDate()); // fecha es el Date de antes.
                int anho = calendario.get(Calendar.YEAR);
                int mes = calendario.get(Calendar.MONTH);
                int dia = calendario.get(Calendar.DAY_OF_MONTH);

                String dia_str = String.valueOf(dia);
                String mes_str = Mes_int_a_string(mes + 1);
                String anho_str = String.valueOf(anho);

                java.sql.Date fecha_sql = util_Date_to_sql_date(Pagares.jDateChooser_Fecha.getDate());

                PreparedStatement ST = conexion.prepareStatement(""
                        + "UPDATE pagares "
                        + "SET fecha = '" + fecha_sql + "', "
                        + "dia ='" + dia_str + "', "
                        + "mes = '" + mes_str + "', "
                        + "anho = '" + anho_str + "' "
                        + "WHERE id_pagare = '" + id_pagare + "'  ");

                ST.executeUpdate();
                // System.err.println(fecha_sql);
                //   System.err.println("Update OK");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static String Mes_int_a_string(int mes_int) {

        String mes_str = "";
        if (mes_int == 1) {
            mes_str = "ENERO";
        }
        if (mes_int == 2) {
            mes_str = "FEBRERO";
        }
        if (mes_int == 3) {
            mes_str = "MARZO";
        }
        if (mes_int == 4) {
            mes_str = "ABRIL";
        }
        if (mes_int == 5) {
            mes_str = "MAYO";
        }
        if (mes_int == 6) {
            mes_str = "JUNIO";
        }
        if (mes_int == 7) {
            mes_str = "JULIO";
        }
        if (mes_int == 8) {
            mes_str = "AGOSTO";
        }
        if (mes_int == 9) {
            mes_str = "SETIEMBRE";
        }
        if (mes_int == 10) {
            mes_str = "OCTUBRE";
        }
        if (mes_int == 11) {
            mes_str = "NOVIEMBRE";
        }
        if (mes_int == 12) {
            mes_str = "DICIEMBRE";
        }
        return mes_str;

    }

    public synchronized static void Pagares_update_fecha_vencimiento() {
        try {
            if (Pagares.jDateChooser_vencimiento.getDate() != null) {

                Calendar calendario = Calendar.getInstance();
                calendario.setTime(Pagares.jDateChooser_vencimiento.getDate()); // fecha es el Date de antes.
                int anho = calendario.get(Calendar.YEAR);
                int mes = calendario.get(Calendar.MONTH);
                int dia = calendario.get(Calendar.DAY_OF_MONTH);

                String dia_str = String.valueOf(dia);
                String mes_str = Mes_int_a_string(mes + 1);
                String anho_str = String.valueOf(anho);

                java.sql.Date fecha_sql = util_Date_to_sql_date(Pagares.jDateChooser_vencimiento.getDate());

                PreparedStatement ST = conexion.prepareStatement(""
                        + "UPDATE pagares "
                        + "SET fecha_vencimiento = '" + fecha_sql + "', "
                        + "venc_dia ='" + dia_str + "', "
                        + "venc_mes = '" + mes_str + "', "
                        + "venc_anho = '" + anho_str + "' "
                        + "WHERE id_pagare = '" + id_pagare + "'  ");

                ST.executeUpdate();
                // System.err.println(fecha_sql);
                //   System.err.println("Update OK");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pagares_update_dinero() {
        try {
            long dinero_nuevo = Integer.parseInt(Pagares.jTextField_dinero.getText().replace(".", ""));
            String dinero_letras = Dinero_a_letras(dinero_nuevo);
            PreparedStatement ST = conexion.prepareStatement(""
                    + "UPDATE pagares "
                    + "SET cantidad = '" + dinero_nuevo + "', "
                    + "cantidad_letras = '" + dinero_letras + "' "
                    + "WHERE id_pagare = '" + id_pagare + "'");
            ST.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static String Dinero_a_letras(long numeroINT) throws ClassNotFoundException, SQLException {

        Numero_a_Letra NumLetra = new Numero_a_Letra();
        String cantidad_string = Long.toString(numeroINT);
        String aRemplazar = NumLetra.Convertir(cantidad_string, true);
        String remplazado = aRemplazar.replace("0", "");
        return remplazado;

    }

    public synchronized static void Pagares_update_interes_punitorio() {
        try {
            PreparedStatement ST = conexion.prepareStatement(""
                    + "UPDATE pagares "
                    + "SET interes_int   = '" + Integer.parseInt(Pagares.jTextField_interes.getText()) + "' "
                    + "WHERE id_pagare = '" + id_pagare + "'");
            ST.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pagares_update_interes_moratorio() {
        try {
            PreparedStatement ST = conexion.prepareStatement(""
                    + "UPDATE pagares "
                    + "SET comision_int   = '" + Integer.parseInt(Pagares.jTextField_comision.getText()) + "' "
                    + "WHERE id_pagare = '" + id_pagare + "'");
            ST.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pagares_borrar() {
        try {
            PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement(""
                    + "delete from pagares_detalle "
                    + "WHERE id_pagare ='" + id_pagare + "'");
            stUpdateAuxiliar2.executeUpdate();

            PreparedStatement st2 = conexion.prepareStatement(""
                    + "delete from pagares "
                    + "WHERE id_pagare ='" + id_pagare + "'");
            st2.executeUpdate();
            id_pagare--;
            Pagare_buscar2();
            JOptionPane.showMessageDialog(null, "Pagare Borrado");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pagares_clientes_firmantes_selected_cliente() {
        try {
            String empresa = null;
            DefaultTableModel tm = (DefaultTableModel) Pagares_clientes_firmantes.jTable_clientes.getModel();
            id_cliente = Integer.parseInt(String.valueOf(tm.getValueAt(Pagares_clientes_firmantes.jTable_clientes.getSelectedRow(), 0)));

            int id = 1;
            // int id_pagare = Integer.parseInt(Pagares.jTextField_id_pagare.getText());
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_pagares_detalles) FROM pagares_detalle");
            if (result.next()) {
                id = result.getInt(1) + 1;
            }

            Statement st5 = conexion.createStatement();
            ResultSet result5 = st5.executeQuery("SELECT * FROM cliente where id_cliente = '" + id_cliente + "'");
            if (result5.next()) {
                if (result5.getString("empresa") != null) {
                    if (result5.getString("empresa").trim().length() > 0) {
                        empresa = "Representante legal de " + result5.getString("empresa").trim() + " R.U.C.: " + result5.getString("ruc_empresa").trim();
                    }
                }
            }

            PreparedStatement st2 = conexion.prepareStatement("INSERT INTO pagares_detalle VALUES(?,?,?,?)");
            st2.setInt(1, id);
            st2.setInt(2, id_pagare);
            st2.setInt(3, id_cliente);
            st2.setString(4, empresa);
            st2.executeUpdate();

            PreparedStatement stClienteBorrar = conexion.prepareStatement("UPDATE pagares SET activa = '0'  WHERE activa = '1' ");
            stClienteBorrar.executeUpdate();

            PreparedStatement stClienteBorrar2 = conexion.prepareStatement("UPDATE pagares SET activa = '1'  WHERE id_pagare = '" + id_pagare + "' ");
            stClienteBorrar2.executeUpdate();

            Pagare_buscar(id_pagare);

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Pagare_buscar(int id_pagare) {
        try {

            if (id_pagare == 0) {
                Statement st5 = conexion.createStatement();
                ResultSet result5 = st5.executeQuery("SELECT MAX(id_pagare) FROM pagares ");
                while (result5.next()) {
                    id_pagare = result5.getInt(1);
                }
            }

            Statement st5 = conexion.createStatement();
            ResultSet result5 = st5.executeQuery("SELECT * FROM pagares where id_pagare = '" + id_pagare + "'");
            while (result5.next()) {
                Pagares.jTextField_id_pagare.setText(result5.getString("id_pagare"));
                Pagares.jTextField_clientes.setText(result5.getString("cliente"));
//                Pagares.jTextField_numero.setText(result5.getString("nro_str"));
                String dinero = getSepararMiles(result5.getString("cantidad"));

                Pagares.jTextField_dinero.setText(dinero);

                dtm = (DefaultTableModel) Pagares.jTable_pagares_detalle.getModel();
                for (int j = 0; j < Pagares.jTable_pagares_detalle.getRowCount(); j++) {
                    dtm.removeRow(j);
                    j -= 1;
                }

                PreparedStatement ps2 = conexion.prepareStatement(""
                        + "select id_pagares_detalles, nombre, pagares_detalle.empresa "
                        + "from pagares_detalle inner join cliente on cliente.id_cliente = pagares_detalle.cliente "
                        + "where id_pagare = '" + id_pagare + "'");
                ResultSet rs2 = ps2.executeQuery();
                rsm = rs2.getMetaData();
                ArrayList<Object[]> data2 = new ArrayList<>();
                while (rs2.next()) {
                    Object[] rows = new Object[rsm.getColumnCount()];
                    for (int i = 0; i < rows.length; i++) {
                        if (rs2.getObject(i + 1) != null) {
                            rows[i] = rs2.getObject(i + 1).toString().trim();
                        } else {
                            rows[i] = rs2.getObject(i + 1);
                        }
                    }
                    data2.add(rows);
                }
                dtm = (DefaultTableModel) Pagares.jTable_pagares_detalle.getModel();
                for (int i = 0; i < data2.size(); i++) {
                    dtm.addRow(data2.get(i));
                }
//                Pagares.jTextField_firmantes.setEditable(true);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pagares_clientes_firmantes_buscar() {

        try {

            dtm = (DefaultTableModel) Pagares_clientes_firmantes.jTable_clientes.getModel();
            for (int j = 0; j < Pagares_clientes_firmantes.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cliente, nombre "
                    + "from cliente "
                    + "where nombre like '%" + Pagares_clientes_firmantes.jTextField_buscar.getText() + "%' "
                    + "and borrado != '1' "
                    + "and id_comercio = '" + id_comercio + "'"
                    + "order by nombre");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Pagares_clientes_firmantes.jTable_clientes.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Pagares_clientes_buscar() {

        try {

            dtm = (DefaultTableModel) Pagares_cliente.jTable_clientes.getModel();
            for (int j = 0; j < Pagares_cliente.jTable_clientes.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cliente, nombre "
                    + "from cliente "
                    + "where nombre like '%" + Pagares_cliente.jTextField_buscar.getText() + "%' "
                    + "and id_cliente > '0' "
                    + "and borrado_int != '1' "
                    + "and id_comercio = '" + id_comercio + "'"
                    + "order by nombre");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Pagares_cliente.jTable_clientes.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Pagares_clientes_selected_cliente() {
        try {
            DefaultTableModel tm = (DefaultTableModel) Pagares_cliente.jTable_clientes.getModel();
            id_cliente = Integer.parseInt(String.valueOf(tm.getValueAt(Pagares_cliente.jTable_clientes.getSelectedRow(), 0)));
            Pagares.jTextField_clientes.setText(String.valueOf(tm.getValueAt(Pagares_cliente.jTable_clientes.getSelectedRow(), 1)));
            String nombre = String.valueOf(tm.getValueAt(Pagares_cliente.jTable_clientes.getSelectedRow(), 1));

            PreparedStatement ST = conexion.prepareStatement(""
                    + "UPDATE pagares "
                    + "SET cliente = '" + nombre + "' "
                    + "WHERE id_pagare = '" + id_pagare + "'");
            ST.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Pagares_listado_cargar_jtable() {
        try {

            dtm = (DefaultTableModel) Pagares_listado.jTable_pagares.getModel();
            for (int j = 0; j < Pagares_listado.jTable_pagares.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement("select id_pagare, cliente, cantidad, moneda_short from pagares order by id_pagare DESC");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Pagares_listado.jTable_pagares.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pagares_update_moneda() {
        // System.err.println("entro");
        try {

            String usd = "USD";
            String moneda = "GUARANIES";
            String moneda_short = "Gs.";
            if (usd.equals(Pagares.jTextField_moneda.getText().trim())) {
                moneda = "DOLARES AMERICANOS";
                moneda_short = "USD";
            }

            PreparedStatement ST = conexion.prepareStatement("UPDATE pagares SET moneda = '" + moneda + "', moneda_short ='" + moneda_short + "' WHERE id_pagare = '" + id_pagare + "'");
            ST.executeUpdate();
            // System.err.println(fecha_sql);
            //   System.err.println("Update OK");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Pagares_firmantes_delete() {
        try {
            DefaultTableModel tm = (DefaultTableModel) Pagares.jTable_pagares_detalle.getModel();
            String id_documento = String.valueOf(tm.getValueAt(Pagares.jTable_pagares_detalle.getSelectedRow(), 0));

            PreparedStatement stUpdateAuxiliar2 = conexion.prepareStatement(""
                    + "delete from pagares_detalle WHERE id_pagares_detalles ='" + id_documento + "'");
            stUpdateAuxiliar2.executeUpdate();

            Pagare_buscar(Integer.parseInt(Pagares.jTextField_id_pagare.getText()));
        } catch (SQLException ex) {
            System.err.println(ex);

        }
    }

    public synchronized static void Pagares_ver_todos() {

        try {

            dtm = (DefaultTableModel) Pagares_ver_todos.jTable_pagares.getModel();
            for (int j = 0; j < Pagares_ver_todos.jTable_pagares.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement("select id_pagare, nro, cliente, cantidad from pagares order by id_pagare DESC");
            ResultSet rs2 = ps2.executeQuery();
            rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Pagares_ver_todos.jTable_pagares.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Pagares_pagare_selected() {

        DefaultTableModel tm = (DefaultTableModel) Pagares_ver_todos.jTable_pagares.getModel();
        String id = String.valueOf(tm.getValueAt(Pagares_ver_todos.jTable_pagares.getSelectedRow(), 0));

        Pagares.jTextField_id_pagare.setText(id);
        Pagare_buscar(Integer.parseInt(id));
    }

    public synchronized static void Pagares_generar() {
        try {
            int id_pagare = Integer.parseInt(Pagares.jTextField_id_pagare.getText());
            int cantidad_pagare = Integer.parseInt(Pagares_generar.jTextField_cantidad_pagares.getText());
            int nro_de_pagares = Integer.parseInt(Pagares_generar.jTextField_tiempo.getText());

            Numero_a_Letra NumLetra = new Numero_a_Letra();
            int id = 1;

            PreparedStatement PagareActivoCero = conexion.prepareStatement("UPDATE pagares SET activa = '0'  WHERE activa = '1' ");
            PagareActivoCero.executeUpdate();

            int cantidad = 0;
            int cantidad_nueva = 0;
            String moneda = "";
            String dia = "";
            String mes = "";
            String anho = "";
            String venc_dia = "";
            String venc_mes = "";
            String venc_anho = "";
            String cliente = "";
            String recibo_en = "";
            String recibo_a = "";
            int interes = 0;
            int comision = 0;
            String desu = "";
            String dia2 = "";
            String mes2 = "";
            String anho2 = "";
            String dia_semana1 = "";
            String dia_semana2 = "";
            Date fecha = null;
            Date fecha_vencimiento = null;
            long total = 0;

            Statement ST_2 = conexion.createStatement();
            ResultSet RS_2 = ST_2.executeQuery("SELECT * FROM pagares where id_pagare = '" + id_pagare + "'");
            if (RS_2.next()) {
                total = RS_2.getLong("cantidad");
                cantidad = RS_2.getInt("cantidad");
                moneda = RS_2.getString("moneda");
                dia = RS_2.getString("dia");
                mes = RS_2.getString("mes");
                anho = RS_2.getString("anho");
                venc_dia = RS_2.getString("venc_dia");
                venc_mes = RS_2.getString("venc_mes");
                venc_anho = RS_2.getString("venc_anho");
                cliente = RS_2.getString("cliente");
                recibo_en = RS_2.getString("recibo_en");
                recibo_a = RS_2.getString("recibo_a");
                interes = RS_2.getInt("interes_int");
                comision = RS_2.getInt("comision_int");
                desu = RS_2.getString("desu");
                dia2 = RS_2.getString("dia2");
                mes2 = RS_2.getString("mes2");
                anho2 = RS_2.getString("anho2");
                dia_semana1 = RS_2.getString("dia_semana1");
                dia_semana2 = RS_2.getString("dia_semana2");
                fecha = RS_2.getDate("fecha");
                fecha_vencimiento = RS_2.getDate("fecha_vencimiento");

            }
            String venc_mes_str = "";
            String enero = "ENERO";
            String febrero = "FEBRERO";
            String marzo = "MARZO";
            String abril = "ABRIL";
            String mayo = "MAYO";
            String junio = "JUNIO";
            String julio = "JULIO";
            String agosto = "AGOSTO";
            String setiembre = "SETIEMBRE";
            String octubre = "OCTUBRE";
            String noviembre = "NOVIEMBRE";
            String diciembre = "DICIEMBRE";

            int i = 0;
            String mes3 = venc_mes.trim();
//            String mes3 = venc_mes.trim();

            if (mes3.equals(enero)) {
                venc_mes_str = "01";
            }
            if (mes3.equals(febrero)) {
                venc_mes_str = "02";
            }
            if (mes3.equals(marzo)) {
                venc_mes_str = "03";
            }
            if (mes3.equals(abril)) {
                venc_mes_str = "04";
            }
            if (mes3.equals(mayo)) {
                venc_mes_str = "05";
            }
            if (mes3.equals(junio)) {
                venc_mes_str = "06";
            }
            if (mes3.equals(julio)) {
                venc_mes_str = "07";
            }
            if (mes3.equals(agosto)) {
                venc_mes_str = "08";
            }
            if (mes3.equals(setiembre)) {
                venc_mes_str = "09";
            }
            if (mes3.equals(octubre)) {
                venc_mes_str = "10";
            }
            if (mes3.equals(noviembre)) {
                venc_mes_str = "11";
            }
            if (mes3.equals(diciembre)) {
                venc_mes_str = "12";
            }

            int sumar_dias = 0;
            int sumar_meses = 0;
            long total_parcial = 0;

            long diferencia = 0;

            int si = 0;
//            boolean primero = true;
            while (i <= cantidad_pagare) { // quitar igual
                String vencimiento = venc_anho.trim() + "-" + venc_mes_str.trim() + "-" + venc_dia.trim();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Calendar ce = Calendar.getInstance();
                Date expedido_date = formatter.parse(vencimiento);
                ce.setTime(expedido_date);
                ce.add(Calendar.MONTH, (nro_de_pagares * i));
                ce.add(Calendar.MONTH, 0);
                i++;
                vencimiento = new SimpleDateFormat("dd-MM-yyyy").format(ce.getTime());

                PreparedStatement stClienteBorrar2 = conexion.prepareStatement("UPDATE pagares SET nro = '0' WHERE id_pagare = '" + id_pagare + "' ");
                stClienteBorrar2.executeUpdate();

                int nro = 0;
                Statement ST_3 = conexion.createStatement();
                ResultSet RS_3 = ST_3.executeQuery("SELECT MAX(nro) FROM pagares");
                if (RS_3.next()) {
                    nro = RS_3.getInt(1) + 1;
                }

                if (mes3.equals(enero)) {
                    venc_mes_str = "01";
                }
                if (mes3.equals(febrero)) {
                    venc_mes_str = "02";
                }
                if (mes3.equals(marzo)) {
                    venc_mes_str = "03";
                }
                if (mes3.equals(abril)) {
                    venc_mes_str = "04";
                }
                if (mes3.equals(mayo)) {
                    venc_mes_str = "05";
                }
                if (mes3.equals(junio)) {
                    venc_mes_str = "06";
                }
                if (mes3.equals(julio)) {
                    venc_mes_str = "07";
                }
                if (mes3.equals(agosto)) {
                    venc_mes_str = "08";
                }
                if (mes3.equals(setiembre)) {
                    venc_mes_str = "09";
                }
                if (mes3.equals(octubre)) {
                    venc_mes_str = "10";
                }
                if (mes3.equals(noviembre)) {
                    venc_mes_str = "11";
                }
                if (mes3.equals(diciembre)) {
                    venc_mes_str = "12";
                }

                int dias = 0;

                int nro_de_dma = nro_de_pagares;

                cantidad_nueva = cantidad / cantidad_pagare;

                total_parcial = cantidad_nueva * cantidad_pagare;

                diferencia = total - total_parcial;

                String cantidad_string = Integer.toString(cantidad_nueva);
                String aRemplazar = NumLetra.Convertir(cantidad_string, true);
                String remplazado = aRemplazar.replace("0", "");

                String anho_str = String.valueOf(vencimiento.charAt(6)) + String.valueOf(vencimiento.charAt(7)) + String.valueOf(vencimiento.charAt(8)) + String.valueOf(vencimiento.charAt(9));
                String mes_str = String.valueOf(vencimiento.charAt(3)) + String.valueOf(vencimiento.charAt(4));
                String dia_str = String.valueOf(vencimiento.charAt(0)) + String.valueOf(vencimiento.charAt(1));

                int mes_int = Integer.parseInt(mes_str);
                String mes4 = mes_str;
                if (mes_int == 1) {
                    mes_str = "ENERO";
                }
                if (mes_int == 2) {
                    mes_str = "FEBRERO";
                }
                if (mes_int == 3) {
                    mes_str = "MARZO";
                }
                if (mes_int == 4) {
                    mes_str = "ABRIL";
                }
                if (mes_int == 5) {
                    mes_str = "MAYO";
                }
                if (mes_int == 6) {
                    mes_str = "JUNIO";
                }
                if (mes_int == 7) {
                    mes_str = "JULIO";
                }
                if (mes_int == 8) {
                    mes_str = "AGOSTO";
                }
                if (mes_int == 9) {
                    mes_str = "SETIEMBRE";
                }
                if (mes_int == 10) {
                    mes_str = "OCTUBRE";
                }
                if (mes_int == 11) {
                    mes_str = "NOVIEMBRE";
                }
                if (mes_int == 12) {
                    mes_str = "DICIEMBRE";
                }

//                int moneda_int = Integer.parseInt(moneda);
                String moneda2 = "";
                String moneda_guarani = "GUARANIES";
                if (moneda.trim().equals(moneda_guarani)) {
                    moneda = "GUARANIES";
                    moneda2 = "Gs.";
                } else {
                    moneda = "DOLARES AMERICANOS";
                    moneda2 = "USD";
                }

                int id_pag = id_pagare;
                if (i <= cantidad_pagare) {

                    Statement st1 = conexion.createStatement();
                    ResultSet result = st1.executeQuery("SELECT MAX(id_pagare) FROM pagares");
                    if (result.next()) {
                        id = result.getInt(1) + 1;
                    }

                    java.sql.Date fecha_sql = Metodos.util_Date_to_sql_date(fecha);
                    java.sql.Date vencimiento_sql = Metodos.util_Date_to_sql_date(fecha_vencimiento);

                    PreparedStatement st2 = conexion.prepareStatement("INSERT INTO pagares VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    st2.setInt(1, id);
                    st2.setInt(2, id_pag);
                    st2.setString(3, moneda);
                    st2.setInt(4, cantidad_nueva);
                    st2.setString(5, dia);
                    st2.setString(6, mes);
                    st2.setString(7, anho);
                    st2.setString(8, dia_str);
                    st2.setString(9, mes_str);
                    st2.setString(10, anho_str);
                    st2.setString(11, cliente);
                    st2.setString(12, moneda.trim() + " " + remplazado);
                    st2.setString(13, recibo_en);
                    st2.setString(14, recibo_a);
                    st2.setString(15, "0");
                    st2.setString(16, "0");
                    st2.setString(17, desu);
                    st2.setInt(18, 0);
                    st2.setInt(19, 1);
                    st2.setString(20, dia2);
                    st2.setString(21, mes4);
                    st2.setString(22, anho2);
                    st2.setString(23, dia_semana1);
                    st2.setString(24, dia_semana2);
                    st2.setInt(25, 0);
                    st2.setString(26, (i) + "/" + cantidad_pagare);
                    st2.setString(27, moneda2);
                    st2.setDate(28, fecha_sql);
                    st2.setDate(29, vencimiento_sql);
                    st2.setInt(30, interes);
                    st2.setInt(31, comision);
                    st2.executeUpdate();
                    //}
                    Date vencimiento_date = ce.getTime();
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(vencimiento_date);
                    calendar3.add(Calendar.DAY_OF_YEAR, dias);

                    vencimiento = new SimpleDateFormat("yyyy-MM-dd").format(calendar3.getTime());

                    Statement st7 = conexion.createStatement();
                    ResultSet result7 = st7.executeQuery("SELECT * FROM pagares_detalle where id_pagare = '" + id_pagare + "'");
                    while (result7.next()) {
                        int id_cliente = 0;
                        id_cliente = result7.getInt("cliente");
//                    id_cliente = result7.getInt("empresa");
                        int id2 = 0;
                        Statement st3 = conexion.createStatement();
                        ResultSet result3 = st3.executeQuery("SELECT MAX(id_pagares_detalles) FROM pagares_detalle");
                        if (result3.next()) {
                            id2 = result3.getInt(1) + 1;
                        }

                        PreparedStatement st6 = conexion.prepareStatement("INSERT INTO pagares_detalle VALUES(?,?,?,?)");
                        st6.setInt(1, id2);
                        st6.setInt(2, id);
                        st6.setInt(3, id_cliente);
                        st6.setString(4, result7.getString("empresa"));
                        st6.executeUpdate();

                    }
                }
            }

            total = cantidad_nueva + diferencia;

            PreparedStatement st10 = conexion.prepareStatement("UPDATE pagares SET cantidad = '" + total + "' WHERE id_pagare = '" + id + "' ");
            st10.executeUpdate();

            PreparedStatement stClienteBorrar = conexion.prepareStatement("UPDATE pagares SET borrado = '1' WHERE id_pagare = '" + id_pagare + "' ");
            stClienteBorrar.executeUpdate();

            JasperReport jr = null;

            Map parametros = new HashMap();
            String path = ubicacion_proyecto + "\\reportes\\pagare.jasper";

            ubicacion_proyecto = ubicacion_proyecto.replace("\\", "\\\\");

            System.err.println(ubicacion_proyecto);
            parametros.put("direccion", ubicacion_proyecto + "\\\\reportes\\\\pagare_clientes.");
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (SQLException | ParseException | JRException ex) {
            System.err.println(ex);
        }

    }

}
