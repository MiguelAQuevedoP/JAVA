/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Pueblo;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class PanelGestionarPueblo extends javax.swing.JPanel {
    ArrayList<Pueblo> listaPueblos = new ArrayList<Pueblo>();
    /**
     * Creates new form PanelGestionarPueblo
     */
    public PanelGestionarPueblo() {
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

        lblNombrePueblo = new javax.swing.JLabel();
        lblDescripcionPueblo = new javax.swing.JLabel();
        lblCodigoPueblo = new javax.swing.JLabel();
        txtNombrePueblo = new javax.swing.JTextField();
        txtDescripcionPueblo = new javax.swing.JTextField();
        txtCodigoPueblo = new javax.swing.JTextField();
        btnRegistrarPueblo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarPueblos = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 0));

        lblNombrePueblo.setText("Nombre");

        lblDescripcionPueblo.setText("Descripcion");

        lblCodigoPueblo.setText("Codigo");

        btnRegistrarPueblo.setText("Gestionar");
        btnRegistrarPueblo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPueblos(evt);
            }
        });

        jTableListarPueblos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarPueblos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblNombrePueblo)
                                    .addGap(17, 17, 17))
                                .addComponent(lblDescripcionPueblo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoPueblo)
                                .addGap(21, 21, 21)))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescripcionPueblo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrarPueblo))
                            .addComponent(txtNombrePueblo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoPueblo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombrePueblo)
                    .addComponent(txtNombrePueblo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcionPueblo)
                    .addComponent(txtDescripcionPueblo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPueblo))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoPueblo)
                    .addComponent(txtCodigoPueblo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrarPueblos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPueblos
        String nombreP,descripcionP;
        int codigoP;
       
        nombreP = this.txtNombrePueblo.getText();
        descripcionP = this.txtDescripcionPueblo.getText(); 
        codigoP = Integer.parseInt(txtCodigoPueblo.getText());
        Pueblo pueblo = new Pueblo(nombreP,descripcionP,codigoP);
        
        listaPueblos.add(pueblo);
        listarPueblos();
        txtNombrePueblo.setText("");
        txtDescripcionPueblo.setText("");
        txtCodigoPueblo.setText("");
    }//GEN-LAST:event_registrarPueblos
    public void listarPueblos(){
        Object matriz[][] = new Object[this.listaPueblos.size()][3];
        for(int i =0 ;i<listaPueblos.size() ; i++ ){
            matriz[i][0] = listaPueblos.get(i).getNombrePueblo();
            matriz[i][1] = listaPueblos.get(i).getDescripcionPueblo();
            matriz[i][2] = listaPueblos.get(i).getCodigoPueblo();
        }        
        jTableListarPueblos.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
            new String [] {
                "Nombre", "Descripcion","Codigo" 
            }
        ));
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarPueblo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarPueblos;
    private javax.swing.JLabel lblCodigoPueblo;
    private javax.swing.JLabel lblDescripcionPueblo;
    private javax.swing.JLabel lblNombrePueblo;
    private javax.swing.JTextField txtCodigoPueblo;
    private javax.swing.JTextField txtDescripcionPueblo;
    private javax.swing.JTextField txtNombrePueblo;
    // End of variables declaration//GEN-END:variables
}
