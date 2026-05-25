// A class can only extend a single class, java supports only single inheritance.

// However, a class can implement many interfaces, providing flexibility and modularity.
// This allows for the combination of different sets of behaviors, making interfaces a powerful feature.

// A class can both extend another class and implement one or more interfaces.

// in this example, the bird class extends or inherits from Animal, but it's implementing both a FlightEnabled, and Trackable interface.

public class Bird extends Animal implements FlightEnabled, Trackable{

    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinates recorded");
    }
    
}
