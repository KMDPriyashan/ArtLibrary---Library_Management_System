package Controller.Notification;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import scene.SceneManager;

public class SuccessNotification {
    public Button btnSuccess;

    public void btnSuccessOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/dashboard.fxml");
    }
}
