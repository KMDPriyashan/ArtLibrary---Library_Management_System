package Controller.Login;

import db.DBConnection;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import scene.SceneManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginController {

    Connection connection = DBConnection.getInstance().getConnection();

    public Boolean loginCredintialCheck(String username , String password) throws SQLException {
        String sql = "SELECT * FROM users";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            String DBusername = resultSet.getNString("username");
            String DBpassword = resultSet.getNString("password");

            System.out.println(DBusername+ " "+ DBpassword);
            if (username.equals(DBusername) && password.equals(DBpassword)){
                SceneManager.switchPage("/view/dashboard.fxml");
            }
        }

        return false;

    }

}
