package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTable;

import modelo.*;

import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.FlowLayout;

public class jPanelInforme extends JPanel {
	
	
	private javax.swing.JTable tablaCliente;
	private javax.swing.JScrollPane spCliente;
	private javax.swing.JTable tablaCuenta;
	private javax.swing.JScrollPane spCuenta;
	
	private clsBanco auxBanco;
	private JTextField txtCedulaCliente;


	
	public jPanelInforme(clsBanco objBanco) {
		this.auxBanco = objBanco;
		this.iniciarComponentes();
	}


	private void iniciarComponentes() {
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(204, 204, 204));
		add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblInforme = new JLabel("INFORME");
		lblInforme.setBackground(new Color(204, 204, 204));
		lblInforme.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInforme.setForeground(new Color(255, 255, 255));
		panelSuperior.add(lblInforme);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		add(panelCentral, BorderLayout.CENTER);
		/////////////////////////////////////
		
		//TABLAS:
		
		spCliente = new JScrollPane();
		tablaCliente = new JTable();
		spCliente.setViewportView(tablaCliente);
		
		tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
				
				new Object[auxBanco.getLstClientes().size()][7],
				new String[] {"Cedula","Nombre","Sexo","Fecha de Nacimiento","Dirección","Teléfono","Correo",}
				
				
				));
		spCuenta = new JScrollPane();
		tablaCuenta = new JTable();
		spCuenta.setViewportView(tablaCuenta);
		
		tablaCuenta.setModel(new javax.swing.table.DefaultTableModel(
				
				new Object[auxBanco.getLstCuentas().size()][7],
				new String[] {"Numero","Tipo","Fecha de Creación","Saldo"}
				
				));
		
		
		///////////////////////////////////////
		
		txtCedulaCliente = new JTextField();
		txtCedulaCliente.setColumns(10);
		
		JLabel lblCedulaDelUsuario = new JLabel("Cedula del Usuario:");
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBackground(SystemColor.activeCaptionBorder);
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimir_todo();
			}
		});
		
		
		
		
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(lblCedulaDelUsuario)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCedulaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnCargar)
							.addGap(22))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(spCliente, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(spCuenta, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCedulaDelUsuario)
						.addComponent(txtCedulaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCargar))
					.addGap(31)
					.addComponent(spCliente, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(spCuenta, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(153, Short.MAX_VALUE))
		);

		panelCentral.setLayout(gl_panelCentral);
	}
	
	//METODOS DE IMPRESION:
	
	public void imprimir_todo(){
		
		long cedula = Long.parseLong(this.txtCedulaCliente.getText());
		
		int posCliente = this.buscar_Cliente(cedula);
		
		if(posCliente>-1){
		
			this.imprimir_Cliente(posCliente);
			this.imprimir_Cuentas(posCliente);
			
		}
		
		
		
		
	}
	
	
	public int buscar_Cliente(long cedula){
		
		int pos=-1;
		
		for(int i=0;i<this.auxBanco.getLstClientes().size();i++){
			
			if(cedula == this.auxBanco.getLstClientes().get(i).getCedula()){
					
				pos=i;
				
				break;
			}
		}
			
		return pos;
	}
	
	
	public void imprimir_Cliente(int pos){
		
		Object matriz [][] = new Object[1][7];
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String fechaNacimiento;
			
		
			matriz[0][0]=auxBanco.getLstClientes().get(pos).getCedula();
			matriz[0][1]=auxBanco.getLstClientes().get(pos).getNombre();
			matriz[0][2]=auxBanco.getLstClientes().get(pos).getSexo();
			matriz[0][3]=formato.format(auxBanco.getLstClientes().get(pos).getFechaNacimiento().getTime());
			matriz[0][4]=auxBanco.getLstClientes().get(pos).getDireccion();
			matriz[0][5]=auxBanco.getLstClientes().get(pos).getTelefono();
			matriz[0][6]=auxBanco.getLstClientes().get(pos).getCorreo();
			
		
			tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
				
				matriz,
				new String[] {"Cedula","Nombre","Sexo","Fecha de Nacimiento","Direccion","Telefono","Correo",}
				
				
				));
		
	}
		public void imprimir_Cuentas(int pos){
		
		ArrayList<clsCuenta> lstAuxCuenta = auxBanco.getLstClientes().get(pos).getLstCuenta();

		Object matriz [][] = new Object[lstAuxCuenta.size()][4];
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		
		for(int i=0;i<lstAuxCuenta.size();i++){
			
			matriz[i][0]=lstAuxCuenta.get(i).getNumero();
			matriz[i][1]=lstAuxCuenta.get(i).getTipo();
			matriz[i][2]=formato.format(lstAuxCuenta.get(i).getFechaCreacion().getTime());;
			matriz[i][3]=lstAuxCuenta.get(i).getSaldo();
			
		}
			tablaCuenta.setModel(new javax.swing.table.DefaultTableModel(
				
				matriz,
				new String[] {"Numero","Tipo","Fecha de Creacion","Saldo"}
				
				
				));
		
	}
	
	

}//FIN DE CLASE
