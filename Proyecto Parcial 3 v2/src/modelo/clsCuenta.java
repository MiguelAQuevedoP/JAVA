package modelo;

import java.util.Calendar;

public class clsCuenta {

	//ATRIBUTOS
	//atributos de clase
	private long numero;
	private eTipoCuenta tipo;
	private Calendar fechaCreacion;
	private double saldo;
	//referencias y/o listados
	private clsCliente refCliente;
	private clsBanco refBanco;
	//METODOS
	//constructores
	public clsCuenta() {
		
	}
	public clsCuenta(long numero, eTipoCuenta tipo, Calendar fechaCreacion, double saldo) {
		this.numero = numero;
		this.tipo = tipo;
		this.fechaCreacion = fechaCreacion;
		this.saldo = saldo;
		this.refBanco = refBanco;
		this.refCliente = refCliente;
	}
	
	//getters y setters
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public eTipoCuenta getTipo() {
		return tipo;
	}
	public void setTipo(eTipoCuenta tipo) {
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
	public clsCliente getRefCliente() {
		return refCliente;
	}
	public void setRefCliente(clsCliente refCliente) {
		this.refCliente = refCliente;
	}
	public clsBanco getRefBanco() {
		return refBanco;
	}
	public void setRefBanco(clsBanco refBanco) {
		this.refBanco = refBanco;
	}
	//metodos generales
	
	
}
