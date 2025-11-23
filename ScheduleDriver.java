import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * @author  James
 * Section  CSC 332
 * Date     10/23/25
 * Purpose  This is the main driver file for the schedule GUI
 */

/**
 * Entry point for launching the JavaFX Schedule application.
 * Loads the scheduling interface from the FXML file and displays the primary stage.
 */
public class ScheduleDriver extends Application {

    /**
     * Standard Java main method that launches the JavaFX application.
     *
     * @param args CLI passed to the application
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Initializes the primary application window, loads the FXML file,
     * creates the scene, and displays the schedule GUI
     * @param stage the primary stage provided by the JavaFX runtime
     * @throws Exception if the FXML file cannot be loaded
     */
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("GroupProject.fxml"));
        Scene scene = new Scene(loader.load()); //loads the new stage

        stage.setScene(scene);
        stage.setTitle("Schedule");
        stage.show(); //Shows scene
    }
}
