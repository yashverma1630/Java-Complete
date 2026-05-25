import java.util.*;
public class Main {
    public static void main(String[] args) {
        int currentyear = 2024;
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
        boolean validDOB = false;
        int age = 0 ;
        do{
            System.out.println("Enter a year of birth >= " + (currentyear-125)+ " and <= "+(currentyear));
            try{
                age = checkData(currentyear, scn.nextLine());
                validDOB = age < 0? false : true;
            }catch(NumberFormatException CharactersNotAllowed){
                System.out.print("Characters not Allowed !!!, Enter the year of birth again.");
            }
        }while(!validDOB);
        return (name +", your age is "+ age);
    }

    public static int checkData(int currentyear, String yearofbirth){
        int dob = Integer.parseInt(yearofbirth);
        int minimumYear = currentyear-125;
        if(dob<minimumYear || dob>currentyear){
            return -1;
        }

        return (currentyear-dob);
    }
}
