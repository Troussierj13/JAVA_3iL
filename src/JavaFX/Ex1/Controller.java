package JavaFX.Ex1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    Button myButton;

    @FXML
    Label myLabel;

    int cmpt = 0;

    @FXML
    private void actionButton(ActionEvent evnt) {
        cmpt++;
        myLabel.setText(myLabel.getText().toString().split(" ")[0] + " " + Integer.toString(cmpt));
        System.out.println("Click !");
    }
}
