package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.clsProfesor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import modelo.eTipoCargo;
import modelo.iGestion;;

public class jPanelProfesor extends JPanel implements iGestion {

	private JTextField txtCodigo;
	private JTextField txtNombre;
	private ArrayList<clsProfesor> auxLst;
	private JTextField txtSueldo;
	private JComboBox cmbTipoCargo;
	
	public jPanelProfesor(ArrayList<clsProfesor> lstProfesFull) {
		this.auxLst = lstProfesFull;
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioProfesor = new JLabel("FORMULARIO PROFESOR");
		panelSuperior.add(lblFormularioProfesor);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(49, 29, 56, 16);
		panelCentral.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(49, 58, 56, 16);
		panelCentral.add(lblNombre);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(49, 87, 56, 16);
		panelCentral.add(lblCargo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(117, 26, 116, 22);
		panelCentral.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(117, 55, 116, 22);
		panelCentral.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarProfesor();
			}
		});	
		
		btnAceptar.setBounds(136, 157, 97, 25);
		panelCentral.add(btnAceptar);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(117, 114, 116, 20);
		panelCentral.add(txtSueldo);
		txtSueldo.setColumns(10);
		
		JLabel lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setBounds(49, 117, 56, 14);
		panelCentral.add(lblSueldo);
		
		cmbTipoCargo = new JComboBox();
		cmbTipoCargo.setModel(new DefaultComboBoxModel(eTipoCargo.values()));
		cmbTipoCargo.setBounds(117, 85, 116, 20);
		panelCentral.add(cmbTipoCargo);
	}	

	public void agregarProfesor(){
		clsProfesor objP = new clsProfesor();
		
		try{
			objP.setCodigo(Long.parseLong(this.txtCodigo.getText()));
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this,
					"Digite un entero en codigo.","Error de conversion.",
					JOptionPane.ERROR_MESSAGE);
		}
		
		objP.setNombre(this.txtNombre.getText());
		
		objP.setCargo((eTipoCargo)this.cmbTipoCargo.getSelectedItem());
		//int pos= this.cmbTipoCargo.getSelectedIndex();
		//System.out.print(pos);
		try{
			objP.setSueldo(Double.parseDouble(this.txtSueldo.getText()));
			
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, 
					"Digite un número en sueldo.",
					"Error de conversion.",
					JOptionPane.ERROR_MESSAGE);
		}
		this.auxLst.add(objP);
		System.out.println("cargo: "+ objP.getCargo());
		limpiar();
	}
	
	public void limpiar(){
		this.txtCodigo.setText("");
		this.txtNombre.setText("");
		this.txtSueldo.setText("");
		this.cmbTipoCargo.setSelectedIndex(0);
	}
}
