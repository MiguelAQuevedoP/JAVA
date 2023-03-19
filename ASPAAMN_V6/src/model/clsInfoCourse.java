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
public class clsInfoCourse {
    
    //ATRIBUTOS
    private Long  codeTeacher;
    private String Code, name;
    private int availabity;

    //CONSTRUCTORES
    public clsInfoCourse() {
        
    }
    public clsInfoCourse(String Code, Long codeTeacher, String name, int availabity) {
        this.Code = Code;
        this.codeTeacher = codeTeacher;
        this.name = name;
        this.availabity = availabity;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public Long getCodeTeacher() {
        return codeTeacher;
    }

    public void setCodeTeacher(Long codeTeacher) {
        this.codeTeacher = codeTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailabity() {
        return availabity;
    }

    public void setAvailabity(int availabity) {
        this.availabity = availabity;
    }

    @Override
    public String toString() {
        return "clsInfoCourse{" + "\nCode=" + Code +
                "\ncodeTeacher=" + codeTeacher +
                "\nname=" + name +
                "\navailabity=" + availabity + '}';
    }
    
    
}
