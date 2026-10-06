// Check if the kth bit is set or not in a number.
// for Example: 5 = 000_ _ _ 101 so is 2nd bit is set.
// proper demonstration:
// 5 = 000_ _ _ 101
// 1 << 2 = 000_ _ _ 100
// 5 & (1 << 2) = 000_ _ _ 100 != 0 so 2nd bit is set.

public class Main {
    public static boolean isSet(int num, int k){
        return (num & (1 << k)) != 0;
    }
    public static void main(String[] args) {
        int num =5; // 000_ _ _ 101 so is 2nd bit is set.
        int k=2;

        if(isSet(num, k)){
            System.out.println(k + "th bit is set in " + num);
        }
        else{
            System.out.println(k + "th bit is not set in " + num);
        }
    }
}
