package Controller.Notification.FailedNotification;

import javafx.event.ActionEvent;
import scene.SceneManager;

public class AddMemberFaildNotification {
    public void btnFailedOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/addMember.fxml");
    }
}
