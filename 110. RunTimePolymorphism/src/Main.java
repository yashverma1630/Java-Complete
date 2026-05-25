// Using same method from base class in the subclasses (inheritance) with different functionality is called overriding methods.
// And this overriding of methods is called run time polymorphism.
// I hope you understand. Thanks.

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.showDetail();

        Person person1 = new Emp();
        person1.showDetail();

        Ram ram = new Ram();
        ram.doWork(person);
    }
}
