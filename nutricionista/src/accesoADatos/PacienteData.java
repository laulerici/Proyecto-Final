
package accesoADatos;

import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.mariadb.jdbc.Statement;


public class PacienteData {
    
    private Connection con = null;

    public PacienteData() {
        
        con=Conexion.conectar("nutricionista"); 
        
    }  
    public void altaPaciente(Paciente paciente) {

        String sql = "INSERT INTO paciente (nombre,apellido,domicilio,dni,telefono,estado) "
                + "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getDni());
            ps.setInt(5, paciente.getTelef());
            ps.setBoolean(6, true);

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
            ps.setInt(5, paciente.getTelef());
            ps.setInt(6, paciente.getIdPaciente());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente modificado");
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
   
    }
    
    public Paciente buscarPacienteXId(int idPaciente) {

        String sql = "SELECT * FROM paciente WHERE estado = 1 AND idPaciente = ?";

        Paciente paciente = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                paciente = new Paciente();
                paciente.setIdPaciente(idPaciente);
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setTelef(rs.getInt("telefono"));
                paciente.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "Paciente inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        return paciente;
    }
    
    public Paciente buscarPacienteXApellido(String apellido) {

        String sql = "SELECT * FROM paciente WHERE estado = 1 AND apellido = ?";

        Paciente paciente = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                paciente = new Paciente();
                paciente.setApellido("apellido");
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setTelef(rs.getInt("telefono"));
                paciente.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "Paciente inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        return paciente;
    }

    public Paciente buscarPacienteXdni(int dni) {

        String sql = "SELECT * FROM paciente WHERE estado = 1 AND dni = ?";

        Paciente paciente = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                paciente = new Paciente();
                paciente.setIdPaciente(dni);
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDomicilio(rs.getString("domicilio"));

                paciente.setTelef(rs.getString("telefono"));

                
                paciente.setTelef(rs.getInt("telefono"));
                paciente.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "Paciente inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        return paciente;
    }

    public ArrayList<Paciente> listarPacientes() {

        ArrayList listaPacientes = new ArrayList<>();

        String sql = "SELECT * FROM paciente";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Paciente paciente = new Paciente();

                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelef(rs.getString("telefono"));

                listaPacientes.add(paciente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        return listaPacientes;
    }
}
