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

    private String getNomCommun() {
        return nomCommun.get();
    }

    private void setNomCommun(String value) {
        nomCommun.set(value);
    }

    private StringProperty nomCommunProperty() {
        return nomCommun;
    }
    private final StringProperty nomScientifique = new SimpleStringProperty();

    private String getNomScientifique() {
        return nomScientifique.get();
    }

    private void setNomScientifique(String value) {
        nomScientifique.set(value);
    }

    private StringProperty nomScientifiqueProperty() {
        return nomScientifique;
    }
    private final StringProperty famille = new SimpleStringProperty();

    private String getFamille() {
        return famille.get();
    }

    private void setFamille(String value) {
        famille.set(value);
    }

    private StringProperty familleProperty() {
        return famille;
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
    private final StringProperty cheminPhoto = new SimpleStringProperty();

    public String getCheminPhoto() {
        return cheminPhoto.get();
    }

    public void setCheminPhoto(String value) {
        cheminPhoto.set(value);
    }

    public StringProperty cheminPhotoProperty() {
        return cheminPhoto;
    }
    
}
