package Controller.Books.IssueBook;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import scene.SceneManager;

public class issueBookPageController {


    issueBookController issueBookController = new issueBookController();
    public TextField txtBarrowingID;
    public Button btnIssueBook;
    public DatePicker dateIssueBook;
    public DatePicker dateDueDate;
    public TextField txtBarrowingMember;
    public TextField txtBarrowingBook;

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
        SceneManager.switchPage("/view/newIssueBook.fxml");
    }

    public void btnreturnBooksOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/returnBooks.fxml");
    }

    public void btnHistoryOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/historyPage.fxml");
    }

    public void btndashboardOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/dashboard.fxml");
    }

    public void btnSubmitIssueBookOnAction(ActionEvent actionEvent) {
        issueBookController.databaseSaveIssueBookDetails(txtBarrowingID.getText(),txtBarrowingBook.getText(),txtBarrowingMember.getText(),dateDueDate.getValue().toString(),dateIssueBook.getValue().toString());
    }
}
