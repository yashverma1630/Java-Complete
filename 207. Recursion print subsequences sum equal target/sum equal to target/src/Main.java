import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printSubsequencesSumEqualToK(int i, int arr[], ArrayList<Integer> result, int sum, int k){
        if(i==arr.length){
            if(sum==k){
                System.out.println(result.toString());
                return;
            }
            return;
        }
        result.add(arr[i]);
        sum+=arr[i];
        printSubsequencesSumEqualToK(i+1, arr, result, sum, k);

        result.remove(result.size()-1);
        sum-=arr[i];
        printSubsequencesSumEqualToK(i+1, arr, result, sum, k);
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 1};
        int k=2;
        ArrayList<Integer> result = new ArrayList<>();
        printSubsequencesSumEqualToK(0, arr, result, 0, k);
    }
}
