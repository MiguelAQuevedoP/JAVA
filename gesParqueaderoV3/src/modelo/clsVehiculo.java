package modelo;

/**
 * @author Miguel Antonio Quevedo Pantoja
 * @mail mquevedo@unicauca.edu.co
 */

public class clsVehiculo {
    //ATRIBUTOS

    /**
     *Atributos protegidos ya que se encuentran en la clase madre
     */
    private eTipoCaja caja;
    private eNumPuertas puertas;
    private String placa, color, cilindraje;
    private clsParqueadero refParqueadero;
    //CONTRUCTORES

    public clsVehiculo(String placa, String color, String cilindraje, eTipoCaja caja, eNumPuertas puertas) {
        this.placa = placa;
        this.color = color;
        this.cilindraje = cilindraje;
        this.caja = caja;
        this.puertas = puertas;
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
    public eTipoCaja getCaja() {
        return caja;
    }

    public void setCaja(eTipoCaja caja) {
        this.caja = caja;
    }
    
    public eNumPuertas getNumPuertas() {
        return puertas;
    }

    public void setNumPuertas(eNumPuertas puertas) {
        this.puertas = puertas;
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
        info = "Placa: " + placa
                + "\nColor: " + color
                + "\nCilindraje: " + cilindraje
                + "\nTipo de caja " + caja
                + "\nNumero de puertas " + puertas;
        return info;
    }
}
