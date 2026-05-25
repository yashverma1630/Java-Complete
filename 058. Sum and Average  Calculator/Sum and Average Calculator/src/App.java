import java.util.*;
public class InputCalculator {
    // write code here
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long average = 0;
        int count =1;
        
        Scanner scn = new Scanner(System.in);
        while(true){
            try{
                int number = scn.nextInt();
                sum+=number;
                average = Math.round((double)sum/count);
                count++;
            }catch(InputMismatchException e){
                System.out.println("SUM = "+sum + " AVG = "+average);
                break;
            }
        }
    }
}