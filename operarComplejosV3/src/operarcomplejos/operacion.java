/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operarcomplejos;

import java.util.Scanner;

/**
 *
 * @author Miguel Quevedo
 * correo: mquevedo@unicauca.edu.co
 * 
 */

public class operacion {
    private int a,b,c,d,operacion,numero,option,real,complejo;
    char signo;
    //CONSTRUCTOR
    public operacion() {
        
    }
    public operacion(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    //GETTER AND SETTER
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getComplejo() {
        return complejo;
    }

    public void setComplejo(int complejo) {
        this.complejo = complejo;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }
    
    public int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        numero = Integer.parseInt(sc.nextLine());
        return numero;
    }
    public char signo(int numId){
        if(numId>=0){
            setSigno('+');
        }
        else{
            setSigno(' ');
        }
        return signo;
    }
    public void operations(){
        System.out.println("Ingresar valor real 1: ");
        pedirNumero();
        setA(numero);
        System.out.println("Ingresar valor imaginario 1: ");
        pedirNumero();
        setB(numero);
        System.out.println("Ingresar valor real 2: ");
        pedirNumero();
        setC(numero);
        System.out.println("Ingresar valor imaginario 2: ");
        pedirNumero();
        setD(numero);
        signo(b);
        System.out.println("Primer numero complejo: z = "+a+getSigno()+b+"j");
        signo(d);
        System.out.println("Segundo numero complejo: z = "+c+getSigno()+d+"j");
        boolean flag = true;
        while(flag){
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. producto");
            System.out.println("4. division");
            System.out.println("5. salir");
            pedirNumero();
            setOption(numero);
            
            switch(option){
                case 1: 
                    real = a+c;
                    complejo = b+d;
                    signo(complejo);
                    System.out.println("resultado suma : z = "+real+getSigno()+complejo+"j");
                    break;
                case 2: 
                    real = a-c;
                    complejo = b-d;
                    signo(complejo);
                    System.out.println("resultado resta : z = "+real+getSigno()+complejo+"j");
                    break;
                case 3: 
                    real = (a*c)-(b*d);
                    complejo = (a*d+b*c);
                    signo(complejo);
                    System.out.println("resultado producto : z = "+real+getSigno()+complejo+"j");
                    break;
                case 4: 
                    real = ((a*c)+(b*d))/((c*c)+(d*d));
                    complejo = ((b*c)-(a*d))/((c*c)+(d*d));
                    signo(complejo);
                    System.out.println("resultado division : z = "+real+getSigno()+complejo+"j");
                    break;
                case 5:
                flag = false;
                System.out.println("syntax error");
                System.exit(0);
                break;
            }
        }
        
         
    }
}
