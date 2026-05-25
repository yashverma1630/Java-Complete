import java.util.*;
public class App {
    public static void main(String[] args){
        for(double i=7.5; i<10; i+=0.25){
            double InterestAmmount = CalculateInterest(100, i);
            if(InterestAmmount>8.5){
                break;
            }
            System.out.println("100 at "+i+"% Interest = "+InterestAmmount);
        }

    }
    public static double CalculateInterest(double ammount, double InterestRate){
        double Interest = (ammount*(InterestRate/100));
        return Interest;
    }
}
