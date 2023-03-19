package modelo;

/**
 * @author Miguel Antonio Quevedo Pantoja
 * @mail mquevedo@unicauca.edu.co
 */

import java.util.ArrayList;

public class clsPersona {
    //ATRIBUTOS
    //atributos de clase

    private String nombre;
    //referencias y/o listados
    
    //METODOS
    //constructores

    public clsPersona() {
    }

    public clsPersona(String nombre) {
        this.nombre = nombre;
    }
    //getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
