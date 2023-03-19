package prueba;
import java.util.Scanner;
import modelo.*;
public class clsPrincipal {

	public static void main(String[] args){
		Scanner objConsola = new Scanner(System.in);
		
		String auxHora, auxFecha, auxTipoProducto, auxPlaca;
		int auxNumFactura, auxNumManguera;
		double auxVentaTotal, auxCantGalones, auxPrecio, auxKm;
		
		imprimir("ESTACIÓN DE SERVICIO ESSO BELLA VISTA");
		/*
		 * CLASE FACTURA
		 */
		imprimir("DIGITE EL NÚMERO DE FACTURA: ");
		auxNumFactura = objConsola.nextInt();
		imprimir("DIGITE LA HORA: ");
		auxHora = objConsola.next();
		imprimir("DIGITE LA FECHA: ");
		auxFecha = objConsola.next();
		imprimir ("DIGITE LA CANTIDAD DE GALONES: ");
		auxCantGalones = objConsola.nextDouble();
		imprimir("DIGITE LA VENTA TOTAL: ");
		auxVentaTotal = objConsola.nextDouble();
		/*
		 * CLASE PRODUCTO
		 */
		imprimir("DIGITE EL NÚMERO DE MANGUERA: ");
		auxNumManguera = objConsola.nextInt();
		imprimir ("DIGITE EL TIPO DE PRODUCTO: ");
		auxTipoProducto = objConsola.next();
		imprimir("DIGITE EL PRECIO: ");
		auxPrecio = objConsola.nextDouble();
		/*
		 * CLASE VEHICULO
		 */
		imprimir("DIGITE LA PLACA DEL VEHICULO: ");
		auxPlaca = objConsola.next();
		imprimir("DIGITE EL KILOMETRAJE DEL VEHICULO: ");
		auxKm = objConsola.nextDouble();
		
		clsEstacionDeServicio objEstacionDeServicio = new clsEstacionDeServicio("E.D.S ESSO BELLA VISTA", 105182480, "CRA9#57N-124", 8326028);
		String txtnombre = "NOMBRE: " + objEstacionDeServicio.getNombre(); 
		imprimir(txtnombre);
		String txtNit = "Nit: "+ objEstacionDeServicio.getNit();
		imprimir(txtNit);
		String txtDireccion = "Dirección: "+ objEstacionDeServicio.getDireccion();
		imprimir(txtDireccion);
		String txtTelefono = "Telefono: "+ objEstacionDeServicio.getTelefono();
		imprimir (txtTelefono);
		
		clsFactura objFactura = new clsFactura();
		objFactura.setNumFactura(auxNumFactura);
		objFactura.setHora(auxHora);
		objFactura.setFecha(auxFecha);
		objFactura.setCantGalones(auxCantGalones);
		objFactura.setVentaTotal(auxVentaTotal);
		
		String txtNumeroFactura = "Numero de factura: "+ objFactura.getNumFactura();
		imprimir(txtNumeroFactura);
		String txtHora = "Hora: "+ objFactura.getHora();
		imprimir (txtHora);
		String txtFecha = "Fecha: "+ objFactura.getFecha();
		imprimir (txtFecha);
		String txtCantGalones = "Cantidad de galones: "+ objFactura.getCantGalones();
		imprimir(txtCantGalones);
		String txtVentaTotal = "Venta total: $"+ objFactura.getVentaTotal();
		imprimir (txtVentaTotal);
		

		
		clsProducto objProducto = new clsProducto();
		objProducto.setNumeroManguera(auxNumManguera);
		objProducto.setTipoProducto(auxTipoProducto);
		objProducto.setPrecio(auxPrecio);
		
		String txtNumManguera = "NUMERO DE MANGUERA: "+ objProducto.getNumeroManguera();
		imprimir (txtNumManguera);
		String txtTipoProducto = "TIPO DE PRODUCTO: "+ objProducto.getTipoProducto();
		imprimir(txtTipoProducto);
		String txtPrecio = "PRECIO POR GALON: $"+ objProducto.getPrecio();
		imprimir(txtPrecio);
		
		clsVehiculo objVehiculo = new clsVehiculo();
		
		objVehiculo.setplaca(auxPlaca);
		objVehiculo.setKilometraje(auxKm);
		
		String txtPlaca = "PLACA: "+ objVehiculo.getplaca();
		imprimir(txtPlaca);
		String txtKm = "KILOMETRAJE: "+ objVehiculo.getKilometraje()+"km";
		imprimir(txtKm);
		
	}
	
	public static void imprimir(String vTexto){
		System.out.println(vTexto);
		
	}
	
	
}
