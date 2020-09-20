package auto;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MenuController {

    private static Logger logger = LoggerFactory.getLogger("MenuController.class");

    @FXML
    private BorderPane borderpane;

    @FXML
    void done(MouseEvent event) {
        loadUI("done");
    }

    @FXML
    void new_car(MouseEvent event) {
        loadUI("newcar");
    }

    @FXML
    void repair(MouseEvent event) {
        loadUI("repair");
    }

    private void loadUI(String ui){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
        } catch (IOException ex) {
            logger.error("A hiba forrása {}", ex.toString());
        }
        borderpane.setCenter(root);
    }
}
