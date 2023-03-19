/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.clsAdmin;

/**
 *
 * @author migue
 */
public class clsAdminAccess {
    //PARAMETROS
    clsConnection conexion = new clsConnection();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.conectar();
    
    //METODOS
    public clsAdmin login(String email) {
        aux=conexion.conectar();
        clsAdmin admin=null;
        try {
            String sql="SELECT nombre, email, contraseña, codigo FROM admin WHERE email=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, email);
            rs=ps.executeQuery();
            while(rs.next()){
                admin = new clsAdmin(
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("contraseña"),
                        rs.getLong("codigo")
                        );
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsAdminAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return admin;
    }
}
