
package Ventanas;

import Serializadores.SerializadorG;
import System.Sistema;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;


public class Gestion extends javax.swing.JFrame {

    public Gestion() {
        initComponents();
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoEsSalud.jpg")).getImage());
            System.out.println("Ícono cargado correctamente");
        }catch(Exception e){
            System.out.println("No se encontró ícono");
        }
        
        
        this.setTitle("Sistema de Gestión de Horarios");
        this.setSize(1257,859);
        this.setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelicono = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Button_REGISTRAR_DOCTOR = new javax.swing.JButton();
        Button_REGRISTRAR_PACIENTE = new javax.swing.JButton();
        Button_CONSULTAS_ADMIS = new javax.swing.JButton();
        Button_DAR_ALTA_PACIENTE = new javax.swing.JButton();
        Button_DAR_BAJA_DOCTOR = new javax.swing.JButton();
        Button_SACAR_CITA = new javax.swing.JButton();
        Button_SALIRYGUARDAR = new javax.swing.JButton();
        Button_HOSPITALIZAR = new javax.swing.JButton();
        Button_GESTION_EMERGENCIAS = new javax.swing.JButton();
        Button_IDENTIDAD = new javax.swing.JButton();
        PANEL_INTRO = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoEsSalud.jpg"))); // NOI18N

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
        Button_REGRISTRAR_PACIENTE.setText("REGISTRAR PACIENTE");
        Button_REGRISTRAR_PACIENTE.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(26, 111, 148)));
        Button_REGRISTRAR_PACIENTE.setContentAreaFilled(false);
        Button_REGRISTRAR_PACIENTE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_REGRISTRAR_PACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_REGRISTRAR_PACIENTEActionPerformed(evt);
            }
        });

        Button_CONSULTAS_ADMIS.setBackground(new java.awt.Color(42, 71, 158));
        Button_CONSULTAS_ADMIS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_CONSULTAS_ADMIS.setForeground(new java.awt.Color(255, 255, 255));
        Button_CONSULTAS_ADMIS.setText("  CONSULTAS ADMINISTRATIVAS  ");
        Button_CONSULTAS_ADMIS.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_CONSULTAS_ADMIS.setContentAreaFilled(false);
        Button_CONSULTAS_ADMIS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_CONSULTAS_ADMIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CONSULTAS_ADMISActionPerformed(evt);
            }
        });

        Button_DAR_ALTA_PACIENTE.setBackground(new java.awt.Color(42, 71, 158));
        Button_DAR_ALTA_PACIENTE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_DAR_ALTA_PACIENTE.setForeground(new java.awt.Color(255, 255, 255));
        Button_DAR_ALTA_PACIENTE.setText("DAR DE ALTA PACIENTE");
        Button_DAR_ALTA_PACIENTE.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_DAR_ALTA_PACIENTE.setContentAreaFilled(false);
        Button_DAR_ALTA_PACIENTE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_DAR_ALTA_PACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DAR_ALTA_PACIENTEActionPerformed(evt);
            }
        });

        Button_DAR_BAJA_DOCTOR.setBackground(new java.awt.Color(42, 71, 158));
        Button_DAR_BAJA_DOCTOR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_DAR_BAJA_DOCTOR.setForeground(new java.awt.Color(255, 255, 255));
        Button_DAR_BAJA_DOCTOR.setText("MODIFICAR CITAS");
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

        Button_HOSPITALIZAR.setBackground(new java.awt.Color(42, 71, 158));
        Button_HOSPITALIZAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_HOSPITALIZAR.setForeground(new java.awt.Color(255, 255, 255));
        Button_HOSPITALIZAR.setText("HOSPITALIZAR PACIENTTE");
        Button_HOSPITALIZAR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_HOSPITALIZAR.setContentAreaFilled(false);
        Button_HOSPITALIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_HOSPITALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HOSPITALIZARActionPerformed(evt);
            }
        });

        Button_GESTION_EMERGENCIAS.setBackground(new java.awt.Color(42, 71, 158));
        Button_GESTION_EMERGENCIAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_GESTION_EMERGENCIAS.setForeground(new java.awt.Color(255, 255, 255));
        Button_GESTION_EMERGENCIAS.setText("GESTIÓN EMERGENCIAS");
        Button_GESTION_EMERGENCIAS.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_GESTION_EMERGENCIAS.setContentAreaFilled(false);
        Button_GESTION_EMERGENCIAS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_GESTION_EMERGENCIAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_GESTION_EMERGENCIASActionPerformed(evt);
            }
        });

        Button_IDENTIDAD.setBackground(new java.awt.Color(42, 71, 158));
        Button_IDENTIDAD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_IDENTIDAD.setForeground(new java.awt.Color(255, 255, 255));
        Button_IDENTIDAD.setText("¿QUÉNES SOMOS?");
        Button_IDENTIDAD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(16, 111, 148)));
        Button_IDENTIDAD.setContentAreaFilled(false);
        Button_IDENTIDAD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_IDENTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_IDENTIDADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_REGISTRAR_DOCTOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_REGRISTRAR_PACIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_CONSULTAS_ADMIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_DAR_ALTA_PACIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_DAR_BAJA_DOCTOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_SALIRYGUARDAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_HOSPITALIZAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_GESTION_EMERGENCIAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_SACAR_CITA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_IDENTIDAD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(Button_HOSPITALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Button_SACAR_CITA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_DAR_ALTA_PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_GESTION_EMERGENCIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_CONSULTAS_ADMIS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Button_IDENTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button_SALIRYGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PANEL_INTRO.setBackground(new java.awt.Color(255, 255, 255));
        this.setSize(1200,850);//Tamaño estático
        PANEL_INTRO.setPreferredSize(new java.awt.Dimension(657, 379));

        jLabel2.setText("©2020");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Basado en el hospital Guillermo Kaelin De La Fuente ");

        jLabel5.setText("Desarrollado por");

        jLabel6.setText("Ronald Alata");

        jLabel7.setText("Miguel Collantes");

        jLabel8.setText("Ericka Solier");

        jLabel9.setText("Johan Mitma");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kaelin.jpg"))); // NOI18N

        javax.swing.GroupLayout PANEL_INTROLayout = new javax.swing.GroupLayout(PANEL_INTRO);
        PANEL_INTRO.setLayout(PANEL_INTROLayout);
        PANEL_INTROLayout.setHorizontalGroup(
            PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_INTROLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(PANEL_INTROLayout.createSequentialGroup()
                        .addGroup(PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_INTROLayout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addGroup(PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_INTROLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_INTROLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(267, 267, 267))))
        );
        PANEL_INTROLayout.setVerticalGroup(
            PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_INTROLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        labeltitulo.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(7, 143, 193));
        labeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitulo.setText("SISTEMA DE GESTIÓN HOSPITALARIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelicono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PANEL_INTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelicono)
                    .addComponent(labeltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PANEL_INTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_CONSULTAS_ADMISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CONSULTAS_ADMISActionPerformed
        CONSULTAS_ADMINISTRATIVAS cons = new CONSULTAS_ADMINISTRATIVAS ();
        cons.setSize(1077, 679);//Tamaño del panel
        cons.setLocation(5, 5);//Posición dentro del panel principal

        PANEL_INTRO.removeAll();

        PANEL_INTRO.add(cons, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_Button_CONSULTAS_ADMISActionPerformed

    private void Button_REGRISTRAR_PACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_REGRISTRAR_PACIENTEActionPerformed
        REGISTRO_PACIENTES rpac = new REGISTRO_PACIENTES ();
        rpac.setSize(1077, 679);//Tamaño del panel
        rpac.setLocation(5, 5);//Posición dentro del panel principal

        PANEL_INTRO.removeAll();

        PANEL_INTRO.add(rpac, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_Button_REGRISTRAR_PACIENTEActionPerformed

    private void Button_REGISTRAR_DOCTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_REGISTRAR_DOCTORActionPerformed
        REGISTRO_DOCTORES reg = new REGISTRO_DOCTORES ();
        reg.setSize(1077, 679);//Tamaño del panel
        reg.setLocation(5, 5);//Posición dentro del panel principal
        
        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(reg, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_Button_REGISTRAR_DOCTORActionPerformed

    private void Button_DAR_ALTA_PACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DAR_ALTA_PACIENTEActionPerformed
        Sistema.planilla.pormientras();
    }//GEN-LAST:event_Button_DAR_ALTA_PACIENTEActionPerformed

    private void Button_DAR_BAJA_DOCTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DAR_BAJA_DOCTORActionPerformed
        MOVER_CITAS mc = new MOVER_CITAS ();
        mc.setSize(1077, 679);//Tamaño del panel
        mc.setLocation(5, 5);//Posición dentro del panel principal

        PANEL_INTRO.removeAll();

        PANEL_INTRO.add(mc, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }//GEN-LAST:event_Button_DAR_BAJA_DOCTORActionPerformed

    private void Button_SACAR_CITAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SACAR_CITAActionPerformed
        SACAR_CITA sc = new SACAR_CITA ();
        sc.setSize(1077, 679);//Tamaño del panel
        sc.setLocation(5, 5);//Posición dentro del panel principal
        
        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(sc, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();  
    }//GEN-LAST:event_Button_SACAR_CITAActionPerformed

    private void Button_SALIRYGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SALIRYGUARDARActionPerformed
       
        //Serializando los arreglos
        SerializadorG.Serializar("doctores", Sistema.planilla.getDoctores());
        SerializadorG.Serializar2("doctorescitas", Sistema.planilla.getDoccitas());
        SerializadorG.Serializar3("pacientes", Sistema.planilla.getPacientes());
        SerializadorG.Serializar4("habitaciones", Sistema.planilla.getHabitaciones());
        
        Login l = new Login ();
        this.dispose();
        l.setVisible(true);
    }//GEN-LAST:event_Button_SALIRYGUARDARActionPerformed

    private void Button_HOSPITALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HOSPITALIZARActionPerformed
        HOSPITALIZAR ho = new HOSPITALIZAR ();
        ho.setSize(1077, 679);//Tamaño del panel
        ho.setLocation(5, 5);//Posición dentro del panel principal
        
        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(ho, BorderLayout.CENTER);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint(); 
    }//GEN-LAST:event_Button_HOSPITALIZARActionPerformed

    private void Button_GESTION_EMERGENCIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_GESTION_EMERGENCIASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_GESTION_EMERGENCIASActionPerformed

    private void Button_IDENTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IDENTIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_IDENTIDADActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_CONSULTAS_ADMIS;
    private javax.swing.JButton Button_DAR_ALTA_PACIENTE;
    private javax.swing.JButton Button_DAR_BAJA_DOCTOR;
    private javax.swing.JButton Button_GESTION_EMERGENCIAS;
    private javax.swing.JButton Button_HOSPITALIZAR;
    private javax.swing.JButton Button_IDENTIDAD;
    private javax.swing.JButton Button_REGISTRAR_DOCTOR;
    private javax.swing.JButton Button_REGRISTRAR_PACIENTE;
    private javax.swing.JButton Button_SACAR_CITA;
    private javax.swing.JButton Button_SALIRYGUARDAR;
    public static javax.swing.JPanel PANEL_INTRO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelicono;
    private javax.swing.JLabel labeltitulo;
    // End of variables declaration//GEN-END:variables
}
