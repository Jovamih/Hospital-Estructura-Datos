package Ventanas;

import java.awt.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    private Component confirmation;
    public String usuario, password;
    public Login() {
        initComponents();
        try{//Se agrega esto por si no encuentra el ícono
            this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoEsSalud.jpg")).getImage());//ÍCONO
            System.out.println("Ícono cargado correctamente");
        }catch(Exception e){
            System.out.println("No se encontró ícono");
        }
        this.setLocationRelativeTo(this);
        
    }

    public void IniciarDatos (String u, String p){
        usuario = "admin";
        password = "admin";
    }
    
    public boolean DatosCorrectos () {
        boolean estado = false; 
        
        return estado;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new java.awt.Label();
        imgUSUARIO = new javax.swing.JLabel();
        imgCONTRA = new javax.swing.JLabel();
        btnINICIAR = new java.awt.Button();
        btnSALIR = new java.awt.Button();
        txtusuario = new javax.swing.JTextField();
        txtpswor = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        titulo.setAlignment(java.awt.Label.CENTER);
        titulo.setBackground(new java.awt.Color(0, 153, 204));
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("INICIAR SESIÓN");

        imgUSUARIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N

        imgCONTRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candado.jpg"))); // NOI18N

        btnINICIAR.setBackground(new java.awt.Color(0, 153, 204));
        btnINICIAR.setForeground(new java.awt.Color(255, 255, 255));
        btnINICIAR.setLabel("INICIAR");
        btnINICIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnINICIARMouseClicked(evt);
            }
        });
        btnINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINICIARActionPerformed(evt);
            }
        });

        btnSALIR.setBackground(new java.awt.Color(0, 153, 204));
        btnSALIR.setForeground(new java.awt.Color(255, 255, 255));
        btnSALIR.setLabel("SALIR");
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });

        txtusuario.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSALIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgCONTRA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgUSUARIO))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusuario)
                            .addComponent(txtpswor, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                    .addComponent(btnINICIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(imgUSUARIO))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCONTRA)
                    .addComponent(txtpswor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnINICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnINICIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnINICIARMouseClicked
        
    }//GEN-LAST:event_btnINICIARMouseClicked

    private void btnINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINICIARActionPerformed
        IniciarDatos(usuario, password);
        if(usuario.equals(txtusuario.getText()) && password.equals(txtpswor.getText())){
            Gestion g = new Gestion ();
            this.dispose();
            g.setVisible(true);
        }else if(txtusuario.getText().equals("") && txtpswor.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña estan vacios\nIngrese los por favor.");
            txtusuario.setFocusable(true);
        }else if(txtusuario.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngrese lo por favor.");
            txtusuario.setFocusable(true);
        }else if(txtpswor.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngrese lo por favor.");
            txtpswor.setFocusable(true);
        }else if(txtusuario.getText().compareTo(usuario)!=0 && txtpswor.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
             txtusuario.setFocusable(true);
        }else if(txtusuario.getText().compareTo(usuario)!=0){
            JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");
            txtusuario.setFocusable(true);
        }else if(txtpswor.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");
            txtpswor.setFocusable(true);
        }       
    }//GEN-LAST:event_btnINICIARActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(confirmation,"Desea salir?","Confirmacion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
        }
    }//GEN-LAST:event_btnSALIRActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnINICIAR;
    private java.awt.Button btnSALIR;
    private javax.swing.JLabel imgCONTRA;
    private javax.swing.JLabel imgUSUARIO;
    private java.awt.Label titulo;
    private javax.swing.JPasswordField txtpswor;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
