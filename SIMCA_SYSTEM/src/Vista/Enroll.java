package Vista;

import Modelo.clsMatter;
import Modelo.clsEnroll;
import Modelo.clsPerson;
import Modelo.clsCourse;
import Modelo.clsTeacher;
import javax.swing.JOptionPane;
import Conexion.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Enroll extends javax.swing.JFrame {
    
    int codigoMatricula=0;
    int codigoEstudiante;
    DefaultTableModel modelo;
    String[] info = new String [6];
    int LogIn=1;
    int LogOut=0;
    ArrayList<Integer> vCodigosMateria;
    Asignaturas MateriaDAO;
    ArrayList<clsCourse> vCursos;
    ArrayList<clsCourse> vTodosCursos;
    Cursos CursoDAO ;
    SimcaDAO PersonaDAO;
    Matricula MatriculaDAO;
    String periodoGlobal;
    
     public Enroll() {
        
        
        initComponents();
        this.vCodigosMateria=new ArrayList<Integer>();
        MateriaDAO = new Asignaturas();
        MatriculaDAO= new Matricula();
        CursoDAO = new Cursos();
        PersonaDAO=new SimcaDAO();
        this.vCursos=new ArrayList<clsCourse>();
        this.vTodosCursos=new ArrayList<clsCourse>();
        this.periodoGlobal=PersonaDAO.InvocarPeriodoGlobal();
        
        modelo=new DefaultTableModel();
        modelo.addColumn("Código Curso");
        modelo.addColumn("Curso");
        modelo.addColumn("Creditos");
        modelo.addColumn("Horario 1");
        modelo.addColumn("Horario 2");
        modelo.addColumn("Profesor");
        this.tabla.setModel(modelo);  
    } 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JPanel();
        txtCEstudiante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtBuscarCursos = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        boxSemestre = new javax.swing.JComboBox<>();
        txtCodigoE1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnLogIn = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonNotas = new javax.swing.JButton();
        jButtonPensum = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        jButtonAgregar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonVer3 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(0, 0, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel12.setPreferredSize(new java.awt.Dimension(735, 715));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellido.setBackground(new java.awt.Color(0, 51, 102));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        txtCEstudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEstudianteActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        txtBuscarCursos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBuscarCursos.setForeground(new java.awt.Color(255, 153, 0));
        txtBuscarCursos.setText("BUSCAR CURSO");
        txtBuscarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCursosActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PROGRAMA DE PREGRADO:");

        boxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        txtCodigoE1.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        txtCodigoE1.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoE1.setText("CODIGO DEL ESTUDIANTE:");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 153, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SEMESTRE DEL ESTUDIANTE:");

        txtCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria Electronica" }));

        jLabel18.setFont(new java.awt.Font("Playbill", 0, 70)); // NOI18N
        jLabel18.setForeground(java.awt.Color.red);
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MATRICULA ACADEMICA");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 153, 0));
        btnDelete.setText("REMOVER");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtApellidoLayout = new javax.swing.GroupLayout(txtApellido);
        txtApellido.setLayout(txtApellidoLayout);
        txtApellidoLayout.setHorizontalGroup(
            txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtApellidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(txtApellidoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(txtApellidoLayout.createSequentialGroup()
                                .addComponent(txtCodigoE1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtApellidoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtBuscarCursos)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtApellidoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(txtApellidoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnAgregar)
                .addGap(56, 56, 56)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txtApellidoLayout.setVerticalGroup(
            txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtApellidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoE1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(boxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(txtBuscarCursos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnDelete))
                .addGap(64, 64, 64))
        );

        jPanel12.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 9, 770, 640));

        btnLogIn.setBackground(new java.awt.Color(32, 164, 180));
        btnLogIn.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("INICIO DE SESIÓN");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel12.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 258, 234, -1));

        jButtonAgregar.setBackground(new java.awt.Color(32, 164, 180));
        jButtonAgregar.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("REGISTRO ADMINISTRATIVO");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 303, 234, -1));

        jButtonCrear.setBackground(new java.awt.Color(32, 164, 180));
        jButtonCrear.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrear.setText("REGISTRO MATERIA/CURSO");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 348, 234, -1));

        jButtonNotas.setBackground(new java.awt.Color(32, 164, 180));
        jButtonNotas.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonNotas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNotas.setText("CALIFICACION ACADEMICA");
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 489, 234, -1));

        jButtonPensum.setBackground(new java.awt.Color(32, 164, 180));
        jButtonPensum.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonPensum.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPensum.setText("CURRICULO/PENSUM");
        jButtonPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPensumActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonPensum, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 438, 234, -1));

        jButtonSalir.setBackground(new java.awt.Color(32, 164, 180));
        jButtonSalir.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("CERRAR PROGRAMA");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 234, -1));

        jButtonVer.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer.setText("INFORME DOCENTE");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 234, -1));

        jButtonAgregar1.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonAgregar1.setForeground(new java.awt.Color(255, 153, 0));
        jButtonAgregar1.setText("MATRICULA ACADEMICA");
        jButtonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregar1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 393, 234, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel12.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jButtonVer3.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer3.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer3.setText("INFORME ESTUDIANTE");
        jButtonVer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonVer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 231, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed

        LogIn L= new LogIn(LogIn,LogOut);
        L.setVisible(true);
        L.setLocationRelativeTo(null);
        this.dispose();          
    }//GEN-LAST:event_btnLogInActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        AddNew A = new AddNew();
        A.setVisible(true);
        A.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        Create cr = new Create();
        cr.setVisible(true);
        cr.setLocationRelativeTo(null);
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

    private void txtCEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEstudianteActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        
        TeachersHistory Ver = new TeachersHistory();
        Ver.setVisible(true);
        Ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jButtonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregar1ActionPerformed
        
    }//GEN-LAST:event_jButtonAgregar1ActionPerformed

    private void txtBuscarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCursosActionPerformed
  
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        int bandera=0;
        String carrera = (String) txtCarrera.getSelectedItem();
        
        if(txtCEstudiante.getText().equals("") || carrera.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los valores", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try{
               
                codigoEstudiante=Integer.valueOf((String)txtCEstudiante.getText());
                clsPerson Persona = PersonaDAO.BuscarPersona(codigoEstudiante);
                if (Persona == null){
                    JOptionPane.showMessageDialog(null, "Código de estudiante no registrado", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    bandera=1;
                }
                if(Persona instanceof clsTeacher){
                    JOptionPane.showMessageDialog(null, "Error, esta ingresando una persona incorrecta", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    bandera=1;
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ha ingresado el codigo con caracteres erroneos", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                bandera=1;
            }
        }
        if (bandera==0){
        
            //Cursos filtrados por carrera y por semestre
            String periodoExtraido;
            String periodoIngresado=periodoGlobal;
            
            vCodigosMateria=MateriaDAO.BuscarCod_Sem_Carrera(carrera, Integer.parseInt((String)boxSemestre.getSelectedItem()));
            
            for(int i=0; i<vCodigosMateria.size();i++){
                vTodosCursos=CursoDAO.VerCursos();
                for(int x=0; x<vTodosCursos.size(); x++ ){
                    if(vTodosCursos.get(x).getC_Materia()==vCodigosMateria.get(i)){
                        periodoExtraido=vTodosCursos.get(x).getPeriodo();
                        if(periodoExtraido.equals(periodoIngresado)){
                            vCursos.add(vTodosCursos.get(x));  
                        }
                    }
                }
            }

            if (vCursos.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay cursos registrados", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);               
            }
            else{
                for(int i=0; i<vCursos.size(); i++){

                    clsCourse cc = vCursos.get(i);
                    clsPerson pp = PersonaDAO.BuscarPersona(cc.getProfesor()); 
                    clsMatter mm = MateriaDAO.BuscarMateria(cc.getC_Materia());
                    info[0]=String.valueOf(cc.getCodigo());
                    info[1]=cc.getNombre();
                    info[2]=String.valueOf(mm.getCreditos());
                    info[3]=cc.getHorario_1();
                    info[4]=cc.getHorario_2();
                    info[5]=pp.getNombre()+" "+pp.getApellido();
                    modelo.addRow(info);
                }
            } 
            vCursos.clear();
            vCodigosMateria.clear();
        }      
    }//GEN-LAST:event_txtBuscarCursosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int columna= 0;
        int parametro;
        int R=0;
        clsPerson Persona=null; 
       
        try{   
            codigoEstudiante=Integer.valueOf((String)txtCEstudiante.getText());
            Persona= PersonaDAO.BuscarPersona(codigoEstudiante);
            
            if(Persona instanceof clsTeacher){
                JOptionPane.showMessageDialog(null, "Error, esta ingresando una persona incorrecta", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            }        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ha ingresado el codigo con caracteres erroneos", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
        
        if(!(tabla.getSelectedRowCount()>0)){
            JOptionPane.showMessageDialog(null, "Seleccione un curso", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
        
        else if (tabla.getSelectedRowCount()>1 ){
            JOptionPane.showMessageDialog(null, "Solo se puede registrar un curso a la vez", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }

        else{
            
            if (Persona == null){
                    JOptionPane.showMessageDialog(null, "El codigo ingresado no existe en el sistema", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            }else{        

                if(tabla.getSelectedRowCount()>0){

                    int fila=tabla.getSelectedRow();
                    int codigoCurso = Integer.valueOf((String)tabla.getValueAt(fila, columna));
                    codigoMatricula=MatriculaDAO.contarCodigos();

                    R=MatriculaDAO.verificarRepetidos(codigoEstudiante, codigoCurso);

                    if(R==0){
                        int SemestreCurso = this.MateriaDAO.BuscarMateria(this.CursoDAO.BuscarCurso(codigoCurso).getC_Materia()).getSemestre();
                        int Aux = 0 ;
                        ArrayList<clsEnroll> m = MatriculaDAO.BuscarMatriculaPorCodigo(Persona.getCodigo());
                        for(int i=0;i<m.size();i++){
                            if(MateriaDAO.BuscarMateria(CursoDAO.BuscarCurso(m.get(i).getCurso()).getC_Materia()).getSemestre() > Aux){
                                Aux = MateriaDAO.BuscarMateria(CursoDAO.BuscarCurso(m.get(i).getCurso()).getC_Materia()).getSemestre();
                                
                            }
                        }
                        if(SemestreCurso >= Aux){
                            MatriculaDAO.AgregarCurso(codigoMatricula, codigoCurso, codigoEstudiante);
                            System.out.println(codigoMatricula+" "+codigoCurso+" "+codigoEstudiante);
                            JOptionPane.showMessageDialog(null, "Curso Matriculado exitosamente");
                        }                      
                    }else{
                        JOptionPane.showMessageDialog(null, "El curso seleccionado ya ha sido matriculado", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    }
                
                }
            }
 
        }    
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButtonVer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer3ActionPerformed
        StudentsHistory V = new StudentsHistory();
        V.setVisible(true);
        V.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVer3ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int columna= 0;
        int parametro;
        int R=0;
        clsPerson Persona=null; 
       
        try{   
            codigoEstudiante=Integer.valueOf((String)txtCEstudiante.getText());
            Persona= PersonaDAO.BuscarPersona(codigoEstudiante);
            
            if(Persona instanceof clsTeacher){
                JOptionPane.showMessageDialog(null, "Error, esta ingresando una persona incorrecta", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            }        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ha ingresado el codigo con caracteres erroneos", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
        
        if(!(tabla.getSelectedRowCount()>0)){
            JOptionPane.showMessageDialog(null, "Seleccione un curso", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
        
        else if (tabla.getSelectedRowCount()>1 ){
            JOptionPane.showMessageDialog(null, "Solo se puede registrar un curso a la vez", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }

        else{
            
            if (Persona == null){
                    JOptionPane.showMessageDialog(null, "El codigo ingresado no existe en el sistema", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            }else{        

                if(tabla.getSelectedRowCount()>0){

                    int fila=tabla.getSelectedRow();
                    int codigoCurso = Integer.valueOf((String)tabla.getValueAt(fila, columna));
                    codigoMatricula=MatriculaDAO.contarCodigos();

                    R=MatriculaDAO.verificarRepetidos(codigoEstudiante, codigoCurso);

                    if(R==0){
                        int SemestreCurso = this.MateriaDAO.BuscarMateria(this.CursoDAO.BuscarCurso(codigoCurso).getC_Materia()).getSemestre();
                        int Aux = 0 ;
                        ArrayList<clsEnroll> m = MatriculaDAO.BuscarMatriculaPorCodigo(Persona.getCodigo());
                        for(int i=0;i<m.size();i++){
                            if(MateriaDAO.BuscarMateria(CursoDAO.BuscarCurso(m.get(i).getCurso()).getC_Materia()).getSemestre() > Aux){
                                Aux = MateriaDAO.BuscarMateria(CursoDAO.BuscarCurso(m.get(i).getCurso()).getC_Materia()).getSemestre();
                                
                            }
                        }
                        if(SemestreCurso >= Aux){
                            MatriculaDAO.EliminarCurso(codigoEstudiante);
                            System.out.println(codigoMatricula+" "+codigoCurso+" "+codigoEstudiante);
                            JOptionPane.showMessageDialog(null, 
                                    codigoEstudiante+ " ha sido eliminado del curso");
                        }                      
                    }else{
                        JOptionPane.showMessageDialog(null, 
                                "El estudiante ya ha sido eliminado del curso", "WARNING_MESSAGE", 
                                JOptionPane.WARNING_MESSAGE);
                    }
                
                }
            }
 
        }  
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enroll().setVisible(true);
            }
        });      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSemestre;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogIn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAgregar1;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonNotas;
    private javax.swing.JButton jButtonPensum;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JButton jButtonVer3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JPanel txtApellido;
    private javax.swing.JButton txtBuscarCursos;
    private javax.swing.JTextField txtCEstudiante;
    private javax.swing.JComboBox<String> txtCarrera;
    private javax.swing.JLabel txtCodigoE1;
    // End of variables declaration//GEN-END:variables
}
