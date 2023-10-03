
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
    
    public void bajaPacienteDni (int dni){
        
        String sql = "UPDATE paciente SET estado = 0 WHERE dni =?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,dni);
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showMessageDialog(null, "Paciente eliminado");
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
        
        
    }
    
     public void bajaPacienteAp (String apellido){
        
        String sql = "UPDATE paciente SET estado = 0 WHERE apellido =?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,apellido);
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showMessageDialog(null, "Paciente eliminado");
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
        
        
    }
    public void modificarPaciente (Paciente paciente){
        
        String sql = "UPDATE paciente SET nombre=?, apellido=?, domicilio=?, dni=?, "
                + "telefono=? WHERE estado=1 AND idPaciente=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getDni());
            ps.setString(5, paciente.getTelef());
            ps.setInt(6, paciente.getIdPaciente());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente modificado");
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
        
        
    }
    
}
