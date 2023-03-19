package prueba;
import java.util.Scanner;
import modelo.*;
import vista.frmHistoriaLaboral;

public class clsPrincipal {

	public static void main(String[] args) {
		
		frmHistoriaLaboral vtnPrincipal = new frmHistoriaLaboral();
		vtnPrincipal.setVisible(true);
		
		/*
		Scanner objScan = new Scanner(System.in);
		String auxNombre, auxDireccion;
		long auxCedula;
		int auxTel;
		imprimir("INFO PERSONA");
		
		imprimir("Digite cedula: ");
		auxCedula = objScan.nextLong();
		
		imprimir("Digite nombre: ");
		auxNombre = objScan.next();
				
		imprimir("Digite dirección: ");
		auxDireccion = objScan.next();
		
		imprimir("Digite telefono: ");
		auxTel = objScan.nextInt();
		
		clsPersona objPersona = new clsPersona();
	
		objPersona.setCedula(auxCedula);
		objPersona.setNombre(auxNombre);
		objPersona.setDireccion(auxDireccion);
		objPersona.setTelefono(auxTel);
		*/
		
		
		
		
	}

	public static void imprimir(String vTexto){
		System.out.println(vTexto);
	}
}
