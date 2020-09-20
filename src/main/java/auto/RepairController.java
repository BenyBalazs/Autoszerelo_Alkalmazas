package auto;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class RepairController {

    @FXML
    void edit(MouseEvent event) throws IOException {
        Parent part = FXMLLoader.load(App.class.getResource("edit.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.setTitle("Szerkesztés");
        stage.setResizable(false);
        stage.sizeToScene();
        stage.show();
    }

    public void untilrepair(MouseEvent mouseEvent) {
    }

    public void waitrepair(MouseEvent mouseEvent) {
    }
}
