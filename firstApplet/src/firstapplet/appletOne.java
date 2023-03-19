/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapplet;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author migue
 */
public class appletOne extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Label ldato;
    TextField tdato;
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        ldato = new Label("Escribe tu nombre");
        tdato = new TextField("Nombre Completo");
        add(ldato);
        add (tdato);
        
    }
    @Override
    public void paint (Graphics g){
        g.drawRect(10,50,50,100);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
