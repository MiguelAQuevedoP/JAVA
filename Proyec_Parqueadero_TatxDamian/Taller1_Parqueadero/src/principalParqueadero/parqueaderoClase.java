package principalParqueadero;
//Se importa el almacenamiento de los vehículos dentro del parqueadero.
import accesoDatosParqueadero.almacenamientoParqueadero;
import java.util.LinkedList;

//La clase parqueadero, corresponde al lugar donde se almacenan vehículos, 
//ya sea de tipo motocicleta o de tipo vehículos previamente descritos. Se     
//definen sus propias características y métodos.

//Se utiliza un linkedlist ya que se puede trabajar como un vector dinámico,no
//hay necesidad de definir su tamaño y se ajusta a los requerimientos del ejercicio.
//Además, se simplifica añadir elementos a una hoja de texto que a un arraylist.

public class parqueaderoClase {

    private String nombre;
    private int númeroAutomóviles;
    private int númeroMotocicletas;
    private LinkedList<vehículo> listaVehículos;
    
    
//Método Constructor 

    public parqueaderoClase(String nombre, int númeroAutomóviles, int númeroMotocicletas, LinkedList<vehículo> listaVehículos) {
        this.nombre = nombre;
        this.númeroAutomóviles = númeroAutomóviles;
        this.númeroMotocicletas = númeroMotocicletas;
        this.listaVehículos = listaVehículos;
    }

   
//Metodos Get

    public String getNombre() {
        return nombre;
    }

    public int getNúmeroAutomóviles() {
        return númeroAutomóviles;
    }

    public int getNúmeroMotocicletas() {
        return númeroMotocicletas;
    }
   

    public LinkedList<vehículo> getListaVehículos() {
        return listaVehículos;
    }
    
 //Métodos Set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNúmeroAutomóviles(int númeroAutomóviles) {
        this.númeroAutomóviles = númeroAutomóviles;
    }

    public void setNúmeroMotocicletas(int númeroMotocicletas) {
        this.númeroMotocicletas = númeroMotocicletas;
    }
   
    public void setListaVehículos(LinkedList<vehículo> listaVehículos) {
        this.listaVehículos = listaVehículos;
    }
    
//Métodos aplicados para el control del parqueadero    

//Se registra un vehículo con sus atributos respectivos, y se añade a la lista de Vehículos definida.
//Se emplea una bandera. Está en falso porque el vehículo a registrar no existe dentro de la lista
// de modo que permite añadir el vehículo al parqueadero. Si estuviese en true, indica qué el vehículo
// ya se encuentra dentro del estacionamiento por lo que no permite su registro.    
    public boolean registarVehículo(vehículo objVehículo)
    {
        boolean bandera=false;
        bandera=this.listaVehículos.add(objVehículo); 
        almacenamientoParqueadero.almacenarVehículo(this.listaVehículos,"vehículo.txt");
        return bandera;
    }
    
//Muestra la lista de vehículs dentro del parqueadero.    
    public LinkedList<vehículo> getListaVehículo()
    {
        return this.listaVehículos;
    }

//Se desea consultar un vehículo dentro del parqueadero, ya sea por placa o por cilindraje.

//Método de consulta de vehículos que recibe cómo parámetro la placa, con el fin de 
//buscar en la lista de vehículos si existe, es decir si está en el parqueadero. En 
//caso de que esté, la bandera se marca en true. Se utiliza el for, para que haga el 
//recorrido dentro de toda la lista.    
    public boolean consultarSiExisteVehículoPlaca(String placa)
    {
        boolean bandera=false;
        
        for (int i = 0; i < this.listaVehículos.size(); i++)
        {
            if(placa.equals(listaVehículos.get(i).getPlaca()))
            {
                bandera=true;
                break;
            }
        }
        
        return bandera;
    }
//Método de consulta de vehículos que recibe cómo parámetro el cilindraje, con el fin de 
//buscar en la lista de vehículos si existe, es decir si está en el parqueadero. En 
//caso de que esté, la bandera se marca en true. Se utiliza el for, para que haga el 
//recorrido dentro de toda la lista.   
    public boolean consultarSiExisteVehículoCilindraje(String cilindraje)
       {
           boolean bandera=false;

           for (int i = 0; i < this.listaVehículos.size(); i++)
           {
            if(cilindraje.equals(listaVehículos.get(i).getCilindraje()))
            {
                bandera=true;
                break;
            }
        }
        
        return bandera;
    }
//Método qué permite saber cuántos vehículos se encuentran dentro del parqueadero. Para 
// eso, identifica el número de elementos que se encuentran en la lista. El total
// se inicializa en cero y recorre toda la linkedlist 
    public float consultarNúmeroTotalVehículos()
    {
        float total;
        total=0;
        
        total=this.listaVehículos.size();
      
        return total;         
    }
    
// Método que permite cambiar el color de un vehículo cualquiera, identificándolo
// previamente mediante la placa.    
   
    } 
    
    
   


 
