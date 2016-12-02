/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author antho
 */
public class ControlUCAccueil extends BorderPane {
    public ControlUCAccueil(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/userControlAccueil.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }catch(IOException e){}
    }
    
    
    
}
