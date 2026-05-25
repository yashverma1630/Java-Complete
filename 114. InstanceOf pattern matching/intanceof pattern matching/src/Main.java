import java.util.*;
public class Main {
    public static void main(String[] args) {

        A a = new B(); // upcasting

        B b = (B) a;  // downcasting

//        in this, variable is defined of class a2 directly .
        if(b instanceof A a2){
            a2.out1();
        }

    }
}

class A{
    public void out1(){
        System.out.println("Method of class A is executed");
    }
}

class B extends A {
    public void out2(){
        System.out.println("Method of class B is executed");
    }
}