import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scn.nextInt();
        System.out.print("Digit sum of number "+number+" is "+DigitSum(number));
    }

    public static int DigitSum(int number){
        if (number<0){
            return -1;
        }
        else{
            int sum = 0;
            int n = number;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            return sum;
        }
    }
}
