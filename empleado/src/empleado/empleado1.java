/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author INGESIS
 */
public class empleado1 {
    private String nombre;
    private String apellido;
    private int edad;
    private int horas;
    private int salario;

    public empleado1() {
        
    }
    public empleado1(String nombre, String apellido, int edad, int horas, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horas = horas;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int calcularSalario(int hora){
        
        setHoras(hora);
        
        if (horas <= 40){
            setSalario(horas*16000);
        }
        else{
            setSalario((40*16000)+((horas-40)*20000));
        }
        return salario;
    }
}
