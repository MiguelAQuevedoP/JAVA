package modelo;

import java.util.Calendar;

public class clsEmpleado extends clsPersona{
	//ATRIBUTOS
	//atributos de clase
	private eTipoCargo cargo;
	private double sueldo;
	private int a�osExperiencia;
	//referencias listados
	private clsBanco refBanco; 
	//METODOS
	//constructores
	public clsEmpleado() {
		super();
	}
	public clsEmpleado(long cedula, String nombre, eTipoSexo sexo, Calendar fechaNacimiento, double sueldo, int a�osExperiencia, eTipoCargo cargo) {
		super(cedula, nombre, sexo, fechaNacimiento);
		this.sueldo = sueldo;
		this.a�osExperiencia = a�osExperiencia;
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
	public int getA�osExperiencia() {
		return a�osExperiencia;
	}
	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}
	public clsBanco getRefBanco() {
		return refBanco;
	}
	public void setRefBanco(clsBanco refBanco) {
		this.refBanco = refBanco;
	}
	//metodos generales
	
}
