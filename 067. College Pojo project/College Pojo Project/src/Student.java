public class Student {
    private String Firstname;
    private String Middlename;
    private String Lastname;
    private String Dateofbirth;
    private String Email;
    private String Phone;
    private String Gender;
    private String Citizenship;
    private String Address;
    private String Secondaryschool;
    private String Cgpa;

    public Student(String firstname, String middlename, String lastname, String dateofbirth, String email, String phone, String gender, String citizenship, String address, String secondaryschool, String cgpa) {
        Firstname = firstname;
        Middlename = middlename;
        Lastname = lastname;
        Dateofbirth = dateofbirth;
        Email = email;
        Phone = phone;
        Gender = gender;
        Citizenship = citizenship;
        Address = address;
        Secondaryschool = secondaryschool;
        Cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Firstname='" + Firstname + '\'' +
                ", Middlename='" + Middlename + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Dateofbirth='" + Dateofbirth + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Citizenship='" + Citizenship + '\'' +
                ", Address='" + Address + '\'' +
                ", Secondaryschool='" + Secondaryschool + '\'' +
                ", Cgpa='" + Cgpa + '\'' +
                '}';
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getMiddlename() {
        return Middlename;
    }

    public void setMiddlename(String middlename) {
        Middlename = middlename;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        Dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCitizenship() {
        return Citizenship;
    }

    public void setCitizenship(String citizenship) {
        Citizenship = citizenship;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getSecondaryschool() {
        return Secondaryschool;
    }

    public void setSecondaryschool(String secondaryschool) {
        Secondaryschool = secondaryschool;
    }

    public String getCgpa() {
        return Cgpa;
    }

    public void setCgpa(String cgpa) {
        Cgpa = cgpa;
    }
}
