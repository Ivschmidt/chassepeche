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
public class Chasse {
    
    private Zone zone;

    /**
     * Get the value of zones
     *
     * @return the value of zone
     */
    public Zone getZone() {
        return zone;
    }

    /**
     * Set the value of zone
     *
     * @param zone new value of zone
     */
    public void setZone(Zone zone) {
        this.zone = zone;
    }
    private float prixPermis;

    /**
     * Get the value of prixPermis
     *
     * @return the value of prixPermis
     */
    public float getPrixPermis() {
        return prixPermis;
    }

    /**
     * Set the value of prixPermis
     *
     * @param prixPermis new value of prixPermis
     */
    public void setPrixPermis(float prixPermis) {
        this.prixPermis = prixPermis;
    }

    private int nombreChasseur;

    /**
     * Get the value of nombreChasseur
     *
     * @return the value of nombreChasseur
     */
    public int getNombreChasseur() {
        return nombreChasseur;
    }

    /**
     * Set the value of nombreChasseur
     *
     * @param nombreChasseur new value of nombreChasseur
     */
    public void setNombreChasseur(int nombreChasseur) {
        this.nombreChasseur = nombreChasseur;
    }
    

}
