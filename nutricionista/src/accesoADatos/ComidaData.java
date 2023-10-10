
package accesoADatos;

import entidades.Comida;
import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class ComidaData {

    private Connection con = null;

    public ComidaData() {

        con = Conexion.conectar("nutricionista");
    }

      public void altaComida(Comida comida) {

        String sql = "INSERT INTO comida (nombre, detalle, cantCalorias,estado) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               comida.setIdComida(rs.getInt(1)); 

                JOptionPane.showMessageDialog(null, "Comida ingresada correctamente");

            }

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }
    
    public void bajaComidaN (String nombre){
        
        String sql = "UPDATE comida SET estado = 0 WHERE nombre=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showMessageDialog(null, "Comida eliminada");
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
   }
    
     public void modificarComida (Comida comida){
        
        String sql = "UPDATE comida SET nombre=?, detalle=?, cantCalorias=? WHERE estado=1 AND idComida=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setInt(4, comida.getIdComida());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida modificada");
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
        
        
    }
         public void buscarComidaxDieta (Comida comida){
         }
         
        public ArrayList<Comida> listarComidaXCal(int cantCalorias) {

        String sql = "SELECT * FROM comida WHERE cantCalorias<?";
        ArrayList<Comida> listaComida = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, cantCalorias);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Comida comida = new Comida();

                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));

                listaComida.add(comida);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return listaComida;
    }

}
