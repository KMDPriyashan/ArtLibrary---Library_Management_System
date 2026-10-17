package Model;

public class issueBook {

    private String issueID;
    private String borrowMember;
    private String borrowBook;
    private String issueDate;
    private String dueDate;

    public issueBook(String issueID, String borrowMember, String borrowBook,
                     String issueDate, String dueDate) {
        this.issueID = issueID;
        this.borrowMember = borrowMember;
        this.borrowBook = borrowBook;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public String getIssueID() { return issueID; }
    public String getBorrowMember() { return borrowMember; }
    public String getBorrowBook() { return borrowBook; }
    public String getIssueDate() { return issueDate; }
    public String getDueDate() { return dueDate; }

}
