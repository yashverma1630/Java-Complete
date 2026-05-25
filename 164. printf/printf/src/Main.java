import java.util.*;
public class Main {
    public static void main(String[] args) {
        String name = "Yash";
        char favChar='K';
        int num = 22;
        double decNum = 18.57687;
        Date time = new Date();

        System.out.printf("My name is  %s. It is %d years old.\n", name, num); // to print the string and the number
        System.out.printf("My favourite character is %C. \n", favChar); // to print the character
        System.out.printf("the decimal number is %.2f. \n", decNum); // to print values to the 2 decimal places
        System.out.printf("today's date is %tc. \n", time); // to print the current date and time.
    }
}
