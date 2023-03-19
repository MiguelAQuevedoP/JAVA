
package modelo;
import java.util.ArrayList;
import java.util.Calendar;

public class clsEmpleado extends clsPersona {
	//ATRIBUTOS
		//atributos clase
	private eTipoCargo Cargo; //enum
	private Long Sueldo;
	private eAñosExperiencia AñosExperiencia;
	//referencias y/o listados
	private clsBanco refBanco;
	private ArrayList <clsEmpleado> lstEmpleado;
	//METODOS
	//constructores
	public clsEmpleado(){
		this.lstEmpleado = new ArrayList <clsEmpleado>();
	}
	public clsEmpleado(Long cedula, String nombre, String sexo, Calendar fechaNacimiento,
			eTipoCargo Cargo, Long Sueldo, eAñosExperiencia AñosExperiencia){
		super(cedula,nombre,sexo,fechaNacimiento);
		this.Cargo= Cargo;
		this.Sueldo=Sueldo;
		this.AñosExperiencia= AñosExperiencia;
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
	public eAñosExperiencia getAñosExperiencia() {
		return AñosExperiencia;
	}
	public void setAñosExperiencia(eAñosExperiencia añosExperiencia) {
		AñosExperiencia = añosExperiencia;
	}
	public clsBanco getRefBanco() {
		return refBanco;
	}
	public void setRefBanco(clsBanco refBanco) {
		this.refBanco = refBanco;
	}
	//metodos generales
	@Override
	public String imprimirInformación() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
