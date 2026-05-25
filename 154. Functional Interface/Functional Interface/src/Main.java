// FunctionalInterface annotation is used.
// Functional Interface can only have 1 abstract method inside the interface.
// if we try to add more than 1 abstract method inside the Functional Interface. It will show an error.

@FunctionalInterface
interface A{
    public abstract void a();
        }

public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            public void a() {
                System.out.println("Executing Anonymous Inner class");
            }
        };
        obj.a();
    }
}
