public class User {
    private String Username;
    private String Email;
    private String PhoneNo;
    private String Password;

    public User(String username, String email, String phoneNo, String password) {
        Username = username;
        Email = email;
        PhoneNo = phoneNo;
        Password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
