import java.util.*;
public class App {
    public static void main(String[] args){
        int count=1;
        int sum=0;
        do{
            String n = System.console().readLine("Enter Number #"+count+" : ");
            try{
                if(checkValid(n)){
                    sum+=Integer.parseInt(n);
                    count++;
                }
                else{
                    System.out.println("Negative Numbers are not allowed... Enter Positive numbers only");
                }
            }catch(NumberFormatException CharactersNotAllowed){
                System.out.println("Characters are not Allowed !!!... Only numbers are allowed");
            }
        }while(count<=5);
        System.out.print("Final sum is : "+ sum);

    }

    public static boolean checkValid(String n){
        int number = Integer.parseInt(n);

        if(number<0){
            return false;
        }

        return true;

    }
}
