package com.yash;

// Array reference is how different variables refer to the same array.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5]; // myIntArray variable and anotherArray variable refers to same array.
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray)); // default value in array is 0 for all elements of type int.
        System.out.println("anotherArray = "+ Arrays.toString(anotherArray));

        anotherArray[0] = 1; // it will change the 1st place of array to 1.
        modifyArray(myIntArray); // now the second place in the array will be 2 according to modifyArray method declared below.

        System.out.println("after change myIntArray = "+Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array){ // this referes to same array.
        array[1] = 2; // in this method we set array[1] to 2.
    }
}
