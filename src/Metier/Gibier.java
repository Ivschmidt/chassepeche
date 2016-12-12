/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;




/**
 *
 * @author ivan et Anthony
 * Cette classe hérite de la classe animal et coorespond au gibier.
 */
public class Gibier extends Animal implements IGibier{

   
    /**
     * poids moyen du gibier
     */
    private final DoubleProperty poidsMoyen = new SimpleDoubleProperty();
    public double getPoidsMoyen() {return poidsMoyen.get();}
    private void setPoidsMoyen(double value) {poidsMoyen.set(value);}
    public DoubleProperty poidsMoyenProperty() {return poidsMoyen;}

  
    /**
     * ce constructeur appelle le constructeur de la classe animal
     * @param nomC nom commun
     * @param nomS nom scientifique
     * @param descriptif descriptif de l'animal
     * @param photo chemin de la photo de l'animal
     * @param famille famille de l'animal
     * @param poids  poids moyen du gibier.
     */
    public Gibier(String nomC, String nomS, String descriptif, String photo, String famille,Double poids) {
        super(nomC, nomS, descriptif, photo, famille);
        this.setPoidsMoyen(poids);
    }

    @Override
    public String toString() {
        return super.toString()+"poids moyen = " + this.getPoidsMoyen()+", \n";
    }

 
    
   
    

  
    
    
    

}
