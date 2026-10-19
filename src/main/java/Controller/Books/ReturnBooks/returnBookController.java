package Controller.Books.ReturnBooks;

import db.DBConnection;
import javafx.scene.control.TextField;
import scene.SceneManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class returnBookController {
    Connection connection = DBConnection.getInstance().getConnection();

    //get the values using By issueId
    public void loadIssueBookDetailsByID(String issueBookID, returnBooksPageController pageController) {
        String loadIssueBookdata = "SELECT * FROM issueBook WHERE issueID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(loadIssueBookdata);
            preparedStatement.setString(1,issueBookID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                String borrowMember = resultSet.getNString("borrowMember");
                String borrowBook = resultSet.getNString("borrowBook");
                String issuedate = resultSet.getString("issuedate");
                String duedate = resultSet.getString("duedate");

                pageController.setBarrowBook(borrowBook);
                pageController.setBarrowMember(borrowMember);
                pageController.setBarrowBookdate(issuedate);
                pageController.setissueBookdate(duedate);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void databaseSaveReturnBooksDetails(String txtIssueID,String ReturnDate, String FineAmount){
        String addReturnBookData = "INSERT INTO returnBook (issueID, returnDate, fineAmount) VALUES (?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(addReturnBookData);

            preparedStatement.setString(1,txtIssueID);
            preparedStatement.setString(2,ReturnDate);
            preparedStatement.setString(3,FineAmount);

            int addReturnBookQuaryResult = preparedStatement.executeUpdate();

            if (addReturnBookQuaryResult > 0){
                SceneManager.switchPage("/view/successNotification/AddIssueBookSuccessfulNotification.fxml");
            }else {
                SceneManager.switchPage("/view/FailedNotification/AddIssueBookFailedNotification.fxml");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
