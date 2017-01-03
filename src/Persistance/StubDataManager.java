/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Metier.*;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *Stockage des données.
 * @author antho
 */

public class StubDataManager implements IDataManager{
    
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

 
    @Override
    public ObservableList<ZoneChasse> chargeZoneChasse() {
        this.getListZoneChasse().add(new ZoneChasse("Amerik", "Loin des mexicains", TypeZone.Pays, 130, 100000));
        this.getListZoneChasse().add(new ZoneChasse("Auvergne", "Région Française très rurale", TypeZone.Region,100,10000));
        return getListZoneChasse();
    }
    @Override
     public ObservableList<ZonePeche> chargeZonePeche() {
        this.getListZonePeche().add(new ZonePeche("France", "pays ou la pêche est beaucoup pratiqué", TypeZone.Pays, 55, 50000));
        return getListZonePeche();
    }

    @Override
    public ObservableList<Gibier> chargeGibierAuvergne() {
        this.getListGibier().add(new GibierPlume("Faisan", "Phasianus", " Tous ces oiseaux sont des gibiers réputés. Leur femelle s'appelle la faisane ou poule faisane.", "/Images/faisan", "Phasianinae",1.2, true));
        this.getListGibier().add(new GibierPoil("Lievre", "Lepus", " Ce sont des petits mammifères sauvages herbivores proches des lapins. Il existe une trentaine d'espèces de lièvres de par le monde qui diffèrent entre elles par leur taille, leur coloris ou leur mode de vie. Les lièvres sont des animaux relativement solitaires vivant parfois en couple.", "/Images/Lievre", "Léporidés",4.3, false));
        return getListGibier();
    }
    
    @Override
    public ObservableList<Gibier> chargeGibierAfrique() {
        this.getListGibier().add(new GibierPoil("licorne", "Licornus", "Aniaml rarement vue", "/Images/Licorne", "licorné", 55.5,false));
        this.getListGibier().add(new GibierPoil("Elephant", "elephantus", "grosse bête qui trompe beaucoup", "/Images/Elephant", "Pachidermes", 3000.0,false));
        return getListGibier();
    }
    
}
