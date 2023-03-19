package modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class clsBanco {

	//ATRIBUTOS
	//atributos de clase
	private long NIT;
	private String nombre;
	private String direccion;
	private long telefono;
	//referencias y/o listados
	private ArrayList<clsCuenta> lstCuenta;
	private ArrayList<clsCliente> lstCliente;
	private ArrayList<clsEmpleado> lstEmpleado;
	//METODOS
	//constructores
	public clsBanco() {
		this.lstCliente = new ArrayList<clsCliente>();
		this.lstCuenta = new ArrayList<clsCuenta>();
		this.lstEmpleado = new ArrayList<clsEmpleado>();
	}
	public clsBanco(long NIT, String nombre, String direccion, long telefono) {
		this.NIT = NIT;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.lstCliente = new ArrayList<clsCliente>();
		this.lstCuenta = new ArrayList<clsCuenta>();
		this.lstEmpleado = new ArrayList<clsEmpleado>();
	}
	
	
	//getters y setters
	public long getNIT() {
		return NIT;
	}
	public void setNIT(long nIT) {
		NIT = nIT;
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
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public ArrayList<clsCuenta> getLstCuenta() {
		return lstCuenta;
	}
	public void setLstCuenta(ArrayList<clsCuenta> lstCuenta) {
		this.lstCuenta = lstCuenta;
	}
	public ArrayList<clsCliente> getLstCliente() {
		return lstCliente;
	}
	public void setLstCliente(ArrayList<clsCliente> lstCliente) {
		this.lstCliente = lstCliente;
	}
	public ArrayList<clsEmpleado> getLstEmpleado() {
		return lstEmpleado;
	}
	public void setLstEmpleado(ArrayList<clsEmpleado> lstEmpleado) {
		this.lstEmpleado = lstEmpleado;
	}
	//metodos generales
	public void agregarCliente(clsCliente objCliente){
		this.lstCliente.add(objCliente);
		objCliente.setRefBanco(this);
	}
	public void agregarCuenta(long numero, eTipoCuenta tipo, Calendar fechaCreacion,double saldo){
		clsCuenta objCuen = new clsCuenta(numero,tipo,fechaCreacion,saldo);
		this.lstCuenta.add(objCuen);
		objCuen.setRefBanco(this);
	}
	public void crearEmpleado(long cedula, String nombre, eTipoSexo sexo, Calendar fechaNacimiento, double sueldo, int añosExperiencia, eTipoCargo cargo ){
		clsEmpleado objEmpleado = new clsEmpleado(cedula, nombre, sexo, fechaNacimiento, sueldo, añosExperiencia, cargo);
		this.lstEmpleado.add(objEmpleado);
		objEmpleado.setRefBanco(this);
	}
	
}
