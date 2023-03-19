/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapplet;


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
public class JAppletOne extends JApplet implements ActionListener {

    JButton b;
    JTextField tf;
    final int radius = 25;
    @Override
    
    public void init() {
        tf = new JTextField();
        tf.setBounds(30,40,150,20);
        b = new JButton("Click");
        b.setBounds(80,150,70,40);
        add(b);
        add(tf);
        b.addActionListener(this);
        setLayout(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome"); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void paint (Graphics gr){
        gr.setColor(Color.red);
        gr.drawOval(50,50,radius*4,radius*4);
        gr.fillOval(100, 50, radius*2, radius*2);
    }
}
