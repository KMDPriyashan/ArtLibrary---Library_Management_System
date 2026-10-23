package Controller.Notification.FailedNotification;

import javafx.event.ActionEvent;
import scene.SceneManager;

public class loginFailedNotification {
    public void btnFailedOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/Login_page.fxml");
    }
}
