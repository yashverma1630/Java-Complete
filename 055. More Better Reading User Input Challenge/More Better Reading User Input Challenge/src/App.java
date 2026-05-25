import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int count=1;
        Double sum=0.0;
        while(count<=5){
            System.out.print("Enter Number #"+count+" : ");
            String n = scn.nextLine();
            try{
                if(checkValid(n)){
                    sum+=Double.parseDouble(n);
                    count++;
                }
                else{
                    System.out.println("Negative Numbers are not allowed... Enter Positive numbers only");
                }
            }catch(NumberFormatException CharactersNotAllowed){
                System.out.println("Characters are not Allowed !!!... Only numbers are allowed");
            }
        }
        System.out.print("Final sum is : "+ sum);

    }

    public static boolean checkValid(String n){
        Double number = Double.parseDouble(n);

        if(number<0){
            return false;
        }

        return true;

    }
}
