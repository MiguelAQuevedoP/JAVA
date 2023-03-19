/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Pokemon;
import Modelo.eGenero;
import Modelo.eNombre;
import Modelo.eTipo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class PanelEditarPokemon extends javax.swing.JPanel {

    /**
     * Creates new form PanelEditarPokemon
     */
    public PanelEditarPokemon(ArrayList<Pokemon>listaP) {
        initComponents();
        inicialilzarComponentes(listaP);
    }
    private void inicialilzarComponentes(ArrayList<Pokemon>listaP){
        this.deshabilitarTxt();
        this.habilitarTxt();
        this.listaPokemones = listaP;

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscarPoemon = new javax.swing.JButton();
        txtPokemonEditar = new javax.swing.JTextField();
        lblInfoPokemon = new javax.swing.JLabel();
        lblNombreEditar = new javax.swing.JLabel();
        lblDescripcionEditar = new javax.swing.JLabel();
        lblNumeroAbuscar = new javax.swing.JLabel();
        cNombreEditar = new javax.swing.JComboBox<>();
        txtDescripcionEditar = new javax.swing.JTextField();
        lblPesoEditar = new javax.swing.JLabel();
        txtPesoEditar = new javax.swing.JTextField();
        lblAlturaEditar = new javax.swing.JLabel();
        lblGeneroEditar = new javax.swing.JLabel();
        lblDebilidadEditar = new javax.swing.JLabel();
        lblFortalezaEditar = new javax.swing.JLabel();
        lblNumeroEditar = new javax.swing.JLabel();
        lblNivelEditar = new javax.swing.JLabel();
        txtAlturaEditar = new javax.swing.JTextField();
        txtNumeroEditar = new javax.swing.JTextField();
        txtNivelEditar = new javax.swing.JTextField();
        cGeneroEditar = new javax.swing.JComboBox<>();
        cDebilidadEditar = new javax.swing.JComboBox<>();
        cFortalezaEditar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblTituloPanel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarPoemon.setText("BuscarPokemon");
        btnBuscarPoemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEditarPokemon(evt);
            }
        });

        lblInfoPokemon.setText("/:");

        lblNombreEditar.setText("Nombre");

        lblDescripcionEditar.setText("Descripción");

        lblNumeroAbuscar.setText("Ingrese el número de pokemon: ");

        cNombreEditar.setModel(new DefaultComboBoxModel(eNombre.values()));

        lblPesoEditar.setText("Peso");

        lblAlturaEditar.setText("Altura");

        lblGeneroEditar.setText("Género");

        lblDebilidadEditar.setText("Debilidad");

        lblFortalezaEditar.setText("Fortaleza");

        lblNumeroEditar.setText("Número");

        lblNivelEditar.setText("Nivel");

        cGeneroEditar.setModel(new DefaultComboBoxModel(eGenero.values())
        );

        cDebilidadEditar.setModel(new DefaultComboBoxModel(eTipo.values()));

        cFortalezaEditar.setModel(new DefaultComboBoxModel(eTipo.values()));

        jButton1.setText("EDITAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDatosEdicion(evt);
            }
        });

        lblTituloPanel.setBackground(new java.awt.Color(204, 204, 0));
        lblTituloPanel.setFont(new java.awt.Font("Elephant", 2, 12)); // NOI18N
        lblTituloPanel.setForeground(new java.awt.Color(0, 204, 51));
        lblTituloPanel.setText("EDITAR POKEMON");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNumeroAbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPokemonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarPoemon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombreEditar)
                                            .addComponent(lblDescripcionEditar)
                                            .addComponent(lblPesoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNivelEditar))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtAlturaEditar)
                                            .addComponent(txtDescripcionEditar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPesoEditar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNivelEditar)
                                            .addComponent(cNombreEditar, javax.swing.GroupLayout.Alignment.LEADING, 0, 91, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblGeneroEditar)
                                                    .addComponent(lblNumeroEditar)
                                                    .addComponent(lblDebilidadEditar)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(lblFortalezaEditar))))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cDebilidadEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cFortalezaEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumeroEditar)
                                    .addComponent(cGeneroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAlturaEditar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblInfoPokemon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarPoemon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPokemonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroAbuscar)))
                    .addComponent(lblTituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(lblInfoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreEditar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGeneroEditar)
                        .addComponent(cGeneroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcionEditar)
                    .addComponent(txtDescripcionEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroEditar)
                    .addComponent(txtNumeroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesoEditar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDebilidadEditar)
                        .addComponent(cDebilidadEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlturaEditar)
                    .addComponent(txtAlturaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFortalezaEditar)
                    .addComponent(cFortalezaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNivelEditar)
                    .addComponent(txtNivelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarEditarPokemon(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEditarPokemon
        int numeroElegido;
        
        try {
            numeroElegido = Integer.parseInt(txtPokemonEditar.getText());
            Pokemon arcanine= new PokemonImpl("");
           
            arcanine = arcanine.buscarPokemonAeditar(numeroElegido,listaPokemones);
            if(arcanine == null){
                JOptionPane.showMessageDialog(this,"Pokemon no encontrado");
            }
            else{
                this.lblInfoPokemon.setText(arcanine.obtenerInfoPokemon());
                habilitarTxt();
            }
        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(this, "El número de pokemon debe ser un valor numérico");
        }
    }//GEN-LAST:event_buscarEditarPokemon

    private void registrarDatosEdicion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDatosEdicion
        for(int i =0 ;i<listaPokemones.size() ; i++ ){
            eNombre nombre;  
            int numeroPokemonE,numero,nivel;
            double peso,altura;
            String descripcion;
            eGenero genero;
            eTipo debilidad,fortaleza;           
            numeroPokemonE = Integer.parseInt(this.txtPokemonEditar.getText()); 
            
        nombre = (eNombre) cNombreEditar.getSelectedItem();
        descripcion = this.txtDescripcionEditar.getText();  
        peso = Double.parseDouble(this.txtPesoEditar.getText());
        altura = Double.parseDouble(this.txtAlturaEditar.getText());
        genero=(eGenero) cGeneroEditar.getSelectedItem();        
        numero = Integer.parseInt(this.txtNumeroEditar.getText()); 
        debilidad=(eTipo)cDebilidadEditar.getSelectedItem();
        fortaleza=(eTipo) cFortalezaEditar.getSelectedItem();  
        nivel = Integer.parseInt(this.txtNivelEditar.getText());
            if(numeroPokemonE == listaPokemones.get(i).getNumeroPokemon()){
               listaPokemones.get(i).setNombrePokemon(nombre);
               listaPokemones.get(i).setDescripcionPokemon(descripcion);
               listaPokemones.get(i).setPesoPokemon(peso);
               listaPokemones.get(i).setAlturaPokemon(altura);
               listaPokemones.get(i).setGenero(genero);
               listaPokemones.get(i).setNumeroPokemon(numero);
               listaPokemones.get(i).setDebilidad(debilidad);
               listaPokemones.get(i).setFortaleza(fortaleza);
               listaPokemones.get(i).setNivelPokemon(nivel);
            }
            
        }   
        
    }//GEN-LAST:event_registrarDatosEdicion
    private void deshabilitarTxt(){
        this.cNombreEditar.setEnabled(false);
        this.txtDescripcionEditar.setEnabled(false);
        this.txtPesoEditar.setEnabled(false);
        this.txtAlturaEditar.setEnabled(false);
        this.cGeneroEditar.setEnabled(false);
        this.txtNumeroEditar.setEnabled(false);
        this.cDebilidadEditar.setEnabled(false);
        this.cFortalezaEditar.setEnabled(false);
        this.txtNivelEditar.setEnabled(false);
    }
    private void habilitarTxt(){
        this.cNombreEditar.setEnabled(true);
        this.txtDescripcionEditar.setEnabled(true);
        this.txtPesoEditar.setEnabled(true);
        this.txtAlturaEditar.setEnabled(true);
        this.cGeneroEditar.setEnabled(true);
        this.txtNumeroEditar.setEnabled(true);
        this.cDebilidadEditar.setEnabled(true);
        this.cFortalezaEditar.setEnabled(true);
        this.txtNivelEditar.setEnabled(true);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPoemon;
    private javax.swing.JComboBox<String> cDebilidadEditar;
    private javax.swing.JComboBox<String> cFortalezaEditar;
    private javax.swing.JComboBox<String> cGeneroEditar;
    private javax.swing.JComboBox<String> cNombreEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAlturaEditar;
    private javax.swing.JLabel lblDebilidadEditar;
    private javax.swing.JLabel lblDescripcionEditar;
    private javax.swing.JLabel lblFortalezaEditar;
    private javax.swing.JLabel lblGeneroEditar;
    private javax.swing.JLabel lblInfoPokemon;
    private javax.swing.JLabel lblNivelEditar;
    private javax.swing.JLabel lblNombreEditar;
    private javax.swing.JLabel lblNumeroAbuscar;
    private javax.swing.JLabel lblNumeroEditar;
    private javax.swing.JLabel lblPesoEditar;
    private javax.swing.JLabel lblTituloPanel;
    private javax.swing.JTextField txtAlturaEditar;
    private javax.swing.JTextField txtDescripcionEditar;
    private javax.swing.JTextField txtNivelEditar;
    private javax.swing.JTextField txtNumeroEditar;
    private javax.swing.JTextField txtPesoEditar;
    private javax.swing.JTextField txtPokemonEditar;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pokemon>listaPokemones;

    private static class PokemonImpl extends Pokemon {

        public PokemonImpl(String string) {
            super();
        }
    }
}
