package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    Connection SIMCA;
    String url = "jdbc:oracle:thin:@//localhost:1521/XE";
    String Usuario = "administrador";
    String Clave = "qwerty";
    
    public Conexion(){
        
    }

    public Connection SIMCA(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            SIMCA=DriverManager.getConnection(url,Usuario,Clave);
            //Statement statement = Desarrollador.createStatement();
            System.out.println("Conecto");
            return SIMCA;
            
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no sirve");
        }
        return SIMCA;
    }
    
    public void desconectar() throws SQLException{
      if(SIMCA!= null){
         SIMCA.close();
        }
    }
}