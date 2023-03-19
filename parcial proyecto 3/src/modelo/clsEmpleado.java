
package modelo;
import java.util.ArrayList;
import java.util.Calendar;

public class clsEmpleado extends clsPersona {
	//ATRIBUTOS
		//atributos clase
	private eTipoCargo Cargo; //enum
	private Long Sueldo;
	private eA�osExperiencia A�osExperiencia;
	//referencias y/o listados
	private clsBanco refBanco;
	private ArrayList <clsEmpleado> lstEmpleado;
	//METODOS
	//constructores
	public clsEmpleado(){
		this.lstEmpleado = new ArrayList <clsEmpleado>();
	}
	public clsEmpleado(Long cedula, String nombre, String sexo, Calendar fechaNacimiento,
			eTipoCargo Cargo, Long Sueldo, eA�osExperiencia A�osExperiencia){
		super(cedula,nombre,sexo,fechaNacimiento);
		this.Cargo= Cargo;
		this.Sueldo=Sueldo;
		this.A�osExperiencia= A�osExperiencia;
		this.lstEmpleado = new ArrayList <clsEmpleado>();
	}
	//getters y setters
	public eTipoCargo getCargo() {
		return Cargo;
	}
	public void setCargo(eTipoCargo cargo) {
		Cargo = cargo;
	}
	public Long getSueldo() {
		return Sueldo;
	}
	public void setSueldo(Long sueldo) {
		Sueldo = sueldo;
	}
	public eA�osExperiencia getA�osExperiencia() {
		return A�osExperiencia;
	}
	public void setA�osExperiencia(eA�osExperiencia a�osExperiencia) {
		A�osExperiencia = a�osExperiencia;
	}
	public clsBanco getRefBanco() {
		return refBanco;
	}
	public void setRefBanco(clsBanco refBanco) {
		this.refBanco = refBanco;
	}
	//metodos generales
	@Override
	public String imprimirInformaci�n() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
