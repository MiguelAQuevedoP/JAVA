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
public class clsCourseAccess {
    //parametros

    clsConnection conexion = new clsConnection();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux = conexion.conectar();

    public void AddInfoCourse(clsInfoCourse infoCourse) {
        try {
            aux = conexion.conectar();
            String sql = "INSERT INTO infocourse (codigocurso, codigodocente, nombre, cupos) VALUES (?, ?, ?, ?)";
            ps = aux.prepareStatement(sql);
            ps.setString(1, infoCourse.getCode());
            ps.setLong(2, infoCourse.getCodeTeacher());
            ps.setString(3, infoCourse.getName());
            ps.setInt(4, infoCourse.getAvailabity());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddCourseStudent(clsCourseStudent courseStudent) {
        try {
            aux = conexion.conectar();
            String sql = "INSERT INTO coursestudent (codigoestudiante, nombre, email, codigocurso, calificacion, faltas, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
            ps = aux.prepareStatement(sql);
            ps.setLong(1, courseStudent.getCodeSt());
            ps.setString(2, courseStudent.getNameSt());
            ps.setString(3, courseStudent.getEmailSt());
            ps.setString(4, courseStudent.getCodeCourse());
            ps.setDouble(5, courseStudent.getScore());
            ps.setInt(6, courseStudent.getAtteandace());
            ps.setString(7, courseStudent.getStatus());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public clsInfoCourse searchCourse(String codInfoCourse) {

        aux = conexion.conectar();
        clsInfoCourse infoCourse = null;
        try {

            String sql = "SELECT codigocurso, codigodocente, nombre, cupos FROM infocourse WHERE codigocurso=?";
            ps = aux.prepareStatement(sql);
            ps.setString(1, codInfoCourse);
            rs = ps.executeQuery();
            while (rs.next()) {
                infoCourse = new clsInfoCourse(
                        rs.getString("codigocurso"),
                        rs.getLong("codigodocente"),
                        rs.getString("nombre"),
                        rs.getInt("cupos")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infoCourse;
    }

    public clsCourseStudent searchCourseSt(String codCourseSt) {

        aux = conexion.conectar();
        clsCourseStudent courseSt = null;
        try {

            String sql = "SELECT codigoestudiante, nombre, email, codigocurso, calificacion, faltas, estado FROM coursestudent WHERE codigocurso=?";
            ps = aux.prepareStatement(sql);
            ps.setString(1, codCourseSt);
            rs = ps.executeQuery();
            while (rs.next()) {
                courseSt = new clsCourseStudent(
                        rs.getLong("codigoestudiante"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("codigocurso"),
                        rs.getDouble("calificacion"),
                        rs.getInt("faltas"),
                        rs.getString("estado")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courseSt;
    }
    
    public List<clsInfoCourse> watchCourses() {
        List<clsInfoCourse> courses = new ArrayList<>();
        aux = conexion.conectar();
        try {
            ps = aux.prepareStatement("SELECT * FROM infocourse");
            rs = ps.executeQuery();
            while (rs.next()) {
                clsInfoCourse course = new clsInfoCourse();
                course.setCode(rs.getString("codigocurso"));
                course.setCodeTeacher(rs.getLong("codigodocente"));
                course.setName(rs.getString("nombre"));
                course.setAvailabity(rs.getInt("cupos"));
                courses.add(course);
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courses;
    }
    public List<clsCourseStudent> watchCourseSt() {
        List<clsCourseStudent> courses = new ArrayList<>();
        aux = conexion.conectar();
        try {
            ps = aux.prepareStatement("SELECT * FROM coursestudent");
            rs = ps.executeQuery();
            while (rs.next()) {
                clsCourseStudent courseSt = new clsCourseStudent();
                courseSt.setCodeSt(rs.getLong("codigoestudiante"));
                courseSt.setNameSt(rs.getString("nombre"));
                courseSt.setEmailSt(rs.getString("email"));
                courseSt.setCodeCourse(rs.getString("codigocurso"));
                courseSt.setScore(rs.getDouble("calificacion"));
                courseSt.setAtteandace(rs.getInt("faltas"));
                courseSt.setStatus(rs.getString("estado"));
                courses.add(courseSt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courses;
    }
    //METODO QUE SE ENCARGA DE CAMBIAR  EL NUMERO DE CUPOS CUANDO UN ESTUDIANTE SE REGISTRA
    public void upInfoCourse(clsInfoCourse c, String codCourse) {
        try {
            aux = conexion.conectar();
            String sql = "UPDATE infocourse SET cupos=? WHERE codigocurso=?";
            ps = aux.prepareStatement(sql);
            ps.setInt(1, c.getAvailabity());
            ps.setString(2, codCourse);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //METODO PARA EDITAR LAS FALTAS DE clscourseStudent
    public void upAttendance(clsCourseStudent c, Long codSt, String codCourse) {
        try {
            aux = conexion.conectar();
            String sql = "UPDATE coursestudent SET faltas=?, estado=? WHERE codigoestudiante=? AND codigocurso=?";
            ps = aux.prepareStatement(sql);
            ps.setInt(1, c.getAtteandace());
            ps.setString(2, c.getStatus());
            ps.setLong(3, codSt);
            ps.setString(4, codCourse);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    
    //METODO PARA AGREGAR LAS NOTAS DE LOS ESTUDIANTES
    public void upScore(clsCourseStudent c, Long codSt, String codCourse) {
        try {
            aux = conexion.conectar();
            String sql = "UPDATE coursestudent SET calificacion=?, estado=? WHERE codigoestudiante=? AND codigocurso=?";
            ps = aux.prepareStatement(sql);
            ps.setDouble(1, c.getScore());
            ps.setString(2, c.getStatus());
            ps.setLong(3, codSt);
            ps.setString(4, codCourse);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
 /*public void deleteStudent(clsStudent student) {
        try {
            aux=conexion.conectar();
            String sql= "DELETE FROM student WHERE codigo=?";
            ps=aux.prepareStatement(sql);
            ps.setLong(1, student.getCodeStudent());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clsCourseAccess.class.getName()).log(Level.SEVERE, null, ex);
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
