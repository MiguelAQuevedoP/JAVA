package access;

import model.*;

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
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 * 
 */

public class clsDepartmentAccess {
        //parametros
    clsConnection conexion = new clsConnection();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.conectar();
    
    /*public void AddStudent(clsStudent student) {
        try {
            aux=conexion.conectar();
            String sql= "INSERT INTO student (name, , dateOfBirth, TypeOfDocument, NumberOfDocument, codeStudent, career) VALUES (?, ?, ?, ?, ?, ?)";
            ps=aux.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getDateBirth().toString());
            ps.setString(3, student.getTypeDocument());
            ps.setLong(4, student.getNumDocument());
            ps.setLong(5, student.getCodeStudent());
            ps.setString(6, student.getCareer());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateVehiculo(clsStudent student, String auxPlaca) {
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
    }
    
    public void deleteVehiculo(clsStudent student) {
        try {
            aux=conexion.conectar();
            String sql= "DELETE FROM vehiculo WHERE placa=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, student.getPlaca());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsStudentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public clsStudent searchVehiculo(String auxPlaca){
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
    
    
    public List<clsDepartment> watchDepartments(){
        
      List<clsDepartment> departments = new ArrayList<>();
      aux = conexion.conectar();
        try {

            ps=aux.prepareStatement("SELECT * FROM department");
            rs=ps.executeQuery();
            while(rs.next()){
                clsDepartment department = new clsDepartment();
                department.setName(rs.getString("nombre"));
                department.setJefe(rs.getString("jefe"));
                departments.add(department);
            }
       } catch (SQLException ex) {
            Logger.getLogger(clsDepartmentAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departments; 
    }
    
}