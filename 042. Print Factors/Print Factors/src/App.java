import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scn.nextInt();
        System.out.print("Factors of "+number+" are ");printFactors(number);

    }
    public static void printFactors(int number){
        if(number<1){
            System.out.print("Invalid Value");
        }
        else{
            int i=1;
            while(i<=number){
                if(number%i==0){
                    System.out.print(i+" ");
                }
                i++;
            }
        }
    }
}
