package accesoADatos;

import entidades.Comida;
import entidades.DietaComida;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public ArrayList<Comida> listarComidasPorDieta(int idDieta){
        
        String sql = "SELECT comida.nombre, comida.detalle, comida.cantCalorias" 
                +"FROM dietacomida , comida  WHERE dietacomida.idComida = comida.idComida and idDieta = ?";
        
        ArrayList<Comida> listaComidaXDieta = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Comida comida = new Comida();

                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                

                listaComidaXDieta.add(comida);
            }
            ps.close(); 
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        
        return listaComidaXDieta;
    
    
    
    }
    
  /*
    public void sumarCaloriasXDieta (int idDieta){
       
       String sql  = "SELECT SUM(cantCalorias) FROM dietacomida, comida "
               + "WHERE dietacomida.idComida=comida.idComida AND idDieta = ?";
       
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            
           for (Comida comida:comidaD.)
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
       
       
   } 
    */
    
}
