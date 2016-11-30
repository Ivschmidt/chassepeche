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
public abstract class Animal {

    private final StringProperty nomCommun = new SimpleStringProperty();
    public String getNomCommun() { return nomCommun.get(); }
    public void setNomCommun(String value) { nomCommun.set(value); }
    public StringProperty nomCommunProperty() { return nomCommun; }
    
    private final StringProperty nomScientifique = new SimpleStringProperty();
    public String getNomScientifique() { return nomScientifique.get(); }
    public void setNomScientifique(String value) { nomScientifique.set(value); }
    public StringProperty nomScientifiqueProperty() { return nomScientifique; }    
    
    private final StringProperty famille = new SimpleStringProperty();
    public String getFamille() { return famille.get(); }
    public void setFamille(String value) { famille.set(value); }
    public StringProperty familleProperty() { return famille; }
   
    private final StringProperty descriptif = new SimpleStringProperty();
    public String getDescriptif() { return descriptif.get(); }
    public void setDescriptif(String value) { descriptif.set(value); }
    public StringProperty descriptifProperty() { return descriptif; }
    
    private final StringProperty cheminPhoto = new SimpleStringProperty();
    public String getCheminPhoto() { return cheminPhoto.get(); }
    public void setCheminPhoto(String value) { cheminPhoto.set(value); }
    public StringProperty cheminPhotoProperty() { return cheminPhoto;}
  
    
}