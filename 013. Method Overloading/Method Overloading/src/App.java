// Method overloading is you can create methods with same name but different parameters
// as you can see in below code there are 2 methods with the same name CalculateScore but they both have different parameters.

import java.util.*;
public class App {
    public static void main(String[] args){
        int firstNewscore = CalculateScore("Yash", 200);
        System.out.println("1st Student's NewScore is " + firstNewscore);

        double secondNewscore = CalculateScore(200);
        System.out.println("2nd Student's NewScore is "+ secondNewscore);
    }

    public static int CalculateScore(String name, int score){
        System.out.println("Student name is "+ name + " and score is "+ score);
        return (score*100);
    }

    public static double CalculateScore(double score){
        System.out.println("Student name is Yashasvi and score is " + score);
        return (Math.pow(score,2));
    }
}
