package Controller.Books.IssueBook;

import db.DBConnection;
import scene.SceneManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class issueBookController {

    Connection connection = DBConnection.getInstance().getConnection();

    public void databaseSaveIssueBookDetails (String BarrowBook, String BarrowingMember, String issueDate, String dueDate){

        String addIssueBookSql = "INSERT INTO issueBook (borrowMember, borrowBook, issuedate, duedate) VALUES (?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(addIssueBookSql);
            preparedStatement.setString(1,BarrowBook);
            preparedStatement.setString(2,BarrowingMember);
            preparedStatement.setString(3,issueDate);
            preparedStatement.setString(4,dueDate);

            int addIssueBookQuaryResult = preparedStatement.executeUpdate();

            if (addIssueBookQuaryResult > 0){
                SceneManager.switchPage("/view/SuccessNotification.fxml");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
