public class Main {
    public static void print1to5(int count){
        count++;
        // base condition.
        if(count>5){
            return;
        }
        System.out.println(count);
        print1to5(count);
    }
    public static void main(String[] args) {
        int count=0;
        print1to5(count);
    }
}
