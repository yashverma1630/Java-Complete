import java.util.*;
public class Main {
    public static int[] reverseArray(int[] arr, int left, int right){
        if(left >= right){
            return arr;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right]=temp;

        return reverseArray(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length-1)));
    }
}
