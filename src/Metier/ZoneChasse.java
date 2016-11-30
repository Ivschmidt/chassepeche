/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ObservableList;

/**
 *
 * @author ivans
 */
public class ZoneChasse {
     private Zone zone;
    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }
    private final FloatProperty prixPermis = new SimpleFloatProperty();

    private float getPrixPermis() { return prixPermis.get(); }
    private void setPrixPermis(float value) { prixPermis.set(value); }
    private FloatProperty prixPermisProperty() { return prixPermis; }
       
    private final IntegerProperty nombreChasseur = new SimpleIntegerProperty();
    private int getNombreChasseur() { return nombreChasseur.get(); }
    private void setNombreChasseur(int value) { nombreChasseur.set(value); }
    private IntegerProperty nombreChasseurProperty() { return nombreChasseur; }

    private final ListProperty<TypeChasse> typeChasseAutorise = new SimpleListProperty<>();
    private ObservableList getTypeChasseAutorise() { return typeChasseAutorise.get(); }
    private void setTypeChasseAutorise(ObservableList value) { typeChasseAutorise.set(value); }
    private ListProperty typeChasseAutoriseProperty() { return typeChasseAutorise; }
    

}
