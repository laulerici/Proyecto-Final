
package Controlador;

import accesoADatos.ComidaData;
import accesoADatos.DietaComidaData;
import accesoADatos.DietaData;
import accesoADatos.PacienteData;
import entidades.Comida;
import entidades.Consulta;
import entidades.Dieta;
import entidades.DietaComida;
import entidades.Paciente;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ArmarDieta extends javax.swing.JInternalFrame {

    private Comida comida = new Comida(); 
    private Dieta dieta = new Dieta();
    private ComidaData comidaD = new ComidaData(); 
    private DietaComida dietaCom = null; 
    private DietaData dietaD = new DietaData();
    private DietaComidaData dietaComD = new DietaComidaData(); 
    private DefaultComboBoxModel modeloCombo;
    private DefaultListModel modeloList = new DefaultListModel(); 
    private ArrayList array = new ArrayList();
  
    public ArmarDieta() {
        initComponents();
        cargarComboBoxComida();
        cargarComboBoxDieta();
        jList1.setModel(modeloList);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCComida = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jBSalir = new javax.swing.JButton();
        jBMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCDieta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione una comida");

        jCComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCComidaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione dieta");

        jCDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDietaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Armar dieta");

        jBAgregar.setText("Agregar");
        jBAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAgregarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Listado de comidas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 511, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jBAgregar)
                                .addGap(50, 50, 50)
                                .addComponent(jBMostrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCComida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jCDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMostrar)
                    .addComponent(jBAgregar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jBSalir)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCComidaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
       
       Dieta dietaElegida = (Dieta) jCDieta.getSelectedItem();
       
      ArrayList lista = dietaComD.listarComidasPorDieta(dietaElegida.getIdDieta());
       
        modeloList.removeAllElements();
        for(int i=0; i<lista.size(); i++){
            modeloList.addElement(lista.get(i));
        }
    }//GEN-LAST:event_jBMostrarActionPerformed

    private void jCDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCDietaActionPerformed

    private void jBAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarMouseClicked
  
        Comida comidaElegida = (Comida) jCComida.getSelectedItem();
        Dieta dietaElegida = (Dieta) jCDieta.getSelectedItem();
        dietaCom = new DietaComida(comidaElegida.getIdComida(), dietaElegida.getIdDieta(), true);
        dietaComD.altaDietaComida(dietaCom);
   
    }//GEN-LAST:event_jBAgregarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBMostrar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Comida> jCComida;
    private javax.swing.JComboBox<Dieta> jCDieta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<Comida> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void cargarComboBoxComida() {

        DefaultComboBoxModel<Comida> mdlComboC = new DefaultComboBoxModel(comidaD.listarComida().toArray());
        jCComida.setModel(mdlComboC);
    }

    public void cargarComboBoxDieta() {
        DefaultComboBoxModel<Dieta> mdlComboD = new DefaultComboBoxModel(dietaD.listarDietas().toArray());
        jCDieta.setModel(mdlComboD);
    }
    
}
