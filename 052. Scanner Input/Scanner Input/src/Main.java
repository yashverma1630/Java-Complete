import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("What is your current year ? ");
        String cyear = scn.nextLine();
        int currentyear = Integer.parseInt(cyear);
        try {
            System.out.print(getInputFromScanner(currentyear));
        }catch(NullPointerException e){
            System.out.print(getInputFromScanner(currentyear));
        }

    }

    public static String getInputFromScanner(int currentyear){
        Scanner scn = new Scanner(System.in);
        System.out.print("Hi! What's your name ? ");
        String name = scn.nextLine();
        System.out.println("Hi! "+name+". Thanks for joining the course ...");
        System.out.print("What's your year of birth ? ");
        String yearofbirth = scn.nextLine();
        int age = currentyear - Integer.parseInt(yearofbirth);
        return (name +",your age is "+ age);
    }
}
