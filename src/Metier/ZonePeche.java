/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

/**
 *
 * @author ivans
 */
public class ZonePeche implements IPeche{

    private final ListProperty<TypePeche> typePecheAutorise = new SimpleListProperty<>();
    public ObservableList getTypePecheAutorise() { return typePecheAutorise.get(); }
    public void setTypePecheAutorise(ObservableList value) { typePecheAutorise.set(value); }
    public ListProperty typePecheAutoriseProperty() { return typePecheAutorise; }
      
    private final FloatProperty prixPermis = new SimpleFloatProperty();
    public float getPrixPermis() { return prixPermis.get(); }
    public void setPrixPermis(float value) { prixPermis.set(value); }
    public FloatProperty prixPermisProperty() { return prixPermis; }
  
    private final IntegerProperty nombrePecheur = new SimpleIntegerProperty();
    public int getNombrePecheur() { return nombrePecheur.get(); }
    public void setNombrePecheur(int value) { nombrePecheur.set(value); }
    public IntegerProperty nombrePecheurProperty() { return nombrePecheur; }
    
    
}
