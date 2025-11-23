package com.example.groupproject;
/**
 * @author  James
 * Section  CSC 332
 * Date     10/23/25
 * Purpose  This is the main driver file for the schedule GUI
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Initializes and displays the primary GUI window for the scheduling application.
 *
 * @param stage the primary JavaFX stage provided at application startup
 * @throws Exception if the FXML file fails to load
 */
public class ScheduleLauncher extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GroupProject.fxml"));
        Scene scene = new Scene(loader.load()); //Loads the new scene
        stage.setTitle("Employee Schedule Creator");
        stage.setScene(scene);
        stage.show(); //Show Scene
    }
    /**
     * Launches the JavaFX application environment.
     *
     * @param args runtime arguments passed to the program
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}