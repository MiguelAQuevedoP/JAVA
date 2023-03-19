package modelo;
import java.util.Calendar;

public class clsCuenta {
 //ATRIBUTOS
	 //Atributos de clase
	private long numero; 
	private String tipo;
	private Calendar fechaCreacion;
	private double saldo;
	 //Referencias y/o listados 
	private clsCliente refCliente;
	private clsBanco refBanco;
//METODOS
	//Constructores 
	public clsCuenta () {
	}
	public clsCuenta(long numero, String tipo, Calendar fechaCreacion, double saldo) {
		this.numero = numero;
		this.tipo = tipo;
		this.fechaCreacion = fechaCreacion;
		this.saldo = saldo;
	}
	//Getters y setters
	public long getNumero() {
		return numero;
	}
	public clsBanco getRefBanco() {
		return refBanco;
	}
	public void setRefBanco(clsBanco refBanco) {
		this.refBanco = refBanco;
	}
	public clsCliente getRefCliente() {
		return refCliente;
	}
	public void setRefCliente(clsCliente refCliente) {
		this.refCliente = refCliente;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Calendar getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Calendar fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// metodos generales
	
}
