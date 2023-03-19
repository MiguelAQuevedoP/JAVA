package Modelo;

public class clsEnroll {
    //DECLARACION DE VARIABLES
    private int Codigo;
    private int Estudiante;
    private int Curso;
    
    //CONSTRUCTOR
    public clsEnroll(int Codigo, int Estudiante, int Curso) {
        this.Codigo = Codigo;
        this.Estudiante = Estudiante;
        this.Curso = Curso;
    }
    
    //GETTERS AND SETTER
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(int Estudiante) {
        this.Estudiante = Estudiante;
    }

    public int getCurso() {
        return Curso;
    }

    public void setCurso(int Curso) {
        this.Curso = Curso;
    }  
}
