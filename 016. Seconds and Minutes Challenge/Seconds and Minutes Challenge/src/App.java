import java.util.*;
public class App {
    public static void main(String[] args){
        System.out.println(getDurationString(-3945));
        System.out.println(getDuratioString(-65, 45));
        System.out.println(getDuratioString(65, 145));
        System.out.println(getDuratioString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds){

        if (seconds<0){
            return ("Invalid data for seconds ("+seconds+"), must be a positive integer value");
        }
        int minutes = seconds/60;
        // int hours = minutes/60;

        // int remainingminutes = minutes%60;
        // int remainingseconds = seconds%60;

        // return (hours + "h " + remainingminutes + "m " + remainingseconds + "s");
        return getDuratioString(minutes, seconds%60);

    }

    public static String getDuratioString(int minutes, int seconds){

        if(minutes<0){
            return ("Invalid data for minutes ("+minutes+"), must be a positve integer");
        }

        else if(seconds<0 || seconds>59){
            return ("Invalid data for seconds ("+seconds+"), must be a between 0 to 59");
        }
        int hours = minutes/60;
        int remainingminutes = minutes%60;

        return(hours + "h " + remainingminutes + "m " + seconds + "s");
    }
}
