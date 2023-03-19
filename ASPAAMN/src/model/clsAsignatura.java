/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 * 
 */
public class clsAsignatura {
    
    //ATRIBUTOS
    String code, name, prerequisite, credits;
    int semester;

    //CONSTRUCTORES
    public clsAsignatura() {
        
    }
    
    public clsAsignatura(String code, String name, String prerequisite, String credits, int semester) {
        this.code = code;
        this.name = name;
        this.prerequisite = prerequisite;
        this.credits = credits;
        this.semester = semester;
    }
    
    //GETTERS & SETTERS
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    //METODOS
    public String getInfo() {
		String info = "";
		info = "Codigo: "+code+
                    "\nNombre: "+ name +
				"\nPrerequisito: " + prerequisite +
				"\nCreditos: " + credits +
				"\nNota: " + semester;
		return info;
    }
    
}
