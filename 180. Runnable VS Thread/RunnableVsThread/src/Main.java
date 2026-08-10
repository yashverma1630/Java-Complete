import java.util.*;

// This program demonstrates the use of threads in Java.
// It creates two threads that print "Hi" and "Hello" respectively,
// five times each, with a short delay between prints.

// Runnable interface is implemented by classes A and B to define the run method for each thread.

// Runnable vs Thread:
// Runnable is an interface that defines a single method run(),
// which is meant to be executed by a thread. Thread is a class that represents a
// thread of execution in a program. A class can implement Runnable to define the
// code that will run in a separate thread, while Thread can be used to create and
// manage threads directly.
class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
