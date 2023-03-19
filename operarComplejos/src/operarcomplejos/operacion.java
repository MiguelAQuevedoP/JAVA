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
    
    public int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        numero = Integer.parseInt(sc.nextLine());
        return numero;
    }
    
    public void operations(){
        System.out.println("Ingresar valor real 1: ");
        pedirNumero();
        numero = a;
        System.out.println("Ingresar valor imaginario 1: ");
        pedirNumero();
        numero = b;
        System.out.println("Ingresar valor real 2: ");
        pedirNumero();
        numero = c;
        System.out.println("Ingresar valor imaginario 2: ");
        pedirNumero();
        numero = d;
        System.out.println("Primer numero complejo: z = "+a+"j"+b);
        System.out.println("Segundo numero complejo: z = "+a+"j"+b);
        boolean flag = true;
        while(flag){
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. producto(no realizado)");
            System.out.println("4. division(no realizado)");
            System.out.println("5. salir");
            pedirNumero();
            numero = option;
            
            switch(option){
                case 1: 
                    real = a+c;
                    complejo = b+d;
                    System.out.println("resultado suma : z = "+real+complejo+"j");
                    break;
                case 2: 
                    real = a-c;
                    complejo = b-d;
                    System.out.println("resultado resta : z = "+real+complejo+"j");
                    break;
                /*case 3: answer = first*second;
                System.out.println("resultado producto : "+answer);
                break;
                case 4: answer = first/second;
                System.out.println("resultado division : "+answer);
                break;*/
                case 5:
                flag = false;
                System.out.println("syntax error");
                System.exit(0);
                break;
            }
        }
        
         
    }
}
