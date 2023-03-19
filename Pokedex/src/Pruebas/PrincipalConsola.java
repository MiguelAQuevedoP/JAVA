/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Modelo.Agua;
import Modelo.Arcanine;
import Modelo.Bulbasur;
import Modelo.Charmander;
import Modelo.Entrenador;
import Modelo.Fuego;
import Modelo.Ninetales;
import Modelo.Planta;
import Modelo.Pokemon;
import Modelo.Psyduck;
import Modelo.Region;
import Modelo.Squirtle;
import Modelo.Vaporeon;
import Modelo.Victreebel;
import Modelo.Vileplume;
import Modelo.eGenero;
import Modelo.eRegion;
import Modelo.eTipo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PrincipalConsola {
    public static void main(String[] args) throws ParseException {

      int numeroEntrenador=1;
       texto1();
                // objeto entrenador
        Entrenador entrenadores[]= new Entrenador[2];    
         entrenadores[0]=new Entrenador();
         entrenadores[1]=new Entrenador();

        datosEntrenador(entrenadores[0],numeroEntrenador);
        asignarLugar(entrenadores[0]);
    
        texto2();
        numeroEntrenador ++;
        datosEntrenador(entrenadores[1],numeroEntrenador);
        asignarLugar(entrenadores[1]);
        ReasiganarLugar(entrenadores);
      
        texto3(entrenadores[0].getNombreEntrenador(),entrenadores[1].getNombreEntrenador(), entrenadores[0].getPuebloActual().getNombrePueblo());
        
        seleccionarPokemones(entrenadores[0]);
        seleccionarPokemones(entrenadores[1]);
        
        texto4(entrenadores[0],entrenadores[1]);
        
        modoCombate(entrenadores);
              

    }
    
    //Datos de entrenadores
    public static void datosEntrenador(Entrenador entrenador,int numeroEntrenador){ 
       eGenero genero = eGenero.Femenino;
        Scanner objScanner = new Scanner(System.in);
        String nombreEntrenador ;

        int anio=0,mes=0,dia=0, nivelEntrenador = 1;
    //   ArrayList pueblosVisitados<Pueblo>, pokemonesCapturados<Pokemon>, medallasGanadas<Medalla>;
        
        Date fechaInicio = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
       // System.out.println("la fechas es "+sdf1.format(fechaInicio));        


                System.out.println("******* Entrenador "+numeroEntrenador+". *******");
                System.out.println("Ingrese su nombre : ");
                nombreEntrenador = objScanner.nextLine();
                entrenador.setNombreEntrenador(nombreEntrenador);                
                System.out.println("Ingrese su genero \n numero (1) Femenino\n numero (2) Masculino ");
                int opeGenero = objScanner.nextInt();
                if (opeGenero<1 || opeGenero>2){
                    do{
                       System.out.println("Genero incorrecto. Ingrese el genero nuevamente: ");  
                       opeGenero = objScanner.nextInt();  
                    }while(opeGenero<1 || opeGenero>2);
                } 
                System.out.println("El Genero es correcto ");
                if (opeGenero==1){
                    genero = eGenero.Femenino;
                    entrenador.setGenero(genero);
                }
                else{
                    genero = eGenero.Masculino;
                    entrenador.setGenero(genero);
                    
                }
                objScanner.nextLine();
                
                System.out.println("Introduzca la fecha de nacimiento dd/mm/yyyy");
                System.out.println("Ingrese el dia: ");            
                dia= objScanner.nextInt();
                if (dia<1 || dia>31){
                    do{
                     System.out.println("Dia incorrecto. Ingrese el dia nuevamente: ");  

                     dia = objScanner.nextInt();  
                    }while(dia<1 || dia>31);
                } 
                System.out.println("El Dia es correcto ");

                System.out.println("Ingrese el mes: ");            
                mes= objScanner.nextInt();
                if (mes<1 || mes>12){
                    do{
                     System.out.println("Mes incorrecto. Ingrese el mes nuevamente: ");  

                     mes = objScanner.nextInt();  
                    }while(mes<1 || mes>12);
                } 
                System.out.println("El mes es correcto ");
                
                System.out.println("Ingrese el año: ");            
                anio= objScanner.nextInt();
                
                if (anio<1921 || anio>2020){
                    do{
                     System.out.println("Año incorrecto. Ingrese el año nuevamente: ");  

                     anio = objScanner.nextInt();  
                    }while(anio<1920 || anio>2020);
                }    
                System.out.println("El año es correcto ");


                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaNacimiento = new Date(anio-1900, mes-1, dia); 
                entrenador.setFechaNacimiento(fechaNacimiento);
                System.out.println("la fechas es "+sdf2.format(fechaNacimiento));
        }
    
    
    
    public static void asignarLugar(Entrenador entrenador) {
        int opeRegion,opcPueblo;
         Scanner objScanner = new Scanner(System.in);
       // Pueblo puebloSelecionado;
        
        eRegion region = eRegion.Hoen ;
       
 //elegir region y pueblo
                System.out.println("Profesor oak : Para iniciar, cuéntame que región deseas visitar primero? \n"
                        + "1. Kanto\n"
                        + "2. Johto \n"
                        + "3. Hoenn \n"
                );
                opeRegion = objScanner.nextInt();
                if (opeRegion<1 || opeRegion>3){
                    do{
                     System.out.println("Región incorrecta. Ingrese la región nuevamente: ");  
                       opeRegion = objScanner.nextInt();
                    }while(opeRegion<1 || opeRegion>3);
                }    
                System.out.println("Region correcta ");

                Region objRegion ;
                    System.out.println("Profesor Oak : ¡Muy Buena elección!, ahora dime, a qué parte quieres ir? \n" );             
                switch (opeRegion){
                    case 1 :
                        region= eRegion.Kanto;   
                        break;                   
                    case 2 :
                        region= eRegion.Johto;             
                        break;
                    case 3 :                    
                        region= eRegion.Hoen;                                            
                       break;                    
                        } 

                        objRegion = new Region();
                        objRegion.asignarPueblos(opeRegion); 
//                        objRegion.setNombreRegion(region);
                        entrenador.setPuebloActual(objRegion.seleccionarPueblo());
                        
                        entrenador.agregarPueblosVisitados(entrenador.getPuebloActual());
                        entrenador.agregarRegionVisitada(objRegion);
                       
                        
//                
    }
    public static void ReasiganarLugar(Entrenador[] entrenadores) {
          int opeRegion=1,opcPueblo=0;
          eRegion region= eRegion.Kanto;  
          Region objRegion = new Region();
          objRegion.asignarPueblos(opeRegion); 
          entrenadores[0].setPuebloActual(objRegion.getListaPueblos().get(opcPueblo));
          entrenadores[1].setPuebloActual(objRegion.getListaPueblos().get(opcPueblo));
    }
//    

    public static void texto1()
    {
         System.out.println("Te doy la bienvenida al fabuloso mundo de los POKÉMON, \n"
                + "¡Me llamo OAK! ¡Pero la gente me llama el PROFESOR POKEMON! \n"
                + " ¡Este mundo está habitado por unas criaturas llamadas POKÉMON! \n"
                + " Para algunos, los POKÉMON  son mascotas. \n"
                + " Pero otros los usan para pelear. En cuanto a mí… Estudio a los POKÉMON como profesión. \n "
                + "Pero primero quiero saber algunos datos sobre ti:\n" +
                "\n" +
                "Dime cómo te llamas:");
    }
    
    public static void texto2()
    {
        System.out.println("Profesor Oak : ¡Muy Buena elección!");                    
                    System.out.println("Profesor oak : ¡Eh!, ¿quién eres tú?, dejame pensar... \n"
                            + "¡Ah sí!, te pedí que vinieras más tarde...\n"
                            + "No importa, primero te pediré algunos datos: \n"
                            + "Profesor oak : Dime cómo te llamas:");
        
    }
    
    public static void texto3(String nombre1, String nombre2, String pueblo)
    {
        System.out.println("Profesor Oak: ¡Bienvenidos " + nombre1  + " y " + nombre2 +"!\n\n");
        System.out.println("Profesor Oak: ¡Su propia leyenda POKÉMON está apunto de comenzar!\n "
                           +"¡les espera un mundo de sueños aventuras con los POKÉMONES! ¡Adelante!\n\n"
                           +"Profesor Oak: Mmm pensandolo bien, iniciaran su recorrido juntos,\n"
                           +"Mucha suerte en "+ pueblo +"\n\n"
                           +"Profesor Oak: Disculpen, disculpen, me olvidaba, este es juego un poco extraño.\n"
                           +"Les mostrare algunos Pokemones, y cada uno podra elegir 3.\n"
                           +"Profesor Oak: primero iniciara "+ nombre1
                         );
    }
    
    public static void seleccionarPokemones(Entrenador entrenador)
    {
          Scanner objScanner = new Scanner(System.in);
          int opcion;
          
        System.out.println("--> Turno de " + entrenador.getNombreEntrenador()+"\n");
        System.out.println("1. Arcanine\n");
        System.out.println("2. Ninetales\n");
        System.out.println("3. Charmander\n");
        System.out.println("4. Vaporeon\n");
        System.out.println("5. Squirtle\n");
        System.out.println("6. Psyduck\n");
        System.out.println("7. Bulbasaur\n");
        System.out.println("8. Vileplume\n");
        System.out.println("9. Victreebel\n");

        
            for (int i = 1; i <=3; i++) {
              System.out.println("Pokemon No "+ i + "\n");
              opcion = objScanner.nextInt();

//              entrenador.capturarPokemon(encontrarPokemon(opcion));
            }
//            for (int i = 1; i <=3; i++) {
//              System.out.println("Pokemon No "+ i + "\n");
//              opcion = objScanner.nextInt();              
//                    if (opcion<1 || opcion>9){
//                        do{
//                         System.out.println("Pokemon incorrecto. Ingrese el pokemon nuevamente: ");  
//    
//                         opcion = objScanner.nextInt();  
//                        }while(opcion<1 || opcion>9);
//                    }else{
//                          System.out.println("Pokemon correcto ");                 
//                    }    
//                entrenador.capturarPokemon(encontrarPokemon(opcion));                        
//            }
       
    }
    
//    public static Pokemon encontrarPokemon(int opcPokemon)
//    {
////        if (opcPokemon == 1) {
////            return new Arcanine("Arcanine","Pokemon de fuego",155,(1.9),eGenero.Masculino,1,5,0,eTipo.Agua,eTipo.Planta,1,null);
////        }
////       if (opcPokemon == 2) {
////            return new Ninetales("Ninetales","Pokemon de fuego",19,(1.1),eGenero.Femenino,1,5,0,eTipo.Agua,eTipo.Planta,1,null);
////        }
////        if (opcPokemon == 3) {
////            return new Charmander("Charmander","Pokemon de fuego",(8.5),(0.6),eGenero.Masculino,1,5,0,eTipo.Agua,eTipo.Planta,1,null);
////        }
////        if (opcPokemon == 4) {
////            return new Vaporeon("Vaporeon","Pokemon de agua",29,(1.0),eGenero.Masculino,1,5,0,eTipo.Planta,eTipo.Fuego,1,null);
////        }
////         if (opcPokemon == 5) {
////            return new Squirtle("Squirtle","Pokemon de agua",9,(0.5),eGenero.Masculino,1,5,0,eTipo.Planta,eTipo.Fuego,1,null);
////        }
////          if (opcPokemon == 6) {
////            return new Psyduck("Psyduck","Pokemon de agua",(19.6),(0.8),eGenero.Masculino,1,5,0,eTipo.Planta,eTipo.Fuego,1,null);
////        }
////            if (opcPokemon == 7) {
////            return new Bulbasur("Bulbasur","Pokemon de planta",(6.9),(0.7),eGenero.Masculino,1,5,0,eTipo.Agua,eTipo.Fuego,1,null);
////            
////        }
////            if (opcPokemon == 8) {
////            return new Vileplume("Vileplume","Pokemon de planta",(18.6),(1.2),eGenero.Femenino,1,5,0,eTipo.Agua,eTipo.Fuego,1,null);
////            
////        }
////              if (opcPokemon == 9) {
////            return new Victreebel("Victreebel","Pokemon de planta",(15.5),(1.7),eGenero.Femenino,1,5,0,eTipo.Agua,eTipo.Fuego,1,null);
////            
////        }
//            
//           
//       return null;
//    }
//    
    public static void texto4(Entrenador entrenador1,Entrenador entrenador2 )
    {
        
    
        System.out.println("========== BIENVENIDOS A "+ entrenador1.getPuebloActual().getNombrePueblo() + "============\n");
         System.out.println("Hola "+ entrenador1.getNombreEntrenador() +" y "+ entrenador2.getNombreEntrenador()+", esperamos que disfruten su visita.\n" 
                           +"Tal vez les comentaron que es  un juego muy extraño\n"
                           +"No hay gimnasios, por lo cual tendrán que combatir entre ustedes\n\n "
                           +"Para iniciar el combate, cada uno debe elegir un Pokemon de su lista de Pokemones\n"
         );
    }
    public static void elegirPokemonCombate(Entrenador[] entrenador)
    {   Scanner objScanner = new Scanner(System.in);
        int opcion=0;
          System.out.println("Iniciemos con "+ entrenador[0].getNombreEntrenador()+"\n");
        
          for (int i = 0; i < 2; i++)
          {        
             System.out.println("----> Turno "+ entrenador[i].getNombreEntrenador()+"\n");
              for (int j = 0; j < 3; j++) 
              {
                  System.out.println(j+1+". "+ entrenador[i].getPokemonesCapturados().get(j).getNombrePokemon() +"\n");
              }
               System.out.println("Seleccione su Pokemon de combate: ");
               opcion = objScanner.nextInt();
                if (opcion<1 || opcion>3){
                    do{
                       System.out.println("Numero de pokemon incorrecto. Ingrese el numero nuevamente: ");  
                       opcion = objScanner.nextInt();  
                    }while(opcion<1 || opcion>3);
                } 
                System.out.println("Numero de pokemon correcto ");               
               System.out.println("\n" +entrenador[i].getNombreEntrenador() +" eligio "+ entrenador[i].getPokemonesCapturados().get(opcion-1).getNombrePokemon());
               entrenador[i].setPokemonCombate(entrenador[i].getPokemonesCapturados().get(opcion-1));
          }
           
    }
    
    public static void modoCombate(Entrenador[] entrenadores)
    {
        double dañoA;
        int i=0,j=0,k=1;
        int escogerGanador1=0,escogerGanador2=0;
       elegirPokemonCombate(entrenadores);
        System.out.println("********************COMBATE "+entrenadores[0].getPokemonCombate().getNombrePokemon()+" VS "+entrenadores[1].getPokemonCombate().getNombrePokemon()+"***********************************\n");
        System.out.println("Estadísticas de "+entrenadores[0].getPokemonCombate().getNombrePokemon()+"\n");
        entrenadores[0].getPokemonCombate().obtenerEstadisticas();
        System.out.println("Estadísticas de "+entrenadores[1].getPokemonCombate().getNombrePokemon()+"\n");        
        entrenadores[1].getPokemonCombate().obtenerEstadisticas();
        int numero = (int)(Math. random()*2+1);
        i=numero-1;
        j=numero;
                
        System.out.println("El entrenador "+entrenadores[numero-1].getNombreEntrenador()+" empieza a atacar con su pokemon "+ entrenadores[numero-1].getPokemonCombate().getNombrePokemon());
        while(entrenadores[0].getPokemonCombate().getPuntosSalud()>0 && entrenadores[1].getPokemonCombate().getPuntosSalud()>0){
            dañoA=entrenadores[j].getPokemonCombate().getPuntosSalud();
           efectoAtaque(entrenadores[i],entrenadores[j]); 
           dañoA=dañoA-entrenadores[j].getPokemonCombate().getPuntosSalud();
                  
                System.out.println("------------------------");
                System.out.println("ATAQUE"+k);
                k++;
                System.out.println("Pokemon atacante: "+entrenadores[i].getPokemonCombate().getNombrePokemon());
                System.out.println("efectividad del ataque: "+dañoA);  
                System.out.println("Pokemon atacado: "+entrenadores[j].getPokemonCombate().getNombrePokemon());
                System.out.println("Puntos de salud restantes: "+entrenadores[i].getPokemonCombate().getPuntosSalud());
                System.out.println("-------------------------");
                System.out.println("vida "+entrenadores[i].getPokemonCombate().getPuntosSalud()+"pokemon "+entrenadores[i].getPokemonCombate().getNombrePokemon());
                System.out.println("vida "+entrenadores[j].getPokemonCombate().getPuntosSalud()+"pokemon "+entrenadores[j].getPokemonCombate().getNombrePokemon());
                System.out.println("-------------------------");
                if (i==0) {
                              i=1;
                              j=0;
                          }else if (i==1) {
                              i=0;
                              j=1;
                          }
        }
        escogerGanador1= (int) entrenadores[0].getPokemonCombate().getPuntosSalud();
        escogerGanador2= (int) entrenadores[1].getPokemonCombate().getPuntosSalud();        
        if (escogerGanador1>escogerGanador2) {
                System.out.println("El pokemon ganador es : "+entrenadores[0].getPokemonCombate().getNombrePokemon());            
        }else{
                System.out.println("El pokemon ganador es : "+entrenadores[1].getPokemonCombate().getNombrePokemon());                    
        }

                      
           
    }
    public static int listarAtaques(Entrenador entrenadores) {
        Scanner objScanner = new Scanner(System.in);
        int opcionAtaque=0;
        System.out.println("Ataques "+entrenadores.getPokemonCombate().getNombrePokemon());
        for (int i = 0; i <entrenadores.getPokemonCombate().getListaAtaques().size() ; i++) {
            System.out.println(i+1+"."+entrenadores.getPokemonCombate().getListaAtaques().get(i)+"\n");
        }
        opcionAtaque= objScanner.nextInt();
        
      return opcionAtaque-1; 
    }
    public static void efectoAtaque(Entrenador entrenador1,Entrenador entrenador2) {
        double puntosSalud;
        float efectividad=(float) 0.5;
        if (entrenador1.getPokemonCombate()instanceof Fuego && entrenador2.getPokemonCombate()instanceof Fuego) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-efectividad;
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }
        if (entrenador1.getPokemonCombate()instanceof Fuego && entrenador2.getPokemonCombate()instanceof Agua) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-efectividad;
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }
        if (entrenador1.getPokemonCombate()instanceof Fuego && entrenador2.getPokemonCombate()instanceof Planta) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-(2);
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }        
        if (entrenador1.getPokemonCombate()instanceof Agua && entrenador2.getPokemonCombate()instanceof Fuego) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-(2);
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }
        if (entrenador1.getPokemonCombate()instanceof Agua && entrenador2.getPokemonCombate()instanceof Agua) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-efectividad;
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }
        if (entrenador1.getPokemonCombate()instanceof Agua && entrenador2.getPokemonCombate()instanceof Planta) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-efectividad;
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }        
        if (entrenador1.getPokemonCombate()instanceof Planta && entrenador2.getPokemonCombate()instanceof Fuego) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-efectividad;
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }
        if (entrenador1.getPokemonCombate()instanceof Planta && entrenador2.getPokemonCombate()instanceof Agua) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-(2);
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }
        if (entrenador1.getPokemonCombate()instanceof Planta && entrenador2.getPokemonCombate()instanceof Planta) {
            puntosSalud = entrenador2.getPokemonCombate().getPuntosSalud();
            puntosSalud=puntosSalud-efectividad;
            entrenador2.getPokemonCombate().setPuntosSalud(puntosSalud);
        }        
                        
        
    }
    
}
