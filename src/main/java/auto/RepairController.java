package auto;


import database.DataTransfer;
import database.Database;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import models.Car;

import java.io.IOException;

public class RepairController {

    @FXML
    private ListView<Car> listOfCarsUnderRepair;

    @FXML
    public void initialize(){
        listOfCarsUnderRepair.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    void openEditWindow(MouseEvent event) throws IOException {

        Car car = listOfCarsUnderRepair.getSelectionModel().getSelectedItem();
        DataTransfer.setCar(car);
        if (car != null) {
            Parent part = FXMLLoader.load(App.class.getResource("edit.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.setTitle("Szerkesztés");
            stage.setResizable(false);
            stage.sizeToScene();
            stage.show();
            stage.setOnCloseRequest(windowEvent -> DataTransfer.setCar(null));
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("A szerkesztéshez ki kell jelölni egy autót!");
            alert.setTitle("Nincs kijelölt autó");
            alert.setHeaderText(null);
            alert.showAndWait();
        }
    }
    public void underRepair(MouseEvent mouseEvent) {
        listOfCarsUnderRepair.getItems().clear();
        listOfCarsUnderRepair.getItems().addAll(Database.getAllCarsByState(Car.State.UNDER_REPAIR));

    }

    public void waitingForRepair(MouseEvent mouseEvent) {
        listOfCarsUnderRepair.getItems().clear();
        listOfCarsUnderRepair.getItems().addAll(Database.getAllCarsByState(Car.State.WAITING));
    }
}
