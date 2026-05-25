package com.yash;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers(); // created integer array using readInteger() method
        System.out.println(Arrays.toString(returnedArray)); // printed the array using Arrays.toString(array name) method

        int returnedMin = findMin(returnedArray); // min value is found using findMin(array name) method.
        System.out.println("min = "+returnedMin); // min value is printed that was stored in returnedMin variable.
    }

    private static int[] readIntegers() { // method to get create array of comma separated string of numbers.
        Scanner scn = new Scanner(System.in); // Scanner class for taking inputs
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scn.nextLine(); // scn.nextLine() is used to get the input in string.

        String[] splits = input.split(","); // creates array of string using split method that is comma separated.
        int[] values = new int[splits.length]; // now created integer array of same length as of string array.

        for(int i =0; i<splits.length;i++){
            values[i] = Integer.parseInt(splits[i].trim()); // converted string array's elements into integers and passed into integer array.
        }

        return values; // integer array is returned
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE; // int min is set to the maximum value of integer

        for(int i=0; i<array.length; i++){ // for loop to check if the number at the ith position is smaller than the min value. if yes the replace the value.
            if(array[i]<min){
                min = array[i];
            }
        }

        return min; // we got our minimum number
    }
}
