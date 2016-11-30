/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ivan
 */
public class Gibier extends Animal{

    private final StringProperty poidsMoyen = new SimpleStringProperty();
    public String getPoidsMoyen() { return poidsMoyen.get(); }
    public void setPoidsMoyen(String value) { poidsMoyen.set(value); }
    public StringProperty poidsMoyenProperty() { return poidsMoyen; }
    

}
