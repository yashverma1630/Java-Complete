public class Main {
    public static int countSubsequencesSumEqualToK(int i, int arr[], int sum, int k){
        if(i==arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        sum+=arr[i];
        int l = countSubsequencesSumEqualToK(i+1,arr,sum,k);
        sum-=arr[i];
        int r = countSubsequencesSumEqualToK(i+1,arr,sum,k);

        return l+r;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        int k=2;
        System.out.println(countSubsequencesSumEqualToK(0, arr, 0, k));
    }
}
