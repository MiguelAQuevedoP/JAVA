package modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class clsCliente extends clsPersona{

	//ATRIBUTOS
	//atributos de clase
	private String direccion;
	private long telefono;
	private String correo;

	//referencias y/o listados
	private ArrayList<clsCuenta>lstCuentas;
	private clsBanco refBanco; 
	

	//METODOS
	//constructores
	public clsCliente(){
		super();
		this.lstCuentas = new ArrayList<clsCuenta>();
	}
	
	public clsCliente(long cedula, String nombre, eTipoSexo sexo, Calendar fechaNacimiento,  String direccion, long telefono, String correo) {
		super(cedula, nombre, sexo, fechaNacimiento);
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.lstCuentas = new ArrayList<clsCuenta>();
	}
	
	
	//getters y setters

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
	public clsBanco getRefBanco() {
		return refBanco;
	}

	public void setRefBanco(clsBanco refBanco) {
		this.refBanco = refBanco;
	}
	//metodos generales
	public void agregarCuenta(clsCuenta objCuenta){
		this.lstCuentas.add(objCuenta);  //guarda en vector
		objCuenta.setRefCliente(this);; //guarda en referencia
	}

	@Override
	public String obtenerInformacion() {
		String info = "";
		info = "Nombre: "+ super.getNombre() +
				"\nCedula: " + super.getCedula() +
				"\nSexo: " + super.getSexo() +
				"\nFecha de nacimiento: " + super.getFechaNacimiento() +
				"\nDirección: "+ direccion +
				"\nTelefono: "+ telefono +
				"\nCorreo: " + correo ;
		return info;
	}
	
	
}
