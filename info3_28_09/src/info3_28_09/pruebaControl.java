/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info3_28_09;

import java.util.Scanner;
/**
 *
 * @author INGESIS
 */
public class pruebaControl {
    private int numero;
     public int parImpar(){
         
         System.out.println("Ingresar valor: ");
         Scanner sc = new Scanner(System.in);
         numero = Integer.parseInt(sc.nextLine());
         int r = numero % 2;
         
         if (r==0){
             
            if (numero == 0){
                
                System.out.println("numero neutro");
            }
            else{
                System.out.println("numero par");
            }
         }
         
         else{
             System.out.println("numero impar");
         }
        return numero;
     }
    public void cuentAtras(){
        for(int i=10; i>0; i--){
            System.out.println("Número: "+i);
        }
    }
     public void cuentAtras1(){
         int[] numeros = new int[10];
         int valor = 9;
         for(int i=0; i<numeros.length; i++){
            numeros [i]=valor;
            valor--; 
         }
         for(int j:numeros){
             System.out.println("Número: "+j);
         }
     }
     /*
    public void cuenAtrasPro(){
        System.out.println("Ingresar valor: ");
         Scanner sc = new Scanner(System.in);
         int numero = Integer.parseInt(sc.nextLine());
         int r = numero % 2;
         
         if (r==0){
             
            if (numero == 0){
                
                System.out.println("numero neutro");
            }
            else{
                System.out.println("numero par");
            }
         }
         
         else{
             System.out.println("numero impar");
         }
        int[] numeros = new int[numero+1];
         int valor = numero;
         for(int i=0; i<numeros.length; i++){
            numeros [i]=valor;
            valor--; 
         }
         for(int j:numeros){
             System.out.println("Número: "+j);
         }
    }*/
    public void cuentAtrasFinal(){
        int[] numeros = new int[numero+1];
         int valor = numero;
         for(int i=0; i<numeros.length; i++){
            numeros [i]=valor;
            valor--; 
         }
         for(int j:numeros){
             System.out.println("Número: "+j);
         }
    }
    
    public void operations(){
        int first, second;
        double answer;
        System.out.println("Ingresar primer valor: ");
        Scanner sc = new Scanner(System.in);
        first = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresar segundo valor: ");
        second = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        while(flag){
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. producto");
            System.out.println("4. division");
            System.out.println("5. salir");
            int option = sc.nextInt();
            
            switch(option){
                case 1: answer = first+second;
                System.out.println("resultado suma : "+answer);
                break;
                case 2: answer = first-second;
                System.out.println("resultado resta : "+answer);
                break;
                case 3: answer = first*second;
                System.out.println("resultado producto : "+answer);
                break;
                case 4: answer = first/second;
                System.out.println("resultado division : "+answer);
                break;
                case 5:
                flag = false;
                System.out.println("syntax error");
                System.exit(0);
                break;
            }
        }
        
         
    }
    
    
    
    
    
    
    
    
}
