import java.util.*;
public class App {
    public static void main(String[] args){
        int n = 0;
        while (n<60){
            n+=5;
            if(n%25==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
