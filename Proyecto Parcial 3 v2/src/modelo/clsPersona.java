package modelo;

import java.util.Calendar;

public abstract class clsPersona {
	//ATRIBUTOS
	//atributos de la clase
	private long cedula;
	private String nombre;
	private eTipoSexo sexo;
	private Calendar fechaNacimiento;
	//lst o ref
	//METODOS
	//contructores
	public clsPersona(){
		
	}
	public clsPersona(long cedula, String nombre, eTipoSexo sexo, Calendar fechaNacimiento) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}
	//getter and setter
	public long getCedula() {
		return cedula;
	}
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public eTipoSexo getSexo() {
		return sexo;
	}
	public void setSexo(eTipoSexo sexo) {
		this.sexo = sexo;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//metodos generales
	
	public abstract String obtenerInformacion();
	
}//FIN DE CLASE
