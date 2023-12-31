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

    // Verificar si ya existe una comida con el mismo nombre en la base de datos
    boolean comidaExistente = verificarComidaExistente(comida.getNombre());

    if (comidaExistente) {
        // Mostrar mensaje de error indicando que la comida ya existe
        JOptionPane.showMessageDialog(null, "La comida ya existe en la base de datos.");
    } else {
        String sql = "INSERT INTO comida (nombre, detalle, cantCalorias, estado) VALUES (?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

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
            JOptionPane.showMessageDialog(null, "Error al acceder tabla comida " + ex);
        }
    }
    }

// Método para verificar si ya existe una comida con el mismo nombre en la base de datos
public boolean verificarComidaExistente(String nombreComida) {
    String sql = "SELECT COUNT(*) FROM comida WHERE nombre = ?";
    PreparedStatement ps;
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreComida);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder tabla comida " + ex);
    }

    return false;
}

public void bajaComidaN(String nombre) {

        String sql = "UPDATE comida SET estado = 0 WHERE nombre=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public void modificarComida(Comida comida) {

        String sql = "UPDATE comida SET nombre=?, detalle=?, cantCalorias=? WHERE idComida = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setInt(4, comida.getIdComida());

            int exito =(int)ps.executeLargeUpdate();
            if (exito == 1) {
                
                JOptionPane.showMessageDialog(null, "Comida modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error no se puede modificar " + ex);
        }
    }
    

    public Comida buscarComidaPorNombre(String nombre) {
        String sql = "SELECT * FROM comida WHERE nombre=?";
        Comida comida = null;
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                comida = new Comida();
                comida.setNombre("nombre");
                comida.setIdComida(rs.getInt("idComida"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null,"ingrese un nombre Valido");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error comida Data" +ex);
        }
        return comida;
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

    public ArrayList<Comida> ordenarComidaXCalorias() {

        String sql = "SELECT nombre,detalle,cantCalorias FROM comida WHERE estado=1 ORDER BY cantCalorias DESC";
        ArrayList<Comida> listaComida = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Comida comida = new Comida();

                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));

                listaComida.add(comida);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return listaComida;
    }

        public ArrayList<Comida> listarComida() {

        String sql = "SELECT * FROM comida";
        ArrayList<Comida> listaComidas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Comida comida = new Comida();

                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));

                listaComidas.add(comida);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return listaComidas;
    }
    
    public ArrayList<Comida> listarComidasPorDieta(int idDieta) { // método con error VER!!!

        String sql = "SELECT comida.nombre, comida.detalle, comida.cantCalorias"
                + "FROM dietacomida , comida  WHERE dietacomida.idComida = comida.idComida and idDieta = ?";

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
}
