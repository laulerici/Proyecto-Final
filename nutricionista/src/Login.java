
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JInternalFrame {


    public Login() {
        initComponents();
    }

    private void IngresarSistema(String usuario, String password) {

        String capturar = "";
        String sql = "SELECT * FROM usuarios where usuario= '" + usuario + "'  && password= '" + password + "'";
        try {
            
            Statement st = objconect.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (result.next()) {
                capturar = result.getString("tipoUsuario");

            }
            if (capturar.equals("ADMINISTRADOR")) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                VentanaPrincipal objVP = new VentanaPrincipal();

                objVP.setVisible(true);
                objVP.pack();
                VentanaPrincipal.lbUsuario.setText(usuario);
            }
            if (capturar.equals("BASICO")) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                VentanaPrincipal objVP = new VentanaPrincipal();
                objVP.setVisible(true);
                objVP.pack();
                VentanaPrincipal.lbUsuario.setText(usuario);
                //VentanaPrincipal.jmnAdministracion.setEnabled(falso); limito el ingreso a reportes
                // VentanaPrincipal.jmnReportes.setEnabled(false);
            }
            if ((!capturar.equals("ADMINISTRADOR")) && (!capturar.equals("BASICO"));
            JOptionPane.showMessageDialog(this, "El tipo de Usuario no es valido");
        }

    }
    catch(SQLException ex

    
        ){
    Logger.getLogger(AccesoLogin.calss.getName()).log(Level.SEVERE, null, ex);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLacceso = new javax.swing.JLabel();
        jLusuario = new javax.swing.JLabel();
        jLpassword = new javax.swing.JLabel();
        jTuser = new javax.swing.JTextField();
        jTpass = new javax.swing.JTextField();
        jBingresar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        jLacceso.setText("Acceso al Sistema");

        jLusuario.setText("Usuario");

        jLpassword.setText("Password");

        jTuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTuserActionPerformed(evt);
            }
        });

        jBingresar.setText("Ingresar");
        jBingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBingresarActionPerformed(evt);
            }
        });

        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLpassword))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLacceso)
                            .addComponent(jTuser, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jTpass))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBingresar)
                        .addGap(68, 68, 68)
                        .addComponent(jBlimpiar)
                        .addGap(62, 62, 62)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLacceso)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLusuario)
                    .addComponent(jTuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBingresar)
                    .addComponent(jBlimpiar)
                    .addComponent(jBsalir))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBingresarActionPerformed
     String usu = jTuser.getText();
     String pass = new String(jTpass.getPassword());
     IngresarSistema
     
        


    }//GEN-LAST:event_jBingresarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTuserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBingresar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLacceso;
    private javax.swing.JLabel jLpassword;
    private javax.swing.JLabel jLusuario;
    private javax.swing.JTextField jTpass;
    private javax.swing.JTextField jTuser;
    // End of variables declaration//GEN-END:variables

}   
 Conectar conexion = new Conectar();
 conenection objconect = conexion.Conexion();
}


    

