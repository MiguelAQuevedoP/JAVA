package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.toedter.calendar.JDateChooser;

import modelo.clsBanco;
import modelo.clsCliente;
import modelo.clsCuenta;
import modelo.clsEmpleado;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import modelo.eTipoCargo;
import modelo.eAñosExperiencia;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import modelo.eSexo;

public class JPanelEmpleado extends JPanel implements IGestion {
	private clsBanco auxObjBanco;
    private JComboBox cmbTipoCargo; 
    private JComboBox cmbAñosExperiencia;
    private JComboBox cmbSexo;
    private JDateChooser dcFechaNacimiento;
    private JTextField txtSueldo;
    private JTextField txtNombre;
    private JTextField txtCedula;

	public JPanelEmpleado(clsBanco auxObjBanco) {
	this.auxObjBanco = auxObjBanco;
	this.iniciarComponentes();
	}
	public void iniciarComponentes (){
	setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioCliente = new JLabel("FORMULARIO EMPLEADO ");
		panelSuperior.add(lblFormularioCliente);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		
		JLabel lblCargo = new JLabel("Cargo");
		
		JLabel lblSueldo = new JLabel("Sueldo");
		
		JLabel lblAñosExperiencia = new JLabel("A\u00F1os de Experiencia");
		
		JButton btnRegistrar = new JButton("CREAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			crearEmpleado();
			}
		});
		
		cmbTipoCargo = new JComboBox();
		cmbTipoCargo.setModel(new DefaultComboBoxModel(eTipoCargo.values()));
		
		cmbAñosExperiencia = new JComboBox();
		cmbAñosExperiencia.setModel(new DefaultComboBoxModel(eAñosExperiencia.values()));
		
		JLabel lblCedula = new JLabel("Cedula");
		
		JLabel lblNewLabel = new JLabel("Nombre ");
		
		JLabel lblSexo = new JLabel("Sexo");
		
	    dcFechaNacimiento = new JDateChooser();
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		
		txtSueldo = new JTextField();
		txtSueldo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		
		cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(eSexo.values()));
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(lblAñosExperiencia)
							.addGap(45))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(71)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCargo, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSueldo, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(lblCedula)
								.addComponent(lblSexo))
							.addGap(73))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(lblFechaNacimiento)
							.addGap(69)))
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(cmbAñosExperiencia, 0, 116, Short.MAX_VALUE)
						.addComponent(dcFechaNacimiento, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbTipoCargo, 0, 116, Short.MAX_VALUE))
						.addComponent(txtSueldo, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCedula, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(cmbSexo, Alignment.TRAILING, 0, 116, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(lblCedula)
							.addGap(21)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnRegistrar)
								.addComponent(lblSexo)))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(cmbSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
						.addComponent(dcFechaNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFechaNacimiento))
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCargo)
						.addComponent(cmbTipoCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSueldo)
						.addComponent(txtSueldo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(cmbAñosExperiencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAñosExperiencia))
					.addContainerGap())
		);
		panelCentral.setLayout(gl_panelCentral);
	}
public void crearEmpleado (){
	//EXCEPCION UNO
	try {
		clsEmpleado objP = new clsEmpleado();
		objP.setCedula(Long.parseLong(this.txtCedula.getText()));
		objP.setNombre(this.txtNombre.getText());
		
		objP.setFechaNacimiento(this.dcFechaNacimiento.getCalendar());
		objP.setCargo((eTipoCargo)this.cmbTipoCargo.getSelectedItem());
		objP.setSueldo(Long.parseLong(this.txtSueldo.getText()));
		objP.setAñosExperiencia((eAñosExperiencia)this.cmbAñosExperiencia.getSelectedItem());
		this.auxObjBanco.crearEmpleado(objP);
	    JOptionPane.showMessageDialog(this,"EMPLEADO CREADO EXITOSAMENTE");
	} 
	
	catch(NumberFormatException e){
		JOptionPane.showMessageDialog(this,
		"Error por conversion. Digite un numero",
		"Validacion de Datos",
		JOptionPane.ERROR_MESSAGE);
	}
	catch(NullPointerException e){
		JOptionPane.showMessageDialog(this,
		"Error de memoria. No hay espacio para guardar",
		"Validacion de Datos",
		JOptionPane.ERROR_MESSAGE);
	}
	catch(Exception e){
		JOptionPane.showMessageDialog(this,
		"Error General",
		"Validacion",
		JOptionPane.ERROR_MESSAGE);
	}
	this.limpiarComponentes();
}
@Override
public void limpiarComponentes() {
	this.cmbTipoCargo.setSelectedItem(null);
	this.cmbAñosExperiencia.setSelectedItem(null);
	this.txtCedula.setText("");
	this.txtNombre.setText("");
	this.cmbSexo.setSelectedItem(null);
	this.dcFechaNacimiento.setCalendar(null);
	this.txtSueldo.setText("");
}
} //FIN DE CLASE