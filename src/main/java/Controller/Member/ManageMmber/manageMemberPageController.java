package Controller.Member.ManageMmber;

import Model.Member;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import scene.SceneManager;

import java.net.URL;
import java.util.ResourceBundle;

public class manageMemberPageController implements Initializable {
    public TableColumn clmMemberID;
    public TableColumn clmMemberName;
    public TableColumn clmMemberEmail;
    public TableColumn clmMemberPhoneNumber;
    public TableColumn clmMemberAddress;
    public TableView MemberTable;

    public static ObservableList<Member> MemberList = FXCollections.observableArrayList();

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



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clmMemberID.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        clmMemberName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        clmMemberEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        clmMemberPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        clmMemberAddress.setCellValueFactory(new PropertyValueFactory<>("address"));

        MemberTable.setItems(MemberList);

        new manageMemberController().loadMemberDetails(MemberList);

    }
}
