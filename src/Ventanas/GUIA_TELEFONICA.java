package Ventanas;

import System.Sistema;
import java.io.FileReader;
import java.io.IOException;

public class GUIA_TELEFONICA extends javax.swing.JPanel {

    public GUIA_TELEFONICA() throws IOException {
        initComponents();
        llenar_area ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        titulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        label = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(7, 143, 193));

        titulo1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        titulo1.setText("GUÍA TELEFÓNICA DE PACIENTES");

        label.setColumns(20);
        label.setRows(5);
        jScrollPane1.setViewportView(label);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(titulo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(titulo1)
                .addGap(33, 33, 33)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void llenar_area () throws IOException {
        Sistema.planilla.Llenar_guia();
        String cadena = "";
        FileReader fr = new FileReader ("Guia Telefonica.txt");
        int valor = fr.read();
        while(valor != -1){
            cadena = cadena + (char)valor;
            valor = fr.read();
        }
       label.setText(cadena);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea label;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
