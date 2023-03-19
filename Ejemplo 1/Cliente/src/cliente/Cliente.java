package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

 
public class Cliente {
 
    public static void main(String[] args) {
 
       
        String dirIpServidor = "127.0.0.1";//en nuestro caso la direccion del servidor es el localhost
        int puertoServidor = 5001;//seleccionamos el puerto de escucha del servidor: 5001, podria ser otro que no este reservado. Ej: 5000, 60000, etc
 
        try {
            //El cliente crea un socket para conectarse con el servidor con la dirección IP del servidor y el puerto
            Socket objSocket = new Socket(dirIpServidor, puertoServidor);//se dan los parametros para realizar la conexion y con esto se crea el canal bidireccional
 
            //El cliente obtiene dos referencias al canal bidireccional
            DataInputStream objParaLeerDelCanal = new DataInputStream(objSocket.getInputStream()); //para entrada
            DataOutputStream objFlujoSalida = new DataOutputStream(objSocket.getOutputStream()); //para salida
            
            System.out.println("Digite un mensaje: ");
            Scanner objScanner=new Scanner(System.in);
            String mensaje=objScanner.nextLine();
            
            objFlujoSalida.writeUTF(mensaje); //el cliente envia este mensaje al servidor
 
            //El Cliente recibe un mensaje del servidor
            String mensajeDeRespuesta = objParaLeerDelCanal.readUTF();//cliente lee el mensaje de respuesta del servidor
 
            System.out.println(mensajeDeRespuesta);//se muestra en consola el mensaje
                        
            objSocket.close();//se cierra el socket
            
        } 
        catch (IOException ex) {
            System.out.println("Error al realizar la conexión");
        }
 
    }
 
}