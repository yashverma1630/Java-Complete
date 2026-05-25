// Ternery Operator : used for comparison
// String s = ( Condition )? returns this if true : returns this if false ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter car name : ");
        String car = scn.nextLine();

        String s = (car.equals("Thar Rox"))?"car is Thar Rox":"it is not Thar Rox";

        System.out.print(s);
    }
}
