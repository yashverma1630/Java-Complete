// You can change method behavior of class by using anonymous class.
// Anonymous class is a class without name and it is used to override method of class.
class A {
    public void show(){
        System.out.println("you are in class A");
    }
}

public class Main {
    public static void main(String[] args) {

        A a = new A(){
            public void show(){
                System.out.println("you are in anonymous class");
            }
        };
        a.show();

    }
}
