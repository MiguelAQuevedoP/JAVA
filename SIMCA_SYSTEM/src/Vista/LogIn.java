package Vista;

import Modelo.clsAdmin;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
    
    clsAdmin admin;
    int LogIn;
    int LogOut=1;
    String usuario;
    String contraseña;

    public LogIn() { 
        initComponents();
        admin=new clsAdmin();
    }
    
    public LogIn(int LogIn, int LogOut) { 
        initComponents();
        this.LogIn = LogIn;
        this.LogOut = LogOut;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        bntCerrarSesion = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jButtonLogIn = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonNotas = new javax.swing.JButton();
        jButtonPensum = new javax.swing.JButton();
        jButtonVer1 = new javax.swing.JButton();
        btnMatricular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonVer2 = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel4.setPreferredSize(new java.awt.Dimension(735, 715));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 51, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel8.setFont(new java.awt.Font("Playbill", 0, 80)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INICIO DE SESION");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 300, 170, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USER:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 291, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 341, -1, -1));

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 153, 0));
        btnAceptar.setText("INICIAR SESIÓN");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 431, -1, -1));

        bntCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntCerrarSesion.setForeground(new java.awt.Color(255, 153, 0));
        bntCerrarSesion.setText("CERRAR SESIÓN");
        bntCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCerrarSesionActionPerformed(evt);
            }
        });
        jPanel3.add(bntCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 431, -1, -1));
        jPanel3.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 350, 170, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 9, -1, 726));

        jButtonLogIn.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonLogIn.setForeground(new java.awt.Color(255, 153, 0));
        jButtonLogIn.setText("INICIO DE SESIÓN");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 252, 259, -1));

        btnAgregar.setBackground(new java.awt.Color(32, 164, 180));
        btnAgregar.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("REGISTRO ADMINISTRATIVO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 309, -1, -1));

        jButtonCrear.setBackground(new java.awt.Color(32, 164, 180));
        jButtonCrear.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrear.setText("REGISTRO ADMINISTRATIVO");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 366, -1, -1));

        jButtonNotas.setBackground(new java.awt.Color(32, 164, 180));
        jButtonNotas.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonNotas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNotas.setText("CALIFICACION ACADEMICA");
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 537, 259, 33));

        jButtonPensum.setBackground(new java.awt.Color(32, 164, 180));
        jButtonPensum.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonPensum.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPensum.setText("CURRICULO/PENSUM");
        jButtonPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPensumActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonPensum, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 480, 259, -1));

        jButtonVer1.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer1.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer1.setText("INFORME DOCENTE");
        jButtonVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 588, 259, -1));

        btnMatricular.setBackground(new java.awt.Color(32, 164, 180));
        btnMatricular.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnMatricular.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricular.setText("MATRICULA ACADEMICA");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });
        jPanel4.add(btnMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 423, 259, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 259, 225));

        jButtonVer2.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer2.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer2.setText("INFORME ESTUDIANTE");
        jButtonVer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonVer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 645, 259, -1));

        jButtonSalir.setBackground(new java.awt.Color(32, 164, 180));
        jButtonSalir.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("CERRAR PROGRAMA");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 696, 259, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 655));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer1ActionPerformed

        TeachersHistory Ver = new TeachersHistory();
        Ver.setVisible(true);
        Ver.setLocationRelativeTo(null);
        this.dispose();   
    }//GEN-LAST:event_jButtonVer1ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonPensumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPensumActionPerformed
        if(LogIn==1){
            Pensum P = new Pensum();
            P.setVisible(true);
            P.setLocationRelativeTo(null);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "INGRESE SESION COMO ADMINISTRADOR PARA ACCEDER A ESTA OPCIÓN", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPensumActionPerformed

    private void jButtonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotasActionPerformed
        if(LogIn==1){
            Qualification Notas = new Qualification();
            Notas.setVisible(true);
            Notas.setLocationRelativeTo(null);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "INGRESE SESION COMO ADMINISTRADOR PARA ACCEDER A ESTA OPCIÓN", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonNotasActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        if(LogIn==1){
            Create C = new Create();
            C.setVisible(true);
            C.setLocationRelativeTo(null);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "INGRESE SESION COMO ADMINISTRADOR PARA ACCEDER A ESTA OPCIÓN", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if(LogIn==1){
            AddNew A = new AddNew();
            A.setVisible(true);
            A.setLocationRelativeTo(null);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "INGRESE SESION COMO ADMINISTRADOR PARA ACCEDER A ESTA OPCIÓN", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed

        LogIn L= new LogIn(LogIn,LogOut);
        L.setVisible(true);
        L.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        if(LogIn==1){
            Enroll M = new Enroll();
            M.setVisible(true);
            M.setLocationRelativeTo(null);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "INGRESE SESION COMO ADMINISTRADOR PARA ACCEDER A ESTA OPCIÓN", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMatricularActionPerformed

    private void bntCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCerrarSesionActionPerformed

        LogIn L= new LogIn();
        L.setVisible(true);
        L.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_bntCerrarSesionActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if(LogOut==1){
            System.out.println(LogOut);
            this.usuario = txtUsuario.getText();
            //this.contraseña = txtContraseña.getText();
            this.contraseña = passwordField.getText();

            if(usuario.equals("") || contraseña.equals("")){
                JOptionPane.showMessageDialog(null, "Algunos campos se encuentrn vacios", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            }
            else{
                int x=admin.verificarUsuario(usuario);
                int y=admin.verificarContraseña(contraseña);

                if(x==0 || y==0){
                    JOptionPane.showMessageDialog(null, "El usuario y/o contraseña son incorrectamente", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    LogIn=0;
                    passwordField.setText("");
                }
                else if(x==1 && y==0){
                    JOptionPane.showMessageDialog(null, "La conraseña es incorrecta", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    LogIn=0;
                    passwordField.setText("");
                }
                else if(x==1 && y==1){
                    LogIn=1;
                    LogOut=0;
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Tu sesión aún esta abierta, debes cerrarla", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButtonVer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer2ActionPerformed
        StudentsHistory V = new StudentsHistory();
        V.setVisible(true);
        V.setLocationRelativeTo(null);
        this.dispose();  
    }//GEN-LAST:event_jButtonVer2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCerrarSesion;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonNotas;
    private javax.swing.JButton jButtonPensum;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVer1;
    private javax.swing.JButton jButtonVer2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
