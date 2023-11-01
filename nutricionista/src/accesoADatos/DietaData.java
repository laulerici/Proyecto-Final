
package accesoADatos;

import entidades.Comida;
import entidades.Dieta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class DietaData {
     private Connection con = null;
     
public DietaData(){
    con = Conexion.conectar("nutricionista");
}
 public void altaDieta(Dieta dieta) {

        String sql = "INSERT INTO dieta(nombre, idPaciente, fechaIni, fechaFin, pesoInicial, pesoFinal, estado) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaIni()));
            ps.setDate(4, Date.valueOf(dieta.getFechaFin()));
            ps.setDouble(5, dieta.getPesoInicial());
            ps.setDouble(6, dieta.getPesoFinal());
            ps.setBoolean(7, dieta.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               dieta.setIdDieta(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Dieta ingresada correctamente");

            }

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }
    
    public void bajaDietaN (String nombre){
        
        String sql = "UPDATE dieta SET estado = 0 WHERE nombre=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showMessageDialog(null, "Dieta eliminada");
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
        
    }
    
     public void modificarDieta (Dieta dieta){
        
        String sql = "UPDATE dieta SET nombre=?, idPaciente=? WHERE estado=1 AND idDieta=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getIdPaciente());
            ps.setInt(3, dieta.getIdDieta());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dieta modificada");
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
        
        
    }
     public ArrayList<Dieta> listarDietas() {

        String sql = "SELECT * FROM dieta";
        ArrayList<Dieta> listaDietas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

                Dieta dieta = new Dieta();
                
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setIdPaciente(rs.getInt("idPaciente"));
                dieta.setNombre(rs.getString("nombre"));
//                dieta.setFechaIni(rs.getDate("fechaIni").toLocalDate());
//                dieta.setFechaIni(rs.getDate("fechaFin").toLocalDate());
//                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
//                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                dieta.setEstado(rs.getBoolean("estado"));

                listaDietas.add(dieta);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        return listaDietas;
    }

}
