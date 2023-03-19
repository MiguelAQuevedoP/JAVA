package Vista;

import Modelo.clsPerson;
import Modelo.clsQualification;
import Modelo.clsTeacher;
import javax.swing.JOptionPane;
import Conexion.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SeeNotes extends javax.swing.JFrame {
    String periodo;
    String periodoExtraido;
    int codigoEstudiante;
    DefaultTableModel modelo;
    String[] info = new String [6];
    int LogIn=1;
    int LogOut=0;
    ArrayList<clsQualification> vNotas;
    ArrayList<clsQualification> vTabla;
    Cursos CursoDAO ;
    SimcaDAO PersonaDAO;
    SimcaDAO NotaDAO;

    public SeeNotes() {
        initComponents();
        CursoDAO = new Cursos();
        NotaDAO=new SimcaDAO();
        PersonaDAO=new SimcaDAO();
        modelo=new DefaultTableModel();
        modelo.addColumn("Curso");
        modelo.addColumn("Actividad");
        modelo.addColumn("Porcentaje");
        modelo.addColumn("Nota");
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
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtBuscarCursos = new javax.swing.JButton();
        txtCodigoE1 = new javax.swing.JLabel();
        boxPeriodo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonNotas = new javax.swing.JButton();
        jButtonPensum = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        jButtonAgregar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
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

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PERIODO ACADEMICO:");

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
        txtBuscarCursos.setText("VER NOTAS");
        txtBuscarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCursosActionPerformed(evt);
            }
        });

        txtCodigoE1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        txtCodigoE1.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoE1.setText("CODIGO DEL ESTUDIANTE:");

        boxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023.1", " " }));

        jLabel6.setFont(new java.awt.Font("Playbill", 0, 80)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CALIFICACIONES");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        javax.swing.GroupLayout txtApellidoLayout = new javax.swing.GroupLayout(txtApellido);
        txtApellido.setLayout(txtApellidoLayout);
        txtApellidoLayout.setHorizontalGroup(
            txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtApellidoLayout.createSequentialGroup()
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtApellidoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBuscarCursos))
                    .addGroup(txtApellidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(txtApellidoLayout.createSequentialGroup()
                                    .addComponent(txtCodigoE1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(txtApellidoLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(57, 57, 57)
                                    .addComponent(boxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        txtApellidoLayout.setVerticalGroup(
            txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtApellidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoE1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(boxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCursos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 9, -1, 630));

        btnLogIn.setBackground(new java.awt.Color(32, 164, 180));
        btnLogIn.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("INICIO DE SESIÓN");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel12.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 252, 231, -1));

        jButtonAgregar.setBackground(new java.awt.Color(32, 164, 180));
        jButtonAgregar.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("REGISTRO ADMINISTRATIVO");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 297, 231, -1));

        jButtonCrear.setBackground(new java.awt.Color(32, 164, 180));
        jButtonCrear.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrear.setText("REGISTRO MATERIA/CURSO");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 342, 231, -1));

        jButtonNotas.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonNotas.setForeground(new java.awt.Color(255, 153, 0));
        jButtonNotas.setText("CALIFICACION ACADEMICA");
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 477, 231, -1));

        jButtonPensum.setBackground(new java.awt.Color(32, 164, 180));
        jButtonPensum.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonPensum.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPensum.setText("CURRICULO/PENSUM");
        jButtonPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPensumActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonPensum, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 432, 231, -1));

        jButtonSalir.setBackground(new java.awt.Color(32, 164, 180));
        jButtonSalir.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("CERRAR PROGRAMA");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 231, -1));

        jButtonVer.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer.setText("INFORME DOCENTE");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 522, 231, -1));

        jButtonAgregar1.setBackground(new java.awt.Color(32, 164, 180));
        jButtonAgregar1.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar1.setText("MATRICULA ACADEMICA");
        jButtonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregar1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 387, 231, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel12.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, 225));

        jButtonVer3.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer3.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer3.setText("INFORME ESTUDIANTE");
        jButtonVer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonVer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 231, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
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
        SeeNotes M = new SeeNotes();
        M.setVisible(true);
        M.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonAgregar1ActionPerformed

    private void txtBuscarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCursosActionPerformed
        
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        int bandera=0;
        
        if(txtCEstudiante.getText().equals("")){ 
            JOptionPane.showMessageDialog(null, "Ingrese el código del estudiante", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
        else { 
            try{
                codigoEstudiante=Integer.valueOf((String)txtCEstudiante.getText());
                periodo=(String)boxPeriodo.getSelectedItem();
                
                clsPerson Persona = PersonaDAO.BuscarPersona(codigoEstudiante);
                
                if (Persona == null){
                    JOptionPane.showMessageDialog(null, "El estudiante no en encuentra en el sistema", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    bandera=1;
                }
                if(Persona instanceof clsTeacher){
                    JOptionPane.showMessageDialog(null, "Ingresó el código de un Docente, ingrese el código correctamente", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    bandera=1;
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, ha ingresado un codigo con caracteres erroneos", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                bandera=1;
            }
        }
        if (bandera==0){
            vNotas=NotaDAO.BuscarNotasPorEstudiante(codigoEstudiante);
            
            if(vNotas.isEmpty()){
                JOptionPane.showMessageDialog(null, "El estudiante no tiene notas registradas", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            }else{
                for(int i=0; i<vNotas.size(); i++){
                    String nombreCurso= vNotas.get(i).getMateria();
                    //System.out.println("nombre curso: "+nombreCurso);
                    periodoExtraido=CursoDAO.PeriodoCursoNombre(nombreCurso);

                    if(periodo.equalsIgnoreCase(periodoExtraido)){
                        vTabla.add(vNotas.get(i));
                    }
                }
            }
            if(vTabla.isEmpty()){
               JOptionPane.showMessageDialog(null, "No se econtraron notas", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            
            }else{

                for(int i=0; i<vTabla.size(); i++){
                    
                    clsQualification nn = vTabla.get(i);
                    
                    info[0]=nn.getMateria();
                    info[1]=nn.getActividad();
                    info[2]=String.valueOf(nn.getPorcentaje());
                    info[3]=String.valueOf(nn.getCalificacion());
                
                    
                    modelo.addRow(info);
                }
                
                //para ordenar la tabla
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
                tabla.setRowSorter(sorter);

                List<SortKey> sortKeys = new ArrayList<>();
                sortKeys.add(new SortKey(0,SortOrder.ASCENDING));
                sorter.setSortKeys(sortKeys); 
            }   
        }
        vNotas.clear();
        vTabla.clear(); 
    }//GEN-LAST:event_txtBuscarCursosActionPerformed

    private void jButtonVer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer3ActionPerformed
        StudentsHistory V = new StudentsHistory();
        V.setVisible(true);
        V.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVer3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeeNotes().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPeriodo;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JPanel txtApellido;
    private javax.swing.JButton txtBuscarCursos;
    private javax.swing.JTextField txtCEstudiante;
    private javax.swing.JLabel txtCodigoE1;
    // End of variables declaration//GEN-END:variables
}
