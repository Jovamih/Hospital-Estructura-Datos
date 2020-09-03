package Ventanas;

import System.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class MOVER_CITAS extends javax.swing.JPanel {
    
    DefaultComboBoxModel modelo1;
    DefaultComboBoxModel modelo2;
    
    public MOVER_CITAS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        nombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        labelingresa = new javax.swing.JLabel();
        txtcodigobuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        labelingresa1 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JLabel();
        flecah = new javax.swing.JLabel();
        comboPacientes = new javax.swing.JComboBox<>();
        comboDoctores = new javax.swing.JComboBox<>();
        btnnuevo = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo.setText("MODIFICACION PARA LAS CITAS");

        jSeparator4.setForeground(new java.awt.Color(7, 143, 193));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("NOMBRE: ");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre1.setText("APELLIDOS: ");

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        labelingresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelingresa.setText("INGRESA EL CODIGO DEL DOCTOR");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelingresa1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelingresa1.setText("Se refiere al Doctor:");

        nombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre2.setText("LISTA DE PACIENTES CON CITAS PROGRAMADAS");

        nombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre3.setText("DOCTORES DISPONIBLES");

        flecah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechalabel.png"))); // NOI18N

        comboPacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar" }));

        comboDoctores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar" }));

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.jpg"))); // NOI18N
        btnnuevo.setText("      NUEVO");

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnmodificar.setText(" MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(titulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelingresa1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(comboPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(126, 126, 126)
                                                .addComponent(flecah))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnnuevo)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(nombre)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(112, 112, 112)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnmodificar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelingresa)
                                        .addGap(35, 35, 35)
                                        .addComponent(txtcodigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nombre2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombre3)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre1)
                        .addGap(42, 42, 42)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelingresa)
                    .addComponent(txtcodigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(labelingresa1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre1)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre2)
                    .addComponent(nombre3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flecah)
                    .addComponent(comboDoctores, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(comboPacientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnmodificar))
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed

    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed

    }//GEN-LAST:event_txtapellidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigobus = txtcodigobuscar.getText();
        String especialidad;
        String [] datosDoctor = new String [3];

        datosDoctor = Sistema.planilla.ObtenerNombreApellidoDoctorCitas(codigobus);
        
        if(txtcodigobuscar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tiene que ingresar un codigo");
        }else{
            txtnombre.setText(datosDoctor[0]);
            txtapellido.setText(datosDoctor[1]);
        }        
        especialidad = datosDoctor[2];
                
        modelo1 = new DefaultComboBoxModel (Sistema.planilla.PacientesDeConsultas(codigobus));
        this.comboPacientes.setModel(modelo1);
        modelo2 = new DefaultComboBoxModel (Sistema.planilla.Opciones(especialidad));
        this.comboDoctores.setModel(modelo2);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

    }//GEN-LAST:event_btnmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> comboDoctores;
    private javax.swing.JComboBox<String> comboPacientes;
    private javax.swing.JLabel flecah;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelingresa;
    private javax.swing.JLabel labelingresa1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigobuscar;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
