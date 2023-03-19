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
import java.util.Calendar;
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
            String sql= "INSERT INTO student (nombre, fechanacimiento, tipodocumento, numdocumento, codigo, carrera, email, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            ps=aux.prepareStatement(sql);
            ps.setString(1, student.getName());
            //String strDate = formato.format(student.getDateBirth().getTime());
            ps.setString(2, student.getDateBirth());
            ps.setString(3, student.getTypeDocument());
            ps.setLong(4, student.getNumDocument());
            ps.setLong(5, student.getCodeStudent());
            ps.setString(6, student.getCareer());
            ps.setString(7, student.getEmail());
            ps.setString(8, student.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public clsStudent BuscarEstudiante(Long codEstudiante) {
        
        aux=conexion.conectar();
        clsStudent Estudiante=null;
        try {
             
            String sql="SELECT nombre, fechanacimiento, tipodocumento, numdocumento, codigo, carrera, email, contraseña FROM student WHERE codigo=?";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, codEstudiante);
            rs=ps.executeQuery();
            while(rs.next()){
                Estudiante = new clsStudent(
                        rs.getString("nombre"),
                        rs.getString("tipodocumento"),
                        rs.getString("carrera"),
                        rs.getString("email"),
                        rs.getString("contraseña"),
                        rs.getString("fechanacimiento"),
                        rs.getLong("numdocumento"),
                        rs.getLong("codigo")
                        );
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Estudiante; 
    }
    public void EditarEstudiante(clsStudent c, Long codEstudiante) {
        try {
            //FORMATO PARA LA FECHA
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            aux = conexion.conectar();
            String sql = "UPDATE student SET nombre=?, fechanacimiento=?, tipodocumento=?, numdocumento=?, codigo=?, carrera=?, email=?, contraseña=? WHERE codigo=?";
            ps = aux.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getDateBirth());
            ps.setString(3, c.getTypeDocument());
            ps.setLong(4, c.getNumDocument());
            ps.setLong(5, c.getCodeStudent());
            ps.setString(6, c.getCareer());
            ps.setString(7, c.getEmail());
            ps.setString(8, c.getPassword());
            ps.setLong(9, codEstudiante);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteStudent(clsStudent student) {
        try {
            aux=conexion.conectar();
            String sql= "DELETE FROM student WHERE codigo=?";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, student.getCodeStudent());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public clsStudent login(String email) {
        
        aux=conexion.conectar();
        clsStudent EstudianteE=null;
        try {
             
            String sql="SELECT nombre, fechanacimiento, tipodocumento, numdocumento, codigo, carrera, email, contraseña FROM student WHERE email=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, email);
            rs=ps.executeQuery();
            while(rs.next()){
                EstudianteE = new clsStudent(
                        rs.getString("nombre"),
                        rs.getString("tipodocumento"),
                        rs.getString("carrera"),
                        rs.getString("email"),
                        rs.getString("contraseña"),
                        rs.getString("fechanacimiento"),
                        rs.getLong("numdocumento"),
                        rs.getLong("codigo")
                        );
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return EstudianteE; 
    }
    
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


