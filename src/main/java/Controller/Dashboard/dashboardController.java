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

    public int changeDashboardBookCounts() {
        String getBookCount = "select COUNT(book_id) as bookCount from books;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getBookCount);
            ResultSet bookCountresultset = preparedStatement.executeQuery();

            if (bookCountresultset.next()){
                return bookCountresultset.getInt("bookCount");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return 0;
    }

    public int changeDashboardMemberCounts() {
        String getBookCount = "select COUNT(member_id) as memberCount from members;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getBookCount);
            ResultSet memberCountresultset = preparedStatement.executeQuery();

            if (memberCountresultset.next()){
                return memberCountresultset.getInt("memberCount");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public int changeDashboardissueBookCounts() {
        String getBookCount = "select COUNT(issueID) as issuebookCount from issueBook;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getBookCount);
            ResultSet issueBookCountresultset = preparedStatement.executeQuery();

            if (issueBookCountresultset.next()){
                return issueBookCountresultset.getInt("issuebookCount");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

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
