package Vista;

import Modelo.clsTeacher;
import Conexion.SimcaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TeachersHistory extends javax.swing.JFrame {
    SimcaDAO Pers;
    DefaultTableModel TDoc;
    int SizeD;

    public TeachersHistory() {
        initComponents();
        initComponents();
        Pers= new SimcaDAO();
        TDoc = new DefaultTableModel();
        this.TDocente.setModel(this.TDoc);
        int Size = 0;
        if(!this.Pers.VerPersonas().isEmpty()){
            for(int i=0;i<this.Pers.VerPersonas().size() ;i++){
                if(this.Pers.VerPersonas().get(i) instanceof clsTeacher){
                   Size++;
                }
            }
        }
        this.SizeD = Size;
        this.LDocente.setText(""+SizeD);
        AddColumnas();
    }
    
    public void AddColumnas(){       
        TDoc.addColumn("Nombre");
        TDoc.addColumn("Apellido");
        TDoc.addColumn("Cedula");
        TDoc.addColumn("Codigo");
        TDoc.addColumn("Dia_Nacimiento");
        TDoc.addColumn("Mes_Nacimiento");
        TDoc.addColumn("Anio_Nacimiento");
    }
    
    public void LimpiarTabla(){
        int Filas_1 = TDocente.getRowCount();
        for(int i = Filas_1-1;i>=0;i--){
            TDoc.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BVer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDocente = new javax.swing.JTable();
        bVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LDocente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(949, 469));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BVer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BVer.setForeground(new java.awt.Color(255, 153, 0));
        BVer.setText("IMPRIMIR");
        BVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerActionPerformed(evt);
            }
        });
        jPanel1.add(BVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 430, -1, -1));

        TDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Codigo", "Dia_Nacimiento", "Mes_Nacimiento", "Anio_Nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TDocente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, 934, 341));

        bVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bVolver.setForeground(new java.awt.Color(31, 118, 138));
        bVolver.setText("VOLVER");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        jPanel1.add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 430, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("DOCENTES REGISTRADOS EN EL SISTEMA");

        LDocente.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(LDocente))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 934, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerActionPerformed
    LimpiarTabla();
        if(!this.Pers.VerPersonas().isEmpty()){
           for(int i=0;i<this.Pers.VerPersonas().size();i++){
                if(this.Pers.VerPersonas().get(i) instanceof clsTeacher){
                    clsTeacher DC = (clsTeacher) this.Pers.VerPersonas().get(i);
                    String[] Datos = new String[7];
                    Datos[0]=DC.getNombre();
                    Datos[1]=DC.getApellido();
                    Datos[2]=Integer.toString(DC.getCedula());
                    Datos[3]=Integer.toString(DC.getCodigo());
                    Datos[4]=Integer.toString(DC.getDia());
                    Datos[5]=Integer.toString(DC.getMes());
                    Datos[6]=Integer.toString(DC.getAnios());
                    TDoc.addRow(Datos);
                }
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados en el sistema"); 
        }
    }//GEN-LAST:event_BVerActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachersHistory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVer;
    private javax.swing.JLabel LDocente;
    private javax.swing.JTable TDocente;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
