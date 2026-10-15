package Controller.Books;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addBookController {

    Connection connection = DBConnection.getInstance().getConnection();

    public void databaseSaveBookDetails(String BookID, String BookTitle, String AuthorName, String BookYear, String BookCategory, String BookQty) {

        String AddBookSql = "INSERT INTO books (book_id, title, author, category, published_year, quantity) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(AddBookSql);
            preparedStatement.setString(1,BookID);
            preparedStatement.setString(2,BookTitle);
            preparedStatement.setString(3,AuthorName);
            preparedStatement.setString(4,BookCategory);
            preparedStatement.setString(5,BookYear);
            preparedStatement.setString(6,BookQty);

            int addBookQuaryResult = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
