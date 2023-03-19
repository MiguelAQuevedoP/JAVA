/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author migue
 */
public class JPanelRegistrarSalida extends javax.swing.JPanel {

    private clsParqueadero auxParqueadero;
    
    public JPanelRegistrarSalida(clsParqueadero objParqueadero) {
        this.auxParqueadero = objParqueadero;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnRegistrarSalida = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DIGITE LOS DATOS DEL VEHICULO A SALIR");

        lblPlaca.setText("PLACA DEL VEHICULO:");

        btnRegistrarSalida.setBackground(new java.awt.Color(204, 204, 255));
        btnRegistrarSalida.setText("REGISTRAR SALIDA");
        btnRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblPlaca)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPlaca))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnRegistrarSalida)
                .addGap(0, 139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed
        removeVehiculo();
        limpiarCampos();
    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    public int buscarVehiculo(String placa) {
        int pos = -1;
        for (int i = 0; i < this.auxParqueadero.getLstVehiculos().size(); i++) {
            if (placa.equalsIgnoreCase(this.auxParqueadero.getLstVehiculos().get(i).getPlaca())) {
                pos = i;
                break;
            }
        }
        
        return pos;
    }
    public void removeVehiculo(){
        int pos = buscarVehiculo(this.txtPlaca.getText());
        if(pos > -1){
            this.auxParqueadero.getLstVehiculos().remove(pos);
            JOptionPane.showMessageDialog(this, 
                "VEHICULO REMOVIDO",
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, 
                "VEHICULO NO ENCONTRADO",
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void limpiarCampos(){
        this.txtPlaca.setText("");
    }
}