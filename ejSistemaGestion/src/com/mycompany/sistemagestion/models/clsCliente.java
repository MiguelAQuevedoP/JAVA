/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemagestion.models;

/**
 *
 * @author Miguel A. Quevedo P.
 * @email mquevedo@unicauca.edu.co
 */
public class clsCliente {
    private int id;
    private String name, lastName, phone, email;

    public clsCliente() {
        
    }
    
    public clsCliente(int id, String name, String lastName, String phone, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "clsCliente{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + '}';
    }
    
}
