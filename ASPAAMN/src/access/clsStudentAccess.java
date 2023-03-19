/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 * 
 */

public class clsStudentAccess {
        //parametros
    clsConnection conexion = new clsConnection();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.conectar();
    
    public void AddStudent(clsStudent student) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            aux=conexion.conectar();
            String sql= "INSERT INTO student (nombre, fechanacimiento, tipodocumento, numdocumento, codigo, carrera) VALUES (?, ?, ?, ?, ?, ?)";
            ps=aux.prepareStatement(sql);
            ps.setString(1, student.getName());
            String strDate = formato.format(student.getDateBirth().getTime());
            ps.setString(2, strDate);
            ps.setString(3, student.getTypeDocument());
            ps.setLong(4, student.getNumDocument());
            ps.setLong(5, student.getCodeStudent());
            ps.setString(6, student.getCareer());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    /*public void updateVehiculo(clsStudent student, String auxPlaca) {
        try {
            aux=conexion.conectar();
            String sql= "UPDATE vehiculo SET placa=?,  color=?, cilindraje=?, caja=?, puertas=? WHERE placa=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, student.getPlaca());
            ps.setString(2, student.getColor());
            ps.setInt(3, student.getCilindraje());
            ps.setString(4, student.getCaja());
            ps.setString(5, student.getPuertas());
            ps.setString(6, auxPlaca);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    
    
    /*public void deleteVehiculo(clsStudent student) {
        try {
            aux=conexion.conectar();
            String sql= "DELETE FROM vehiculo WHERE placa=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, student.getPlaca());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    
    
    /*public clsStudent searchVehiculo(String auxPlaca){
        aux = conexion.conectar();
       clsStudent vehiculo = null;
        try {
             
            String sql="SELECT placa, color, cilindraje, caja, puertas FROM vehiculo WHERE placa=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, auxPlaca);
            rs=ps.executeQuery();
            while(rs.next()){
                vehiculo = new clsStudent(rs.getString("placa"),
                        rs.getString("color"),
                        rs.getInt("cilindraje"),
                        rs.getString("caja"),
                        rs.getString("puertas"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculo; 
    }*/
    
    
    /*public List<clsStudent> watchVehiculos(){
        
      List<clsStudent> vehiculos = new ArrayList<>();
      aux = conexion.conectar();
        try {

            ps=aux.prepareStatement("SELECT * FROM vehiculo");
            rs=ps.executeQuery();
            while(rs.next()){
                clsStudent vehiculo= new clsStudent();
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setColor(rs.getString("color"));
                vehiculo.setCilindraje(rs.getInt("cilindraje"));
                vehiculo.setCaja(rs.getString("caja"));
                vehiculo.setPuertas(rs.getString("puertas"));
                vehiculos.add(vehiculo);
            }
       } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculos; 
    }*/
    
}


