/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ivan
 */
public class ControlUCAnimal extends GridPane{
    public ControlUCAnimal(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/UCAnimal.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }catch(IOException e){}
    }
}
