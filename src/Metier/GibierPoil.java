/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

/**
 *
 * @author ivan
 */
public class GibierPoil extends Gibier{

    private final BooleanProperty bois = new SimpleBooleanProperty();
    public boolean isBois() { return bois.get(); }
    public void setBois(boolean value) { bois.set(value); }
    public BooleanProperty boisProperty() { return bois; }
    
}
