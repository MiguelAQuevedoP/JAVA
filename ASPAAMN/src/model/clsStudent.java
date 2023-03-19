/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 * 
 */
public class clsStudent {
    private String name, typeDocument, career;
    private Calendar dateBirth;
    private long numDocument, codeStudent;

    public clsStudent() {
        
    }
    
    public clsStudent(String name, Calendar dateBirth, String typeDocument, String career, long numDocument, long codeStudent) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.typeDocument = typeDocument;
        this.career = career;
        this.numDocument = numDocument;
        this.codeStudent = codeStudent;
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

    public Calendar getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Calendar dateBirth) {
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
    
    public String getInfo() {
		String info = "";
		info = "Nombre: "+ name +
				"\nFecha de nacimiento: " + dateBirth +
				"\nTipo de documento: " + typeDocument +
				"\nNumero de documento: " + numDocument +
				"\nCodigo de estudiante: "+ codeStudent +
				"\nCarrera: "+ career;
		return info;
    }
}

