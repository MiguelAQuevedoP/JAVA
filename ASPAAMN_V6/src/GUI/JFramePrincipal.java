/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import access.clsAdminAccess;
import access.clsStudentAccess;
import access.clsTeacherAccess;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.clsAdmin;
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
    
    
    
    private clsStudentAccess auxStudentAccess;
    private clsStudent auxStudent;
    private clsTeacherAccess auxTeacherAccess;
    private clsDocente auxDocente;
    private clsAdmin auxAdmin;
    private clsAdminAccess auxAdminAccess;
    
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
        
        
        this.auxStudent = new clsStudent();
        this.auxStudentAccess = new clsStudentAccess();
        this.auxDocente = new clsDocente();
        this.auxTeacherAccess = new clsTeacherAccess();
        this.auxAdmin = new clsAdmin();
        this.auxAdminAccess = new clsAdminAccess();
        initComponents();
        panelMenu.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btnAddSt = new javax.swing.JToggleButton();
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
        btnViewSt = new javax.swing.JToggleButton();
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

        panelMenu.setPreferredSize(new java.awt.Dimension(200, 150));

        btnAddSt.setBackground(new java.awt.Color(132, 244, 217));
        btnAddSt.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnAddSt.setText("AGREGAR ESTUDIANTE");
        btnAddSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStActionPerformed(evt);
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

        btnViewSt.setBackground(new java.awt.Color(132, 244, 217));
        btnViewSt.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnViewSt.setText("VER ESTUDIANTES");
        btnViewSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepartments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewDictate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddSt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDltStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCourseStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAvailabity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAttendance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewSt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnAddSt)
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
                .addComponent(btnViewSt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCentral.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCentral.setPreferredSize(new java.awt.Dimension(1100, 516));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b4ad26cf6cc8ad39b0923cf65e1ea540-vector-de-fondo-abstracto-rect-aacute-ngulo-by-vexels.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2023-01-25 184516.png"))); // NOI18N

        lblEmail.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(71, 134, 237));
        lblEmail.setText("EMAIL");

        lblPassword.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(71, 134, 237));
        lblPassword.setText("CONTRASEÑA");

        txtEmail.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        btnLogin.setBackground(new java.awt.Color(71, 134, 237));
        btnLogin.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("ACCEDER");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 232, Short.MAX_VALUE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin)
                            .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCentralLayout.createSequentialGroup()
                                    .addComponent(lblPassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelCentralLayout.createSequentialGroup()
                                    .addComponent(lblEmail)
                                    .addGap(97, 97, 97)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCentral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStActionPerformed
        addStudent();
    }//GEN-LAST:event_btnAddStActionPerformed

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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = this.txtEmail.getText();
        String password = this.txtPassword.getText();
        auxStudent = auxStudentAccess.login(email);
        auxDocente = auxTeacherAccess.login(email);
        auxAdmin = auxAdminAccess.login(email);
        
        if (!email.equals("")&&!password.equals("")) {
            if (auxStudent != null && auxStudent instanceof clsStudent) {
               clsStudent st = (clsStudent) auxStudent;
               if(email.equals(st.getEmail())&&password.equals(st.getPassword())){
                   //PANEL PARA ESTUDIANTES
               }
            } 
            else if(auxDocente != null && auxDocente instanceof clsDocente){
                clsDocente dc = (clsDocente) auxDocente;
                if(email.equals(dc.getEmail())&&password.equals(dc.getPassword())){
                    //PANEL PARA DOCENTE
                }
            }
            else if ((auxAdmin != null && auxAdmin instanceof clsAdmin) && (auxAdmin != null &&auxAdmin instanceof clsAdmin)){
                clsAdmin admin = (clsAdmin) auxAdmin;
                if(email.equals(admin.getEmail())&&password.equals(admin.getPassword())){
                    System.out.println("entro admin"+email+"\n"+password);
                    panelMenu.setVisible(true);
                }
            }
            else {
                JOptionPane.showMessageDialog(this,
                        "Usuario y/o contraseña equivocada",
                        "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Hay campos vacios, porfavor rellenelos",
                    "informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnViewStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStActionPerformed
        
    }//GEN-LAST:event_btnViewStActionPerformed

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
    private javax.swing.JToggleButton btnAddCourse;
    private javax.swing.JToggleButton btnAddSt;
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
    private javax.swing.JToggleButton btnViewSt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelMenu;
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
    
    public void dibujar(){
		this.panelCentral.revalidate();
		this.panelCentral.repaint();
	}
}
