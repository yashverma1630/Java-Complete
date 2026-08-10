import java.util.*;
// Thread.sleep is to add delay in the execution of thread.
// It is used to pause the execution of a thread for a specified amount of time.
// The sleep method takes an argument in milliseconds, which specifies how long the thread
// should be paused. During this time, the thread is in a "sleeping" state and does not consume
// CPU resources. After the specified time has elapsed, the thread will resume execution
// from where it left off.
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
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


        A a = new A();
        B b = new B();
        // range of priority is from 1 to 10, where 1 is the lowest priority and 10 is the highest priority.
        System.out.println("Object a Thread Priority: "+a.getPriority()); // by default thread priority is 5
        System.out.println("Object b Thread Priority: "+b.getPriority()); // by default thread priority is 5
        b.setPriority(Thread.MAX_PRIORITY); // MAX PRIORITY IS 10
        a.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
    }
}
