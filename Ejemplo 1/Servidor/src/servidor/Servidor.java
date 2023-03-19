package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

 
public class Servidor {
 
    public static void main(String[] args) { 
        
        final int PUERTO = 5001; //puerto de escucha del Servidor, final porque nunca varia
        try {
            
            ServerSocket objServidor = new ServerSocket(PUERTO);//Se crea el socket del Servidor
            System.out.println("Servidor iniciado");
            
            while (true) {//este bucle permiite escuchar peticiones siempre
 
                //Se espera a que un cliente se conecte. Cuando lo hace se crea un socket que referencia del canal bidireccional
                Socket objSocket = objServidor.accept();
                System.out.println("Cliente nuevo conectado");
               
                //El servidor obtiene dos referencias al canal bidireccional con el fin de leer y escribir
                DataInputStream objFlujoDeEntrada = new DataInputStream(objSocket.getInputStream());
                DataOutputStream objFlujoDeSalida = new DataOutputStream(objSocket.getOutputStream());
 
               
                String mensaje = objFlujoDeEntrada.readUTF(); //El Servidor lee el mensaje que envia el cliente
 
                System.out.println("Mensaje recibido del cliente: " + mensaje);
 
                
                objFlujoDeSalida.writeUTF("hola como vas tiempo sin vernos :)"); //El Servidor envia un mensaje al cliente
 
               
                objSocket.close();  //cierra el socket
                System.out.println("Cliente desconectado");
 
            }
 
        } catch (IOException ex) {
            System.out.println("error de conexión");
        }
 
    }
 
}