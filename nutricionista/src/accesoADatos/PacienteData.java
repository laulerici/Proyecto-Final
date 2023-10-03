
package accesoADatos;

import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class PacienteData {
    
    private Connection con = null;

    public PacienteData() {
        
        con=Conexion.conectar("nutricionista"); 
        
    }  
    public void altaPaciente(Paciente paciente) {

        String sql = "INSERT INTO paciente (nombre,apellido,domicilio,dni,telefono) "
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getDni());
            ps.setString(5, paciente.getTelef());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                paciente.setIdPaciente(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Paciente ingresado correctamente");

            }

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }
    
    public void bajaPaciente (int dni){
        
        String sql = "UPDATE paciente SET estado = 'false' WHERE dni =27171935";
        
    }
    
}
