public class Main {
    public static int fectorial(int n){
        if(n==1){
            return 1;
        }
        return n*fectorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fectorial(5));
    }
}
