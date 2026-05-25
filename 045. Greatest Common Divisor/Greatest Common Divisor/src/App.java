import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = scn.nextInt();
        System.out.print("Enter second number : ");
        int second = scn.nextInt();
        System.out.print("The Greatest Common Divisor of numbers "+first+" and "+second+" is "+getGreatestCommonDivisor(first, second));

    }
    public static int getGreatestCommonDivisor(int first, int second){
        int f = 0;
        if(first<10 || second<10){
            return -1;
        }
        else{
            for(int i=Math.min(first, second);i>0;i--){
                if(first%i==0 && second%i==0){
                    f = i;
                    break;
                }
            }
            return f;
        }
    }
}
