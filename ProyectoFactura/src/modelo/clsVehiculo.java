package modelo;

public class clsVehiculo {
	
	private String placa;
	private double kilometraje;
	
	public clsVehiculo (String placa, double kilometraje){
		this.placa = placa;
		this.kilometraje = kilometraje;
	}
	
	public clsVehiculo() {
		
	}

	public String getplaca(){
		return placa;
	}
	
	public void setplaca(String placa){
		this.placa = placa;
		
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	
}
