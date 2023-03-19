package Vista;

import Modelo.clsStudent;
import Modelo.clsPerson;
import Modelo.clsTeacher;
import javax.swing.JOptionPane;
import Conexion.*;
import java.util.ArrayList;

public class AddNew extends javax.swing.JFrame {
    
    int LogIn=1;
    int LogOut=0;
    SimcaDAO TPersona;
    String Tipo="Estudiante";
    String Grado;
    private  ArrayList<clsPerson> P;
    
    public AddNew() {
        initComponents();
        TPersona = new SimcaDAO();
        jLabel16.setVisible(false);
        jComboBox.setVisible(false);
        jComboBox.addItem("Pregrado");
        jComboBox.addItem("Especialista");
        jComboBox.addItem("Maestria");
        jComboBox.addItem("Doctorado");
        
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cAnio = new javax.swing.JComboBox<>();
        cMes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        cDia = new javax.swing.JComboBox<>();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCedula2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        RTipoE = new javax.swing.JRadioButton();
        RTipoD = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        cAnio1 = new javax.swing.JComboBox<>();
        btnLogIn = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonNotas = new javax.swing.JButton();
        jButtonPensum = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        btnMatricular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonVer3 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(0, 0, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel12.setPreferredSize(new java.awt.Dimension(735, 715));

        txtApellido.setBackground(new java.awt.Color(0, 51, 102));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FECHA DE NACIMIENTO:");

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DIA");

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MES");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE:");

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("AÑO");

        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        cAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnioActionPerformed(evt);
            }
        });

        cMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMesActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("APELLIDO:");

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CÉDULA:");

        txtApellido1.setBorder(null);
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("NIVEL ACADEMICO ALCANZADO:");

        txtCedula.setBorder(null);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        cDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel18.setFont(new java.awt.Font("Playbill", 0, 60)); // NOI18N
        jLabel18.setForeground(java.awt.Color.red);
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("REGISTRO ADMINISTRATIVO");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("INSTITUCIÓN Y/O UNIVERSIDAD DE GRADO:");

        txtCedula2.setBorder(null);
        txtCedula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedula2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("SELECCIONE UN ROL:");

        RTipoE.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(RTipoE);
        RTipoE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RTipoE.setForeground(new java.awt.Color(255, 255, 255));
        RTipoE.setSelected(true);
        RTipoE.setText("------------ESTUDIANTE");
        RTipoE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RTipoEMouseClicked(evt);
            }
        });
        RTipoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTipoEActionPerformed(evt);
            }
        });

        RTipoD.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(RTipoD);
        RTipoD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RTipoD.setForeground(new java.awt.Color(255, 255, 255));
        RTipoD.setText("----------------DOCENTE");
        RTipoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RTipoDMouseClicked(evt);
            }
        });
        RTipoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTipoDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RTipoD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RTipoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RTipoE))
                .addGap(18, 18, 18)
                .addComponent(RTipoD)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GENERO:");

        cAnio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        cAnio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtApellidoLayout = new javax.swing.GroupLayout(txtApellido);
        txtApellido.setLayout(txtApellidoLayout);
        txtApellidoLayout.setHorizontalGroup(
            txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtApellidoLayout.createSequentialGroup()
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtApellidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(txtApellidoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtApellidoLayout.createSequentialGroup()
                                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(txtApellidoLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(txtApellidoLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cDia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(txtApellidoLayout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                            .addComponent(cAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(txtApellidoLayout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cMes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(txtApellidoLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(txtApellidoLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        txtApellidoLayout.setVerticalGroup(
            txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtApellidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLogIn.setBackground(new java.awt.Color(32, 164, 180));
        btnLogIn.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("INICIO DE SESIÓN");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        jButtonAgregar.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 153, 0));
        jButtonAgregar.setText("REGISTRO ADMINISTRATIVO");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonCrear.setBackground(new java.awt.Color(32, 164, 180));
        jButtonCrear.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrear.setText("REGISTRO MATERIA/CURSO");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jButtonNotas.setBackground(new java.awt.Color(32, 164, 180));
        jButtonNotas.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonNotas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNotas.setText("CALIFICACION ACADEMICA");
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });

        jButtonPensum.setBackground(new java.awt.Color(32, 164, 180));
        jButtonPensum.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonPensum.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPensum.setText("CURRICULO/PENSUM");
        jButtonPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPensumActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(32, 164, 180));
        jButtonSalir.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("CERRAR PROGRAMA");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonVer.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer.setText("INFORME DOCENTE");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        btnMatricular.setBackground(new java.awt.Color(32, 164, 180));
        btnMatricular.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        btnMatricular.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricular.setText("MATRICULA ACADEMICA");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jButtonVer3.setBackground(new java.awt.Color(32, 164, 180));
        jButtonVer3.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        jButtonVer3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer3.setText("INFORME ESTUDIANTE");
        jButtonVer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPensum, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButtonVer, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVer3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogIn)
                        .addGap(24, 24, 24)
                        .addComponent(jButtonAgregar)
                        .addGap(24, 24, 24)
                        .addComponent(jButtonCrear)
                        .addGap(24, 24, 24)
                        .addComponent(btnMatricular)
                        .addGap(24, 24, 24)
                        .addComponent(jButtonPensum)
                        .addGap(24, 24, 24)
                        .addComponent(jButtonNotas)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonVer)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVer3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        // TODO add your handling code here:
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Boolean Rep = true;
      Grado = (String) jComboBox.getSelectedItem();
      try{
            
            P = TPersona.VerPersonas();
            int codigo = P.size();
            if(P.isEmpty()){
    
                    if(Tipo.equalsIgnoreCase("Estudiante")){
                       clsStudent Est = new clsStudent(this.txtNombre.getText(),this.txtApellido1.getText(),codigo,Integer.parseInt(this.txtCedula.getText()),Integer.parseInt(this.cDia.getSelectedItem().toString()),Integer.parseInt(this.cMes.getSelectedItem().toString()),Integer.parseInt(this.cAnio.getSelectedItem().toString())); 
                       TPersona.AgregarPersona(Est);
                       JOptionPane.showMessageDialog(this, "El estudiante ha sido registrado con éxito");
                    }
                    else{
                        clsTeacher Pro = new clsTeacher(Grado,this.txtNombre.getText(),this.txtApellido1.getText(),codigo,Integer.parseInt(this.txtCedula.getText()),Integer.parseInt(this.cDia.getSelectedItem().toString()),Integer.parseInt(this.cMes.getSelectedItem().toString()),Integer.parseInt(this.cAnio.getSelectedItem().toString())); 
                        TPersona.AgregarPersona(Pro);
                        JOptionPane.showMessageDialog(this, "El docente ha sido registrado con éxito");
                    }
                    
                
                
            }
            else{
                if(this.TPersona.BuscarPersonaCedula(Integer.parseInt(this.txtCedula.getText()))!= null){
                        Rep = false;
                }
                if(Rep){
                    
                        if(this.Tipo.equalsIgnoreCase("Estudiante")){
                           clsStudent Est = new clsStudent(this.txtNombre.getText(),this.txtApellido1.getText(),codigo,Integer.parseInt(this.txtCedula.getText()),Integer.parseInt(this.cDia.getSelectedItem().toString()),Integer.parseInt(this.cMes.getSelectedItem().toString()),Integer.parseInt(this.cAnio.getSelectedItem().toString())); 
                           TPersona.AgregarPersona(Est);
                           JOptionPane.showMessageDialog(this, "El estudiante ha sido registrado con éxito");
                        }
                        else if(this.Tipo.equalsIgnoreCase("Docente")){
                            clsTeacher Pro = new clsTeacher(Grado,this.txtNombre.getText(),this.txtApellido1.getText(),codigo,Integer.parseInt(this.txtCedula.getText()),Integer.parseInt(this.cDia.getSelectedItem().toString()),Integer.parseInt(this.cMes.getSelectedItem().toString()),Integer.parseInt(this.cAnio.getSelectedItem().toString())); 
                            TPersona.AgregarPersona(Pro);
                            JOptionPane.showMessageDialog(this, "El docente ha sido registrado con éxito");
                        }
                }
                else{
                    JOptionPane.showMessageDialog(this, "La persona ya está registrada en el sistema");
                }
            }           
      }
      catch(NumberFormatException Ex){
          JOptionPane.showMessageDialog(null, "Datos Incorrectos, Por favor verificar la información Ingresada");
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnioActionPerformed

    private void RTipoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTipoEActionPerformed
        jLabel16.setVisible(false);
        jComboBox.setVisible(false);
        Tipo = "Estudiante";
    }//GEN-LAST:event_RTipoEActionPerformed

    private void cMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMesActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void RTipoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTipoDActionPerformed
       jLabel16.setVisible(true);
        jComboBox.setVisible(true);
        Tipo = "Docente";
    }//GEN-LAST:event_RTipoDActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void RTipoEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RTipoEMouseClicked
        //Estudiante
    }//GEN-LAST:event_RTipoEMouseClicked

    private void RTipoDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RTipoDMouseClicked
        // Profesor
    }//GEN-LAST:event_RTipoDMouseClicked

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        Enroll M = new Enroll();
        M.setVisible(true);
        M.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMatricularActionPerformed

                                            

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed

        TeachersHistory Ver = new TeachersHistory();
        Ver.setVisible(true);
        Ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void txtCedula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedula2ActionPerformed

    private void cAnio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnio1ActionPerformed

    private void jButtonVer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer3ActionPerformed
        StudentsHistory V = new StudentsHistory();
        V.setVisible(true);
        V.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_jButtonVer3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNew().setVisible(true);
            }
        }); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton RTipoD;
    private javax.swing.JRadioButton RTipoE;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnMatricular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cAnio;
    private javax.swing.JComboBox<String> cAnio1;
    private javax.swing.JComboBox<String> cDia;
    private javax.swing.JComboBox<String> cMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonNotas;
    private javax.swing.JButton jButtonPensum;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JButton jButtonVer3;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedula2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
