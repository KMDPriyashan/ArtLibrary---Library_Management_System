package Controller.Notification;

import javafx.event.ActionEvent;
import scene.SceneManager;

public class AddMemberSuccessfulNotification {
    public void btnSuccessOnAction(ActionEvent actionEvent) {

        SceneManager.switchPage("/view/addMember.fxml");
    }
}
