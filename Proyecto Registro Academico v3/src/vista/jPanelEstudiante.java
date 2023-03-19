package vista;

import modelo.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jPanelEstudiante extends JPanel implements iGestion{
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private ArrayList<clsEstudiante> auxLst;
	
	public jPanelEstudiante(ArrayList<clsEstudiante> lstEstudiantesFull) {
		this.auxLst = lstEstudiantesFull;
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioEstudiante = new JLabel("FORMULARIO ESTUDIANTE");
		panelSuperior.add(lblFormularioEstudiante);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(49, 29, 56, 16);
		panelCentral.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(49, 58, 56, 16);
		panelCentral.add(lblNombre);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(49, 87, 56, 16);
		panelCentral.add(lblCorreo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(117, 26, 116, 22);
		panelCentral.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(117, 55, 116, 22);
		panelCentral.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("");
		txtCorreo.setBounds(117, 84, 116, 22);
		panelCentral.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarEstudiante();
			}
		});	
		
		btnAceptar.setBounds(136, 131, 97, 25);
		panelCentral.add(btnAceptar);
	}	

	public void agregarEstudiante(){
		clsEstudiante objE = new clsEstudiante();
		objE.setCodigo(Long.parseLong(this.txtCodigo.getText()));
		objE.setNombre(this.txtNombre.getText());
		objE.setCorreo(this.txtCorreo.getText());
		this.auxLst.add(objE);
		this.txtCodigo.setText("");
		this.txtNombre.setText("");
		this.txtCorreo.setText("");
	}
}//fin de clase
