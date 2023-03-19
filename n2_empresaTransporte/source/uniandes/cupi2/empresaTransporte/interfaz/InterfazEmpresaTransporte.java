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
 * Ventana principal de la aplicación.
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
     * Panel con la información del camión 
     */
    private PanelCamion panelCamion;

    /**
     * Panel con la lista de camiones
     */
    private PanelLista panelLista;
    
    
    
    /**
     * Panel con la información general.
     */
    private PanelInformacion panelInformación;

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
     * Crea la ventana principal de la aplicación. <br>
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

        panelInformación = new PanelInformacion( );
        panelSuperior.add( panelInformación, BorderLayout.SOUTH );

        add( panelSuperior, BorderLayout.NORTH );

        setLocationRelativeTo( null );
        setResizable( false );

        actualizar( );
    }

    // -----------------------------------------------------------------
    // Métodos
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
     * <b>post: </b> Se agrega un nuevo camion a la lista en caso de que éste no exista aún en ella.
     */
    public void agregarCamion( )
    {
    	
    	
    	String matricula = JOptionPane.showInputDialog( this, "Matricula:", "Agregar camión", JOptionPane.DEFAULT_OPTION );
        if( matricula != null )
        {
        	String capacidad = JOptionPane.showInputDialog( this, "Capacidad: ( número entero )", "Agregar camión", JOptionPane.DEFAULT_OPTION );
            try
            {
                int capacidadI = Integer.parseInt( capacidad );
                if( capacidadI > 0 )
                {
                	String consumo = JOptionPane.showInputDialog( this, "Consumo: ( número real con punto )", "Agregar camión", JOptionPane.DEFAULT_OPTION );
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
	                        JOptionPane.showMessageDialog( this, "El camión no se pudo agregar.", "Agregar camión", JOptionPane.ERROR_MESSAGE );
	                    }
                    }
                	
                	else
                    {
                        JOptionPane.showMessageDialog( this, "El valor ingresado debe ser positivo.", "Agregar camión", JOptionPane.ERROR_MESSAGE );
                    }
                }	
                else
                {
                    JOptionPane.showMessageDialog( this, "El valor ingresado debe ser positivo.", "Agregar camión", JOptionPane.ERROR_MESSAGE );
                }
                	
            }
            catch( NumberFormatException e )
            {
                JOptionPane.showMessageDialog( this, "El valor ingresado debe ser un valor numérico.", "Agregar camión", JOptionPane.ERROR_MESSAGE );
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( this, e.getMessage(), "Agregar camión", JOptionPane.ERROR_MESSAGE );
            }
        }
    	
        
    	

    }
    
    public void eliminarCamion( )
    {
        String placa = panelLista.darMatriculaSeleccionada();
       
        if( placa == null )
        {
            JOptionPane.showMessageDialog( this, "No ha seleccionado ninguna placa", "Eliminar Camión", JOptionPane.ERROR_MESSAGE );
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
                JOptionPane.showMessageDialog( this, "No se puede eliminar el camion", "Eliminar Camión", JOptionPane.ERROR_MESSAGE );
            }
        }
    }
    
    public void visualizarCamion( Object c)
    {
        String placa = panelLista.darMatriculaSeleccionada();
        
        if( placa == null )
        {
            JOptionPane.showMessageDialog( this, "No ha seleccionado ningún camión", "Lista de Camiones", JOptionPane.ERROR_MESSAGE );
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
     * Actualiza la información de todos los paneles.
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
        panelInformación.actualizarInformacion( listaCamiones.darCargaTotal( ), listaCamiones.calcularCargaPromedio( ) );
    }

    /**
     * Carga un camión.
     * @param pMatricula Matrícula del camión a descargar. pMatricula != null && pMatricula != "".
     */
    public void cargar( String pMatricula )
    {
        String ingresado = JOptionPane.showInputDialog( this, "Peso de la carga:", "Cargar camión", JOptionPane.DEFAULT_OPTION );
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
                        JOptionPane.showMessageDialog( this, "El camión no tiene capacidad suficiente para esa carga.", "Cargar camión", JOptionPane.ERROR_MESSAGE );
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog( this, "El valor ingresado debe ser positivo.", "Cargar camión", JOptionPane.ERROR_MESSAGE );
                }
            }
            catch( NumberFormatException e )
            {
                JOptionPane.showMessageDialog( this, "El valor ingresado debe ser un valor numérico.", "Cargar camión", JOptionPane.ERROR_MESSAGE );
            }
        }

    }

    /**
     * Descarga un camión.
     * @param pMatricula Matrícula del camión a descargar. pMatricula != null && pMatricula != "".
     */
    public void descargar( String pMatricula )
    {
    	listaCamiones.descargarCamion( pMatricula );
        actualizar( );
    }

    /**
     * Busca y muestra el mejor camión para transportar una carga dada.
     */
    public void darMejorCamion( )
    {
        String valor = JOptionPane.showInputDialog( this, "Peso a transportar (en Kg.)", "Buscar mejor camión", JOptionPane.DEFAULT_OPTION );
        if( valor != null )
        {
            try
            {
                int cantidad = Integer.parseInt( valor );
                Camion resultado = listaCamiones.darMejorCamion( cantidad );
                if( resultado != null )
                {
                    JOptionPane.showMessageDialog( this, "El mejor camión para transportar la carga tiene la matrícula: " + resultado.darMatricula( ), "Mejor camión", JOptionPane.DEFAULT_OPTION );
                }
                else
                {
                    JOptionPane.showMessageDialog( this, "Ningún camión puede transportar la carga.", "Mejor camión", JOptionPane.DEFAULT_OPTION );
                }
            }
            catch( NumberFormatException e )
            {
                JOptionPane.showMessageDialog( this, "El peso ingresado debe ser un valor numérico.", "Mejor camión", JOptionPane.ERROR_MESSAGE );
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
    // Puntos de Extensión
    // -----------------------------------------------------------------

    /**
     * Método para la extensión 1.
     */
    public void reqFuncOpcion1( )
    {
        String resultado = listaCamiones.metodo1( );
        actualizar( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2.
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
     * Ejecuta la aplicación.
     * @param pArgs Parámetros de la ejecución. No son necesarios.
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