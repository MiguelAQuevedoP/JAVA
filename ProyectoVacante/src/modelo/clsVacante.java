package modelo;

import java.util.ArrayList;

public class clsVacante {
	//ATRIBUTOS
	private int codigo;
	private String cargo;
	private double sueldo;
	//referencias
	private ArrayList<clsPersona>lstPersonas;
	
	
	
	//CONSTRUCTORES
	
	public clsVacante (){
		
	}
	public clsVacante(int codigo, String cargo, double sueldo) {
		
		this.codigo = codigo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	
	
	//Getter and Setters
		public int getCodigo() {
		return codigo;
	}




	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}




	public String getCargo() {
		return cargo;
	}




	public void setCargo(String cargo) {
		this.cargo = cargo;
	}




	public double getSueldo() {
		return sueldo;
	}




	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
