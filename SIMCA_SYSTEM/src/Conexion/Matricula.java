package Conexion;

import Modelo.clsEnroll;
import Modelo.clsCourse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Matricula {
    //CONEXION
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.SIMCA();
    
    public void AgregarCurso(int c_matricula,int c_curso, int c_estudiante) {
        try {
            aux=conexion.SIMCA();
            String sql= "INSERT INTO Matricula (CodigoMatricula, CodigoCurso, CodigoEstudiante) VALUES (?,?,?)";
            ps=aux.prepareStatement(sql);
            ps.setInt(1, c_matricula);
            ps.setInt(2, c_curso);
            ps.setInt(3, c_estudiante);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Matricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EliminarCurso(int c_estudiante) {
        try {
            aux=conexion.SIMCA();
            String sql= "DELETE FROM Matricula WHERE CodigoEstudiante=?";
            ps=aux.prepareStatement(sql);
            ps.setInt(1, c_estudiante);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Matricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int contarCodigos(){
        int cont=1;
        aux=conexion.SIMCA();
        try {
            ps=aux.prepareStatement("SELECT * FROM Matricula");
            rs=ps.executeQuery();
            while(rs.next()){
                cont=cont+1;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Matricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Contador: "+cont);
        return cont;
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
    
    public ArrayList<clsEnroll> VerMatricula(){ 
      ArrayList<clsEnroll> vMatricula = new ArrayList<clsEnroll>();
      aux=conexion.SIMCA();
        try {
            ps=aux.prepareStatement("SELECT * FROM Matricula");
            rs=ps.executeQuery();
            while(rs.next()){
                    clsEnroll MO = new clsEnroll(rs.getInt("codigoMatricula"),rs.getInt("codigoCurso"),rs.getInt("codigoEstudiante"));
                    vMatricula.add(MO);  
            }
       } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vMatricula; 
    }
    
    public ArrayList<clsEnroll> BuscarMatriculaPorCodigo(int c){
       aux=conexion.SIMCA();
       ArrayList<clsEnroll> m = new ArrayList<>();
        try {
             
            String sql="SELECT * FROM MATRICULA WHERE codigoestudiante=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, Integer.toString(c));
            rs=ps.executeQuery();
            while(rs.next()){
                clsEnroll MO = new clsEnroll(rs.getInt("codigoMatricula"),rs.getInt("codigoEstudiante"),rs.getInt("codigoCurso"));
                m.add(MO);  
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;  
    }
    
    public int verificarRepetidos (int cE, int cC){
       aux=conexion.SIMCA();
       int R = 0;
        try {
             
            String sql="SELECT * FROM MATRICULA";
          
            rs=ps.executeQuery();
            while(rs.next()){
                //clsMatricula MO = new clsEnroll(rs.getInt("codigoMatricula"),rs.getInt("codigoEstudiante"),rs.getInt("codigoCurso"));
                if((rs.getInt("codigoEstudiante")==cE) && (rs.getInt("codigoCurso")==cC)){
                    R=1;
                }  
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("R="+R);
        return R;  
    }
}
