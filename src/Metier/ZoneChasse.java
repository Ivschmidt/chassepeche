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
public class ZoneChasse extends Zone implements IChasse{

    /**
     * prix du permis pour la zone
     */
    private final FloatProperty prixPermis = new SimpleFloatProperty();
    public float getPrixPermis() { return prixPermis.get(); }
    private void setPrixPermis(float value) { prixPermis.set(value); }
    public FloatProperty prixPermisProperty() { return prixPermis; }
    
    /**
     * nombre de chasseur de la zone
     */
    private final IntegerProperty nombreChasseur = new SimpleIntegerProperty();
    public int getNombreChasseur() { return nombreChasseur.get(); }
    private void setNombreChasseur(int value) { nombreChasseur.set(value); }
    public IntegerProperty nombreChasseurProperty() { return nombreChasseur; }

    /**
     * liste des types de chasse autorisés dans la zone
     */
    private final ListProperty<TypeChasse> typeChasseAutorise = new SimpleListProperty<>(
                                        FXCollections.observableArrayList());
    public ObservableList<TypeChasse> getTypeChasseAutorise() { return typeChasseAutorise.get(); }
    private void setTypeChasseAutorise(ObservableList<TypeChasse> value) { typeChasseAutorise.set(value); }
    public ListProperty<TypeChasse> typeChasseAutoriseProperty() { return typeChasseAutorise; }
    
    
    
    /**
     * 
     * @param nom noom de la zone
     * @param descriptif descriptif de la zone 
     * @param type type de la zone
     * @param prix prix du permis pour cette zone
     * @param nbChasseur nombre de chasseur de la zone
     * @param list liste des types de chasses possibles dans la zone
     */
    public ZoneChasse(String nom, String descriptif, TypeZone type,float prix,int nbChasseur) {
        super(nom, descriptif, type);
        this.setPrixPermis(prix);
        this.setNombreChasseur(nbChasseur);
        //this.setTypeChasseAutorise();
    }
    /**
     * permet d'ajouter un type de chasse à la zone
     * @param type type à ajouter
     */
    public void ajouterTypeChasse(TypeChasse type){
        this.getTypeChasseAutorise().add(type);
    }

    @Override
    public String toString() {
        String mess = "";
        for(int i =1;i<typeChasseAutorise.getSize();i++){
            mess = mess + typeChasseAutorise.get(i).toString()+"\n";
        }
        return super.toString() +"prix Permis = " + this.getPrixPermis() + ",\n nombre Chasseur = " + this.getNombreChasseur() + ",\n type Chasse Autorise = " + mess;
    }
    
       
    
}
