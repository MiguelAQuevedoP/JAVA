package modelo;

public abstract class clsPersona {

	//ATRIBUTOS
	//atributos de clase
	private long codigo;
	private String nombre;
	
	//lst o ref
	
	//METODOS
	//constructores
	public clsPersona(){
		
	}
	public clsPersona(long codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	//getters setters
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos generales
	
	public abstract String obtenerInformacion();
	
}//FIN DE CLASE
