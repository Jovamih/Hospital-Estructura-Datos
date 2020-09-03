package Ventanas;

import Clases.Cita;
import Clases.Doctor;
import Clases.Fecha;
import Clases.Paciente;
import System.Sistema;
import com.toedter.calendar.JCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class SACAR_CITA extends javax.swing.JPanel {
    
    DefaultComboBoxModel m;
    
    public SACAR_CITA() {
        initComponents(); 
        this.setSize(1077,679);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevo = new javax.swing.JButton();
        btRegistrar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        CODIGO = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        telefono = new javax.swing.JLabel();
        SERVICIO = new javax.swing.JLabel();
        comboDoctor = new javax.swing.JComboBox<>();
        txtpaciente = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        comboTurno = new javax.swing.JComboBox<>();
        comboEspecialidad = new javax.swing.JComboBox<>();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        lupita = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

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

        titulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo.setText("CITAS");

        CODIGO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CODIGO.setText("DNI PACIENTE:");

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("FECHA:");

        jSeparator3.setForeground(new java.awt.Color(7, 143, 193));

        telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono.setText("DOCTOR:");

        SERVICIO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SERVICIO.setText("SERVICIO:");

        comboDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja Especialidad" }));
        comboDoctor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                comboDoctorComponentHidden(evt);
            }
        });

        nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre1.setText("TURNO:");

        comboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar", "Mañana", "Tarde", "Noche" }));

        comboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Seleccionar", "Medicina General", "Cardiología", "Dermatología", "Hematología", "Traumatología", "Geriatría", "Neumología", "Nefrología", "Reumatología", "Odontología", "Nutrición", "Psicología" }));
        comboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecialidadActionPerformed(evt);
            }
        });

        lupita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minilupa.jpg"))); // NOI18N
        lupita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SERVICIO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lupita, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRegistrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(comboTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(nombre)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre1)))
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(504, 504, 504)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(nombre1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lupita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SERVICIO))
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telefono)
                                .addComponent(comboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(1, 1, 1)
                .addComponent(comboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrar)
                    .addComponent(btNuevo))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        txtpaciente.setText("");        
        comboEspecialidad.setSelectedIndex(0);
        comboDoctor.setSelectedIndex(0);
        comboTurno.setSelectedIndex(0);        
    }//GEN-LAST:event_btNuevoActionPerformed

    private void comboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecialidadActionPerformed

    }//GEN-LAST:event_comboEspecialidadActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        //System.out.println(jCalendar1.getCalendar().get(java.util.Calendar.YEAR));
        int dia = 29, mes = 11, año = 1999;
        
        String  codigo, especialidad, turno, doc;
        
        String nombrep, apellidop, tlfp ,sexop;
        String [] datos_paciente = new String [3];
        String r [] = this.comboDoctor.getSelectedItem().toString().split(" ");
        
        Paciente pac = new Paciente ();
        Doctor d = new Doctor ();
        Cita ci = new Cita ();
        
        if(ValidarForm()){
            //APILANDO CITA AL HISTORIAL
            codigo =this.txtpaciente.getText();
            especialidad =this.comboEspecialidad.getSelectedItem().toString();
            turno = this.comboTurno.getSelectedItem().toString();
            doc = this.comboDoctor.getSelectedItem().toString();            
            dia = jCalendar1.getCalendar().get(java.util.Calendar.DAY_OF_MONTH);
            mes = jCalendar1.getCalendar().get(java.util.Calendar.MONTH);
            año = jCalendar1.getCalendar().get(java.util.Calendar.YEAR);
            Fecha re = new Fecha (dia, mes, año);         
            ci.setServicio(especialidad);
            ci.setTurno(turno);
            ci.setFechaReservada(re);
            ci.setDoctor(doc);
            datos_paciente = Sistema.planilla.CopiarDatosPaciente(codigo);
            pac.setDNI(codigo);
            pac.setNombre(datos_paciente[0]);
            pac.setApellido(datos_paciente[1]);
            pac.setSexo(datos_paciente[2]);            
            d.setEspecialidad(especialidad);
            d.setApellido(r[0]);
            d.setNombre(r[1]);            
            Sistema.planilla.BuscarD(d);
            if (Sistema.planilla.ingresarPacienteLL(d, pac)) {
                JOptionPane.showMessageDialog(this, "Registro concluido exitosamente.");
            }else{
                JOptionPane.showMessageDialog(this, "El paciente ya ha sido registrado previamente.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos solicitados.");
        }
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void comboDoctorComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_comboDoctorComponentHidden
       
    }//GEN-LAST:event_comboDoctorComponentHidden

    private void lupitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupitaActionPerformed
        String especialidad;
        especialidad = comboEspecialidad.getSelectedItem().toString();        
        m = new DefaultComboBoxModel (Sistema.planilla.Opciones(especialidad));
        this.comboDoctor.setModel(m);
    }//GEN-LAST:event_lupitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CODIGO;
    private javax.swing.JLabel SERVICIO;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JComboBox<String> comboDoctor;
    private javax.swing.JComboBox<String> comboEspecialidad;
    private javax.swing.JComboBox<String> comboTurno;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton lupita;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtpaciente;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarForm(){
        boolean result=true;
        if (this.txtpaciente.getText().equals("") ||  
                comboEspecialidad.getSelectedIndex() == 0 ||
                comboDoctor.getSelectedIndex() == 0 ||
                comboTurno.getSelectedIndex() == 0) {
            result=false;
        }
        return result;
    }

}
