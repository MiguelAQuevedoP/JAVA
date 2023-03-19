/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_empresaTransporte
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.empresaTransporte.mundo;

import java.util.ArrayList;
//import java.util.Scanner;

/**
 * Empresa de transporte.
 */
public class EmpresaTransporte
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

	private ArrayList<Camion> camiones;
	
	
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea una nueva empresa de transporte con 4 camiones. <br>
     * <b>post: </b> Los camiones fueron creados con los siguientes valores: <br>
     * Camión 1: Matrícula: BAC213, Capacidad (en Kgs): 150, Consumo: 85. <br>
     * Camión 2: Matrícula: CAP384, Capacidad (en Kgs): 190, Consumo: 70. <br>
     * Camión 3: Matrícula: GER273, Capacidad (en Kgs): 280, Consumo: 100. <br>
     * Camión 4: Matrícula: JKV232, Capacidad (en Kgs): 215, Consumo: 110.
     */


    public EmpresaTransporte( )
    {
    	camiones = new ArrayList<Camion>();
    }

    
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna los camiones.
     * @return Camiones.
     */
    
    public ArrayList<String> darCamiones( )
    {
        ArrayList <String> matriculas = new ArrayList<String>();
        
        for ( int i=0; i<camiones.size(); i++)
        {
        	matriculas.add( camiones.get(i).darMatricula() );
        }
        
        return matriculas;
    }

    
    
    public Camion buscarPorPlaca ( String pPlaca )
    {
    	Camion buscado = null;
    	boolean encontro = false;

    	for ( int i=0; i<camiones.size() && !encontro; i++ )
    	{
    		Camion actual = camiones.get(i);
    		
    		if ( actual.darMatricula().equals(pPlaca) )
    		{
    			encontro = true;
    			buscado = actual;
    		}
    	}
    	
    	return buscado;
    }
    
	public boolean agregar ( String pMatricula, int pCapacidad, double pConsumo )
    {
    	Camion camion = new Camion( pMatricula, pCapacidad, pConsumo );
    	boolean agrego = false;
    	
    	
    	if (buscarPorPlaca(pMatricula) == null )
    	{
    		camiones.add(camion);
    		agrego = true;
    	}
    	
    	return agrego;
    }
	
	public boolean eliminar( String pMatricula )
	{
		boolean encontro = false;
		
		for ( int i=0; i<camiones.size() && !encontro; i++ )
		{
			Camion actual = camiones.get(i);
			
			if ( actual.darMatricula().equals(pMatricula) )
	    	{
	    		camiones.remove(i);
	    		encontro = true;
	    	}
		}
	
		return encontro;
	}
    
    public int darCargaTotal( )
    {
    	int cargaTotal = 0;

    	for ( int i=0; i<camiones.size(); i++ )
    	{
        	Camion actual = camiones.get(i);
    		cargaTotal = cargaTotal + actual.darCargaActual();
    	}
    	
    	return cargaTotal;
    }

 
    public boolean cargarCamion( String pMatricula, int pPesoCarga )
    {
    	boolean cargo = false;
    	
    	for ( int i=0; i<camiones.size(); i++ )
    	{
    		Camion actual = camiones.get(i);
    		if( actual.darMatricula( ).equals( pMatricula ) )
    		{
    			cargo = actual.cargar( pPesoCarga );
    		}
    	}
    	
    	return cargo;
    }
  

    public void descargarCamion( String pMatricula )
    {
    	for ( int i=0; i<camiones.size(); i++ )
    	{
    		Camion actual = camiones.get(i);
    		
    		if( actual.darMatricula( ).equals( pMatricula ) )
    		{
    			actual.descargar();
    		}
    	}
    }
    
  
    public int darCapacidadTotal( )
    {
    	int capTot = 0; 
    	
    	for ( int i=0; i<camiones.size(); i++ )
    	{
    		Camion actual = camiones.get(i);
    		capTot = capTot + actual.darCapacidad();
    	}
    	
    	return capTot;
    }
    

    
    public double calcularCargaPromedio( )
    {
    	double cargProm = 0.0;
    	double suma = 0.0;
    	
    	for ( int i=0; i<camiones.size(); i++ )
    	{
    		Camion actual = camiones.get(i);
    		suma = suma + actual.darCargaActual();
    	}
    	
    	cargProm = suma / camiones.size();
    	return cargProm;
    }

    
    public Camion darMejorCamion( int pPesoCarga )
    {
        Camion mejor = null;
        double mejorConsumo = -1;
        
        for ( int i=0; i<camiones.size(); i++ )
        {
        	Camion actual = camiones.get(i);
        	
        	  if( actual.darCapacidad( ) >= pPesoCarga && (mejorConsumo == -1  || actual.darConsumo( ) < mejorConsumo) )
              {
                  mejor = actual;
                  mejorConsumo = mejor.darConsumo( );
              }
        }
        return mejor;
    }
    

    public Camion camionMayorCarga ( )
    {
    	Camion camionMayorCarga = null;
    	int repeticiones = 0;
    	
    	for ( int i=0; i<camiones.size(); i++ )
    	{
    		int cont = 0;
    		Camion actual = camiones.get(i);
    	
    		for ( int j=0; j<camiones.size(); j++ )
    		{
    			Camion actualj = camiones.get(i);
    			
    			if ( actual.darCargaActual() ==  actualj.darCargaActual() )
    			{
    				cont++;
    			}
    		}
    	
    		if ( cont > repeticiones )
    		{
    			camionMayorCarga = actual;
    			repeticiones = cont;
    		}
    	}
    	
    	
    	return camionMayorCarga;
    	
    }
    
	
    public boolean existeCamionConCapacidad( int pCapacidad )
    {
    	boolean existe = false;
    	
    	for ( int i=0; i<camiones.size() && !existe; i++ )
    	{
    		Camion actual = camiones.get(i);
    		
    		if ( actual.darCapacidad() == pCapacidad )
    		{
    			existe = true;
    		}
    	}
    	
    	return existe;
    }
    
  
    public int darPesoActualMasComun()
    {
    	int masComun = 0;
    	int repeticiones = 0;

    	for ( int i=0; i<camiones.size(); i++ )
    	{
    		Camion actual = camiones.get(i);
    		int cont = 0;
    		
    		for ( int j=0; j<camiones.size(); i++ )
    		{
    			Camion actualj = camiones.get(i);
    			if ( actual.darCargaActual() == actualj.darCargaActual() )
    			{
    				cont++;
    			}
    		}
    		
    		if ( cont > repeticiones )
    		{
    			masComun = actual.darCargaActual();
    			repeticiones = cont;
    		}
    	}
    	
    	return masComun;
    }
    
    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------
 
    
    public String metodo1()
    {
    
    	return "respuesta";
    }


	public String metodo2()
    {
		return "respuesta2";
    }

  

}