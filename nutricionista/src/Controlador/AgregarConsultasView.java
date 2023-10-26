
package Controlador;

import accesoADatos.ConsultaData;
import accesoADatos.PacienteData;
import entidades.Consulta;
import entidades.Paciente;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author GOBIERNO
 */
public class AgregarConsultasView extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaConsultas
     */
    public AgregarConsultasView() {
        initComponents();
        cargarComboPaciente();
     
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTPeso = new javax.swing.JTextField();
        jTImc = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTAltura = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jCPaciente = new javax.swing.JComboBox<>();
        jDateFecha = new com.toedter.calendar.JDateChooser();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Peso");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Paciente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Altura");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("IMC");

        jTPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPesoActionPerformed(evt);
            }
        });

        jTImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTImcActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBlimpiar.setText("Limpiar");
        jBlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBlimpiarMouseClicked(evt);
            }
        });
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Agregar Consulta");

        jTAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAlturaKeyReleased(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTAltura)
                            .addComponent(jTImc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCPaciente, javax.swing.GroupLayout.Alignment.LEADING, 0, 129, Short.MAX_VALUE)))))
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAgregar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jBlimpiar)
                                .addGap(71, 71, 71)
                                .addComponent(jBSalir)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTImc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBlimpiar)
                    .addComponent(jBSalir))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPesoActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        PacienteData pacienteD = new PacienteData();
        ConsultaData consultaD = new ConsultaData();

        try {
            LocalDate fecha = jDateFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Paciente pacienteActual = (Paciente) jCPaciente.getSelectedItem();
            double peso = Double.valueOf(jTPeso.getText());
            double altura = Double.parseDouble(jTAltura.getText());
            double imc = consultaD.calculoImc(altura, peso);

            if (jTPeso.getText().isEmpty() || jTAltura.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Complete todos los campos");
                return;
            }
   
            Consulta consulta = new Consulta(fecha, peso, altura, imc, pacienteActual);
            consultaD.agregarConsulta(consulta);
            
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Ingrese un número válido " + ex);
        }


    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
         this.dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
      
        
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBlimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBlimpiarMouseClicked
       limpiarCampos();
    }//GEN-LAST:event_jBlimpiarMouseClicked

    private void jCPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCPacienteActionPerformed

    private void jTImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTImcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTImcActionPerformed

    private void jTAlturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAlturaKeyReleased
        //setea el IMC una vez que se carga la altura 
        ConsultaData consultaD = new ConsultaData();
        double peso = Double.valueOf(jTPeso.getText());
        double altura = Double.parseDouble(jTAltura.getText());
        double imc = consultaD.calculoImc(altura, peso);
        jTImc.setText(imc + "");
    }//GEN-LAST:event_jTAlturaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JComboBox<Paciente> jCPaciente;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTAltura;
    private javax.swing.JTextField jTFecha;
    private javax.swing.JTextField jTImc;
    private javax.swing.JTextField jTPeso;
    // End of variables declaration//GEN-END:variables

    public void completarImc() {

        ConsultaData consultaD = new ConsultaData();
        try {
            double peso = Double.valueOf(jTPeso.getText());
            double altura = Double.parseDouble(jTAltura.getText());
            double imc = consultaD.calculoImc(altura, peso); // calculo de IMC
            
            String imcS = Double.toString(imc); //convierte el double a Sring
                    jTImc.setText(imcS);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos " + e);
        }
       
    }

    public void limpiarCampos() {

        jCPaciente.setSelectedIndex(-1);
        jDateFecha.setDate(null);
        jTPeso.setText("");
        jTAltura.setText("");
        jTImc.setText("");

    }
     private void cargarComboPaciente() { // lista para cargar los items en la lista desplegable

        PacienteData pacienteD = new PacienteData();

        DefaultComboBoxModel<Paciente> mdlCombo = new DefaultComboBoxModel(pacienteD.listarPacientes().toArray());
        jCPaciente.setModel(mdlCombo);

    }

    public static boolean validarNumeros(String datos) {

        return datos.matches("[0-9]*");
    }

    public static boolean validarLetras(String datos) {

        return datos.matches("[a-zA-Z]*");
    }

    public static boolean validarLetra(String datos) {

        return datos.matches("[a-zA-Z]*");
    }
}
