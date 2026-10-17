package Controller.Books.IssueBook;

import db.DBConnection;
import scene.SceneManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class issueBookController {

    Connection connection = DBConnection.getInstance().getConnection();

    public void databaseSaveIssueBookDetails (String issueID, String BarrowBook, String BarrowingMember, String issueDate, String dueDate){

        String addIssueBookSql = "INSERT INTO issueBook (issueID, borrowMember, borrowBook, issuedate, duedate) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(addIssueBookSql);
            preparedStatement.setString(1,issueID);
            preparedStatement.setString(2,BarrowingMember);
            preparedStatement.setString(3,BarrowBook);
            preparedStatement.setString(4,issueDate);
            preparedStatement.setString(5,dueDate);

            int addIssueBookQuaryResult = preparedStatement.executeUpdate();

            if (addIssueBookQuaryResult > 0){
                SceneManager.switchPage("/view/Notification/SuccessfulNotification/AddBookSuccessNotification.fxml");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
