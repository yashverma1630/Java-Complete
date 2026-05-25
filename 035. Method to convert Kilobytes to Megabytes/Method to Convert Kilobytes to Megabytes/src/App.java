import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int kilobytes = scn.nextInt();
        KbtoMb(kilobytes);
    }
    public static void KbtoMb(int kilobytes){
        if(kilobytes<0){
            System.out.print("Invalid Value");
        }
        else{
            int mb = kilobytes/1024;
            int remainingkb = kilobytes%1024;
            System.out.print(kilobytes + " kb = "+mb+" MB and "+remainingkb+" KB");
        }
    }
}
