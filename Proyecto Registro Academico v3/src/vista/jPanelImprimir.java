package vista;

import java.util.ArrayList;
import modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class jPanelImprimir extends JPanel implements iGestion{
	private JTable tEstudiante;
	private JScrollPane spEstudiante;
	private ArrayList<clsEstudiante> auxLst;
	private JTextField txtCodigoEst;
	private JTable tDeuda;

	public jPanelImprimir(ArrayList<clsEstudiante> lstEstudiantesFull) {
		
		this.auxLst = lstEstudiantesFull;
		
		this.iniciarComponentes();
		
	}
	public void iniciarComponentes(){
		setLayout(new BorderLayout(0, 0));		
		
		//SCROLLPANE DE ESTUDIANTE
		spEstudiante = new JScrollPane();
		tEstudiante = new JTable();		
		tEstudiante.setModel(new javax.swing.table.DefaultTableModel(new Object[auxLst.size()][3], new String[] {"Codigo", "Nombre", "Correo"}				
				));		
		spEstudiante.setViewportView(tEstudiante);
		
		//SCROLLPANE DE DEUDA
		JScrollPane spDeuda = new JScrollPane();
		tDeuda = new JTable();
		tDeuda.setModel(new javax.swing.table.DefaultTableModel(new Object[0][3], new String[] {"Codigo", "Descripcion", "Valor"}				
				));
		spDeuda.setViewportView(tDeuda);
		
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblInformeDeDatos = new JLabel("INFORME DE DATOS");
		panelSuperior.add(lblInformeDeDatos);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimir();
			}
		});	
		
		JLabel lblDigiteCodigo = new JLabel("Digite codigo:");
		
		txtCodigoEst = new JTextField();
		txtCodigoEst.setColumns(10);
		
		
		
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
						.addComponent(spEstudiante, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
						.addComponent(spDeuda, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panelCentral.createSequentialGroup()
							.addComponent(lblDigiteCodigo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCodigoEst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnCargar)))
					.addGap(42))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCargar)
						.addComponent(lblDigiteCodigo)
						.addComponent(txtCodigoEst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(spEstudiante, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(spDeuda, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(83, Short.MAX_VALUE))
		);
		
		
		panelCentral.setLayout(gl_panelCentral);

	}
	
	public void imprimir(){
		
		int codigo = Integer.parseInt(this.txtCodigoEst.getText());
		int posE = this.buscarEst(codigo);
		if(posE>-1){
			this.cargarTablaEstudiante(posE);
			this.cargarTablaDeuda(posE);
		}
		else{
			JOptionPane.showMessageDialog(this, "¡Estudiante no encontrado!","Busqueda",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public int buscarEst(int codigo){
		
		int pos = -1;
		for (int i=0; i<this.auxLst.size();i++){
			if(codigo == this.auxLst.get(i).getCodigo()){
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public void cargarTablaEstudiante(int posE){
		
		Object matriz [][] = new Object[1][3];
		
			matriz[0][0]= auxLst.get(posE).getCodigo();
			matriz[0][1]= auxLst.get(posE).getNombre();
			matriz[0][2]= auxLst.get(posE).getCorreo();
		
		tEstudiante.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[] {"Codigo", "Nombre", "Correo"}));
	}
	
	public void cargarTablaDeuda(int posE){
		
		ArrayList<clsDeuda> lstAuxD = this.auxLst.get(posE).getLstDeudas();
		Object matriz [][] = new Object[lstAuxD.size()][3];
		for (int i=0; i<lstAuxD.size();i++){
			matriz[i][0]= lstAuxD.get(i).getCodigo();
			matriz[i][1]= lstAuxD.get(i).getDescripcion();
			matriz[i][2]= lstAuxD.get(i).getValor();
		}
	tDeuda.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[] {"Codigo", "Descripcion", "Valor"}));
	}
	
}//fin de clase
