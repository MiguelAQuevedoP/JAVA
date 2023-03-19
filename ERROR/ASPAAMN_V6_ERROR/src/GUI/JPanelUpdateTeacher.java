/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import access.clsTeacherAccess;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import model.clsDocente;

/**
 *
 * @author Miguel A Quevedo P
 * @email mquevedo@unicauca.edu.co
 */

public class JPanelUpdateTeacher extends javax.swing.JPanel {

    private clsTeacherAccess auxTeacherAccess;
    private clsDocente auxTeacher;
    
    public JPanelUpdateTeacher() {
        this.auxTeacher = new clsDocente();
        this.auxTeacherAccess = new clsTeacherAccess();
        initComponents();
        jPanel4.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNumDocument = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblNumDocument = new javax.swing.JLabel();
        lblDateBirth = new javax.swing.JLabel();
        dateBirth = new com.toedter.calendar.JDateChooser();
        lblCodeStudent = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 300));

        jLabel1.setBackground(new java.awt.Color(178, 244, 228));
        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR INFORMACION DOCENTE");

        lblName.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblName.setText("NOMBRE");

        txtName.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        txtNumDocument.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(132, 244, 217));
        btnUpdate.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnUpdate.setText("MODIFICAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblNumDocument.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblNumDocument.setText("NUM DOCUMENTO");

        lblDateBirth.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblDateBirth.setText("FECHA NACIMIENTO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdate)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName)
                                .addComponent(lblNumDocument))
                            .addGap(56, 56, 56)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblDateBirth))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(btnUpdate)
                .addContainerGap())
        );

        lblCodeStudent.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblCodeStudent.setForeground(new java.awt.Color(255, 51, 51));
        lblCodeStudent.setText("CODIGO*");

        txtCode.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(132, 244, 217));
        btnSearch.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnSearch.setText("BUSCAR");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCodeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodeStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //FORMATO PARA LA FECHA
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Long codTeacher = Long.parseLong(txtCode.getText());
            auxTeacher = auxTeacherAccess.SearchTeacher(codTeacher);
            String nombre = txtName.getText();
            Long numDocumento = Long.parseLong(txtNumDocument.getText());
            String fecha = formato.format(dateBirth.getCalendar().getTime());
            
            auxTeacher.setName(nombre);
            auxTeacher.setEmail(auxTeacher.getEmail());
            auxTeacher.setPassword(auxTeacher.getPassword());
            auxTeacher.setId(numDocumento);
            auxTeacher.setCode(auxTeacher.getCode());
            
            //auxTeacher.setDateBirth(auxTeacher.getDateBirth());
            auxTeacher.setDateBirth(fecha);
            
            this.auxTeacherAccess.updateTeacher(auxTeacher, codTeacher);
            
            cleanSpace();
            
            jPanel4.setVisible(false);
            
            JOptionPane.showMessageDialog(this, 
                "¡ACTUALIZADO CON EXITO!",
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERROR, por favor contacte al soporte",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Long codTeacher = Long.parseLong(txtCode.getText());
        auxTeacher = auxTeacherAccess.SearchTeacher(codTeacher);
        if (!codTeacher.equals("")) {
            if (auxTeacher != null && auxTeacher instanceof clsDocente) {
                clsDocente st = (clsDocente)auxTeacher;
                txtName.setText(st.getName());
                txtNumDocument.setText(String.valueOf(st.getId()));
                jPanel4.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, 
                "No se encontro ningun docente con el codigo:"+ codTeacher,
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Hay campos vacios, por favor rellenelos",
                    "informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    public void cleanSpace(){
        this.txtCode.setText("");
        this.txtName.setText("");
        this.txtNumDocument.setText("");
        this.dateBirth.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCodeStudent;
    private javax.swing.JLabel lblDateBirth;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumDocument;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumDocument;
    // End of variables declaration//GEN-END:variables
}
