package prueba;

import modelo.*;
import vista.jFramePrincipal;


public class clsPrincipal {

	public static void main(String[] args) {
		
		clsBanco BBVA = new clsBanco();
		BBVA.setNIT(102030);
		BBVA.setNombre("BBVA");
		BBVA.setDireccion("BBVA@gmail.co");
		BBVA.setTelefono(30000000);
		
		jFramePrincipal vtnPrincipal = new jFramePrincipal();
		vtnPrincipal.setVisible(true);
		
	}

}
/*CODIGO DE PRUEBA
 * 
clsCliente d1 = new clsCliente(100,"juan","hombre","14/12/2002","cra7a",301270,"j@gmail.com");


BBVA.vincularCliente(d1);



long auxCod = (int) d1.getRefBanco().getNIT();
System.out.println("NIT del banco " +auxCod);

double auxValor = BBVA.getLstClientes().get(0).getCedula();
System.out.println("Cedula del cliente" + auxValor);

*/
