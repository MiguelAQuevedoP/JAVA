/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import acceso.clsVehiculoAccess;
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
import java.util.List;

/**
 *
 * @author migue
 */
public class JPanelBuscarVehiculo extends JPanel {

    private JTable tVehiculo;
    private JScrollPane spVehiculo;
    private JTextField txtPlaca;
    private clsParqueadero auxParqueadero;

    private clsVehiculo auxVehiculo;
    private clsVehiculoAccess auxVehiculoAccess;
    private List<clsVehiculo> lstVehiculos;

    //CONSTRUCTORES
    public JPanelBuscarVehiculo() {
        auxVehiculo = new clsVehiculo();
        auxVehiculoAccess = new clsVehiculoAccess();

        lstVehiculos = new ArrayList<>();
        this.iniciarComponentes();
    }

    public void iniciarComponentes() {
        setLayout(new BorderLayout(0, 0));

        //SCROLLPANE CLIENTE
        spVehiculo = new JScrollPane();
        tVehiculo = new JTable();
        tVehiculo.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{
                    "PLACA", "COLOR", "CILINDRAJE", "NUMERO DE PUERTAS", "TIPO DE CAJA"}));
        spVehiculo.setViewportView(tVehiculo);

        JPanel panelSuperior = new JPanel();
        add(panelSuperior, BorderLayout.NORTH);

        JLabel lblInformeDeDatos = new JLabel("BUSCAR VEHICULO");
        lblInformeDeDatos.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        panelSuperior.add(lblInformeDeDatos);

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);

        JLabel lblPlaca = new JLabel("DIGITE PLACA:");
        lblPlaca.setFont(new java.awt.Font("Comic Sans MS", 1, 14));

        txtPlaca = new JTextField();
        txtPlaca.setBackground(new java.awt.Color(255, 158, 158));
        txtPlaca.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPlaca.setColumns(10);

        JButton btnBuscar = new JButton("BUSCAR");
        btnBuscar.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnBuscar.setBackground(new Color(204, 204, 255));
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cargarTablaVehiculo();
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
                                                .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
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

    /*public void imprimir() {
        String placa = this.txtPlaca.getText();
        //int posVehiculo = this.buscarVehiculo(placa);
        //if (posVehiculo > -1) {
        //    this.cargarTablaVehiculo(posVehiculo);  
        //}
        if (!lstVehiculos.isEmpty()) {
            auxVehiculo = auxVehiculoAccess.searchVehiculo(placa);
        } else {
            JOptionPane.showMessageDialog(this,
                    "VEHICULO NO ENCONTRADO",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public int buscarVehiculo(String placa) {
        int pos = -1;
        for (int i = 0; i < this.auxParqueadero.getLstVehiculos().size(); i++) {
            if (placa.equalsIgnoreCase(this.auxParqueadero.getLstVehiculos().get(i).getPlaca())) {
                pos = i;
                break;
            }
        }
        return pos;
    }*/
    public void cargarTablaVehiculo() {

        Object matriz[][] = new Object[1][5];

        String placa = this.txtPlaca.getText();
        auxVehiculo = auxVehiculoAccess.searchVehiculo(placa);

        if (auxVehiculo != null) {
            matriz[0][0] = auxVehiculo.getPlaca();
            matriz[0][1] = auxVehiculo.getColor();
            matriz[0][2] = auxVehiculo.getCilindraje();
            matriz[0][3] = auxVehiculo.getCaja();
            matriz[0][4] = auxVehiculo.getPuertas();
            tVehiculo.setModel(new javax.swing.table.DefaultTableModel(matriz, 
                    new String[]{"PLACA", "COLOR", "CILINDRAJE", "TIPO DE CAJA", "NUMERO DE PUERTAS"}));
        } else {
            JOptionPane.showMessageDialog(this,
                    "VEHICULO NO ENCONTRADO",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
        }

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
            .addGap(0, 421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
