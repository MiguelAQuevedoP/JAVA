package lanzamiento;

import modelo.clsEstudiante;
import modelo.clsPersona;
import modelo.clsProfesor;

public class clsConsola {

	public static void main(String[] args) {
		
		clsProfesor objP = new clsProfesor();
		objP.setCodigo(100);
		objP.setNombre("Maria");
		
		objP.setSueldo(1200000);
		
		clsEstudiante objE = new clsEstudiante();
		objE.setCodigo(111);
		objE.setNombre("Miguel");
		objE.setCorreo("mquevedo@unicauca.edu.co");
		
		/*clsPersona objP1 = new clsPersona();
		objP1.setCodigo(100);
		objP1.setNombre("Maria");
		
		clsPersona objP2 = new clsPersona();
		objP2.setCodigo(111);
		objP2.setNombre("Miguel");*/
		
		System.out.println(objP.obtenerInformacion());
		System.out.println(objE.obtenerInformacion());
	}

}
