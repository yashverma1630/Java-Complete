import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        scn.nextLine();

        Person[] arr = new Person[n];
        int index=0;

        for(int i=1;i<=n;i++){
            System.out.print("Enter Name"+i+": ");
            String Name = scn.nextLine();
            System.out.print("Enter Age"+i+": ");
            int Age = scn.nextInt();
            scn.nextLine();
            System.out.println();
            Person person= new Person(Name, Age);
//            System.out.println("Name"+i+": "+person.getName());
//            System.out.println("Age"+i+": "+person.getAge());
            arr[index]=person;
            index++;

        }
        System.out.println("************");
        System.out.println("Stored Data: ");
        System.out.println("************");
        System.out.println();


//        for(int j=0; j<n;j++){
//            System.out.print("Name"+(j+1)+": "+person.getName());
//        } Why it doesn't work!!! ... Find out the error and try fix it ...
        int num=1;
        for(Person p:arr){
            System.out.println("Name"+num+": "+p.getName());
            System.out.println("Age"+num+": "+p.getAge());
            System.out.println();
            num++;
        }
    }
}
