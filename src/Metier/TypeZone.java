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
public enum TypeZone {
    Continent,
    Region,
    Pays;
   
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
