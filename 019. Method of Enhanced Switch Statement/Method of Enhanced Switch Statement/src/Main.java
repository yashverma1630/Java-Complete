import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String month = scn.nextLine();
        System.out.print(month+ " is in the quarter "+getQuarter(month));
    }

    public static String getQuarter(String month){

        return switch (month){
            case "January", "February", "March" -> { yield "1st";}
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default ->{
                String BadMonth = "Month is bad";
                yield BadMonth; // yield is used to return value for enahced switch statement
            }
        };
    }
}
