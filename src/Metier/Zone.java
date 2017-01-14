/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
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
    public void setNom(String value) {nom.set(value);}
    public StringProperty nomProperty() {return nom;}
    
       
    /**
     * descriptif de la zone 
     */
    private final StringProperty descriptif = new SimpleStringProperty();
    public String getDescriptif() {return descriptif.get();}
    public void setDescriptif(String value) {descriptif.set(value);}
    public StringProperty descriptifProperty() {return descriptif;}
   
    /**
     * Cet attribut correpond à un des choix de l'énumération typeZone
     */
    
    private final ObjectProperty<TypeZone> type1 = new SimpleObjectProperty<>();
    public TypeZone getType1() { return type1.get(); }
    public void setType1(TypeZone value) { type1.set(value); }
    public ObjectProperty type1Property() { return type1; }
    
      
     /**
     * prix du permis pour la zone
     */
    private final IntegerProperty prixPermis = new SimpleIntegerProperty();
    public int getPrixPermis() { return prixPermis.get(); }
    public void setPrixPermis(int value) { prixPermis.set(value); }
    public IntegerProperty prixPermisProperty() { return prixPermis;}
      
    /**
     * nombre de pratiquant de la zone
     */
    private final IntegerProperty nombrePratiquant = new SimpleIntegerProperty();
    public int getNombrePratiquant() { return nombrePratiquant.get(); }
    public void setNombrePratiquant(int value) { nombrePratiquant.set(value); }
    public IntegerProperty nombrePratiquantProperty() { return nombrePratiquant; }

    public Zone(){}

    /**
     * 
     * @param nom nom de la zone
     * @param descriptif descriptif de la zone 
     * @param type type de la zone
     * @param prix prix du permis
     * @param nbParticipant nombre de participant
     */
    public Zone(String nom,String descriptif,TypeZone type,int prix,int nbParticipant) {
        this.setNom(nom);
        this.setDescriptif(descriptif);
        this.setType1(type);
        this.setPrixPermis(prix);
        this.setNombrePratiquant(nbParticipant);
    }

    
    @Override
    public String toString() {
        return "nom = " + this.getNom() + ",\n descriptif = " + getDescriptif() + ",\n type = " + this.getType1().toString()+",\n prix Permis = " + this.getPrixPermis() + ",\n nombre pratiquant = "+ this.getNombrePratiquant();
    }
    
    
}
