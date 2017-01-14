/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Metier.Manager;
import Metier.Zone;
import Persistance.StubDataManager;
import java.io.IOException;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author ivans
 */
public class ControlUCZone extends BorderPane{
    
    @FXML
    private ListView<Zone> listeDeZone;
    
    @FXML
    AnchorPane archorpane;
    
    @FXML
    Label nomZone;
    
    @FXML
    Label descriptif;
    
    @FXML
    Label nbpratiquants;
    
    @FXML
    Label typeprat;
    
    @FXML
    Label prixperm;
    
    private final ObjectProperty<Manager> manager = new SimpleObjectProperty<>();
    public Manager getManager() { return manager.get(); }
    public void setManager(Manager value) { manager.set(value); }
    public ObjectProperty<Manager> managerProperty() { return manager; }
    
    ControllerAccueil acc;
    
    
     
    public ControlUCZone(Manager m, ControllerAccueil acc){
       this.setManager(m);
       this.acc=acc;
       
       
       try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/UCZone.fxml"));
                loader.setController(this);
                loader.setRoot(this);
                loader.load();
                
            }catch(IOException e){}  
    }
    
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
        
    
     listeDeZone.getSelectionModel().selectedItemProperty().addListener((o,old,newV)->{
            if (old != null) {
                nomZone.textProperty().unbindBidirectional(old.nomProperty());
                descriptif.textProperty().unbindBidirectional(old.descriptifProperty());
                nbpratiquants.textProperty().unbindBidirectional(old.nombrePratiquantProperty());
                prixperm.textProperty().unbindBidirectional(old.prixPermisProperty());
               // typeprat.textProperty().unbindBidirectional(old.getType1());
            }
            if (newV != null) {
                nomZone.textProperty().bindBidirectional(newV.nomProperty());
                descriptif.textProperty().bindBidirectional(newV.descriptifProperty());
                nbpratiquants.textProperty().bindBidirectional(newV.nombrePratiquantProperty(),new DecimalFormat());
                prixperm.textProperty().bindBidirectional(newV.prixPermisProperty(),new DecimalFormat());
               // typeprat.textProperty().bindBidirectional(newV.type1Property());
            }
        });
    }
    
    public void BoutonAnimal (Event e) {
        ControlUCAnimal animal = new ControlUCAnimal(manager, nomZone.textProperty());
        acc.archorpane.getChildren().clear();
        acc.archorpane.getChildren().add(animal);
        setAnchor(animal);
    }
    
    private void setAnchor(Node u)
    {
        AnchorPane.setBottomAnchor(u, 0.0);
        AnchorPane.setTopAnchor(u, 0.0);
        AnchorPane.setLeftAnchor(u, 0.0);
        AnchorPane.setRightAnchor(u, 0.0);
    }
    
}
