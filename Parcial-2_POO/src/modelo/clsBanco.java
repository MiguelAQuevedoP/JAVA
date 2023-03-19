package modelo;

import java.util.ArrayList;
import java.util.Calendar;


public class clsBanco {

	//ATRIBUTOS
	//ATRIBUTOS DE CLASE
	private long NIT;
	private String nombre;
	private String direccion;
	private long telefono;
	
	//REFERENCIAS Y LSITADOS
	private ArrayList<clsCuenta>lstCuentas;
	private ArrayList<clsCliente> lstClientes;
	
	
	
	//METODOS
	//CONSTRUCTOR
	public clsBanco(){
		
		this.lstClientes =  new ArrayList<clsCliente>();
		this.lstCuentas = new ArrayList<clsCuenta>();
		
	}
	public clsBanco(long NIT, String nombre, String direccion, long telefono) {
	
		this.NIT = NIT;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.lstClientes =  new ArrayList<clsCliente>();
		this.lstCuentas = new ArrayList<clsCuenta>();
		

	}
	//GETTER Y SETTER
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
	public ArrayList<clsCuenta> getLstCuentas() {
		return lstCuentas;
	}
	public void setLstCuentas(ArrayList<clsCuenta> lstCuentas) {
		this.lstCuentas = lstCuentas;
	}
	public ArrayList<clsCliente> getLstClientes() {
		return lstClientes;
	}
	public void setLstClientes(ArrayList<clsCliente> lstClientes) {
		this.lstClientes = lstClientes;
	}
	
	
	//METODOS GENERALES
	public void vincularCliente(clsCliente objCliente){
		this.lstClientes.add(objCliente);
		objCliente.setRefBanco(this);
	}
		
	public void agregarCuenta(long numero, String tipo, Calendar fechaCreacion,double saldo){
		clsCuenta objCuenta = new clsCuenta(numero,tipo,fechaCreacion,saldo);
		this.lstCuentas.add(objCuenta);
		objCuenta.setRefBanco(this);
	}
	
	
}
