public class Main {
    public static int sumOfN(int n){
        if(n == 0){
            return 0;
        }
        return n+sumOfN(n-1);
    }
    public static void main(String[] args) {

    }
}
