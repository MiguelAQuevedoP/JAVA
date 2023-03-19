package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import modelo.*;
import java.awt.Color;
import java.awt.Font;

public class jPanelCuenta extends JPanel {
	private JTextField txtNumeroCuenta;
	private JTextField txtTipo;
	private JDateChooser dcFechaCreacion;
	private clsBanco auxBanco;
	private JTextField txtCedulaCliente;
	private JTextField txtSaldo;
	/**
	 * Create the panel.
	 */
	
	public jPanelCuenta(clsBanco objBanco) {
		
		this.auxBanco = objBanco;
		this.iniciarComponetnes();
	}

	private void iniciarComponetnes() {
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(204, 204, 204));
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioCuenta = new JLabel("FORMULARIO CUENTA");
		lblFormularioCuenta.setBackground(new Color(204, 204, 204));
		lblFormularioCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFormularioCuenta.setForeground(new Color(255, 255, 255));
		panelSuperior.add(lblFormularioCuenta);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(255, 255, 255));
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(31, 38, 46, 14);
		panelCentral.add(lblNumero);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(41, 72, 46, 14);
		panelCentral.add(lblTipo);
		
		JLabel lblFechaDeCreacin = new JLabel("Fecha de Creaci\u00F3n:");
		lblFechaDeCreacin.setBounds(32, 97, 93, 14);
		panelCentral.add(lblFechaDeCreacin);
		
		txtNumeroCuenta = new JTextField();
		txtNumeroCuenta.setBounds(134, 35, 86, 20);
		panelCentral.add(txtNumeroCuenta);
		txtNumeroCuenta.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(134, 69, 86, 20);
		panelCentral.add(txtTipo);
		txtTipo.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(204, 204, 204));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crearCuenta();
			}
		});
		btnAceptar.setBounds(131, 208, 89, 23);
		panelCentral.add(btnAceptar);
		
		dcFechaCreacion = new JDateChooser();
		dcFechaCreacion.setBounds(135, 97, 85, 20);
		panelCentral.add(dcFechaCreacion);
		
		txtCedulaCliente = new JTextField();
		txtCedulaCliente.setBounds(134, 163, 86, 20);
		panelCentral.add(txtCedulaCliente);
		txtCedulaCliente.setColumns(10);
		
		JLabel lblCedulaDelCliente = new JLabel("Cedula del cliente:");
		lblCedulaDelCliente.setBounds(31, 166, 104, 14);
		panelCentral.add(lblCedulaDelCliente);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setBounds(41, 131, 46, 14);
		panelCentral.add(lblSaldo);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(134, 128, 86, 20);
		panelCentral.add(txtSaldo);
		txtSaldo.setColumns(10);

	
	}
	
	
	// SE OBTIENE EL CODIGO INGRESADO
	
	public void crearCuenta(){
		
		long numero = Long.parseLong(this.txtCedulaCliente.getText());
		int posE = this.buscarCliente(numero);
	
		
		if(posE>-1){	
			
			long numeroC = (Long.parseLong(this.txtNumeroCuenta.getText()));
			String tipo = (this.txtTipo.getText());
			Calendar fecha = (this.dcFechaCreacion.getCalendar());
			double saldo = (Double.parseDouble(this.txtSaldo.getText()));
			
			//COMPOSICION
			
			this.auxBanco.agregarCuenta(numeroC, tipo, fecha, saldo);
			
			//ASOCIACION
			
			int posCuenta = this.buscarCuenta(numeroC);
			clsCuenta auxCuenta =  this.auxBanco.getLstCuentas().get(posCuenta);
			
			clsCliente auxCliente = this.auxBanco.getLstClientes().get(posE);
			 
			//LADO CUENTA->CLIENTE:
			auxCuenta.setRefCliente(auxCliente);
			
			//LADO CLIENTE->CUENTA:
			auxCliente.getLstCuenta().add(auxCuenta);
			
			//IINFORME Y LIMPIEZA
			
			JOptionPane.showMessageDialog(this,"¡Cuenta creada con éxito!");
			
			this.txtNumeroCuenta.setText("");
			this.txtTipo.setText("");
			this.dcFechaCreacion.setCalendar(null);
			this.txtSaldo.setText("");
			this.txtCedulaCliente.setText("");
			
			
			
		}
		else{
			//MENSAJE DE ERROR
			
			JOptionPane.showMessageDialog(this, "Cliente no encontrado. Intente nuevamente.","VALIDACION",JOptionPane.WARNING_MESSAGE);
			this.txtCedulaCliente.setText("");
		}
	}
	
	//SE OBTIENE LA POSICION 
	
	public int buscarCliente(long numero){
		
		int posicion = -1;
		
		for(int i=0; i<this.auxBanco.getLstClientes().size();i++)
		{
			if(numero == this.auxBanco.getLstClientes().get(i).getCedula()){
				posicion = i;
				break;
			}
		}
		
		return posicion;
	}	
		
	public int buscarCuenta(long numero){
		
		int posicion = -1;
		
		for(int i=0; i<this.auxBanco.getLstCuentas().size();i++)
		{
			if(numero == this.auxBanco.getLstCuentas().get(i).getNumero()){
				posicion = i;
				break;
			}
		}
		
		return posicion;
	}	
	
}//fin de clase
