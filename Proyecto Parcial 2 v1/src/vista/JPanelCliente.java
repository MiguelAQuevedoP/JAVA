package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import modelo.clsCliente;
import modelo.eTipoSexo;
import modelo.clsBanco;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

public class JPanelCliente extends JPanel {
	private JTextField txtNombreCliente;
	private JTextField txtCedula;
	private JTextField txtDirCliente;
	private JTextField txtTelCliente;
	private JTextField txtCorreo;
	private JDateChooser dcNacimiento;
	private JComboBox cmbTipoSexo;
	private clsBanco auxBanco;

	/**
	 * Create the panel.
	 */
	
	public JPanelCliente(clsBanco objBanco){
		this.auxBanco = objBanco;
		
		this.iniciarComponentes();
	}

	public void iniciarComponentes(){
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 696, 24);
		panel.setBackground(new Color(204, 204, 255));
		add(panel);
		
		JLabel lblFormularioCliente = new JLabel("FORMULARIO CLIENTE");
		panel.add(lblFormularioCliente);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(53, 53, 67, 14);
		add(lblNombre);
		
		JLabel lblCedula = new JLabel("CEDULA:");
		lblCedula.setBounds(53, 78, 67, 14);
		add(lblCedula);
		
		JLabel lblSexo = new JLabel("SEXO:");
		lblSexo.setBounds(53, 103, 67, 14);
		add(lblSexo);
		
		JLabel lblFechaDeNacimiento = new JLabel("FECHA DE NACIMIENTO:");
		lblFechaDeNacimiento.setBounds(53, 128, 139, 14);
		add(lblFechaDeNacimiento);
		
		JLabel lblDireccin = new JLabel("DIRECCION:");
		lblDireccin.setBounds(53, 153, 96, 14);
		add(lblDireccin);
		
		JLabel lblTelefono = new JLabel("TELEFONO:");
		lblTelefono.setBounds(53, 178, 96, 14);
		add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("CORREO:");
		lblCorreo.setBounds(53, 203, 96, 14);
		add(lblCorreo);
		
		txtNombreCliente = new JTextField();
		txtNombreCliente.setBounds(202, 50, 138, 20);
		add(txtNombreCliente);
		txtNombreCliente.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(202, 75, 138, 20);
		add(txtCedula);
		txtCedula.setColumns(10);
		
		txtDirCliente = new JTextField();
		txtDirCliente.setBounds(202, 150, 138, 20);
		add(txtDirCliente);
		txtDirCliente.setColumns(10);
		
		txtTelCliente = new JTextField();
		txtTelCliente.setBounds(202, 175, 138, 20);
		add(txtTelCliente);
		txtTelCliente.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(202, 200, 138, 20);
		add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrarCliente();
			}
		});
		btnRegistrar.setBounds(228, 231, 112, 23);
		add(btnRegistrar);
		
		dcNacimiento = new JDateChooser();
		dcNacimiento.setBounds(202, 122, 138, 20);
		add(dcNacimiento);
		
		cmbTipoSexo = new JComboBox();
		cmbTipoSexo.setModel(new DefaultComboBoxModel(eTipoSexo.values()));
		cmbTipoSexo.setBounds(202, 100, 138, 20);
		add(cmbTipoSexo);

	}
	public void registrarCliente(){
		clsCliente objCliente = new clsCliente();
		objCliente.setNombre(this.txtNombreCliente.getText());
		objCliente.setCedula(Long.parseLong(this.txtCedula.getText()));
		objCliente.setSexo((eTipoSexo)this.cmbTipoSexo.getSelectedItem());
		objCliente.setFechaNacimiento(this.dcNacimiento.getCalendar());
		objCliente.setDireccion(this.txtDirCliente.getText());
		objCliente.setTelefono(Long.parseLong(this.txtTelCliente.getText()));
		objCliente.setCorreo(this.txtCorreo.getText());
		this.auxBanco.agregarCliente(objCliente);
		JOptionPane.showMessageDialog(this, 
				"Cliente registrado con éxito",
				"Información",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.out.println("sexo"+ objCliente.getSexo());
		
		limpiarCampos();
	}
	public void limpiarCampos(){
		this.txtNombreCliente.setText("");
		this.txtCedula.setText("");
		this.cmbTipoSexo.setSelectedIndex(0);
		this.dcNacimiento.setCalendar(null);
		this.txtDirCliente.setText("");
		this.txtTelCliente.setText("");
		this.txtCorreo.setText("");
	}
}//fin de clase
