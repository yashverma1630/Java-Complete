import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scn.nextInt();
        System.out.print("Sum of First and Last Digit of number "+number+" is "+sumFirstAndLastDigit(number));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        else{
            int LastDigit = 0;
            int FirstDigit = 0;
            int Original1 = number;
            int Original2 = number;
            
            while(Original1>=10){
                Original1/=10;
            }
            FirstDigit=Original1;
            LastDigit=Original2%10;
            
            return(FirstDigit+LastDigit);
        }
    }
}
