public class Main {
    public static void main(String[] args) {

//        this code is for understanding method overriding
//        this is simple and easy to understand

        Dog dog = new Dog();
        GermanShepherd gs = new GermanShepherd();

        dog.bark();

        gs.bark();
    }
}

class Dog{
    public void bark(){
        System.out.println("Woof");
    }
}

class GermanShepherd extends Dog{
    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}