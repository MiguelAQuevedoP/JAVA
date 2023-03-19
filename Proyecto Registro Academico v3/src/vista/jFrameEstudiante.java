package vista;

import modelo.*;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jFrameEstudiante extends JFrame implements iGestion{

	private JPanel panelPrincipal;
	private jPanelEstudiante panelEstudiante;
	private jPanelDeuda panelDeuda;
	private jPanelImprimir panelImprimir;
	private jPanelCurso panelCurso;
	private jPanelMatricula panelMatricula;
	private jPanelProfesor panelProfesor;
	private JPanel panelCentral;
	//atributos funcionales 
	private ArrayList<clsEstudiante> lstEstudiantesFull;
	private ArrayList<clsDeuda> lstDeudaFull;
	private ArrayList<clsCurso> lstCursosFull;
	private ArrayList<clsProfesor> lstProfesFull;
	
	public jFrameEstudiante() {
		
		this.inicializarMemoria();
		this.iniciarComponentes();
		
	}
	
	public void inicializarMemoria(){
		this.lstEstudiantesFull = new ArrayList<clsEstudiante>();
		this.lstDeudaFull = new ArrayList<clsDeuda>();
		this.lstCursosFull = new ArrayList<clsCurso>();
		this.lstProfesFull = new ArrayList<clsProfesor>();
		
		this.panelEstudiante = new jPanelEstudiante(this.lstEstudiantesFull);
		this.panelDeuda = new jPanelDeuda(this.lstDeudaFull, this.lstEstudiantesFull);
		this.panelImprimir = new jPanelImprimir(this.lstEstudiantesFull);
		this.panelCurso = new jPanelCurso(this.lstCursosFull);
		this.panelProfesor = new jPanelProfesor(this.lstProfesFull);
		this.panelMatricula = new jPanelMatricula(this.lstEstudiantesFull,this.lstCursosFull);
	}
	
	public void iniciarComponentes(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 515);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRegistroAcademicoV = new JLabel("REGISTRO ACADEMICO V1");
		panelSuperior.add(lblRegistroAcademicoV);
		
		JPanel panelIzquierda = new JPanel();
		panelIzquierda.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelPrincipal.add(panelIzquierda, BorderLayout.WEST);
		
		JButton btnEstudiante = new JButton("Estudiante");
		btnEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarEstudiante();
			}
		});
		
		JButton btnDeudas = new JButton("Deudas");
		btnDeudas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lanzarDeuda();
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lanzarImprimir();
			}
		});
		
		JButton btnCursos = new JButton("Cursos");
		btnCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarCurso();
			}
		});
		
		JButton btnMatricular = new JButton("Matricular");
		btnMatricular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarMatricula();
			}
		});
		
		JButton btnProfesor = new JButton("Profesor");
		btnProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarProfesor();
			}
		});
		GroupLayout gl_panelIzquierda = new GroupLayout(panelIzquierda);
		gl_panelIzquierda.setHorizontalGroup(
			gl_panelIzquierda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelIzquierda.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelIzquierda.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEstudiante, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnDeudas, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnCursos, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnImprimir, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnProfesor, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnMatricular, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelIzquierda.setVerticalGroup(
			gl_panelIzquierda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelIzquierda.createSequentialGroup()
					.addGap(22)
					.addComponent(btnEstudiante)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDeudas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCursos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnProfesor)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMatricular)
					.addPreferredGap(ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
					.addComponent(btnImprimir)
					.addContainerGap())
		);
		panelIzquierda.setLayout(gl_panelIzquierda);
		
		panelCentral = new JPanel();
		panelCentral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelPrincipal.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));
	}
	
	public void lanzarEstudiante(){
		this.panelCentral.remove(this.panelDeuda);
		this.panelCentral.remove(this.panelImprimir);
		this.panelCentral.remove(this.panelCurso);
		this.panelCentral.remove(this.panelProfesor);
		this.panelCentral.remove(this.panelMatricula);
		this.panelCentral.add(this.panelEstudiante,BorderLayout.CENTER);
		this.dibujar();
		
	}
	public void lanzarDeuda(){
		this.panelCentral.remove(this.panelEstudiante);
		this.panelCentral.remove(this.panelImprimir);
		this.panelCentral.remove(this.panelCurso);
		this.panelCentral.remove(this.panelProfesor);
		this.panelCentral.remove(this.panelMatricula);
		this.panelCentral.add(this.panelDeuda,BorderLayout.CENTER);
		this.dibujar();
	}
	
	public void lanzarImprimir(){
		this.panelCentral.remove(this.panelEstudiante);
		this.panelCentral.remove(this.panelDeuda);
		this.panelCentral.remove(this.panelCurso);
		this.panelCentral.remove(this.panelProfesor);
		this.panelCentral.remove(this.panelMatricula);
		this.panelCentral.add(this.panelImprimir,BorderLayout.CENTER);
		this.dibujar();		
	}
	
	public void lanzarCurso(){
		this.panelCentral.remove(this.panelEstudiante);
		this.panelCentral.remove(this.panelDeuda);
		this.panelCentral.remove(this.panelImprimir);
		this.panelCentral.remove(this.panelProfesor);
		this.panelCentral.remove(this.panelMatricula);
		this.panelCentral.add(this.panelCurso,BorderLayout.CENTER);
		this.dibujar();
	}
	public void lanzarProfesor(){
		this.panelCentral.remove(this.panelEstudiante);
		this.panelCentral.remove(this.panelDeuda);
		this.panelCentral.remove(this.panelImprimir);
		this.panelCentral.remove(this.panelCurso);
		this.panelCentral.remove(this.panelMatricula);
		this.panelCentral.add(this.panelProfesor,BorderLayout.CENTER);
		this.dibujar();
	}
	public void lanzarMatricula(){
		this.panelCentral.remove(this.panelEstudiante);
		this.panelCentral.remove(this.panelDeuda);
		this.panelCentral.remove(this.panelImprimir);
		this.panelCentral.remove(this.panelCurso);
		this.panelCentral.remove(this.panelProfesor);
		this.panelCentral.add(this.panelMatricula,BorderLayout.CENTER);
		this.dibujar();
	}
	public void dibujar(){
		this.panelCentral.revalidate();
		this.panelCentral.repaint();
	}
}//fin de clase
