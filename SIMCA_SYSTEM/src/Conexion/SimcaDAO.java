package Conexion;

import Modelo.clsStudent;
import Modelo.clsQualification;
import Modelo.clsPerson;
import Modelo.clsTeacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SimcaDAO {
    //CONEXION
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.SIMCA();
    
    public void AgregarPersona(clsPerson Persona) {
        try {
            try{
               aux=conexion.SIMCA();
                if(Persona instanceof clsStudent){

                        String sql= "INSERT INTO Persona (Nombre, Apellido,Cedula, Codigo, dia, mes, anios,grado, Tipo) VALUES (?, ?, ?, ?, ?, ?, ?,?, ?)";
                        ps=aux.prepareStatement(sql);
                        ps.setString(1, Persona.getNombre());
                        ps.setString(2, Persona.getApellido());
                        ps.setInt(3, Persona.getCedula());
                        ps.setInt(4, Persona.getCodigo());
                        ps.setInt(5, Persona.getDia());
                        ps.setInt(6, Persona.getMes());
                        ps.setInt(7, Persona.getAnios());
                        ps.setString(8, " ");
                        ps.setString(9, "Estudiante");
                        ps.executeUpdate();



                }
                else if(Persona instanceof clsTeacher){
                    String sql= "INSERT INTO Persona (Nombre, Apellido,Cedula, Codigo, dia, mes, anios, grado, Tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
                    ps=aux.prepareStatement(sql);
                    ps.setString(1, Persona.getNombre());
                    ps.setString(2, Persona.getApellido());
                    ps.setInt(3, Persona.getCedula());
                    ps.setInt(4, Persona.getCodigo());
                    ps.setInt(5, Persona.getDia());
                    ps.setInt(6, Persona.getMes());
                    ps.setInt(7, Persona.getAnios());
                    ps.setString(8, ((clsTeacher) Persona).getGrado());
                    ps.setString(9, "Docente");
                    ps.executeUpdate();
                } 
            }
            catch(NumberFormatException Ex){
                JOptionPane.showMessageDialog(null, "Datos Incorrectos, Por favor verificar la información Ingresada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public clsPerson BuscarPersona(int Codigo){
        aux=conexion.SIMCA();
        clsPerson Persona =null;
        clsStudent Estudiante = null;
        clsTeacher Profesor = null;
        try {
            String sql="SELECT * FROM Persona WHERE Codigo=?";
            ps=aux.prepareStatement(sql);
            ps.setInt(1, Codigo);
            rs=ps.executeQuery();
            while(rs.next()){
                if(rs.getString("Tipo").equalsIgnoreCase("Estudiante")){
                    Estudiante = new clsStudent(rs.getString("Nombre"),rs.getString("Apellido"), rs.getInt("Codigo"), rs.getInt("Cedula"),rs.getInt("Dia"), rs.getInt("Mes"), rs.getInt("Anios") );
                    Persona = Estudiante;
                    
                }
                if(rs.getString("Tipo").equalsIgnoreCase("Docente")){
                    Profesor = new clsTeacher(rs.getString("Grado"),rs.getString("Nombre"),rs.getString("Apellido"), rs.getInt("Codigo"), rs.getInt("Cedula"),rs.getInt("Dia"), rs.getInt("Mes"), rs.getInt("Anios"));
                    Persona = Profesor;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Persona; 
    }
    
    public clsPerson BuscarPersonaCedula(int Cedula){
        aux=conexion.SIMCA();
        clsPerson Persona =null;
        clsStudent Estudiante = null;
        clsTeacher Profesor = null;
        try {
             
            String sql="SELECT Nombre, Apellido, Cedula, Codigo, dia, mes, anios, Tipo FROM Persona WHERE Cedula=?";
            ps=aux.prepareStatement(sql);
            ps.setInt(1, Cedula);
            rs=ps.executeQuery();
            while(rs.next()){
                if(rs.getString("Tipo").equalsIgnoreCase("Estudiante")){
                    Estudiante = new clsStudent(rs.getString("Nombre"),rs.getString("Apellido"), rs.getInt("Codigo"), rs.getInt("Cedula"),rs.getInt("Dia"), rs.getInt("Mes"), rs.getInt("Anios") );
                    Persona = Estudiante;
                }
                if(rs.getString("Tipo").equalsIgnoreCase("Profesor")){
                    Profesor = new clsTeacher(rs.getString("Grado"),rs.getString("Nombre"),rs.getString("Apellido"), rs.getInt("Codigo"), rs.getInt("Cedula"),rs.getInt("Dia"), rs.getInt("Mes"), rs.getInt("Anios"));
                    Persona = Profesor;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Persona; 
    }
    public ArrayList<clsPerson> VerPersonas(){
        
      ArrayList<clsPerson> vPersonas = new ArrayList<clsPerson>();
      aux=conexion.SIMCA();
        try {
            ps=aux.prepareStatement("SELECT * FROM Persona");
            rs=ps.executeQuery();
            while(rs.next()){
                
                if(rs.getString("Tipo").equalsIgnoreCase("Estudiante")){
                    clsStudent Estudiante = new clsStudent(rs.getString("Nombre"),rs.getString("Apellido"), rs.getInt("Codigo"), rs.getInt("Cedula"),rs.getInt("Dia"), rs.getInt("Mes"), rs.getInt("Anios"));
                    vPersonas.add(Estudiante);
                }
                else if(rs.getString("Tipo").equalsIgnoreCase("Docente")){
                    clsTeacher Profesor = new clsTeacher(rs.getString("Grado"),rs.getString("Nombre"),rs.getString("Apellido"), rs.getInt("Codigo"), rs.getInt("Cedula"),rs.getInt("Dia"), rs.getInt("Mes"), rs.getInt("Anios"));
                    vPersonas.add(Profesor);
                }
            }
       } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vPersonas; 
    }
    
    public void AgregarNota(clsQualification N){
        try {
            
               aux=conexion.SIMCA();
                String sql= "INSERT INTO NOTAS (CODIGO, NOTA, MATERIA, PORCENTAJE, ACTIVIDAD) VALUES (?, ?, ?, ?, ?)";
                ps=aux.prepareStatement(sql);
                ps.setInt(1, N.getCodigo());
                ps.setDouble(2, N.getCalificacion());
                ps.setString(3, N.getMateria());
                ps.setDouble(4, N.getPorcentaje());
                ps.setString(5, N.getActividad());
                ps.executeUpdate();
 
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    public ArrayList<clsQualification> BuscarNotasPorEstudiante(int c){
        
        ArrayList<clsQualification> N = new ArrayList<clsQualification>();
        aux=conexion.SIMCA();
        try {
            ps=aux.prepareStatement("SELECT * FROM NOTAS");
            rs=ps.executeQuery();
            while(rs.next()){
                if(c==rs.getInt("codigo")){
                    clsQualification nota = new clsQualification(rs.getInt("codigo"),rs.getDouble("nota"), rs.getString("materia"), rs.getDouble("porcentaje"),rs.getString("actividad"));
                    N.add(nota);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return N; 
    }   

    public ArrayList<clsQualification> VerNotas(){
        
      ArrayList<clsQualification> vNotas = new ArrayList<clsQualification>();
      aux=conexion.SIMCA();
        try {
            ps=aux.prepareStatement("SELECT * FROM Notas");
            rs=ps.executeQuery();
            while(rs.next()){
                clsQualification Nota = new clsQualification(rs.getInt("Codigo"),rs.getInt("Nota"),rs.getString("Materia"), rs.getInt("Porcentaje"), rs.getString("Actividad"));
                vNotas.add(Nota);
            }
       } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vNotas; 
    }
    
    public String InvocarPeriodoGlobal(){
        aux=conexion.SIMCA();
        String s = null;
        try {
            ps=aux.prepareStatement("SELECT * FROM PERIODOGLOBAL");
            rs=ps.executeQuery();
            while(rs.next()){
                s=rs.getString("p");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s; 
    }
    
    public void SetPeriodoGlobal(String ss){
        try {
            aux=conexion.SIMCA();
            ps=aux.prepareStatement("INSERT INTO PERIODOGLOBAL (IDENTI,P) VALUES   (?,?)");
            ps.setString(1, "z");
            ps.setString(2, ss);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void UptadePeriodoGlobal(String ss){
        try {
            aux=conexion.SIMCA();
            String sql= "UPDATE PERIODOGLOBAL SET   P=? WHERE identi=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, ss);
            ps.setString(2, "z");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
