package uniandes.cupi2.empresaTransporte.mundo;

public class Vehiculo implements IVehiculo {

	protected String matricula;
	protected double consumoD;
	
	 public String darMatricula( )
	    {
	        return matricula;
	    }
	
	public double darConsumo( )
    {
        return consumoD;
    }
	
}
