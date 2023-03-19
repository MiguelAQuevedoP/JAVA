package modelo;

public class clsCertificacion {

	private int codigo;
	private String nombre;
	private String fecha;
	//referencias
	
	private clsPersona refPersona;
	
	//CONSTRUCTORES
	public clsCertificacion(){
		
	}

	public clsCertificacion(int codigo, String nombre, String fecha) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	
	//Getter and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public clsPersona getRefPersona() {
		return refPersona;
	}

	public void setRefPersona(clsPersona refPersona) {
		this.refPersona = refPersona;
	}
	
	
}
