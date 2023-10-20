
package accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;


public class XYSeries {

    private Connection con = null;

    public XYSeries() {

        con = Conexion.conectar("nutricionista");

    }

    public void agregarUsuario(String usuario, String password) {
        String sql = "insert int usuarios (usuario, password, tipoUsuario) VALUE (?,?)";
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
            JOptionPane.showMessageDialog(null, "Error al Agregar Usuario ");
        }

    }

    public void consultarUsuario(String user, String pass) {

        String sql = "SELECT idUsuario, usuario, password, tipoUsuario FROM usuarios WHERE usuario ='" + user + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, user);

            if (rs.next()) {
                String U = rs.getString("usuario");
                String P = rs.getString("password");
                String priv = rs.getString("tipoUsuario");

                if (user != U) {
                }

                if (pass.equals(P)) {
                    if (priv.equals("BASICO")) {
                        
                        Cliente cliente = new Cliente();
                        cliente.setLocationRelativeTo(null);
                        cliente.setVisible(true);

                    } else if (priv.equals("ADMINISTRADOR")) {
                        Nutricionista nutri = new Nutricionista();
                        nutri.setLocationRelativeTo(null);
                        nutri.setVisible(true);

                    }
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta");
        }
    }
}
