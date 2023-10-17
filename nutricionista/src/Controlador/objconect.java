
package Controlador;

import accesoADatos.Conexion;
import java.sql.Connection;
import java.sql.Statement;


public class objconect {
    private Connection con = null;
    
public objconect() {

        con = Conexion.conectar("nutricionista");
    }   

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
