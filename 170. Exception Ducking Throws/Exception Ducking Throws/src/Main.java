// throws is used to handle multiple exception at one place.
// suppose class B have some try catch block on a method and class C have some try catch block on a method.
// Now class A calls both the methods from class B and class C.
// So we can use throws keyword in both the methods of class B and Class C and can handle those exceptions in class A by calling those methods in try catch block.
// This is called Ducking the exception.

// Also we can use this with checked exception for example I/O exceptions, SQL exceptions, ClassNotFoundException etc. we can use throws keyword to handle those exceptions in the calling method instead of handling it in the method where it is thrown.


class Apple{
    public String something(){
        return "fruit";
    }
}

class Banana{
    public Class<?> show() throws ClassNotFoundException {
        return Class.forName("Milk"); // if you replace Milk with Apple then it will not throw any exception because it will find the class Apple.
    }
}

public class Main {
    public static void main(String[] args){
        Banana obj = new Banana();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Banana is finding for Milk but you won't get it. because -> " + e);
        }
    }
}

