package modelo;
import java.util.ArrayList;
import java.util.Calendar;

public class clsCliente {
//ATRIBUTOS
	 //Atributos de clase
	private long cedula; 
	private String nombre; 
	private String sexo;
	private Calendar fechaNacimiento;
	private String direccion; 
	private long telefono; 
	private String correo; 
	 //Referencias y/o listados 
	private ArrayList <clsCuenta> lstCuentas;
	private clsBanco refBanco;
//METODOS
	//Constructores
	public clsCliente(){
		this.lstCuentas = new ArrayList <clsCuenta>();
	}
	public clsCliente(long cedula, String nombre, String sexo, Calendar fechaNacimiento, String direccion,
			long telefono, String correo) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.lstCuentas = new ArrayList <clsCuenta>();
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public clsBanco getRefBanco() {
		return refBanco;
	}
	public void setRefBanco(clsBanco refBanco) {
		this.refBanco = refBanco;
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
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public ArrayList<clsCuenta> getLstCuentas() {
		return lstCuentas;
	}
	public void setLstCuentas(ArrayList<clsCuenta> lstCuentas) {
		this.lstCuentas = lstCuentas;
	}
	// metodos generales
	public void agregarCuenta(clsCuenta objD){
		this.lstCuentas.add(objD);  
		objD.setRefCliente(this);
	}
}
