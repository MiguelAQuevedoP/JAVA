package modelo;

public class clsEstacionDeServicio {
	
	private String nombre;
	private long nit;
	private String direccion;
	private long telefono;
	
	public clsEstacionDeServicio(String nombre, long nit, String direccion, int telefono){
		this.nombre = nombre;
		this.nit = nit;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public clsEstacionDeServicio() {
	
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public long getNit() {
		return nit;
	}

	public void setNit(long nit) {
		this.nit = nit;
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
}
