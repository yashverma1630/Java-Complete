public class Main {
    public static void main(String[] args) {

        Workout workout = new Workout("This is a Workout plan");
        Workout push = new Push("This is Push Workout plan");
        Workout pull = new Pull("This is Pull Workout plan");
        Workout legs = new Legs("This is Leg Workout plan");

        startWorkout(workout);
        startWorkout(push);
        startWorkout(pull);
        startWorkout(legs);

    }
    //    polymorphic method. it gives output according to entered object of the perticular class.
    public static void startWorkout(Workout workout){
        workout.genericWorkout();
    }
}


