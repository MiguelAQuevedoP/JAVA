package modelo;

/**
 * @author Miguel Antonio Quevedo Pantoja
 * @mail mquevedo@unicauca.edu.co
 */

import java.util.ArrayList;

public class clsParqueadero {
    //ATRIBUTOS
    //atributos de clase

    private String direccion;
    private String nombre;
    //referencias y/o listados
    private ArrayList<clsVehiculo> lstVehiculos;
    //METODOS
    //constructores

    public clsParqueadero() {
        this.lstVehiculos = new ArrayList<clsVehiculo>();
    }

    public clsParqueadero(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.lstVehiculos = new ArrayList<clsVehiculo>();
    }
    //getters & setters

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<clsVehiculo> getLstVehiculos() {
        return lstVehiculos;
    }

    public void setLstVehiculos(ArrayList<clsVehiculo> lstVehiculos) {
        this.lstVehiculos = lstVehiculos;
    }

    
    //metodos generales
    public void agregarVehiculo(clsVehiculo objVehiculo){
        this.lstVehiculos.add(objVehiculo);
        objVehiculo.setRefParqueadero(this);
    }
    
}
