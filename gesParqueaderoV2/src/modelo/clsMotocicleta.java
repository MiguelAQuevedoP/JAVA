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
public class clsMotocicleta extends clsVehiculo {

    //ATRIBUTOS
    private eTipoCaja caja;
    private clsParqueadero refParqueadero;
    //REFERENCIAS Y/O LISTADOS

    //CONTRUCTORES
    public clsMotocicleta(String placa, String color, String cilindraje, eTipoCaja caja) {
        super(placa, color, cilindraje);
        this.caja = caja;
    }

    public clsMotocicleta() {
    }

    //GETTERS & SETTERS
    public eTipoCaja getCaja() {
        return caja;
    }

    public void setCaja(eTipoCaja caja) {
        this.caja = caja;
    }

    public clsParqueadero getRefParqueadero() {
        return refParqueadero;
    }

    public void setRefParqueadero(clsParqueadero refParqueadero) {
        this.refParqueadero = refParqueadero;
    }

    //METODOS
    @Override
    public String toString() {
        String info = "";
        info = "Placa: " + super.getPlaca()
                + "\nColor: " + super.getColor()
                + "\nCilindraje: " + super.getCilindraje()
                + "\nTipo de caja " + caja;
        return info;
    }

}
