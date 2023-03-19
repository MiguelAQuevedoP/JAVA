/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import access.clsCourseAccess;
import access.clsStudentAccess;
import javax.swing.JOptionPane;
import model.clsCourseStudent;
import model.clsInfoCourse;
import model.clsStudent;

/**
 *
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 * 
 */

public class JPanelAddCourseStudent extends javax.swing.JPanel {

    private clsStudentAccess auxStudentAccess;
    private clsStudent auxStudent;
    
    private clsCourseAccess auxInfoCourse;
    private clsInfoCourse auxClsInfoCourse;
    
    private clsCourseAccess auxCourseStAccess;
    private clsCourseStudent auxClsCourseStudent;
    
    public JPanelAddCourseStudent() {
        this.auxStudent = new clsStudent();
        this.auxStudentAccess = new clsStudentAccess();
        this.auxInfoCourse = new clsCourseAccess();
        this.auxClsInfoCourse = new clsInfoCourse();
        this.auxCourseStAccess = new clsCourseAccess();
        this.auxClsCourseStudent = new clsCourseStudent();
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

        lblCodeStudent = new javax.swing.JLabel();
        txtCodeStudent = new javax.swing.JTextField();
        btnAssign = new javax.swing.JToggleButton();
        lblName1 = new javax.swing.JLabel();
        lblCodeCourse = new javax.swing.JLabel();
        txtCodeCourse = new javax.swing.JTextField();

        lblCodeStudent.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblCodeStudent.setText("CODIGO ESTUDIANTE");

        btnAssign.setBackground(new java.awt.Color(132, 244, 217));
        btnAssign.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnAssign.setText("MATRICULAR");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName1.setText("MATRICULAR ASIGNATURA");

        lblCodeCourse.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblCodeCourse.setText("CODIGO ASIGNATURA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodeCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodeStudent)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodeCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssign)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblName1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodeCourse)
                    .addComponent(txtCodeCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodeStudent)
                    .addComponent(txtCodeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAssign)
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        verifyStudent();
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAssign;
    private javax.swing.JLabel lblCodeCourse;
    private javax.swing.JLabel lblCodeStudent;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTextField txtCodeCourse;
    private javax.swing.JTextField txtCodeStudent;
    // End of variables declaration//GEN-END:variables

    public void verifyStudent(){
        Long codStudent = Long.parseLong(txtCodeStudent.getText());
        auxStudent = auxStudentAccess.BuscarEstudiante(codStudent);
        if (!codStudent.equals("")) {
            if (auxStudent != null && auxStudent instanceof clsStudent) {
                verifyCourse();
            } else {
                JOptionPane.showMessageDialog(this, 
                "No se encontro ningun estudiante con el codigo:"+ codStudent,
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Hay campos vacios, por favor rellenelos",
                    "informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void verifyCourse(){
        String codCourse = this.txtCodeCourse.getText();
        auxClsInfoCourse = auxInfoCourse.searchCourse(codCourse);
        if (!codCourse.equals("")) {
            if (auxClsInfoCourse != null && auxClsInfoCourse instanceof clsInfoCourse) {
                addCourseStudent();
            } else {
                JOptionPane.showMessageDialog(this, 
                "No se encontro ningun curso con el codigo:"+ codCourse,
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Hay campos vacios, por favor rellenelos",
                    "informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void addCourseStudent(){
        try{
		clsCourseStudent objCourseStudent = new clsCourseStudent();
            
            String codCourse = this.txtCodeCourse.getText();
            Long codStudent = Long.parseLong(txtCodeStudent.getText());
            
            //RETORNA OBJETO DE clsInfoCourse
            //auxClsInfoCourse = auxInfoCourse.searchCourse(codCourse);
            auxClsInfoCourse.setAvailabity(auxClsInfoCourse.getAvailabity()-1);
            this.auxInfoCourse.upInfoCourse(auxClsInfoCourse, codCourse);
            
            //RETORNA OBJETO DE clsStudent
            auxStudent = auxStudentAccess.BuscarEstudiante(codStudent);
		objCourseStudent.setNameSt(auxStudent.getName());
            objCourseStudent.setCodeSt(codStudent);
            objCourseStudent.setEmailSt(auxStudent.getEmail());
            objCourseStudent.setCodeCourse(codCourse);
            objCourseStudent.setScore(0.0);
            objCourseStudent.setAtteandace(0);
            objCourseStudent.setStatus("NO PERDIDA");
            
		this.auxCourseStAccess.AddCourseStudent(objCourseStudent);
            
		JOptionPane.showMessageDialog(this, 
				"Asignatura agregada con exito con Exito",
				"Informacion",
				JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
		}
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(this,
					"Error, No hay espacio",
					"Validar datos",
					JOptionPane.ERROR_MESSAGE);
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this,
					"Error, dato mal digitado",
					"Validar datos",
					JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(this,
					"Error",
					"",
					JOptionPane.ERROR_MESSAGE);
		}
    }
    
    public void limpiarCampos() {
        this.txtCodeStudent.setText("");
        this.txtCodeCourse.setText("");
    }
}
