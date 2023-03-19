package modelo;

public class clsPagina {
	//ATRIBUTOS
	
	
	
	//atributos de clase
	
	private int codigo;
	private String cont;
	
	//referencias y listados
	
	private clsLibro refLibro;
	
	//METODOS
	
	//constructores
	public clsPagina(){
		
}
	public clsPagina(int codigo, String cont){
		this.codigo = codigo;
		this.cont = cont;
	}
	
	//getter y setter
	
		public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public clsLibro getRefLibro() {
		return refLibro;
	}

	public void setRefLibro(clsLibro refLibro) {
		this.refLibro = refLibro;
	}
	
	//metodos generales
		
	
}
