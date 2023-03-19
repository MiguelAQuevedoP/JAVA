/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import modelo.*;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
/**
 *
 * @author migue
 */
public class JPanelMotocicleta extends JPanel implements iGestion {

    private JTextField txtPlacaMoto;
    private JTextField txtColorMoto;
    private JTextField txtCilindrajeMoto;
    private JComboBox cmbTipoCaja;
    private clsParqueadero auxParqueadero;

    /**
     * Create the panel.
     */
    public JPanelMotocicleta(clsParqueadero objParqueadero) {
        this.auxParqueadero = objParqueadero;

        this.iniciarComponentes();
    }

    public void iniciarComponentes() {
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 696, 24);
        panel.setBackground(new Color(204, 204, 255));
        add(panel);

        JLabel lblMotocicleta = new JLabel("AGREGAR MOTOCICLETA");
        panel.add(lblMotocicleta);

        JLabel lblPlacaMoto = new JLabel("PLACA:");
        lblPlacaMoto.setBounds(53, 53, 67, 14);
        add(lblPlacaMoto);

        JLabel lblColorMoto = new JLabel("COLOR:");
        lblColorMoto.setBounds(53, 78, 67, 14);
        add(lblColorMoto);

        JLabel lblTipoCaja = new JLabel("CILINDRAJE:");
        lblTipoCaja.setBounds(53, 103, 100, 14);
        add(lblTipoCaja);

        JLabel lblCilindrajeMoto = new JLabel("TIPO DE CAJA:");
        lblCilindrajeMoto.setBounds(53, 128, 100, 14);
        add(lblCilindrajeMoto);

        txtPlacaMoto = new JTextField();
        txtPlacaMoto.setBounds(202, 50, 138, 20);
        add(txtPlacaMoto);
        txtPlacaMoto.setColumns(10);

        txtColorMoto = new JTextField();
        txtColorMoto.setBounds(202, 75, 138, 20);
        add(txtColorMoto);
        txtColorMoto.setColumns(10);

        txtCilindrajeMoto = new JTextField();
        txtCilindrajeMoto.setBounds(202, 100, 138, 20);
        add(txtCilindrajeMoto);
        txtCilindrajeMoto.setColumns(10);

        JButton btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setBackground(new Color(204, 204, 255));
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                registrarMoto();
            }
        });
        btnRegistrar.setBounds(214, 175, 112, 23);
        add(btnRegistrar);

        cmbTipoCaja = new JComboBox();
        cmbTipoCaja.setModel(new DefaultComboBoxModel(eTipoCaja.values()));
        cmbTipoCaja.setBounds(202, 125, 138, 20);
        add(cmbTipoCaja);

    }

    public void registrarMoto() {
        try {
            clsMotocicleta objMoto = new clsMotocicleta();
            objMoto.setPlaca(this.txtPlacaMoto.getText());
            objMoto.setColor(this.txtColorMoto.getText());
            objMoto.setCilindraje(this.txtCilindrajeMoto.getText());
            objMoto.setCaja((eTipoCaja) this.cmbTipoCaja.getSelectedItem());
            
            this.auxParqueadero.agregarMoto(objMoto);
            JOptionPane.showMessageDialog(this,
                    "Motocicleta registrada con exito",
                    "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this,
                    "Error, No hay espacio",
                    "Validar datos",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Error, dato mal digitado",
                    "Validar datos",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        }
        limpiarCampos();
    }

    public void limpiarCampos() {
        this.txtPlacaMoto.setText("");
        this.txtColorMoto.setText("");
        this.cmbTipoCaja.setSelectedIndex(0);
        this.txtCilindrajeMoto.setText("");
    }

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
