import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        Double n = scn.nextDouble();
        System.out.print("Enter Second Number : ");
        Double m = scn.nextDouble();

        if(AreEqualByThreeDecimalSpaces(n, m)){
            System.out.print("The First Number "+ n + " and The Second Number "+ m + " are Equal.");
        }
        else{
            System.out.print("The First Number "+ n + " and The Second Number "+ m + " are not Equal.");
        }

    }
    public static boolean AreEqualByThreeDecimalSpaces(double n, double m){
        int a = (int)(n*1000);
        int b = (int)(m*1000);
        if(a==b){
            return true;
        }
        else{
            return false;
        }
    }
}