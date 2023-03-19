/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcancia;
/**
 *
 * @author INGESIS
 */
public class Alcancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clsMoneda objMoneda = new clsMoneda();
        clsAlcancia objAlcancia = new clsAlcancia();
        
        System.out.println("*****SIMULACION DE ALCANCIA*****");
        //System.out.println("Digite la opción que desea para la moneda a ingresar");
        System.out.println("1. INGRESAR MONEDA DE 50");
        System.out.println("2. INGRESAR MONEDA DE 100");
        System.out.println("3. INGRESAR MONEDA DE 200");
        System.out.println("4. INGRESAR MONEDA DE 500");
        System.out.println("5. INGRESAR MONEDA DE 1000");
        System.out.println("6. CALCULAR VALOR TOTAL DE ALCANCIA");
        System.out.println("7. VACIAR ALCANCIA");
        System.out.println("8. CERRAR ALCANCIA");
            
        objAlcancia.MenuCasos();
    }
    
}
