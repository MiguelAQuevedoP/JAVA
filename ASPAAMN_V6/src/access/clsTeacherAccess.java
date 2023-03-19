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

public class clsTeacherAccess {
        //parametros
    clsConnection conexion = new clsConnection();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.conectar();
    
    public void AddTeacher(clsDocente teacher) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            aux=conexion.conectar();
            String sql= "INSERT INTO teacher (nombre, fechanacimiento, documento, codigo, email, contraseña) VALUES (?, ?, ?, ?, ?, ?)";
            ps=aux.prepareStatement(sql);
            ps.setString(1, teacher.getName());
            ps.setString(2, teacher.getDateBirth());
            ps.setLong(3, teacher.getId());
            ps.setLong(4, teacher.getCode());
            ps.setString(5, teacher.getEmail());
            ps.setString(6, teacher.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsTeacherAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public clsDocente SearchTeacher(Long codTeacher) {
        aux=conexion.conectar();
        clsDocente teacher=null;
        try {
            String sql="SELECT nombre, fechanacimiento, documento, codigo, email, contraseña FROM teacher WHERE codigo=?";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, codTeacher);
            rs=ps.executeQuery();
            while(rs.next()){
                teacher = new clsDocente(
                        rs.getString("nombre"),
                        rs.getLong("documento"),
                        rs.getLong("codigo"),
                        rs.getString("email"),
                        rs.getString("contraseña"),
                        rs.getString("fechanacimiento")
                        );
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsTeacherAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teacher; 
    }
    
    public void updateTeacher(clsDocente c, Long codTeacher) {
        try {
            aux = conexion.conectar();
            String sql = "UPDATE teacher SET nombre=?, fechanacimiento=?, documento=?, codigo=?, email=?, contraseña=? WHERE codigo=?";
            ps = aux.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getDateBirth());
            ps.setLong(3, c.getId());
            ps.setLong(4, c.getCode());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getPassword());
            ps.setLong(7, codTeacher);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsTeacherAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public clsDocente login(String email) {
        aux=conexion.conectar();
        clsDocente teacherE=null;
        try {
            String sql="SELECT nombre, fechanacimiento, documento, codigo, email, contraseña FROM teacher WHERE email=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, email);
            rs=ps.executeQuery();
            while(rs.next()){
                teacherE = new clsDocente(
                        rs.getString("nombre"),
                        rs.getLong("documento"),
                        rs.getLong("codigo"),
                        rs.getString("email"),
                        rs.getString("contraseña"),
                        rs.getString("fechanacimiento")
                        );
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsTeacherAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return teacherE;
    }
    
}
