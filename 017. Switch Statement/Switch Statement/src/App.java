import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int SwitchValue = scn.nextInt();

        switch (SwitchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("value is 3, 4 or 5");
                System.out.println("Actual value is " + SwitchValue);
                break;
            default:
                System.out.println("You are into the default case");
                break;
        }
    }
}
