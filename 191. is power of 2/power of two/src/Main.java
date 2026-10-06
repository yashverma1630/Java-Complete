// Complete Explanation:
// A number is a power of two if it has exactly one set bit in its binary representation.
// The expression (n & (n - 1)) checks if n has only one set bit.
// 16 -> 10000
// 15 -> 01111
// 16 & 15 = 00000, which is 0, indicating that 16 is a power of two.
// 16 & 15 = 0, so 16 is a power of two.
public class Main {
    public static boolean isPowerOfTwo(int n){
        return (n > 0) && ((n & (n-1)) == 0);
    }
    public static void main(String[] args) {
        int num =16;

        System.out.println("Is number 16 a power of two? "+isPowerOfTwo(num));
    }
}
