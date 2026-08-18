import java.util.*;

// normal Counter class
class Counter{
    int count=0;
    public synchronized void increment(){ // synchronized method to ensure thread safety. so that 1 thread can access the method at a time. if 1 thread is accessing the method, other threads will wait until the first thread is done.
        count++;
    }
}

class A implements Runnable{ // runnable interface is implemented by classes A and B to define the run method for each thread.
    Counter c;
    A(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i=1; i<=10000; i++){
            c.increment();
        }
    }
}

class B implements Runnable{
    Counter c;
    B(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i=1; i<=10000; i++){
            c.increment();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter(); // create a new Counter object. this object will be shared between the two threads.

        Runnable a = new A(c);
        Runnable b = new B(c);
        // Runnable objects to be passed to the threads. these objects will be shared between the two threads.

        Thread t1 = new Thread(a); // t1 and t2 are the two threads that will run the run() method of the Runnable objects a and b respectively.
        Thread t2 = new Thread(b);

        t1.start(); // start the threads. this will call the run() method of the Runnable objects a and b respectively.
        t2.start();

        t1.join(); // wait for the threads to finish. this will block the main thread until t1 and t2 are finished.
        t2.join();

        System.out.println(c.count); // then after the threads are finished, print the count. this should be 20000 if the increment() method is synchronized correctly.
    }
}
