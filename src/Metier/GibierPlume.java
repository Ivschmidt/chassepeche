/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

/**
 *Cette classe hérite de gibier et à pour particularité l'attribut vol qui est un boolean.
 * @author ivan et Anthony
 */
public class GibierPlume extends Gibier{

    /**
     * cet attribut  permet de savoir si le gibier vol ou non.
     */
    private final BooleanProperty vol = new SimpleBooleanProperty();
    public boolean isVol() {return vol.get();}
    private void setVol(boolean value) {vol.set(value);}
    public BooleanProperty volProperty() {return vol;}

    /**
     * 
     * @param nomC nom commun
     * @param nomS nom scientifique
     * @param descriptif descriptif de l'animal
     * @param photo chemin de la photo
     * @param famille famille de l'animal
     * @param poids poids moyen de l'animal
     * @param vol true : l'animal vole, false : l'animal ne vole pas 
     */
    public GibierPlume(String nomC, String nomS, String descriptif, String photo, String famille, float poids,boolean vol) {
        super(nomC, nomS, descriptif, photo, famille, poids);
        this.setVol(vol);
    }
    
    
    
}
