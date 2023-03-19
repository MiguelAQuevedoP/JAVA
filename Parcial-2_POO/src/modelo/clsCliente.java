package modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class clsCliente {
	
		//ATRIBUTOS
	
		//ATRIBUTOS DE CLASE
	
		private long cedula;
		private String nombre;
		private String sexo;
		private Calendar fechaNacimiento;
		private String direccion;
		private long telefono;
		private String correo;
		
		//REFERENCIAS Y LSITADOS
		
		private ArrayList<clsCuenta>lstCuenta;
		private clsBanco refBanco;
		
		//METODOS
		
		//CONSTRUCTOR
		
		public clsCliente(){
			this.lstCuenta = new ArrayList<clsCuenta>();
		}
		public clsCliente(long cedula,String nombre,String sexo,Calendar fechaNacimiento,String direccion,long telefono,String correo ){
			this.cedula = cedula;
			this.nombre = nombre;
			this.sexo = sexo;
			this.fechaNacimiento = fechaNacimiento;
			this.direccion = direccion;
			this.telefono = telefono;
			this.correo = correo;
			this.lstCuenta = new ArrayList<clsCuenta>();
		
			
		}
		
		//GETTER Y SETTER

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

		public ArrayList<clsCuenta> getLstCuenta() {
			return lstCuenta;
		}

		public void setLstCuenta(ArrayList<clsCuenta> lstCuenta) {
			this.lstCuenta = lstCuenta;
		}
		public clsBanco getRefBanco() {
			return refBanco;
		}
		public void setRefBanco(clsBanco refBanco) {
			this.refBanco = refBanco;
		}
		
		
		//METODOS GENERALES
}
