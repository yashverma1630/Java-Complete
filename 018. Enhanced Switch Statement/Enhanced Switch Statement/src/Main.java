// in enhanced switch case no break; is used.
// -> is used instead of :
// { } brackets are used when multiline statements.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int SwitchValue = scn.nextInt();

        switch(SwitchValue){
            case 1 ->{ System.out.print("Value is 1");}
            case 2 -> System.out.print("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Value may be 3, 4 or 5 ");
                System.out.println("Exact value is "+SwitchValue);
            }
            default -> System.out.println("You are inside default");
        }
    }
}
