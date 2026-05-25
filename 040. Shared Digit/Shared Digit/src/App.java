import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = scn.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = scn.nextInt();
        System.out.print("The num1 "+ num1 + " and the num2 "+ num2 +(hasSharedDigit(num1, num2)?" have shared digits":" do not have shared digits"));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1<10 || num1>99 || num2<10 || num2>99){
            return false;
        }
        else{
            boolean flag = false;
            int checker = num2;
            while(num1>0){
                while(checker>0){
                    if(num1%10==checker%10){
                        flag = true;
                        break;
                    }
                    checker=checker/10;
                }
                checker=num2;
                num1=num1/10;
            }
            return flag;
        }
    }
}
