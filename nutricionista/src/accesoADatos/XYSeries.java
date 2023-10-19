/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LAURA
 */
public class XYSeries {
    private Connection con = null;

    public XYSeries () {

        con = Conexion.conectar("nutricionista");

    }

    public void agregarUsuario(String usuario, String password) {
        String sql = "insert int usuarios (usuario, password, tipoUsuario) VALUE (?,?)"; try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, usuario);
            ps.setString(2, password);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            consulta.setIdConsulta(rs.getInt(1));

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "Consulta agregada con éxito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar consulta " + ex);
        }
        
                
    
}
}