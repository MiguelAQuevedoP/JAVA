/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author INGESIS
 */
public class Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        empleado1 e1 = new empleado1("Miguel","Quevedo", 21, 40, 640000);
        System.out.println("Empleado Miguel: "+e1.getSalario());
        empleado1 e2 = new empleado1();
        System.out.println("Empleado Fulanito: "+e2.calcularSalario(42));
        e1.calcularSalario(20);
        System.out.println("Empleado Miguel: "+e1.getSalario());
        int suma;
        suma = e2.calcularSalario(42)+e1.calcularSalario(20);
        System.out.println(suma);
        
    }
    
}
