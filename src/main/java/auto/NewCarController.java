package auto;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class NewCarController {

    @FXML
    private TextField name;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField brandAndType;

    @FXML
    private TextField licencePlate;

    @FXML
    private TextArea description;

    @FXML
    void saveNewCarToDatabase(MouseEvent event) {

    }

}
