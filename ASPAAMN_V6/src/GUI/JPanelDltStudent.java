/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import access.clsStudentAccess;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.clsStudent;

/**
 *
 * @author migue
 */
public class JPanelDltStudent extends javax.swing.JPanel {

    private clsStudentAccess auxStudentAccess;
    private clsStudent auxStudent;

    public JPanelDltStudent() {
        this.auxStudent = new clsStudent();
        this.auxStudentAccess = new clsStudentAccess();
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

        lblTitle = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tStudent = new javax.swing.JTable();
        btnDlt = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("INHABILITAR ESTUDIANTE");

        lblCode.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblCode.setText("CODIGO DE ESTUDIANTE");

        txtCode.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(132, 244, 217));
        btnSearch.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnSearch.setText("BUSCAR");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tStudent.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        tStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "FECHA DE NACIMIENTO", "TIPO DE DOCUMENTO", "NUMERO DE DOCUMENTO", "CODIGO", "CARRERA", "EMAIL", "CONTRASEÑA"
            }
        ));
        jScrollPane1.setViewportView(tStudent);

        btnDlt.setBackground(new java.awt.Color(244, 132, 132));
        btnDlt.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnDlt.setForeground(new java.awt.Color(0, 0, 0));
        btnDlt.setText("INHABILITAR");
        btnDlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblCode)
                .addGap(18, 18, 18)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnSearch)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDlt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCode)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDlt)
                .addGap(0, 129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Object matriz[][] = new Object[1][8];
        Long codEstudiante = Long.parseLong(txtCode.getText());
        auxStudent = auxStudentAccess.BuscarEstudiante(codEstudiante);
        if (!codEstudiante.equals("")) {
            if (auxStudent != null && auxStudent instanceof clsStudent) {
                clsStudent st = (clsStudent) auxStudent;
                matriz[0][0] = st.getName();
                matriz[0][1] = st.getDateBirth();
                matriz[0][2] = st.getTypeDocument();
                matriz[0][3] = st.getNumDocument();
                matriz[0][4] = st.getCodeStudent();
                matriz[0][5] = st.getCareer();
                matriz[0][6] = st.getEmail();
                matriz[0][7] = st.getPassword();
                tStudent.setModel(new javax.swing.table.DefaultTableModel(matriz,
                        new String[]{"NOMBRE", "FECHA DE NACIMIENTO", "TIPO DE DOCUMENTO", "NUMERO DE DOCUMENTO", "CODIGO", "CARRERA", "EMAIL", "CONTRASEÑA"}));

            } else {
                JOptionPane.showMessageDialog(this,
                        "No se encontro ningun Estudiante con el codigo:" + codEstudiante,
                        "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Hay campos vacios, porfavor rellenelos",
                    "informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltActionPerformed

        dltStudent();
    }//GEN-LAST:event_btnDltActionPerformed

    public void dltStudent() {
        Long codEstudiante = Long.parseLong(txtCode.getText());
        auxStudent = auxStudentAccess.BuscarEstudiante(codEstudiante);
        this.auxStudentAccess.deleteStudent(auxStudent);

        JOptionPane.showMessageDialog(this,
                "INHABILITACION CORRECTA",
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
        cleanSpace();
    }

    public void cleanSpace() {
        this.txtCode.setText("");
        Object matriz[][] = new Object[1][8];
        for (int i = 0; i < matriz.length; i++) {
            matriz[0][i] = "";
        }
        tStudent.setModel(new javax.swing.table.DefaultTableModel(matriz,
                new String[]{"NOMBRE", "FECHA DE NACIMIENTO", "TIPO DE DOCUMENTO", "NUMERO DE DOCUMENTO", "CODIGO", "CARRERA", "EMAIL", "CONTRASEÑA"}));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlt;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tStudent;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}
