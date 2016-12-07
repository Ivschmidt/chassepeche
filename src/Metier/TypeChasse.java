/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author ivan
 */
public enum TypeChasse {
    Affut,
    Battue,
    ChienCourant,
    ChienArret;
    
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
