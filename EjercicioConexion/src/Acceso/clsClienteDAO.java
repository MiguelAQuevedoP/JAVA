/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import Entidades.clsCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura
 */
public class clsClienteDAO {
        //parametros
    clsConexion conexion = new clsConexion();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.conectar();
    
    public void AgregarCliente(clsCliente c) {
        try {
            aux=conexion.conectar();
            String sql= "INSERT INTO cliente (cedula, nombre, email) VALUES (?, ?, ?)";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, c.getCedula());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getEmail());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EditarCliente(clsCliente c, Long ced) {
        try {
            aux=conexion.conectar();
            String sql= "UPDATE cliente SET cedula=?,  nombre=?, email=? WHERE cedula=?";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, c.getCedula());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getEmail());
            ps.setLong(4, ced);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void EliminarCliente(clsCliente c) {
        try {
            aux=conexion.conectar();
            String sql= "DELETE FROM cliente WHERE cedula=?";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, c.getCedula());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public clsCliente BuscarCliente(Long ced){
        aux=conexion.conectar();
       clsCliente cliente=null;
        try {
             
            String sql="SELECT cedula, nombre, email FROM cliente WHERE cedula=?";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, ced);
            rs=ps.executeQuery();
            while(rs.next()){
                cliente= new clsCliente(rs.getLong("cedula"), rs.getString("nombre"), rs.getString("email"));
            }
            
          
        } catch (SQLException ex) {
            Logger.getLogger(clsClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente; 
    }
    
    public List<clsCliente> VerClientes(){
        
      List<clsCliente> clientes=new ArrayList<>();
      aux=conexion.conectar();
        try {

            ps=aux.prepareStatement("SELECT * FROM cliente");
            rs=ps.executeQuery();
            while(rs.next()){
                clsCliente cliente= new clsCliente();
                cliente.setCedula(rs.getLong("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }
       } catch (SQLException ex) {
            Logger.getLogger(clsClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes; 
    }
     }


    