/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import access.clsStudentAccess;
import access.clsTeacherAccess;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.clsDocente;
import model.clsStudent;

/**
 *
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 * 
 */

public class JFramePrincipal extends javax.swing.JFrame {

    private JPanelAddStudent panelAddStudent;
    private JPanelDepartments panelDepartments;
    private JPanelAddTeacher panelAddTeacher;
    private JPanelViewDictate panelViewDictate;
    private JPanelUpdateStudent panelUpdateStudent;
    private JPanelUpdateTeacher panelUpdateTeacher;
    private JPanelDltStudent panelDltStudent;
    private JPanelAddInfoCourse panelAddInfoCourse;
    private JPanelAddCourseStudent panelAddCourseStudent;
    private JPanelViewAvailabity panelViewAvailabity;
    private JPanelAttendance panelAttendance;
    private JPanelScore panelScore;
    private JPanelLogin panelLogin;
    
    
    
    private clsStudentAccess auxStudentAccess;
    private clsStudent auxStudent;
    private clsTeacherAccess auxTeacherAccess;
    private clsDocente auxDocente;
    
    
    
    public JFramePrincipal() {
        this.panelAddStudent = new JPanelAddStudent();
        this.panelDepartments = new JPanelDepartments();
        this.panelAddTeacher = new JPanelAddTeacher();
        this.panelViewDictate = new JPanelViewDictate();
        this.panelUpdateStudent = new JPanelUpdateStudent();
        this.panelUpdateTeacher = new JPanelUpdateTeacher();
        this.panelDltStudent = new JPanelDltStudent();
        this.panelAddInfoCourse = new JPanelAddInfoCourse();
        this.panelAddCourseStudent = new JPanelAddCourseStudent();
        this.panelViewAvailabity = new JPanelViewAvailabity();
        this.panelAttendance = new JPanelAttendance();
        this.panelScore = new JPanelScore();
        this.panelLogin = new JPanelLogin();
        
        
        this.auxStudent = new clsStudent();
        this.auxStudentAccess = new clsStudentAccess();
        this.auxDocente = new clsDocente();
        this.auxTeacherAccess = new clsTeacherAccess();
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

        panelLeft = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnDepartments = new javax.swing.JToggleButton();
        btnAddTeacher = new javax.swing.JToggleButton();
        btnViewDictate = new javax.swing.JToggleButton();
        btnUpdateStudent = new javax.swing.JToggleButton();
        btnUpdateTeacher = new javax.swing.JToggleButton();
        btnDltStudent = new javax.swing.JToggleButton();
        btnAddCourse = new javax.swing.JToggleButton();
        btnCourseStudent = new javax.swing.JToggleButton();
        btnViewAvailabity = new javax.swing.JToggleButton();
        btnAttendance = new javax.swing.JToggleButton();
        btnScore = new javax.swing.JToggleButton();
        btnAcceder = new javax.swing.JToggleButton();
        panelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRINCIPAL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 500));

        panelLeft.setPreferredSize(new java.awt.Dimension(200, 150));

        jToggleButton1.setBackground(new java.awt.Color(132, 244, 217));
        jToggleButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jToggleButton1.setText("AGREGAR ESTUDIANTE");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        btnDepartments.setBackground(new java.awt.Color(132, 244, 217));
        btnDepartments.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnDepartments.setText("VER DEPARTAMENTOS");
        btnDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartmentsActionPerformed(evt);
            }
        });

        btnAddTeacher.setBackground(new java.awt.Color(132, 244, 217));
        btnAddTeacher.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnAddTeacher.setText("AGREGAR DOCENTE");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        btnViewDictate.setBackground(new java.awt.Color(132, 244, 217));
        btnViewDictate.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnViewDictate.setText("MATERIAS A DICTAR");
        btnViewDictate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDictateActionPerformed(evt);
            }
        });

        btnUpdateStudent.setBackground(new java.awt.Color(132, 244, 217));
        btnUpdateStudent.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnUpdateStudent.setText("ACTUALIZAR ESTUDIANTE");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        btnUpdateTeacher.setBackground(new java.awt.Color(132, 244, 217));
        btnUpdateTeacher.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnUpdateTeacher.setText("ACTUALIZAR DOCENTE");
        btnUpdateTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTeacherActionPerformed(evt);
            }
        });

        btnDltStudent.setBackground(new java.awt.Color(132, 244, 217));
        btnDltStudent.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnDltStudent.setText("INHABILITAR ESTUDIANTE");
        btnDltStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltStudentActionPerformed(evt);
            }
        });

        btnAddCourse.setBackground(new java.awt.Color(132, 244, 217));
        btnAddCourse.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnAddCourse.setText("AGREGAR ASIGNATURA");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnCourseStudent.setBackground(new java.awt.Color(132, 244, 217));
        btnCourseStudent.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnCourseStudent.setText("MATRICULAR ASIGNATURA");
        btnCourseStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseStudentActionPerformed(evt);
            }
        });

        btnViewAvailabity.setBackground(new java.awt.Color(132, 244, 217));
        btnViewAvailabity.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnViewAvailabity.setText("INFORMACION ASIGNATURAS");
        btnViewAvailabity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAvailabityActionPerformed(evt);
            }
        });

        btnAttendance.setBackground(new java.awt.Color(132, 244, 217));
        btnAttendance.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnAttendance.setText("ASIGNAR FALTAS");
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });

        btnScore.setBackground(new java.awt.Color(132, 244, 217));
        btnScore.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnScore.setText("CALIFICAR ESTUDIANTE");
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        btnAcceder.setBackground(new java.awt.Color(132, 244, 217));
        btnAcceder.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnAcceder.setText("ACCEDER");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepartments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewDictate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDltStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCourseStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAvailabity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAttendance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAcceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddTeacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewDictate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDepartments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateTeacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDltStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCourseStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewAvailabity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttendance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAcceder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCentral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/b4ad26cf6cc8ad39b0923cf65e1ea540-vector-de-fondo-abstracto-rect-aacute-ngulo-by-vexels.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Screenshot 2023-01-25 184516.png"))); // NOI18N

        lblEmail.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 153, 255));
        lblEmail.setText("EMAIL");

        lblPassword.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 153, 255));
        lblPassword.setText("CONTRASEÑA");

        txtEmail.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnLogin.setText("ENTRAR");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblPassword))
                                .addGap(23, 23, 23)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        addStudent();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartmentsActionPerformed
        viewDepartments();
    }//GEN-LAST:event_btnDepartmentsActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        addTeacher();
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnViewDictateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDictateActionPerformed
        viewDictate();
    }//GEN-LAST:event_btnViewDictateActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        updateStudent();
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    private void btnUpdateTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTeacherActionPerformed
        updateTeacher();
    }//GEN-LAST:event_btnUpdateTeacherActionPerformed

    private void btnDltStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltStudentActionPerformed
        dltStudent();
    }//GEN-LAST:event_btnDltStudentActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        addInfoCourse();
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnCourseStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseStudentActionPerformed
        addCourseStudent();
    }//GEN-LAST:event_btnCourseStudentActionPerformed

    private void btnViewAvailabityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAvailabityActionPerformed
        viewAvailabity();
    }//GEN-LAST:event_btnViewAvailabityActionPerformed

    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
        attendance();
    }//GEN-LAST:event_btnAttendanceActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        score();
    }//GEN-LAST:event_btnScoreActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        
    }//GEN-LAST:event_btnAccederActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAcceder;
    private javax.swing.JToggleButton btnAddCourse;
    private javax.swing.JToggleButton btnAddTeacher;
    private javax.swing.JToggleButton btnAttendance;
    private javax.swing.JToggleButton btnCourseStudent;
    private javax.swing.JToggleButton btnDepartments;
    private javax.swing.JToggleButton btnDltStudent;
    private javax.swing.JButton btnLogin;
    private javax.swing.JToggleButton btnScore;
    private javax.swing.JToggleButton btnUpdateStudent;
    private javax.swing.JToggleButton btnUpdateTeacher;
    private javax.swing.JToggleButton btnViewAvailabity;
    private javax.swing.JToggleButton btnViewDictate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    public void addStudent(){
        panelAddStudent.setSize(700, 300);
        panelAddStudent.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelAddStudent, BorderLayout.CENTER);
        dibujar();
    }
    public void addTeacher(){
        panelAddTeacher.setSize(700, 300);
        panelAddTeacher.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelAddTeacher, BorderLayout.CENTER);
        dibujar();
    }
    public void viewDictate(){
        panelViewDictate.setSize(700, 300);
        panelViewDictate.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelViewDictate, BorderLayout.CENTER);
        dibujar();
    }
    public void viewDepartments(){
        panelDepartments.setSize(700, 300);
        panelDepartments.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelDepartments, BorderLayout.CENTER);
        dibujar();
    }
    public void updateStudent(){
        panelUpdateStudent.setSize(700, 500);
        panelUpdateStudent.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelUpdateStudent, BorderLayout.CENTER);
        dibujar();
    }
    public void updateTeacher(){
        panelUpdateTeacher.setSize(700, 500);
        panelUpdateTeacher.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelUpdateTeacher, BorderLayout.CENTER);
        dibujar();
    }
    public void dltStudent(){
        panelDltStudent.setSize(700, 500);
        panelDltStudent.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelDltStudent, BorderLayout.CENTER);
        dibujar();
    }
    
    public void addInfoCourse(){
        panelAddInfoCourse.setSize(700, 500);
        panelAddInfoCourse.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelAddInfoCourse, BorderLayout.CENTER);
        dibujar();
    }
    
    public void addCourseStudent(){
        panelAddCourseStudent.setSize(700, 500);
        panelAddCourseStudent.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelAddCourseStudent, BorderLayout.CENTER);
        dibujar();
    }
    
    public void viewAvailabity(){
        panelViewAvailabity.setSize(700, 500);
        panelViewAvailabity.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelViewAvailabity, BorderLayout.CENTER);
        dibujar();
    }
    
    public void attendance(){
        panelAttendance.setSize(700, 500);
        panelAttendance.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelAttendance, BorderLayout.CENTER);
        dibujar();
    }
    
    public void score(){
        panelScore.setSize(700, 500);
        panelScore.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelScore, BorderLayout.CENTER);
        dibujar();
    }
    
    public void login(){
        panelLogin.setSize(700, 500);
        panelLogin.setLocation(0, 0);
        this.panelCentral.removeAll();
        this.panelCentral.add(panelLogin, BorderLayout.CENTER);
        dibujar();
    }
    
    public void dibujar(){
		this.panelCentral.revalidate();
		this.panelCentral.repaint();
	}
}