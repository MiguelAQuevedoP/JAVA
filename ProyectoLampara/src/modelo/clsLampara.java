package modelo;

public class clsLampara {

	//ATRIBUTOS
	private String color;
	private String marca;
	private double tamanio;
	
	//METODOS
	//constructor
	public clsLampara(){
		this.color = "NN";
		this.marca = "NN";
		this.tamanio = -1;
		
	}
	//constructor con parametros
	public clsLampara(String color, String marca, double tamanio){
		this.color = color;
		this.marca = marca;
		this.tamanio = tamanio;
	}
	//getter y setter
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color; 
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public boolean encender(){
		//TODO falta programar
		return true;
		
	}
	
	public boolean apagar(){
		//TODO falta programar
		return true;
		
	}
	
}
