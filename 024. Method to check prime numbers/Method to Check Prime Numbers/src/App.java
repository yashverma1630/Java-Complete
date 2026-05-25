import java.util.*;
public class App {
    public static void main(String[] args){
        System.out.print(isPrime(2));
    }
    public static boolean isPrime(int n){
        if(n<=2){
            return(n==2);
        }

        for(int divisor=2; divisor<n; divisor++){
            if(n%divisor==0){
                return false;
            }
        }
        return true;
    }
}
