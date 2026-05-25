import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();
        Integer a[] = new Integer[n];
        for(int i=0 ; i<n; i++){
            a[i]= scn.nextInt();
        }

        for(int x: a ){
            System.out.print(x+" ");
        }
        System.out.println();

        Set hashset = new HashSet();

        for(int j=0; j<n; j++){
            hashset.add(a[j]);
        }

        System.out.println(hashset);
    }
}