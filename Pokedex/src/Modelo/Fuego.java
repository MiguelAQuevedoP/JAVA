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
public abstract class Fuego extends Pokemon{
    
    private eTipo tipo;

    public Fuego(eNombre nombrePokemon, String descripcionPokemon, double pesoPokemon, double alturaPokemon, eGenero genero, int numeroPokemon, double puntosSalud, int puntosCombate, eTipo debilidad, eTipo fortaleza, int nivelPokemon, ArrayList<Ataque> listaAtaques) {
        super(nombrePokemon,descripcionPokemon,pesoPokemon,alturaPokemon,genero,numeroPokemon,puntosSalud,puntosCombate,debilidad,fortaleza,nivelPokemon,listaAtaques);
    }
    
    public Fuego(eNombre nombrePokemon, String descripcionPokemon, double pesoPokemon,double alturaPokemon, eGenero genero, int numeroPokemon, eTipo debilidad, eTipo fortaleza, int nivelPokemon) {
        super(nombrePokemon,descripcionPokemon,pesoPokemon,alturaPokemon,genero,numeroPokemon,debilidad,fortaleza,nivelPokemon);
    }

  
        
    public void quemar(eNombre nombrePokemon, eTipo tipoPokemon){
       
        tipo = tipoPokemon;
    
    }
        
    @Override
    public void emitirSonido(){
    
    }
    @Override
    public void atacar(){

    }

}
