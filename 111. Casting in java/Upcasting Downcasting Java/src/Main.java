public class Main {
    public static void main(String[] args) {
        A obj = new B(); // This is upcasting.
        obj.show1();

        B obj1 = (B) obj; // This is downcasting.
        obj1.show2();
    }
}
class A {
    public void show1(){
        System.out.println("A is Shown");
    }
}

class B extends A {
    public void show2(){
        System.out.println("B is shown");
    }
}