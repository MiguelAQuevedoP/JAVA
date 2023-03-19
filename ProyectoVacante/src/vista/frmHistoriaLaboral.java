package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import modelo.*;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmHistoriaLaboral extends JFrame {

	private JPanel contenedorPrincipal;

	private JPanel contSup;
	private JPanel contCentral;
	private JLabel lblPostulacinVacantesLaborales;
	private JLabel lblNewLabel_1;
	private JLabel lblDireccin;
	private JLabel lblTelefono;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtResultado;
	//CONSTRUCTOR
	public frmHistoriaLaboral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedorPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(contenedorPrincipal);
		
		contSup = new JPanel();
		contSup.setBackground(new Color(102, 102, 255));
		contSup.setBorder(new LineBorder(Color.BLUE));
		contenedorPrincipal.add(contSup, BorderLayout.NORTH);
		
		lblPostulacinVacantesLaborales = new JLabel("POSTULACI\u00D3N VACANTES LABORALES");
		contSup.add(lblPostulacinVacantesLaborales);
		
		contCentral = new JPanel();
		contCentral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, null));
		contenedorPrincipal.add(contCentral, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Cedula: ");
		
		lblNewLabel_1 = new JLabel("Nombre: ");
		
		lblDireccin = new JLabel("Direcci\u00F3n: ");
		
		lblTelefono = new JLabel("Telefono: ");
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setText("");
		txtDireccion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				clsPersona objP = new clsPersona();
				Long auxCed = Long.parseLong(txtCedula.getText());
				objP.setCedula(auxCed);
				objP.setNombre(txtNombre.getText());
				objP.setDireccion(txtDireccion.getText());
				int auxTel = Integer.parseInt(txtTelefono.getText());
				objP.setTelefono(auxTel);
				txtResultado.setText(objP.informacion());
				
			}
		});
		
		JLabel lblResultado = new JLabel("Resultado: ");
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		GroupLayout gl_contCentral = new GroupLayout(contCentral);
		gl_contCentral.setHorizontalGroup(
			gl_contCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contCentral.createSequentialGroup()
							.addGroup(gl_contCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDireccin)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addGap(18)
							.addGroup(gl_contCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contCentral.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnAceptar)
							.addGroup(gl_contCentral.createSequentialGroup()
								.addComponent(lblTelefono)
								.addGap(18)
								.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(63)
					.addGroup(gl_contCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(lblResultado)
						.addComponent(txtResultado, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contCentral.setVerticalGroup(
			gl_contCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contCentral.createSequentialGroup()
					.addGroup(gl_contCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contCentral.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_contCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contCentral.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblResultado)))
					.addGroup(gl_contCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contCentral.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contCentral.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contCentral.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblDireccin)
								.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(23)
							.addGroup(gl_contCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTelefono)
								.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(btnAceptar))
						.addGroup(gl_contCentral.createSequentialGroup()
							.addGap(11)
							.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		contCentral.setLayout(gl_contCentral);
	}
}
