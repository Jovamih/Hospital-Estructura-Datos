package Ventanas;

import System.Sistema;

public class CONSULTAS_GENERALES extends javax.swing.JPanel {

    public CONSULTAS_GENERALES() {
        initComponents();
        llenarDatos ();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        titulo2 = new javax.swing.JLabel();
        codigolabel = new javax.swing.JLabel();
        txtdoctores = new javax.swing.JTextField();
        codigolabel1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        txtnumemergencias = new javax.swing.JTextField();
        txtnumhospi = new javax.swing.JTextField();
        txtnumconsultas = new javax.swing.JTextField();
        codigolabel2 = new javax.swing.JLabel();
        txtpacientessistema = new javax.swing.JTextField();
        codigolabel3 = new javax.swing.JLabel();
        pachospitalizados = new javax.swing.JTextField();
        codigolabel4 = new javax.swing.JLabel();
        codigolabel5 = new javax.swing.JLabel();
        pac_hospi_hombres = new javax.swing.JTextField();
        pac_hospi_mujeres = new javax.swing.JTextField();
        pac_sistema_mujeres = new javax.swing.JTextField();
        codigolabel6 = new javax.swing.JLabel();
        codigolabel7 = new javax.swing.JLabel();
        pac_sistema_hombres = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator7.setForeground(new java.awt.Color(7, 143, 193));

        titulo2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo2.setText("ESTADISTICAS GENERALES");

        codigolabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel.setText("AREA DE HOSPITALIZACIÓN");

        codigolabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel1.setText("NÚMERO DE DOCTORES");

        label3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label3.setText("AREA DE CONSULTA");

        label4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label4.setText("AREA DE EMERGENCIAS");

        codigolabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel2.setText("NÚMERO DE PACIENTES REGISTRADOS EN EL SISTEMA");

        codigolabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel3.setText("NÚMERO DE PACIENTES HOSPITALIZADOS");

        codigolabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel4.setText("HOMBRES");

        codigolabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel5.setText("MUJERES");

        codigolabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel6.setText("HOMBRES");

        codigolabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigolabel7.setText("MUJERES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(titulo2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(codigolabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtpacientessistema, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(codigolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(1, 1, 1)
                                                    .addComponent(txtnumhospi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(63, 63, 63)
                                                    .addComponent(label3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtnumconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(codigolabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtdoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(73, 73, 73)
                                            .addComponent(label4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtnumemergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(codigolabel6)
                                            .addGap(26, 26, 26)
                                            .addComponent(pac_sistema_hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(101, 101, 101)
                                            .addComponent(codigolabel7)
                                            .addGap(31, 31, 31)
                                            .addComponent(pac_sistema_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(codigolabel3)
                                                    .addGap(46, 46, 46)
                                                    .addComponent(pachospitalizados, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(codigolabel4)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(pac_hospi_hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(101, 101, 101)
                                                    .addComponent(codigolabel5)
                                                    .addGap(13, 13, 13)))
                                            .addGap(18, 18, 18)
                                            .addComponent(pac_hospi_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigolabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumhospi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumemergencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpacientessistema, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pac_sistema_hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pac_sistema_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pachospitalizados, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pac_hospi_hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pac_hospi_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void llenarDatos () {
        String [] datos = new String [10];
        
        datos = Sistema.planilla.ConsultasGenerales();                
        txtdoctores.setText(datos[0]);
        txtnumhospi.setText(datos[1]);
        txtnumconsultas.setText(datos[2]);        
        txtnumemergencias.setText(datos[3]);
        txtpacientessistema.setText(datos[4]);
        pac_sistema_hombres.setText(datos[5]);
        pac_sistema_mujeres.setText(datos[6]);
        pachospitalizados.setText(datos[7]);
        pac_hospi_hombres.setText(datos[8]);
        pac_hospi_mujeres.setText(datos[9]);            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigolabel;
    private javax.swing.JLabel codigolabel1;
    private javax.swing.JLabel codigolabel2;
    private javax.swing.JLabel codigolabel3;
    private javax.swing.JLabel codigolabel4;
    private javax.swing.JLabel codigolabel5;
    private javax.swing.JLabel codigolabel6;
    private javax.swing.JLabel codigolabel7;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JTextField pac_hospi_hombres;
    private javax.swing.JTextField pac_hospi_mujeres;
    private javax.swing.JTextField pac_sistema_hombres;
    private javax.swing.JTextField pac_sistema_mujeres;
    private javax.swing.JTextField pachospitalizados;
    private javax.swing.JLabel titulo2;
    private javax.swing.JTextField txtdoctores;
    private javax.swing.JTextField txtnumconsultas;
    private javax.swing.JTextField txtnumemergencias;
    private javax.swing.JTextField txtnumhospi;
    private javax.swing.JTextField txtpacientessistema;
    // End of variables declaration//GEN-END:variables

}
