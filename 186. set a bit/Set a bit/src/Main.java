// Complete Explanation:
// 16 = 000_ _ _ 10000
// 1 << 2 = 000_ _ _ 00100
// 16 | (1 << 2) = 000_ _ _ 10100 so after setting the 2nd bit we get 20

public class Main {
    public static int set(int num, int k){
        return (num | (1 << k));
    }
    public static void main(String[] args) {
        int num =16;
        int k=2;

        System.out.println("After doing the set operation on the 2th bit of number 16 we get number "+set(num, k));
    }
}
