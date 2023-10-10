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
    public void altaDietaComida(DietaComida dietacomida){
        String sql= "INSERT INTO dietacomida(idComida, idDieta,estado) VALUES (?,?,?)";
    
         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

           
            ps.setInt(1, dietacomida.getIdComida());
            ps.setInt(2, dietacomida.getIdDieta());
            ps.setBoolean(3, dietacomida.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               dietacomida.setIdDieta(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Dieta Comida ingresada correctamente");

            }

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }
    
    
    
}
