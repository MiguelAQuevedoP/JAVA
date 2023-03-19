/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import Modelo.Arcanine;
/**
 *
 * @author Acer
 */
public abstract class Pokemon {


    protected  eNombre nombrePokemon;
//    protected  String nombrePokemon;
    protected  String descripcionPokemon;
    protected  double pesoPokemon;
    protected  double alturaPokemon;
    protected  eGenero genero;
    protected  int numeroPokemon;
    protected  double puntosSalud;
    protected  int puntosCombate;
    protected  eTipo debilidad;
    protected  eTipo fortaleza;
    protected  int nivelPokemon;
    protected ArrayList<Ataque> listaAtaques;

    public Pokemon(eNombre nombrePokemon, String descripcionPokemon, double pesoPokemon, double alturaPokemon, eGenero genero, int numeroPokemon, eTipo debilidad, eTipo fortaleza, int nivelPokemon) {
        this.nombrePokemon = nombrePokemon;
        this.descripcionPokemon = descripcionPokemon;
        this.pesoPokemon = pesoPokemon;
        this.alturaPokemon = alturaPokemon;
        this.genero = genero;
        this.numeroPokemon = numeroPokemon;
        this.debilidad = debilidad;
        this.fortaleza = fortaleza;
        this.nivelPokemon = nivelPokemon;
    }


    
    //constructores


    public Pokemon() {
        this.nombrePokemon = nombrePokemon;
        this.descripcionPokemon = "";
        this.pesoPokemon = 0;
        this.alturaPokemon = 0;
        this.genero = genero;
        this.numeroPokemon = 0;
        this.puntosSalud = 0;
        this.puntosCombate = 0;
        this.debilidad = debilidad;
        this.fortaleza = fortaleza;
        this.nivelPokemon = 0;
        this.listaAtaques = new ArrayList<>();
    }

    public Pokemon(eNombre nombrePokemon, String descripcionPokemon, double pesoPokemon, double alturaPokemon, eGenero genero, int numeroPokemon, double puntosSalud, int puntosCombate, eTipo debilidad, eTipo fortaleza, int nivelPokemon, ArrayList<Ataque> listaAtaques) {
        this.nombrePokemon = nombrePokemon;
        this.descripcionPokemon = descripcionPokemon;
        this.pesoPokemon = pesoPokemon;
        this.alturaPokemon = alturaPokemon;
        this.genero = genero;
        this.numeroPokemon = numeroPokemon;
        this.puntosSalud = puntosSalud;
        this.puntosCombate = puntosCombate;
        this.debilidad = debilidad;
        this.fortaleza = fortaleza;
        this.nivelPokemon = nivelPokemon;
        this.listaAtaques = new ArrayList<>();
    }
  
    //getters and setters

    public eNombre getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(eNombre nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }



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
    
        //Metodos generales
    //metodos generales
    public void subirNivel(){

    }
    
    public void atacar(){

    }
    public void obtenerEstadisticas(){
        System.out.println("Nombre: "+ nombrePokemon+"\n"
                +"Descripcion: " + descripcionPokemon+"\n"
                +"Peso: " +pesoPokemon
                +"Altura: "+ alturaPokemon+"\n"
                +"Genero: "+genero+"\n"
                +"Numero: "+numeroPokemon+"\n"
                +"Puntos de Salud: "+puntosSalud+"\n"
                +"Puntos de Combate: "+ puntosCombate+"\n"
                +"Debilidad: "+debilidad+"\n"
                +"Fortaleza: "+ fortaleza+"\n"
                +"Nivel: "+nivelPokemon+"\n"
                );
        
    
    }
    public void emitirSonido(){

    }
    public void disminuirPS(){

    }
  public static Pokemon encontrarPokemon(eNombre opcPokemon, String descripcion,double pesoPokemon,double alturaPokemon,eGenero genero,int numeroPokemon,eTipo debilidad,eTipo fortaleza,int nivelPokemon)
    {
    
         if (opcPokemon.equals(eNombre.Arcanine )) {
            return new Arcanine(eNombre.Arcanine,descripcion,pesoPokemon, alturaPokemon, numeroPokemon, genero,debilidad, fortaleza, nivelPokemon);                 
        }
        else if (opcPokemon.equals(eNombre.Ninetales)) {
            return new Ninetales(eNombre.Ninetales,descripcion,pesoPokemon, alturaPokemon,genero, numeroPokemon,debilidad, fortaleza, nivelPokemon);  
        }
        else if (opcPokemon.equals(eNombre.Charmander)) {
            return new Charmander(eNombre.Charmander,descripcion,pesoPokemon, alturaPokemon,genero, numeroPokemon,debilidad, fortaleza, nivelPokemon);  
        }
        else if (opcPokemon.equals(eNombre.Vaporeon)) {
            return new Vaporeon(eNombre.Vaporeon,descripcion,pesoPokemon, alturaPokemon,genero, numeroPokemon,debilidad, fortaleza, nivelPokemon);  
        }
        else if (opcPokemon.equals(eNombre.Squirtle)) {
            return new Squirtle(eNombre.Squirtle,descripcion,pesoPokemon, alturaPokemon,genero, numeroPokemon,debilidad, fortaleza, nivelPokemon);  
        }
        else if (opcPokemon.equals(eNombre.Psyduck)) {
            return new Psyduck(eNombre.Psyduck,descripcion,pesoPokemon, alturaPokemon,genero, numeroPokemon,debilidad, fortaleza, nivelPokemon);  
        }
        else if (opcPokemon.equals(eNombre.Bulbasur)){
            return new Bulbasur(eNombre.Bulbasur,descripcion,pesoPokemon, alturaPokemon,genero, numeroPokemon,debilidad, fortaleza, nivelPokemon);  
            
        }
        else if (opcPokemon.equals(eNombre.Vileplume)) {
            return new Vileplume(eNombre.Vileplume,descripcion,pesoPokemon, alturaPokemon,genero, numeroPokemon,debilidad, fortaleza, nivelPokemon);  
            
        }
        else if (opcPokemon.equals(eNombre.Victreebel)) {
            return new Victreebel(eNombre.Victreebel,descripcion,pesoPokemon, alturaPokemon,genero, numeroPokemon,debilidad, fortaleza, nivelPokemon);  
            
        }
           
       return null ;
    }  
  
