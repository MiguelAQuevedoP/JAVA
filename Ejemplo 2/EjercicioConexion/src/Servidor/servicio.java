/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import Acceso.clsClienteDAO;
import Entidades.clsCliente;

/**
 *
 * @author Laura
 */
public class servicio {
    private clsCliente cliente;
    
    private clsClienteDAO clientedao=new clsClienteDAO();
    
       public clsCliente encontrarCliente(Long cedula)
    {        
     cliente=clientedao.BuscarCliente(cedula);
         try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {            
        }
        return cliente;
    }
}
