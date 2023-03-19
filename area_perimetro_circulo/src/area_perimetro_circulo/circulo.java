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
public class circulo {
    
    private int radio;
    
    //clase Integer se puede nulear i=null
    
    //constuctor
    public circulo (int radio){
        this.radio=radio; //atributos
    }
    
    //getters y setters
    
    public int getRadio(){
        return this.radio;
    }
    
    public void setRadio(int radio){
        this.radio=radio;
    }
    
    //Metodos
    
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
