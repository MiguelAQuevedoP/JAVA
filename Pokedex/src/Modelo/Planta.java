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
public abstract class Planta extends Pokemon {
    
    public void cuidarFlores(){
    
    }
    public Planta(eNombre nombrePokemon, String descripcionPokemon, double pesoPokemon, double alturaPokemon, eGenero genero, int numeroPokemon, double puntosSalud, int puntosCombate, eTipo debilidad, eTipo fortaleza, int nivelPokemon, ArrayList<Ataque> listaAtaques) {
        super(nombrePokemon,descripcionPokemon,pesoPokemon,alturaPokemon,genero,numeroPokemon,puntosSalud,puntosCombate,debilidad,fortaleza,nivelPokemon,listaAtaques);
    }

    public Planta(eNombre nombrePokemon, String descripcionPokemon, double pesoPokemon, double alturaPokemon, eGenero genero, int numeroPokemon, eTipo debilidad, eTipo fortaleza, int nivelPokemon) {
        super(nombrePokemon, descripcionPokemon, pesoPokemon, alturaPokemon, genero, numeroPokemon, debilidad, fortaleza, nivelPokemon);
    }

   
        
    @Override
    public void emitirSonido(){
    
    }
    @Override
    public void atacar(){
    
    }
    
}
