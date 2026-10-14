package Controller.Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class loginPageController {

    loginController loginController = new loginController();

    public Button btnreset;
    public Button btnlogin;
    public TextField txtusername;
    public TextField txtpassword;

    public void btnResetOnAction(ActionEvent actionEvent) {

    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws SQLException {
        loginController.loginCredintialCheck(txtusername.getText(), txtpassword.getText());

    }


}
