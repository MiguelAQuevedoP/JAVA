package Conexion;

import Modelo.clsCourse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cursos {
    //CONEXION
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.SIMCA();
    
    public void AgregarCurso(clsCourse Curso) {
        try {
            try{
               aux=conexion.SIMCA();
                String sql= "INSERT INTO Curso (Codigo, Nombre, C_Materia,Periodo,Profesor,Horario_1,Horario_2,Tam) VALUES (?,?,?,?,?,?,?,?)";
                ps=aux.prepareStatement(sql);
                ps.setInt(1, Curso.getCodigo());
                ps.setString(2, Curso.getNombre());
                ps.setInt(3, Curso.getC_Materia());
                ps.setString(4, Curso.getPeriodo());
                ps.setInt(5, Curso.getProfesor());
                ps.setString(6, Curso.getHorario_1());
                ps.setString(7, Curso.getHorario_2());
                ps.setInt(8, Curso.getTam());
                ps.executeUpdate();
            }
            catch(NumberFormatException Ex){
                JOptionPane.showMessageDialog(null, "Datos Incorrectos, Por favor verificar la información Ingresada");
            } 
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public ArrayList<clsCourse> VerCursos(){
        ArrayList<clsCourse> vCursos = new ArrayList<clsCourse>();
        aux=conexion.SIMCA();
        try {
            ps=aux.prepareStatement("SELECT * FROM Curso");
            rs=ps.executeQuery();
            while(rs.next()){
                    clsCourse C = new clsCourse(rs.getString("Nombre"),rs.getInt("C_Materia"),rs.getInt("Profesor"),rs.getInt("Tam"), rs.getInt("Codigo"),rs.getString("Horario_1"),rs.getString("Horario_2"),rs.getString("Periodo"));
                    vCursos.add(C);  
            }
       } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vCursos; 
    }
    
    public clsCourse BuscarCurso(int Codigo){
        aux=conexion.SIMCA();
        clsCourse C =null;
        try {
            String sql="SELECT * FROM Curso WHERE Codigo=?";
            ps=aux.prepareStatement(sql);
            ps.setInt(1, Codigo);
            rs=ps.executeQuery();
            while(rs.next()){
               C = new clsCourse(rs.getString("Nombre"),rs.getInt("C_Materia"),rs.getInt("Profesor"),rs.getInt("Tam"), rs.getInt("Codigo"),rs.getString("Horario_1"),rs.getString("Horario_2"),rs.getString("Periodo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return C; 
    }
    
    public ArrayList<clsCourse> BuscarCursoNombre(String Nombre){
        aux=conexion.SIMCA();
        ArrayList<clsCourse> Cs = new ArrayList<clsCourse>();
        clsCourse C = null;
        try {
            String sql="SELECT * FROM Curso WHERE Nombre=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, Nombre);
            rs=ps.executeQuery();
            while(rs.next()){
                C = new clsCourse(rs.getString("Nombre"),rs.getInt("C_Materia"),rs.getInt("Profesor"),rs.getInt("Tam"), rs.getInt("Codigo"),rs.getString("Horario_1"),rs.getString("Horario_2"),rs.getString("Periodo"));
                Cs.add(C);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return Cs; 
    }
    
    public String PeriodoCursoNombre(String Nombre){
        aux=conexion.SIMCA();
        String p=null;
        try {
            String sql="SELECT Periodo FROM Curso WHERE Nombre=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, Nombre);
            rs=ps.executeQuery();
            while(rs.next()){
                p = rs.getString("Periodo");
            }

        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p; 
    }   
}
