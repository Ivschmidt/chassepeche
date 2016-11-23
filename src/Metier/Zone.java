/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ivan
 */
public class Zone {

    private final StringProperty nom = new SimpleStringProperty();

    private String getNom() {
        return nom.get();
    }

    private void setNom(String value) {
        nom.set(value);
    }

    private StringProperty nomProperty() {
        return nom;
    }
    private final StringProperty descriptif = new SimpleStringProperty();

    private String getDescriptif() {
        return descriptif.get();
    }

    private void setDescriptif(String value) {
        descriptif.set(value);
    }

    private StringProperty descriptifProperty() {
        return descriptif;
    }
   
    private TypeZone type;

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public TypeZone getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(TypeZone type) {
        this.type = type;
    }
 
}
