package modelo;
import java.util.ArrayList;
import modelo.*;
public class clsPersona {
	
	//ATRIBUTOS
	private long cedula;
	private String nombre;
	private String direccion;
	private int telefono;
	//referencias
	private ArrayList<clsVacante>lstVacantes;
	private ArrayList<clsCertificacion>lstCertificaciones;
	//CONSTRUCTOR
	public clsPersona(){
		//TODO codigo
	}
	public clsPersona(long cedula, String nombre, String direccion, int telefono) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//Getters y setters
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public ArrayList<clsVacante> getLstVacantes() {
		return lstVacantes;
	}
	public void setLstVacantes(ArrayList<clsVacante> lstVacantes) {
		this.lstVacantes = lstVacantes;
	}
	public ArrayList<clsCertificacion> getLstCertificaciones() {
		return lstCertificaciones;
	}
	public void setLstCertificaciones(ArrayList<clsCertificacion> lstCertificaciones) {
		this.lstCertificaciones = lstCertificaciones;
	}
	
	public String informacion(){
		String info = "";
		info = "Cedula: "+this.cedula+"|| Nombre: "+this.nombre+"||Dirección: "+this.direccion+"||Telefono: "+this.telefono ;
		return info;
	}
	
}
