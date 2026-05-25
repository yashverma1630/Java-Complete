public class Workout {
    private String description;

    public Workout(String description) {
        this.description = description;
    }
    
    public void genericWorkout(){
        System.out.println(getClass().getSimpleName()+" -> some kind of workout !");
    }
}

class Push extends Workout{
    public Push(String description) {
        super(description);
    }
    
    public void genericWorkout(){
        System.out.println(getClass().getSimpleName()+" -> Push workout includes chest, shoulder & triceps.");
    }
}

class Pull extends Workout{
    public Pull(String description) {
        super(description);
    }

    public void genericWorkout(){
        System.out.println(getClass().getSimpleName()+" -> Pull workout includes Back and Biceps.");
    }
}

class Legs extends Workout{
    public Legs(String description) {
        super(description);
    }

    public void genericWorkout(){
        System.out.println(getClass().getSimpleName()+" -> Legs workout includes Legs.");
    }
}