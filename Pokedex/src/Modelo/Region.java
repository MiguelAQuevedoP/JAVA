/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Region {
    //Atributos
    private  String nombreRegion;
  //  private eRegion nombreRegion;
    private String descripcionRegion ;
    private String codigoRegion;
    private ArrayList<Pueblo> listaPueblos;

    public Region(String nombreRegion, String descripcionRegion, String codigoRegion) {
        this.nombreRegion = nombreRegion;
        this.descripcionRegion = descripcionRegion;
        this.codigoRegion = codigoRegion;
    }

    public Region() {
        this.nombreRegion = nombreRegion;
        this.descripcionRegion = "";
        this.codigoRegion = "";
        this.listaPueblos = new ArrayList<>();        
    }
   
    
    
    //constructores

//    public Region() {
//        this.nombreRegion = nombreRegion;
//        this.descripcionRegion = "";
//        this.codigoRegion = 0;
//        this.listaPueblos = new ArrayList<>();
//    }

//    public Region(eRegion nombreRegion, String derscripcionRegion, int codigoRegion,ArrayList<Pueblo> listaPueblos) {
//        this.nombreRegion = nombreRegion;
//        this.descripcionRegion = derscripcionRegion;
//        this.codigoRegion = codigoRegion;
//        this.listaPueblos =listaPueblos;
//    }
    //setters and getters

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    
//    public eRegion getNombreRegion() {
//        return nombreRegion;
//    }
//
//    public void setNombreRegion(eRegion nombreRegion) {
//        this.nombreRegion = nombreRegion;
//    }

    public String getDerscripcionRegion() {
        return descripcionRegion;
    }

    public void setDerscripcionRegion(String derscripcionRegion) {
        this.descripcionRegion = derscripcionRegion;
    }

    public String getCodigoRegion() {
        return codigoRegion;
    }

    public void setCodigoRegion(String codigoRegion) {
        this.codigoRegion = codigoRegion;
    }

//    public int getCodigoRegion() {
//        return codigoRegion;
//    }
//
//    public void setCodigoRegion(int codigoRegion) {
//        this.codigoRegion = codigoRegion;
//    }

    public ArrayList<Pueblo> getListaPueblos() {
        return listaPueblos;
    }

    public void setListaPueblos(ArrayList<Pueblo> listaPueblos) {
        this.listaPueblos = listaPueblos;
    }
    
    public void asignarPueblos( int opeRegion){// agregar este metodo al diagrama 
        switch(opeRegion){
            case 1: 
                crearPueblo("PUEBLO PALETA ", "ciudad de la region kanto ", 1);
                crearPueblo("CIUDAD VERDE ", "ciudad de la region kanto ", 2);
                crearPueblo("CIUDAD FUCCIA ", "ciudad de la region kanto ", 3);                
                break;

            case 2: 
                crearPueblo("PUEBLO PRIMAVERA ", "ciudad de la region Johto ", 4);
                crearPueblo("CIUDAD CEREZO ", "ciudad de la region Johto ", 5);
                crearPueblo("CIUDAD MALVA ", "ciudad de la region Johto ", 6);                
                break;
            case 3: 
                crearPueblo("VILLA RAIZ ", "ciudad de la region Hoen ", 7);
                crearPueblo("PUEBLO ESCASO ", "ciudad de la region Hoen ", 8);
                crearPueblo("CIUDAD PETALIA ", "ciudad de la region Hoen ", 9);                
                break;                
        }
    }
    public void crearPueblo(String nombrePueblo, String descripcionPueblo, int codigoPueblo){
        Pueblo p = new Pueblo(nombrePueblo, descripcionPueblo, codigoPueblo);
        this.listaPueblos.add(p);
       
    }    
    //metodo que liste los pueblos 
    public void listarPueblos(){
        int i = 0;
        for(Pueblo p: this.listaPueblos){
            System.out.println(i+1 + "." + p.getNombrePueblo());
            i++;
        }
        //1. PPaleta 2. 
    }
    
    public Pueblo seleccionarPueblo()
    {
         Scanner objScanner = new Scanner(System.in);
         int opcPueblo=0;
         listarPueblos();     
         opcPueblo = objScanner.nextInt();
                if (opcPueblo<1 || opcPueblo>3){
                    do{
                     System.out.println("Pueblo incorrecto. Ingrese el pueblo nuevamente: ");  
                       opcPueblo = objScanner.nextInt();
                    }while(opcPueblo<1 || opcPueblo>3);
                }    
                System.out.println("Pueblo correcto ");       
            return listaPueblos.get(opcPueblo-1);       

    }


}
