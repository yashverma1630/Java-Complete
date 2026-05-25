// in compile time polymorphism you are calling method with same name but with different parameters
// same method name but different functionality. and those functionality is fixed or we can say bound to method.
// this is called method overloading. and method overloading is compile time polymorphism.

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.read();
        student.read("Oracle Java 3rd Edition");
    }
}
