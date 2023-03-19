package modelo;
import java.util.Calendar;

public abstract class clsPersona {
//ATRIBUTOS
	//atributos clase
	private long cedula;
	private String nombre;
	private String sexo;
	private Calendar fechaNacimiento;
//referencias y/o listado
//METODOS
//constructores
	public clsPersona(){
	}
	public clsPersona(long cedula, String nombre, String sexo, Calendar fechaNacimiento){
	this.cedula= cedula;
	this.nombre= nombre;
	this.sexo= sexo;
	this.fechaNacimiento= fechaNacimiento;
	}
//getters y setters
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
//metodos generales
	//metodo polimorfico
	public abstract String imprimirInformación();
}
