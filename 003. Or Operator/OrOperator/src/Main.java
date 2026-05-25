// Simple or operator
// one of 2 conditions should be true to execute the if statement

// Condition Table :
// T T T
// T F T
// F T T
// F F F
public class Main {
    public static void main(String[] args) {
        int topscore=40;
        int secondscore=80;
        if(topscore<40 || secondscore>=80){
            System.out.print("Output is here");
        }
        else{
            System.out.print("No Output");
        }
    }
}
