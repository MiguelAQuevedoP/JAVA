package accesoDatosParqueadero;
//Se importan las librerías necesarias para almacenar y visualizar todos los 
//carros dentro del parqueadero.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
// Se importan las clases que representan los tipos de vehículos almacenados en el parqueadero.
import principalParqueadero.*;
        

public class almacenamientoParqueadero {
    
//Métodos para almacenar los vehículos que ingresan al parqueadero con sus respectivas excepciones.  
    
    public static void almacenarVehículo(LinkedList<vehículo> vehículo, String nombreArchivo)
    {
        FileOutputStream objFileOutputStream=null;
        try {
            objFileOutputStream = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escribir = new ObjectOutputStream(objFileOutputStream);
            escribir.writeObject(vehículo);

        } catch (FileNotFoundException ex) {
            System.out.println("Error, vehículo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error al escribir los datos del vehículo");
        } finally {
            try {
                objFileOutputStream.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el sistema");
            }
        }
    }
//Métodos para leer los vehículos que ingresan al parqueadero.       
        
    public static LinkedList<vehículo> leerVehículo(String nombreArchivo)
    {
        LinkedList<vehículo> listaVehículos=new LinkedList();
        FileInputStream objFileInputStream=null;
        try {
            objFileInputStream = new FileInputStream(nombreArchivo);
            ObjectInputStream objLeer = new ObjectInputStream(objFileInputStream);
            listaVehículos=(LinkedList<vehículo>) objLeer.readObject();

        } catch (FileNotFoundException ex) {
            System.out.println("Error, vehículo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error al leer los datos");
            System.out.println(""+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error, clase de vehículo no encontrada");
        } finally {
            try {
                objFileInputStream.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar sistema");
            }
             return listaVehículos;
        }
    }
}

