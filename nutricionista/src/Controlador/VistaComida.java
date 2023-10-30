
package Controlador;

import static Controlador.VistaAgregarPaciente.validarLetras;
import static Controlador.VistaAgregarPaciente.validarNumeros;
import accesoADatos.*;
import entidades.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class VistaComida extends javax.swing.JInternalFrame {
    
     private ComidaData comData = new ComidaData();
     private Comida comidaActual = null;
     

    public VistaComida() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlNom = new javax.swing.JLabel();
        jldet = new javax.swing.JLabel();
        jlCal = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtDetalle = new javax.swing.JTextField();
        jtCalorias = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(659, 451));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detalle de Comidas");

        jlNom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlNom.setText("Nombre");

        jldet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jldet.setText("Detalle");

        jlCal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCal.setText("Calorias ");

        jtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtNombre.setBorder(null);

        jtDetalle.setBorder(null);
        jtDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDetalleActionPerformed(evt);
            }
        });

        jtCalorias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCalorias.setBorder(null);

        jbAgregar.setText("Agregar");
        jbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAgregarMouseClicked(evt);
            }
        });
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        jbBuscar.setBorder(null);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbModificarMouseClicked(evt);
            }
        });
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCal)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlNom)
                                        .addGap(63, 63, 63)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jldet)
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbModificar)
                                            .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jbAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbLimpiar)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlNom))
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlCal)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jldet)
                            .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAgregar)
                            .addComponent(jbBorrar)
                            .addComponent(jbsalir)
                            .addComponent(jbModificar)))
                    .addComponent(jbLimpiar))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jtDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDetalleActionPerformed

    }//GEN-LAST:event_jtDetalleActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        ComidaData comidaD = new ComidaData();
        comidaD.bajaComidaN(jtNombre.getText());
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        Comida comidaActual = comData.buscarComidaPorNombre(jtNombre.getText());

        if (comidaActual != null) {
            
            jtDetalle.setText(comidaActual.getDetalle());
            String calorias = Integer.toString(comidaActual.getCantCalorias());
            jtCalorias.setText(calorias);

        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        borrarCampos();
        comidaActual = null;

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarMouseClicked
      
    
        String nombre = jtNombre.getText();
        String detalle = jtDetalle.getText();
        int cantCalorias = Integer.parseInt(jtCalorias.getText());
            
        Comida comida = new Comida(nombre, detalle, cantCalorias);
        comida.setNombre(nombre);
        comida.setCantCalorias(cantCalorias);
        comida.setDetalle(detalle);
        
        
        comData.modificarComida(comida);
        
    }//GEN-LAST:event_jbModificarMouseClicked

    private void jbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseClicked
        
        String nombre = jtNombre.getText();
        String detalle = jtDetalle.getText();
        int cantCalorias = Integer.parseInt(jtCalorias.getText());

        if (nombre.isEmpty() || detalle.isEmpty() || jtCalorias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            return;
        }
        if (comidaActual == null) {
            
            comidaActual = new Comida(nombre, detalle, cantCalorias, true);
            comData.altaComida(comidaActual);
            
        } else {
            comidaActual.setNombre(nombre);
            comidaActual.setCantCalorias(cantCalorias);
            comidaActual.setDetalle(detalle);

        }
    }//GEN-LAST:event_jbAgregarMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JLabel jlCal;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jldet;
    private javax.swing.JTextField jtCalorias;
    private javax.swing.JTextField jtDetalle;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables


 private void borrarCampos() {
       
        jtNombre.setText("");
        jtDetalle.setText("");
        jtCalorias.setText("");
    }

    public static boolean validarNumeros(String datos) {

        return datos.matches("[0-9]*");
    }

    public static boolean validarLetras(String datos) {

        return datos.matches("[a-zA-Z]*");
    }


}






