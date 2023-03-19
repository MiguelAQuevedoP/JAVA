/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemagestion.dao;

import com.mycompany.sistemagestion.models.clsCliente;
import com.mysql.jdbc.StringUtils;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 */
public class clsClienteDao {
    
    public Connection connect(){
        String bbdd = "java";
        String user = "root";
        String password = "";
        String host = "localhost";
        String port = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String conectionUrl = "jdbc:mysql://" + host + ":" + port + "/" + bbdd + "?useSSL=false";
        
        Connection connection = null;
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(conectionUrl, user, password);
            
        } catch (Exception ex) {
            Logger.getLogger(clsClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    public void addCliente(clsCliente c){
        
        try {
            Connection connection = connect();
            String sql = "INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `telefono`, `email`) VALUES (NULL, '"+
                    c.getName() +"', '"+
                    c.getLastName()+"', '"+
                    c.getPhone() +"', '"+
                    c.getEmail() +"');";
            
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(clsClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<clsCliente> listar(){
        
        List<clsCliente> listado = new ArrayList();
        try {
            Connection connection = connect();
            
            String sql = "SELECT * FROM `clientes`";
            
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()){
                clsCliente c = new clsCliente();
                c.setId(result.getInt("id"));
                c.setName(result.getString("nombre"));
                c.setLastName(result.getString("apellido"));
                c.setPhone(result.getString("telefono"));
                c.setEmail(result.getString("email"));
                listado.add(c);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(clsClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    public void deleteCliente(int id){
        
        try {
            Connection connection = connect();
            String sql = "DELETE FROM clientes WHERE `clientes`.`id` = "+ id;
            
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(clsClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void upCliente(clsCliente c){
        
        try {
            Connection connection = connect();
            String sql = "UPDATE `clientes` SET `nombre` = '"+c.getName() +
                    "', `apellido` = '"+ c.getLastName() +
                    "', `telefono` = '"+ c.getPhone() +
                    "', `email` = '"+ c.getEmail() +
                    "' WHERE `clientes`.`id` ="+ c.getId() +" ;";
            
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(clsClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveCliente(clsCliente c) {
        if (c.getId() == 0){
            addCliente(c);
        }else{
            upCliente(c);
        }
    }
    
}
