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
public class JPanelBuscarAuto extends JPanel implements iGestion {

    private JTable tAuto;
    private JScrollPane spAuto;
    private JTextField txtPlacaCilindraje;
    private clsParqueadero auxParqueadero;

    /**
     * Creates new form JPanelBuscarAuto
     */
    public JPanelBuscarAuto(clsParqueadero objParqueadero) {
        this.auxParqueadero = objParqueadero;
        this.iniciarComponentes();
    }

    public void iniciarComponentes() {
        setLayout(new BorderLayout(0, 0));

        //SCROLLPANE CLIENTE
        spAuto = new JScrollPane();
        tAuto = new JTable();
        tAuto.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{
                    "PLACA", "COLOR", "CILINDRAJE", "NUMERO DE PUERTAS"}));
        spAuto.setViewportView(tAuto);

        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(204, 204, 255));
        add(panelSuperior, BorderLayout.NORTH);

        JLabel lblInformeDeDatos = new JLabel("BUSCAR AUTOMOVIL");
        panelSuperior.add(lblInformeDeDatos);

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);

        JLabel lblPlacaCilindraje = new JLabel("DIGITE PLACA O CILINDRAJE:");

        txtPlacaCilindraje = new JTextField();
        txtPlacaCilindraje.setColumns(10);

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
                                                .addComponent(lblPlacaCilindraje, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(txtPlacaCilindraje, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                                .addGap(57)
                                                .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(spAuto, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        gl_panelCentral.setVerticalGroup(
                gl_panelCentral.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelCentral.createSequentialGroup()
                                .addGap(37)
                                .addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblPlacaCilindraje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlacaCilindraje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar))
                                .addGap(18)
                                .addComponent(spAuto, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                .addGap(18))
        );

        panelCentral.setLayout(gl_panelCentral);

    }

    public void imprimir() {
        String placaCilindraje = this.txtPlacaCilindraje.getText();
        int posAuto = this.buscarAuto(placaCilindraje);
        if (posAuto > -1) {
            this.cargarTablaAuto(posAuto);
            
        }
    }

    public void limpiarCampos() {
        this.txtPlacaCilindraje.setText("");
    }

    public int buscarAuto(String placaCilindraje) {
        int pos = -1;
        for (int i = 0; i < this.auxParqueadero.getLstAutos().size(); i++) {
            if (placaCilindraje.equalsIgnoreCase(this.auxParqueadero.getLstAutos().get(i).getPlaca())
                    || placaCilindraje.equalsIgnoreCase(this.auxParqueadero.getLstAutos().get(i).getCilindraje())) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void cargarTablaAuto(int posAuto) {

        Object matriz[][] = new Object[1][4];
        
        matriz[0][0] = auxParqueadero.getLstAutos().get(posAuto).getPlaca();
        matriz[0][1] = auxParqueadero.getLstAutos().get(posAuto).getColor();
        matriz[0][2] = auxParqueadero.getLstAutos().get(posAuto).getCilindraje();
        matriz[0][3] = auxParqueadero.getLstAutos().get(posAuto).getNumPuertas();

        tAuto.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"PLACA", "COLOR", "CILINDRAJE", "NUMERO DE PUERTAS"}));
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
