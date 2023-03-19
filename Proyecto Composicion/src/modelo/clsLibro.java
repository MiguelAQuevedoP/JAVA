package modelo;

import java.util.ArrayList;

public class clsLibro {
	
	//ATRIBUTOS

	//atributos de clase
	
	private long ISBN;
	
	//referencias y listados
	
	private ArrayList <clsPagina> lstPaginas;
	
	//METODOS
	
	
	
	//constructores
	
	public clsLibro(){
		this.lstPaginas = new ArrayList<clsPagina>();
	}
	public clsLibro(long ISBN){
	
		this.lstPaginas = new ArrayList<clsPagina>();
		this.ISBN = ISBN;
	}

	
	//getter y setter
	
		public long getISBN() {
		return ISBN;
	}
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}
	public ArrayList<clsPagina> getLstPaginas() {
		return lstPaginas;
	}
	public void setLstPaginas(ArrayList<clsPagina> lstPaginas) {
		this.lstPaginas = lstPaginas;
	}
	
	//metodos generales
	
	public void crearPagina(int codigo, String cont){
		clsPagina objPag = new clsPagina(codigo,cont);
		this.lstPaginas.add(objPag);
	}
	
}
