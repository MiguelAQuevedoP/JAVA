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
public class JPanelViewAvailabity extends javax.swing.JPanel {

    private clsInfoCourse auxInfoCourse;
    private clsCourseAccess auxInfoCourseAccess;
    private List<clsInfoCourse> lstCourses;
    public JPanelViewAvailabity() {
        auxInfoCourse = new clsInfoCourse();
        auxInfoCourseAccess = new clsCourseAccess();
        lstCourses = new ArrayList<>();
        initComponents();
        tableCourses();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tCourses = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 320));

        tCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO MATERIA", "CODIGO DOCENTE", "NOMBRE", "CUPOS"
            }
        ));
        jScrollPane1.setViewportView(tCourses);

        lblTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("INFORMACION MATERIAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void tableCourses(){
        this.lstCourses = this.auxInfoCourseAccess.watchCourses();
        Object matriz[][] = new Object[lstCourses.size()][4];
        
        for(int i=0;i<this.lstCourses.size();i++){
                matriz[i][0] = this.lstCourses.get(i).getCode();
                matriz[i][1] = this.lstCourses.get(i).getCodeTeacher();
                matriz[i][2] = this.lstCourses.get(i).getName();
                matriz[i][3] = this.lstCourses.get(i).getAvailabity();
                tCourses.setModel(new javax.swing.table.DefaultTableModel(matriz,
                        new String[]{"CODIGO MATERIA", "CODIGO DOCENTE", "NOMBRE", "CUPOS"}));
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tCourses;
    // End of variables declaration//GEN-END:variables
}
