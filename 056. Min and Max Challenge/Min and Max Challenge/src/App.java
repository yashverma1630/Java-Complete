import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("This Program is to find the minimum and maximum number");
        System.out.println();
        System.out.print("What's your name ? ");
        String name = scn.nextLine();
        System.out.println();
        System.out.println("Hi! "+name+", Welcome to the program");
        System.out.println();
        int count = 1;
        Double Min = Double.MAX_VALUE;
        Double Max = Double.MIN_VALUE;
        boolean flag = true;
        do{
            System.out.println("*type any character to exit the program*");
            System.out.print("Enter Number #"+count+" : ");
            String n = scn.nextLine();
            System.out.println();
            try{
                Double number = Double.parseDouble(n);
                if(count==1){
                    Max=number;
                    Min=number;
                }
                else if(number<Min){
                    Min=number;
                }
                else if(number>Max){
                    Max=number;
                }
                count ++;
            }catch(NumberFormatException E){
                if(count==1){
                    Max=0.0;
                    Min=0.0;
                    System.out.println();
                    System.out.println("*No data is Entered*");
                }
                flag = false;
            }

        }while(flag);
        System.out.println("Maximum Value = "+Max);
        System.out.println("Minimum Value = "+Min);
    }
}
