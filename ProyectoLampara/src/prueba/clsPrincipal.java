package prueba;
import java.util.Scanner;

import modelo.*;
public class clsPrincipal {

	public static void main(String[] args) {
		//UTILIDADES
		Scanner objConsola = new Scanner(System.in);
			
		
		//OBJETO ESTATICO
		clsLampara objLampara2 = new clsLampara();
		objLampara2.setColor("Amarillo");
		objLampara2.setMarca("MUMA");
		objLampara2.setTamanio(10.5);
		String txtColor = "Color: "+objLampara2.getColor();
		String txtMarca = "Marca: "+objLampara2.getMarca();
		String txtTamanio = "Tamaño: "+objLampara2.getTamanio();
		imprimir(txtColor);
		imprimir(txtMarca);
		imprimir(txtTamanio);
		
		//OBJETO DINAMICO
		imprimir ("Información de Lampara.");
		imprimir ("digite color: ");
		String auxColor = objConsola.next();
		imprimir ("digite marca: ");
		String auxMarca = objConsola.next();
		imprimir ("digite tamanio: ");
		double auxTamanio = Double.parseDouble(objConsola.next());
		
		clsLampara objLampara1 = new clsLampara(auxColor, auxMarca, auxTamanio);
		auxColor = "Color: "+objLampara1.getColor();
		auxMarca = "Marca: "+objLampara1.getMarca();
		String auxTam = "Tamanio: "+objLampara1.getTamanio();
		
		imprimir(auxColor);
		imprimir(auxMarca);
		imprimir(auxTam);
		
	}

	public static void imprimir(String vTexto){
		System.out.println(vTexto);
		
	}
}
