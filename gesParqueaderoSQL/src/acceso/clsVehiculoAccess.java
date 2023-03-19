/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import modelo.clsVehiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class clsVehiculoAccess {
        //parametros
    clsConexion conexion = new clsConexion();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.conectar();
    
    public void AddVehiculo(clsVehiculo c) {
        try {
            aux=conexion.conectar();
            String sql= "INSERT INTO vehiculo (placa, color, cilindraje, caja, puertas) VALUES (?, ?, ?, ?, ?)";
            ps=aux.prepareStatement(sql);
            ps.setString(1, c.getPlaca());
            ps.setString(2, c.getColor());
            ps.setInt(3, c.getCilindraje());
            ps.setString(4, c.getCaja());
            ps.setString(5, c.getPuertas());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsVehiculoAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void updateVehiculo(clsVehiculo c, String auxPlaca) {
        try {
            aux=conexion.conectar();
            String sql= "UPDATE vehiculo SET placa=?,  color=?, cilindraje=?, caja=?, puertas=? WHERE placa=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, c.getPlaca());
            ps.setString(2, c.getColor());
            ps.setInt(3, c.getCilindraje());
            ps.setString(4, c.getCaja());
            ps.setString(5, c.getPuertas());
            ps.setString(6, auxPlaca);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsVehiculoAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void deleteVehiculo(clsVehiculo c) {
        try {
            aux=conexion.conectar();
            String sql= "DELETE FROM vehiculo WHERE placa=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, c.getPlaca());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsVehiculoAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public clsVehiculo searchVehiculo(String auxPlaca){
        aux = conexion.conectar();
       clsVehiculo vehiculo = null;
        try {
             
            String sql="SELECT placa, color, cilindraje, caja, puertas FROM vehiculo WHERE placa=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, auxPlaca);
            rs=ps.executeQuery();
            while(rs.next()){
                vehiculo = new clsVehiculo(rs.getString("placa"),
                        rs.getString("color"),
                        rs.getInt("cilindraje"),
                        rs.getString("caja"),
                        rs.getString("puertas"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsVehiculoAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculo; 
    }
    
    
    public List<clsVehiculo> watchVehiculos(){
        
      List<clsVehiculo> vehiculos = new ArrayList<>();
      aux = conexion.conectar();
        try {

            ps=aux.prepareStatement("SELECT * FROM vehiculo");
            rs=ps.executeQuery();
            while(rs.next()){
                clsVehiculo vehiculo= new clsVehiculo();
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setColor(rs.getString("color"));
                vehiculo.setCilindraje(rs.getInt("cilindraje"));
                vehiculo.setCaja(rs.getString("caja"));
                vehiculo.setPuertas(rs.getString("puertas"));
                vehiculos.add(vehiculo);
            }
       } catch (SQLException ex) {
            Logger.getLogger(clsVehiculoAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculos; 
    }
    
}


