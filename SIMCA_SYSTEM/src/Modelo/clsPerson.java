package Modelo;

import Conexion.SimcaDAO;
import java.util.ArrayList;

public class clsPerson {
    
    //DECLARACION DE VARIABLES
    private String Nombre;
    private String Apellido;
    private int Codigo;
    private int Cedula;
    private int dia;
    private int mes;
    private int anios;
    private SimcaDAO MPersonas;
    private  ArrayList<clsPerson> P;
    
    //CONSTRUCTOR
    public clsPerson(String Nombre, String Apellido, int Codigo, int Cedula, int dia, int mes, int anios) {
        this.P  = new ArrayList<clsPerson>();
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Codigo = Codigo;
        this.Cedula = Cedula;
        this.dia= dia;
        this.mes= mes;
        this.anios=anios;
        MPersonas = new SimcaDAO();  
    }
    
    //GETTERS AND SETTERS
    public ArrayList<clsPerson> getP() {
        return P;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getCodigo() {
        return Codigo;
    }


    public int getCedula() {
        return Cedula;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnios() {
        return anios;
    }

    public SimcaDAO getMPersonas() {
        return MPersonas;
    }

    public void setP(ArrayList<clsPerson> P) {
        this.P = P;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }


    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public void setMPersonas(SimcaDAO MPersonas) {
        this.MPersonas = MPersonas;
    }
    
    //METODOS Y PROCEDIMIENTOS
    public int T_Estudiante(){
        int Size = 0;
        if(!this.MPersonas.VerPersonas().isEmpty()){
            for(int i=0;i<this.MPersonas.VerPersonas().size() ;i++){
                if(this.MPersonas.VerPersonas().get(i) instanceof clsStudent){
                   Size++;
                }
            }
        }
        return Size;
    }
}
