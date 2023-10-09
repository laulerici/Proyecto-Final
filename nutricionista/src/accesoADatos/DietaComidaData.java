package accesoADatos;

import entidades.DietaComida;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class DietaComidaData {
    private Connection con = null;

    public DietaComidaData() {
        con = Conexion.conectar("nutricionista");
        
    }
    public void agregarComidaADieta(DietaComida dietacomida){
        String sql= "INSERT INTO dietacomida(idComida, idDieta,estado) VALUES (?,?,?)";
       // INSERT INTO dietacomida VALUES (4, 1,1,true);
    
         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

             ps.setInt(1, dietacomida.getIdComida());
             ps.setInt(2, dietacomida.getIdDieta());
             ps.setBoolean(3, dietacomida.isEstado());

             ps.executeUpdate();

             ResultSet rs = ps.getGeneratedKeys();

             if (rs.next()) {

                 dietacomida.setIdDC(rs.getInt(1));

                 JOptionPane.showMessageDialog(null, "Dieta Comida ingresada correctamente");
             }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }
    
//        public void sacarComidaDieta (String nombre){
//        
//        String sql = "UPDATE comida SET estado = 0 WHERE nombre=?";
//        
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1,nombre);
//            int exito = ps.executeUpdate();
//            
//            if (exito == 1){
//            JOptionPane.showMessageDialog(null, "Comida eliminada");
//            }
//             
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error "+ ex);
//        }
//   }
     
    public void listarComidasPorDieta(String nombreDieta){
        
        String sql = "SELECT idComida FROM dietacomida WHERE idDieta=?";
    
    
    
    }
   }
    
    
 
