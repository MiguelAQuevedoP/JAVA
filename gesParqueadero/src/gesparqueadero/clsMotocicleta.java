/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesparqueadero;


/**
 *
 * @author migue
 */
public class clsMotocicleta extends clsVehiculo{
    //ATRIBUTOS
    private int caja;
    //CONTRUCTORES
    public clsMotocicleta(String placa, String color, String cilindraje) {
        super(placa, color, cilindraje);
    }

    public clsMotocicleta() {
    }
    //GETTERS & SETTERS
    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
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
        sb.append("\nTipo de caja: ");
        sb.append(caja);    
        return sb.toString();
    }  

    
}
