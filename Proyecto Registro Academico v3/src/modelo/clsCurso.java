package modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class clsCurso {
	//ATRIBUTOS
	//atributos de clase
	private String nombre;
	private int semestre;
	private Calendar fecha;
	//referencias y/o listados
	private ArrayList<clsEstudiante> lstEstudiante;
	private ArrayList<clsModulo> lstModulos;
	private clsProfesor refProfesor;
	//METODOS
	//constructores
	
	public clsCurso() {
		this.lstEstudiante = new ArrayList<clsEstudiante>();
		this.lstModulos = new ArrayList<clsModulo>();
	}
	public clsCurso(String nombre, int semestre, Calendar fechaInicio) {
		this.nombre = nombre;
		this.semestre = semestre;
		this.fecha = fechaInicio;
		this.lstEstudiante = new ArrayList<clsEstudiante>();
		this.lstModulos = new ArrayList<clsModulo>();
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public ArrayList<clsEstudiante> getLstEstudiante() {
		return lstEstudiante;
	}
	public void setLstEstudiante(ArrayList<clsEstudiante> lstEstudiante) {
		this.lstEstudiante = lstEstudiante;
	}
	public ArrayList<clsModulo> getLstModulos() {
		return lstModulos;
	}
	public void setLstModulos(ArrayList<clsModulo> lstModulos) {
		this.lstModulos = lstModulos;
	}
	public clsProfesor getRefProfesor() {
		return refProfesor;
	}
	public void setRefProfesor(clsProfesor refProfesor) {
		this.refProfesor = refProfesor;
	}
	//metodos generales
	public void crearModulo(String tema, double porcentaje){
		clsModulo objM = new clsModulo(tema,porcentaje);
		this.lstModulos.add(objM); //curso agrega modulo
		objM.setRefCurso(this);  //modulo agrega curso
		
	}
	
	
}
