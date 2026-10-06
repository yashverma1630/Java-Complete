// Complete Explanation:
// find the rightmost set bit of a number.
// n= 12 -> 1100
// ~n = 0011
// ~n + 1 = 0100
// n & (~n + 1) = 1100 & 0100 = 0100 = 4.


public class Main {
    public static int isRightBitSet(int n){
        return (n & (~n)+1);
        // or you can simply return n & -n; which is equivalent to the above expression
    }
    public static void main(String[] args) {
        int num =12;

        System.out.println("the rightmost bit of number 12 is "+isRightBitSet(num));
    }
}
