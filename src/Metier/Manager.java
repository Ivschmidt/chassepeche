/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ivans
 */
public class Manager {

   private final ListProperty<Gibier> listAnimaux = new SimpleListProperty<>(
        FXCollections.observableArrayList());
    public ObservableList getListAnimaux() { return listAnimaux.get(); }
    private void setListAnimaux(ObservableList value) { listAnimaux.set(value); }
    public ListProperty listZoneAnimauxy() { return listAnimaux; }

   private final ListProperty<Zone> listZone = new SimpleListProperty<>(
            FXCollections.observableArrayList());
   public ObservableList<Zone> getListZone() { return listZone.get(); }
   private void setListZone(ObservableList<Zone> value) { listZone.set(value); }
   public ListProperty<Zone> listZoneProperty() { return listZone; }

   private final IDataManager stub;
   
   
   
    
   /**
    * Co,nstructeur de manager
    * @param stub Su=tub pour la persistance
    */
   public Manager(IDataManager stub){
        this.stub =stub;
   } 
   
   /**
    * Cette méthode permet de charger les zones de chasse 
    */
    public void chargeZoneChasse() {
       this.getListZone().clear();
       this.setListZone(stub.chargeZoneChasse());
    }
    
    /** 
     * cette méthode permet de charger les zones de peche.
     */
    public void chargeZonePeche() {
        this.getListZone().clear();
       this.setListZone(stub.chargeZonePeche());
    }
    
    public void chargeGibier(String nomZone){
        this.getListAnimaux().clear();
        this.setListAnimaux(stub.chargeGibier(nomZone));
    }
    
    /*public void chargePoisson(String nomZone){
        this.getListAnimaux().clear();
        this.setListAnimaux(stub.chargePoisson(nomZone));
    }*/
}
