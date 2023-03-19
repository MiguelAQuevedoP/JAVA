
package principalParqueadero;

//La motocicleta, es un tipo de vehículo, por lo que heredará sus atributos y
//y métodos. A su vez, tendrá sus propias carácterísticas.

public class motocicleta extends vehículo{
    
//Atributos de la clase motocicleta   
    private String tipoDeCaja;
    
//Métodos Constructores   

    public motocicleta(String tipoDeCaja, String placa, String color, float cilindraje) {
        super(placa, color, cilindraje);
        this.tipoDeCaja = tipoDeCaja;
    }

//Métodos Get

    public String getTipoDeCaja() {
        return tipoDeCaja;
    }

//Métodos Set

    public void setTipoDeCaja(String tipoDeCaja) {
        this.tipoDeCaja = tipoDeCaja;
    }

   
}
