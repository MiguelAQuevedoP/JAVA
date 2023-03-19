package Conexion;

import Modelo.clsMatter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Asignaturas {
    //CONEXION
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Connection aux=conexion.SIMCA();
    
    public void AgregarMateria(clsMatter Materia) {
        try {
            try{
               aux=conexion.SIMCA();
                
                        String sql= "INSERT INTO Materia (Codigo, Nombre, Creditos,Semestre,Carrera) VALUES (?,?,?,?,?)";
                        ps=aux.prepareStatement(sql);
                        ps.setInt(1, Materia.getCodigo());
                        System.out.println(Materia.getCodigo());
                        ps.setString(2, Materia.getNombre());
                        System.out.println(Materia.getNombre());
                        ps.setInt(3, Materia.getCreditos());
                        System.out.println(Integer.toString(Materia.getCreditos()));
                        ps.setInt(4, Materia.getSemestre());
                        System.out.println(Materia.getSemestre());
                        ps.setString(5, Materia.getCarrera());
                        System.out.println(Materia.getCarrera());
                        ps.executeUpdate();
            }
            catch(NumberFormatException Ex){
                JOptionPane.showMessageDialog(null, "Datos Incorrectos, Por favor verificar la información Ingresada");
            }  
        } catch (SQLException ex){
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<clsMatter> VerMateria(){ 
      ArrayList<clsMatter> vMaterias = new ArrayList<>();
      aux=conexion.SIMCA();
        try {
            ps=aux.prepareStatement("SELECT * FROM Materia");
            rs=ps.executeQuery();
            while(rs.next()){
                clsMatter Materia = new clsMatter(rs.getInt("Codigo"),rs.getString("Nombre"),rs.getInt("Creditos"), rs.getInt("Semestre"),rs.getString("Carrera"));
                vMaterias.add(Materia);  
            }
       } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vMaterias; 
    }
    
    
    public clsMatter BuscarMateria(int Codigo){
    aux=conexion.SIMCA();
    clsMatter Materia =null;
        try {
            String sql="SELECT * FROM Materia WHERE Codigo=?";
            ps=aux.prepareStatement(sql);
            ps.setInt(1, Codigo);
            rs=ps.executeQuery();
            while(rs.next()){
                Materia = new clsMatter(rs.getInt("Codigo"),rs.getString("Nombre"),rs.getInt("Creditos"), rs.getInt("Semestre"),rs.getString("Carrera"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Asignaturas.class.getName()).log(Level.SEVERE, null, ex);
            }
        return Materia; 
    }
    
    public ArrayList<clsMatter> BuscarMateriaNombre(String Nombre){
    aux=conexion.SIMCA();
    ArrayList<clsMatter> Materia = new ArrayList<clsMatter>();
    clsMatter AMateria = null;
    try {
        String sql="SELECT * FROM Materia WHERE Nombre=?";
        ps=aux.prepareStatement(sql);
        ps.setString(1, Nombre);
        rs=ps.executeQuery();
        while(rs.next()){
            AMateria = new clsMatter(rs.getInt("Codigo"),rs.getString("Nombre"),rs.getInt("Creditos"), rs.getInt("Semestre"),rs.getString("Carrera") );
            Materia.add(AMateria);
        }
    } catch (SQLException ex) {
        Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return Materia; 
    }
    
    public ArrayList<clsMatter> BuscarMateriaPorCarrera(String Carrera){
        aux=conexion.SIMCA();
        ArrayList<clsMatter> AllMaterias = new ArrayList<>();
        try {
            String sql="SELECT * FROM Materia WHERE Carrera=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, Carrera);
            rs=ps.executeQuery();
            while(rs.next()){
                clsMatter m = new clsMatter(rs.getInt("Codigo"),rs.getString("Nombre"),rs.getInt("Creditos"), rs.getInt("Semestre"),rs.getString("Carrera") );
                AllMaterias.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SimcaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    return AllMaterias; 
    }
    
    public ArrayList<Integer> BuscarCod_Sem_Carrera(String Carrera, int Semestre){
        ArrayList<Integer> codigos = new ArrayList<Integer>();
        try {
            String sql="SELECT Codigo, semestre FROM Materia WHERE Carrera=?";
            ps=aux.prepareStatement(sql);
            ps.setString(1, Carrera); //para darle el vaor dal numero de interrogación
            rs=ps.executeQuery();
            
            while(rs.next()){
                if(rs.getInt("semestre")==Semestre){
                    codigos.add(rs.getInt("Codigo"));
                }
            }  
        } catch (SQLException ex){
            Logger.getLogger(Asignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigos; 
    }
}
