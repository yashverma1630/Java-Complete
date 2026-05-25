import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Add weights to left side of Barbell : ");
        int l = scn.nextInt();
        System.out.print("Add weights to right side of Barbell : ");
        int r = scn.nextInt();
        System.out.print("Total Barbell Weight "+l+" Kg + "+r+" Kg = "+CountBarbellWeight(l, r)+ " Kg");
    }
    public static int CountBarbellWeight(int l, int r){
        int BarbellWeight = 20;
        int TotalBarbellWeight= BarbellWeight + l + r;
        return TotalBarbellWeight;
    }
}
