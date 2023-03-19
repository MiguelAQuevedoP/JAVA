package principalParqueadero;

//La clase vehículo, hace referencia a un vehículo dentro del parqueadero.
//Existen dos tipos de vehículos posibles, por lo cual en esta clase solamente
//se definen los atributos que el automóvil y la motocicleta heredarán. 

public class vehículo {
 
//Atributos de la clase vehículo
   private String placa;
   private String color;
   private float cilindraje; 
   
//Métodos constructores

   public vehículo(String placa, String color, float cilindraje) 
   {
        this.placa = placa;
        this.color = color;
        this.cilindraje = cilindraje;
    }

//Métodos Get

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public float getCilindraje() {
        return cilindraje;
    }
    
//Métodos Set

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }
    
}
