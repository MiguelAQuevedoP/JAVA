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
public class clsVehiculo {
    //ATRIBUTOS
    public String placa, color, cilindraje;
    //CONTRUCTORES

    public clsVehiculo(String placa, String color, String cilindraje) {
        this.placa = placa;
        this.color = color;
        this.cilindraje = cilindraje;
    }
    public clsVehiculo() {
        
    }
    //GETTERS & SETTERS
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    //METODOS
    
}
