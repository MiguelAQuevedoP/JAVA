package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import modelo.*;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JFramePrincipal extends JFrame {

	private JPanel panelPrincipal;
	private JPanelCliente panelCliente;
	private JPanelCuenta panelCuenta;
	private JPanelInforme panelInforme;
	private JPanelEmpleado panelEmpleado;
	private JPanelSaldo panelSaldo;
	private JPanelSueldo panelSueldo;
	private JPanel panelCentral;
	private clsBanco objBanco;
	
	private JPanel contentPane;
	
	public JFramePrincipal() {
		
		this.inicializacion();
		this.iniciarComponentes();
		
	}
	
	public void inicializacion(){
		
		this.objBanco =  new clsBanco(89070519, "BANCO CAJITA FELIZ", "Cra. Sexta", 36245666);

		this.panelCliente = new JPanelCliente(this.objBanco);
		this.panelCuenta = new JPanelCuenta(this.objBanco);
		this.panelInforme = new JPanelInforme(this.objBanco);
		this.panelEmpleado = new JPanelEmpleado(this.objBanco);
		this.panelSaldo = new JPanelSaldo(this.objBanco);
		this.panelSueldo  = new JPanelSueldo(this.objBanco);
	}
	
	public void iniciarComponentes(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(204, 204, 255));
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblInformacionDelBanco = new JLabel("INFORMACION DEL BANCO");
		panelSuperior.add(lblInformacionDelBanco);
		
		JPanel panelIzquierdo = new JPanel();
		contentPane.add(panelIzquierdo, BorderLayout.WEST);
		
		JButton btnCuenta = new JButton("Cuenta");
		btnCuenta.setBackground(new Color(204, 204, 255));
		btnCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarCuenta();
			}
		});
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setBackground(new Color(204, 204, 255));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarCliente();
			}
		});
		
		JButton btnInforme = new JButton("Informe");
		btnInforme.setBackground(new Color(204, 204, 255));
		btnInforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarInforme();
			}
		});
		
		JButton btnEmpleado = new JButton("Empleado");
		btnEmpleado.setBackground(new Color(204, 204, 255));
		btnEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarEmpleado();
			}
		});
		
		JButton btnSaldoCliente = new JButton("Saldo Cliente");
		btnSaldoCliente.setBackground(new Color(204, 204, 255));
		btnSaldoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lanzarSaldo();
			}
		});
		
		JButton btnSueldoEmpleado = new JButton("Sueldo Empleado");
		btnSueldoEmpleado.setBackground(new Color(204, 204, 255));
		btnSueldoEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarSueldo();
			}
		});
		GroupLayout gl_panelIzquierdo = new GroupLayout(panelIzquierdo);
		gl_panelIzquierdo.setHorizontalGroup(
			gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelIzquierdo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCliente, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
						.addComponent(btnCuenta, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
						.addComponent(btnInforme, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
						.addComponent(btnSaldoCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEmpleado, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
						.addComponent(btnSueldoEmpleado))
					.addContainerGap())
		);
		gl_panelIzquierdo.setVerticalGroup(
			gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelIzquierdo.createSequentialGroup()
					.addGap(22)
					.addComponent(btnCliente)
					.addGap(18)
					.addComponent(btnCuenta)
					.addGap(18)
					.addComponent(btnEmpleado)
					.addGap(71)
					.addComponent(btnInforme)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSaldoCliente)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSueldoEmpleado)
					.addContainerGap(83, Short.MAX_VALUE))
		);
		panelIzquierdo.setLayout(gl_panelIzquierdo);
		
		panelCentral = new JPanel();
		panelCentral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));
		
	}
	public void lanzarCliente(){
		this.panelCentral.remove(panelCuenta);
		this.panelCentral.remove(panelInforme);
		this.panelCentral.remove(panelEmpleado);
		this.panelCentral.remove(panelSaldo);
		this.panelCentral.remove(panelSueldo);
		this.panelCentral.add(this.panelCliente,BorderLayout.CENTER);
		dibujar();
		
	}
	
	public void lanzarCuenta(){
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelInforme);
		this.panelCentral.remove(panelEmpleado);
		this.panelCentral.remove(panelSaldo);
		this.panelCentral.remove(panelSueldo);
		this.panelCentral.add(this.panelCuenta,BorderLayout.CENTER);
		dibujar();
	}
	
	public void lanzarInforme(){
		this.panelCentral.remove(panelCuenta);
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelEmpleado);
		this.panelCentral.remove(panelSaldo);
		this.panelCentral.remove(panelSueldo);
		this.panelCentral.add(this.panelInforme,BorderLayout.CENTER);
		dibujar();
	}
	
	public void lanzarEmpleado(){
		this.panelCentral.remove(panelCuenta);
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelInforme);
		this.panelCentral.remove(panelSaldo);
		this.panelCentral.remove(panelSueldo);
		this.panelCentral.add(this.panelEmpleado,BorderLayout.CENTER);
		dibujar();
	}
	
	public void lanzarSaldo(){
		this.panelCentral.remove(panelCuenta);
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelInforme);
		this.panelCentral.remove(panelEmpleado);
		this.panelCentral.remove(panelSueldo);
		this.panelCentral.add(this.panelSaldo,BorderLayout.CENTER);
		dibujar();
	}
	
	public void lanzarSueldo(){
		this.panelCentral.remove(panelCuenta);
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelInforme);
		this.panelCentral.remove(panelEmpleado);
		this.panelCentral.remove(panelSaldo);
		this.panelCentral.add(this.panelSueldo,BorderLayout.CENTER);
		dibujar();
	}
	
	public void dibujar(){
		this.panelCentral.revalidate();
		this.panelCentral.repaint();
	}
}//FIN DE CLASE

