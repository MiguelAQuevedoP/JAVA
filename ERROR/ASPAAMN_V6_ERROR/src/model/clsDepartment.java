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
public class clsDepartment {
    private String name,jefe;

    public clsDepartment() {
    }

    public clsDepartment(String name, String jefe) {
        this.name = name;
        this.jefe = jefe;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getInfo() {
		String info = "";
		info = "Nombre: "+ name +
                    "\nJefe: "+ jefe;
		return info;
	}
    
}
