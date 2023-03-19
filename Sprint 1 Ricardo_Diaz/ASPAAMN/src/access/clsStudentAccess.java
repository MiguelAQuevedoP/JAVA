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
 * @author Laura
 */
public class clsStudentAccess {
        //parametros
    clsConnection conexion = new clsConnection();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.conectar();
    
    public void AddStudent(clsStudent student) {
        try {
            
            aux=conexion.conectar();
            String sql= "INSERT INTO student (nombre, fecha, tipodocumento, numdocumento, codigo, carrera) VALUES (?, ?, ?, ?, ?)";
            ps=aux.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getFecha());
            ps.setString(3, student.getTypeDocument());
            ps.setInt(4, student.getNumDocument());
            ps.setString(5, student.getCodeStudent());
            ps.setString(6, student.getCareer());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public clsStudent BuscarEstudiante(Long codEstudiante) {
        aux=conexion.conectar();
        clsStudent Estudiante=null;
        try {
             
            String sql="SELECT codigo, nombre, tipodocumento, numdocumento, carrera FROM vehiculo WHERE codigo=?";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, codEstudiante);
            rs=ps.executeQuery();
            while(rs.next()){
                Estudiante= new clsStudent(rs.getString("nombre"),rs.getString("fecha"), rs.getString("tipodocumento"),rs.getString("carrera"), rs.getInt("numdocumento"),rs.getString("codigo"));
            }
            
          
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Estudiante; 
    }
    public void EditarEstudiante(clsStudent c, String codEstudiante) {
        try {
            aux = conexion.conectar();
            String sql = "UPDATE student SET codigo=?,   nombre=?, fecha=?, tipodocumento=?, numdocumento=?, carrera=? WHERE codigo=?";
            ps = aux.prepareStatement(sql);
            ps.setString(1, c.getCodeStudent());
            ps.setString(2, c.getName());
            ps.setString(3, c.getFecha());
            ps.setString(4, c.getTypeDocument());
            ps.setInt(5, c.getNumDocument());
            ps.setString(6, c.getCareer());
             ps.setString(7, codEstudiante);
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


