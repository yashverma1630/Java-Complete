public class Main {

    public static void backtrack1ToN(int i){
        if(i<1){
            return;
        }
        backtrack1ToN(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        backtrack1ToN(n);
    }
}
