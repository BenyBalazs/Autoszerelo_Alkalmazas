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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import models.Car;

import javax.imageio.IIOException;
import java.io.IOException;

public class DoneController {

    @FXML
    private ListView<Car> listOfCarsDone;

    @FXML
    public void initialize(){
        listOfCarsDone.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    void openEditWindow(MouseEvent event) throws IOException {

        Car car = listOfCarsDone.getSelectionModel().getSelectedItem();
        DataTransfer.setCar(car);

        if (car != null) {
            Parent part = FXMLLoader.load(App.class.getResource("edit.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.setTitle("Szerkesztés");
            stage.setResizable(false);
            stage.sizeToScene();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(Stage.getWindows().stream().filter(Window::isShowing).findFirst().get());
            stage.show();
            stage.setOnCloseRequest(windowEvent -> {listOfCarsDone.refresh(); DataTransfer.setCar(null);});
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("A szerkesztéshez ki kell jelölni egy autót!");
            alert.setTitle("Nincs kijelölt autó");
            alert.setHeaderText(null);
            alert.showAndWait();
        }
    }

    @FXML
    void deleteRepair(MouseEvent event) {
        Car car = listOfCarsDone.getSelectionModel().getSelectedItem();
        listOfCarsDone.getItems().remove(car);
        Database.removeCarFromDatabase(car);
    }

    @FXML
    void listFinishedCars(MouseEvent event) {
        listOfCarsDone.getItems().clear();
        listOfCarsDone.getItems().addAll(Database.getAllCarsByState(Car.State.FINISHED));
    }

    @FXML
    void listPaidCars(MouseEvent event) {
        listOfCarsDone.getItems().clear();
        listOfCarsDone.getItems().addAll(Database.getAllCarsByState(Car.State.PAID));
    }

}
