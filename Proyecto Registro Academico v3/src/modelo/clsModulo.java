package modelo;

public class clsModulo {
	//ATRIBUTOS
	private String tema;
	private double porcentaje;
	//atributos de clase
	//referencias y/o listados
	private clsCurso refCurso;
	//METODOS
	//constructores
	public clsModulo() {
		
	}
	public clsModulo(String tema, double porcentaje) {
		this.tema = tema;
		this.porcentaje = porcentaje;
	}
	
	//getters y setters
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	public clsCurso getRefCurso() {
		return refCurso;
	}
	public void setRefCurso(clsCurso refCurso) {
		this.refCurso = refCurso;
	}
	//metodos generales
}
