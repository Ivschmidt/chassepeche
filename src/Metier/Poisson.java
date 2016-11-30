/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;

/**
 *
 * @author ivan
 */
public class Poisson extends Animal{

    private final FloatProperty tailleMoyenne = new SimpleFloatProperty();

    public float getTailleMoyenne() {
        return tailleMoyenne.get();
    }

    public void setTailleMoyenne(float value) {
        tailleMoyenne.set(value);
    }

    public FloatProperty tailleMoyenneProperty() {
        return tailleMoyenne;
    }
    
    
}
