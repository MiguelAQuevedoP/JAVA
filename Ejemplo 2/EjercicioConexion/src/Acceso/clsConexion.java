/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura
 */
public class clsConexion {
            //parametros
    Connection con;
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String usuario = "app_devep";
    String clave = "qwerty123";
    
    //operaciones
    public Connection conectar(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url,usuario,clave);
        } catch (Exception ex) {
            Logger.getLogger(clsConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
        public void desconectar() throws SQLException{
          if(con!= null){
             con.close();
                }
    }
}
