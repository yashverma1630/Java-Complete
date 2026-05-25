// Simple && operator
// both the values should be true only then if statement will be executed

// Condition Table : 
// T T T
// T F F
// F T F
// F F F
public class Main {
    public static void main(String[] args) {
        int topscore=80;
        int secondscore=40;

        if((topscore==80) && (secondscore>=40)){
            System.out.print("Output is here");
        }

        else{
            System.out.print("No output");
        }
    }
}
