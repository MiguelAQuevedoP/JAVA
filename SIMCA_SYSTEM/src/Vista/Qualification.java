package Vista;

import Modelo.clsEnroll;
import Modelo.clsStudent;
import Modelo.clsQualification;
import Modelo.clsPerson;
import Modelo.clsCourse;
import Conexion.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Qualification extends javax.swing.JFrame {
   int LogIn=1;
   int LogOut=0;
   Cursos TC = new Cursos();
   Matricula M = new Matricula();
   SimcaDAO DAO=new SimcaDAO();
   
    public Qualification() {
        initComponents();
        ocultar();
        itemCombo();
        itemActividad();
    }

    public void ocultar(){
        jLabelM.setVisible(false);
        jLabelA.setVisible(false);
        jLabelP.setVisible(false);
        jLabelN.setVisible(false);
        jComboBoxM.setVisible(false);
        jComboBoxA.setVisible(false);
        jComboBoxP.setVisible(false);
        jComboBoxNotas.setVisible(false);
        jButton1.setVisible(false);
    }
    
    public void mostrar(){
        jLabelM.setVisible(true);
        jLabelA.setVisible(true);
        jLabelP.setVisible(true);
        jLabelN.setVisible(true);
        jComboBoxM.setVisible(true);
        jComboBoxA.setVisible(true);
        jComboBoxP.setVisible(true);
        jComboBoxNotas.setVisible(true);
        jButton1.setVisible(true);
    }
    
    public boolean verificar(int c){
        boolean b=false;
        boolean found=false;
        ArrayList<clsPerson> E = DAO.VerPersonas();
        
        for(int i=0;i<E.size();i++){
           if(E.get(i) instanceof clsStudent){
               if(E.get(i).getCodigo()==c){
                   found=true;   
               }
           }
        }
        if(found){
            b=true; 
        }
        else{
            JOptionPane.showMessageDialog(this, "No se encuentra el estudiante");
            jTextFieldCodigo.setText("");
        }
        return b;
    }
    public boolean verificarPorcentaje(int c,int p,String Materia){
        
        boolean b=false;
        int v = p;
        ArrayList<clsQualification> n = new ArrayList();
        ArrayList<clsQualification> x = DAO.BuscarNotasPorEstudiante(c);
        for(int i=0;i<x.size();i++){
            if(x.get(i).getMateria().equals(Materia)){
                n.add(x.get(i));
            }
        }
        for(int i=0;i<n.size();i++){
            
            v = v + (int) n.get(i).getPorcentaje();
        }
        System.out.println(v);
        if(v<=100){
          b=true;  
        }
        return b;
    }
    
    public void itemCombo(){
        for(int i=0;i<6;i++){
            for(int j=0;j<10;j++){
                String s = i+"."+j;
                double n = Double.parseDouble(s);
                if(n<5.1){
                    String item = Double.toString(n);
                    jComboBoxNotas.addItem(item);
                }
            }
        }
    }
    public void itemActividad(){
        for(int i=1;i<4;i++){
            String item = "Evaluacion "+i;
            jComboBoxA.addItem(item);
        }
    }
    
    public void itemMaterias(int c){
        
        ArrayList<clsEnroll> mat = M.BuscarMatriculaPorCodigo(c);
        for(int i=0;i<mat.size();i++){
            
            clsCourse curso= TC.BuscarCurso(mat.get(i).getCurso());
            System.out.println("numerito"+mat.get(i).getCurso());
            String item= curso.getNombre();
            jComboBoxM.addItem(item);
        }     
    }
    
    public void Agregar(){
        
        int codigo=Integer.parseInt(jTextFieldCodigo.getText());
        double nota=Double.parseDouble((String) jComboBoxNotas.getSelectedItem());
        String materia=(String) jComboBoxM.getSelectedItem();
        double porcentaje=Double.parseDouble((String)jComboBoxP.getSelectedItem());
        String actividad=(String) jComboBoxA.getSelectedItem();
        System.out.println("l:"+codigo+nota+materia+porcentaje+actividad);
        clsQualification N=new clsQualification(codigo, nota, materia, porcentaje, actividad);
        DAO.AgregarNota(N);
        JOptionPane.showMessageDialog(null, "Calificación registrada exitosamente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButtonLogIn = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonNotas = new javax.swing.JButton();
        jButtonPensum = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelN = new javax.swing.JLabel();
        jLabelP = new javax.swing.JLabel();
        jLabelA = new javax.swing.JLabel();
        jLabelM = new javax.swing.JLabel();
        jComboBoxNotas = new javax.swing.JComboBox<>();
        jComboBoxP = new javax.swing.JComboBox<>();
        jComboBoxA = new javax.swing.JComboBox<>();
        jComboBoxM = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonVer1 = new javax.swing.JButton();
        btnMatricular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonVer3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel4.setPreferredSize(new java.awt.Dimension(735, 715));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogIn.setBackground(new java.awt.Color(32, 164, 180));
        jButtonLogIn.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogIn.setText("INICIO DE SESIÓN");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 258, 231, -1));

        jButtonAgregar.setBackground(new java.awt.Color(32, 164, 180));
        jButtonAgregar.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("REGISTRO ADMINISTRATIVO");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 309, 231, -1));

        jButtonCrear.setBackground(new java.awt.Color(32, 164, 180));
        jButtonCrear.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrear.setText("REGISTRO MATERIA/CURSO");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 360, 231, -1));

        jButtonNotas.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonNotas.setForeground(new java.awt.Color(255, 153, 0));
        jButtonNotas.setText("CALIFICACION ACADEMICA");
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 513, 231, -1));

        jButtonPensum.setBackground(new java.awt.Color(32, 164, 180));
        jButtonPensum.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonPensum.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPensum.setText("CURRICULO/PENSUM");
        jButtonPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPensumActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonPensum, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 462, 231, -1));

        jButtonSalir.setBackground(new java.awt.Color(32, 164, 180));
        jButtonSalir.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("CERRAR PROGRAMA");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 231, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRO DE CALIFICACIONES");

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Playbill", 0, 80)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CALIFICACIONES");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("SUBIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelN.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabelN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelN.setText("CALIFICACIÓN:");

        jLabelP.setFont(new java.awt.Font("Arial Narrow", 1, 22)); // NOI18N
        jLabelP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelP.setText("PORCENTAJE DE LA ACTIVIDAD:");

        jLabelA.setFont(new java.awt.Font("Arial Narrow", 1, 22)); // NOI18N
        jLabelA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelA.setText("ACTIVIDAD CALIFICATIVA:");

        jLabelM.setFont(new java.awt.Font("Arial Narrow", 1, 22)); // NOI18N
        jLabelM.setForeground(new java.awt.Color(255, 255, 255));
        jLabelM.setText("ASIGNATURA A REGISTRAR:");

        jComboBoxNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNotasActionPerformed(evt);
            }
        });

        jComboBoxP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "35" }));
        jComboBoxP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPActionPerformed(evt);
            }
        });

        jComboBoxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAActionPerformed(evt);
            }
        });

        jComboBoxM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("IMPRIMIR NOTAS");
        jButton3.setToolTipText("");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CODIGO DEL ESTUDIANTE:");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelP)
                                            .addComponent(jLabelA)
                                            .addComponent(jLabelM)
                                            .addComponent(jLabelN))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxA, 0, 149, Short.MAX_VALUE)
                                            .addComponent(jComboBoxM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxNotas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelM)
                    .addComponent(jComboBoxM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelA)
                    .addComponent(jComboBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelP)
                    .addComponent(jComboBoxP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelN)
                    .addComponent(jComboBoxNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(jButton1)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 9, 490, 660));

        jButtonVer1.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer1.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer1.setText("INFORME DOCENTE");
        jButtonVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 231, -1));

        btnMatricular.setBackground(new java.awt.Color(32, 164, 180));
        btnMatricular.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnMatricular.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricular.setText("MATRICULA ACADEMICA");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });
        jPanel4.add(btnMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 411, 231, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jButtonVer3.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer3.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer3.setText("INFORME ESTUDIANTE");
        jButtonVer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonVer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 231, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jComboBoxNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNotasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int c = Integer.parseInt(jTextFieldCodigo.getText());
        int p = Integer.parseInt((String)jComboBoxP.getSelectedItem());
        String s = (String) jComboBoxM.getSelectedItem();
        if(s == null){
           JOptionPane.showMessageDialog(null, "El estudiante no está matriculado", "Error", JOptionPane.WARNING_MESSAGE);
        } 
        else {
           if(verificarPorcentaje(c,p,s)){
           Agregar(); 
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer1ActionPerformed

        TeachersHistory Ver = new TeachersHistory();
        Ver.setVisible(true);
        Ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVer1ActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        Enroll M = new Enroll();
        M.setVisible(true);
        M.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMatricularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jComboBoxM.removeAllItems();
        int s = Integer.parseInt(jTextFieldCodigo.getText());
        if(verificar(s)){
            mostrar();
            itemMaterias(s);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPActionPerformed

    private void jComboBoxAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        SeeNotes Notas = new SeeNotes();
        Notas.setVisible(true);
        Notas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonVer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer3ActionPerformed
        StudentsHistory V = new StudentsHistory();
        V.setVisible(true);
        V.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVer3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Qualification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonNotas;
    private javax.swing.JButton jButtonPensum;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVer1;
    private javax.swing.JButton jButtonVer3;
    private javax.swing.JComboBox<String> jComboBoxA;
    private javax.swing.JComboBox<String> jComboBoxM;
    private javax.swing.JComboBox<String> jComboBoxNotas;
    private javax.swing.JComboBox<String> jComboBoxP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelM;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JLabel jLabelP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables
}
