package principalParqueadero;

//El automóvil, es un tipo de vehículo, por lo que heredará sus atributos y
//y métodos. A su vez, tendrá sus propias carácterísticas.

public class automóvil extends vehículo {
   
//Atributos de la clase automóvil.
    private int numeroDePuertas;
    
//Métodos constructores

    public automóvil(int numeroDePuertas, String placa, String color, float cilindraje) {
        super(placa, color, cilindraje);
        this.numeroDePuertas = numeroDePuertas;
    }

//Métodos Get

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

//Métodos Set

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
    
    
    
}
