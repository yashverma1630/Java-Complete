import java.util.*;

interface A{
    void aShow();
}
public class Main {
    public static void main(String[] args) {
//        A obj = new A(){
//            public void aShow(){
//                System.out.println("Learning Lambda Expression");
//            }
//        };

//        below is the lambda expression example of above...

//        remove the commented section below and understand how this lambda expression works.
//        A obj = ()->{
//            System.out.println("Lambda expression executed !");
//        };

        A obj = ()-> System.out.println("Lambda expression better version executed !");
        obj.aShow();

//        if you have to execute single statement then there is no need to use curly braces.
//        but if we have more than single statement then we have to use curly braces.

    }
}
