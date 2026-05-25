import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scn.nextInt();
        System.out.print("The Even Digit Sum of number "+ number + " is "+getEvenDigitSum(number));

    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        else{
            int sum = 0;
            while(number>0){
                int a = number%10;
                if(a%2==0){
                    sum+=a;
                }
                number/=10;
            }
            return sum;
        }
    }
}
