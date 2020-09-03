package Ventanas;
import Clases.Doctor;
import System.Sistema;
import javax.swing.JOptionPane;

public class REGISTRO_DOCTORES extends javax.swing.JPanel {
    public REGISTRO_DOCTORES() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        comboEspecialidad = new javax.swing.JComboBox<>();
        btNuevo = new javax.swing.JButton();
        btRegistrar = new javax.swing.JButton();
        CODIGO = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        espec = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        labelarea = new javax.swing.JLabel();
        comboArea = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doctor.jpg"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo.setText("REGISTRO DE MÉDICOS");

        comboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar", "Medicina General", "Cardiología", "Dermatología", "Hematología", "Traumatología", "Geriatría", "Neumología", "Nefrología", "Reumatología", "Odontología", "Nutrición", "Psicología" }));
        comboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecialidadActionPerformed(evt);
            }
        });

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

        espec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        espec.setText("ESPECIALIDAD:");

        nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre1.setText("APELLIDOS: ");

        labelarea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelarea.setText("ÁREA:");

        comboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar", "Consulta", "Hospitalizacion", "Emergencia" }));
        comboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreaActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(7, 143, 193));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtnombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(espec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRegistrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre1)
                            .addComponent(telefono)
                            .addComponent(labelarea))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttelefono)
                            .addComponent(comboArea, 0, 199, Short.MAX_VALUE)
                            .addComponent(txtapellido))))
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombre1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelarea)
                    .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espec)
                    .addComponent(comboArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrar)
                    .addComponent(btNuevo))
                .addGap(132, 132, 132))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecialidadActionPerformed

    }//GEN-LAST:event_comboEspecialidadActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        txtcodigo.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txttelefono.setText("");
        comboEspecialidad.setSelectedIndex(0);
        comboArea.setSelectedIndex(0);
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        String nombre, apellido, codigo, tlf , especialidad, area;        
        Doctor doct = new Doctor ();
        if(ValidarForm()){
            nombre=this.txtnombre.getText();
            apellido = this.txtapellido.getText();
            codigo =this.txtcodigo.getText();
            tlf =this.txttelefono.getText();
            especialidad =this.comboEspecialidad.getSelectedItem().toString();
            area = this.comboArea.getSelectedItem().toString();

            doct.setCodigo(codigo); doct.setNombre(nombre);
            doct.setApellido(apellido); doct.setEspecialidad(especialidad);
            doct.setTelefono(tlf); doct.setArea(area);

            if (Sistema.planilla.ingresarDoctor(doct)) {
                if(doct.getArea().equals("Consulta")){
                    if (Sistema.planilla.ingresarDoctorCitas(doct)) {
                        JOptionPane.showMessageDialog(this, "Registro de Doctor de Citas concluido exitosamente.");
                    }
                }                
                JOptionPane.showMessageDialog(this, "Registro concluido exitosamente.");
            }else{
                JOptionPane.showMessageDialog(this, "El doctor ya ha sido registrado previamente.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos solicitados.");
        }
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void comboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreaActionPerformed

    }//GEN-LAST:event_comboAreaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CODIGO;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JComboBox<String> comboArea;
    private javax.swing.JComboBox<String> comboEspecialidad;
    private javax.swing.JLabel espec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelarea;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarForm(){
        boolean result=true;
        if (this.txtcodigo.getText().equals("") || this.txtnombre.getText().equals("") || 
                this.txttelefono.equals("") || this.txtapellido.getText().equals("") || 
                this.comboArea.getSelectedIndex()==0 
                || this.comboEspecialidad.getSelectedIndex()==0) {
            result=false;
        }
        return result;
    }
    
    
}
