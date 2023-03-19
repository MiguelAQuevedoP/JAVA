/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajapplet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JApplet;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author migue
 */
public class calJApplet extends JApplet implements ActionListener{

    JButton suma,resta,producto,division;
    JTextField tfNum1,tfNum2,tfResultado;
    JLabel LNum1,LNum2,LResultado;
    private double num1,num2,resultado;
    
    @Override
    public void init() {
        
        LResultado = new JLabel("RESULTADO:");
        LResultado.setBounds(200, 10, 100, 20);
        LNum1 = new JLabel("PRIMER DIGITO:");
        LNum1.setBounds(30, 10, 100, 20);
        LNum2 = new JLabel("SEGUNDO DIGITO:");
        LNum2.setBounds(30, 40, 100, 20);
        
        tfResultado = new JTextField();
        tfResultado.setBounds(200,40,100,20);
        tfNum1 = new JTextField();
        tfNum1.setBounds(140,10,40,20);
        tfNum2 = new JTextField();
        tfNum2.setBounds(140,40,40,20);
        
        suma = new JButton("SUMA");
        suma.setBounds(30,70,100,20);
        
        resta = new JButton("RESTA");
        resta.setBounds(30, 100, 100, 20);
        
        producto = new JButton("PRODUCTO");
        producto.setBounds(30,130,100,20);
        
        division = new JButton("DIVISION");
        division.setBounds(30,160,100,20);
        
        add(suma);
        add(resta);
        add(producto);
        add(division);
        
        add(LResultado);
        add(LNum1);
        add(LNum2);
        
        add(tfResultado);
        add(tfNum1);
        add(tfNum2);
        
        suma.addActionListener(this::sumaActionPerformed);
        resta.addActionListener(this::restActionPerformed);
        producto.addActionListener(this::productoActionPerformed);
        division.addActionListener(this::divisionActionPerformed);
        setLayout(null);
    }

    // TODO overwrite start(), stop() and destroy() methods

    public void sumaActionPerformed(ActionEvent e) {
        suma();
    }
    public void restActionPerformed(ActionEvent e) {
        resta();
    }
    public void productoActionPerformed(ActionEvent e) {
        producto();
    }
    public void divisionActionPerformed(ActionEvent e) {
        division();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void suma(){
        num1 = Double.parseDouble(tfNum1.getText());
        num2 = Double.parseDouble(tfNum2.getText());
        resultado = num1+num2;
        tfResultado.setText(""+resultado);
    }
    public void resta(){
        num1 = Double.parseDouble(tfNum1.getText());
        num2 = Double.parseDouble(tfNum2.getText());
        resultado = num1-num2;
        tfResultado.setText(""+resultado);
    }
    public void producto(){
        num1 = Double.parseDouble(tfNum1.getText());
        num2 = Double.parseDouble(tfNum2.getText());
        resultado = num1*num2;
        tfResultado.setText(""+resultado);
    }
    public void division(){
        num1 = Double.parseDouble(tfNum1.getText());
        num2 = Double.parseDouble(tfNum2.getText());
        resultado = num1/num2;
        tfResultado.setText(""+resultado);
    }
    
}
