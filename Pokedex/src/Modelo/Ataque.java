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
public class Ataque {
    
    private String nameAtaque;
    private eTipo tipoAtaque;
    private float precision;

    public Ataque() {
        this.nameAtaque = "";
        this.tipoAtaque = tipoAtaque;
        this.precision = 0;
    }

    
    public Ataque(String nameAtaque,eTipo tipoAtaque, float precision) {
        this.nameAtaque = nameAtaque;
        this.tipoAtaque = tipoAtaque;
        this.precision = precision;
    }

    public String getNameAtaque() {
        return nameAtaque;
    }

    public Ataque setNameAtaque(String nameAtaque) {
        this.nameAtaque = nameAtaque;
        return this;
    }

    public eTipo getTipoAtaque() {
        return tipoAtaque;
    }

    public Ataque setTipoAtaque(eTipo tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
        return this;
    }

    public float getPrecision() {
        return precision;
    }

    public Ataque setPrecision(float precision) {
        this.precision = precision;
        return this;
    }
}
