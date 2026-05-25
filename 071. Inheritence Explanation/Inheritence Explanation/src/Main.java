public class Main extends Object{
    public static void main(String[] args) {

        Student student = new Student("Max", 21);
        System.out.println(student);

        Parentofstudent parentofstudent = new Parentofstudent("Yash", 21, "Baljinder Kumar");
        System.out.println(parentofstudent);

    }
}

class Student{
    private String name;
    private int age;

    Student(){

    }

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

//    @Override
//    public java.lang.String toString() {
//        return super.toString();
//    }
//    Above code is used to print the student object ... but it will not print the values in student object like student name and age
//    instead of that it will print hash code, something like this Student@6acbcfc0 , class name followed by @ and followed by hash code that is 6acbcfc0
//    this hash code is reference or we can say address of the code...


//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//    This toString method will print the values that Student object contains... like name and age of the student.
//    output : Student{name='Max', age=21}

    public String toString(){
        return (name + " is "+age+ " years old.");
    }
}

class Parentofstudent extends Student{
    private String parentname;

    Parentofstudent(String name, int age, String parentname){
        super(name,age);
        this.parentname=parentname;
    }

    public String toString(){
        return (parentname+"'s kid "+super.toString());
    }

}
