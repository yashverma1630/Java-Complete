// Complete Explanation:
// toggle a bit 0 -> 1 or 1 -> 0
// 13 = 000_ _ _ 01101
// 1 << 2 = 000_ _ _ 00100
// 13 ^ (1 << 2) = 000_ _ _ 01001 so after toggling the 2nd bit we get 9

public class Main {
    public static int toggle(int num, int k){
        return (num ^ (1 << k));
    }
    public static void main(String[] args) {
        int num =13;
        int k=2;

        System.out.println("After doing the toggle operation on the 2th bit of number 13 we get number "+toggle(num, k));
    }
}
