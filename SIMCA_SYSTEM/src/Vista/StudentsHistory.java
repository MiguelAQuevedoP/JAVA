package Vista;

import Modelo.clsStudent;
import Conexion.SimcaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentsHistory extends javax.swing.JFrame {
    SimcaDAO Pers;
    DefaultTableModel TEst;
    int SizeE;
    public StudentsHistory() {
        initComponents();
        Pers= new SimcaDAO();
        TEst = new DefaultTableModel();
        this.TEstudiante.setModel(this.TEst);
        int Size = 0;
        if(!this.Pers.VerPersonas().isEmpty()){
            for(int i=0;i<this.Pers.VerPersonas().size() ;i++){
                if(this.Pers.VerPersonas().get(i) instanceof clsStudent){
                   Size++;
                }
            }
        }
        this.SizeE = Size;
        this.LEstudiante.setText(""+SizeE);
        AddColumnas();      
    }

    public void AddColumnas(){      
        TEst.addColumn("Nombre");
        TEst.addColumn("Apellido");
        TEst.addColumn("Cedula");
        TEst.addColumn("Codigo");
        TEst.addColumn("Dia_Nacimiento");
        TEst.addColumn("Mes_Nacimiento");
        TEst.addColumn("Anio_Nacimiento");
    }
    
    public void LimpiarTabla(){
        int Filas_1 = TEstudiante.getRowCount();
        for(int i = Filas_1-1;i>=0;i--){
            TEst.removeRow(i);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEstudiante = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BVer = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        LEstudiante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
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
        jScrollPane1.setViewportView(TEstudiante);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 74, 931, 341));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("ESTUDIANTES REGISTRADOS EN EL SISTEMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 931, -1));

        BVer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BVer.setForeground(new java.awt.Color(255, 153, 0));
        BVer.setText("IMPRIMIR");
        BVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerActionPerformed(evt);
            }
        });
        jPanel2.add(BVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 427, -1, -1));

        bVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bVolver.setForeground(new java.awt.Color(31, 118, 138));
        bVolver.setText("VOLVER");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        jPanel2.add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 427, -1, -1));

        LEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(LEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 100, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerActionPerformed
                               
        LimpiarTabla();
        if(!this.Pers.VerPersonas().isEmpty()){
           for(int i=0;i<this.Pers.VerPersonas().size();i++){
                if(this.Pers.VerPersonas().get(i) instanceof clsStudent){
                    clsStudent EC = (clsStudent) this.Pers.VerPersonas().get(i);
                    String[] Datos = new String[7];
                    Datos[0]=EC.getNombre();
                    Datos[1]=EC.getApellido();
                    Datos[2]=Integer.toString(EC.getCedula());
                    Datos[3]=Integer.toString(EC.getCodigo());
                    Datos[4]=Integer.toString(EC.getDia());
                    Datos[5]=Integer.toString(EC.getMes());
                    Datos[6]=Integer.toString(EC.getAnios());
                    TEst.addRow(Datos);
                }
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay Estudiantes registrados en el sistema"); 
        }  
    }//GEN-LAST:event_BVerActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsHistory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVer;
    private javax.swing.JLabel LEstudiante;
    private javax.swing.JTable TEstudiante;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
