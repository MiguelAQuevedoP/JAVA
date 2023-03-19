/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesparqueadero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class GesParqueadero {

    static boolean flag = true, flagExit = true;
    //ESCANER PARA LEER LO QUE EL USUARIO DIGITA
    static Scanner sc = new Scanner(System.in);
    //ARREGLOS DE OBJETOS
    static ArrayList<clsAutomovil> arrayAutos = new ArrayList<>();
    static ArrayList<clsMotocicleta> arrayMotos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("*****PARQUEADERO*****");
        System.out.println("1. AGREGAR AUTOMOVILES");
        System.out.println("2. AGREGAR MOTOCICLETAS");
        System.out.println("3. BUSCAR AUTO POR PLACA O CILINDRAJE");
        System.out.println("4. BUSCAR MOTO POR PLACA O CILINDRAJE");
        System.out.println("5. ACTUALIZAR COLOR DE AUTOMOVIL");
        System.out.println("6. ACTUALIZAR COLOR DE MOTOCICLETA");
        System.out.println("7. VER TODOS LOS VEHICULOS");
        System.out.println("8. SALIR DEL SISTEMA");
        menu();
    }

    public static void menu() {
        while (flagExit) {
            System.out.println("SELECCIONE UNA OPCIÓN");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    //AGREGAR AUTOS
                    leerAutos();
                    break;
                case 2:
                    //AGREGAR MOTOS
                    leerMotos();
                    break;
                case 3:
                    //BUSCAR AUTOS POR PLACA O CILINDRAJE
                    verificarAutoMenu();
                    break;
                case 4:
                    //BUSCAR MOTOS POR PLACA O CILINDRAJE
                    verificarMotoMenu();
                    break;
                case 5:
                    //ACTUALIZAR COLOR DE AUTOMOVIL
                    changeColorAuto();
                    break;
                case 6:
                    //ACTUALIZAR COLOR DE MOTOCICLETA
                    changeColorMoto();
                    break;
                case 7:
                    //VER TODOS LOS VEHICULOS
                    System.out.println("LOS AUTOMOVILES SON:");
                    viewAutos();
                    System.out.println("LAS MOTOCICLETAS SON:");
                    viewMotos();
                    break;
                case 8:
                    flagExit = false;
                    System.out.println("¡HAS SALIDO DEL SISTEMA!");
                    System.exit(0);
                    break;
            }
        }
    }

    //LEE CUANTOS AUTOS VAN A ENTRAR Y LOS AGREGA CON TODOS SUS ATRIBUTOS
    public static void leerAutos() {
        System.out.println("***ELEGISTE AGREGAR AUTOS***");
        int n, i, auxPuertas;
        String auxPlaca, auxColor, auxCilindraje;
        clsAutomovil auto;
        do {
            System.out.println("Digite el numero de autos que va a entrar: ");
            n = sc.nextInt();
        } while (n < 0);
        sc.nextLine();
        for (i = 0; i < n; i++) {
            //DATOS DEL COCHE
            System.out.println("AUTO " + (i + 1));
            System.out.println("Digite matricula:");
            auxPlaca = sc.nextLine();
            if (verificarAuto(auxPlaca) == true) {
                System.out.println("Digite color:");
                auxColor = sc.nextLine();
                System.out.println("Digite cilindraje:");
                auxCilindraje = sc.nextLine();
                System.out.println("Digite numero de puertas:");
                auxPuertas = sc.nextInt();
                //limpia
                sc.nextLine();
                auto = new clsAutomovil();

                auto.setPlaca(auxPlaca);
                auto.setColor(auxColor);
                auto.setCilindraje(auxCilindraje);
                auto.setNumPuertas(auxPuertas);

                //AÑADIR OBJETO AL FINAL DE LA LISTA
                arrayAutos.add(auto);
            } else{
            System.out.println("El objeto no puede ser agregado");
            }
        }
    }

    //LEE CUANTAS MOTOS VAN A ENTRAR Y LAS AGREGA CON TODOS SUS ATRIBUTOS
    public static void leerMotos() {
        System.out.println("***ELEGISTE AGREGAR MOTOCICLETAS***");
        int n, i;
        clsMotocicleta moto;
        do {
            System.out.println("Digite el numero de motocicletas que va a entrar: ");
            n = sc.nextInt();
        } while (n < 0);
        sc.nextLine();
        for (i = 0; i < n; i++) {
            moto = new clsMotocicleta();
            //DATOS DE LA MOTOCICLETA
            System.out.println("MOTOCICLETA " + (i + 1));
            System.out.println("Digite matricula:");
            moto.setPlaca(sc.nextLine());
            System.out.println("Digite color:");
            moto.setColor(sc.nextLine());
            System.out.println("Digite cilindraje:");
            moto.setCilindraje(sc.nextLine());
            System.out.println("Digite tipo de caja:");
            moto.setCaja(sc.nextInt());
            //limpia
            sc.nextLine();
            if (verificarMoto(moto.getPlaca()) == true) {
                //AÑADIR OBJETO AL FINAL DE LA LISTA
                arrayMotos.add(moto);
            }
            else{
                System.out.println("El objeto no puede ser agregado");
            }

        }
    }

    //VISUALIZA TODOS LOS AUTOS
    public static void viewAutos() {
        for (int i = 0; i < arrayAutos.size(); i++) {
            System.out.println("\nAutomovil " + (i + 1));
            System.out.println(arrayAutos.get(i));
        }
    }

    //VISUALIZA TODAS LAS MOTOS
    public static void viewMotos() {
        for (int i = 0; i < arrayMotos.size(); i++) {
            System.out.println("\nMotocicleta " + (i + 1));
            System.out.println(arrayMotos.get(i));
        }
    }

    //PREGUNTA DESDE EL MENU Y BUSCA AUTOMOVIL
    public static void verificarAutoMenu() {
        String placa;
        sc.nextLine();
        System.out.println("INTRODUZCA PLACA O CILINDRAJE:");
        placa = sc.nextLine();
        System.out.println("Placa o cilindraje de automovil: " + placa);
        for (int i = 0; i < arrayAutos.size(); i++) {
            if (arrayAutos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("El vehiculo ya está registrado");
                System.out.println(arrayAutos.get(i));
                break;
            }
            else if(i>=arrayAutos.size()){
                System.out.println("Vehiculo no registrado");
            }
        }
    }

    //PREGUNTA DESDE EL MENU Y BUSCA MOTOCICLETA
    public static void verificarMotoMenu() {
        String placa;
        sc.nextLine();
        System.out.println("INTRODUZCA PLACA:");
        placa = sc.nextLine();
        System.out.println("Placa de motocicleta: " + placa);
        for (int i = 0; i < arrayMotos.size(); i++) {
            if (arrayMotos.get(i).getPlaca().equalsIgnoreCase(placa) || arrayMotos.get(i).getCilindraje().equalsIgnoreCase(placa)) {
                System.out.println("El vehiculo ya está registrado");
                System.out.println(arrayMotos.get(i));
                break;
            }
            else if(i>=arrayMotos.size()){
                System.out.println("Vehiculo no registrado");
            }
        }
    }

    //VERIFICA SI EL VEHICULO ESTÁ Y DECIDE SI SE REGISTRA O NO
    public static boolean verificarAuto(String auxPlaca) {
        for (int i = 0; i < arrayAutos.size(); i++) {
            if (arrayAutos.get(i).getPlaca().equalsIgnoreCase(auxPlaca)) {
                System.out.println("El vehiculo registrado");
                flag = false;
                break;
            } else if(i>=arrayAutos.size()){
                System.out.println("Vehiculo no registrado");
                flag = true;
            }
        }
        return flag;
    }

    //VERIFICA SI EL VEHICULO ESTÁ Y DECIDE SI SE REGISTRA O NO
    public static boolean verificarMoto(String placa) {
        for (int i = 0; i < arrayMotos.size(); i++) {
            if (arrayMotos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("El vehiculo registrado");
                flag = false;
            } else if(i>=arrayMotos.size()){
                System.out.println("Vehiculo no registrado");
                flag = true;
            }
        }
        return flag;
    }

    //ACTUALIZAR COLOR DE AUTOMOVIL
    public static void changeColorAuto() {
        sc.nextLine();
        System.out.println("***ACTUALIZAR COLOR DE AUTOMOVIL***");
        String changePlacaAuto,
                newColor;
        System.out.println("INTRODUZCA PLACA:");
        changePlacaAuto = sc.nextLine();
        System.out.println("Placa de automovil: " + changePlacaAuto);
        for (int i = 0; i < arrayAutos.size(); i++) {
            if (arrayAutos.get(i).getPlaca().equalsIgnoreCase(changePlacaAuto)) {
                System.out.println("Vehiculo registrado");
                System.out.println("Escriba el color a actualizar:");
                newColor = sc.nextLine();
                arrayAutos.get(i).setColor(newColor);
                System.out.println("¡EL VEHICULO HA SIDO ACTUALIZADO!\nDATOS ACTUALIZADOS:");
                System.out.println(arrayAutos.get(i));
                System.out.println("PRESIONA ENTER PARA CONTINUAR");
                sc.nextLine();
                break;
            }
            else if(i >= arrayAutos.size()){
                System.out.println("Automovil no encontrado");
            }
        }
    }

    //ACTUALIZAR COLOR DE MOTOCICLETA
    public static void changeColorMoto() {
        sc.nextLine();
        System.out.println("***ACTUALIZAR COLOR DE MOTOCICLETA***");
        String changePlacaMoto, newColor;
        System.out.println("INTRODUZCA PLACA:");
        changePlacaMoto = sc.nextLine();
        System.out.println("Placa de motocicleta: " + changePlacaMoto);
        for (int i = 0; i < arrayMotos.size(); i++) {
            if (arrayMotos.get(i).getPlaca().equalsIgnoreCase(changePlacaMoto)) {
                System.out.println("El vehiculo registrado");
                System.out.println("Escriba el color a actualizar:");
                newColor = sc.nextLine();
                arrayMotos.get(i).setColor(newColor);
                System.out.println("¡EL VEHICULO HA SIDO ACTUALIZADO!\nDATOS ACTUALIZADOS:");
                System.out.println(arrayMotos.get(i));
                break;
            }
            else if(i>=arrayMotos.size()){
                System.out.println("Vehiculo no registrado");
            }
        }
    }
}
