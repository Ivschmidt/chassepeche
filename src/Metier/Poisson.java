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
 * Cette classe hérite de la classe animal et coorespond au poisson.
 */
public class Poisson extends Animal implements IPoisson{

    /**
     * correspond à la taille moyenne du poisson
     */
    private final FloatProperty tailleMoyenne = new SimpleFloatProperty();
    public float getTailleMoyenne() {return tailleMoyenne.get();}
    private void setTailleMoyenne(float value) {tailleMoyenne.set(value);}
    public FloatProperty tailleMoyenneProperty() {return tailleMoyenne;}

    /**
     * ce constructeur appelle le constructeur de la classe animal
     * @param nomC nom commun
     * @param nomS nom scientifique
     * @param descriptif descriptif de l'animal
     * @param photo chemin de la photo de l'animal
     * @param famille famille de l'animal
     * @param taille taille moyenne du poisson
     */
    public Poisson(String nomC, String nomS, String descriptif, String photo, String famille,float taille) {
        super(nomC, nomS, descriptif, photo, famille);
        this.setTailleMoyenne(taille);
    }
    
    
    
    
    
    
}
