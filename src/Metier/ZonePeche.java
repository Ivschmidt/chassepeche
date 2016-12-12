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
 * @author ivan et Anthony
 * Cette classe hérite de la classe Zone. Elle correspond au zone de pêche
 */
public class ZonePeche extends Zone implements IPeche{

    /**
     * Liste des types de pêche autorisés dans la zone
     */
    private final ListProperty<TypePeche> typePecheAutorise = new SimpleListProperty<>();
    public ObservableList getTypePecheAutorise() { return typePecheAutorise.get(); }
    private void setTypePecheAutorise(ObservableList value) { typePecheAutorise.set(value); }
    public ListProperty typePecheAutoriseProperty() { return typePecheAutorise; }
    
    /**
     * prix du permis pour la zone 
     */
    private final FloatProperty prixPermis = new SimpleFloatProperty();
    public float getPrixPermis() { return prixPermis.get(); }
    private void setPrixPermis(float value) { prixPermis.set(value); }
    public FloatProperty prixPermisProperty() { return prixPermis; }
  
    /**
     * nombre de pêcheur de la zone
     */
    private final IntegerProperty nombrePecheur = new SimpleIntegerProperty();
    public int getNombrePecheur() { return nombrePecheur.get(); }
    private void setNombrePecheur(int value) { nombrePecheur.set(value); }
    public IntegerProperty nombrePecheurProperty() { return nombrePecheur; }

    /**
     * 
     * @param nom nom de la zone 
     * @param descriptif descriptif de la zone 
     * @param type type de la zone 
     * @param prix prix du permsi de pêche
     * @param nbPecheur nombre de pêcheur de la zone 
     * @param liste  liste des types de pêche possible dans la zone.
     */
    public ZonePeche(String nom, String descriptif, TypeZone type,float prix,int nbPecheur,ObservableList<TypePeche> liste) {
        super(nom, descriptif, type);
        this.setPrixPermis(prix);
        this.setNombrePecheur(nbPecheur);
        this.setTypePecheAutorise(liste);        
    }
    
    /**
     * permet d'ajouter un type de peche à la zone
     * @param type type de peche à ajouter.
     */
    public void ajouterTypePeche(TypePeche type){
        typePecheAutorise.add(type);
    }

    @Override
    public String toString() {
        String mess = "";
        for(int i =1;i<typePecheAutorise.getSize();i++){
            mess = mess + typePecheAutorise.get(i).toString()+"\n";
        }
        return super.toString() +"prix Permis = " + this.getPrixPermis() + ",\n nombre pecheur = " + this.getNombrePecheur() + ",\n type Peche Autorise = " + mess;
    }
    
    
}
