package Controller.Member;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import scene.SceneManager;

public class addMemberPageController {
    public TextField txtMemberName;
    public TextField txtMemberEmail;
    public TextField txtMemberPhonenumber;
    public TextField txtMemberAddress;
    public TextField txtMemberID;

    addMemberController addMemberController = new addMemberController();

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

    public void btnformClearOnAction(ActionEvent actionEvent) {
    }

    public void btnSubmitAddMemberOnAction(ActionEvent actionEvent) {
        addMemberController.databaseSaveMemberDetails(txtMemberID.getText(),txtMemberName.getText(),txtMemberEmail.getText(),txtMemberAddress.getText(),txtMemberPhonenumber.getText());
    }

    public void btnBackToHomeOnAction(ActionEvent actionEvent) {
    }
}
