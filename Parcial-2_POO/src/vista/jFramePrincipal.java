package vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;

import modelo.*;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.UIManager;


public class jFramePrincipal extends JFrame {


	private JPanel panelPrincipal;
	private jPanelCliente panelCliente;
	private jPanelCuenta panelCuenta;
	private jPanelInforme panelInforme;
	private JPanel panelCentral;
	private clsBanco objBanco;
	
	public jFramePrincipal() {
		
		this.objBanco = new clsBanco(123,"Banco Central","Calle  123",8888);
		
		this.panelCliente= new jPanelCliente(this.objBanco);
		this.panelCuenta = new jPanelCuenta(this.objBanco);
		this.panelInforme = new jPanelInforme(this.objBanco);
		
		
		this.iniciarComponentes();
		
	}
		
	
	public void iniciarComponentes(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(255, 255, 204));
		panelSuperior.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblRegistroBanco = new JLabel("REGISTRO BANCO");
		lblRegistroBanco.setForeground(new Color(51, 51, 51));
		lblRegistroBanco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSuperior.add(lblRegistroBanco);
		
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setBackground(new Color(102, 0, 0));
		panelIzquierdo.setForeground(Color.BLACK);
		panelIzquierdo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelPrincipal.add(panelIzquierdo, BorderLayout.WEST);
		
		//BOTONES --------------------------------------------
		
		JButton btnCuenta = new JButton("Cuenta");
		btnCuenta.setBackground(Color.WHITE);
		btnCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarCuenta();
			}

		});
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setBackground(Color.WHITE);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarCliente();
			}

		});
		
		JButton btnInforme = new JButton("Informe");
		btnInforme.setBackground(Color.WHITE);
		btnInforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lanzarInforme();
			}

		});
		//----------------------------------------------------
		GroupLayout gl_panelIzquierdo = new GroupLayout(panelIzquierdo);
		gl_panelIzquierdo.setHorizontalGroup(
			gl_panelIzquierdo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelIzquierdo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCliente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(btnCuenta, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(btnInforme, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelIzquierdo.setVerticalGroup(
			gl_panelIzquierdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelIzquierdo.createSequentialGroup()
					.addGap(26)
					.addComponent(btnCliente)
					.addGap(41)
					.addComponent(btnCuenta)
					.addGap(44)
					.addComponent(btnInforme)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		panelIzquierdo.setLayout(gl_panelIzquierdo);
		
		
		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		panelCentral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelPrincipal.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));
	}

	private void lanzarCuenta() {
		
		this.panelCentral.remove(this.panelCliente);
		this.panelCentral.remove(this.panelInforme);
		this.panelCentral.add(this.panelCuenta,BorderLayout.CENTER);
		this.panelCentral.revalidate();
		this.panelCentral.repaint();
	}	

	private void lanzarCliente() {
		this.panelCentral.remove(this.panelCuenta);
		this.panelCentral.remove(this.panelInforme);
		this.panelCentral.add(this.panelCliente,BorderLayout.CENTER);
		this.panelCentral.revalidate();
		this.panelCentral.repaint();
	}

	private void lanzarInforme() {
		this.panelCentral.remove(this.panelCuenta);
		this.panelCentral.remove(this.panelCliente);
		this.panelCentral.add(this.panelInforme,BorderLayout.CENTER);
		this.panelCentral.revalidate();
		this.panelCentral.repaint();
		
	}
	
	
}
	
	

	

