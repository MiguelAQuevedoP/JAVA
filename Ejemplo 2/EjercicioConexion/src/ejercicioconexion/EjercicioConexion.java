/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioconexion;

import GUI.guiInicial;
import Servidor.servidor;
import java.io.IOException;

/**
 *
 * @author Laura
 */
public class EjercicioConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         guiInicial vista = new guiInicial();
         vista.setVisible(true);
         vista.setLocationRelativeTo(null);
        try {
            servidor objServidor= new servidor(5000);
            objServidor.ejecutarServidor();
        } catch (IOException ex) {
            System.out.println("Error al ejecutar el servidor");
        }

    }
    
}
