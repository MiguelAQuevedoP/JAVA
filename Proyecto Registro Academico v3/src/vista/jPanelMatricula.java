package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.clsCurso;
import modelo.clsEstudiante;
import modelo.iGestion;

import javax.swing.JButton;

public class jPanelMatricula extends JPanel implements iGestion{
	private JTextField txtCodigoEst;
	private JTextField txtCurso;
	private ArrayList<clsEstudiante>lstAuxEst;
	private ArrayList<clsCurso>lstAuxCurso;
	
	public jPanelMatricula(ArrayList<clsEstudiante>lstEstudiantesFull, ArrayList<clsCurso>lstCursosFull) {
		
		this.lstAuxEst = lstEstudiantesFull;
		this.lstAuxCurso = lstCursosFull;
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblMatriculaDeCursos = new JLabel("MATRICULA DE CURSOS");
		panelSuperior.add(lblMatriculaDeCursos);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		
		JLabel lblDigiteCodigoEstudiantil = new JLabel("Digite codigo estudiantil:");
		
		txtCodigoEst = new JTextField();
		txtCodigoEst.setColumns(10);
		
		JLabel lblDigiteNombreCurso = new JLabel("Digite nombre curso:");
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		
		JButton btnMatricularCurso = new JButton("Matricular curso");
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDigiteCodigoEstudiantil)
						.addComponent(lblDigiteNombreCurso))
					.addGap(40)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnMatricularCurso, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(txtCurso)
						.addComponent(txtCodigoEst))
					.addContainerGap(153, Short.MAX_VALUE))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDigiteCodigoEstudiantil)
						.addComponent(txtCodigoEst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDigiteNombreCurso)
						.addComponent(txtCurso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnMatricularCurso)
					.addContainerGap(144, Short.MAX_VALUE))
		);
		panelCentral.setLayout(gl_panelCentral);
	}
	
	public void matricularCurso(){
		int codigo = Integer.parseInt(this.txtCodigoEst.getText());
		int posE = this.buscarEstudiante(codigo);
		if(posE>-1){
			String nombre = this.txtCurso.getText();
			int posC = this.buscarCurso(nombre);
			if(posC>-1){
				clsEstudiante auxE = this.lstAuxEst.get(posE);
				clsCurso auxCurso = this.lstAuxCurso.get(posC);
				auxE.getLstCursos().add(auxCurso);
				auxCurso.getLstEstudiante().add(auxE);
			}
			else{
				JOptionPane.showMessageDialog(this, "¡Curso no encontrado!","validacion",JOptionPane.ERROR_MESSAGE);
			}
			}
		else{
			JOptionPane.showMessageDialog(this, "¡Estudiante no encontrado!","Validacion",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public int buscarEstudiante(int codigoEst){
		
		int pos = -1;
		for (int i=0; i<this.lstAuxEst.size();i++){
			if(codigoEst == this.lstAuxEst.get(i).getCodigo()){
				pos = i;
				break;
			}
		}
		return pos;
	}

	public int buscarCurso(String nombre){
		
		int pos = -1;
		for (int i=0; i<this.lstAuxCurso.size();i++){
			if(nombre == this.lstAuxCurso.get(i).getNombre()){
				pos = i;
				break;
			}
		}
		return pos;
	}
}//FINAL DE CLASE
