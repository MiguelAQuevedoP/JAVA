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
public class Pueblo {
    //Atributos
   private String nombrePueblo;
   private String descripcionPueblo;
   private int codigoPueblo;
//   private Medalla medalla;
//   private ArrayList<Pokemon> listaPokemon;
   //Constructores

    public Pueblo() {
        this.nombrePueblo = "";
        this.descripcionPueblo = "";
        this.codigoPueblo = 0;
//        this.medalla = medalla;
//        this.listaPokemon = new ArrayList<>();
    }

    public Pueblo(String nombrePueblo, String descripcionPueblo, int codigoPueblo, Medalla medalla,ArrayList <Pokemon> listaPokemon) {
        this.nombrePueblo = nombrePueblo;
        this.descripcionPueblo = descripcionPueblo;
        this.codigoPueblo = codigoPueblo;
//        this.medalla = medalla;
//        this.listaPokemon = new ArrayList<>();
    }
    

    public Pueblo(String nombrePueblo, String descripcionPueblo, int codigoPueblo) {
        this.nombrePueblo = nombrePueblo;
        this.descripcionPueblo = descripcionPueblo;
        this.codigoPueblo = codigoPueblo;
    }
    
    // setters and getters

    public String getNombrePueblo() {
        return nombrePueblo;
    }

    public void setNombrePueblo(String nombrePueblo) {
        this.nombrePueblo = nombrePueblo;
    }

    public String getDescripcionPueblo() {
        return descripcionPueblo;
    }

    public void setDescripcionPueblo(String descripcionPueblo) {
        this.descripcionPueblo = descripcionPueblo;
    }

    public int getCodigoPueblo() {
        return codigoPueblo;
    }

    public void setCodigoPueblo(int codigoPueblo) {
        this.codigoPueblo = codigoPueblo;
    }

//    public Medalla getMedalla() {
//        return medalla;
//    }
//
//    public void setMedalla(Medalla medalla) {
//        this.medalla = medalla;
//    }
//
//    public  ArrayList<Pokemon> getListaPokemon() {
//        return listaPokemon;
//    }
//
//    public void setListaPokemon( ArrayList<Pokemon> listaPokemon) {
//        this.listaPokemon = listaPokemon;
//    }
    
 //métodos generales   
   public String mostrarInfoPueblo(){
       return ("Nombre del pueblo :"+ this.nombrePueblo 
              +"Descripcion del pueblo: "+ this.descripcionPueblo 
              +"Codigo del pueblo :"+ this.codigoPueblo);
   }
   
//   public void agregarMedalla(Medalla m){
//       this.medalla = m;
//   }
//   
//   public void eliminarMedalla(){
//       this.medalla = null;
//   
//   }   
}
