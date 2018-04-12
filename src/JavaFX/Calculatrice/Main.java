package JavaFX.Calculatrice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Appli test FX");
        primaryStage.setScene(new Scene(root, 350, 250));
        primaryStage.setMaxHeight(500);
        primaryStage.setMaxWidth(500);
        primaryStage.setMinHeight(100);
        primaryStage.setMinWidth(100);
        primaryStage.getIcons().setAll(new Image(getClass().getResource("3ilogo.png").toExternalForm()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
