import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        int l = str.length();
        String fstr="";
        for(int i =l-1; i>=0;i--){
            fstr+=str.substring(i,i+1);
        }

        System.out.print(fstr);
    }
}
