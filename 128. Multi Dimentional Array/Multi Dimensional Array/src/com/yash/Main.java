// Multi Dimensional Arrays
// these you can create 2D Arrays 3D Arrays. (Nested Arrays)
// below is how u can do it.
package com.yash;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Object[] anyArray = new Object[3]; // created array of object. inside u can put array of any type. it could be string, int anything. but it should be array only
        System.out.println(Arrays.toString(anyArray)); // to print the array.

        System.out.println("_".repeat(20));

        anyArray[0] = new String[] {"a", "b", "c"}; // simple array of type String at index 0 of anyArray
        System.out.println(Arrays.deepToString(anyArray)); // deepToString method is the better way to print the array.

        System.out.println("_".repeat(20));

        anyArray[1] = new String[][] { // 2D array of type String at index 1 of anyArray
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println("_".repeat(20));

        anyArray[2] = new int[2][2][2]; // empty 3D array of type int at index 2 of anyArray
        System.out.println(Arrays.deepToString(anyArray));

        for(Object element : anyArray){
            System.out.println("Element type = "+ element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object []) element)); // here we are printing object of arrays.
        }
    }
}
