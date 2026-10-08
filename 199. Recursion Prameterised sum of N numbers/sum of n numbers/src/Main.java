public class Main {
    public static void sumOfN(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumOfN(i-1, sum+i);
    }
    public static void main(String[] args) {
        sumOfN(5, 0);
    }
}
