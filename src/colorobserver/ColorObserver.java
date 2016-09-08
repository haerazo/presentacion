/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorobserver;

/**
 *
 * @author Sistemas
 */
public class ColorObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ClaseObserver observador=new ClaseObserver();
        ventanaOpciones miVentanaOpciones=new ventanaOpciones(observador);
        ventanaSeleccion miVentanaSeleccion=new ventanaSeleccion(observador);
        ventanaColor miVentanaColor=new ventanaColor(observador);
        
        miVentanaColor.setVisible(true);
        miVentanaOpciones.setVisible(true);
        miVentanaSeleccion.setVisible(true);
        
        observador.addObserver(miVentanaColor);
        observador.addObserver(miVentanaOpciones);
        observador.addObserver(miVentanaSeleccion);
    }
    
    
}
