package modelo;
import java.util.ArrayList;
import java.util.Calendar;

public class clsCliente extends clsPersona {
//ATRIBUTOS
	 //Atributos de clase
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
	public clsCliente(long cedula, String nombre, eSexo sexo, Calendar fechaNacimiento, String direccion,
			long telefono, String correo) {
		super(cedula, nombre,sexo, fechaNacimiento);
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
		this.lstCuentas.add(objD);  //Guardar en vector
		objD.setRefCliente(this);   //Guardar en referencia
	}
	@Override
	public String imprimirInformación() {
		// Impresion de esta clase
		String informacion= "";
		informacion= "Direccion:"+this.direccion+"telefono:"+this.telefono+"Correo:"+this.correo+
				"nombre:"+super.getNombre()+"cedula:"+super.getCedula()+"sexo:"+super.getSexo()+
				"fechaNacimiento:"+super.getFechaNacimiento();
		return informacion;
	}
}
