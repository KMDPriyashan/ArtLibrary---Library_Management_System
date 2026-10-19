package Controller.Books.ReturnBooks;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class returnBookController {
    returnBooksPageController returnBooksPageController = new returnBooksPageController();
    Connection connection = DBConnection.getInstance().getConnection();

    //get the values using By issueId
    public void loadIssueBookDetailsByID(String issueBookID) {
        String loadIssueBookdata = "SELECT * FROM issueBook WHERE issueID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(loadIssueBookdata);
            preparedStatement.setString(1,issueBookID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                String borrowMember = resultSet.getNString("borrowMember");
                String borrowBook = resultSet.getNString("borrowBook");
                String issuedate = resultSet.getNString("issuedate");
                String duedate = resultSet.getNString("duedate");

                returnBooksPageController.setBarrowBook(borrowBook);
                returnBooksPageController.setBarrowMember(borrowMember);
                returnBooksPageController.setBarrowBookdate(issuedate);
                returnBooksPageController.setissueBookdate(duedate);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void databaseSaveReturnBooksDetails(LocalDate ReturnDate){


    }


}
