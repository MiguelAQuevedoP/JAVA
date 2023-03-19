/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import access.clsCourseAccess;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.clsInfoCourse;

/**
 *
 * @author migue
 */
public class JPanelViewDictate extends javax.swing.JPanel {

    private clsInfoCourse auxInfoCourse;
    private clsCourseAccess auxInfoCourseAccess;
    private List<clsInfoCourse> lstCourses;
    public JPanelViewDictate() {
        auxInfoCourse = new clsInfoCourse();
        auxInfoCourseAccess = new clsCourseAccess();
        lstCourses = new ArrayList<>();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCode = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        btnSearchCode = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCourses = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(700, 320));

        txtCode.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblCode.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblCode.setForeground(new java.awt.Color(255, 51, 51));
        lblCode.setText("CODIGO DE DOCENTE*");

        btnSearchCode.setBackground(new java.awt.Color(132, 244, 217));
        btnSearchCode.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnSearchCode.setText("BUSCAR CODIGO");
        btnSearchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCodeActionPerformed(evt);
            }
        });

        tCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "CUPOS"
            }
        ));
        jScrollPane1.setViewportView(tCourses);
        if (tCourses.getColumnModel().getColumnCount() > 0) {
            tCourses.getColumnModel().getColumn(0).setHeaderValue("CODIGO");
            tCourses.getColumnModel().getColumn(1).setHeaderValue("NOMBRE");
            tCourses.getColumnModel().getColumn(2).setHeaderValue("CUPOS");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCode)
                        .addGap(37, 37, 37)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnSearchCode)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCode)
                    .addComponent(btnSearchCode))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCodeActionPerformed
        tableCourses();
    }//GEN-LAST:event_btnSearchCodeActionPerformed

    public void tableCourses(){
        this.lstCourses = this.auxInfoCourseAccess.watchCourses();
        Long code = Long.parseLong(this.txtCode.getText());
        int counter =0;
        Object matriz[][] = new Object[lstCourses.size()][3];
        
        for(int i=0;i<this.lstCourses.size();i++){
            if(Objects.equals(code, this.lstCourses.get(i).getCodeTeacher())){
                matriz[counter][0] = this.lstCourses.get(i).getCode();
                matriz[counter][1] = this.lstCourses.get(i).getName();
                matriz[counter][2] = this.lstCourses.get(i).getAvailabity();
                tCourses.setModel(new javax.swing.table.DefaultTableModel(matriz,
                        new String[]{"CODIGO", "NOMBRE", "CUPOS"}));
                counter++;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSearchCode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JTable tCourses;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}
