package Modelo;

public class clsCourse {
    //DECLARACIÓN DE VARIABLES
    private String Nombre;
    private int C_Materia;
    private int Profesor;
    private int Tam;
    private int Codigo;
    private String Horario_1;
    private String Horario_2;
    private String Periodo;
    
    //CONSTRUCTOR
    public clsCourse(){
        
    }

    public clsCourse(String Nombre, int C_Materia, int Profesor, int Tam, int Codigo, String Horario_1, String Horario_2, String Periodo) {
        this.Nombre = Nombre;
        this.C_Materia = C_Materia;
        this.Profesor = Profesor;
        this.Tam = Tam;
        this.Codigo = Codigo;
        this.Horario_1 = Horario_1;
        this.Horario_2 = Horario_2;
        this.Periodo = Periodo;  
    } 
    
    //GETTERS AND SETTERS
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getC_Materia() {
        return C_Materia;
    }

    public void setC_Materia(int C_Materia) {
        this.C_Materia = C_Materia;
    }

    public int getProfesor() {
        return Profesor;
    }

    public void setProfesor(int Profesor) {
        this.Profesor = Profesor;
    }

    public int getTam() {
        return Tam;
    }

    public void setTam(int Tam) {
        this.Tam = Tam;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getHorario_1() {
        return Horario_1;
    }

    public void setHorario_1(String Horario_1) {
        this.Horario_1 = Horario_1;
    }

    public String getHorario_2() {
        return Horario_2;
    }

    public void setHorario_2(String Horario_2) {
        this.Horario_2 = Horario_2;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }  
}
