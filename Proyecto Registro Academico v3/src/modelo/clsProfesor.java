package modelo;

import java.util.ArrayList;

public  class clsProfesor extends clsPersona implements iEvaluacion{
	//ATRIBUTOS
	//atributos de la clase
	private eTipoCargo cargo;
	private double sueldo;
	//lst o ref
	private ArrayList<clsCurso> lstCursos;
	//METODOS
	//contructores
	public clsProfesor(){
		super();
		this.lstCursos = new ArrayList<clsCurso>();
	}
	public clsProfesor(Long cedula, String nombre, eTipoCargo cargo, double sueldo) {
		super(cedula, nombre);
		this.cargo = cargo;
		this.sueldo = sueldo;
		this.lstCursos = new ArrayList<clsCurso>();
	}
	
	//getter y setter
	public eTipoCargo getCargo() {
		return cargo;
	}
	public void setCargo(eTipoCargo cargo) {
		this.cargo = cargo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public ArrayList<clsCurso> getLstCursos() {
		return lstCursos;
	}
	public void setLstCursos(ArrayList<clsCurso> lstCursos) {
		this.lstCursos = lstCursos;
	}
	@Override
	public String obtenerInformacion() {
		String info;
		info = "Nombre: "+super.getNombre()+"Cargo: "+this.cargo;
		return info;
	}
	@Override
	public String evaluacionCuantitativa() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String evaluacionCualitativa() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//metodos generales
}
