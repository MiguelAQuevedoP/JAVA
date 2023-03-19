/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Laura
 */
public class cliente {
    private final String dirIpServidor;
    private final int puertoServidor;
    private DataInputStream objFlujoDeEntrada;
    private DataOutputStream objFlujoDeSalida;
    private Socket objSocket;
    
    public cliente(String dirIpServidor, int puertoServidor) {
        this.dirIpServidor = dirIpServidor;
        this.puertoServidor = puertoServidor;
    }    
    
    public void crearConexion() throws IOException
    {
        
        objSocket = new Socket(dirIpServidor, puertoServidor); //socket para conectarse con el servidor

        objFlujoDeEntrada = new DataInputStream(objSocket.getInputStream());
        objFlujoDeSalida = new DataOutputStream(objSocket.getOutputStream());
    }
    
    public void cerrarConexion() throws IOException
    {
        objSocket.close();
    }
    
    public String consultarCliente(Long cedula) {
        String respuesta = "";
        try {
            objFlujoDeSalida.writeLong(cedula);
            respuesta= objFlujoDeEntrada.readUTF(); 
        
        } catch (IOException ex) {
            System.out.println("Error al realizar la conexión");
        }
      
        return respuesta;
    }
}
