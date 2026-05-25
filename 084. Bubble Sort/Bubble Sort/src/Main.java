import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Integer a[] = new Integer[n];

        for(int k =0; k<n; k++){
            a[k]=scn.nextInt();
        }

        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int x:a){
            System.out.print(x+" ");
        }


    }
}
