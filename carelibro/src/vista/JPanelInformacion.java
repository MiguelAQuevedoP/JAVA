/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author migue
 */
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.*;

public class JPanelInformacion extends javax.swing.JPanel {

    private clsPersona auxPersona;
    
    public JPanelInformacion(clsPersona objPersona) {
        this.auxPersona = objPersona;
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

        jLblTitulo = new javax.swing.JLabel();
        jLblName = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImgEmpatico = new javax.swing.JLabel();

        jLblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblTitulo.setText("INFORMACIÓN");

        jLblName.setText("Juan José Dorado");

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Foto_Easy-Resize.com.jpg"))); // NOI18N

        jLabel1.setText("DESCRIBETE CON UNA PALABRA");

        lblImgEmpatico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgEmpatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/empatico_logo_03-2119397683_Easy-Resize.com.jpg"))); // NOI18N
        lblImgEmpatico.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLblName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblFoto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblImgEmpatico, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImgEmpatico)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblName;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImgEmpatico;
    // End of variables declaration//GEN-END:variables

}
