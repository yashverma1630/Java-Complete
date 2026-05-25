import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.print("Largest Prime Factor of number "+ number + " is "+getLargestPrime(number));
    }
    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }
        int LargestPrime=-1;
        for(int i=number;i>=2;i--){
            if(number%i==0){
                boolean isPrime = true;
                for(int divisor=2; divisor<i; divisor++){
                    if(i%divisor==0){
                        isPrime = false;
                        break;
                    }
                }
                
                if(isPrime){
                    LargestPrime=i;
                    break;
                }
            }
        }
        return LargestPrime;
    }
}
