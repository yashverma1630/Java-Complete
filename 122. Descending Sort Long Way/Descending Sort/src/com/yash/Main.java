// Descending sort of array. long method.
// we can perform collections sort reverse order to quickly sort the array in reverse order.
package com.yash;

import java.util.*;
public class Main {
    public static void main(String[] args){
//        initialising array
        int[] a = randomArray(5);
        System.out.println(Arrays.toString(a));

//        Array sorted in ascending order
        Arrays.sort(a);

        System.out.println("Array Sorted in ascending order : ");
        System.out.println(Arrays.toString(a));

        System.out.println("Descending order sorting started : ");

//        Descending order sorting of array has been started.
//        flag is set to true. so that for loop inside while loop can continue its work until the array is sorted in descending order.
        boolean flag = true;
        while(flag){
            flag=false; //it is set to false to stop the while loop. and the flag is set true again if the array is still not sorted to descending order.
            for(int i=0; i<a.length-1; i++){
                if(a[i]<a[i+1]){ //it will check if the 1st element is smaller than the second element in array. if yes then it will swap them.
                    // swapping of elements.
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    flag =true; //flag is set to true again so that we can check recheck if the array is sorted in descending order or not. by re-unning while and for loops.

                    System.out.println(Arrays.toString(a)); // it will print the steps of swapping in the code for your understanding.

                }
            }
        }

        System.out.println();
//        Now finally Array is sorted in descending order.
        System.out.println("Descending Order of Array : ");
        System.out.println(Arrays.toString(a));

    }

//    Method to create Array of random number using Random class.
    private static int[] randomArray(int len){
        Random random = new Random();
        int[] newArray = new int[len];
        for(int i=0; i<len ;i++){
            newArray[i]=random.nextInt(100);
        }

        return newArray;
    }
}
