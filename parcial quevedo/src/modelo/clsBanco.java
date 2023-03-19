package modelo;
import java.util.ArrayList;
import java.util.Calendar;

import modelo.*;
public class clsBanco {
 //ATRIBUTOS
	 //Atributos de clase
	private long NIT;
	private String nombre;
	private String direccion; 
	private long telefono;
	 //Referencias y/o listados
	private ArrayList <clsCuenta> lstCuentas;
	private ArrayList <clsCliente> lstClientes;
	private ArrayList <clsEmpleado> lstEmpleado;
 //METODOS
	//Constructores 
	public clsBanco () {
		this.lstCuentas = new ArrayList <clsCuenta>();
		this.lstClientes = new ArrayList <clsCliente>();
		this.lstEmpleado = new ArrayList <clsEmpleado>();
	}
	public clsBanco(long nIT, String nombre, String direccion, long telefono) {
	
		NIT = nIT;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.lstCuentas = new ArrayList <clsCuenta>();
		this.lstClientes = new ArrayList <clsCliente>();
		this.lstEmpleado = new ArrayList <clsEmpleado>();
	}
	//Getters y setters
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
	public ArrayList<clsEmpleado> getLstEmpleado() {
		return lstEmpleado;
	}
	public void setLstEmpleado(ArrayList<clsEmpleado> lstEmpleado) {
		this.lstEmpleado = lstEmpleado;
	}
	// metodos generales
	public void registrarCliente(clsCliente objCliente) {
		this.lstClientes.add(objCliente);
		objCliente.setRefBanco(this);
	}
	public void CrearCuenta(Long numero, String tipo, Calendar fechaCreacion, double Saldo) {
	clsCuenta objD = new clsCuenta (numero, tipo, fechaCreacion,Saldo);
	this.lstCuentas.add(objD);
	objD.setRefBanco(this);
	}
	public void crearEmpleado(clsEmpleado objP) {
		this.lstEmpleado.add(objP);
		objP.setRefBanco(this);
	}
}