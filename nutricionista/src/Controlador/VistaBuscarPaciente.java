package Controlador;

import accesoADatos.*;

import entidades.*;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaBuscarPaciente extends javax.swing.JInternalFrame {

    private PacienteData paData = new PacienteData();
    private Paciente pacienteActual = null;
    private ConsultaData consultaD = new ConsultaData();
    private DefaultTableModel modelo;

    private ArrayList<Consulta> consultaP;

    public VistaBuscarPaciente() {
        initComponents();
        modelo = new DefaultTableModel();
        armarcabecera();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtapellido = new javax.swing.JTextField();
        jtdni = new javax.swing.JTextField();
        jbbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jbmodificar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        jtdomicilio = new javax.swing.JTextField();
        jttelefono = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 0, 0));
        setMaximizable(true);

        jLabel1.setText("Buscar Paciente");

        jLabel2.setText("Apellido");

        jLabel3.setText("DNI");

        jtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdniActionPerformed(evt);
            }
        });

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        jbmodificar.setText("Modificar");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel5.setText("Domicilio");

        jLabel6.setText("Telefono");

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)))
                .addGap(103, 103, 103)
                .addComponent(jbbuscar)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbmodificar)
                        .addGap(99, 99, 99)
                        .addComponent(jbeliminar)
                        .addGap(63, 63, 63)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbuscar))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbmodificar)
                    .addComponent(jbeliminar)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        try {
            int dni = Integer.parseInt(jtdni.getText());
            
            pacienteActual = (Paciente) paData.buscarPacienteXdni(dni);

            if (pacienteActual != null) {
                jtnombre.setText(pacienteActual.getNombre());
                jtapellido.setText(pacienteActual.getApellido());
                jtdomicilio.setText(pacienteActual.getDomicilio());
                String telefono = Integer.toString(pacienteActual.getTelef());
                jttelefono.setText(telefono);

                borrartabla();

                consultaP = (ArrayList) consultaD.listarPesos(pacienteActual.getIdPaciente());

                for (Consulta consulta : consultaP) {
                    modelo.addRow(new Object[]{consulta.getFecha(), consulta.getPeso(), consulta.getImc()});

                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "debe ingresar un numero");
        } 

    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed

        String telefono = Integer.toString(pacienteActual.getTelef());
        if (!validarNumeros(jttelefono.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un Telefono valido");

            return;
        }

        String apellido = jtapellido.getText();
        if (!validarLetras(jtapellido.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un Apellido valido");
            return;
        }
        String nombre = jtnombre.getText();
        if (!validarLetra(jtnombre.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un Nombre valido");
            return;
        }
        String domicilio = jtdomicilio.getText();

        pacienteActual.setApellido(apellido);
        pacienteActual.setNombre(nombre);
        pacienteActual.setDomicilio(domicilio);
        paData.modificarPaciente(pacienteActual);

    }//GEN-LAST:event_jbmodificarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        if (pacienteActual != null) {
            paData.bajaPacienteDni(pacienteActual.getDni());

            pacienteActual = null;
            borrarText();
        } else {
            JOptionPane.showMessageDialog(this, "no hay alumno seleccionado");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdniActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        borrarText();
        borrartabla();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbmodificar;
    javax.swing.JTable jtable;
    private javax.swing.JTextField jtapellido;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtdomicilio;
    private javax.swing.JTextField jtnombre;
    private javax.swing.JTextField jttelefono;
    // End of variables declaration//GEN-END:variables

    private void armarcabecera() {
        /* borrartabla();
   // ArrayList<Object> filacabecera = new ArrayList <> ();
    jtable.setModel(modelo);
    modelo.addColumn("Fecha");
    modelo.addColumn("Peso");
    modelo.addColumn("IMC");
    //for (Object it: filacabecera){
    //modelo.addColumn(it);
    }
    //jtable.setModel(modelo);*/

        ArrayList<Object> filacabecera = new ArrayList<>();
        filacabecera.add("fecha");
        filacabecera.add("peso");
        filacabecera.add("IMC");
        for (Object it : filacabecera) {
            modelo.addColumn(it);
        }
        jtable.setModel(modelo);

    }

    private void borrarText() {
        jtdni.setText("");
        jtapellido.setText("");
        jtnombre.setText("");
        jtdomicilio.setText("");
        jttelefono.setText("");
    }

    private void borrartabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public static boolean validarNumeros(String datos) {

        return datos.matches("[0-9]*");
    }

    public static boolean validarLetras(String datos) {

        return datos.matches("[a-z, A-Z]*");
    }

    public static boolean validarLetra(String datos) {

        return datos.matches("[a-z, A-Z]*");
    }
}
