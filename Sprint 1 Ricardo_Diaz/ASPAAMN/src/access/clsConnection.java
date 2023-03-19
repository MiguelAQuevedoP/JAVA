/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura
 */
public class clsConnection {
            //parametros
    Connection con;
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String user = "adminaspaamn";
    String password = "qwerty123";
    
    //operaciones
    public Connection conectar(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url,user,password);
        } catch (Exception ex) {
            Logger.getLogger(clsConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
        public void desconectar() throws SQLException{
          if(con!= null){
             con.close();
                }
    }
}
