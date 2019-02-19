/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ruberg
 */
public class HelloWorld extends Application {
    private Label label;
    
    @Override public void init() {        
             label = new Label("Hello World"); 
     }
    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();       
            root.getChildren().add(label);
            Scene scene = new Scene(root, 200, 200);
            stage.setTitle("Hello World Example");        
            stage.setScene(scene);        
            stage.show();
    }

    @Override public void stop() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] parameters) {
        launch(parameters);
    }
    
}
