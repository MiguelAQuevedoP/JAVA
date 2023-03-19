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
 */
public class clsDocente {
    String  name, email, password;
    Long id, code;
    String dateBirth;

    public clsDocente() {
        
    }
    
    public clsDocente(String name, Long id, Long code, String email, String password, String dateBirth) {
        this.name = name;
        this.id = id;
        this.code = code;
        this.email = email;
        this.password = password;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
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

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "clsDocente{" + "nombre= " + name
                + ", identificacion= " + id
                +", codigo= " + code
                +", email= " + email
                + ", password= " + password
                + ", fecha de nacimiento= " + dateBirth;
    }
    
    
}
