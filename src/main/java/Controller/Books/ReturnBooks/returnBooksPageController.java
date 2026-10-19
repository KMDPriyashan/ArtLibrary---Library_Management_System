package Controller.Books.ReturnBooks;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import scene.SceneManager;

public class returnBooksPageController {

    returnBookController returnBookController = new returnBookController();
    public TextField txtfineAmount;
    public Button btnConformReturnBook;
    public Button btnissueBookSearch;
    public TextField txtIssueID;
    public Label lblBarrowMember;
    public Label lblBarrowBook;
    public Label lblBarrowBookDate;
    public Label lblissueBookDate;
    public DatePicker dataOfReturn;


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

    public void btndashboardOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/dashboard.fxml");
    }

    public void btnHomeOnAction(ActionEvent actionEvent) {
        SceneManager.switchPage("/view/dashboard.fxml");
    }

    public void btnConformReturnBookOnAction(ActionEvent actionEvent) {
        returnBookController.databaseSaveReturnBooksDetails(txtIssueID.getText(),dataOfReturn.getValue().toString(),txtfineAmount.getText());
    }

    public void btnissueBookSearchOnAction(ActionEvent actionEvent) {
        returnBookController.loadIssueBookDetailsByID(txtIssueID.getText(),this);
    }

    public void setBarrowBook(String value) {
        lblBarrowBook.setText(value);
    }

    public void setBarrowMember(String value) {
        lblBarrowMember.setText(value);
    }

    public void setBarrowBookdate(String value) {
        lblBarrowBookDate.setText(value);
    }
    public void setissueBookdate(String value) {
        lblissueBookDate.setText(value);
    }




}
