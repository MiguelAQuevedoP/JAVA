package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
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
	
	public JPanelInforme(clsBanco auxObjBanco) {
		this.auxObjBanco = auxObjBanco;
		this.iniciarComponentes();
}
    public void iniciarComponentes() {
		JScrollPane scrollPaneCliente = new JScrollPane();
		tableCliente = new JTable();
		tableCliente.setModel(new DefaultTableModel(
				new Object[this.auxObjBanco.getLstClientes().size() ] [7],
		        new String  [] {"Cedula","Nombre","Sexo","FechaNacimiento","Direccion","Telefono","Correo"}
				));
		
		scrollPaneCliente.setViewportView(tableCliente);
		
		JScrollPane scrollPaneCuenta= new JScrollPane();
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[this.auxObjBanco.getLstCuentas().size() ] [4],
		        new String  [] {"Numero","Tipo","FechaCreacion","Saldo"}
				));
		
		scrollPaneCuenta.setViewportView(table);

		JLabel lblInforme = new JLabel("INFORME");
		
		JButton btnCargarInformacion = new JButton("CARGAR INFORMACION");
		btnCargarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CargarInformacion ();
			}  
		});
		
		JLabel lblIngresarCedula = new JLabel("INGRESAR CEDULA");
		
		txtCedulaCliente = new JTextField();
		txtCedulaCliente.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(191)
							.addComponent(lblInforme))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(138)
							.addComponent(btnCargarInformacion))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(108)
							.addComponent(lblIngresarCedula)
							.addGap(52)
							.addComponent(txtCedulaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(scrollPaneCuenta, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(scrollPaneCliente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInforme)
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIngresarCedula)
						.addComponent(txtCedulaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addComponent(btnCargarInformacion)
					.addGap(27)
					.addComponent(scrollPaneCliente, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPaneCuenta, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		setLayout(groupLayout);

	}
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
    
    public void CargarInformacion () { 
    	int cedula = Integer.parseInt(this.txtCedulaCliente.getText());
    	int posicion = this.buscarCedulaCliente(cedula);
    	if (posicion>-1){
    		this.CargarInfoCliente(posicion);
    		this.CargarInfoCuenta(posicion);
    	}
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
    
}// fin de clase