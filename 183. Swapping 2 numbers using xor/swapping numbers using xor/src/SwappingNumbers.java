public class SwappingNumbers {

    public static void main(String[] args) {
        int a = 2;
        int b = 9;

        System.out.println("Before swapping: a = "+ a +", b = "+b);
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
