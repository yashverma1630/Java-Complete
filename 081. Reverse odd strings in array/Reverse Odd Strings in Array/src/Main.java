import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();


        String a[] = str.split(" ");

        int l = a.length;

        for(int i = 0 ;i<l; i++){
            if(a[i].length()%2!=0){
                String s="";
                for(int j =a[i].length()-1; j>=0;j--){
                    s+=a[i].substring(j,j+1);
                }
                a[i]=s;
                s=" ";
            }
        }

        for(String x:a){
            System.out.print(x+" ");
        }






    }
}
