/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
     
     @FXML
     public void BoutonAccueil(Event e){
        ControlUCAccueil u = new ControlUCAccueil();
        archorpane.getChildren().clear();
        archorpane.getChildren().add(u);
     }
     
     public void BoutonAnimal (Event e) {
         ControlUCAnimal animal = new ControlUCAnimal();
         archorpane.getChildren().clear();
         archorpane.getChildren().add(animal);
     }
     
     public void BoutonZone (Event e) {
         ControlUCZone zone = new ControlUCZone();
         archorpane.getChildren().clear();
         archorpane.getChildren().add(zone);
     }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ControlUCAccueil u = new ControlUCAccueil();
        archorpane.getChildren().add(u);
    }    
    
}
