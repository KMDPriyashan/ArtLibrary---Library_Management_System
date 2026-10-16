package Model;

public class Member {

    private String memberId;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;

    public Member(String memberId, String fullName, String email,
                  String phoneNumber, String address) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }

    public String getMemberId() { return memberId; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }

}



