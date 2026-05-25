//This code is for reference only... it has no use in the code ... just for learning...

//This code is to understand that how Record is different from POJO...
//Record is much better than POJO ...
// the data stored in record is immutable ...
// we cannot make changes to data stored in Record ...
//Record is fast and safe way to store data...

public class Student {
    private String Id;
    private String Name;
    private String DateOfBirth;
    private String ClassList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        Id = id;
        Name = name;
        DateOfBirth = dateOfBirth;
        ClassList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", ClassList='" + ClassList + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return ClassList;
    }

    public void setClassList(String classList) {
        ClassList = classList;
    }
}
