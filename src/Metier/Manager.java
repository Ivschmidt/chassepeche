/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import Persistance.StubDataManager;
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
   
   private final ListProperty<ZonePeche> listZonePeche = new SimpleListProperty<>(
            FXCollections.observableArrayList());
   public ObservableList getListZonePeche() { return listZonePeche.get(); }
   private void setListZonePeche(ObservableList value) { listZonePeche.set(value); }
   public ListProperty listZonePecheProperty() { return listZonePeche; }
     
    private final ListProperty<Gibier> listGibier = new SimpleListProperty<>(
        FXCollections.observableArrayList());
    public ObservableList getListGibier() { return listGibier.get(); }
    private void setListGibier(ObservableList value) { listGibier.set(value); }
    public ListProperty listZoneGibiery() { return listGibier; }

   
   private IDataManager stub;
    
   public Manager(){
        this.stub = new StubDataManager();
   } 
   
   /**
    * Cette méthode permet de charger les zones de chasse 
    */
    public void chargeZoneChasse() {
       this.setListZoneChasse(stub.chargeZoneChasse());
    }
    
    /** 
     * cette méthode permet de charger les zones de peche.
     */
    public void chargeZonePeche() {
       this.setListZonePeche(stub.chargeZonePeche());
    }
    
    public void chargeGibier(String nomZone){
        this.setListGibier(FabriqueChargement.chargeGibier(nomZone,stub));
    }
}
