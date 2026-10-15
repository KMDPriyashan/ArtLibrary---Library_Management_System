package Controller.Books;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import scene.SceneManager;

public class addBookPageController {
    public TextField txtBookID;
    public TextField txtBookTitle;
    public TextField txtAuthorName;
    public TextField txtbookCategory;
    public TextField txtBookYear;
    public TextField txtBookQty;
    public Button btnClear;
    public Button btnaddBook;
    public Button btnbackHome;
    public Button btnAddBook;
    public Button btnAddmembers;
    public Button btnManageMember;
    public Button btnIssueBooks;
    public Button btnreturnBooks;
    public Button btnHistory;

    addBookController addBookController = new addBookController();

    public void btnAddBookOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/addBook.fxml");
    }

    public void btnAddmemberOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/addMember.fxml");
    }

    public void btnManageMemberOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/manageMember.fxml");
    }

    public void btnIssueBooksOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/issueBook.fxml");
    }

    public void btnreturnBooksOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/returnBooks.fxml");
    }

    public void btnHistoryOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/historyPage.fxml");
    }

    public void btnbackHomeOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/dashboard.fxml");
    }

    public void btnAddBookFormClearOnAction(ActionEvent actionEvent) {
    }

    public void btnPageAddBookOnAction(ActionEvent actionEvent) {
        addBookController.databaseSaveBookDetails(txtBookID.getText(), txtBookTitle.getText(), txtAuthorName.getText(), txtBookYear.getText(), txtbookCategory.getText(),txtBookQty.getText());
    }
}
