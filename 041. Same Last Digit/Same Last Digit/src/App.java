import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int a = scn.nextInt();
        System.out.print("Enter number2 : ");
        int b = scn.nextInt();
        System.out.print("Enter number2 : ");
        int c = scn.nextInt();
        System.out.print(SameLastDigit(a,b,c));
    }
    public static boolean SameLastDigit(int a, int b, int c){
        if(a<10 || a>1000 || b<10 || b>1000 || c<10 || c>1000){
            return false;
        }

        else if (a%10==b%10 || b%10==c%10 || c%10==a%10){
            return true;
        }

        else{
            return false;
        }
    }
}
