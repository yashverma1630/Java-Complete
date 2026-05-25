import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scn.nextInt();
        System.out.print("The number "+ number + " is ");CheckNumber(number);
    }

    public static void CheckNumber(int number){
        System.out.print((number>0)?"Positive":(number<0)?"Negative":"Zero");
    }
}
