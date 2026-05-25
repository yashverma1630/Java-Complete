
package com.yash;
import java.util.Arrays;
// earlier you may have seen public static void main(String[] args)
// here String[] args. args is an array of type string. that means we can pass string array to this method.
// but this signature can be written in a slightly different way.
// we can replace the brackets after the String type, which we know tells us this method will take an array of String.

// And we can instead replace that with three periods.

// This is a special designation for java will take zero, one, or many Strings as arguments to this method and create
// an array with which to process them in the method.

// The array will be called args and be of type String.

public class Main {
    public static void main(String... args) {
        System.out.println("Bye World");
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray)); // without bracket
        System.out.println(Arrays.toString(sArray)); // with bracket
    }

    private static void printText(String... textList){

        for(String t : textList) {
            System.out.println(t);
        }
    }
}
