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

    /**
     * nom de la zone
     */
    private final StringProperty nom = new SimpleStringProperty();
    public String getNom() {return nom.get();}
    private void setNom(String value) {nom.set(value);}
    public StringProperty nomProperty() {return nom;}
    
    /**
     * descriptif de la zone 
     */
    private final StringProperty descriptif = new SimpleStringProperty();
    public String getDescriptif() {return descriptif.get();}
    private void setDescriptif(String value) {descriptif.set(value);}
    public StringProperty descriptifProperty() {return descriptif;}
   
    /**
     * Cet attribut correpond à un des choix de l'énumération typeZone
     */
    private TypeZone type;  
    public TypeZone getType() {return type;}
    private void setType(TypeZone type) {this.type = type;}

    /**
     * 
     * @param nom nom de la zone
     * @param descriptif descriptif de la zone 
     * @param type type de la zone
     */
    public Zone(String nom,String descriptif,TypeZone type) {
        this.setNom(nom);
        this.setDescriptif(descriptif);
        this.setType(type);
    }

    
    @Override
    public String toString() {
        return "nom = " + this.getNom() + ",\n descriptif = " + getDescriptif() + ",\n type = " + this.getType().toString()+"\n";
    }
    
    
}
