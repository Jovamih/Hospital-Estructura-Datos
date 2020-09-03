package Ventanas;

import static Ventanas.Gestion.PANEL_INTRO;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CONSULTAS_ADMINISTRATIVAS extends javax.swing.JPanel {

    public CONSULTAS_ADMINISTRATIVAS() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        labelOrganigrama = new javax.swing.JLabel();
        btnDoctores = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        btnGuiaTelefonica = new java.awt.Button();
        labelpaciente = new javax.swing.JLabel();
        btnDISPOCAMAS = new java.awt.Button();
        busquedapaciente = new javax.swing.JLabel();
        btnDISPOCAMAS1 = new java.awt.Button();
        titulo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnConsultasGenerales = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        btnHistorial = new java.awt.Button();
        btnCitas = new java.awt.Button();
        busquedapaciente1 = new javax.swing.JLabel();

        jSeparator3.setForeground(new java.awt.Color(7, 143, 193));

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1077, 679));

        labelOrganigrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtnGuia.jpg"))); // NOI18N

        btnDoctores.setBackground(new java.awt.Color(7, 143, 193));
        btnDoctores.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnDoctores.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctores.setLabel("REPORTE DOCTORES");
        btnDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctoresActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtnDoctor.jpg"))); // NOI18N

        btnGuiaTelefonica.setBackground(new java.awt.Color(7, 143, 193));
        btnGuiaTelefonica.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnGuiaTelefonica.setForeground(new java.awt.Color(255, 255, 255));
        btnGuiaTelefonica.setLabel("GUIA TELEFÓNICA");
        btnGuiaTelefonica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiaTelefonicaActionPerformed(evt);
            }
        });

        labelpaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btncama.jpg"))); // NOI18N

        btnDISPOCAMAS.setBackground(new java.awt.Color(7, 143, 193));
        btnDISPOCAMAS.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnDISPOCAMAS.setForeground(new java.awt.Color(255, 255, 255));
        btnDISPOCAMAS.setLabel("ESTADO CAMAS");
        btnDISPOCAMAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDISPOCAMASActionPerformed(evt);
            }
        });

        busquedapaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncitas.jpg"))); // NOI18N

        btnDISPOCAMAS1.setBackground(new java.awt.Color(7, 143, 193));
        btnDISPOCAMAS1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnDISPOCAMAS1.setForeground(new java.awt.Color(255, 255, 255));
        btnDISPOCAMAS1.setLabel("BUSQUEDA PACIENTE");
        btnDISPOCAMAS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDISPOCAMAS1ActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo.setText("CONSULTAS");

        jSeparator4.setForeground(new java.awt.Color(7, 143, 193));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnConsultasG.png"))); // NOI18N

        btnConsultasGenerales.setBackground(new java.awt.Color(7, 143, 193));
        btnConsultasGenerales.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnConsultasGenerales.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultasGenerales.setLabel("CONSULTAS GENERALES");
        btnConsultasGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasGeneralesActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnHistorial.png"))); // NOI18N

        btnHistorial.setBackground(new java.awt.Color(7, 143, 193));
        btnHistorial.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setLabel("HISTORIAL MÉIDCO");

        btnCitas.setBackground(new java.awt.Color(7, 143, 193));
        btnCitas.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnCitas.setLabel("CITAS PROGRAMADAS");
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });

        busquedapaciente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPaciente.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnGuiaTelefonica, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(labelOrganigrama)
                                .addGap(144, 144, 144)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(busquedapaciente)
                                .addGap(78, 78, 78)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultasGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(labelpaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(busquedapaciente1)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128)))
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDISPOCAMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(btnDISPOCAMAS1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(444, 444, 444))
            .addGroup(layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(busquedapaciente)))
                    .addComponent(labelOrganigrama))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuiaTelefonica, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelpaciente)
                    .addComponent(busquedapaciente1)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultasGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDISPOCAMAS1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDISPOCAMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctoresActionPerformed
        REPORTE_DOCTORES rep = new REPORTE_DOCTORES ();
        rep.setSize(1077, 679);
        rep.setLocation(5, 5);

        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(rep, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_btnDoctoresActionPerformed

    private void btnDISPOCAMAS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDISPOCAMAS1ActionPerformed
        REPORTE_PACIENTE_H repo = new REPORTE_PACIENTE_H ();
        repo.setSize(1077, 679);
        repo.setLocation(5, 5);

        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(repo, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_btnDISPOCAMAS1ActionPerformed

    private void btnDISPOCAMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDISPOCAMASActionPerformed
        REPORTE_CAMAS_AREAS repC = new REPORTE_CAMAS_AREAS ();
        repC.setSize(1077, 679);
        repC.setLocation(5, 5);

        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(repC, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_btnDISPOCAMASActionPerformed

    private void btnConsultasGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasGeneralesActionPerformed
        CONSULTAS_GENERALES cg = new CONSULTAS_GENERALES ();
        cg.setSize(1077, 679);
        cg.setLocation(5, 5);

        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(cg, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_btnConsultasGeneralesActionPerformed

    private void btnGuiaTelefonicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiaTelefonicaActionPerformed
        try {
            GUIA_TELEFONICA gt = new GUIA_TELEFONICA ();
            gt.setSize(1077, 679);
            gt.setLocation(5, 5);
            
            PANEL_INTRO.removeAll();
            PANEL_INTRO.add(gt, BorderLayout.CENTER);
            PANEL_INTRO.revalidate();
            PANEL_INTRO.repaint();
        } catch (IOException ex) {
            Logger.getLogger(CONSULTAS_ADMINISTRATIVAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuiaTelefonicaActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        CITAS_X_DOCTOR cd = new CITAS_X_DOCTOR ();
        cd.setSize(1077, 679);
        cd.setLocation(5, 5);

        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(cd, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_btnCitasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCitas;
    private java.awt.Button btnConsultasGenerales;
    private java.awt.Button btnDISPOCAMAS;
    private java.awt.Button btnDISPOCAMAS1;
    private java.awt.Button btnDoctores;
    private java.awt.Button btnGuiaTelefonica;
    private java.awt.Button btnHistorial;
    private javax.swing.JLabel busquedapaciente;
    private javax.swing.JLabel busquedapaciente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelOrganigrama;
    private javax.swing.JLabel labelpaciente;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
