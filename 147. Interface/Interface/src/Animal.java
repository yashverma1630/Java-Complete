interface FlightEnabled{
//    any fields declared in interface are public static final
//    The Final modifier in java:
//    1. a final method means it can't be overridden by a subclass.
//    2. a final field means an object's field can't be reassigned or given a different value after this initialization.
//    3. a final static field is a class field that can't be reassigned or given a different value after the class's initialization process.
//    4. a final class can't be overridden, meaning no class can use it in the extends clause.
//    5. a final variable in a block of code, means that once it's assigned a value any remaining code in the block can't change it.
//    6. a final method parameter means we can't assign a different  value to that parameter in the method code block.
//    The Final static field, is what you're really creating , when you declare a field on an interface.
    public static final double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

//    Constants in java :
//    A Constant in java is a variable that can't be changed.
//    A Constant variable is a final variable of primitive type, or type String, that is initialized with a constant expression.
//    Constants in java are usually named with all uppercase letters and with underscores between words.
//    A static constant means we access it via the type name.
//    we saw this with the Ineger.MAX_VALUE
//
//    These all mean the same thing on an interface:
//    double MILES_TO_KM = 1.60934;
//    final double MILES_TO_KM = 1.60934;
//    public final double MILES_TO_KM = 1.60934;
//    public static final double MILES_TO_KM = 1.60934;

//    I don't have to declare the interface type abstract,
//    because this modifier is implicitly declared for all interfaces.

//    so, I don't have to declare any method abstract

//    In fact, any method declared without a body, is really implicitly declared both public and abstract.

//    The three declarations shown on this side, result in the same thing, under the covers
    public abstract void takeOff();
    abstract void land();
    void fly();



    //    If you omit an access modifier on a class member, it's implicitly package private.
    //    If you omit an access modifier on an interface member, it's implicitly public.

//    Changing the access modifier of a method in an interface is not allowed, because all methods in an interface are implicitly public, and abstract, so you can't make them private or protected.

    default FlightStages transition(FlightStages stage){
//        System.out.println("transition not implemented on "+getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transition from " + stage + " to " + nextStage);
        return nextStage;
    };

//    Default Method:
//    Just like overriding a method on a class, you have three choices when you override a default method on an interface.
//    1. You can choose not to override it at all. the default method will directly execute in all the classes that implements an interface or extend the class.
//    2. You can override the method and write code for it, so that the interface method isn't executed.
//    3. Or you can write your own code, and invoke the method on the interface, as part of your implementation.

}
interface Trackable {
    void track();
}
enum FlightStages implements Trackable{GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED){
            System.out.println("Monitoring "+this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal()+1)%allStages.length]; // by using this you can go from 1 stage to the next one.
    }
}

record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
class Satellite implements OrbitEarth{
    public void archieveOrbit(){
        System.out.println("Orbit achieved!");
    };

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
// Interfaces can be extended, similar to classes using the extends keyword.
//This interface requires all classes to implement both the OrbitEarth and the FlightEnabled abstract methods.
interface OrbitEarth extends FlightEnabled{
    void archieveOrbit();
    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description){
        description = stage +": "+description;
        log(description);
    }
}

// unlike a class, an interface can use the extends expression with multiple interfaces:
//interface OrbitEarth extends FlightEnabled, Trackable{}

//an interface doesn't implement another interface, so the code on this slide won't compiler.
// interface OrbitEarth implements FlightEnabled, Trackable{} ---> this is wrong. we can't use implements clause in this case.
public abstract class Animal {
    public abstract void move();
}
