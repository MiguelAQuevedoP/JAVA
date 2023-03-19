package Vista;

public class CategoryHistory extends javax.swing.JFrame {
    int LogIn=1;
    int LogOut=0;
    
    public CategoryHistory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonLogIn = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonPensum = new javax.swing.JButton();
        btnMatricular = new javax.swing.JButton();
        jButtonNotas = new javax.swing.JButton();
        jButtonVer2 = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 715));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 51, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("ESTUDIANTES");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("DOCENTES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Playbill", 0, 80)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INFORME");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SECCIÓN DE IMPRESION DE REGISTRADOS EN EL SISTEMA");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OBSERVAR LOS DOCENTES REGISTRADOS EN EL SISTEMA");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("OBSERVAR LOS ESTUDIANTES REGISTRADOS EN EL SISTEMA");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton2))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 9, -1, 591));

        jButtonLogIn.setBackground(new java.awt.Color(32, 164, 180));
        jButtonLogIn.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogIn.setText("INICIO DE SESIÓN");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 258, 231, -1));

        jButtonAgregar.setBackground(new java.awt.Color(32, 164, 180));
        jButtonAgregar.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("REGISTRO ADMINISTRATIVO");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 303, 231, -1));

        jButtonCrear.setBackground(new java.awt.Color(32, 164, 180));
        jButtonCrear.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrear.setText("REGISTRO MATERIA/CURSO");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 348, 231, -1));

        jButtonPensum.setBackground(new java.awt.Color(32, 164, 180));
        jButtonPensum.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonPensum.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPensum.setText("CURRICULO/PENSUM");
        jButtonPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPensumActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPensum, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 438, 231, -1));

        btnMatricular.setBackground(new java.awt.Color(32, 164, 180));
        btnMatricular.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnMatricular.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricular.setText("MATRICULA ACADEMICA");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });
        jPanel1.add(btnMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 393, 231, -1));

        jButtonNotas.setBackground(new java.awt.Color(32, 164, 180));
        jButtonNotas.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonNotas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNotas.setText("CALIFICACION ACADEMICA");
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 483, 231, -1));

        jButtonVer2.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer2.setForeground(new java.awt.Color(255, 153, 0));
        jButtonVer2.setText("INFORME REGISTROS");
        jButtonVer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 528, 231, -1));

        jButtonSalir.setBackground(new java.awt.Color(32, 164, 180));
        jButtonSalir.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("CERRAR PROGRAMA");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 573, 231, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        LogIn L = new LogIn(LogIn,LogOut);
        L.setVisible(true);
        L.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        AddNew A = new AddNew();
        A.setVisible(true);
        A.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        Create C = new Create();
        C.setVisible(true);
        C.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotasActionPerformed
        Qualification Notas = new Qualification();
        Notas.setVisible(true);
        Notas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonNotasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentsHistory VE = new StudentsHistory();
        VE.setVisible(true);
        VE.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TeachersHistory VD = new TeachersHistory();
        VD.setVisible(true);
        VD.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonPensumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPensumActionPerformed
        Pensum P = new Pensum();
        P.setVisible(true);
        P.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonPensumActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonVer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer2ActionPerformed
        CategoryHistory Ver = new CategoryHistory();
        Ver.setVisible(true);
        Ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVer2ActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        Enroll M = new Enroll();
        M.setVisible(true);
        M.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMatricularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryHistory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonNotas;
    private javax.swing.JButton jButtonPensum;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVer2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    // End of variables declaration//GEN-END:variables
}
