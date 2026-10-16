package Controller.Member;

import db.DBConnection;
import scene.SceneManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addMemberController {
    Connection connection = DBConnection.getInstance().getConnection();

    public void databaseSaveMemberDetails (String MemberID, String MemberName, String MemberEmail, String MemberAddress, String MemberPhoneNumber){

        String addMemberSql = "INSERT INTO members (member_id, full_name, email, phone_number, address) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(addMemberSql);
            preparedStatement.setString(1,MemberID);
            preparedStatement.setString(2,MemberName);
            preparedStatement.setString(3,MemberEmail);
            preparedStatement.setString(4,MemberPhoneNumber);
            preparedStatement.setString(5,MemberAddress);

            int addMemberQuaryResult = preparedStatement.executeUpdate();
            if (addMemberQuaryResult > 0){
                SceneManager.switchPage("/view/successNotification/AddMemberSuccessNotification.fxml");
            }else {
                SceneManager.switchPage("/view/FailedNotification/AddMemberFailedNotification.fxml");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
