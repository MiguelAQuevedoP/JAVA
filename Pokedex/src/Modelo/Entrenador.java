/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Entrenador {
    
    // Atributos
    private Pokemon pokemonCombate;
    private Pueblo puebloActual;
    private String nombreEntrenador;
    private eGenero genero;
    private Date fechaInicio;
    private Date fechaNacimiento;
    private int nivelEntrenador;
    private ArrayList<Pueblo> pueblosVisitados=new ArrayList<>();
    private ArrayList<Pokemon> pokemonesCapturados=new ArrayList<>();
    private ArrayList<Medalla> medallasGanadas=new ArrayList<>(); 
    private ArrayList<Region> regionesVisitadas=new ArrayList<>();
  
    //Constructores
    public Entrenador() {
//        this.nameEntrenador = "";
//        this.eGenero = eGenero;
//        this.fechaInicio = fechaInicio;
//        this.fechaNacimiento = fechaNacimiento;
//        this.nivelEntrenador = 0;
//        this.pueblosVisitados = new ArrayList<>();
//        this.pokemonesCapturados = new ArrayList<>();
//        this.medallasGanadas = new ArrayList<>();        
    }

    public Entrenador(String nombreEntrenador,eGenero genero, Date fechaInicio, Date fechaNacimiento, int nivelEntrenador, ArrayList<Pueblo> pueblosVisitados, ArrayList<Pokemon> pokemonesCapturados, ArrayList<Medalla> medallasGanadas) {
        this.nombreEntrenador = nombreEntrenador;
        this.genero = genero;
        this.fechaInicio = fechaInicio;
        this.fechaNacimiento = fechaNacimiento;
        this.nivelEntrenador = nivelEntrenador;
        this.pueblosVisitados = new ArrayList<>(); //igualar a lo que llega
        this.pokemonesCapturados = new ArrayList<>();
        this.medallasGanadas = new ArrayList<>();
    }

    public Entrenador(String nombreEntrenador, eGenero genero, Date fechaInicio, Date fechaNacimiento, int nivelEntrenador) {
        this.pueblosVisitados = new ArrayList<>();
        this.pokemonesCapturados = new ArrayList<>();
        this.medallasGanadas = new ArrayList<>();
    }

    public Entrenador(Pokemon pokemonCombate, String nombreEntrenador, eGenero genero, Date fechaInicio, Date fechaNacimiento, int nivelEntrenador, ArrayList<Pueblo> pueblosVisitados/*, ArrayList<Pokemon> pokemonesCapturados, ArrayList<Medalla> medallasGanadas, ArrayList<Region> regionesVisitadas*/) {
        this.pokemonCombate = pokemonCombate;
        this.nombreEntrenador = nombreEntrenador;
        this.genero = genero;
        this.fechaInicio = fechaInicio;
        this.fechaNacimiento = fechaNacimiento;
        this.nivelEntrenador = nivelEntrenador;
        this.pueblosVisitados = pueblosVisitados;
        this.pokemonesCapturados = pokemonesCapturados;
        this.medallasGanadas = medallasGanadas;
        this.regionesVisitadas = regionesVisitadas;
    }
        public Entrenador(Pokemon pokemonCombate, Pueblo puebloActual, String nombreEntrenador, eGenero genero, Date fechaInicio, Date fechaNacimiento, int nivelEntrenador, ArrayList<Pokemon> pokemonesCapturados) {
        this.pokemonCombate = pokemonCombate;
        this.puebloActual = puebloActual;
        this.nombreEntrenador = nombreEntrenador;
        this.genero = genero;
        this.fechaInicio = fechaInicio;
        this.fechaNacimiento = fechaNacimiento;
        this.nivelEntrenador = nivelEntrenador;
        this.pokemonesCapturados = pokemonesCapturados;
        this.medallasGanadas = medallasGanadas;
    }

    
    
    public Pokemon getPokemonCombate() {
        return pokemonCombate;
    }


    public void setPokemonCombate(Pokemon pokemonCombate) {
        this.pokemonCombate = pokemonCombate;
    }


    public Pueblo getPuebloActual() {
        return puebloActual;
    }

    public void setPuebloActual(Pueblo puebloActual) {
        this.puebloActual = puebloActual;
    }

    
        //getters and setters
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public eGenero getGenero() {
        return genero;
    }

    public void setGenero(eGenero genero) {
        this.genero = genero;
    }



    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void  setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
       
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    public int getNivelEntrenador() {
        return nivelEntrenador;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNivelEntrenador(int nivelEntrenador) {
        this.nivelEntrenador = nivelEntrenador;
    }

 

    public ArrayList<Pueblo> getPueblosVisitados() {
        return pueblosVisitados;
    }

    public void setPueblosVisitados(ArrayList<Pueblo> pueblosVisitados) {
        this.pueblosVisitados = pueblosVisitados;
    }

    public ArrayList<Pokemon> getPokemonesCapturados() {
        return pokemonesCapturados;
    }

    public void setPokemonesCapturados(ArrayList<Pokemon> pokemonesCapturados) {
        this.pokemonesCapturados = pokemonesCapturados;
    }

    public ArrayList<Medalla> getMedallasGanadas() {
        return medallasGanadas;
    }

    public void setMedallasGanadas(ArrayList<Medalla> medallasGanadas) {
        this.medallasGanadas = medallasGanadas;
    }

    public ArrayList<Region> getRegionesVisitadas() {
        return regionesVisitadas;
    }

    public void setRegionesVisitadas(ArrayList<Region> regionesVisitadas) {
        this.regionesVisitadas = regionesVisitadas;
    }
    
    
// metodos generales     
    public void agregarRegionVisitada(Region objRegion){
       regionesVisitadas.add(objRegion);
    
    }
    public void agregarPueblos(Pueblo objPueblo) {
        pueblosVisitados.add(objPueblo);
        
    }
    
    public void agregarMedallaGanada(Medalla objMedalla){
    
    }
    
    public void capturarPokemon(Pokemon objPokemon){
        this.pokemonesCapturados.add(objPokemon);
   
    }
    
    public void elegirPokemon(){
        
    
    }

    public void agregarPueblosVisitados(Pueblo seleccionarPueblo) {
        this.pueblosVisitados.add(seleccionarPueblo);
    }


}

