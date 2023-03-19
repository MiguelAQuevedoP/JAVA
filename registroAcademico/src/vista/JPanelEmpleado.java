package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import modelo.clsEmpleado;
import modelo.clsPersona;
import modelo.eTipoCargo;
import modelo.eTipoSexo;
import modelo.iGestion;
import modelo.clsBanco;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

public class JPanelEmpleado extends JPanel implements iGestion {
	private JTextField txtNombreCliente;
	private JTextField txtCedula;
	private JTextField txtAnoExperiencia;
	private JTextField txtSueldo;
	private JDateChooser dcNacimiento;
	private JDateChooser cdFechaNacimiento;
	private JComboBox cmbCargoEmpleado;
	private JComboBox cmbTipoSexo;
	private clsBanco auxBanco;
	private JTextField txtNombre;

	/**
	 * Create the panel.
	 */
	
	public JPanelEmpleado(clsBanco objBanco){
		
		this.auxBanco = objBanco;
		
		this.iniciarComponentes();
		
	}

	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(204, 204, 255));
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioProfesor = new JLabel("FORMULARIO EMPLEADO");
		panelSuperior.add(lblFormularioProfesor);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel lblCedula = new JLabel("CEDULA:");
		lblCedula.setBounds(49, 76, 56, 16);
		panelCentral.add(lblCedula);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(49, 39, 56, 16);
		panelCentral.add(lblNombre);
		
		JLabel lblCargo = new JLabel("CARGO:");
		lblCargo.setBounds(49, 192, 56, 16);
		panelCentral.add(lblCargo);
		
		
		JButton btnCrear = new JButton("CREAR");
		btnCrear.setBackground(new Color(204, 204, 255));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearEmpleado();
			}
		});	
		
		btnCrear.setBounds(404, 150, 97, 25);
		panelCentral.add(btnCrear);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(213, 74, 116, 20);
		panelCentral.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblSexo = new JLabel("SEXO:");
		lblSexo.setBounds(49, 115, 56, 14);
		panelCentral.add(lblSexo);
		
		cmbCargoEmpleado = new JComboBox();
		cmbCargoEmpleado.setModel(new DefaultComboBoxModel(eTipoCargo.values()));
		cmbCargoEmpleado.setBounds(213, 188, 116, 20);
		panelCentral.add(cmbCargoEmpleado);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(213, 37, 116, 20);
		panelCentral.add(txtNombre);
		txtNombre.setColumns(10);
		
		cmbTipoSexo = new JComboBox();
		cmbTipoSexo.setModel(new DefaultComboBoxModel(eTipoSexo.values()));
		cmbTipoSexo.setBounds(213, 112, 116, 20);
		panelCentral.add(cmbTipoSexo);
		
		JLabel lblFechaDeNacimiento = new JLabel("FECHA DE NACIMIENTO:");
		lblFechaDeNacimiento.setBounds(49, 154, 157, 16);
		panelCentral.add(lblFechaDeNacimiento);
		
		cdFechaNacimiento = new JDateChooser();
		cdFechaNacimiento.setBounds(213, 150, 116, 20);
		panelCentral.add(cdFechaNacimiento);
		
		JLabel lblAosDeExperiencia = new JLabel("A\u00D1OS DE EXPERIENCIA:");
		lblAosDeExperiencia.setBounds(49, 235, 132, 14);
		panelCentral.add(lblAosDeExperiencia);
		
		txtAnoExperiencia = new JTextField();
		txtAnoExperiencia.setBounds(213, 232, 116, 20);
		panelCentral.add(txtAnoExperiencia);
		txtAnoExperiencia.setColumns(10);
		
		JLabel lblSueldo = new JLabel("SUELDO:");
		lblSueldo.setBounds(49, 271, 56, 14);
		panelCentral.add(lblSueldo);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(213, 268, 116, 20);
		panelCentral.add(txtSueldo);
		txtSueldo.setColumns(10);
	}	
	
	public void crearEmpleado(){
		try{
		clsEmpleado objEmpleado = new clsEmpleado();
		Long cedula = (Long.parseLong(this.txtCedula.getText()));
		String nombre =(this.txtNombre.getText());
		eTipoSexo sexo = ((eTipoSexo)this.cmbTipoSexo.getSelectedItem());
		Calendar fechaNacimiento = (this.cdFechaNacimiento.getCalendar());
		double sueldo = (Double.parseDouble(this.txtSueldo.getText()));
		int anoExperiencia = (Integer.parseInt(this.txtAnoExperiencia.getText()));
		eTipoCargo cargo = ((eTipoCargo)this.cmbCargoEmpleado.getSelectedItem());
		this.auxBanco.crearEmpleado(cedula, nombre,sexo, fechaNacimiento, sueldo, anoExperiencia, cargo);
		JOptionPane.showMessageDialog(this, 
				"Empleado creado con �xito",
				"",
				JOptionPane.INFORMATION_MESSAGE);
		}
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(this,
					"Error, No hay espacio",
					"Validar datos",
					JOptionPane.ERROR_MESSAGE);
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this,
					"Error, dato mal digitado",
					"Validar datos",
					JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(this,
					"Error",
					"",
					JOptionPane.ERROR_MESSAGE);
		}
		limpiarCampos();
	}
	
	public void limpiarCampos(){
		this.txtNombre.setText("");
		this.txtCedula.setText("");
		this.cmbTipoSexo.setSelectedIndex(0);  
		this.cdFechaNacimiento.setCalendar(null);
		//this.txtCargo.setText("");
		this.txtAnoExperiencia.setText("");
		this.txtSueldo.setText("");
		this.cmbCargoEmpleado.setSelectedIndex(0);
	}
}//fin de clase
