/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author migue
 */
public class clsAutomovil extends clsVehiculo {

    //ATRIBUTOS
    private int numPuertas;
    private clsParqueadero refParqueadero;

    //CONTRUCTORES
    public clsAutomovil(String placa, String color, String cilindraje, int numPuertas) {
        super(placa, color, cilindraje);
        this.numPuertas = numPuertas;
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

    public clsParqueadero getRefParqueadero() {
        return refParqueadero;
    }

    public void setRefParqueadero(clsParqueadero refParqueadero) {
        this.refParqueadero = refParqueadero;
    }
    
    //METODOS GENERALES
    @Override
    public String toString() {
        String info = "";
        info = "Placa: " + super.getPlaca()
                + "\nColor: " + super.getColor()
                + "\nCilindraje: " + super.getCilindraje()
                + "\nNumero de puertas " + numPuertas;
        return info;
    }
}
