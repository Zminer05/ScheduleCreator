import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScheduleDriver extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("GroupProject.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("Schedule");
        stage.show();
    }
}
