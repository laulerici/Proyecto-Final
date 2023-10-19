
package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

    private static String url = "jdbc:mariadb://localhost:3306/";
    private static String bd;
    private static String driver = "org.mariadb.jdbc.Driver";
    private static String usuario = "root";
    private static String pass = "";
    private static Connection con;

    private Conexion() { //el constructor es privado para que se pueda instanciar solo 1 objeto
        this.bd = bd;

    }

    public static Connection conectar(String bd) {  //el modelo singleton requiere el constructor privado y métodos estáticos

        if (con == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con = DriverManager.getConnection(url + bd, usuario, pass);
               JOptionPane.showMessageDialog(null, "Conectado!!" + bd);

                //System.out.println("Conexión exitosa a base de datos " + bd);
            } catch (ClassNotFoundException | SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error en la Conexión");
                //System.out.println("Error en conexión");
            }
        }
        return con;
    }

}
