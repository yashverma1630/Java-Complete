import java.util.*;
public class Main {
    public static int[] reverseArray(int[] arr, int i){
        if(i>=arr.length/2){
            return arr;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;

        return reverseArray(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr, 0)));
    }
}
