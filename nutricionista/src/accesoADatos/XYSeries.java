/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import Controlador.Cliente;
import Controlador.Nutricionista;
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
        String sql = "INSERT INTO usuarios (usuario, password) VALUE ('"+usuario+"', '"+password+"')"; 
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, usuario);
            ps.setString(2, password);
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            
            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "Usuario Agregado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Agregar Usuario " );
        }
                            
}
     /*   public void consultarUsuario (String user, String pass){
         
        
        String sql = "SELECT idUsuario, usuario, password, tipoUsuario FROM usuarios WHERE usuario ='"+user+"'";
        try {
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs= ps.executeQuery();
          ps.setString(1,user);
           
           if (rs.next()){
           String U =rs.getString("usuario");
           String P = rs.getString("password");
           String priv= rs.getString("tipoUsuario");
           
            if (user != U){}
           
           if (pass.equals(P)){
               if (priv.equals("BASICO")){
                   Cliente cliente = new Cliente();
                   cliente.setLocationRelativeTo(null);
                cliente.setVisible(true);
                
                
               }else if (priv.equals("ADMINISTRADOR")){
                   Nutricionista nutri = new Nutricionista();
                   nutri.setLocationRelativeTo(null);
                   nutri.setVisible(true);
                   
               }  
           }
             
           }
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta");
       }
}*/
}