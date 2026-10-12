import java.util.ArrayList;

public class Main {
    public static boolean firstSubsequenceSumEqualToK(int i, int arr[], ArrayList<Integer> result, int sum, int k){
        if(i==arr.length){
            if(sum==k){
                System.out.println(result);
                return true;
            }
            return false;
        }

        result.add(arr[i]);
        sum+=arr[i];
        if(firstSubsequenceSumEqualToK(i+1, arr, result, sum, k)==true){
            return true;
        }
        result.remove(result.size()-1);
        sum-=arr[i];
        if(firstSubsequenceSumEqualToK(i+1, arr, result, sum, k)==true){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        int k=2;
        ArrayList<Integer> result = new ArrayList<>();
        firstSubsequenceSumEqualToK(0, arr, result, 0, k);
    }
}
