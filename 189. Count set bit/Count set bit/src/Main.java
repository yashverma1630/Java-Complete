// Complete Explanation:
// 13 = 000_ _ _ 01101 (n)
// 12 = 000_ _ _ 01100 (n-1)
// 13 & 12 = 000_ _ _ 01100 (n & (n-1)) => count = 1
// 12 = 000_ _ _ 01100 (n)
// 11 = 000_ _ _ 01011 (n-1)
// 12 & 11 = 000_ _ _ 01000 (n & (n-1)) => count = 2
// 8 = 000_ _ _ 01000 (n)
// 7 = 000_ _ _ 00111 (n-1)
// 8 & 7 = 000_ _ _ 00000 (n & (n-1)) => count = 3
// stop

public class Main {
    public static int countSetBits(int num){
        int count = 0;
        while (num != 0) {
            num = num & (num-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num =13;

        System.out.println("Number of set bits in number 13 is "+ countSetBits(num));
    }
}
