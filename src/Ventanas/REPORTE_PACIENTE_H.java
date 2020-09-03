package Ventanas;
import Clases.Paciente;
import System.Sistema;
import javax.swing.JOptionPane;

public class REPORTE_PACIENTE_H extends javax.swing.JPanel {
    public REPORTE_PACIENTE_H() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        titulo1 = new javax.swing.JLabel();
        labelingresa = new javax.swing.JLabel();
        txtcodigobuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        labelapellidop = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        labelgenero = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labelcama = new javax.swing.JLabel();
        labeldoctor = new javax.swing.JLabel();
        txtdoctor = new javax.swing.JTextField();
        txtcama = new javax.swing.JTextField();
        txtespecialidad = new javax.swing.JTextField();
        labelespecialidad = new javax.swing.JLabel();
        btnNuevaConsulta = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();

        titulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo.setText("REGISTRO DE PACIENTES");

        jSeparator5.setForeground(new java.awt.Color(7, 143, 193));

        setBackground(new java.awt.Color(255, 255, 255));

        titulo1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo1.setText("BUSQUEDA DE PACIENTES HOSPITALIZADOS");

        labelingresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelingresa.setText("INGRESA EL CODIGO DEL PACIENTE");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsexoActionPerformed(evt);
            }
        });

        labelapellidop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelapellidop.setText("APELLIDOS: ");

        labelgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelgenero.setText("SEXO: ");

        labelnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelnombre.setText("NOMBRE: ");

        labelcama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelcama.setText("CAMA: ");

        labeldoctor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labeldoctor.setText("DOCTOR: ");

        labelespecialidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelespecialidad.setText("ESPECIALIDAD: ");

        btnNuevaConsulta.setText("NUEVA CONSULTA");
        btnNuevaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConsultaActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(7, 143, 193));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(labelingresa)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelapellidop)
                                    .addComponent(txtcodigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labeldoctor)
                                            .addComponent(labelespecialidad))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelnombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelgenero)
                                    .addComponent(labelcama))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcama, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtsexo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(titulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelingresa)
                    .addComponent(txtcodigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelapellidop)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelgenero)
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldoctor)
                    .addComponent(txtdoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcama)
                    .addComponent(labelespecialidad)
                    .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsultaActionPerformed
        this.txtcodigobuscar.setText("");
        //------------------------------
        this.txtapellido.setText("");
        this.txtcama.setText("");
        this.txtsexo.setText("");
        this.txtdoctor.setText("");
        this.txtespecialidad.setText("");
        this.txtnombre.setText("");
    }//GEN-LAST:event_btnNuevaConsultaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigobus = txtcodigobuscar.getText();        
        String [] datosPaciente = new String [5];
        
        datosPaciente = Sistema.planilla.ObtenerDatosPaciente(codigobus);
        
        if(txtcodigobuscar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tiene que ingresar un codigo");
        }else{
            txtnombre.setText(datosPaciente[0]);
            txtapellido.setText(datosPaciente[1]);
            txtsexo.setText(datosPaciente[2]);
            txtespecialidad.setText(datosPaciente[3]);
            txtdoctor.setText(datosPaciente[4]);
            txtcama.setText("101");
        }   
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevaConsulta;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelapellidop;
    private javax.swing.JLabel labelcama;
    private javax.swing.JLabel labeldoctor;
    private javax.swing.JLabel labelespecialidad;
    private javax.swing.JLabel labelgenero;
    private javax.swing.JLabel labelingresa;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcama;
    private javax.swing.JTextField txtcodigobuscar;
    private javax.swing.JTextField txtdoctor;
    private javax.swing.JTextField txtespecialidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}
