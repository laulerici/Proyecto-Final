
package accesoADatos;

import entidades.Consulta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConsultaData {
    
    private Connection con = null;
    
    public ConsultaData(){
        
     con = Conexion.conectar("nutricionista");
        
    }
    
    public void agregarConsutla(Consulta consulta){
       
      String sql = "INSERT INTO consulta (fecha, peso, altura, imc, idPaciente) VALUES (?,?,?,?,?)";  
      
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
           
            ps.setDate(1, Date.valueOf(consulta.getFecha()));
            ps.setDouble(2,consulta.getPeso());
            ps.setDouble(3, consulta.getAltura());
            ps.setDouble(4, consulta.getImc());
            ps.setInt(5, consulta.getPaciente().getIdPaciente());
                   
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            consulta.setIdConsulta(rs.getInt(1));
            
            if (rs.next()){
                
                JOptionPane.showMessageDialog(null, "Consulta agregada con éxito");
           }
          ps.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al agregar consulta "+ ex);
        }
   
    }
 
    
    
    public ArrayList<Consulta> listarPesos(int idPaciente) {

        String sql = "SELECT fecha,peso FROM consulta WHERE idPaciente=?";

        ArrayList<Consulta> listaPesos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Consulta consulta = new Consulta();
                
                consulta.setFecha(rs.getDate("fecha").toLocalDate());
                consulta.setPeso(rs.getDouble("peso"));
                listaPesos.add(consulta);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error "+ ex);
        }
        return listaPesos;

    }
// public ArrayList<Comida> listarComidaXCal(int cantCalorias) {
//
//        String sql = "SELECT * FROM comida WHERE cantCalorias<?";
//        ArrayList<Comida> listaComida = new ArrayList<>();
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setInt(1, cantCalorias);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                Comida comida = new Comida();
//
//                comida.setIdComida(rs.getInt("idComida"));
//                comida.setNombre(rs.getString("nombre"));
//                comida.setDetalle(rs.getString("detalle"));
//                comida.setCantCalorias(rs.getInt("cantCalorias"));
//                comida.setEstado(rs.getBoolean("estado"));
//
//                listaComida.add(comida);
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error" + ex);
//        }
//        return listaComida;
//    }

 
    
}
