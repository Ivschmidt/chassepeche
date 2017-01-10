/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.ListProperty;
import javafx.collections.ObservableList;

/**
 *
 * @author antho
 */
public interface IDataManager{
ObservableList<Zone> chargeZoneChasse(); 
ObservableList<Zone> chargeZonePeche();
ObservableList<Gibier> chargeGibier(String nom);

}
