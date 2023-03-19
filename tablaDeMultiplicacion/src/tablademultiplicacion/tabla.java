/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablademultiplicacion;

import java.util.Scanner;

/**
 *
 * @author Miguel Quevedo
 * correo: mquevedo@unicauca.edu.co
 * 
 */

public class tabla {
    private int numero;
    private int producto;
    //CONSTRUCTOR
    public tabla(int numero, int producto) {
        this.numero = numero;
        this.producto = producto;
    }
    
    public tabla() {
        
    }
    //GETTER AND SETTER

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
    
    //PIDE EL NUMERO CON EL CUAL SE VA A REALIZAR LA OPERACIÓN
    public int pedirNumero(){
        System.out.println("Ingresar valor: ");
        Scanner sc = new Scanner(System.in);
        numero = Integer.parseInt(sc.nextLine());
    return numero;
    }
    //GENERA LA TABLA DESDE CERO HASTA DIEZ CON EL NÚMERO ELEGIDO ANTERIORMENTE
    public void generaTabla(){
        System.out.println("Producto de 3"+numero);
        for(int i=0; i<11; i++){
            producto=numero*i;
            System.out.println(numero+" * "+i+" = "+producto);
        }
    }
}
