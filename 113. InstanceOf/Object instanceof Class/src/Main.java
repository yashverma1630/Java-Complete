import java.util.*;
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
// instanceof operator checks if (Object is instance of class).
// for example a is an object of class Animal. so it checks that. simple.
        if(a instanceof Animal){
            System.out.println("true, a is instance of Animal");
        }
        if (d instanceof Animal){
            System.out.println("true, d is intance of Animal");
        }
        else{
            System.out.println("false");
        }


    }
}

class Animal{
    public void animal(){
        System.out.println("Animal's Parent class");
    }
}

class Dog extends Animal{
    public void animal(){
        System.out.println("Woof, Woof ! ");
    }
}
