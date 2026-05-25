// This is User Name Entry Pojo Code

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("How many entries you want ? ");
        int n = scn.nextInt();
        User a [] = new User[n];
        int i =0;
        int check = -1; // it will keep adding the no. of data entered in the code
        // and if the data entered is less than the size of array object
        // then we will be able to print that much data only.
        boolean flag = true; // it is used to get out of the loop if some condition is satisfied.
        scn.nextLine(); // it is just a fix for the next line error. (ignore).

        // Now here do while is used because we have to ask do you want to continue to
        // enter more data after the 1st entry.
        do{
            if(i>0){
                System.out.print("Do you want to continue ? ");
                String decision = scn.nextLine();

                if(decision.equals("no")){
                    flag = false;
                    break;
                }
            }

            System.out.print("Enter User Name "+ (i+1) +" : " );
            String userName = scn.nextLine();

            System.out.print("Enter Email "+ (i+1) +" : " );
            String email = scn.nextLine();

            System.out.print("Enter Phone no. "+ (i+1) +" : " );
            String phoneNo = scn.nextLine();

            System.out.print("Enter Strong Password "+ (i+1) +" : " );
            String password = scn.nextLine();

            System.out.println();

            User u = new User(userName, email, phoneNo, password);
            a[i] = u;

            System.out.print(u);
            System.out.println();

            i++;
            check++;
        }while(i<n && flag==true);

        System.out.println("Final Data");

        //below check is no. of data enetered.
        for(int j =0; j<=check;j++){
            System.out.println(a[j]);
        }
    }

    // Happy coding
}