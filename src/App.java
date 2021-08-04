import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
@Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmlloader.load();
        Scene scene = new Scene(root);
 
        primaryStage.setTitle("Formulario en JavaFX - Darkmaster");
        primaryStage.setScene(scene);
        primaryStage.show();
       
    }
}