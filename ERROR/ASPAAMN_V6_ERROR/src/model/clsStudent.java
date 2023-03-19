/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 * 
 */
public class clsStudent {
    private String name, typeDocument, career, email, password,dateBirth;
    private ArrayList<clsStudent> lstStudents ;
    private long numDocument, codeStudent;

    public clsStudent() {
        this.lstStudents = new ArrayList<clsStudent>();
    }

    public clsStudent(String name, String typeDocument, String career, String email, String password, String dateBirth, long numDocument, long codeStudent) {
        this.name = name;
        this.typeDocument = typeDocument;
        this.career = career;
        this.email = email;
        this.password = password;
        this.dateBirth = dateBirth;
        this.numDocument = numDocument;
        this.codeStudent = codeStudent;
        this.lstStudents = new ArrayList<clsStudent>();
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public long getNumDocument() {
        return numDocument;
    }

    public void setNumDocument(long numDocument) {
        this.numDocument = numDocument;
    }

    public long getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(long codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<clsStudent> getLstStudents() {
        return lstStudents;
    }

    public void setLstStudents(ArrayList<clsStudent> lstStudents) {
        this.lstStudents = lstStudents;
    }
    
    public String getInfo() {
		String info = "";
		info = "Nombre: "+ name +
				"\nFecha de nacimiento: " + dateBirth +
				"\nTipo de documento: " + typeDocument +
				"\nNumero de documento: " + numDocument +
				"\nCodigo de estudiante: "+ codeStudent +
				"\nCarrera: "+ career +
                        "\nEmail: "+ email +
                        "\nContraseña: "+ password;
		return info;
    }
}

