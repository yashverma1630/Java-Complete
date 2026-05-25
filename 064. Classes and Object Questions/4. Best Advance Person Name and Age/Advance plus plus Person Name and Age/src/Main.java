import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Taking input from user for number of entries...
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        scn.nextLine();
        System.out.println();

        // creating array object of class Person
        Person arr[] = new Person[n];
        int index=0;

        for(int i=1;i<=n;i++){
            // Taking input of Name and Age from user for nth number...
            System.out.print("Enter Name"+i+": ");
            String Name = scn.nextLine();
            System.out.print("Enter Age"+i+": ");
            int Age = scn.nextInt();
            scn.nextLine();
            System.out.println();
            // Storing values (Name and Age) to object or we can say instance of class...
            // the object is reference or we can say address of the Stored data..
            Person person= new Person(Name, Age);
            // Storing object in the the array...
            arr[index]=person;
            index++;

        }
        System.out.println("************");
        System.out.println("Stored Data: ");
        System.out.println("************");
        System.out.println();

        // Printing Name and Age from the array ...
        for(int j=0; j<n;j++){

            System.out.println("Name"+(j+1)+": "+arr[j].getName());
            System.out.println("Age"+(j+1)+": "+arr[j].getAge());
            System.out.println();
        }
    }
}
