/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import Metier.Manager;
import Metier.Zone;
import Persistance.StubDataManager;
import java.io.IOException;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author ivans
 */
public class ControlUCZone extends BorderPane{
    
    @FXML
    private ListView<Zone> listeDeZone;
    private final ObjectProperty<Manager> manager = new SimpleObjectProperty<>();

    public Manager getManager() {
        return manager.get();
    }

    public void setManager(Manager value) {
        manager.set(value);
    }

    public ObjectProperty<Manager> managerProperty() {
        return manager;
    }
    
    
    
    
    @FXML AnchorPane archorpane;
    
     public void BoutonAnimal (Event e) {
         ControlUCAnimal animal = new ControlUCAnimal();
         archorpane.getChildren().clear();
         archorpane.getChildren().add(animal);
         setAnchor(animal);
     }
     
    public ControlUCZone(){

       try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/UCZone.fxml"));
                loader.setController(this);
                loader.setRoot(this);
                loader.load();
                
            }catch(IOException e){}  
    }
    
    @FXML
    public void initialize() {
            
    listeDeZone.setCellFactory((param) -> {
        return new ListCell<Zone>(){
            @Override
            protected void updateItem(Zone item, boolean empty) {
                super.updateItem(item, empty);
                    if (! empty) {
                          textProperty().bind(item.nomProperty());
                    } else {
                        textProperty().unbind();
                        setText("");
                    }
                }
            };
        });
        
    }
    
    private void setAnchor(Node u)
    {
        AnchorPane.setBottomAnchor(u, 0.0);
        AnchorPane.setTopAnchor(u, 0.0);
        AnchorPane.setLeftAnchor(u, 0.0);
        AnchorPane.setRightAnchor(u, 0.0);
    }
    
}
