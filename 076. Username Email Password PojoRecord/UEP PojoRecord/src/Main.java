import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Do You want to Enter Data ? (Yes/No) ");
        String valid = scn.nextLine();
        System.out.println();

        List<User> a = new ArrayList<>();
//        List<UEPrecord> a = new ArrayList<>();
//        User a[] = new User[9999];
//        UEPrecord a[] = new UEPrecord[9999];
        int count = 0;

        boolean flag=false;

        if(valid.equalsIgnoreCase("yes")){
            flag=true;
        }
        else{
            flag=false;
        }

        while(flag==true){
            if(count>0){
                System.out.print("Do you want to enter data one more time ?(Yes/No) ");
                String val=scn.nextLine();
                valid=val;
                System.out.println();
            }

            if(valid.equalsIgnoreCase("no")){
                flag=false;
                break;
            }
            System.out.print("Enter Username: ");
            String Username= scn.nextLine();

            System.out.print("Enter Email: ");
            String Email = scn.nextLine();

            System.out.print("Enter Password: ");
            String Password = scn.nextLine();

            User user = new User(Username, Email, Password);
//            UEPrecord uep = new UEPrecord(Username, Email, Password);

//            a[i]=user;
//            a[i]=uep;
            a.add(user);
//            a.add(uep);

//            System.out.println(uep);
            System.out.println(user);
            System.out.println();

            count++;
        };

        if(a.isEmpty()){
            System.out.println("Oops!!! No Data is Entered...");
        }
        else{
            System.out.println();
            System.out.println("***** Final Data *****");
            System.out.println();
            for(User user: a){
                System.out.println(user);
            }
//            for(UEPrecord uep: a){
//                System.out.println(uep);
//            }
        }

    }
}
