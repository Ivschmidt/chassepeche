/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *Cette énumération correspond aux différents types de chasse possible.
 * @author ivan et Anthony
 */
public enum TypeChasse {
    Affut,
    Battue,
    ChienCourant,
    ChienArret;
    
    /**
     * 
     * @return un string correpondant au type de chasse choisit
     */
    @Override
    public String toString(){
        switch(this){
            case Affut : return "affut";
            case Battue : return "battue";
            case ChienCourant : return "chien courant";
            case ChienArret : return "chien d'arrêt";
                       
            default: throw new IllegalArgumentException();
        }
    }
}
