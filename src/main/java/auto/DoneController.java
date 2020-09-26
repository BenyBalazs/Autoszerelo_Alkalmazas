package auto;

import database.Database;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import models.Car;

public class DoneController {

    @FXML
    private ListView<Car> listOfCarsDone;

    @FXML
    public void initialize(){
        listOfCarsDone.getItems().clear();
        listOfCarsDone.getItems().addAll(Database.getAllCarsByState(Car.State.FINISHED));
        listOfCarsDone.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    void setPaidStatus(MouseEvent event) {
        Car car = listOfCarsDone.getSelectionModel().getSelectedItem();
        car.setState(Car.State.PAID);
        Database.commitCarChanges(car);
    }

}
