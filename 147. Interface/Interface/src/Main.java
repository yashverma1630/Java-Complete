// Declaring an interface
// Declaring an interface is similar to declaring a class, using the keyword interface, where you would use the keyword class.

// public interface FlightEnabled {}
// A class is associated to an interface by using the implements clause in the class declaration.
// public class Bird implements FlightEnabled{
// }

// Because of this declaration, we can use FlightEnabled as the reference type and assign it an instance of bird.
// in this code sample, I create a new Bird object but assign it to the FlightEnabled variable named flier.
// FlightEnabled flier = new Bird();

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled*FlightEnabled.KM_TO_MILES;

        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for(var flier: fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for(var flier: fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for(var flier: fliers){
            flier.land();
        }
    }
}
