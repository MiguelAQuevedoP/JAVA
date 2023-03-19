/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.*;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

/**
 *
 * @author migue
 */
public class JPanelViewAll extends JPanel {

    private JTable tAuto;
    private JScrollPane spAuto;
    private JTable tMoto;
    private JScrollPane spMoto;
    private clsParqueadero auxParqueadero;

    /**
     * Creates new form JPanelBuscarAuto
     */
    public JPanelViewAll(clsParqueadero objParqueadero) {
        this.auxParqueadero = objParqueadero;
        this.iniciarComponentes();
    }

    public void iniciarComponentes() {
        setLayout(new BorderLayout(0, 0));

        //SCROLLPANE AUTO
        spAuto = new JScrollPane();
        tAuto = new JTable();
        tAuto.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{
                    "PLACA", "COLOR", "CILINDRAJE", "NUMERO DE PUERTAS"}));
        spAuto.setViewportView(tAuto);

        //ACROLLPANE MOTO
        spMoto = new JScrollPane();
        tMoto = new JTable();
        tMoto.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{
                    "PLACA", "COLOR", "CILINDRAJE", "TIPO DE CAJA"}));
        spMoto.setViewportView(tMoto);
        
        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(204, 204, 255));
        add(panelSuperior, BorderLayout.NORTH);

        JLabel lblInformeDeDatos = new JLabel("INFORME DE TODOS LOS VEHICULOS");
        panelSuperior.add(lblInformeDeDatos);

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);

        JButton btnBuscar = new JButton("MOSTRAR");
        btnBuscar.setBackground(new Color(204, 204, 255));
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imprimir();
            }
        });

        GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
        gl_panelCentral.setHorizontalGroup(
                gl_panelCentral.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelCentral.createSequentialGroup()
                                .addGap(42)
                                .addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING, false)
                                        .addGroup(gl_panelCentral.createSequentialGroup()
                                                .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(spAuto, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                                        .addComponent(spMoto)
                                )
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        gl_panelCentral.setVerticalGroup(
                gl_panelCentral.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelCentral.createSequentialGroup()
                                .addGap(37)
                                .addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnBuscar))
                                .addGap(18)
                                .addComponent(spAuto, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(spMoto, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        )
        );

        panelCentral.setLayout(gl_panelCentral);

    }

    public void imprimir() {
            this.cargarTablaAuto();
            this.cargarTablaMoto();
    }

    public void cargarTablaAuto() {

        Object matriz[][] = new Object[auxParqueadero.getLstAutos().size()][4];
        for (int i = 0; i < auxParqueadero.getLstAutos().size(); i++) {
            matriz[i][0] = auxParqueadero.getLstAutos().get(i).getPlaca();
            matriz[i][1] = auxParqueadero.getLstAutos().get(i).getColor();
            matriz[i][2] = auxParqueadero.getLstAutos().get(i).getCilindraje();
            matriz[i][3] = auxParqueadero.getLstAutos().get(i).getNumPuertas();
        }

        tAuto.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{"PLACA", "COLOR", "CILINDRAJE", "NUMERO DE PUERTAS"}));
    }

    public void cargarTablaMoto() {

        Object matriz[][] = new Object[auxParqueadero.getLstMotos().size()][4];
        for (int i = 0; i < auxParqueadero.getLstMotos().size(); i++) {
            matriz[i][0] = auxParqueadero.getLstMotos().get(i).getPlaca();
            matriz[i][1] = auxParqueadero.getLstMotos().get(i).getColor();
            matriz[i][2] = auxParqueadero.getLstMotos().get(i).getCilindraje();
            matriz[i][3] = auxParqueadero.getLstMotos().get(i).getCaja();
        }

        tMoto.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{"PLACA", "COLOR", "CILINDRAJE", "TIPO DE CAJA"}));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
