package DEV;

import FORMS.Logueo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection conexion = null;
    public static String db = null;

    public static void Iniciar_Conexion() {
        try {

            String result = "";
            String drive = "C";
            File file = File.createTempFile("realhowto", ".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);

            String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
                    + "Set colDrives = objFSO.Drives\n"
                    + "Set objDrive = colDrives.item(\"" + drive + "\")\n"
                    + "Wscript.Echo objDrive.SerialNumber";
            fw.write(vbs);
            fw.close();
            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                result += line;
            }
            input.close();

            db = null;
            String host = null;
            String user = null;
            String pass = null;
            String mac_adress = null;
            String mac_adress2 = null;

            if (result.equals("-792900638")) { // 4k 
//                db = "4k";
//                //db = "mca_novedades_nuevo";
////                db = "mca"; // del campo
//                host = "localhost";
//                user = "postgres";
//                pass = "postgres";
//                mac_adress = "-792900638";
                db = "comercios";
                host = "localhost";
                user = "root";
                pass = "vertrigo";
                mac_adress = "-792900638";
            }
            if (result.equals("-1878214831")) { // 4k 
//                db = "4k"; 
//                host = "190.104.167.162";
//                user = "postgres";
//                pass = "postgres";
//                mac_adress = "-1878214831";
                db = "comercios";
                host = "190.104.167.162";
                user = "root";
                pass = "vertrigo";
                mac_adress = "-1878214831";
            }

            if (result.equals("-1963187798")) { // fredy
                db = "CostaSurtidor";
                host = "localhost";
                user = "postgres";
                pass = "postgres";
                mac_adress = "-1963187798";
            }
            if (result.equals("-1471024726")) { // fredy
                db = "mca_novedades_nuevo";
                user = "postgres";
                pass = "postgres";
                host = "localhost";
                mac_adress = "-1471024726";
            }
            if (result.equals("-1764525605")) { // fredy
                db = "mca";
                user = "postgres";
                pass = "postgres";
                host = "localhost";
                mac_adress = "-1764525605";
            }

            // pipas bar en pipas
//            db = "pipas_bar";
//            user = "postgres";
//            pass = "0985846411";
//            host = "192.168.1.253";
            // pipas bar en pipas en 4k 
//            db = "pipas_bar";
//            user = "postgres";
//            pass = "postgres";
//            host = "190.104.167.162";
// DEMO
//            db = "comercios_demo";
//            host = "190.104.167.162"; // Host 4k
////            host = "localhost"; // Host 4k
//            user = "postgres";
//            pass = "postgres";
//            mac_adress = "00-E0-4C-80-14-91";
//            // MCA Novedades
//            // DEL CAMPO 
//            db = "mca"; 
//            host = "localhost"; // Host 4k
//            user = "postgres";
//            pass = "postgres";
//            // JMC
//            db = "jmc"; 
//            host = "190.104.167.162"; // Host 4k
//            user = "postgres";
//            pass = "postgres";
//             if ((sb.toString().equals(mac_adress)) || (sb.toString().equals(mac_adress2))) {
            if ((result.equals(mac_adress)) || (result.equals(mac_adress2))) {
                // Class.forName("org.postgresql.Driver");
                // conexion = DriverManager.getConnection("jdbc:postgresql://" + host + ":5432/" + db, user, pass);
                Class.forName("org.gjt.mm.mysql.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + db, user, pass);

                Logueo.jTextField1.setEditable(true);
                Logueo.jPasswordField1.setEditable(true);
            } else {
                JOptionPane.showMessageDialog(null, "PC no registrada (" + result + ")");
                System.exit(-1);
            }

        } catch (SQLException | ClassNotFoundException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void Cerrar_Conexion() {
        try {
            conexion.close();
            System.err.println("Conexion finalizada");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Verificar_conexion() {
        try {
            if (conexion.isClosed() == false) {
                System.err.println("conexion OK");
            } else {
                System.err.println("conexion FAIL");
                Iniciar_Conexion();
                if (conexion.isClosed() == false) {
                    System.err.println("conexion reiniciada; Conexion OK");
                } else {
                    JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos.");
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

}
