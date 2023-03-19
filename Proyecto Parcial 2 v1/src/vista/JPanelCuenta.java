package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

import modelo.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelCuenta extends JPanel {
	private JTextField txtNumCuenta;
	private JTextField txtTipoCuenta;
	private JTextField txtSaldoCuenta;
	private JDateChooser cdCreacion;
	private clsBanco auxBanco;
	private JTextField txtCedula;

	/**
	 * Create the panel.
	 */

	public JPanelCuenta(clsBanco objBanco){
		
		this.auxBanco = objBanco;
		
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes(){
		
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 704, 24);
		panel.setBackground(new Color(204, 204, 255));
		add(panel);
		
		JLabel lblFormularioCuenta = new JLabel("FORMULARIO CUENTA");
		panel.add(lblFormularioCuenta);
		
		JLabel lblNumero = new JLabel("NUMERO:");
		lblNumero.setBounds(53, 53, 89, 14);
		add(lblNumero);
		
		JLabel lblTipo = new JLabel("TIPO:");
		lblTipo.setBounds(53, 78, 89, 14);
		add(lblTipo);
		
		JLabel lblFechaDeCreacin = new JLabel("FECHA DE CREACI\u00D3N:");
		lblFechaDeCreacin.setBounds(53, 103, 135, 14);
		add(lblFechaDeCreacin);
		
		JLabel lblSaldo = new JLabel("SALDO:");
		lblSaldo.setBounds(53, 128, 89, 14);
		add(lblSaldo);
		
		txtNumCuenta = new JTextField();
		txtNumCuenta.setBounds(198, 50, 111, 20);
		add(txtNumCuenta);
		txtNumCuenta.setColumns(10);
		
		txtTipoCuenta = new JTextField();
		txtTipoCuenta.setBounds(198, 75, 111, 20);
		add(txtTipoCuenta);
		txtTipoCuenta.setColumns(10);
		
		txtSaldoCuenta = new JTextField();
		txtSaldoCuenta.setBounds(198, 125, 111, 20);
		add(txtSaldoCuenta);
		txtSaldoCuenta.setColumns(10);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearCuenta();
			}
		});
		btnAceptar.setBounds(220, 210, 89, 23);
		add(btnAceptar);
		
		cdCreacion = new JDateChooser();
		cdCreacion.setBounds(198, 97, 111, 20);
		add(cdCreacion);
		
		JLabel lblCedulaCliente = new JLabel("*CEDULA CLIENTE:");
		lblCedulaCliente.setForeground(Color.RED);
		lblCedulaCliente.setBounds(53, 153, 122, 14);
		add(lblCedulaCliente);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(198, 150, 111, 20);
		add(txtCedula);
		txtCedula.setColumns(10);
	}
	
	public int buscarCliente(long numero){
		int pos = -1;
		for(int i=0; i<this.auxBanco.getLstCliente().size(); i++){
			if(numero==this.auxBanco.getLstCliente().get(i).getCedula()){
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public int buscarCuenta(long numero){
		
		int posicion = -1;
		
		for(int i=0; i<this.auxBanco.getLstCuenta().size();i++){
			if(numero == this.auxBanco.getLstCuenta().get(i).getNumero()){
				posicion = i;
				break;
			}
		}
		
		return posicion;
	}	
	
	public void crearCuenta(){
		
		long numero = Long.parseLong(this.txtCedula.getText());
		int posCliente = this.buscarCliente(numero);
		if(posCliente>-1){
			
			long numeroC = (Long.parseLong(this.txtNumCuenta.getText()));
			String tipo = this.txtTipoCuenta.getText();
			Calendar fechaCreacion = (this.cdCreacion.getCalendar());
			double saldo = (Double.parseDouble(this.txtSaldoCuenta.getText()));
			
			//COMPOSICION
			
			this.auxBanco.agregarCuenta(numeroC, tipo, fechaCreacion, saldo);
			
			//ASOCIACION
			
			int posCuenta = this.buscarCuenta(numeroC);
			clsCuenta auxCuenta = this.auxBanco.getLstCuenta().get(posCuenta);
			clsCliente auxCliente = this.auxBanco.getLstCliente().get(posCliente);
			
			auxCuenta.setRefCliente(auxCliente);
			/*clsCuenta objCuenta = new clsCuenta();
			objCuenta.setNumero(Long.parseLong(this.txtNumCuenta.getText()));
			objCuenta.setTipo(this.txtTipoCuenta.getText());
			objCuenta.setFechaCreacion(this.cdCreacion.getCalendar());
			objCuenta.setSaldo(Double.parseDouble(this.txtSaldoCuenta.getText()));
			this.objBanco.getLstCuenta().add(objCuenta);
			auxCliente = this.objBanco.getLstCliente().get(posCliente);
			auxCliente.agregarCuenta(objCuenta);*/
			auxCliente.getLstCuentas().add(auxCuenta);
			JOptionPane.showMessageDialog(this, "Cuenta creada con éxito",
					"",
					JOptionPane.INFORMATION_MESSAGE);
			limpiarCampos();
		}
		else{
			JOptionPane.showMessageDialog(this, "¡Cliente no encontrado!",
					"Validación",
					JOptionPane.ERROR_MESSAGE);
			this.txtCedula.setText("");
		}
	}
	
	public void limpiarCampos(){
		this.txtNumCuenta.setText("");
		this.txtTipoCuenta.setText("");
		this.cdCreacion.setCalendar(null);
		this.txtSaldoCuenta.setText("");
		this.txtCedula.setText("");
	}
	
	
}//fin de clase
