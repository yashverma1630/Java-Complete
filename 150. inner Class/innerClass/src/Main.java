// inner class is basically class inside class
// you can below comment to check how inner class is accessed.

// types of inner class:
// 1. Member - covered in this
// 2. Static - covered in this
// 3. Anonymous. -- will be covered next.a

import java.util.*;

class Outer {
    int a = 10;

    public void printa() {
        System.out.println(a);
    }

    class Inner {
        int b = 20;

        public void printb() {
            System.out.println(b);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.printa();

//        Outer class name . Inner Class name followed by object name of inner class = equals to outer class object name. new Inner().
//        This will create the object of inner class and you can access inner class object.
        Outer.Inner inrObj = outerObj.new Inner();
//        this is in case of normal/member inner class.
//        but in case of static inner class we do : Outer.Inner inrObj = new Outer.Inner();
        inrObj.printb();
    }
}
