/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ivans
 */
public class Manager {

    private final ListProperty<ZoneChasse> listZoneChasse = new SimpleListProperty<>(
            FXCollections.observableArrayList());
     public ObservableList getListZoneChasse() { return listZoneChasse.get(); }
     private void setListZoneChasse(ObservableList value) { listZoneChasse.set(value); }
     public ListProperty listZoneChasseProperty() { return listZoneChasse; }
   
    private final ListProperty<ZonePeche> listZonePeche = new SimpleListProperty<>();
     public ObservableList getListZonePeche() { return listZonePeche.get(); }
     private void setListZonePeche(ObservableList value) { listZonePeche.set(value); }
     public ListProperty listZonePecheProperty() { return listZonePeche; }

    
   public Manager(){
       this.getListZoneChasse().add(new ZoneChasse("Amerik", "Loin des mexicains", TypeZone.Pays, 130, 100000));
   } 
   
   public void chargeZoneChasse(){
       
   }
}
