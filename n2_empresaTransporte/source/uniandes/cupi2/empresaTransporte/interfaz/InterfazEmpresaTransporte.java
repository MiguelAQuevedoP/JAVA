/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_empresaTransporte
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.empresaTransporte.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import uniandes.cupi2.empresaTransporte.mundo.Camion;
import uniandes.cupi2.empresaTransporte.mundo.EmpresaTransporte;

/**
 * Ventana principal de la aplicaci�n.
 */
@SuppressWarnings("serial")
public class InterfazEmpresaTransporte extends JFrame
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase principal del mundo.
     */
    private EmpresaTransporte listaCamiones;
    
    
    

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel con la informaci�n del cami�n 
     */
    private PanelCamion panelCamion;

    /**
     * Panel con la lista de camiones
     */
    private PanelLista panelLista;
    
    
    
    /**
     * Panel con la informaci�n general.
     */
    private PanelInformacion panelInformaci�n;

    /**
     * Panel con las opciones.
     */
    private PanelOpciones panelOpciones;

    /**
     * Panel con la imagen de banner.
     */
    private PanelImagen panelImagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la ventana principal de la aplicaci�n. <br>
     * <b>post: </b> La venta fue creada con todos sus paneles.
     */
    public InterfazEmpresaTransporte( )
    {
        setTitle( "Empresa de transporte" );
        setSize( 750, 700 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        listaCamiones = new EmpresaTransporte( );

        setLayout( new BorderLayout( ) );

        JPanel panelCentral = new JPanel( );
        panelCentral.setLayout( new GridLayout( 2, 2 ) );

        panelCamion = new PanelCamion( this );
        panelLista = new PanelLista( this );
        panelCentral.add( panelCamion ); 
        panelCentral.add( panelLista ); 

        add( panelCentral, BorderLayout.CENTER );

        panelOpciones = new PanelOpciones( this );
        add( panelOpciones, BorderLayout.SOUTH );

        JPanel panelSuperior = new JPanel( );
        panelSuperior.setLayout( new BorderLayout( ) );

        panelImagen = new PanelImagen( );
        panelSuperior.add( panelImagen, BorderLayout.CENTER );

        panelInformaci�n = new PanelInformacion( );
        panelSuperior.add( panelInformaci�n, BorderLayout.SOUTH );

        add( panelSuperior, BorderLayout.NORTH );

        setLocationRelativeTo( null );
        setResizable( false );

        actualizar( );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna la lista de las matriculas de todos los camiones.
     * @return Lista con matriculas de todos los camiones.
     */
    public ArrayList<String> darCamiones( )
    {
        return listaCamiones.darCamiones();
    }
    
    /**
     * Agrega un nuevo camion, si no existe otro camion con la misma matricula <br>
     * <b>post: </b> Se agrega un nuevo camion a la lista en caso de que �ste no exista a�n en ella.
     */
    public void agregarCamion( )
    {
    	
    	
    	String matricula = JOptionPane.showInputDialog( this, "Matricula:", "Agregar cami�n", JOptionPane.DEFAULT_OPTION );
        if( matricula != null )
        {
        	String capacidad = JOptionPane.showInputDialog( this, "Capacidad: ( n�mero entero )", "Agregar cami�n", JOptionPane.DEFAULT_OPTION );
            try
            {
                int capacidadI = Integer.parseInt( capacidad );
                if( capacidadI > 0 )
                {
                	String consumo = JOptionPane.showInputDialog( this, "Consumo: ( n�mero real con punto )", "Agregar cami�n", JOptionPane.DEFAULT_OPTION );
                	double consumoD = Double.parseDouble( consumo );
                    
                	if( consumoD > 0 )
                    {
                	
	                	boolean agrego = listaCamiones.agregar(matricula, capacidadI, consumoD);
	                    if( agrego == true )
	                    {
	                        actualizar( );
	                    }
	                    else
	                    {
	                        JOptionPane.showMessageDialog( this, "El cami�n no se pudo agregar.", "Agregar cami�n", JOptionPane.ERROR_MESSAGE );
	                    }
                    }
                	
                	else
                    {
                        JOptionPane.showMessageDialog( this, "El valor ingresado debe ser positivo.", "Agregar cami�n", JOptionPane.ERROR_MESSAGE );
                    }
                }	
                else
                {
                    JOptionPane.showMessageDialog( this, "El valor ingresado debe ser positivo.", "Agregar cami�n", JOptionPane.ERROR_MESSAGE );
                }
                	
            }
            catch( NumberFormatException e )
            {
                JOptionPane.showMessageDialog( this, "El valor ingresado debe ser un valor num�rico.", "Agregar cami�n", JOptionPane.ERROR_MESSAGE );
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( this, e.getMessage(), "Agregar cami�n", JOptionPane.ERROR_MESSAGE );
            }
        }
    	
        
    	

    }
    
    public void eliminarCamion( )
    {
        String placa = panelLista.darMatriculaSeleccionada();
       
        if( placa == null )
        {
            JOptionPane.showMessageDialog( this, "No ha seleccionado ninguna placa", "Eliminar Cami�n", JOptionPane.ERROR_MESSAGE );
        }
        else
        {
            boolean accion = listaCamiones.eliminar(placa);

            if( accion )
            {
                panelLista.actualizarLista( listaCamiones.darCamiones( ) );
                panelCamion.limpiarCampos( );
            }
            else
            {
                JOptionPane.showMessageDialog( this, "No se puede eliminar el camion", "Eliminar Cami�n", JOptionPane.ERROR_MESSAGE );
            }
        }
    }
    
    public void visualizarCamion( Object c)
    {
        String placa = panelLista.darMatriculaSeleccionada();
        
        if( placa == null )
        {
            JOptionPane.showMessageDialog( this, "No ha seleccionado ning�n cami�n", "Lista de Camiones", JOptionPane.ERROR_MESSAGE );
        }
        else
        {
            c = listaCamiones.buscarPorPlaca(placa);
            if( c != null )
            {
                panelCamion.actualizar( (Camion)c );
            }
            else
            {
                JOptionPane.showMessageDialog( this, "El camion no existe", "Lista de Camiones", JOptionPane.ERROR_MESSAGE );
            }
        }
    }
    /**
     * Actualiza la informaci�n de todos los paneles.
     */
    public void actualizar( )
    {
    	//TODO actualizar para el camion actual
    	
      
        panelLista.actualizarLista(darCamiones());
        String matricula = panelLista.darMatriculaSeleccionada();
        if( matricula != null )
        {
        	panelCamion.actualizar( listaCamiones.buscarPorPlaca(matricula));
        	
        }
        panelInformaci�n.actualizarInformacion( listaCamiones.darCargaTotal( ), listaCamiones.calcularCargaPromedio( ) );
    }

    /**
     * Carga un cami�n.
     * @param pMatricula Matr�cula del cami�n a descargar. pMatricula != null && pMatricula != "".
     */
    public void cargar( String pMatricula )
    {
        String ingresado = JOptionPane.showInputDialog( this, "Peso de la carga:", "Cargar cami�n", JOptionPane.DEFAULT_OPTION );
        if( ingresado != null )
        {
            try
            {
                int carga = Integer.parseInt( ingresado );
                if( carga > 0 )
                {
                    boolean cargo = listaCamiones.cargarCamion( pMatricula, carga );
                    if( cargo == true )
                    {
                        actualizar( );
                    }
                    else
                    {
                        JOptionPane.showMessageDialog( this, "El cami�n no tiene capacidad suficiente para esa carga.", "Cargar cami�n", JOptionPane.ERROR_MESSAGE );
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog( this, "El valor ingresado debe ser positivo.", "Cargar cami�n", JOptionPane.ERROR_MESSAGE );
                }
            }
            catch( NumberFormatException e )
            {
                JOptionPane.showMessageDialog( this, "El valor ingresado debe ser un valor num�rico.", "Cargar cami�n", JOptionPane.ERROR_MESSAGE );
            }
        }

    }

    /**
     * Descarga un cami�n.
     * @param pMatricula Matr�cula del cami�n a descargar. pMatricula != null && pMatricula != "".
     */
    public void descargar( String pMatricula )
    {
    	listaCamiones.descargarCamion( pMatricula );
        actualizar( );
    }

    /**
     * Busca y muestra el mejor cami�n para transportar una carga dada.
     */
    public void darMejorCamion( )
    {
        String valor = JOptionPane.showInputDialog( this, "Peso a transportar (en Kg.)", "Buscar mejor cami�n", JOptionPane.DEFAULT_OPTION );
        if( valor != null )
        {
            try
            {
                int cantidad = Integer.parseInt( valor );
                Camion resultado = listaCamiones.darMejorCamion( cantidad );
                if( resultado != null )
                {
                    JOptionPane.showMessageDialog( this, "El mejor cami�n para transportar la carga tiene la matr�cula: " + resultado.darMatricula( ), "Mejor cami�n", JOptionPane.DEFAULT_OPTION );
                }
                else
                {
                    JOptionPane.showMessageDialog( this, "Ning�n cami�n puede transportar la carga.", "Mejor cami�n", JOptionPane.DEFAULT_OPTION );
                }
            }
            catch( NumberFormatException e )
            {
                JOptionPane.showMessageDialog( this, "El peso ingresado debe ser un valor num�rico.", "Mejor cami�n", JOptionPane.ERROR_MESSAGE );
            }
        }
    }
    
    
    /**
     * Busca y despliega el camion encontrados por matricula.
     */
    public void buscarCamionPorMatricula( )
    {
        String matricula = JOptionPane.showInputDialog( this, "Escriba la matricula a buscar", "Lista de Camiones", JOptionPane.PLAIN_MESSAGE );
        if( matricula != null )
        {
            if( matricula.equals( "" ) )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar una matricula ", "Lista de Camiones", JOptionPane.INFORMATION_MESSAGE );
            }
            else
            {
                Camion c = listaCamiones.buscarPorPlaca( matricula );
                if( c == null )
                {
                    JOptionPane.showMessageDialog( this, "No se encontraron camiones con esa placa", "Lista de Camiones", JOptionPane.INFORMATION_MESSAGE );
                }
                else
                {
                	ArrayList l = new ArrayList<String>();
                	l.add( (c.darMatricula() ));
                    panelLista.actualizarLista( l );
                }
            }
        }
    }

    /**
     * Muestra la capacidad total de carga de los 4 camiones.
     */
    public void darTotalizarPeso( )
    {
        int peso = listaCamiones.darCapacidadTotal( );
        JOptionPane.showMessageDialog( this, "La capacidad total de carga es " + peso + " kg.", "Peso Total", JOptionPane.INFORMATION_MESSAGE );
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1.
     */
    public void reqFuncOpcion1( )
    {
        String resultado = listaCamiones.metodo1( );
        actualizar( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * M�todo para la extensi�n 2.
     */
    public void reqFuncOpcion2( )
    {
        String resultado = listaCamiones.metodo2( );
        actualizar( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Ejecuta la aplicaci�n.
     * @param pArgs Par�metros de la ejecuci�n. No son necesarios.
     */
    public static void main( String[] pArgs )
    {
        try
        {
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

            InterfazEmpresaTransporte interfaz = new InterfazEmpresaTransporte( );
            interfaz.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }

	
}