/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import access.clsStudentAccess;
import access.clsTeacherAccess;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.clsAdmin;
import model.clsDocente;
import model.clsStudent;

/**
 *
 * @author Legion 5
 */
public class JPanelLogin extends javax.swing.JPanel {

    private clsStudentAccess auxStudentAccess;
    private clsStudent auxStudent;
    private clsTeacherAccess auxTeacherAccess;
    private clsDocente auxDocente;
    private clsAdmin auxAdmin;
    private JfLogin frameLogin;
    private JPanelBtnAdmin pAdmin;
    
    public JPanelLogin() {
        this.auxStudent = new clsStudent();
        this.auxStudentAccess = new clsStudentAccess();
        this.frameLogin = new JfLogin();
        this.pAdmin = new JPanelBtnAdmin();
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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Contra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 255, 204));
        setPreferredSize(new java.awt.Dimension(900, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/b4ad26cf6cc8ad39b0923cf65e1ea540-vector-de-fondo-abstracto-rect-aacute-ngulo-by-vexels.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Screenshot 2023-01-25 184516.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("CONTRASEÑA:");

        Contra.setBackground(new java.awt.Color(255, 255, 255));
        Contra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Contra.setForeground(new java.awt.Color(0, 0, 0));
        Contra.setCaretColor(new java.awt.Color(0, 0, 0));
        Contra.setDisabledTextColor(new java.awt.Color(255, 102, 102));
        Contra.setSelectedTextColor(new java.awt.Color(255, 153, 102));
        Contra.setSelectionColor(new java.awt.Color(255, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("USUARIO:");

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        User.setForeground(new java.awt.Color(0, 0, 0));
        User.setCaretColor(new java.awt.Color(0, 0, 0));
        User.setDisabledTextColor(new java.awt.Color(255, 102, 102));
        User.setSelectedTextColor(new java.awt.Color(255, 153, 102));
        User.setSelectionColor(new java.awt.Color(255, 102, 102));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 153, 153));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(btnLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String email = User.getText();
        auxStudent = auxStudentAccess.login(email);
        String password = Contra.getText();
        auxDocente = auxTeacherAccess.login(email);
        
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
                    this.frameLogin.pAdmin();
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
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contra;
    private javax.swing.JTextField User;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}