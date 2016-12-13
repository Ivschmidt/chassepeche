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
     
     @FXML ListView lalist;
     
     
     
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
     
     public void BoutonZone (Event e) {
         ControlUCZone zone = new ControlUCZone();
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
