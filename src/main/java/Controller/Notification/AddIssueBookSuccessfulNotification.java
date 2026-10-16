package Controller.Notification;

import javafx.event.ActionEvent;
import scene.SceneManager;

public class AddIssueBookSuccessfulNotification {
    public void btnSuccessOnAction(ActionEvent actionEvent) {

        SceneManager.switchPage("/view/newIssueBook.fxml");
    }
}
