/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

public class clsParqueadero {
    //ATRIBUTOS
    //atributos de clase

    private String direccion;
    private String nombre;
    //referencias y/o listados
    private ArrayList<clsMotocicleta> lstMotos;
    private ArrayList<clsAutomovil> lstAutos;
    //METODOS
    //constructores

    public clsParqueadero() {
        this.lstMotos = new ArrayList<clsMotocicleta>();
        this.lstAutos = new ArrayList<clsAutomovil>();
    }

    public clsParqueadero(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.lstMotos = new ArrayList<clsMotocicleta>();
        this.lstAutos = new ArrayList<clsAutomovil>();
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

    public ArrayList<clsMotocicleta> getLstMotos() {
        return lstMotos;
    }

    public void setLstMotos(ArrayList<clsMotocicleta> lstMotos) {
        this.lstMotos = lstMotos;
    }

    public ArrayList<clsAutomovil> getLstAutos() {
        return lstAutos;
    }

    public void setLstAutos(ArrayList<clsAutomovil> lstAutos) {
        this.lstAutos = lstAutos;
    }
    //metodos generales
    public void agregarAuto(clsAutomovil objAuto){
        this.lstAutos.add(objAuto);
        objAuto.setRefParqueadero(this);
    }
    public void agregarMoto(clsMotocicleta objMoto){
        this.lstMotos.add(objMoto);
        objMoto.setRefParqueadero(this);
    }
}
