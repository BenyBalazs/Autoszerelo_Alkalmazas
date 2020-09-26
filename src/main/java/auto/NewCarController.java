package auto;

import database.Database;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import models.Car;

import javax.swing.event.CaretEvent;

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
        Car car = Car.builder().brandAndType(brandAndType.getText())
                .name(name.getText())
                .phoneNumber(phoneNumber.getText())
                .licensePlate(licencePlate.getText())
                .description(description.getText())
                .state(Car.State.WAITING)
                .build();

        Database.uploadCarToDatabase(car);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Az új autó mentésre került az adatbázisba.");
        alert.setTitle("Sikeres mentés");
        alert.setHeaderText(null);
        alert.showAndWait();
    }

}
