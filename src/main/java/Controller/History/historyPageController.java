package Controller.History;

import Model.issueBook;
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

public class historyPageController implements Initializable {
    public TableColumn clmissueID;
    public TableColumn clmBorrowMemebr;
    public TableColumn clmBorrowBook;
    public TableColumn clmissueDate;
    public TableColumn clmDueDate;
    public TableView issueBookTable;

    static ObservableList<issueBook> issueBooks = FXCollections.observableArrayList();


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
        clmissueID.setCellValueFactory(new PropertyValueFactory<>("issueID"));
        clmBorrowMemebr.setCellValueFactory(new PropertyValueFactory<>("borrowMember"));
        clmBorrowBook.setCellValueFactory(new PropertyValueFactory<>("borrowBook"));
        clmissueDate.setCellValueFactory(new PropertyValueFactory<>("issueDate"));
        clmDueDate.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        issueBookTable.setItems(issueBooks);

        new historyController().loadIssueBookDetails(issueBooks);

//        new historyController().loadIssueBookDetails(issueBooks);
    }
}
