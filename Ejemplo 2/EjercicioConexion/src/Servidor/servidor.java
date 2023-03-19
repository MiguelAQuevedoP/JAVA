/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import Entidades.clsCliente;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Laura
 */
public class servidor {
    private ServerSocket objServidor = null;  
    private DataInputStream objFlujoDeEntrada;
    private DataOutputStream objFlujoDeSalida;

    public servidor(int puerto) throws IOException {
         objServidor = new ServerSocket(puerto);
    }
    
    public  void ejecutarServidor() {
     Long cedula;
     clsCliente cliente;
     servicio objServicio=new servicio();

      
     Socket objSocket = null;//conexión con el cliente
 
        try {
           
            System.out.println("Servidor iniciado"); 
            
            while (true) {
                objSocket = objServidor.accept();
                System.out.println("Cliente nuevo conectado");
               
                objFlujoDeEntrada = new DataInputStream(objSocket.getInputStream());
                objFlujoDeSalida = new DataOutputStream(objSocket.getOutputStream());
 

                 cedula = objFlujoDeEntrada.readLong();
                 cliente=objServicio.encontrarCliente(cedula);

                System.out.println(" "+cliente.getNombre()+" "+cliente.getEmail());                  

                objFlujoDeSalida.writeUTF(cliente.getNombre()+" "+cliente.getEmail());
                objSocket.close(); //El servidor cierra el socket con el cliente
                System.out.println("Cliente desconectado");
 
            }
 
        } catch (IOException ex) {
            System.out.println("error de conexión");
        }
 
    }
}
