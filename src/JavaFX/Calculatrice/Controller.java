package JavaFX.Calculatrice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    Button myButton;

    @FXML
    TextField firstField;
    @FXML
    TextField secondField;
    @FXML
    TextField resultField;

    Heure first, second, result;

    @FXML
    private void actionButton(ActionEvent evnt) {
        if(((Button)evnt.getSource()).getText() == "-") {
            result = first.moins(second);
            resultField.setText(result.toString());
        } else if(((Button)evnt.getSource()).getText() == "+") {
            result = first.plus(second);
            resultField.setText(result.toString());
        }
    }

    @FXML
    private void setFirstField(ActionEvent e) {
        first = new Heure(firstField.getText());
        System.out.println(first.toString());
    }

    @FXML
    private void setSecondField(ActionEvent e) {
        second = new Heure(secondField.getText());
        System.out.println(second.toString());
    }
}
