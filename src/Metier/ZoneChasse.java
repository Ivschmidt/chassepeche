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
public class ZoneChasse implements IChasse{

        
    private final FloatProperty prixPermis = new SimpleFloatProperty();
    public float getPrixPermis() { return prixPermis.get(); }
    public void setPrixPermis(float value) { prixPermis.set(value); }
    public FloatProperty prixPermisProperty() { return prixPermis; }
       
    private final IntegerProperty nombreChasseur = new SimpleIntegerProperty();
    public int getNombreChasseur() { return nombreChasseur.get(); }
    public void setNombreChasseur(int value) { nombreChasseur.set(value); }
    public IntegerProperty nombreChasseurProperty() { return nombreChasseur; }

    private final ListProperty<TypeChasse> typeChasseAutorise = new SimpleListProperty<>();
    public ObservableList getTypeChasseAutorise() { return typeChasseAutorise.get(); }
    public void setTypeChasseAutorise(ObservableList value) { typeChasseAutorise.set(value); }
    public ListProperty typeChasseAutoriseProperty() { return typeChasseAutorise; }
  
    private final ObjectProperty<Zone> zone = new SimpleObjectProperty<>();
    public Zone getZone() { return zone.get(); }
    public void setZone(Zone value) { zone.set(value); }
    public ObjectProperty zoneProperty() {return zone; }
    
    
}
