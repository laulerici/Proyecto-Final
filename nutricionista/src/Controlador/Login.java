package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    public void IngresarSistema(String usuario, String password) {

        String capturar = "";
        String sql = "SELECT * FROM usuarios where usuario= '" + usuario + "'  && password= '" + password + "'";

        try {

            Statement st = objconect.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                capturar = rs.getString("tipoUsuario");

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
                //VentanaPrincipal.jmnReportes.setEnabled(false);
            }

            if ((!capturar.equals("ADMINISTRADOR")) && (!capturar.equals("BASICO")));

            JOptionPane.showMessageDialog(this, "El tipo de Usuario no es valido");

        } catch (SQLException ex) {

            Logger.getLogger(AccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        textPass = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jbIngresar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        jLabel1.setText("Acceso al Sistema");

        lbUsuario.setText("Usuario");

        lbPassword.setText("Password");

        textUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserActionPerformed(evt);
            }
        });

        textPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPassActionPerformed(evt);
            }
        });

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jbIngresar.setText("Ingresar");
        jbIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbIngresarMouseClicked(evt);
            }
        });
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbIngresar)
                                .addGap(58, 58, 58)
                                .addComponent(jbLimpiar)
                                .addGap(48, 48, 48)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPassword))
                                        .addGap(34, 34, 34)
                                        .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbUsuario)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPassword)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIngresar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPassActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        if(JOptionPane.showConfirmDialog(null, "¿Desea salir del Sistema?", "Acceso", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        textUser.setText("");
        textPass.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        String usu = textUser.getText();
        String pas = textPass.getSelectedText();
        
        IngresarSistema (usu, pas);
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void textUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jbIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIngresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbIngresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTextField textPass;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
