//code to check 1st three prime numbers only
import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter start : ");
        int start = scn.nextInt();
        System.out.print("Enter end : ");
        int end = scn.nextInt();
        if(end>=1000){
            System.out.print("Oops range limit exeeded ! it should be less than or equal to 1000");
        }
        else{
            int counter=0;
            for(int n = start;counter<3&&n<end;n++){
                if(isPrime(n)){
                    System.out.print(n+" ");
                    counter++;
                }
    
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=2){
            return (n==2);
        }

        for(int divisor=2; divisor<n;divisor++){
            if(n%divisor==0) return false;
        }

        return true;
    }
}
