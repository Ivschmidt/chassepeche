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

    /**
     * nom commun de l'animal
     */
    private final StringProperty nomCommun = new SimpleStringProperty();
    public String getNomCommun() { return nomCommun.get(); }
    private void setNomCommun(String value) { nomCommun.set(value); }
    public StringProperty nomCommunProperty() { return nomCommun; }
    
    /**
     * nom scientique de l'animal
     */
    private final StringProperty nomScientifique = new SimpleStringProperty();
    public String getNomScientifique() { return nomScientifique.get(); }
    private void setNomScientifique(String value) { nomScientifique.set(value); }
    public StringProperty nomScientifiqueProperty() { return nomScientifique; }    
    
    /** 
     * famille  de l'animal
     */
    private final StringProperty famille = new SimpleStringProperty();
    public String getFamille() { return famille.get(); }
    private void setFamille(String value) { famille.set(value); }
    public StringProperty familleProperty() { return famille; }
   
    /**
     * descriptif de l'animal
     */
    private final StringProperty descriptif = new SimpleStringProperty();
    public String getDescriptif() { return descriptif.get(); }
    private void setDescriptif(String value) { descriptif.set(value); }
    public StringProperty descriptifProperty() { return descriptif; }
    
    /** 
     * chemin de la photo de l'animal
     */
    private final StringProperty cheminPhoto = new SimpleStringProperty();
    public String getCheminPhoto() { return cheminPhoto.get(); }
    private void setCheminPhoto(String value) { cheminPhoto.set(value); }
    public StringProperty cheminPhotoProperty() { return cheminPhoto;}

    /**
     * 
     * @param nomC nom Commun
     * @param nomS nom scientifique
     * @param descriptif descriptif de l'animal
     * @param photo chemin de la photo de l'animal
     * @param famille  famille de l'animal
     */
    public Animal(String nomC, String nomS,String descriptif,String photo,String famille) {
        this.setNomCommun(nomC);
        this.setNomScientifique(nomS);
        this.setDescriptif(descriptif);
        this.setCheminPhoto(photo);
        this.setFamille(famille);
    }

    @Override
    public String toString() {
        return "nom commun= " + this.getNomCommun() + ",\n nom scientifique= " + this.getNomScientifique() + ",\n famille = " + this.getFamille() + ",\n descriptif = " + this.getDescriptif() + ",\n chemin photo=" + this.getCheminPhoto()+",\n";
    }

   
    
    

    
  
    
}