/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorobserver;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Sistemas
 */
public class ClaseObserver extends Observable
{
    private Color color;
    private List<Color> colores;
    
    public ClaseObserver()
    {
        colores = new ArrayList<Color>();
        colores.add(Color.yellow);
        colores.add(Color.blue);
        colores.add(Color.white);
        colores.add(Color.black);
        colores.add(Color.red);
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
        setChanged();
        notifyObservers();
    }

    /**
     * @return the colores
     */
    public List<Color> getColores() {
        return colores;
    }

    /**
     * @param colores the colores to set
     */
    public void setColores(List<Color> colores) {
        this.colores = colores;
    }
    public void setColor(int index)
    {
        this.color = colores.get(index);
        setChanged();
        notifyObservers();
    }

}  
