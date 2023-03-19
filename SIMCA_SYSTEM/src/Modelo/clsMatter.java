package Modelo;

public class clsMatter {
    //DECLARACION DE VARIABLES
    private String nombre;
    private int creditos;
    private int semestre;
    private int Codigo;
    private String Carrera;

    public clsMatter(int Codigo,String nombre, int creditos, int semestre,String Carrera) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.semestre = semestre;
        this.Carrera = Carrera;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }   
}

