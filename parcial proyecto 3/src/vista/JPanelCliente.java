package vista;
import java.util.ArrayList;
import modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.text.Format;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.toedter.calendar.JDateChooser;
 import java.util.Calendar;
 
 
public class JPanelCliente extends JPanel implements IGestion{
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtSexo;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private clsBanco auxObjBanco;
    private JDateChooser dcFechaNacimiento;
 
	
	public JPanelCliente(clsBanco objBanco) {
	this.auxObjBanco = objBanco;
	this.iniciarComponentes();
	}
	public void iniciarComponentes (){
	setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioCliente = new JLabel("Formulario Cliente");
		panelSuperior.add(lblFormularioCliente);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		
		JLabel lblCedula = new JLabel("Cedula");
		
		JLabel lblNombre = new JLabel("Nombre");
		
		JLabel lblSexo = new JLabel("Sexo");
		
		JLabel lblFechanacimiento = new JLabel("FechaNacimiento");
		
		JLabel lblDireccion = new JLabel("Direccion");
		
		JLabel lblTelefono = new JLabel("Telefono");
		
		JLabel lblCorreo = new JLabel("Correo");
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtSexo = new JTextField();
		txtSexo.setText("");
		txtSexo.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			registrarCliente();	
			}
		});
		
		dcFechaNacimiento = new JDateChooser();
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(212)
					.addComponent(lblCedula, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(212)
					.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(212)
					.addComponent(lblSexo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(txtSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(212)
					.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(212)
							.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panelCentral.createSequentialGroup()
								.addGap(39)
								.addComponent(btnRegistrar)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblFechanacimiento, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panelCentral.createSequentialGroup()
								.addGap(212)
								.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
					.addGap(25)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(dcFechaNacimiento, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(79))
						.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCedula))
						.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNombre))
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(5)
							.addComponent(lblSexo))
						.addComponent(txtSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRegistrar)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(dcFechaNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFechanacimiento))))
					.addGap(9)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDireccion)
						.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(3)
							.addComponent(lblTelefono))
						.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCorreo))
						.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panelCentral.setLayout(gl_panelCentral);
	}
	public void registrarCliente(){
		//EXCEPCION DOS 
		try {
			clsCliente objC = new clsCliente();
			objC.setNombre(this.txtNombre.getText());
			objC.setCedula(Long.parseLong(this.txtCedula.getText()));
			objC.setSexo(this.txtSexo.getText());
			objC.setFechaNacimiento(this.dcFechaNacimiento.getCalendar());
			objC.setDireccion(this.txtDireccion.getText());
			objC.setTelefono(Long.parseLong(this.txtTelefono.getText()));
			objC.setCorreo(this.txtCorreo.getText());
			this.auxObjBanco.registrarCliente(objC); //METODO AGREGACION
			JOptionPane.showMessageDialog(this,"EL CLIENTE FUE REGISTRADO CON ÉXITO");
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
		this.txtCedula.setText("");
		this.txtNombre.setText("");
		this.txtSexo.setText("");
		this.dcFechaNacimiento.setCalendar(null);
		this.txtDireccion.setText("");
		this.txtTelefono.setText("");
		this.txtCorreo.setText("");
	}
}//FIN DE LA CLASE
