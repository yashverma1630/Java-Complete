public class Main {
    public static void swap(int arr[], int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static int pivot(int arr[], int low , int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<=j){

            while(arr[i] <= pivot && i<=high){
                i++;
            }
            while(arr[j] > pivot && j>=low){
                j--;
            }

            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pivotIndex = pivot(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 3, 2, 1};
        quickSort(arr, 0,arr.length-1);

        for(int x: arr){
            System.out.print(x);
        }
    }
}
