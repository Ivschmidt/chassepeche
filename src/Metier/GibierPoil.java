/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

/**
 *Cette classe hérite de gibier et à pour particularité l'attribut bois qui est un boolean.
 * @author ivan et Anthony
 */
public class GibierPoil extends Gibier{

    /**
     * cet attribut permet de savoir si le gibier à des bois ou non.
     */
    private final BooleanProperty bois = new SimpleBooleanProperty();
    public boolean isBois() { return bois.get(); }
    private void setBois(boolean value) { bois.set(value); }
    public BooleanProperty boisProperty() { return bois; }

    /**
     * 
     * @param nomC nom commun
     * @param nomS nom scientifique
     * @param descriptif descriptif de l'animal
     * @param photo chemin de la photo
     * @param famille famille de l'animal
     * @param poids poids moyen de l'animal
     * @param bois true : l'animal à des bois, false : l'animal n'a pas de bois
     */
    public GibierPoil(String nomC, String nomS, String descriptif, String photo, String famille, float poids,boolean bois) {
        super(nomC, nomS, descriptif, photo, famille, poids);
        this.setBois(bois);
    }
    
    
    
}
