package prueba;

import modelo.*;

public class clsPrincipal {

	public static void main(String[] args) {
		
		//CREAR BIBLIOTECA
		
		clsBiblioteca objBiblioteca = new clsBiblioteca();
		objBiblioteca.setNombre("Biblioteca Central");
		
		//CREAR LIBROS
		
		clsLibro objL1 = new clsLibro();
		objL1.setCodigo(1050);
		clsLibro objL2 = new clsLibro();
		objL2.setCodigo(2070);
		
		//AGREGAR LIBROS A LA BIBLIOTECA (AGREGACION)
		
		objBiblioteca.agregarLibro(objL1);
		objBiblioteca.agregarLibro(objL2);
		
		//IMPRIMIR
		
		int tam = objBiblioteca.getLstLibros().size();
		System.out.println("TAMANIO: " + tam);
		
	}


	

}
