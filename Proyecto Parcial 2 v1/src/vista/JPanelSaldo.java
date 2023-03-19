package vista;

import javax.swing.JPanel;

import modelo.clsBanco;
import modelo.clsCuenta;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class JPanelSaldo extends JPanel {

	private clsBanco auxBanco;
	private JTextField txtCedula;
	private JTable tCliente;
	public JPanelSaldo(clsBanco objBanco) {
		 this.auxBanco = objBanco;
		 this.iniciarComponentes();
	}

	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));
		 
		 JPanel panel = new JPanel();
		 panel.setBackground(new Color(204, 204, 255));
		 add(panel, BorderLayout.NORTH);
		 
		 JLabel lblConsultaSaldoDeCliente = new JLabel("CONSULTA SALDO DE CLIENTE");
		 panel.add(lblConsultaSaldoDeCliente);
		 
		 JPanel panel_1 = new JPanel();
		 add(panel_1, BorderLayout.CENTER);
		 panel_1.setLayout(null);
		 
		 JLabel lblDigiteCedula = new JLabel("DIGITE CEDULA:");
		 lblDigiteCedula.setBounds(43, 35, 98, 14);
		 panel_1.add(lblDigiteCedula);
		 
		 txtCedula = new JTextField();
		 txtCedula.setBounds(151, 32, 126, 20);
		 panel_1.add(txtCedula);
		 txtCedula.setColumns(10);
		 
		 JButton btnBuscar = new JButton("BUSCAR");
		 btnBuscar.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		imprimir();
		 	}
		 });
		 btnBuscar.setBackground(new Color(204, 204, 255));
		 btnBuscar.setBounds(311, 31, 89, 23);
		 panel_1.add(btnBuscar);
		 
		 JScrollPane spCliente = new JScrollPane();
		 spCliente.setBounds(43, 102, 514, 48);
		 panel_1.add(spCliente);
		 
		 tCliente = new JTable();
		 tCliente.setModel(new DefaultTableModel(
		 	new Object[][] {
		 		{null, null, null, null},
		 	},
		 	new String[] {
		 		"Cedula", "Nombre", "N\u00FAmero de cuentas", "Saldo total"
		 	}
		 ));
		 spCliente.setViewportView(tCliente);
	}
	
	public void imprimir(){
		
		int cedula = Integer.parseInt(this.txtCedula.getText());
		int posCliente = this.buscarCliente(cedula);
		if(posCliente>-1){
			this.cargarTablaCuenta(posCliente);
			limpiarCampo();
		}
	}
	
	public void limpiarCampo(){
		this.txtCedula.setText("");
	}
	
	public int buscarCliente(long cedula){
			int pos = -1;
			for(int i=0; i<this.auxBanco.getLstCliente().size();i++){
				if (cedula == this.auxBanco.getLstCliente().get(i).getCedula()){
					pos = i;
					break;
				}
			}
			return pos;
		}
		
	public void cargarTablaCuenta(int posCliente){
			
			Object matriz [][] = new Object [1][4];
		
			matriz [0][0] = auxBanco.getLstCliente().get(posCliente).getCedula();	
			matriz [0][1] = auxBanco.getLstCliente().get(posCliente).getNombre();
			matriz [0][2] = numCuentas(posCliente);
			matriz [0][3] = saldoTotal(posCliente);
			
			tCliente.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"CEDULA","NOMBRE","NUMERO DE CUENTAS","SALDO TOTAL"}));
	}
	public int numCuentas(int posCliente){
		ArrayList<clsCuenta> lstAuxCuenta = auxBanco.getLstCliente().get(posCliente).getLstCuentas();
		int acum = 0;
		for(int i=0; i < lstAuxCuenta.size(); i++){
			acum++;
		}
		return acum;
	}
	public double saldoTotal(int posCliente){
		ArrayList<clsCuenta> lstAuxCuenta = auxBanco.getLstCliente().get(posCliente).getLstCuentas();
		double acum = 0;
		for(int i=0; i < lstAuxCuenta.size(); i++){
			acum = acum + lstAuxCuenta.get(i).getSaldo();
		}
		return acum;
	}
}
