public class Main {
    public static void backtrackNto1(int i, int n){
        if(i>n){
            return;
        }
        backtrackNto1(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        backtrackNto1(1, n);
    }
}
