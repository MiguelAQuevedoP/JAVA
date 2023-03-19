package modelo;

public class clsLibro {
	
	//ATRIBUTOS
	
	//atributos de la clase
	
	private int codigo;
	
	//referencias y listados
	
	private clsBiblioteca refBiblioteca;
	
	//METODOS
	
	//constructor
	
	public clsLibro(){
		
	}
	public clsLibro(int codigo){
		this.codigo = codigo;
	}
	
	//getter y setter
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public clsBiblioteca getRefBiblioteca() {
		return refBiblioteca;
	}
	public void setRefBiblioteca(clsBiblioteca refBiblioteca) {
		this.refBiblioteca = refBiblioteca;
	}
	
	//metodos genereales
	
}
