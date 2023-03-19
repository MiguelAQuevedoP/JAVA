package principal;

import modelo.*;

public class clsPrincipal {

	public static void main(String[] args) {
		
		//CREAR UN LIBRO
		
		clsLibro objL1= new clsLibro();
		objL1.setISBN(787);
		
		//CREAR DOS PAGINAS
		
		objL1.crearPagina(1, "Introduccion");
		objL1.crearPagina(2, "Capitulo I");
		objL1.crearPagina(3, "Capitulo II");
		
		//IMPRIMIR
		
		int num = objL1.getLstPaginas().size();
		System.out.println("Numero de paginas: "+num);
		
	}

}
