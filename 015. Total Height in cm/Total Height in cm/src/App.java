// Method declaration feet to inches
import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter feet: ");
        int feet = scn.nextInt();
        System.out.print("Enter inches: ");
        int inches = scn.nextInt();
//         System.out.print(convertToCentimeters(inches));
        System.out.print(convertToCentimeters(feet, inches));
    }

    public static double convertToCentimeters(int inches){
        double cm = (double) (inches*2.54);
        return cm;
    }

    public static double convertToCentimeters(int feet, int inches){
        return (convertToCentimeters((feet*12)+inches));
    }
}
