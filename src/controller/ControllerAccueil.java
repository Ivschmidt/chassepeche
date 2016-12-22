/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Metier.Manager;
import Metier.Zone;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import vue.ControlUCAccueil;
import vue.ControlUCAnimal;
import vue.ControlUCZone;


/**
 *
 * @author anbrousse1
 */
public class ControllerAccueil implements Initializable {
    
    
    @FXML AnchorPane archorpane;
    
    private final ObjectProperty<Manager> manager = new SimpleObjectProperty<>();
    public Manager getManager() { return manager.get(); }
    public void setManager(Manager value) { manager.set(value); }
    public ObjectProperty managerProperty() { return manager; }
    
    @FXML
     public void BoutonAccueil(Event e){
        ControlUCAccueil u = new ControlUCAccueil();
        archorpane.getChildren().clear();
        archorpane.getChildren().add(u);
        setAnchor(u);
        
     }
     
     public void BoutonAnimal (Event e) {
         ControlUCAnimal animal = new ControlUCAnimal();
         archorpane.getChildren().clear();
         archorpane.getChildren().add(animal);
         setAnchor(animal);
     }
     
     public void BoutonChasse (Event e) {
         ControlUCZone zone = new ControlUCZone(1,manager);
         archorpane.getChildren().clear();
         archorpane.getChildren().add(zone);
         setAnchor(zone);

     }
     
       public void BoutonPeche (Event e) {
         ControlUCZone zone = new ControlUCZone(0,manager);
         archorpane.getChildren().clear();
         archorpane.getChildren().add(zone);
         setAnchor(zone);

     }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ControlUCAccueil u = new ControlUCAccueil();
        archorpane.getChildren().add(u);
        setAnchor(u);
        
    }    
    
    private void setAnchor(Node u)
    {
        AnchorPane.setBottomAnchor(u, 0.0);
        AnchorPane.setTopAnchor(u, 0.0);
        AnchorPane.setLeftAnchor(u, 0.0);
        AnchorPane.setRightAnchor(u, 0.0);
    }
    
}
