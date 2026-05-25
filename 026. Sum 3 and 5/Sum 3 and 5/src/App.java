import java.util.*;
public class App {
    public static void main(String[] args){
        int counter=0;
        int sum = 0;
        System.out.print("First 5 numbers those met the conditions are : ");
        for(int i = 1; counter<5 && i<=1000; i++){
            if(i%3==0 && i%5==0){
                System.out.print(i + " ");
                sum += i ;
                counter++;
            }
        }
        System.out.println();
        System.out.print("Sum of numbers that are divisible by both 3 and 5 is ");
        System.out.println(sum);
    }
}
