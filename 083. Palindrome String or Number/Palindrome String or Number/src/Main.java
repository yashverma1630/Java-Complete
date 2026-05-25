import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int l = s.length();
        String str="";

        for(int i =l-1; i>=0; i--){
            str+=s.substring(i,i+1);
        }

        if(s.equals(str)){
            System.out.print("Yes, it's Palindrome");

        }else{
            System.out.print("NO, it's not Palindrome");
        }

    }
}
