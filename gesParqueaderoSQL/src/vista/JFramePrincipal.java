/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import acceso.clsVehiculoAccess;
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
    
    private JPanelAddVehiculo panelVehiculo;
    private JPanelBuscarVehiculo panelBuscarVehiculo;
    private JPanelUpdateVehiculo panelUpdateVehiculo;
    private JPanelRegistrarSalida panelRegistrarSalida;
    private JPanelWatchAll panelWatchAll;
    private JPanelBuscarCilindraje panelCilindraje;
    private JPanel panelCentral;
    private clsParqueadero objParqueadero;
    private clsVehiculo auxVehiculo;
    private clsVehiculoAccess auxVehiculoAccess;
    private JPanel contentPane;

    public JFramePrincipal() {

        this.inicializacion();
        this.iniciarComponentes();
    }

    public void inicializacion() {

        this.objParqueadero = new clsParqueadero("BARRIO LA VILLA", "PARQUEALO AQUI");

        
        this.panelVehiculo = new JPanelAddVehiculo(this.objParqueadero);
        this.panelBuscarVehiculo = new JPanelBuscarVehiculo();
        this.panelCilindraje = new JPanelBuscarCilindraje();
        this.panelUpdateVehiculo = new JPanelUpdateVehiculo();
        this.panelWatchAll = new JPanelWatchAll();
        this.panelRegistrarSalida = new JPanelRegistrarSalida(this.objParqueadero);
        
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
        lblInformacionDelBanco.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        panelSuperior.add(lblInformacionDelBanco);

        JPanel panelIzquierdo = new JPanel();
        contentPane.add(panelIzquierdo, BorderLayout.WEST);

        

        JButton btnIngresarVehiculo = new JButton("AGREGAR VEHICULO");
        btnIngresarVehiculo.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnIngresarVehiculo.setBackground(new Color(204, 204, 255));
        btnIngresarVehiculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarVehiculo();
            }
        });

        JButton btnBuscarPlaca = new JButton("BUSCAR POR PLACA");
        btnBuscarPlaca.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnBuscarPlaca.setBackground(new Color(204, 204, 255));
        btnBuscarPlaca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarBuscarVehiculo();
            }
        });
        
        JButton btnBuscarCilindraje = new JButton("BUSCAR POR CILINDRAJE");
        btnBuscarCilindraje.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnBuscarCilindraje.setBackground(new Color(204, 204, 255));
        btnBuscarCilindraje.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarBuscarCilindraje();
            }
        });

        JButton btnBuscarMoto = new JButton("ACTUALIZAR VEHICULO");
        btnBuscarMoto.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnBuscarMoto.setBackground(new Color(204, 204, 255));
        btnBuscarMoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lanzarUpdateVehiculo();
            }
        });

        JButton btnRegistarSalida = new JButton("REGISTRAR SALIDA");
        btnRegistarSalida.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnRegistarSalida.setBackground(new Color(204, 204, 255));
        btnRegistarSalida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lanzarRegistrarSalida();
            }
        });

        
        JButton btnViewAll = new JButton("VER TODOS");
        btnViewAll.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnViewAll.setBackground(new Color(204, 204,255));
        btnViewAll.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                lanzarViewAll();
            }
        });
        
        JButton btnExit = new JButton("SALIR");
        btnExit.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
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
                                        .addComponent(btnIngresarVehiculo, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnBuscarPlaca, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnBuscarCilindraje, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnRegistarSalida, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnBuscarMoto, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnViewAll,GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnExit)
                                )
                                .addContainerGap())
        );
        gl_panelIzquierdo.setVerticalGroup(gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelIzquierdo.createSequentialGroup()
                                .addGap(18)
                                .addComponent(btnIngresarVehiculo)
                                .addGap(18)
                                .addComponent(btnBuscarPlaca)
                                .addGap(18)
                                .addComponent(btnBuscarCilindraje)
                                .addGap(18)
                                .addComponent(btnBuscarMoto)
                                .addGap(18)
                                .addComponent(btnRegistarSalida)
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

    public void lanzarVehiculo() {
        
        this.panelCentral.remove(panelBuscarVehiculo);
        this.panelCentral.remove(panelUpdateVehiculo);
        this.panelCentral.remove(panelRegistrarSalida);
        this.panelCentral.remove(panelWatchAll);
        this.panelCentral.remove(panelCilindraje);
        this.panelCentral.add(this.panelVehiculo, BorderLayout.CENTER);
        dibujar();

    }
    public void lanzarBuscarVehiculo() {
        
        this.panelCentral.remove(panelVehiculo);
        this.panelCentral.remove(panelUpdateVehiculo);
        this.panelCentral.remove(panelRegistrarSalida);
        this.panelCentral.remove(panelWatchAll);
        this.panelCentral.remove(panelCilindraje);
        this.panelCentral.add(this.panelBuscarVehiculo, BorderLayout.CENTER);
        dibujar();

    }
    public void lanzarUpdateVehiculo() {
        
        this.panelCentral.remove(panelVehiculo);
        this.panelCentral.remove(panelBuscarVehiculo);
        this.panelCentral.remove(panelRegistrarSalida);
        this.panelCentral.remove(panelWatchAll);
        this.panelCentral.remove(panelCilindraje);
        this.panelCentral.add(this.panelUpdateVehiculo, BorderLayout.CENTER);
        dibujar();

    }
    
    public void lanzarRegistrarSalida() {
        
        this.panelCentral.remove(panelVehiculo);
        this.panelCentral.remove(panelBuscarVehiculo);
        this.panelCentral.remove(panelUpdateVehiculo);
        this.panelCentral.remove(panelWatchAll);
        this.panelCentral.remove(panelCilindraje);
        this.panelCentral.add(this.panelRegistrarSalida, BorderLayout.CENTER);
        dibujar();

    }
    
    public void lanzarViewAll() {
        
        this.panelCentral.remove(panelVehiculo);
        this.panelCentral.remove(panelBuscarVehiculo);
        this.panelCentral.remove(panelUpdateVehiculo);
        this.panelCentral.remove(panelRegistrarSalida);
        this.panelCentral.remove(panelCilindraje);
        this.panelCentral.add(this.panelWatchAll, BorderLayout.CENTER);
        dibujar();

    }
    
    public void lanzarBuscarCilindraje() {
        
        this.panelCentral.remove(panelVehiculo);
        this.panelCentral.remove(panelBuscarVehiculo);
        this.panelCentral.remove(panelUpdateVehiculo);
        this.panelCentral.remove(panelRegistrarSalida);
        this.panelCentral.remove(panelWatchAll);
        this.panelCentral.add(this.panelCilindraje, BorderLayout.CENTER);
        dibujar();

    }
    public void dibujar() {
        this.panelCentral.revalidate();
        this.panelCentral.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
