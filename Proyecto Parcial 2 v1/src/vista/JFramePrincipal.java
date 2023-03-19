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
	private JPanel panelCentral;
	private clsBanco objBanco;
	
	private JPanel contentPane;
	
	public JFramePrincipal() {
		
		this.objBanco =  new clsBanco(89070519, "BANCO CAJITA FELIZ", "Cra. Sexta", 36245666);

		this.panelCliente = new JPanelCliente(this.objBanco);
		this.panelCuenta = new JPanelCuenta(this.objBanco);
		this.panelInforme = new JPanelInforme(this.objBanco);
		this.panelEmpleado = new JPanelEmpleado(this.objBanco);
		this.panelSaldo = new JPanelSaldo(this.objBanco);
		
		this.iniciarComponentes();
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
		btnCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarCuenta();
			}
		});
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarCliente();
			}
		});
		
		JButton btnInforme = new JButton("Informe");
		btnInforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarInforme();
			}
		});
		
		JButton btnEmpleado = new JButton("Empleado");
		btnEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarEmpleado();
			}
		});
		
		JButton btnSaldoCliente = new JButton("Saldo Cliente");
		btnSaldoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lanzarSaldo();
			}
		});
		GroupLayout gl_panelIzquierdo = new GroupLayout(panelIzquierdo);
		gl_panelIzquierdo.setHorizontalGroup(
			gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelIzquierdo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCliente, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
						.addComponent(btnCuenta, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
						.addComponent(btnInforme, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
						.addComponent(btnSaldoCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEmpleado, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
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
					.addContainerGap(117, Short.MAX_VALUE))
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
		this.panelCentral.add(this.panelCliente,BorderLayout.CENTER);
		dibujar();
		
	}
	
	public void lanzarCuenta(){
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelInforme);
		this.panelCentral.remove(panelEmpleado);
		this.panelCentral.remove(panelSaldo);
		this.panelCentral.add(this.panelCuenta,BorderLayout.CENTER);
		dibujar();
	}
	
	public void lanzarInforme(){
		this.panelCentral.remove(panelCuenta);
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelEmpleado);
		this.panelCentral.remove(panelSaldo);
		this.panelCentral.add(this.panelInforme,BorderLayout.CENTER);
		dibujar();
	}
	
	public void lanzarEmpleado(){
		this.panelCentral.remove(panelCuenta);
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelInforme);
		this.panelCentral.remove(panelSaldo);
		this.panelCentral.add(this.panelEmpleado,BorderLayout.CENTER);
		dibujar();
	}
	public void lanzarSaldo(){
		this.panelCentral.remove(panelCuenta);
		this.panelCentral.remove(panelCliente);
		this.panelCentral.remove(panelInforme);
		this.panelCentral.remove(panelEmpleado);
		this.panelCentral.add(this.panelSaldo,BorderLayout.CENTER);
		dibujar();
	}
	public void dibujar(){
		this.panelCentral.revalidate();
		this.panelCentral.repaint();
	}
}//FIN DE CLASE

