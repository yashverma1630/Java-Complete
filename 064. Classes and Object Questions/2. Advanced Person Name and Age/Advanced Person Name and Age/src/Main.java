import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        scn.nextLine();

        for(int i=1;i<=n;i++){
            System.out.print("Enter Name"+i+": ");
            String Name = scn.nextLine();
            System.out.print("Enter Age"+i+": ");
            int Age = scn.nextInt();
            scn.nextLine();
            Person person= new Person(Name, Age);
            System.out.println("Name"+i+": "+person.getName());
            System.out.println("Age"+i+": "+person.getAge());

        }
    }
}
