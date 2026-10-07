public class Main {
    public static void printNTo1(int i){
        if(i<1){
            return;
        }
        System.out.println(i);
        printNTo1(i-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNTo1(n);
    }
}
