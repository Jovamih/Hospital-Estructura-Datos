package Ventanas;

import javax.swing.ImageIcon;

public class VPrincipalDoc extends javax.swing.JFrame {

    public VPrincipalDoc() {
        initComponents();
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoEsSalud.jpg")).getImage());
            System.out.println("Ícono cargado correctamente");
        }catch(Exception e){
            System.out.println("No se encontró ícono");
        }
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelicono = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Button_REGISTRAR_DOCTOR = new javax.swing.JButton();
        Button_REGRISTRAR_PACIENTE = new javax.swing.JButton();
        Button_HORARIO_DE_ESPACIOS = new javax.swing.JButton();
        Button_DISPONIBILIDAD_DE_CAMAS = new javax.swing.JButton();
        Button_DAR_BAJA_DOCTOR = new javax.swing.JButton();
        Button_SACAR_CITA = new javax.swing.JButton();
        Button_SALIRYGUARDAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoEsSalud.jpg"))); // NOI18N

        labeltitulo.setText("Bienvenido");

        jPanel3.setBackground(new java.awt.Color(7, 143, 193));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        Button_REGISTRAR_DOCTOR.setBackground(new java.awt.Color(19, 151, 208));
        Button_REGISTRAR_DOCTOR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_REGISTRAR_DOCTOR.setForeground(new java.awt.Color(255, 255, 255));
        Button_REGISTRAR_DOCTOR.setText("REGISTRAR DOCTOR");
        Button_REGISTRAR_DOCTOR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(26, 111, 148)));
        Button_REGISTRAR_DOCTOR.setContentAreaFilled(false);
        Button_REGISTRAR_DOCTOR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_REGISTRAR_DOCTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_REGISTRAR_DOCTORActionPerformed(evt);
            }
        });

        Button_REGRISTRAR_PACIENTE.setBackground(new java.awt.Color(42, 71, 158));
        Button_REGRISTRAR_PACIENTE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_REGRISTRAR_PACIENTE.setForeground(new java.awt.Color(255, 255, 255));
        Button_REGRISTRAR_PACIENTE.setText("REPORTE DE CITAS");
        Button_REGRISTRAR_PACIENTE.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(26, 111, 148)));
        Button_REGRISTRAR_PACIENTE.setContentAreaFilled(false);
        Button_REGRISTRAR_PACIENTE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_REGRISTRAR_PACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_REGRISTRAR_PACIENTEActionPerformed(evt);
            }
        });

        Button_HORARIO_DE_ESPACIOS.setBackground(new java.awt.Color(42, 71, 158));
        Button_HORARIO_DE_ESPACIOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_HORARIO_DE_ESPACIOS.setForeground(new java.awt.Color(255, 255, 255));
        Button_HORARIO_DE_ESPACIOS.setText("  CONSULTAS ADMINISTRATIVAS  ");
        Button_HORARIO_DE_ESPACIOS.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_HORARIO_DE_ESPACIOS.setContentAreaFilled(false);
        Button_HORARIO_DE_ESPACIOS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_HORARIO_DE_ESPACIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HORARIO_DE_ESPACIOSActionPerformed(evt);
            }
        });

        Button_DISPONIBILIDAD_DE_CAMAS.setBackground(new java.awt.Color(42, 71, 158));
        Button_DISPONIBILIDAD_DE_CAMAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_DISPONIBILIDAD_DE_CAMAS.setForeground(new java.awt.Color(255, 255, 255));
        Button_DISPONIBILIDAD_DE_CAMAS.setText("  DISPONIBILIDAD DE CAMAS  ");
        Button_DISPONIBILIDAD_DE_CAMAS.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_DISPONIBILIDAD_DE_CAMAS.setContentAreaFilled(false);
        Button_DISPONIBILIDAD_DE_CAMAS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_DISPONIBILIDAD_DE_CAMAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DISPONIBILIDAD_DE_CAMASActionPerformed(evt);
            }
        });

        Button_DAR_BAJA_DOCTOR.setBackground(new java.awt.Color(42, 71, 158));
        Button_DAR_BAJA_DOCTOR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_DAR_BAJA_DOCTOR.setForeground(new java.awt.Color(255, 255, 255));
        Button_DAR_BAJA_DOCTOR.setText("DAR DE BAJA DOCTOR");
        Button_DAR_BAJA_DOCTOR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_DAR_BAJA_DOCTOR.setContentAreaFilled(false);
        Button_DAR_BAJA_DOCTOR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_DAR_BAJA_DOCTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DAR_BAJA_DOCTORActionPerformed(evt);
            }
        });

        Button_SACAR_CITA.setBackground(new java.awt.Color(42, 71, 158));
        Button_SACAR_CITA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_SACAR_CITA.setForeground(new java.awt.Color(255, 255, 255));
        Button_SACAR_CITA.setText("SACAR CITA");
        Button_SACAR_CITA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_SACAR_CITA.setContentAreaFilled(false);
        Button_SACAR_CITA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_SACAR_CITA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SACAR_CITAActionPerformed(evt);
            }
        });

        Button_SALIRYGUARDAR.setBackground(new java.awt.Color(42, 71, 158));
        Button_SALIRYGUARDAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_SALIRYGUARDAR.setForeground(new java.awt.Color(255, 255, 255));
        Button_SALIRYGUARDAR.setText("SALIR Y GUARDAR");
        Button_SALIRYGUARDAR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_SALIRYGUARDAR.setContentAreaFilled(false);
        Button_SALIRYGUARDAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_SALIRYGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SALIRYGUARDARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_REGISTRAR_DOCTOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_REGRISTRAR_PACIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_HORARIO_DE_ESPACIOS, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
            .addComponent(Button_DISPONIBILIDAD_DE_CAMAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_DAR_BAJA_DOCTOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_SACAR_CITA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Button_SALIRYGUARDAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Button_REGISTRAR_DOCTOR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_DAR_BAJA_DOCTOR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_REGRISTRAR_PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_SACAR_CITA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_DISPONIBILIDAD_DE_CAMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Button_HORARIO_DE_ESPACIOS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_SALIRYGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelicono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(labeltitulo)
                .addGap(303, 303, 303))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelicono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labeltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_REGISTRAR_DOCTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_REGISTRAR_DOCTORActionPerformed

    }//GEN-LAST:event_Button_REGISTRAR_DOCTORActionPerformed

    private void Button_REGRISTRAR_PACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_REGRISTRAR_PACIENTEActionPerformed

    }//GEN-LAST:event_Button_REGRISTRAR_PACIENTEActionPerformed

    private void Button_HORARIO_DE_ESPACIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HORARIO_DE_ESPACIOSActionPerformed

    }//GEN-LAST:event_Button_HORARIO_DE_ESPACIOSActionPerformed

    private void Button_DISPONIBILIDAD_DE_CAMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DISPONIBILIDAD_DE_CAMASActionPerformed

    }//GEN-LAST:event_Button_DISPONIBILIDAD_DE_CAMASActionPerformed

    private void Button_DAR_BAJA_DOCTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DAR_BAJA_DOCTORActionPerformed

    }//GEN-LAST:event_Button_DAR_BAJA_DOCTORActionPerformed

    private void Button_SACAR_CITAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SACAR_CITAActionPerformed

    }//GEN-LAST:event_Button_SACAR_CITAActionPerformed

    private void Button_SALIRYGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SALIRYGUARDARActionPerformed


        Login l = new Login ();
        this.dispose();
        l.setVisible(true);
    }//GEN-LAST:event_Button_SALIRYGUARDARActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipalDoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_DAR_BAJA_DOCTOR;
    private javax.swing.JButton Button_DISPONIBILIDAD_DE_CAMAS;
    private javax.swing.JButton Button_HORARIO_DE_ESPACIOS;
    private javax.swing.JButton Button_REGISTRAR_DOCTOR;
    private javax.swing.JButton Button_REGRISTRAR_PACIENTE;
    private javax.swing.JButton Button_SACAR_CITA;
    private javax.swing.JButton Button_SALIRYGUARDAR;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelicono;
    private javax.swing.JLabel labeltitulo;
    // End of variables declaration//GEN-END:variables
}