  //buscar pokemon a editar
  
    public Pokemon buscarPokemonAeditar(int numeroElegido, ArrayList<Pokemon>listaP) {
       for(Pokemon pokemon : listaP){
           if(pokemon.numeroPokemon == numeroElegido){
               return pokemon;
           }
       }
       return null;
    }

    public String obtenerInfoPokemon(){
        return "Nombre: " +this.nombrePokemon+" Descripción: "+this.descripcionPokemon+" Peso: "+this.pesoPokemon+" Altura "+this.alturaPokemon+" Genero: "+this.genero+" Número: "+this.numeroPokemon+" Debilidad: "+this.debilidad+" Fortaleza: "+this.fortaleza+" Nivel: "+this.nivelPokemon;
    }

}



//    public static Pokemon encontrarPokemon(eNombre opcPokemon)
//    {
//        
//        if (opcPokemon.equals(eNombre.Arcanine )) {
//            return new Arcanine(eNombre.Arcanine);   
//              
//        }
//        else if (opcPokemon.equals(eNombre.Ninetales)) {
//            return new Ninetales(eNombre.Ninetales,"Pokemon de fuego",19,(1.1),eGenero.Femenino,1,eTipo.Agua,eTipo.Planta,1);
//        }
//        else if (opcPokemon.equals(eNombre.Charmander)) {
//            return new Charmander(eNombre.Charmander,"Pokemon de fuego",(8.5),(0.6),eGenero.Masculino,1,5,0,eTipo.Agua,eTipo.Planta,1,null);
//        }
//        else if (opcPokemon.equals(eNombre.Vaporeon)) {
//            return new Vaporeon(eNombre.Vaporeon,"Pokemon de agua",29,(1.0),eGenero.Masculino,1,5,0,eTipo.Planta,eTipo.Fuego,1,null);
//        }
//        else if (opcPokemon.equals(eNombre.Squirtle)) {
//            return new Squirtle(eNombre.Squirtle,"Pokemon de agua",9,(0.5),eGenero.Masculino,1,5,0,eTipo.Planta,eTipo.Fuego,1,null);
//        }
//        else if (opcPokemon.equals(eNombre.Psyduck)) {
//            return new Psyduck(eNombre.Psyduck,"Pokemon de agua",(19.6),(0.8),eGenero.Masculino,1,5,0,eTipo.Planta,eTipo.Fuego,1,null);
//        }
//        else if (opcPokemon.equals(eNombre.Bulbasur)){
//            return new Bulbasur(eNombre.Bulbasur,"Pokemon de planta",(6.9),(0.7),eGenero.Masculino,1,5,0,eTipo.Agua,eTipo.Fuego,1,null);
//            
//        }
//        else if (opcPokemon.equals(eNombre.Vileplume)) {
//            return new Vileplume(eNombre.Vileplume,"Pokemon de planta",(18.6),(1.2),eGenero.Femenino,1,5,0,eTipo.Agua,eTipo.Fuego,1,null);
//            
//        }
//        else if (opcPokemon.equals(eNombre.Victreebel)) {
//            return new Victreebel(eNombre.Victreebel,"Pokemon de planta",(15.5),(1.7),eGenero.Femenino,1,5,0,eTipo.Agua,eTipo.Fuego,1,null);
//            
//        }
//            
//           
//       return null ;
//    }    
//    public static void pokemonElegido (Pokemon pokemonElegido) {
//        
//    }