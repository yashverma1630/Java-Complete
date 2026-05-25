// Simple code for understanding method declaration in java.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        int P = scn.nextInt();
        System.out.print("Enter Rate : ");
        int R = scn.nextInt();
        System.out.print("Enter Time : ");
        int T = scn.nextInt();
        System.out.print("Simple Interest = ");
//        Here method is called. and it will print SI
        SimpleInterest(P, R, T);
    }
//    Here method is declared. static means the method will be used here in this java file without creating instance.
//    and void means it will print something. it can be int, string, boolean, or anything else.
    public static void SimpleInterest(int P, int R, int T){
        int SI = (P*R*T)/100;
        System.out.print(SI);
    }
}
