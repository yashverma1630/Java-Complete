class Animal{
    public void Makesound(){
        System.out.println("Animals make some generic sound");
    }
}

class Dog extends Animal{
    public void Makesound(){
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal{
    public void Makesound(){
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Animal mydog = new Dog();
        Animal mycat = new Cat();

        myanimal.Makesound();
        mydog.Makesound();
        mycat.Makesound();
    }
}
