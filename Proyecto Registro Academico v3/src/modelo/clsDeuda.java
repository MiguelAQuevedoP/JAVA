package modelo;

public class clsDeuda {
	//ATRIBUTOS
	//atributos de clase
	private int codigo;
	private String descripcion;
	private double valor;
	//referencias y/o listados
	private clsEstudiante refEstudiante;	
	//METODOS
	//constructores
	public clsDeuda(){
		
	}
	public clsDeuda(int codigo, String descripcion, double valor) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.valor = valor;
	}	
	//getters y setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public clsEstudiante getRefEstudiante() {
		return refEstudiante;
	}
	public void setRefEstudiante(clsEstudiante refEstudiante) {
		this.refEstudiante = refEstudiante;
	}	
	//metodos generales
}
