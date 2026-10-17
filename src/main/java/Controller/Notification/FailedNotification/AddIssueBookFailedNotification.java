package Controller.Notification.FailedNotification;

import javafx.event.ActionEvent;
import scene.SceneManager;

public class AddIssueBookFailedNotification {
    public void btnFailedOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/newIssueBook.fxml");
    }
}
