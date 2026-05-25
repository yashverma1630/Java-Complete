import java.util.*;
public class App {
    public static void main(String[] args){
        int newscore = CalculateScore(20);
        System.out.println("his new Score is "+newscore);
    }

    public static int CalculateScore(String name, int score){
        System.out.println("Student name is "+ name + " and his current score is "+score);
        return (score*100);
    }

    public static int CalculateScore(int score){
        return(CalculateScore("Yash", score)); // above method is called inside the method with default parameter
        //here Yash is default parameter that is set to method
    }
}
