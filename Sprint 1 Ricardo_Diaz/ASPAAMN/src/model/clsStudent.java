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
 */
public class clsStudent {
    private String name, typeDocument, career, codeStudent, fecha;
    private int numDocument;

    public clsStudent() {
        
    }
    
    public clsStudent(String name,String fecha, String typeDocument, String career, int numDocument, String codeStudent) {
        this.name = name;
        this.fecha = fecha;
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

    public int getNumDocument() {
        return numDocument;
    }

    public void setNumDocument(int numDocument) {
        this.numDocument = numDocument;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public String getInfo() {
		String info = "";
		info = "Nombre: "+ name +
                                "\nFecha de nacimiento " + fecha +
				"\nTipo de documento: " + typeDocument +
				"\nNumero de documento: " + numDocument +
				"\nCodigo de estudiante: "+ codeStudent +
				"\nCarrera: "+ career;
		return info;
	}
}

