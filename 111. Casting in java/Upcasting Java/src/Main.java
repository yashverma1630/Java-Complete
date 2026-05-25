// parent class reference refers to child class's method. and both the classes should have same method names this is called upcasting in java.
// Super Class Reference --> Sub Class object
// or we can say
// when the reference variable of super class refers to the object of subclass,
// it is known as widening or upcasting in java. it is handled by java automatically.

public class Main {
    public static void main(String[] args) {
        // parent class reference refering to child class method. both the method has same name.
        // it is called upcasting.
        Parent parent = new Child();

        parent.welcome(); // now it is refering to the method that is child class.
    }
}