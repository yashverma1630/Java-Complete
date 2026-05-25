package com.yash;

import java.util.Arrays; //Arrays is class in java.util package
import java.util.Random; //Random is class in java.util package
public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10); // creates array of length 10 with random numbers
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5); // this will fill the complete array with the same number. in this case it is 5
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length); // it will copy all the elements from thirdArray to fourth Array
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray); // if you sort the fourthArray now, it will not impact the third array.
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5); // it will only copy 1st 5 elements of an array
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15); // it will copy all the elements of the array and extra space will be filled with default value that is 0 for integers.
        System.out.println(Arrays.toString(largerArray));

//        Binary Search Method:
//        in this search intervals are continually split into two.
//        to implement Binary Search method on array. Your array has to be sorted.
//        if there are duplicate values in the array, there's no guarantee which one it'll match on.
//        elements must be coparable. Trying to compare instances of different types will lead to errors and invalid results.

//        This method returns:
//        1. the position of a match, if found.
//        2. it returns a -1 when no match was found.
//        3. if your array has duplicate values and you need to find the first element, other methods should be used.

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark")>=0){
            System.out.println("Found Mark in the list");
        }

//        compare 2 arrays if they are equal.
//        2 Arrays are equal if all the numbers are in the same position and equal.

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {5, 2, 3, 4, 1};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

    private static int[] getRandomArray(int len) { // array class is used to get the array out by utilising or with the help of method.

        Random random = new Random();
        int[] newInt = new int[len];
        for(int i=0; i<len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
