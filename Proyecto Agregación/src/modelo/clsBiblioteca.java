package modelo;

import java.util.ArrayList;

public class clsBiblioteca {

	//ATRIBUTOS

	//atributos de la clase	
	
	private String nombre;
	
	//referencias y listados
	
	private ArrayList<clsLibro> lstLibros;
	
	//METODOS
	
	
	
	//constructor
	
	public clsBiblioteca(){
		this.lstLibros = new ArrayList<clsLibro>();
	}
	public clsBiblioteca(String nombre){
		this.nombre = nombre;
	}
	
	//getter y setter
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<clsLibro> getLstLibros() {
		return lstLibros;
	}
	public void setLstLibros(ArrayList<clsLibro> lstLibros) {
		this.lstLibros = lstLibros;
	}
	
	//metodos genereales
	
	public void agregarLibro(clsLibro objLibro){
		this.lstLibros.add(objLibro);
	}
}
