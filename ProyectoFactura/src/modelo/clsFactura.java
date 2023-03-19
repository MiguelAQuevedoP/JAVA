package modelo;
public class clsFactura {
	 
	//Atributos
	private int numFactura;
	private String fecha;
	private String hora;
	private double ventaTotal;
	private double cantGalones;
	
	
	//Metodos
	//Constructor
	public clsFactura() {
		
	}
	public clsFactura(int numFactura, String fecha, String hora, double ventaTotal, double cantGalones){
		
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.hora = hora;
		this.ventaTotal = ventaTotal;
		this.cantGalones = cantGalones;
		
	}

	

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public double getVentaTotal() {
		return ventaTotal;
	}

	public void setVentaTotal(double ventaTotal) {
		this.ventaTotal = ventaTotal;
	}
	public double getCantGalones() {
		return cantGalones;
	}

	public void setCantGalones(double cantGalones) {
		this.cantGalones = cantGalones;
	}
	
	
	
}
