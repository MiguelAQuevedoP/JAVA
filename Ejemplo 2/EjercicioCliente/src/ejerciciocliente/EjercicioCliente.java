/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocliente;

import Vista.Cliente_vista;
import java.io.IOException;

/**
 *
 * @author Laura
 */
public class EjercicioCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         Cliente_vista vista = new Cliente_vista();
         vista.setVisible(true);
         vista.setLocationRelativeTo(null);
    }
    
}
