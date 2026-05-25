// Abstract Class
// The abstract class is declared with the abstract modifier
// abstract class Animal {}
// An abstract class is a class that's incomplete.
// You can't create an instance of an abstract class.
// Animal a = new Animal(); // INVALID, an abstrac class never gets instantiated.
// An abstract class can still have a constructor, which will be called by its subclasses during their construction.

// An abstract class's purpose is to define the behavior its subclasses are required to have, so it always participates in inheritance.

// for example Animal is an abstract class.
// class Dog extends Animal {} // Animal is abstract, Dog is not. ( Dog is concrete class)

// A class that extends an abstract class can also be abstract itself, as I show with this next example.
// abstract class Mammal extends Animal{} // Animal is abstract, Mammal is also

// A class that extends an abstract class can also be abstract itself, as I show with this next example.
// abstract class Mammal extends Animal{} // Animal is abstract, Mammal is also abstract.

// and finally an abstract class can extend a concrete class.
// Here we have BestOfBreed, an abstract class,
// abstract class BestOfBreed extends Dog{}

// An abstract method is declared with the modifier abstract
// for example :
//abstract class Animal{
//    public abstract void move();
//}
// Abstract methods can only be declared on an abstract class or interface.



import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("animal", "big", 100); you can't create the instance of an abstract class.
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>(); // according to inheritance you can still use dog and fish.
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        animals.add(new Horse("Clydesdale", "large", 1000));

        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal){ // this will check if current animal is in Mammal class. if yes then it will assign a that object to a object variable. in this case that is currentMammal. and we can call method from that class. in this case it is currentMammal.shedHair();
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
