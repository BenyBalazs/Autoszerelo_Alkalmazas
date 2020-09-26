package auto;

import database.DataTransfer;
import database.Database;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import models.Car;

public class EditController {

    @FXML
    private TextField name;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField brandAndType;

    @FXML
    private TextField licencePlane;

    @FXML
    private TextArea description;

    @FXML
    private Spinner<Integer> cost;

    @FXML
    private ComboBox<Car.State> state;

    private Car car;

    @FXML
    public void initialize(){
        car = DataTransfer.getCar();
        name.setText(car.getName());
        phoneNumber.setText(car.getPhoneNumber());
        brandAndType.setText(car.getBrandAndType());
        licencePlane.setText(car.getLicensePlate());
        description.setText(car.getDescription());
        state.getItems().addAll(Car.State.values());
        state.getSelectionModel().select(car.getState());
        if (car.getCostOfRepair() != null)
            cost.getValueFactory().setValue(car.getCostOfRepair());
    }

    @FXML
    void save(MouseEvent event) {
        try {
            car.setPhoneNumber(phoneNumber.getText());
            car.setBrandAndType(brandAndType.getText());
            car.setLicensePlate(licencePlane.getText());
            car.setDescription(description.getText());
            car.setName(name.getText());
            car.setState(state.getSelectionModel().getSelectedItem());
            car.setCostOfRepair(cost.getValue());

            Database.commitCarChanges(car);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("A változtatások el lettek mentve az adatbázisba.");
            alert.setTitle("Sikeres mentés.");
            alert.setHeaderText(null);
            alert.showAndWait();

        } catch(Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Nem sikerült a mentés!");
            alert.setTitle("Sikertelen mentés!");
            alert.setHeaderText(null);
            alert.showAndWait();
        }
    }

}
