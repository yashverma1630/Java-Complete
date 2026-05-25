// if we don't add any values in array. all the indexes will get value as 0 by default. in case of int, double, or short.
// false default value for boolean.
// null default value for class type.


package com.java;

import java.util.Arrays; //this is used to use methods in Arrays in class. in this code we are using toString.
public class Main {
    public static void main(String[] args) {
        int[] newArray;
        newArray = new int[5];
        //below loop will add values in array in reverse order {5, 4, 3, 2, 1}.
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

//        Enhanced for loop, (the for each loop)
//        Basic for loop:
//        for (init; expression; increment) {
//             //block of statements
//        }

//        Enhanced for loop:
//        for (declaration : collection){
//            //block of statements
//        }

//        Note the difference between both the loops basic has (;) and Enhanced has (:)

        for (int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(newArray); // here we get the strange characters instead of array because it gets the value
                                      // from java.lang.object.toString method. we have to overrite the toString earlier but we can't do the same with arrays.

        System.out.println(Arrays.toString(newArray));
//        it provides values as e[0], e[1], e[2] ..... e[n].
        System.out.println();

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "hello";
        objectArray[1] = new StringBuilder("world");
        objectArray[2] = newArray; // it is nested array. array inside array.


        System.out.println(Arrays.toString(objectArray));

//        we can create Object of type array. and store values to it as arrays with index. even the nested arrays.


    }
}
