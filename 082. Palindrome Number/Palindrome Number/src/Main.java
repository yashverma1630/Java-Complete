import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int orgnumber = n;
        int revnumber = 0;

        while(n>0){
            revnumber=revnumber*10+n%10;
            n=n/10;
        }

        if(orgnumber == revnumber){
            System.out.print("Yes it is palindrome.");
        }else{
            System.out.print("No it is not palindrome.");
        }
    }
}
