package uniandes.cupi2.empresaTransporte.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.empresaTransporte.mundo.Camion;

public class PanelLista extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante usada para indicar que se quieren ver todos los camiones.
     */
    private final static String TODOS = "TODOS";

    /**
     * Constante usada para indicar que se quieren ver los contactos que cumplan con algún criterio de búsqueda.
     */
    private final static String PALABRA = "PALABRA";

    /**
     * Constante usada para indicar que se quieren ver los datos de un contacto.
     */
    private final static String VER = "VER";

    /**
     * Constante usada para indicar que se quiere agregar un camion.
     */
    private final static String AGREGAR = "AGREGAR";
    
    /**
     * Constante usada para indicar que se quiere eliminar un contacto.
     */
    private final static String ELIMINAR = "ELIMINAR";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * La ventana principal de la aplicación.
     */
    private InterfazEmpresaTransporte principal;

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Panel de desplazamiento de la lista de contactos.
     */
    private JScrollPane panelLista;

    /**
     * Lista para los contactos.
     */
    private JList listaCamiones;

    /**
     * Botón al que se le asignara la acción para mostrar los datos de un contacto.
     */
    private JButton btnVer;

    /**
     * Botón al que se le asignara la acción para eliminar un contacto.
     */
    private JButton btnEliminar;
    
    /**
     * Botón al que se le asignara la acción para eliminar un contacto.
     */
    private JButton btnAgregar;

    /**
     * Botón para la acción de ver todos los contactos.
     */
    private JButton btnTodos;

    /**
     * Botón para hacer búsqueda de camiones por placa.
     */
    private JButton btnPalabra;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel de visualización de la lista de contactos.
     * @param pPrincipal Ventana principal de la aplicación. pPrincipal != null.
     */
    public PanelLista( InterfazEmpresaTransporte pPrincipal )
    {
        principal = pPrincipal;
        setLayout( new BorderLayout( ) );
        setBorder( new TitledBorder( "Lista de Camiones" ) );

        // Inicializa la lista
        listaCamiones = new JList( );
        panelLista = new JScrollPane( );
        panelLista.setViewportView( listaCamiones );
        panelLista.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        panelLista.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );

        listaCamiones.setModel( new DefaultListModel( ) );

        // Inicializa los botones
        btnVer = new JButton( );
        btnVer.setText( "Ver" );
        btnVer.setActionCommand( VER );
        btnVer.addActionListener( this );

        btnEliminar = new JButton( );
        btnEliminar.setText( "Eliminar" );
        btnEliminar.setActionCommand( ELIMINAR );
        btnEliminar.addActionListener( this );
        
        btnAgregar = new JButton( );
        btnAgregar.setText( "Agregar" );
        btnAgregar.setActionCommand( AGREGAR );
        btnAgregar.addActionListener( this );

        btnTodos = new JButton( );
        btnTodos.setText( "Ver Todos los camiones" );
        btnTodos.setActionCommand( TODOS );
        btnTodos.addActionListener( this );

        btnPalabra = new JButton( );
        btnPalabra.setText( "Buscar por placa" );
        btnPalabra.setActionCommand( PALABRA );
        btnPalabra.addActionListener( this );

        // Ubica los elementos inicializados anteriormente
        add( panelLista, BorderLayout.CENTER );

        JPanel panelBotones = new JPanel( );
        panelBotones.setBorder( BorderFactory.createEmptyBorder( 5, 5, 5, 5 ) );
        panelBotones.setLayout( new GridLayout( 4, 1, 5, 5 ) );
        panelBotones.add( btnTodos );
        panelBotones.add( btnPalabra );
        panelBotones.add( btnVer );
        panelBotones.add( btnAgregar );
        panelBotones.add( btnEliminar );

        add( panelBotones, BorderLayout.EAST );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Actualiza la lista con los elementos del arrayList.
     * @param pLista La nueva lista de nombres para mostrar.
     */
    public void actualizarLista( ArrayList <String>pLista )
    {
    	listaCamiones.setListData( pLista.toArray( ) );
    }

    /**
     * Retorna la matricula del camion seleccionado.
     * @return placa del camion seleccionado. Si no hay un camion seleccionado retorna null.
     */
    public String darMatriculaSeleccionada( )
    {
        String matricula = ( ( String )listaCamiones.getSelectedValue( ) );
       

        return matricula;
    }



    /**
     * Recibe los eventos realizados en los elementos de la interfaz y realiza acciones.
     * @param pEvento El evento realizado por el usuario. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );
        if( comando.equals( VER ) )
        {
            principal.visualizarCamion( listaCamiones.getSelectedValue() );
        }
        else if( comando.equals( TODOS ) )
        {
            actualizarLista( principal.darCamiones( ) );
        }
        else if( comando.equals( PALABRA ) )
        {
            principal.buscarCamionPorMatricula( );
        }
        else if( comando.equals( AGREGAR ) )
        {
        
            principal.agregarCamion( );
        }
        else if( comando.equals( ELIMINAR ) )
        {
            principal.eliminarCamion( );
        }

    }

}