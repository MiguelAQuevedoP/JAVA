package Modelo;

public class clsTeacher extends clsPerson{
    //DECLARACION DE VARIABLES
    private String Grado;
    
    public clsTeacher(String Grado, String Nombre, String Apellido, int Codigo, int Cedula, int dia, int mes, int anios) {
        super(Nombre, Apellido, Codigo, Cedula, dia, mes, anios);
        this.Grado = Grado;
    }

    //GETTERS AND SETTERS
    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    } 
}
