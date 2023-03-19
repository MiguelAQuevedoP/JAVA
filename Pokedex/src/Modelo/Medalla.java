/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Acer
 */
public class Medalla {
    
    private String nombreMedalla;
    private String tipoMedalla;

    public Medalla(String nombreMedalla,String tipoMedalla) {
        this.nombreMedalla = nombreMedalla;
        this.tipoMedalla = tipoMedalla;
    }

    public String getNombreMedalla() {
        return nombreMedalla;
    }

    public Medalla setNombreMedalla(String nombreMedalla) {
        this.nombreMedalla = nombreMedalla;
        return this;
    }

    public String getTipoMedalla() {
        return tipoMedalla;
    }

    public Medalla setTipoMedalla(String tipoMedalla) {
        this.tipoMedalla = tipoMedalla;
        return this;
    }
    
}
