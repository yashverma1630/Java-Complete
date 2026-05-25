import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scn.nextInt();
        printSquareStar(number);
    }
    public static void printSquareStar(int number){
        if(number<5){
            System.out.print("Invalid Value");
        }
        else{
            for(int i =1 ; i<=number;i++){
                for(int j=1; j<=number;j++){
                    if(i==1 || j==1 || i==number || j==number || i==j || j==(number-i+1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
