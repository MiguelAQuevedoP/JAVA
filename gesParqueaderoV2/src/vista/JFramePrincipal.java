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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JFramePrincipal extends javax.swing.JFrame {

    private JPanel panelPrincipal;
    private JPanelAutomovil panelAuto;
    private JPanelMotocicleta panelMoto;
    private JPanelBuscarAuto panelBuscarAuto;
    private JPanelBuscarMoto panelBuscarMoto;
    private JPanelUpdateAuto panelUpdateAuto;
    private JPanelUpdateMoto panelUpdateMoto;
    private JPanelViewAll panelViewAll;
    private JPanel panelCentral;
    private clsParqueadero objParqueadero;

    private JPanel contentPane;

    public JFramePrincipal() {

        this.inicializacion();
        this.iniciarComponentes();
    }

    public void inicializacion() {

        this.objParqueadero = new clsParqueadero("BARRIO LA VILLA", "PARQUEALO AQUI");

        this.panelAuto = new JPanelAutomovil(this.objParqueadero);
        this.panelMoto = new JPanelMotocicleta(this.objParqueadero);
        this.panelBuscarAuto = new JPanelBuscarAuto(this.objParqueadero);
        this.panelBuscarMoto = new JPanelBuscarMoto(this.objParqueadero);
        this.panelUpdateAuto = new JPanelUpdateAuto(this.objParqueadero);
        this.panelUpdateMoto = new JPanelUpdateMoto(this.objParqueadero);
        this.panelViewAll = new JPanelViewAll(this.objParqueadero);
        
    }

    public void iniciarComponentes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 807, 445);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(204, 204, 255));
        contentPane.add(panelSuperior, BorderLayout.NORTH);

        JLabel lblInformacionDelBanco = new JLabel("INFORMACION DEL PARQUEADERO");
        panelSuperior.add(lblInformacionDelBanco);

        JPanel panelIzquierdo = new JPanel();
        contentPane.add(panelIzquierdo, BorderLayout.WEST);

        JButton btnIngresarMoto = new JButton("AGREGAR MOTO");
        btnIngresarMoto.setBackground(new Color(204, 204, 255));
        btnIngresarMoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarMoto();
            }
        });

        JButton btnIngresarAuto = new JButton("AGREGAR AUTO");
        btnIngresarAuto.setBackground(new Color(204, 204, 255));
        btnIngresarAuto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarAuto();
            }
        });

        JButton btnBuscarAuto = new JButton("BUSCAR AUTO");
        btnBuscarAuto.setBackground(new Color(204, 204, 255));
        btnBuscarAuto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarBuscarAuto();
            }
        });

        JButton btnBuscarMoto = new JButton("BUSCAR MOTO");
        btnBuscarMoto.setBackground(new Color(204, 204, 255));
        btnBuscarMoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarBuscarMoto();
            }
        });

        JButton btnUpdateColorAuto = new JButton("ACTUALIZAR AUTO");
        btnUpdateColorAuto.setBackground(new Color(204, 204, 255));
        btnUpdateColorAuto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lanzarUpdateAuto();
            }
        });

        JButton btnUpdateColorMoto = new JButton("ACTUALIZAR MOTO");
        btnUpdateColorMoto.setBackground(new Color(204, 204, 255));
        btnUpdateColorMoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarUpdateMoto();
            }
        });
        
        JButton btnViewAll = new JButton("VER TODOS");
        btnViewAll.setBackground(new Color(204, 204,255));
        btnViewAll.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                lanzarViewAll();
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
        gl_panelIzquierdo.setHorizontalGroup(
                gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelIzquierdo.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnIngresarAuto, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnIngresarMoto, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnBuscarAuto, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnUpdateColorAuto, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnBuscarMoto, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnUpdateColorMoto, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnViewAll,GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnExit)
                                )
                                .addContainerGap())
        );
        gl_panelIzquierdo.setVerticalGroup(
                gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelIzquierdo.createSequentialGroup()
                                .addGap(18)
                                .addComponent(btnIngresarAuto)
                                .addGap(18)
                                .addComponent(btnIngresarMoto)
                                .addGap(18)
                                .addComponent(btnBuscarAuto)
                                .addGap(18)
                                .addComponent(btnBuscarMoto)
                                .addGap(18)
                                .addComponent(btnUpdateColorAuto)
                                .addGap(18)
                                .addComponent(btnUpdateColorMoto)
                                .addGap(18)
                                .addComponent(btnViewAll)
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

    public void lanzarAuto() {
        this.panelCentral.remove(panelMoto);
        this.panelCentral.remove(panelBuscarAuto);
        this.panelCentral.remove(panelBuscarMoto);
        this.panelCentral.remove(panelUpdateAuto);
        this.panelCentral.remove(panelUpdateMoto);
        this.panelCentral.remove(panelViewAll);
        this.panelCentral.add(this.panelAuto, BorderLayout.CENTER);
        dibujar();

    }

    public void lanzarMoto() {
        this.panelCentral.remove(panelAuto);
        this.panelCentral.remove(panelBuscarAuto);
        this.panelCentral.remove(panelBuscarMoto);
        this.panelCentral.remove(panelUpdateAuto);
        this.panelCentral.remove(panelUpdateMoto);
        this.panelCentral.remove(panelViewAll);
        this.panelCentral.add(this.panelMoto, BorderLayout.CENTER);
        dibujar();
    }
    
    public void lanzarBuscarAuto() {
        this.panelCentral.remove(panelMoto);
        this.panelCentral.remove(panelAuto);
        this.panelCentral.remove(panelBuscarMoto);
        this.panelCentral.remove(panelUpdateAuto);
        this.panelCentral.remove(panelUpdateMoto);
        this.panelCentral.remove(panelViewAll);
        this.panelCentral.add(this.panelBuscarAuto, BorderLayout.CENTER);
        dibujar();
    }
    
    public void lanzarBuscarMoto() {
        this.panelCentral.remove(panelMoto);
        this.panelCentral.remove(panelAuto);
        this.panelCentral.remove(panelBuscarAuto);
        this.panelCentral.remove(panelUpdateAuto);
        this.panelCentral.remove(panelUpdateMoto);
        this.panelCentral.remove(panelViewAll);
        this.panelCentral.add(this.panelBuscarMoto, BorderLayout.CENTER);
        dibujar();
    }
    
    public void lanzarUpdateAuto() {
        this.panelCentral.remove(panelMoto);
        this.panelCentral.remove(panelAuto);
        this.panelCentral.remove(panelBuscarAuto);
        this.panelCentral.remove(panelBuscarMoto);
        this.panelCentral.remove(panelUpdateMoto);
        this.panelCentral.remove(panelViewAll);
        this.panelCentral.add(this.panelUpdateAuto, BorderLayout.CENTER);
        dibujar();
    }
    
    public void lanzarUpdateMoto() {
        this.panelCentral.remove(panelMoto);
        this.panelCentral.remove(panelAuto);
        this.panelCentral.remove(panelBuscarAuto);
        this.panelCentral.remove(panelBuscarMoto);
        this.panelCentral.remove(panelUpdateAuto);
        this.panelCentral.remove(panelViewAll);
        this.panelCentral.add(this.panelUpdateMoto, BorderLayout.CENTER);
        dibujar();
    }

    public void lanzarViewAll(){
        this.panelCentral.remove(panelMoto);
        this.panelCentral.remove(panelAuto);
        this.panelCentral.remove(panelBuscarAuto);
        this.panelCentral.remove(panelBuscarMoto);
        this.panelCentral.remove(panelUpdateAuto);
        this.panelCentral.remove(panelUpdateMoto);
        this.panelCentral.add(this.panelViewAll, BorderLayout.CENTER);
        dibujar();
        
    }
    public void dibujar() {
        this.panelCentral.revalidate();
        this.panelCentral.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
