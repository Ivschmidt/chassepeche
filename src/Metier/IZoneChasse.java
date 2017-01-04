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
 * @author ivans
 */
public interface IZoneChasse extends IZone{
    
    public ObservableList<TypeChasse> getTypeChasseAutorise();
    public void setTypeChasseAutorise(ObservableList<TypeChasse> value);
    public ListProperty<TypeChasse> typeChasseAutoriseProperty();
    
    /**
     * liste des gibiers de la zone
     */
    
    public ObservableList<Gibier> getGibier();
    public void setGibier(ObservableList<Gibier> value);
    public ListProperty<Gibier> gibierProperty() ;
    
}
