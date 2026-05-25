// Abstract and Anonymous Inner Class

// so you can directly implement the method inside the object of abstract class using anonymous inner class.
// remember you can't create object of abstract class directly. but you can define methods directly using anonymous inner class.

import java.util.*;

abstract class A {
    abstract void show();
}

public class Main {
    public static void main(String[] args) {
        A a = new A(){
            public void show(){
                System.out.println("Something to show. !!!");
            }
        };

        a.show();
    }
}
