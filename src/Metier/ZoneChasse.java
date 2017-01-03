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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ivan et Anthony
 * Cette classe hérite de la classe Zone. Elle correspond au zone de chasse
 */
public class ZoneChasse extends Zone implements IZoneChasse{

   
    /**
     * liste des types de chasse autorisés dans la zone
     */
    private final ListProperty<TypeChasse> typeChasseAutorise = new SimpleListProperty<>(
                                        FXCollections.observableArrayList());
    public ObservableList<TypeChasse> getTypeChasseAutorise() { return typeChasseAutorise.get(); }
    private void setTypeChasseAutorise(ObservableList<TypeChasse> value) { typeChasseAutorise.set(value); }
    public ListProperty<TypeChasse> typeChasseAutoriseProperty() { return typeChasseAutorise; }
    
    /**
     * liste des gibiers de la zone
     */
    private final ListProperty<Gibier> gibier = new SimpleListProperty<>(
                                        FXCollections.observableArrayList());
    public ObservableList<Gibier> getGibier() { return gibier.get(); }
    private void setGibier(ObservableList<Gibier> value) { gibier.set(value); }
    public ListProperty<Gibier> gibierProperty() { return gibier; }
    
    
    /**
     * 
     * @param nom noom de la zone
     * @param descriptif descriptif de la zone 
     * @param type type de la zone
     * @param prix prix du permis pour cette zone
     * @param nbChasseur nombre de chasseur de la zone
     */
    public ZoneChasse(String nom, String descriptif, TypeZone type,float prix,int nbChasseur) {
        super(nom, descriptif, type,prix,nbChasseur);        
    }
    /**
     * permet d'ajouter un type de chasse à la zone
     * @param type type à ajouter
     */
    public void ajouterTypeChasse(TypeChasse type){
        this.getTypeChasseAutorise().add(type);
    }
    
    public void ajouterGibier(Gibier g){
        this.getGibier().add(g);
    }

    @Override
    public String toString() {
        String mess = "";
        for(int i =0;i<typeChasseAutorise.getSize();i++){
            mess = mess + typeChasseAutorise.get(i).toString()+", ";
        }
        String gib = "";
        for(int i =0;i<gibier.getSize();i++){
            gib = gib + gibier.get(i).getNomCommun()+", ";
        }
        
        return super.toString() + ",\n type Chasse Autorise = " + mess + "\n Liste gibier : "+gib+"\n";

    }
    
       
    
}
