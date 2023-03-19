package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import modelo.*;
import modelo.*;



public class JFramePrincipal extends JFrame {

	private JPanel panelPrincipal;
	private JPanelCliente panelCliente;
	private JPanelCuenta panelCuenta;
	private JPanelInforme panelInforme;
	private JPanel panelCentral;
	private clsBanco objBanco;
	
	
	public JFramePrincipal() {
	    this.objBanco = new clsBanco(164352,"BancoPrincipal","Calle12 #7-34",8237645);
		this.panelCliente = new JPanelCliente (this.objBanco);
		this.panelCuenta = new JPanelCuenta (this.objBanco);
		this.panelInforme = new JPanelInforme (this.objBanco);
		this.inciarComponentes ();
	}
public void inciarComponentes () {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 543, 389);
	panelPrincipal = new JPanel();
	panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(panelPrincipal);
	panelPrincipal.setLayout(new BorderLayout(0, 0));
	
	JPanel panelSuperior = new JPanel();
	panelSuperior.setBorder(new LineBorder(new Color(0, 0, 0)));
	panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
	
	JLabel lblBancoPrincipal = new JLabel("BANCO PRINCIPAL ");
	panelSuperior.add(lblBancoPrincipal);
	
	JPanel panelIzquierdo = new JPanel();
	panelIzquierdo.setBorder(new LineBorder(new Color(0, 0, 0)));
	panelPrincipal.add(panelIzquierdo, BorderLayout.WEST);
	
	JButton btnCliente = new JButton("CLIENTE");
	btnCliente.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			registrarCliente ();
		}
	});
	
	JButton btnCuenta = new JButton("CUENTA");
	btnCuenta.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			CrearCuenta ();
		}
	});
	
	JButton btnInforme = new JButton("INFORME");
	btnInforme.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			mostrarInforme ();
		}
	});
	GroupLayout gl_panelIzquierdo = new GroupLayout(panelIzquierdo);
	gl_panelIzquierdo.setHorizontalGroup(
		gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
			.addComponent(btnCuenta, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
			.addComponent(btnCliente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
			.addComponent(btnInforme, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
	);
	gl_panelIzquierdo.setVerticalGroup(
		gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panelIzquierdo.createSequentialGroup()
				.addGap(5)
				.addComponent(btnCliente)
				.addGap(54)
				.addComponent(btnCuenta)
				.addGap(51)
				.addComponent(btnInforme)
				.addContainerGap(44, Short.MAX_VALUE))
	);
	panelIzquierdo.setLayout(gl_panelIzquierdo);
	
	panelCentral = new JPanel();
	panelCentral.setBorder(new LineBorder(new Color(0, 0, 0)));
	panelPrincipal.add(panelCentral, BorderLayout.CENTER);
}
 public void registrarCliente (){
	 this.panelCentral.remove(this.panelCuenta);
	 this.panelCentral.remove(this.panelInforme);
	 this.panelCentral.add(this.panelCliente,BorderLayout.CENTER);
	 this.panelCentral.revalidate();
	 this.panelCentral.repaint ();
 }
 public void CrearCuenta () {
	 this.panelCentral.remove(this.panelCliente);
	 this.panelCentral.remove(this.panelInforme);
	 this.panelCentral.add(this.panelCuenta,BorderLayout.CENTER);
	 this.panelCentral.revalidate();
	 this.panelCentral.repaint ();
 }
 public void mostrarInforme () {
	 this.panelCentral.remove(this.panelCliente);
	 this.panelCentral.remove(this.panelCuenta);
	 this.panelCentral.add(this.panelInforme,BorderLayout.CENTER);
	 this.panelCentral.revalidate();
	 this.panelCentral.repaint ();
 }
}//fin de clase
