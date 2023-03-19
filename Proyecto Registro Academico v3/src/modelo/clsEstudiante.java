package modelo;
import java.util.ArrayList;

public class clsEstudiante extends clsPersona implements iEvaluacion{
	//ATRIBUTOS
	//atributos de clase
	private String correo;
	//referencias y/o listados	
	private ArrayList<clsDeuda> lstDeudas;
	private ArrayList<clsCurso> lstCursos;
	//METODOS
	//constructores
	public clsEstudiante(){
		super();
		this.lstCursos = new ArrayList<clsCurso>();
		this.lstDeudas = new ArrayList<clsDeuda>();
	}
	public clsEstudiante(long codigo, String nombre, String correo) {
		super(codigo, nombre);
		this.correo = correo;
		this.lstCursos = new ArrayList<clsCurso>();
		this.lstDeudas = new ArrayList<clsDeuda>();
	}	
	//getters y setters
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public ArrayList<clsDeuda> getLstDeudas() {
		return lstDeudas;
	}
	public void setLstDeudas(ArrayList<clsDeuda> lstDeudas) {
		this.lstDeudas = lstDeudas;
	}
	public ArrayList<clsCurso> getLstCursos() {
		return lstCursos;
	}
	public void setLstCursos(ArrayList<clsCurso> lstCursos) {
		this.lstCursos = lstCursos;
	}	
	//metodos generales
	public void agregarDeuda(clsDeuda objDeuda){
		this.lstDeudas.add(objDeuda);  //guarda en vector
		objDeuda.setRefEstudiante(this); //guarda en referencia
	}
	@Override
	public String obtenerInformacion() {
		String info;
		info = "Correo: "+correo+"Codigo: "+super.getCodigo()+
				"Nombre: "+super.getNombre();
		return info;
	}
	@Override
	public String evaluacionCuantitativa() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String evaluacionCualitativa() {
		// TODO Auto-generated method stub
		return null;
	}
}
