/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Metier.Animal;
import Metier.Manager;
import java.io.IOException;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ivan
 */
public class ControlUCAnimal extends GridPane{

    
    private ListView<Animal> listAnimaux;
    
    public ControlUCAnimal(ObjectProperty<Manager> m, StringProperty nom){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/UCAnimal.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }catch(IOException e){}
    }
}
