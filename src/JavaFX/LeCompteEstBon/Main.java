package JavaFX.LeCompteEstBon;

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
        primaryStage.setTitle("JavaFX/LeCompteEstBon");
        primaryStage.setScene(new Scene(root, 800, 700));
        primaryStage.setMaxHeight(1000);
        primaryStage.setMaxWidth(1000);
        primaryStage.setMinHeight(100);
        primaryStage.setMinWidth(100);
        primaryStage.getIcons().setAll(new Image(getClass().getResource("3ilogo.png").toExternalForm()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        int[] tab = new int[6];
        for (int i=0 ; i<tab.length ; i++) {
            tab[i] = 10*i;
        }

        Etape e = new Etape(tab);

        try {
            e.setFirstNumber(10);
            e.setSecondNumber(0);
            e.setOperand("Z");
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        System.out.println(e.getStringCalcul());

        //launch(args);
    }
}
