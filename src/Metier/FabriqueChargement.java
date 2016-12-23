/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.collections.ObservableList;

/**
 *cette classe permet de choisir le chargement des listes de gibier (par exemple) selon la zone voulue
 * @author antho
 */
public class FabriqueChargement {
    
    /**
     * Cette méthode indique qu'elle méthode du stub il faut utiliser
     * @param zone string correspondant au nom de la zone
     * @param stub stubdatamanager passé en parametre pour permettre le chargement
     * @return retourne la liste correspondante
     */
    public static ObservableList<Gibier> chargeGibier(String zone,IDataManager stub){
        switch(zone){
            case "Auvergne" : return stub.chargeGibierAuvergne();
            case "Afrique" : return stub.chargeGibierAfrique();
        }
        return null;
    }
    
}
