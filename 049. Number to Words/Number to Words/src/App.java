import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scn.nextInt();
        numberToWords(number);
    }
    public static void numberToWords(int number){
        int num = reverse(number);
        int l = getDigitCount(number);
        if(num<0){
            System.out.print("Invalid Value");
        }
        else{
            for(int i=0;i<l;i++){
                int lastdigit=num%10;
                String str = switch (lastdigit){
                    case 0->"Zero";
                    case 1->"One";
                    case 2->"Two";
                    case 3->"Three";
                    case 4->"Four";
                    case 5->"Five";
                    case 6->"Six";
                    case 7->"Seven";
                    case 8->"Eight";
                    case 9->"Nine";
                    default->"";
                };
                System.out.print(str+" ");
                num/=10;
            }
        }
    }
    public static int reverse(int number){
        int reversedNumber=0;
        if(number<0){
            number=-number;
            while(number>0){
                reversedNumber= (reversedNumber*10)+(number%10);
                number/=10;
            }
            reversedNumber=-reversedNumber;
        }
        else{
            while(number>0){
                reversedNumber= (reversedNumber*10)+(number%10);
                number/=10;
            }
        }
        return reversedNumber;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        else if(number==0){
            return 1;
        }
        int count = 0;
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }
}
