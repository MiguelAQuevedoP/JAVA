/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tatiana Garces
 */
public class proyectoParqueadero {

    static boolean flag = true, flagExit = true;

    static Scanner sc = new Scanner(System.in);

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
                    agregarAutomovil();
                    break;
                case 2:
                    agregarMotocicleta();
                    break;
                case 3:
                    buscarAutomovil();
                    break;
                case 4:
                    buscarMotocicleta();
                    break;
                case 5:
                    ActualizarColorA();
                    break;
                case 6:
                    ActualizarColorM();
                    break;
                case 7:
                    System.out.println("***HAZ SELECCIONADO VER TODOS LOS VEHICULOS***");
                    System.out.println("LOS AUTOMOVILES SON:");
                    verAutomoviles();
                    System.out.println("LAS MOTOCICLETAS SON:");
                    verMotocicletas();
                    break;
                case 8:
                    flagExit = false;
                    System.out.println("¡HAS SALIDO DEL SISTEMA!");
                    System.exit(0);
                    break;
            }
        }
    }

    //lee la cantidad de objetos que van a entrar y los agrega en orden
    public static void agregarAutomovil() {
        System.out.println("***ELEGISTE AGREGAR AUTOS***");
        int n, i, auxPuertas;
        String auxPlaca, auxColor, auxCilindraje;
        clsAutomovil auto;
        try {
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
                System.out.println("Digite color:");
                auxColor = sc.nextLine();
                System.out.println("Digite cilindraje:");
                auxCilindraje = sc.nextLine();
                System.out.println("Digite numero de puertas:");
                auxPuertas = sc.nextInt();
                //limpia sc
                sc.nextLine();
                auto = new clsAutomovil();

                auto.setPlaca(auxPlaca);
                auto.setColor(auxColor);
                auto.setCilindraje(auxCilindraje);
                auto.setNumPuertas(auxPuertas);

                //añade el objeto registrado al final de la lista
                arrayAutos.add(auto);

            } 
        } catch (Exception e) {

            System.out.println("*****Error: "+ e.getMessage()+"*****");

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
                System.out.println("Digite color:");
                auxColor = sc.nextLine();
                System.out.println("Digite cilindraje:");
                auxCilindraje = sc.nextLine();
                System.out.println("Digite numero de puertas:");
                auxPuertas = sc.nextInt();
                //limpia sc
                sc.nextLine();
                auto = new clsAutomovil();

                auto.setPlaca(auxPlaca);
                auto.setColor(auxColor);
                auto.setCilindraje(auxCilindraje);
                auto.setNumPuertas(auxPuertas);

                //añade el objeto registrado al final de la lista
                arrayAutos.add(auto);
            }
        }
    }

    //lee la cantidad de objetos que van a entrar y los agrega en orden con sus atributos
    public static void agregarMotocicleta() {
        System.out.println("***ELEGISTE AGREGAR MOTOCICLETAS***");
        int n, i;
        clsMotocicleta moto;
        try {
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

                //añade el objeto registrado al final de lista
                arrayMotos.add(moto);
            }
        } catch (NullPointerException e) {

            System.out.println("Error, No hay espacio\nValidar datos "+ e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println("Error, dato mal digitado\nValidar datos "+ e.getMessage());

        } catch (ArithmeticException e){
            
            System.out.println("Error aritmetico "+ e.getMessage());
            
        } catch (Exception e) {

            System.out.println("Error: "+ e.getMessage());

        }
    }

    //se muestran todos los carros
    public static void verAutomoviles() {
        for (int i = 0; i < arrayAutos.size(); i++) {
            System.out.println("\nAutomovil " + (i + 1));
            System.out.println(arrayAutos.get(i));
        }
    }

    //se muestran todas las motos
    public static void verMotocicletas() {
        for (int i = 0; i < arrayMotos.size(); i++) {
            System.out.println("\nMotocicleta " + (i + 1));
            System.out.println(arrayMotos.get(i));
        }
    }

    //metodo que permite buscar un automovil mediante la placa o cilindraje
    public static void buscarAutomovil() {
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
            } else if (i >= arrayAutos.size()) {
                System.out.println("Vehiculo no registrado");
            }
        }
    }

    //metodo que permite buscar una motocicleta mediante la placa o cilindraje
    public static void buscarMotocicleta() {
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
            } else if (i >= arrayMotos.size()) {
                System.out.println("Vehiculo no registrado");
            }
        }
    }

    //cambia el color del automovil
    public static void ActualizarColorA() {
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
            } else if (i >= arrayAutos.size()) {
                System.out.println("Automovil no encontrado");
            }
        }
    }

    //cambia el color de la motocicleta
    public static void ActualizarColorM() {
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
            } else if (i >= arrayMotos.size()) {
                System.out.println("Vehiculo no registrado");
            }
        }
    }
}
