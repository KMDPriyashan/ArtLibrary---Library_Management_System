package Controller.Dashboard;

import Model.Member;
import db.DBConnection;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import static Controller.Dashboard.dashboardPageController.MemberList;

public class dashboardController {
    Connection connection = DBConnection.getInstance().getConnection();

    public void loadMemberDetails(ObservableList<Member> memberList) {

        String getMemberData = "SELECT * FROM members";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getMemberData);
            ResultSet resultSet = preparedStatement.executeQuery();

            MemberList.clear();

            while (resultSet.next()) {
                String memberID = resultSet.getString("member_id");
                String memberName = resultSet.getString("full_name");
                String memberEmail = resultSet.getString("email");
                String memberPhoneNumber = resultSet.getString("phone_number");
                String memberAddress = resultSet.getString("address");

                Member member = new Member(memberID, memberName, memberEmail, memberPhoneNumber, memberAddress);

                MemberList.add(member);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
