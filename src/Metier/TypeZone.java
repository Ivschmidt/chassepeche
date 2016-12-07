/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *Cette énumération correspond au type de zone que l'on choisit
 * @author ivan
 */
public enum TypeZone {
    Continent,
    Region,
    Pays;
    
    /**
     * 
     * @return un string correpondant au type de zone choisit
     */
 @Override
  public String toString() {
    switch(this) {
      case Continent: return "Continent";
      case Region: return "Région";
      case Pays: return "Pays";

      default: throw new IllegalArgumentException();
    }
  }
}
