import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Check Number : ");
        int n = scn.nextInt();
        System.out.print("The number "+n+(isPalindrome(n)?" is a Palindrome":" is not a Palindrome"));
        // String str = isPalindrome(n)?"The number is a Palindrome":"The number is not a Palindrome";
        // System.out.print(str);
    }

    public static boolean isPalindrome(int number){
        if(number<0){
            number=-number;
        }
        int reverse = 0;
        int original = number;
        while(number>0){
            reverse = (reverse*10)+(number%10);
            number/=10;
        }

        return reverse==original;
    }
}
