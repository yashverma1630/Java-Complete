import java.util.*;
public class App {
    public static void main(String[] args){
        int currentyear = 2024;
        String yearofbirth = "2003";
        String actualage = "20.9";

        int age = currentyear - Integer.parseInt(yearofbirth);
        Double ActualAge = Double.parseDouble(actualage);
        System.out.println("the age of person is "+age);
        System.out.print("but user is saying that his/her actual age is "+ActualAge);
    }
}
