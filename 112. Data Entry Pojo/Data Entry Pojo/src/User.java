public class User{
    private String UserName;
    private String Email;
    private String PhoneNo;
    private String Password;

    public User(String UserName, String Email, String PhoneNo, String Password){
        this.UserName=UserName;
        this.Email=Email;
        this.PhoneNo=PhoneNo;
        this.Password=Password;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public String getUserName() {
        return UserName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

