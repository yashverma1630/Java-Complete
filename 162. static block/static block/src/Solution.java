import java.util.*;

public class Solution {
    // Write your code here
    public static int B;
    public static int H;
    public static boolean flag =true;

//    static block executes only once when the class loads.
//    it is used to initialize static variables or to perform any setup that is required before the class can be used.
    static{
        Scanner scn = new Scanner(System.in);
        try{
            System.out.print("Enter Breadth: ");
            B=scn.nextInt();
            System.out.print("Enter Height: ");
            H=scn.nextInt();
            if(B<=0 || H<=0){
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            flag = false;
            System.out.println("java.lang.Exception: "+e.getMessage());
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

