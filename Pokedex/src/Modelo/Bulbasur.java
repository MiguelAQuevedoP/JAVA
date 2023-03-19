/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Bulbasur extends Planta{
 
    public Bulbasur(eNombre nombrePokemon, String descripcionPokemon, double pesoPokemon, double alturaPokemon, eGenero genero, int numeroPokemon, double puntosSalud, int puntosCombate, eTipo debilidad, eTipo fortaleza, int nivelPokemon, ArrayList<Ataque> listaAtaques) {
        super(nombrePokemon,descripcionPokemon,pesoPokemon,alturaPokemon,genero,numeroPokemon,puntosSalud,puntosCombate,debilidad,fortaleza,nivelPokemon,listaAtaques);
    }

    public Bulbasur(eNombre nombrePokemon, String descripcionPokemon, double pesoPokemon, double alturaPokemon, eGenero genero, int numeroPokemon, eTipo debilidad, eTipo fortaleza, int nivelPokemon) {
        super(nombrePokemon, descripcionPokemon, pesoPokemon, alturaPokemon, genero, numeroPokemon, debilidad, fortaleza, nivelPokemon);
    }


    
        
        //Metodos generales
    
    @Override
    public void emitirSonido(){
    
    }

    public eNombre getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(eNombre nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

//    public String getNombrePokemon() {
//        return nombrePokemon;
//    }
//
//    public void setNombrePokemon(String nombrePokemon) {
//        this.nombrePokemon = nombrePokemon;
//    }

    public String getDescripcionPokemon() {
        return descripcionPokemon;
    }

    public void setDescripcionPokemon(String descripcionPokemon) {
        this.descripcionPokemon = descripcionPokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public double getAlturaPokemon() {
        return alturaPokemon;
    }

    public void setAlturaPokemon(double alturaPokemon) {
        this.alturaPokemon = alturaPokemon;
    }

    public eGenero getGenero() {
        return genero;
    }

    public void setGenero(eGenero genero) {
        this.genero = genero;
    }

    public int getNumeroPokemon() {
        return numeroPokemon;
    }

    public void setNumeroPokemon(int numeroPokemon) {
        this.numeroPokemon = numeroPokemon;
    }

    public double getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(double puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getPuntosCombate() {
        return puntosCombate;
    }

    public void setPuntosCombate(int puntosCombate) {
        this.puntosCombate = puntosCombate;
    }

    public eTipo getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(eTipo debilidad) {
        this.debilidad = debilidad;
    }

    public eTipo getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(eTipo fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getNivelPokemon() {
        return nivelPokemon;
    }

    public void setNivelPokemon(int nivelPokemon) {
        this.nivelPokemon = nivelPokemon;
    }

    public ArrayList<Ataque> getListaAtaques() {
        return listaAtaques;
    }

    public void setListaAtaques(ArrayList<Ataque> listaAtaques) {
        this.listaAtaques = listaAtaques;
    }
    
    
}
