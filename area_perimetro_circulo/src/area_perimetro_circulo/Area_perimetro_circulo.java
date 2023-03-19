/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_perimetro_circulo;

public class Area_perimetro_circulo {

    public static void main(String[] args) {
        int radio=6;
        double Area=0;
        double Perimetro;
        
        circulo circulo_1 = new circulo(radio);
       
        Area=circulo_1.calcularArea();
        Perimetro=circulo_1.calcularPerimetro();
        
        System.out.println("El área del círculo es: " + Area + ", El perimetro del círculo es: " + Perimetro);
      
       
      
    }
    
}
