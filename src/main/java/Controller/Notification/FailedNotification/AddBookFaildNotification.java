package Controller.Notification.FailedNotification;

import javafx.event.ActionEvent;
import scene.SceneManager;

public class AddBookFaildNotification {
    public void btnFailedOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/addBook.fxml");
    }
}
