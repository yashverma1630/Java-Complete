import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("How many Enteries you want? : ");
        int n = scn.nextInt();
        User a[] = new User[n];
        scn.nextLine();
        for(int i = 0; i<n; i++){
            System.out.print("Enter Username "+(i+1)+" : ");
            String Username = scn.nextLine();

            System.out.print("Enter Email "+(i+1)+" : ");
            String Email = scn.nextLine();

            System.out.print("Enter PhoneNo "+(i+1)+" : ");
            String PhoneNo = scn.nextLine();

            System.out.print("Enter Password "+(i+1)+" : ");
            String Password = scn.nextLine();

            User u = new User(Username,Email,PhoneNo,Password);
            a[i]=u;
            System.out.print(u);
            System.out.println();
        }

        System.out.println("Final Data");

        for(int j=0; j<n; j++){
            System.out.println(a[j]);
        }
    }
}
