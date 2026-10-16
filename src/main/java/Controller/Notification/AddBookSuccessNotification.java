package Controller.Notification;

import javafx.event.ActionEvent;
import scene.SceneManager;

public class AddBookSuccessNotification {
    public void btnSuccessOnAction(ActionEvent actionEvent) {

        SceneManager.switchPage("/view/addBook.fxml");

    }
}
