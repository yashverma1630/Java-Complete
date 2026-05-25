import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scn.nextInt();
        System.out.print("is "+number+" a perfect number? "+isPerfectNumber(number));
    }
    public static boolean isPerfectNumber(int number){
        boolean flag = false;
        if(number<1){
            flag = false;
        }
        else{
            int sum = 0;
            for(int i = 1; i<number;i++){
                if(number%i==0){
                    sum+=i;
                }
            }
            if (sum==number){
                flag=true;
            }
        }
        return flag;
    }
}
