package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.clsBanco;
import modelo.clsCliente;
import modelo.clsCuenta;
import modelo.iBuscar;
import modelo.iGestion;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class JPanelInforme extends JPanel  implements iGestion, iBuscar{
	private JTable tCliente;
	private JScrollPane spCliente;
	private JTable tCuenta;
	private JScrollPane spCuenta;
	private JTextField txtCedula;
	private clsBanco auxBanco;

	
	public JPanelInforme(clsBanco objBanco){
		
		this.auxBanco = objBanco;
		
		this.iniciarComponentes();
		
	}
	
	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));
		
		//SCROLLPANE CLIENTE
		spCliente = new JScrollPane();
		tCliente = new JTable();
		tCliente.setModel(new DefaultTableModel(new Object[][] {
				}, 
				new String[] {
				"NOMBRE", "CEDULA", "SEXO", "NACIMIENTO", "DIRECCION", "TELEFONO", "CORREO"}));
		spCliente.setViewportView(tCliente);
		
		//SCROLLPANE CUENTA
		spCuenta = new JScrollPane();
		tCuenta = new JTable();
		tCuenta.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {"NUMERO", "TIPO", "CREACION", "SALDO"}));
		spCuenta.setViewportView(tCuenta);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(204, 204, 255));
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblInformeDeDatos = new JLabel("INFORME DE DATOS");
		panelSuperior.add(lblInformeDeDatos);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		
		
		JLabel lblDigiteCedula = new JLabel("DIGITE CEDULA:");
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBackground(new Color(204, 204, 255));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimir();
			}
		});
		
		
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(lblDigiteCedula, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addComponent(spCliente, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
						.addComponent(spCuenta))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDigiteCedula)
						.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addGap(18)
					.addComponent(spCliente, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(spCuenta, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		
		
		
		panelCentral.setLayout(gl_panelCentral);
		
	}
	
	public void imprimir(){
			
			int cedula = Integer.parseInt(this.txtCedula.getText());
			int posCliente = this.buscarPersona(cedula);
			if(posCliente>-1){
				this.cargarTablaCliente(posCliente);
				this.cargarTablaCuenta(posCliente);
				limpiarCampos();
			}
		}
		
	public void limpiarCampos(){
		this.txtCedula.setText("");
	}
	
	public int buscarPersona(long cedula){
			int pos = -1;
			for(int i=0; i<this.auxBanco.getLstCliente().size();i++){
				if (cedula == this.auxBanco.getLstCliente().get(i).getCedula()){
					pos = i;
					break;
				}
			}
			return pos;
		}
		
	public void cargarTablaCliente(int posCliente){
			
			Object matriz [][] = new Object [1][7];
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			String fechaNacimiento;
			
			matriz [0][0] = auxBanco.getLstCliente().get(posCliente).getNombre();
			matriz [0][1] = auxBanco.getLstCliente().get(posCliente).getCedula();
			matriz [0][2] = auxBanco.getLstCliente().get(posCliente).getSexo();
			
			fechaNacimiento = formato.format(auxBanco.getLstCliente().get(0).getFechaNacimiento().getTime());
			matriz [0][3] = fechaNacimiento;
			
			matriz [0][4] = auxBanco.getLstCliente().get(posCliente).getDireccion();
			matriz [0][5] = auxBanco.getLstCliente().get(posCliente).getTelefono();
			matriz [0][6] = auxBanco.getLstCliente().get(posCliente).getCorreo();
			
			tCliente.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"NOMBRE","CEDULA","SEXO","NACIMIENTO","DIRECCION","TELEFONO","CORREO"}));
	}
	
	public void cargarTablaCuenta(int posCliente){
		ArrayList<clsCuenta> lstAuxCuenta = auxBanco.getLstCliente().get(posCliente).getLstCuentas();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String fechaCreacion;
		
		Object matriz [][] = new Object[lstAuxCuenta.size()][4];
		
		for (int i=0; i < lstAuxCuenta.size(); i++){
			matriz[i][0] = lstAuxCuenta.get(i).getNumero();
			matriz[i][1] = lstAuxCuenta.get(i).getTipo();
			
			fechaCreacion = formato.format(lstAuxCuenta.get(i).getFechaCreacion().getTime());
			matriz [i][2] = fechaCreacion;
			
			matriz[i][3] = String.format("%.0f", lstAuxCuenta.get(i).getSaldo());
		}
		tCuenta.setModel(new javax.swing.table.DefaultTableModel(
				matriz,
				new String[]{"NUMERO","TIPO","CREACION","SALDO"}));
		
	}
}//FIN DE CLASE
