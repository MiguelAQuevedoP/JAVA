package vista;

import modelo.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jPanelDeuda extends JPanel implements iGestion {
	//ATRIBUTOS
	private JTextField txtCodigo;
	private JTextField txtDescripcion;
	private JTextField txtValor;
	private ArrayList<clsDeuda> lstAux;
	private ArrayList<clsEstudiante> lstAuxEst;
	private JTextField txtCodigoEst;

	//METODOS
	public jPanelDeuda(ArrayList<clsDeuda> lstDeudaFull,ArrayList<clsEstudiante> lstEstudianteFull) {
		this.lstAux = lstDeudaFull;
		this.lstAuxEst = lstEstudianteFull;
		this.iniciarComponentes();
	}

	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(153, 204, 255));
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioDeudas = new JLabel("FORMULARIO DEUDAS");
		panelSuperior.add(lblFormularioDeudas);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(47, 27, 56, 16);
		panelCentral.add(lblCodigo);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setBounds(47, 56, 79, 16);
		panelCentral.add(lblDescripcin);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(47, 85, 56, 16);
		panelCentral.add(lblValor);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(168, 24, 116, 22);
		panelCentral.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(168, 53, 116, 22);
		panelCentral.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(168, 82, 116, 22);
		panelCentral.add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crearDeuda();
			}
		});
		btnAceptar.setBounds(187, 165, 97, 25);
		panelCentral.add(btnAceptar);
		
		JLabel lblCdigoEstudiante = new JLabel("*C\u00F3digo Estudiante:");
		lblCdigoEstudiante.setForeground(Color.RED);
		lblCdigoEstudiante.setBounds(47, 118, 97, 14);
		panelCentral.add(lblCdigoEstudiante);
		
		txtCodigoEst = new JTextField();
		txtCodigoEst.setBounds(168, 115, 116, 20);
		panelCentral.add(txtCodigoEst);
		txtCodigoEst.setColumns(10);
	}
	
	public void crearDeuda(){
		int posE = this.buscarEstudiante(Integer.parseInt(this.txtCodigoEst.getText()));
		clsEstudiante auxEst;
		if(posE > -1){
			clsDeuda objD = new clsDeuda();
			objD.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
			objD.setDescripcion(this.txtDescripcion.getText());
			objD.setValor(Double.parseDouble(this.txtValor.getText()));
			this.lstAux.add(objD);
			auxEst = this.lstAuxEst.get(posE);
			auxEst.agregarDeuda(objD);
			JOptionPane.showMessageDialog(this, "¡Deuda creada éxito!");
			this.txtCodigo.setText("");
			this.txtDescripcion.setText("");
			this.txtValor.setText("");
			this.txtCodigoEst.setText("");
		}
		else{
			JOptionPane.showMessageDialog(this, "¡Estudiante no encontrado!","Validación",JOptionPane.ERROR_MESSAGE);
			this.txtCodigo.setText("");
			this.txtDescripcion.setText("");
			this.txtValor.setText("");
			this.txtCodigoEst.setText("");
		}
	}
	
	public int buscarEstudiante(int codigo){
		int posicion = -1;
		for(int i=0; i<this.lstAuxEst.size();i++){
			if(codigo == lstAuxEst.get(i).getCodigo()){
				posicion = i;
				break;
			}
		}
		return posicion;
	}
}//fin de clase
