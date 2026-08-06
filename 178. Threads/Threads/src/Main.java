import java.util.*;

class A extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();

        a.start();
        b.start();
    }
}
