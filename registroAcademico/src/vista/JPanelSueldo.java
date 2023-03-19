package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.clsBanco;
import modelo.clsCuenta;
import modelo.iBuscar;
import modelo.iGestion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelSueldo extends JPanel implements iGestion, iBuscar {
	private JTextField txtCedula;
	private JTable tSueldo;
	private clsBanco auxBanco;
	
	public JPanelSueldo(clsBanco objBanco) {
		
		this.auxBanco = objBanco;
		iniciarComponentes();
		
	}
	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(204, 204, 255));
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblConsultarSueldoDe = new JLabel("CONSULTAR SUELDO DE EMPLEADO");
		panelSuperior.add(lblConsultarSueldoDe);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel lblDigiteCedula = new JLabel("DIGITE CEDULA:");
		lblDigiteCedula.setBounds(47, 37, 103, 14);
		panelCentral.add(lblDigiteCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(160, 34, 100, 20);
		panelCentral.add(txtCedula);
		txtCedula.setColumns(10);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimir();
			}
		});
		btnConsultar.setBackground(new Color(204, 204, 255));
		btnConsultar.setBounds(300, 33, 125, 23);
		panelCentral.add(btnConsultar);
		
		JScrollPane spSueldo = new JScrollPane();
		spSueldo.setBounds(47, 106, 378, 45);
		panelCentral.add(spSueldo);
		
		tSueldo = new JTable();
		tSueldo.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Cedula", "Nombre", "Sueldo"
			}
		));
		spSueldo.setViewportView(tSueldo);
	}
	public void imprimir(){
		
		int cedula = Integer.parseInt(this.txtCedula.getText());
		int posEmple = this.buscarPersona(cedula);
		if(posEmple>-1){
			this.cargarTablaSueldo(posEmple);
			limpiarCampos();
		}
	}
	
	public void limpiarCampos(){
		this.txtCedula.setText("");
	}
	
	public int buscarPersona(long cedula){
			int pos = -1;
			for(int i=0; i<this.auxBanco.getLstEmpleado().size();i++){
				if (cedula == this.auxBanco.getLstEmpleado().get(i).getCedula()){
					pos = i;
					break;
				}
			}
			return pos;
		}
		
	public void cargarTablaSueldo(int posEmple){
			
			Object matriz [][] = new Object [1][4];
		
			matriz [0][0] = auxBanco.getLstEmpleado().get(posEmple).getCedula();	
			matriz [0][1] = auxBanco.getLstEmpleado().get(posEmple).getNombre();
			matriz [0][2] = String.format("%.0f",sueldoTotal(posEmple));
			
			tSueldo.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"CEDULA","NOMBRE","SUELDO + 5%"}));
	}
	
	public double sueldoTotal(int posEmple){
		double sueldo = auxBanco.getLstEmpleado().get(posEmple).getSueldo();
		double sueldoT = 0;
		sueldoT = sueldo + porcentaje(posEmple);
		return sueldoT;
	}
	
	public double porcentaje(int posEmple){
		double porcentaje = 0;
		porcentaje = (5*auxBanco.getLstEmpleado().get(posEmple).getSueldo())/100;
		return porcentaje;
	}
}
