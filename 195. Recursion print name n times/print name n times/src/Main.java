public class Main {
    public static void printName(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("code with Yash !");
        printName(i+1, n);
    }
    public static void main(String[] args) {
        int n=5;
        printName(1, n);
    }
}
