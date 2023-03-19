/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import modelo.*;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JFramePrincipal extends javax.swing.JFrame {

    private JPanel panelPrincipal;
    
    private JPanelInformacion panelInformacion;
    private JPanelLogros panelLogros;
    private JPanelMas panelMas;
    private JPanel panelCentral;
    private clsPersona objPersona;

    private JPanel contentPane;

    public JFramePrincipal() {
        this.inicializacion();
        this.iniciarComponentes();
    }

    public void inicializacion() {
        this.objPersona = new clsPersona("Juan Jose Dorado");
        this.panelInformacion = new JPanelInformacion(this.objPersona);
        this.panelLogros = new JPanelLogros(this.objPersona);
        this.panelMas = new JPanelMas(this.objPersona);   
    }

    public void iniciarComponentes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 445);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(204, 204, 255));
        contentPane.add(panelSuperior, BorderLayout.NORTH);

        JLabel lblInformacion = new JLabel("INFORMACION DE JUAN");
        panelSuperior.add(lblInformacion);

        JPanel panelIzquierdo = new JPanel();
        contentPane.add(panelIzquierdo, BorderLayout.WEST);

        

        JButton btnInformacion = new JButton("INFORMACIÓN PERSONAL");
        btnInformacion.setBackground(new Color(204, 204, 255));
        btnInformacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarInfo();
            }
        });
        JButton btnLogros = new JButton("LOGROS");
        btnLogros.setBackground(new Color(204, 204, 255));
        btnLogros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarLogros();
            }
        });
        
        JButton btnMasInfo = new JButton("MAS INFORMACION");
        btnMasInfo.setBackground(new Color(204, 204, 255));
        btnMasInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarMas();
            }
        });
                
        JButton btnExit = new JButton("SALIR");
        btnExit.setBackground(new Color(200, 50, 50));
        btnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                System.exit(0);
            }
        });
        GroupLayout gl_panelIzquierdo = new GroupLayout(panelIzquierdo);
        gl_panelIzquierdo.setHorizontalGroup(gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelIzquierdo.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnInformacion, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnLogros, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnMasInfo, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnExit)
                                )
                                .addContainerGap())
        );
        gl_panelIzquierdo.setVerticalGroup(gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelIzquierdo.createSequentialGroup()
                                .addGap(18)
                                .addComponent(btnInformacion)
                                .addGap(18)
                                .addComponent(btnLogros)
                                .addGap(18)
                                .addComponent(btnMasInfo)
                                .addGap(18)
                                .addComponent(btnExit)
                                .addContainerGap(80, Short.MAX_VALUE))
        );
        panelIzquierdo.setLayout(gl_panelIzquierdo);

        panelCentral = new JPanel();
        panelCentral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        contentPane.add(panelCentral, BorderLayout.CENTER);
        panelCentral.setLayout(new BorderLayout(0, 0));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    public void lanzarInfo() {
        this.panelCentral.remove(this.panelLogros);
        this.panelCentral.remove(this.panelMas);
        this.panelCentral.add(this.panelInformacion, BorderLayout.CENTER);
        dibujar();
    }
    public void lanzarLogros(){
        this.panelCentral.remove(this.panelInformacion);
        this.panelCentral.remove(this.panelMas);
        this.panelCentral.add(this.panelLogros, BorderLayout.CENTER);
        dibujar();
    }
    public void lanzarMas(){
        this.panelCentral.remove(this.panelInformacion);
        this.panelCentral.remove(this.panelLogros);
        this.panelCentral.add(this.panelMas, BorderLayout.CENTER);
        dibujar();
    }
    
    public void dibujar() {
        this.panelCentral.revalidate();
        this.panelCentral.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
