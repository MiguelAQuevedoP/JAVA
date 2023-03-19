/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.clsParqueadero;
import modelo.iGestion;

/**
 *
 * @author migue
 */
public class JPanelUpdateMoto extends JPanel implements iGestion {

    private JTable tColorMoto;
    private JScrollPane spColoMoto;
    private JTextField txtPlacaCilindraje;
    private JTextField txtColor;
    private clsParqueadero auxParqueadero;

    /**
     * Creates new form JPanelBuscarAuto
     */
    public JPanelUpdateMoto(clsParqueadero objParqueadero) {
        this.auxParqueadero = objParqueadero;
        this.iniciarComponentes();
    }

    public void iniciarComponentes() {
        setLayout(new BorderLayout(0, 0));

        //SCROLLPANE CLIENTE
        spColoMoto = new JScrollPane();
        tColorMoto = new JTable();
        tColorMoto.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{
                    "PLACA", "COLOR", "CILINDRAJE", "TIPO DE CAJA"}));
        spColoMoto.setViewportView(tColorMoto);

        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(204, 204, 255));
        add(panelSuperior, BorderLayout.NORTH);

        JLabel lblInformeDeDatos = new JLabel("INFORME DE DATOS");
        panelSuperior.add(lblInformeDeDatos);

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);

        JLabel lblPlacaCilindraje = new JLabel("DIGITE PLACA:");

        txtPlacaCilindraje = new JTextField();
        txtPlacaCilindraje.setColumns(10);

        JLabel lblColor = new JLabel("DIGITE COLOR A ACTUALIZAR:");

        txtColor = new JTextField();
        txtColor.setColumns(10);

        JButton btnBuscar = new JButton("BUSCAR");
        btnBuscar.setBackground(new Color(204, 204, 255));
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imprimir();
            }
        });

        JButton btnUpdate = new JButton("ACTUALIZAR");
        btnUpdate.setBackground(new Color(204, 204, 255));
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiarColor();
            }
        });
        GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
        gl_panelCentral.setHorizontalGroup(
                gl_panelCentral.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panelCentral.createSequentialGroup()
                                .addGap(42)
                                .addGroup(gl_panelCentral.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(gl_panelCentral.createSequentialGroup()
                                                .addComponent(lblPlacaCilindraje, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(txtPlacaCilindraje, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                                .addGap(57)
                                                .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                        )
                                        .addGap(20)
                                        .addGroup(gl_panelCentral.createSequentialGroup()
                                                .addComponent(lblColor, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(txtColor, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                                .addGap(57)
                                                .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                        )
                                        .addComponent(spColoMoto, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                                )
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        gl_panelCentral.setVerticalGroup(
                gl_panelCentral.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panelCentral.createSequentialGroup()
                                .addGap(37)
                                .addGroup(gl_panelCentral.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPlacaCilindraje)
                                        .addComponent(txtPlacaCilindraje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar)
                                )
                                .addGap(18)
                                .addComponent(spColoMoto, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(gl_panelCentral.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblColor, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtColor,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdate)))
        );

        panelCentral.setLayout(gl_panelCentral);

    }

    public void imprimir() {
        String placaCilindraje = this.txtPlacaCilindraje.getText();
        int posMoto = this.buscarMoto(placaCilindraje);
        if (posMoto > -1) {
            this.cargarTablaMoto(posMoto);

        }
    }

    public void cambiarColor(){
        String placaCilindraje = this.txtPlacaCilindraje.getText();
        String color = this.txtColor.getText();
        int moto = this.buscarMoto(placaCilindraje);
        this.auxParqueadero.getLstMotos().get(moto).setColor(color);
        JOptionPane.showMessageDialog(this, 
                "¡ACTUALIZADO CON EXITO!",
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void limpiarCampos() {
        this.txtPlacaCilindraje.setText("");
        this.txtColor.setText("");
    }

    public int buscarMoto(String placaCilindraje) {
        int pos = -1;
        for (int i = 0; i < this.auxParqueadero.getLstMotos().size(); i++) {
            if (placaCilindraje.equalsIgnoreCase(this.auxParqueadero.getLstMotos().get(i).getPlaca())) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void cargarTablaMoto(int posMoto) {

        Object matriz[][] = new Object[1][4];

        matriz[0][0] = auxParqueadero.getLstMotos().get(posMoto).getPlaca();
        matriz[0][1] = auxParqueadero.getLstMotos().get(posMoto).getColor();
        matriz[0][2] = auxParqueadero.getLstMotos().get(posMoto).getCilindraje();
        matriz[0][3] = auxParqueadero.getLstMotos().get(posMoto).getCaja();

        tColorMoto.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"PLACA", "COLOR", "CILINDRAJE", "TIPO DE CAJA"}));
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
