import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();
        System.out.println(day+" Stands for "+printDayOfWeek(day));
        System.out.println(day+" Stands for "+printWeekDay(day));
    }

    public static String printDayOfWeek(int day){

        String DayOfWeek = switch(day){
            case 0->{yield "Sunday";}
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            default->"Invalid Day";
        };

        return DayOfWeek;
    }

    public static String printWeekDay(int day){
        String s = "Invalid Day";
        if(day == 0 ){
            s = "Sunday";
        }
        
        else if(day == 1){
            s = "Monday";
        }

        else if(day == 2){
            s = "Tuesday";
        }

        else if(day == 3){
            s = "Wednesday";
        }

        else if(day == 4){
            s = "Thursday";
        }

        else if(day == 5){
            s = "Friday";
        }

        else if(day == 6){
            s = "Saturday";
        }

        return s;
    }
}
