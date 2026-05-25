import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int end = scn.nextInt();
        int counteven = 0;
        int countodd = 0;
        while(number<=end){
            if(!isEven(number)){
                countodd++;
                number++;
                continue;
            }
            else{
                System.out.println("Even number : "+ number);
                counteven++;
                number++;
                if(counteven>=5){
                    break;
                }
            }
        }
        System.out.println("Total no. of even numbers found : "+ counteven);
        System.out.println("Total no. of odd numbers found : "+ countodd);
    }

    public static boolean isEven(int number){
        boolean flag = false;
        if(number%2==0){
            flag = true;
        }
        return flag;
    }
}
