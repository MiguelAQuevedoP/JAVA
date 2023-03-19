package Modelo;

public class clsQualification {
    
   //DECLARACION DE VARIABLES
    private int codigo;
    private double calificacion;
    private String Materia;
    private double porcentaje;
    private String actividad;
    
    //CONSTRUCTOR
    public clsQualification(int codigo, double calificacion, String Materia, double porcentaje, String actividad) {
        this.codigo = codigo;
        this.calificacion = calificacion;
        this.Materia = Materia;
        this.porcentaje = porcentaje;
        this.actividad = actividad;
    }
    
    //GETTERS AND SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
