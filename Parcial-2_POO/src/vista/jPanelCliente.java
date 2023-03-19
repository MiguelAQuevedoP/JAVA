package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

import modelo.clsBanco;
import modelo.clsCliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class jPanelCliente extends JPanel {
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtSexo;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JDateChooser dcFechaN;
	private clsBanco auxBanco;

	/**
	 * Create the panel.
	 */
	public jPanelCliente(clsBanco objBanco) {
		this.auxBanco = objBanco;
		this.iniciarComponentes();
	}

	private void iniciarComponentes() {
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(204, 204, 204));
		panelSuperior.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioCliente = new JLabel("FORMULARIO CLIENTE");
		lblFormularioCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFormularioCliente.setForeground(new Color(255, 255, 255));
		panelSuperior.add(lblFormularioCliente);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		panelCentral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(45, 35, 46, 14);
		panelCentral.add(lblCedula);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(45, 60, 46, 14);
		panelCentral.add(lblNombre);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(45, 85, 46, 14);
		panelCentral.add(lblSexo);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setBounds(45, 110, 109, 14);
		panelCentral.add(lblFechaDeNacimiento);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(45, 135, 66, 14);
		panelCentral.add(lblDireccin);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(45, 160, 46, 14);
		panelCentral.add(lblTelfono);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(45, 185, 46, 14);
		panelCentral.add(lblCorreo);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(164, 132, 86, 20);
		panelCentral.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(164, 157, 86, 20);
		panelCentral.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(164, 182, 86, 20);
		panelCentral.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtSexo = new JTextField();
		txtSexo.setBounds(164, 82, 86, 20);
		panelCentral.add(txtSexo);
		txtSexo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(164, 57, 86, 20);
		panelCentral.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(164, 32, 86, 20);
		panelCentral.add(txtCedula);
		txtCedula.setColumns(10);
		
		dcFechaN = new JDateChooser();
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crearCliente();
			}

		});
		btnAceptar.setBounds(164, 213, 89, 23);
		panelCentral.add(btnAceptar);
		
		
		
		dcFechaN.setBounds(164, 110, 81, 20);
		panelCentral.add(dcFechaN);

	}
	//AGREGACION 
	
	private void crearCliente() {
		
		clsCliente objC = new clsCliente();
		objC.setCedula(Long.parseLong(this.txtCedula.getText()));
		objC.setNombre(this.txtNombre.getText());
		objC.setSexo(this.txtSexo.getText());
		objC.setDireccion(this.txtDireccion.getText());
		objC.setTelefono(Long.parseLong(this.txtTelefono.getText()));
		objC.setFechaNacimiento(this.dcFechaN.getCalendar());
		objC.setCorreo(this.txtCorreo.getText());
		
		//AGREGACIÓN
		this.auxBanco.vincularCliente(objC);
		
		this.txtCedula.setText("");
		this.txtNombre.setText("");
		this.txtSexo.setText("");
		this.txtDireccion.setText("");
		this.txtTelefono.setText("");
		this.dcFechaN.setCalendar(null);
		this.txtCorreo.setText("");
		
		JOptionPane.showMessageDialog(this,"Cliente creado");
	}
}
