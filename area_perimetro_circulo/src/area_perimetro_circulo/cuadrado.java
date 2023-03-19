/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_perimetro_circulo;

/**
 *
 * @author INGESIS
 */
public class cuadrado {
    
    private int lado; //prvado por el encapsulamiento de los datos
    
    //constuctor
    
    public cuadrado(int lado){ 
        this.lado=lado; //atributo, deben ir todos los atributos inicializados
    }
   
    //getter y setters por cada atributo, permiten modificar la info de los atributos que son privados
    
    public int getLado(){ 
        return this.lado;
    }
    
    public void setLado(int lado){
        this.lado=lado;
    }
    
    public double calcularArea(){
        return lado*lado;
    }
    
    public double calcularPerimetro(){
        return lado*4;
    }
    

}
