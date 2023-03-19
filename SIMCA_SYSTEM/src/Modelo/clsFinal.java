package Modelo;

public class clsFinal {
    //DECLARACION DE VARIABLES
    double Definitiva;
    int Codigo;
    int Curso;
    
    //CONSTRUCTOR
    public clsFinal(double Definitiva, int Codigo, int Curso) {
        this.Definitiva = Definitiva;
        this.Codigo = Codigo;
        this.Curso = Curso;
    }
    
    //GETTERS AND SETTERS
    public double getDefinitiva() {
        return Definitiva;
    }

    public void setDefinitiva(double Definitiva) {
        this.Definitiva = Definitiva;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCurso() {
        return Curso;
    }

    public void setCurso(int Curso) {
        this.Curso = Curso;
    }   
}
