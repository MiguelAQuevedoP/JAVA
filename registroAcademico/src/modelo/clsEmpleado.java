package modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class clsEmpleado extends clsPersona{
	//ATRIBUTOS
	//atributos de clase
	private eTipoCargo cargo;
	private double sueldo;
	private int anosExperiencia;
	//referencias listados
	private clsBanco refBanco; 
	private ArrayList <clsEmpleado> lstEmpleados;
	//METODOS
	//constructores
	public clsEmpleado() {
		super();
		this.lstEmpleados = new ArrayList <clsEmpleado>();
	}
	public clsEmpleado(long cedula, String nombre, eTipoSexo sexo, Calendar fechaNacimiento, double sueldo, int anosExperiencia, eTipoCargo cargo) {
		super(cedula, nombre, sexo, fechaNacimiento);
		this.sueldo = sueldo;
		this.anosExperiencia = anosExperiencia;
		this.cargo = cargo;
		this.lstEmpleados = new ArrayList <clsEmpleado>();
	}
	
	//getter and setter
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
	public int getAnosExperiencia() {
		return anosExperiencia;
	}
	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	public clsBanco getRefBanco() {
		return refBanco;
	}
	public void setRefBanco(clsBanco refBanco) {
		this.refBanco = refBanco;
	}
	public ArrayList<clsEmpleado> getLstEmpleados() {
		return lstEmpleados;
	}
	public void setLstEmpleados(ArrayList<clsEmpleado> lstEmpleados) {
		this.lstEmpleados = lstEmpleados;
	}
	//metodos generales
	@Override
	public String obtenerInformacion() {
		String info = "";
		info = "Nombre: "+ super.getNombre() +
				"\nCedula: " + super.getCedula() +
				"\nSexo: " + super.getSexo() +
				"\nFecha de nacimiento: " + super.getFechaNacimiento() +
				"\nCargo: " + cargo +
				"\nSueldo: " + sueldo +
				"\nAños de experiencia: " + anosExperiencia ;
		return info;
	}
	
}
