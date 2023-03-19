package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import modelo.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
public class JPanelInforme extends JPanel {
	private JTable table;
	private JTable tableCliente;
	private clsBanco auxObjBanco;
	private JTextField txtCedulaCliente;
	private JTextField txtCedulaEmpleado;
	private JTable table_ClienteInfo;
	private JTable tableEmpleado;
	
	public JPanelInforme(clsBanco auxObjBanco) {
		this.auxObjBanco = auxObjBanco;
		this.iniciarComponentes();
}
    public void iniciarComponentes() {
    	//Cliente
		JScrollPane scrollPaneCliente = new JScrollPane();
		tableCliente = new JTable();
		tableCliente.setModel(new DefaultTableModel(
				new Object[this.auxObjBanco.getLstClientes().size() ] [7],
		        new String  [] {"Cedula","Nombre","Sexo","FechaNacimiento","Direccion","Telefono","Correo"}
				));
		
		scrollPaneCliente.setViewportView(tableCliente);
		
		//Cuenta
		JScrollPane scrollPaneCuenta= new JScrollPane();
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[this.auxObjBanco.getLstCuentas().size() ] [4],
		        new String  [] {"Numero","Tipo","FechaCreacion","Saldo"}
				));
		
		scrollPaneCuenta.setViewportView(table);
		
		//ClienteInfo
		JScrollPane scrollPaneInfoCliente = new JScrollPane();
		table_ClienteInfo = new JTable();
		table_ClienteInfo.setModel(new DefaultTableModel(
				new Object[1] [2],
				new String [] {"Nombre","Saldo"}
				));
		scrollPaneInfoCliente.setViewportView(table_ClienteInfo);
		
		//Empleado
		JScrollPane scrollPaneinfoEmpleado = new JScrollPane();
		tableEmpleado = new JTable();
		tableEmpleado.setModel(new DefaultTableModel(
				new Object[1] [2],
				new String [] {"Nombre","Sueldo"}
				));
		scrollPaneinfoEmpleado.setViewportView(tableEmpleado);

		JLabel lblInforme = new JLabel("INFORME");
		
		JButton btnCargarInformacion = new JButton("CARGAR INFORMACION");
		btnCargarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CargarInformacion ();
			}  
		});
		
		JLabel lblIngresarCedula = new JLabel("INGRESAR CEDULA CLIENTE");
		
		txtCedulaCliente = new JTextField();
		txtCedulaCliente.setColumns(10);
		
		JLabel lblIngresarCedulaEmpleado = new JLabel("INGRESAR CEDULA EMPLEADO");
		
		txtCedulaEmpleado = new JTextField();
		txtCedulaEmpleado.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Saldo Cuenta Cliente");
		
		JLabel lblNewLabel_1 = new JLabel("Sueldo Empleado");
		
		JButton btnBuscarDatosEmpleado = new JButton("BUSCAR DATOS EMPLEADO");
		btnBuscarDatosEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CargarEmpleado();
			}
		});
		btnCargarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}  
		});
	
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPaneCuenta, 0, 0, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblIngresarCedulaEmpleado)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblInforme)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblIngresarCedula)
												.addGap(96))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCedulaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtCedulaEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(55)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnCargarInformacion)
										.addComponent(btnBuscarDatosEmpleado)))
								.addComponent(scrollPaneCliente, GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(70)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPaneinfoEmpleado, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
								.addComponent(scrollPaneInfoCliente, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))))
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInforme)
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIngresarCedula)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCargarInformacion)
							.addComponent(txtCedulaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIngresarCedulaEmpleado)
						.addComponent(txtCedulaEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscarDatosEmpleado))
					.addGap(33)
					.addComponent(scrollPaneCliente, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPaneCuenta, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPaneInfoCliente, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPaneinfoEmpleado, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
					.addContainerGap())
		);
	
		setLayout(groupLayout);

	}
   
    public void CargarInformacion () { 
    	int cedula = Integer.parseInt(this.txtCedulaCliente.getText());
    	int posicion = this.buscarCedulaCliente(cedula);
    	if (posicion>-1){
    		this.CargarInfoCliente(posicion);
    		this.CargarInfoCuenta(posicion);
    	}
    	else {
    		//Mensaje de error
    		JOptionPane.showMessageDialog(this,
					"El cliente no fue encontrado",
					"Validación",
					JOptionPane.ERROR_MESSAGE);
    	}
    	int posicion2 = this.buscarCedulaEmpleado(cedula);
    	//if (posicion2>-1){
    		
    	//}
    }//cargarinfo
    
    public int buscarCedulaCliente(int cedula){
    	int posicion = -1;
    	for(int i=0;i<this.auxObjBanco.getLstClientes().size();i++){
    		if(cedula == this.auxObjBanco.getLstClientes().get(i).getCedula()){
    			posicion = i;
    			break;
    		}
    	}
    	return posicion;
    }
    
    public void CargarInfoCliente (int puntoCliente) { 
    	
    	
    	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy" ); 
           String FechaNacimiento;
           Object matriz [] [] = new Object[ 1] [7];
    	   matriz [0][0]= this.auxObjBanco.getLstClientes().get(puntoCliente).getCedula();
    	   matriz [0][1]= this.auxObjBanco.getLstClientes().get(puntoCliente).getNombre();
    	   matriz [0][2]= this.auxObjBanco.getLstClientes().get(puntoCliente).getSexo();
    	   FechaNacimiento = formato.format(
    			   this.auxObjBanco.getLstClientes().get(0).
    			   getFechaNacimiento().getTime());
    	   matriz [0][3]= FechaNacimiento;
    	   matriz [0][4]= this.auxObjBanco.getLstClientes().get(puntoCliente).getDireccion();
    	   matriz [0][5]= this.auxObjBanco.getLstClientes().get(puntoCliente).getTelefono();
    	   matriz [0][6]= this.auxObjBanco.getLstClientes().get(puntoCliente).getCorreo();
    	   
    	tableCliente.setModel(new DefaultTableModel(
			matriz,
		        new String  [] {"Cedula","Nombre","Sexo","FechaNacimiento","Direccion","Telefono","Correo"}
				));
}
 public void CargarInfoCuenta (int puntoC) { 
	 
	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy" ); 
	 String FechaCreacion;
	
	 Object matriz [] [] = new Object[this.auxObjBanco.getLstCuentas().size()] [4];
 	for(int i=0; i<this.auxObjBanco.getLstCuentas().size(); i++) {
 	   matriz [i][0]= this.auxObjBanco.getLstCuentas().get(i).getNumero();
 	   matriz [i][1]= this.auxObjBanco.getLstCuentas().get(i).getTipo();
 	   FechaCreacion = formato.format(
 			   this.auxObjBanco.getLstCuentas().get(i).getFechaCreacion().getTime());
 	   matriz [i][2]= FechaCreacion;
 	   matriz [i][3]=this.auxObjBanco.getLstCuentas().get(i).getSaldo();
 	}
 	table.setModel(new DefaultTableModel(
			matriz,
		        new String  [] {"Numero","Tipo","FechaCreacion","Saldo"}
				));
 	
 } 
	 //BUSCAR CEDULA EMPLEADO
	 public int buscarCedulaEmpleado(int cedulaE){
	    	int posicion2 = -1;
	    	for(int i=0;i<this.auxObjBanco.getLstEmpleado().size();i++){
	    		if(cedulaE== this.auxObjBanco.getLstEmpleado().get(i).getCedula()){
	    			posicion2 = i;
	    			break;
	    		}
	    	}
	    	return posicion2;
	 }

	 public void MostrarInfoEmpleado (int posicionEmpleado){
		 Object matriz [][] = new Object [1][2];
		 matriz [0][0] = this.auxObjBanco.getLstEmpleado().get(posicionEmpleado).getNombre();
		 matriz [0][1] = this.auxObjBanco.getLstEmpleado().get(posicionEmpleado).getSueldo();
		 tableEmpleado.setModel(new DefaultTableModel(
					matriz,
					new String [] {"Nombre","Sueldo"}
					));
	 }
	 public void CargarEmpleado (){
		 int cedulaE = Integer.parseInt(this.txtCedulaEmpleado.getText());
		 int posicionE = this.buscarCedulaEmpleado(cedulaE);
		 if (posicionE>-1){
	    		this.MostrarInfoEmpleado(posicionE);
	    	}
	 }
}// fin de clase