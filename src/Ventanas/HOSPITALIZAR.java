package Ventanas;

import Clases.Doctor;
import Clases.Paciente;
import System.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class HOSPITALIZAR extends javax.swing.JPanel {
    
    DefaultComboBoxModel m;
    
    public HOSPITALIZAR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btNuevo = new javax.swing.JButton();
        btRegistrar = new javax.swing.JButton();
        CODIGO = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        telefono1 = new javax.swing.JLabel();
        opcmasculino = new javax.swing.JRadioButton();
        opcfemenino = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        espec = new javax.swing.JLabel();
        comboEspecialidad = new javax.swing.JComboBox<>();
        telefono2 = new javax.swing.JLabel();
        comboCama = new javax.swing.JComboBox<>();
        BUSCARCAMA = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        titulo1 = new javax.swing.JLabel();
        codigolabel = new javax.swing.JLabel();
        txtcodigopaciente = new javax.swing.JTextField();
        btRegistrar1 = new javax.swing.JButton();
        btNuevo1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo.setText("REGISTRO DE PACIENTES");

        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.jpg"))); // NOI18N
        btNuevo.setText("   NUEVO");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btRegistrar.setText("REGISTRAR");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        CODIGO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CODIGO.setText("CÓDIGO: ");

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("NOMBRE: ");

        telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono.setText("TELÉFONO:");

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

        telefono1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono1.setText("SEXO:");

        opcmasculino.setText("Masculino");

        opcfemenino.setText("Femenino");

        jSeparator5.setForeground(new java.awt.Color(7, 143, 193));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(btRegistrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nombre)
                                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(opcmasculino)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(opcfemenino))))))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre1)
                                    .addComponent(telefono))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(txttelefono))))
                        .addGap(196, 230, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 139, Short.MAX_VALUE)
                        .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(582, 582, 582))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(419, 419, 419))
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre1)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono1)
                    .addComponent(opcmasculino)
                    .addComponent(opcfemenino))
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrar)
                    .addComponent(btNuevo))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));

        espec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        espec.setText("ESPECIALIDAD:");

        comboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar", "Medicina General", "Cardiología", "Dermatología", "Hematología", "Traumatología", "Geriatría", "Neumología", "Nefrología", "Reumatología" }));
        comboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecialidadActionPerformed(evt);
            }
        });

        telefono2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono2.setText("CAMA:");

        comboCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EscojaEspecialidad" }));
        comboCama.setPreferredSize(new java.awt.Dimension(56, 28));

        BUSCARCAMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minilupa.jpg"))); // NOI18N
        BUSCARCAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARCAMAActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(7, 143, 193));

        titulo1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo1.setText("HOSPITALIZACION DE PACIENTES");

        codigolabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel.setText("DNI PACIENTE:");

        btRegistrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btRegistrar1.setText("HOSPITALIZAR");
        btRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrar1ActionPerformed(evt);
            }
        });

        btNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.jpg"))); // NOI18N
        btNuevo1.setText("   NUEVO");
        btNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(btRegistrar1)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telefono2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboCama, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(espec)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(codigolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcodigopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52)
                                .addComponent(BUSCARCAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(titulo1)))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcodigopaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espec))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BUSCARCAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefono2)))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrar1)
                    .addComponent(btNuevo1))
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecialidadActionPerformed

    }//GEN-LAST:event_comboEspecialidadActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed

    }//GEN-LAST:event_btNuevoActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed

    }//GEN-LAST:event_btRegistrarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed

    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed

    }//GEN-LAST:event_txtapellidoActionPerformed

    private void btRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrar1ActionPerformed
        String codigo, numcama;        
        if(ValidarForm()){            
            codigo =this.txtcodigopaciente.getText();
            numcama = this.comboCama.getSelectedItem().toString();
            if (Sistema.planilla.HospitalizarP(codigo, numcama)) {
                JOptionPane.showMessageDialog(this, "Registro concluido exitosamente.");
            }else{
                JOptionPane.showMessageDialog(this, "El paciente ya ha sido registrado previamente.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos solicitados.");
        }
    }//GEN-LAST:event_btRegistrar1ActionPerformed

    private void btNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo1ActionPerformed
        txtcodigopaciente.setText("");        
        comboEspecialidad.setSelectedIndex(0);
        comboCama.setSelectedIndex(0);
    }//GEN-LAST:event_btNuevo1ActionPerformed

    private void BUSCARCAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARCAMAActionPerformed
        String especialidad; 
        especialidad = comboEspecialidad.getSelectedItem().toString();        
        m = new DefaultComboBoxModel (Sistema.planilla.CamasxEsp(especialidad));
        this.comboCama.setModel(m);
    }//GEN-LAST:event_BUSCARCAMAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCARCAMA;
    private javax.swing.JLabel CODIGO;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btNuevo1;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btRegistrar1;
    private javax.swing.JLabel codigolabel;
    private javax.swing.JComboBox<String> comboCama;
    private javax.swing.JComboBox<String> comboEspecialidad;
    private javax.swing.JLabel espec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JRadioButton opcfemenino;
    private javax.swing.JRadioButton opcmasculino;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono1;
    private javax.swing.JLabel telefono2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigopaciente;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarForm(){
        boolean result=true;
        if (this.txtcodigopaciente.getText().equals("") ||  
                comboEspecialidad.getSelectedIndex() == 0 ||
                comboCama.getSelectedIndex() == 0 ) {
            result=false;
        }
        return result;
    }

}
