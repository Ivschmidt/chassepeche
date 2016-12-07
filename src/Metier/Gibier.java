/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;


/**
 *
 * @author ivan et Anthony
 * Cette classe hérite de la classe animal et coorespond au gibier.
 */
public class Gibier extends Animal implements IGibier{

    /**
     * poids moyen du gibier
     */
    private final FloatProperty poidsMoyen = new SimpleFloatProperty();
    public float getPoidsMoyen() {return poidsMoyen.get();}
    private void setPoidsMoyen(float value) {poidsMoyen.set(value);}
    public FloatProperty poidsMoyenProperty() {return poidsMoyen;}

    /**
     * ce constructeur appelle le constructeur de la classe animal
     * @param nomC nom commun
     * @param nomS nom scientifique
     * @param descriptif descriptif de l'animal
     * @param photo chemin de la photo de l'animal
     * @param famille famille de l'animal
     * @param poids  poids moyen du gibier.
     */
    public Gibier(String nomC, String nomS, String descriptif, String photo, String famille,float poids) {
        super(nomC, nomS, descriptif, photo, famille);
        this.setPoidsMoyen(poids);
    }

   
    

  
    
    
    

}
