package Vista;

import Conexion.SimcaDAO;

public class Create extends javax.swing.JFrame {

    int LogIn=1;
    int LogOut=0;
    SimcaDAO DAO=new SimcaDAO();
    
    public Create() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxPeriodo = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonLogIn = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonNotas = new javax.swing.JButton();
        jButtonPensum = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonVer2 = new javax.swing.JButton();
        btnMatricular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonVer3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(0, 0, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel11.setPreferredSize(new java.awt.Dimension(735, 715));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 51, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel12.setPreferredSize(new java.awt.Dimension(480, 464));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 28)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("(2) CURSO");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 28)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("(1) MATERIA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(31, 118, 138));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PERIODO ACADEMICO:");

        jComboBoxPeriodo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023 - (1)", " " }));
        jComboBoxPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeriodoActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 153, 0));
        btnAgregar.setText("ACTUALIZAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPeriodo, 0, 173, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Playbill", 0, 65)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGISTRO MATERIA/CURSO");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECCIONE QUE TIPO DE REGISTRO REALIZARA:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 892, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 9, 540, 660));

        jButtonLogIn.setBackground(new java.awt.Color(32, 164, 180));
        jButtonLogIn.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogIn.setText("INICIO DE SESIÓN");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 258, 231, -1));

        jButtonAgregar.setBackground(new java.awt.Color(32, 164, 180));
        jButtonAgregar.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("REGISTRO ADMINISTRATIVO");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 309, 231, -1));

        jButtonCrear.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(255, 153, 0));
        jButtonCrear.setText("REGISTRO MATERIA/CURSO");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 354, 231, -1));

        jButtonNotas.setBackground(new java.awt.Color(32, 164, 180));
        jButtonNotas.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonNotas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNotas.setText("CALIFICACION ACADEMICA");
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 501, 231, -1));

        jButtonPensum.setBackground(new java.awt.Color(32, 164, 180));
        jButtonPensum.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonPensum.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPensum.setText("CURRICULO/PENSUM");
        jButtonPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPensumActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonPensum, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 450, 231, -1));

        jButtonSalir.setBackground(new java.awt.Color(32, 164, 180));
        jButtonSalir.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("CERRAR PROGRAMA");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 231, -1));

        jButtonVer2.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer2.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer2.setText("INFORME DOCENTE");
        jButtonVer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer2ActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonVer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 231, -1));

        btnMatricular.setBackground(new java.awt.Color(32, 164, 180));
        btnMatricular.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnMatricular.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricular.setText("MATRICULA ACADEMICA");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });
        jPanel11.add(btnMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 399, 231, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jButtonVer3.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer3.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer3.setText("INFORME ESTUDIANTE");
        jButtonVer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonVer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 231, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButtonPensumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPensumActionPerformed
        Pensum P = new Pensum();
            P.setVisible(true);
            P.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_jButtonPensumActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GenerateMatter cm = new GenerateMatter();
        cm.setVisible(true);
        cm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GenerateCourse cc = new GenerateCourse();
        cc.setVisible(true);
        cc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonVer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer2ActionPerformed

        TeachersHistory Ver = new TeachersHistory();
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

    private void jComboBoxPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeriodoActionPerformed

    }//GEN-LAST:event_jComboBoxPeriodoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String s=(String) jComboBoxPeriodo.getSelectedItem();
        
        if(DAO.InvocarPeriodoGlobal() == null){
            DAO.SetPeriodoGlobal(s);
            System.out.println(DAO.InvocarPeriodoGlobal());
        }
        else{
           DAO.UptadePeriodoGlobal(s);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButtonVer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer3ActionPerformed
        StudentsHistory V = new StudentsHistory();
        V.setVisible(true);
        V.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_jButtonVer3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
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
    private javax.swing.JButton jButtonVer3;
    private javax.swing.JComboBox<String> jComboBoxPeriodo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    // End of variables declaration//GEN-END:variables
}
