/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;

/**
 *
  * @author Tatiana Garces
 */
public class clsAutomovil extends clsVehiculo{
    
    //ATRIBUTOS
    private int numPuertas;
    public int n, i;
    //CONTRUCTORES
    public clsAutomovil(String placa, String color, String cilindraje) {
        super(placa, color, cilindraje);
    }
    
    public clsAutomovil() {
    }
    
    //GETTERS & SETTERS
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    //METODOS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\nPlaca: ");
        sb.append(placa);
        sb.append("\ncolor: ");
        sb.append(color);
        sb.append("\nCilindraje: ");
        sb.append(cilindraje);
        sb.append("\nnumero de puertas: ");
        sb.append(numPuertas);    
        return sb.toString();
    }  
}
