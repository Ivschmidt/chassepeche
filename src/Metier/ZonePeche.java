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
 * Cette classe hérite de la classe Zone. Elle correspond au zone de pêche
 */
public class ZonePeche extends Zone implements IPeche{

    /**
     * Liste des types de pêche autorisés dans la zone
     */
    private final ListProperty<TypePeche> typePecheAutorise = new SimpleListProperty<>(
                                        FXCollections.observableArrayList());
    public ObservableList getTypePecheAutorise() { return typePecheAutorise.get(); }
    private void setTypePecheAutorise(ObservableList value) { typePecheAutorise.set(value); }
    public ListProperty typePecheAutoriseProperty() { return typePecheAutorise; }
    
    /**
     * Liste des poissons de la zone
     */
    private final ListProperty<Poisson> poisson = new SimpleListProperty<>(
                                        FXCollections.observableArrayList());
    public ObservableList<Poisson> getPoisson() { return poisson.get(); }
    private void setPoisson(ObservableList<Poisson> value) { poisson.set(value); }
    public ListProperty<Poisson> poissonProperty() { return poisson; }
    
    /**
     * prix du permis pour la zone 
     */
  

    /**
     * 
     * @param nom nom de la zone 
     * @param descriptif descriptif de la zone 
     * @param type type de la zone 
     * @param prix prix du permsi de pêche
     * @param nbPecheur nombre de pêcheur de la zone 
     */
    public ZonePeche(String nom, String descriptif, TypeZone type,int prix,int nbPecheur) {
        super(nom, descriptif, type,prix,nbPecheur);
    }
    
    /**
     * permet d'ajouter un type de peche à la zone
     * @param type type de peche à ajouter.
     */
    public void ajouterTypePeche(TypePeche type){
        typePecheAutorise.add(type);
    }

    public void ajouterPoisson(Poisson p){
        this.getPoisson().add(p);
    }
    
    
    @Override
    public String toString() {
        String mess = "";
        for(int i =0;i<typePecheAutorise.getSize();i++){
            mess = mess + typePecheAutorise.get(i).toString()+", ";
        }
        String pois = "";
        for(int i =0;i<poisson.getSize();i++){
            pois = pois + poisson.get(i).getNomCommun()+", ";
        }
        return super.toString() +",\n type Peche Autorise = " + mess+ "\n Liste des poissons : "+pois;
    }
    
    
}
