/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import Metier.Manager;
import Metier.Zone;
import java.io.IOException;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author ivans
 */
public class ControlUCZone extends BorderPane{
    
    @FXML ListView<Zone> lalist;
     
    ObjectProperty<Manager> m;
     
    public ControlUCZone(int i, ObjectProperty<Manager> m){
      /*  this.m=m;
        lalist.setCellFactory((ListView<Zone> param) -> {
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
            }
        }*/
        if(i==0 || i==1){
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/UCZone.fxml"));
                loader.setController(this);
                loader.setRoot(this);
                loader.load();
            }catch(IOException e){}
        }
    }
}
