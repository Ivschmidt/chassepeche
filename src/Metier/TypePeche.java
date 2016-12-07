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
public enum TypePeche {
    Lancer,
    Bouchon,
    Mouche,
    Toc,
    Nokill;

    @Override
    public String toString() {
        switch(this){
            case Lancer : return "lancer";
            case Bouchon : return "bouchon";
            case Mouche : return "mouche";
            case Toc : return "toc";
            case Nokill : return "nokill";
                       
            default: throw new IllegalArgumentException();
        }
       }
    
    
    
}
