// When subclass reference refers to super class object,
// it is called narrowing or downcasting in java.
// it is done by Programmer explicitly.

// same methods are used.

// Sub class reference --> super class object.

public class Main {
    public static void main(String[] args) {
        // parent class reference refering to child class method. both the method has same name.
        // it is called Downcasting
        Parent parent = new Child();
        Child child = (Child) parent; // this is called type casting. it is similar to data type casting

        child.welcome();
    }
}