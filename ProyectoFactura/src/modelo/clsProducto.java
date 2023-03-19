package modelo;

public class clsProducto {
	
	//Atributos
	private int numeroManguera;
	private String tipoProducto;
	private double precio;
	
	public clsProducto() {
		
	}
	public clsProducto (int numeroMangera, String tipoProducto, double precio){
		this.numeroManguera = numeroMangera;
		this.tipoProducto = tipoProducto;
		this.precio = precio;
		
	}

	

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public int getNumeroManguera() {
		return numeroManguera;
	}

	public void setNumeroManguera(int numeroManguera) {
		this.numeroManguera = numeroManguera;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
}
