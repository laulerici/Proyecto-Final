
package Controlador;

import accesoADatos.ConsultaData;
import accesoADatos.PacienteData;
import entidades.Consulta;
import entidades.Paciente;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class VistaBuscarConsultas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(); //debemos instanciar el modelo

    ConsultaData consultaD = new ConsultaData();
    
    public VistaBuscarConsultas() {
        initComponents();
        armarCabecera();
        cargarComboPaciente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCBPaciente = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Consultas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Elija el paciente");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jCBPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68)
                                .addComponent(jCBPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPacienteActionPerformed

        PacienteData pacienteD = new PacienteData();
        Paciente paciente = new Paciente();

        Paciente pacienteElegido = (Paciente) jCBPaciente.getSelectedItem();

        borrarFilas();

        for (Consulta consulta : consultaD.listarPesos(pacienteElegido.getIdPaciente())) {

            modelo.addRow(new Object[]{consulta.getIdConsulta(), consulta.getFecha(), consulta.getPeso()});
        }
    }//GEN-LAST:event_jCBPacienteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Paciente> jCBPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        
        borrarFilas();

        jTable1.setModel(modelo);
        modelo.addColumn("idConsulta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Peso");
    }
    
    private void borrarFilas() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int rowCount = model.getRowCount();

    for (int i = rowCount - 1; i >= 0; i--) {
        model.removeRow(i);
    }
}

      private void cargarComboPaciente() { // lista para cargar los items en la lista desplegable

        PacienteData pacienteD = new PacienteData();

        DefaultComboBoxModel<Paciente> mdlCombo = new DefaultComboBoxModel(pacienteD.listarPacientes().toArray());
        jCBPaciente.setModel(mdlCombo);

    }

}
