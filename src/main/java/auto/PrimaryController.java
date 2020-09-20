package auto;

import java.io.IOException;

import database.Database;
import javafx.fxml.FXML;
import models.Car;

public class PrimaryController {

    @FXML
    public void initialize(){
        Car car = new Car();
        car.setChassisNumber("AS89645");
        car.setLicensePlateNumber("556");
        car.setDescription("asdasd");
        car.setOwnerName("Segg Fej");
        car.setOwnerPhoneNumber("+363584321");
        car.setState(Car.State.UNDER_REPAIR);
        car.setPrice(55555);
        car.setBrandAndType("Tesla modell anyád");

        Database.uploadEntityToDatabase(car);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
