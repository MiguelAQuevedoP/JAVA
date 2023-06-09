package vista;
import java.util.ArrayList;
import modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;

public class JPanelCuenta extends JPanel {
	private JTextField txtNumero;
	private JTextField txttipo;
	private JTextField txtSaldo;
	private clsBanco auxObjBanco;
	private  JDateChooser dcFechaCreacion ;
	private JTextField txtCedulaCliente;


	public JPanelCuenta(clsBanco auxObjBanco) {
	this.auxObjBanco = auxObjBanco;
	this.iniciarComponenetes();
	}
	public void iniciarComponenetes (){
	setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioCliente = new JLabel("FORMULARIO CUENTA ");
		panelSuperior.add(lblFormularioCliente);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		
		JLabel lblCedula = new JLabel("N\u00FAmero");
		
		JLabel lblNombre = new JLabel("Tipo");
		
		JLabel lblSexo = new JLabel("FechaCreacion");
		
		JLabel lblFechanacimiento = new JLabel("Saldo");
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		
		txttipo = new JTextField();
		txttipo.setColumns(10);
		
		txtSaldo = new JTextField();
		txtSaldo.setColumns(10);
		
		JButton btnRegistrar = new JButton("CREAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crearCuenta();
			}
		});
		
		dcFechaCreacion = new JDateChooser();
		
		JLabel CedulaCliente = new JLabel("Cedula Cliente");
		
		txtCedulaCliente = new JTextField();
		txtCedulaCliente.setColumns(10);
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_panelCentral.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addGap(52)
									.addComponent(lblSexo))
								.addGroup(gl_panelCentral.createSequentialGroup()
									.addGap(227)
									.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCedula, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(214)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
								.addComponent(CedulaCliente)
								.addComponent(lblFechanacimiento, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addGap(41)))
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(txttipo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtNumero, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(dcFechaCreacion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtSaldo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtCedulaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(54))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCedula)
						.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(txttipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addGap(29)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRegistrar)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSexo)
								.addComponent(dcFechaCreacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtSaldo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFechanacimiento))
							.addGap(41)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(CedulaCliente)
								.addComponent(txtCedulaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		panelCentral.setLayout(gl_panelCentral);
	}
	
		  public int buscarCedulaCliente(int cedula){
		        
				int posicion = -1;
		    	for(int n=0;n<this.auxObjBanco.getLstClientes().size();n++){
		    		if(cedula == this.auxObjBanco.getLstClientes().get(n).getCedula()){
		    			posicion = n;
		    			break;
		   		}
		    	}
		    
		    	return posicion;
		        }
	 public void crearCuenta(){
		 int posicionCliente = this.buscarCedulaCliente(Integer.parseInt(this.txtCedulaCliente.getText()));
         clsCliente auxCliente;
		 
		if (posicionCliente>-1){
		 
		clsCuenta objD = new clsCuenta();
		objD.setNumero(Long.parseLong(this.txtNumero.getText()));
		objD.setTipo(this.txttipo.getText());
		objD.setFechaCreacion(this.dcFechaCreacion.getCalendar());
		objD.setSaldo(Long.parseLong(this.txtSaldo.getText()));
		this.auxObjBanco.getLstCuentas().add(objD);
		auxCliente = this.auxObjBanco.getLstClientes().get(posicionCliente);
		
		auxCliente.agregarCuenta(objD);
		JOptionPane.showMessageDialog(this,"CUENTA CREADA CON �XITO");
		
		this.txtNumero.setText("");
		this.txttipo.setText("");
		this.dcFechaCreacion.setCalendar(null);
		this.txtSaldo.setText("");
		this.txtCedulaCliente.setText("");
	}
		else {
			JOptionPane.showMessageDialog(this, "CLIENTE NO ENCONTRADO",
					"VALIDACION",
					JOptionPane.ERROR_MESSAGE);
			this.txtCedulaCliente.setText("");
			this.txtNumero.setText("");
			this.txttipo.setText("");
			this.dcFechaCreacion.setCalendar(null);
			this.txtSaldo.setText("");
		}
	 }
}//FIN DE LA CLASE
