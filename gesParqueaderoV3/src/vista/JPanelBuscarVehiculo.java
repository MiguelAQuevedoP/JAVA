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

/**
 *
 * @author migue
 */
public class JPanelBuscarVehiculo extends JPanel {

    private JTable tVehiculo;
    private JScrollPane spVehiculo;
    private JTextField txtPlaca;
    private clsParqueadero auxParqueadero;

    /**
     * Creates new form JPanelBuscarAuto
     */
    public JPanelBuscarVehiculo(clsParqueadero objParqueadero) {
        this.auxParqueadero = objParqueadero;
        this.iniciarComponentes();
    }

    public void iniciarComponentes() {
        setLayout(new BorderLayout(0, 0));

        //SCROLLPANE CLIENTE
        spVehiculo = new JScrollPane();
        tVehiculo = new JTable();
        tVehiculo.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{
                    "PLACA", "COLOR", "CILINDRAJE", "NUMERO DE PUERTAS","TIPO DE CAJA"}));
        spVehiculo.setViewportView(tVehiculo);

        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(204, 204, 255));
        add(panelSuperior, BorderLayout.NORTH);

        JLabel lblInformeDeDatos = new JLabel("BUSCAR VEHICULO");
        panelSuperior.add(lblInformeDeDatos);

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);

        JLabel lblPlaca = new JLabel("DIGITE PLACA:");

        txtPlaca = new JTextField();
        txtPlaca.setColumns(10);

        JButton btnBuscar = new JButton("BUSCAR");
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
                                                .addComponent(lblPlaca, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                                .addGap(57)
                                                .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(spVehiculo, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        gl_panelCentral.setVerticalGroup(
                gl_panelCentral.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelCentral.createSequentialGroup()
                                .addGap(37)
                                .addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar))
                                .addGap(18)
                                .addComponent(spVehiculo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                .addGap(18))
        );

        panelCentral.setLayout(gl_panelCentral);

    }

    public void imprimir() {
        String placa = this.txtPlaca.getText();
        int posVehiculo = this.buscarVehiculo(placa);
        if (posVehiculo > -1) {
            this.cargarTablaVehiculo(posVehiculo);  
        }
        else{
            JOptionPane.showMessageDialog(this, 
            "VEHICULO NO ENCONTRADO",
            "Información",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public int buscarVehiculo(String placa) {
        int pos = -1;
        for (int i = 0; i < this.auxParqueadero.getLstVehiculos().size(); i++) {
            if (placa.equalsIgnoreCase(this.auxParqueadero.getLstVehiculos().get(i).getPlaca())){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void cargarTablaVehiculo(int posVehiculo) {

        Object matriz[][] = new Object[1][5];
        
        matriz[0][0] = auxParqueadero.getLstVehiculos().get(posVehiculo).getPlaca();
        matriz[0][1] = auxParqueadero.getLstVehiculos().get(posVehiculo).getColor();
        matriz[0][2] = auxParqueadero.getLstVehiculos().get(posVehiculo).getCilindraje();
        matriz[0][3] = auxParqueadero.getLstVehiculos().get(posVehiculo).getNumPuertas();
        matriz[0][4] = auxParqueadero.getLstVehiculos().get(posVehiculo).getCaja();
        

        tVehiculo.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"PLACA", "COLOR", "CILINDRAJE", "NUMERO DE PUERTAS", "TIPO DE CAJA"}));
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
