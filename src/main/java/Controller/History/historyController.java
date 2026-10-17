package Controller.History;

import Model.issueBook;
import db.DBConnection;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Controller.History.historyPageController.issueBooks;
//import static Controller.Member.ManageMmber.manageMemberPageController.MemberList;


public class historyController {

    Connection connection = DBConnection.getInstance().getConnection();

    public void loadIssueBookDetails (ObservableList<issueBook> issueBooks){
        String getIssueBookSql = "SELECT * FROM issueBook";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getIssueBookSql);
            ResultSet resultSet = preparedStatement.executeQuery();

            issueBooks.clear();

            while (resultSet.next()){
                String issueID = resultSet.getString("issueID");
                String borrowMember = resultSet.getString("borrowMember");
                String borrowBook = resultSet.getString("borrowBook");
                String issuedate = resultSet.getString("issuedate");
                String duedate = resultSet.getString("duedate");

                issueBook issueBook = new issueBook(issueID,borrowMember,borrowBook,issuedate,duedate);

                issueBooks.add(issueBook);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
