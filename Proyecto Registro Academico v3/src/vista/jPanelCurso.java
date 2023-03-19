package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import modelo.clsCurso;
import modelo.iGestion;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jPanelCurso extends JPanel implements iGestion{
	private JTextField txtNombre;
	private JTextField txtSemestre;
	private JDateChooser dcFechaInicio; //DECLARACION
	private ArrayList<clsCurso> lstAuxCursos;
	
	public jPanelCurso(ArrayList<clsCurso>lstCursosFull) {
		this.lstAuxCursos = lstCursosFull;
		this.iniciarComponentes();
	}
	public void iniciarComponentes (){

		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblFormularioCursos = new JLabel("FORMULARIO CURSOS");
		panelSuperior.add(lblFormularioCursos);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		JLabel lblSemestre = new JLabel("Semestre:");
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtSemestre = new JTextField();
		txtSemestre.setColumns(10);
		
		dcFechaInicio = new JDateChooser(); //INICIALIZACION
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearCurso();
			}
		});
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombre)
						.addComponent(lblFechaInicio)
						.addComponent(lblSemestre))
					.addGap(29)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnCrear)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(txtSemestre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(dcFechaInicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(227, Short.MAX_VALUE))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSemestre)
						.addComponent(txtSemestre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(dcFechaInicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnCrear))
						.addComponent(lblFechaInicio))
					.addContainerGap(125, Short.MAX_VALUE))
		);
		panelCentral.setLayout(gl_panelCentral);
	}
	public void crearCurso(){
		clsCurso objC = new clsCurso();
		objC.setNombre(this.txtNombre.getText());
		objC.setSemestre(Integer.parseInt(this.txtSemestre.getText()));
		objC.setFecha(this.dcFechaInicio.getCalendar());
		this.lstAuxCursos.add(objC);
		JOptionPane.showMessageDialog(this, "Curso creado con éxito","Gestión de curso",JOptionPane.INFORMATION_MESSAGE);
		this.txtNombre.setText("");
		this.txtSemestre.setText("");
		this.dcFechaInicio.setCalendar(null);
	}
}//FIN DE CLASE
