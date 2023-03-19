package Vista;

import Modelo.clsPerson;
import Modelo.clsCourse;
import Modelo.clsTeacher;
import Conexion.*;
import Modelo.clsMatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GenerateCourse extends javax.swing.JFrame {
    Cursos TC;
    Asignaturas TM;
    SimcaDAO TP;
    private  ArrayList<clsCourse> CS;
   
    public GenerateCourse() {
        initComponents();
        TC = new Cursos();
        TM = new Asignaturas();
        TP = new SimcaDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        txtDocente = new javax.swing.JTextField();
        cHorario1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cHorario2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JComboBox<>();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.setPreferredSize(new java.awt.Dimension(445, 445));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel6.setFont(new java.awt.Font("Playbill", 0, 80)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GENERAR CURSO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MATERIA:");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CODIGO DOCENTE:");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HORARIO - OPCIÓN  (1):");

        cHorario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUNES = 07 a.m. - 09 a.m.", "LUNES = 09 a.m. - 11 a.m.", "LUNES = 11 a.m. -  01 p.m.", "LUNES = 02 p.m. - 04 p.m.", "LUNES = 04 p.m. - 06 p.m.", "LUNES = 06 p.m. - 08 p.m.", "MARTES = 07 a.m. - 09 a.m.", "MARTES = 09 a.m. - 11 a.m.", "MARTES = 11 a.m. -  01 p.m.", "MARTES = 02 p.m. - 04 p.m.", "MARTES = 04 p.m. - 06 p.m.", "MARTES = 06 p.m. - 08 p.m.", "MIERCOLES = 07 a.m. - 09 a.m.", "MIERCOLES = 09 a.m. - 11 a.m.", "MIERCOLES = 11 a.m. -  01 p.m.", "MIERCOLES = 02 p.m. - 04 p.m.", "MIERCOLES = 04 p.m. - 06 p.m.", "MIERCOLES = 06 p.m. - 08 p.m.", "JUEVES = 07 a.m. - 09 a.m.", "JUEVES = 09 a.m. - 11 a.m.", "JUEVES = 11 a.m. -  01 p.m.", "JUEVES = 02 p.m. - 04 p.m.", "JUEVES = 04 p.m. - 06 p.m.", "JUEVES = 06 p.m. - 08 p.m.", "VIERNES = 07 a.m. - 09 a.m.", "VIERNES = 09 a.m. - 11 a.m.", "VIERNES = 11 a.m. -  01 p.m.", "VIERNES = 02 p.m. - 04 p.m.", "VIERNES = 04 p.m. - 06 p.m.", "VIERNES = 06 p.m. - 08 p.m.", " " }));
        cHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cHorario1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HORARIO - OPCIÓN  (2):");

        cHorario2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUNES = 07 a.m. - 09 a.m.", "LUNES = 09 a.m. - 11 a.m.", "LUNES = 11 a.m. -  01 p.m.", "LUNES = 02 p.m. - 04 p.m.", "LUNES = 04 p.m. - 06 p.m.", "LUNES = 06 p.m. - 08 p.m.", "MARTES = 07 a.m. - 09 a.m.", "MARTES = 09 a.m. - 11 a.m.", "MARTES = 11 a.m. -  01 p.m.", "MARTES = 02 p.m. - 04 p.m.", "MARTES = 04 p.m. - 06 p.m.", "MARTES = 06 p.m. - 08 p.m.", "MIERCOLES = 07 a.m. - 09 a.m.", "MIERCOLES = 09 a.m. - 11 a.m.", "MIERCOLES = 11 a.m. -  01 p.m.", "MIERCOLES = 02 p.m. - 04 p.m.", "MIERCOLES = 04 p.m. - 06 p.m.", "MIERCOLES = 06 p.m. - 08 p.m.", "JUEVES = 07 a.m. - 09 a.m.", "JUEVES = 09 a.m. - 11 a.m.", "JUEVES = 11 a.m. -  01 p.m.", "JUEVES = 02 p.m. - 04 p.m.", "JUEVES = 04 p.m. - 06 p.m.", "JUEVES = 06 p.m. - 08 p.m.", "VIERNES = 07 a.m. - 09 a.m.", "VIERNES = 09 a.m. - 11 a.m.", "VIERNES = 11 a.m. -  01 p.m.", "VIERNES = 02 p.m. - 04 p.m.", "VIERNES = 04 p.m. - 06 p.m.", "VIERNES = 06 p.m. - 08 p.m.", " " }));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CUPO DE LA MATERIA:");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PROGRAMA:");

        txtCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria Electronica" }));

        bVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bVolver.setForeground(new java.awt.Color(8, 121, 147));
        bVolver.setText("VOLVER");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bVolver))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cHorario2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cHorario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVolver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Boolean Bandera = true;
        Boolean Bandera_2 = true;
        String carrera = (String) txtCarrera.getSelectedItem();
        
        Boolean No = true;
        ArrayList<clsMatter> MS = TM.BuscarMateriaNombre(this.txtMateria.getText());
        clsTeacher PS = null;
        ArrayList<clsPerson> VP = TP.VerPersonas();
        
        try{
            for(int i=0;i<VP.size();i++){
                if(VP.get(i) instanceof clsTeacher && VP.get(i).getCodigo() == Integer.parseInt(this.txtDocente.getText())){
                    PS = (clsTeacher)VP.get(i);
                }
            }
            CS = TC.VerCursos();
            
            if(CS.isEmpty()){
                String Nom = this.txtMateria.getText() + " " + TP.InvocarPeriodoGlobal();
                if(!MS.isEmpty()){
                    for(int i=0;i<MS.size();i++){
                        if(MS.get(i).getCarrera().equalsIgnoreCase(carrera)){
                            if(PS != null){
                                clsCourse C = new clsCourse(Nom, MS.get(i).getCodigo(),PS.getCodigo(),Integer.parseInt(this.txtSize.getText()),CS.size(),this.cHorario1.getSelectedItem().toString(),this.cHorario2.getSelectedItem().toString(),TP.InvocarPeriodoGlobal()); 
                                System.out.println(C.getCodigo());
                                TC.AgregarCurso(C);
                                JOptionPane.showMessageDialog(this, "Curso registrado con exito");  
                                
                                Bandera_2 = false;
                            }
                          Bandera = false;  
                        }   
                    }
                    if(Bandera){
                        JOptionPane.showMessageDialog(this, "Materia NO encontrada en el sistema"); 
                    }
                    else if(Bandera_2){
                        JOptionPane.showMessageDialog(this, "Profesor NO encontrado en el sistema");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Materia NO encontrada en el sistema"); 
                } 
            }
            else{
                for(int i=0;i<CS.size();i++){
                    if(CS.get(i).getPeriodo().equalsIgnoreCase(TP.InvocarPeriodoGlobal())){
                        if(!MS.isEmpty()){
                            for(int j=0;j<MS.size();j++){

                                if(CS.get(i).getC_Materia()==MS.get(j).getCodigo()){
                                    if(CS.get(i).getHorario_1().equalsIgnoreCase(this.cHorario1.getSelectedItem().toString()) || CS.get(i).getHorario_2().equalsIgnoreCase(this.cHorario2.getSelectedItem().toString())){

                                        if(PS != null && (PS.getCodigo()==CS.get(i).getProfesor())){
                                            No = false;
                                        }
                                    }
                                }
                            } 
                        }
                    }                 
                }
                
                if(No){
                    String Nom = this.txtMateria.getText() + " " + TP.InvocarPeriodoGlobal();
                    ArrayList<clsCourse> Ca = this.TC.BuscarCursoNombre(Nom);
                    
                        if(!MS.isEmpty()){
                            Boolean CRep = true;
                            
                            for(int i=0;i<MS.size();i++){
                                if(MS.get(i).getCarrera().equalsIgnoreCase(carrera)){
                                    if(PS != null){
                                        for(int j=0;j<CS.size();j++){

                                            Boolean Comparar = CS.get(j).getHorario_1().equalsIgnoreCase(this.cHorario1.getSelectedItem().toString()) || CS.get(j).getHorario_2().equalsIgnoreCase(this.cHorario2.getSelectedItem().toString()) || CS.get(j).getHorario_1().equalsIgnoreCase(this.cHorario2.getSelectedItem().toString()) || CS.get(j).getHorario_2().equalsIgnoreCase(this.cHorario1.getSelectedItem().toString());
                                            Boolean Comparar_2 = CS.get(j).getProfesor() == PS.getCodigo();
                                            if(Comparar_2){

                                                if(Comparar){
                                                    if(CS.get(j).getPeriodo().equalsIgnoreCase(TP.InvocarPeriodoGlobal())){
                                                       CRep = false; 
                                                    }  
                                                }
                                            }
                                        } 
                                        
                                        if(CRep){
                                            
                                            if(!this.cHorario1.getSelectedItem().toString().equalsIgnoreCase(this.cHorario2.getSelectedItem().toString())){
                                                
                                                clsCourse C = new clsCourse(Nom,MS.get(i).getCodigo(),PS.getCodigo(),Integer.parseInt(this.txtSize.getText()),CS.size(),this.cHorario1.getSelectedItem().toString(),this.cHorario2.getSelectedItem().toString(),TP.InvocarPeriodoGlobal()); 
                                                System.out.println(C.getCodigo());
                                                TC.AgregarCurso(C);
                                                JOptionPane.showMessageDialog(this, "Acción Realizada con éxito");
                                                this.dispose();
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(this, "Los hhorarios estan repetidos, por favor seleccione otro"); 
                                            }   
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(this, "El profesor ya está dando un curso en ese horario"); 
                                        }
                                        Bandera_2 = false;
                                    }
                                    Bandera = false;  
                                }   
                            }
                            if(Bandera){
                                JOptionPane.showMessageDialog(this, "Materia NO Encontrada en el sistema"); 
                            }
                            else if(Bandera_2){
                                JOptionPane.showMessageDialog(this, "Profesor NO encontrado en el sistema");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Materia NO encontrada en el sistema"); 
                        }
                }
                else{
                    JOptionPane.showMessageDialog(this, "ha ingresado un curso repetido, por favor cambialo"); 
                }   
            }  
        }
        catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(this, "Hay un error en los datos, por favor verificar"); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
      
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void cHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cHorario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cHorario1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateCourse().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVolver;
    private javax.swing.JComboBox<String> cHorario1;
    private javax.swing.JComboBox<String> cHorario2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> txtCarrera;
    private javax.swing.JTextField txtDocente;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
