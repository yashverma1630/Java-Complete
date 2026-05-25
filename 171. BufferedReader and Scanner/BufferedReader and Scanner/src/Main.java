// Note: you have to import IOException, BufferedReader, InputStreamReader for BufferReader input type.
// and Scanner for Scanner input type.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
//        BufferedReader
//        It always takes input in string later we have to convert that input into other data types. and it throws exception always. So, we have to look at that as well.
//        it is fast and takes less memory.
//        it reades full line clearly
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter BufferedReader Name1 : ");
        String name1 = br.readLine();
        System.out.print("Enter BufferedReader Number1 : ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.printf("BufferedReader Name1 : %s\n", name1);
        System.out.printf("BufferedReader Number1 : %d\n", num1);

//        Scanner
//        it was introduced later in java. it is used to take input of different types such as integer, double, String etc.
//        Scanner has inbuilt parsing.
//        it is slow and takes more memory.
//        it leaves new line buffer.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Scanner Name2 : ");
        String name2 = scn.nextLine();
        System.out.print("Enter Scanner Number2 : ");
        int num2 = scn.nextInt();

        System.out.printf("Scanner Name2 : %d\n", name2);
        System.out.printf("Scanner Number2 : %d\n", num2);



    }
}
