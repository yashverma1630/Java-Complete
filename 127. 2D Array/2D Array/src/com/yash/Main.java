package com.yash;
// 2-Dimensional Array
// ways to declare 2 D array:

// 1st way
// int[][] array = {
//         {1,2,3},
//         {11,12,13},
//         {21, 22, 23},
//         {31,32,33}
// }

//2nd way
// int[][] array = {{1, 2, 3}, {11, 12, 13}, {21, 22, 23}, {31, 32, 33}};

//      j=0     j=1     j=2     j=3
// i=0 [0][0]  [0][1]  [0][2]  [0][3]
// i=1 [1][0]  [1][1]  [1][2]  [1][3]
// i=2 [2][0]  [2][1]  [2][2]  [2][3]

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = "+array2.length);

        for(int[] outer : array2){
            System.out.println(Arrays.toString(outer));
        }

        for(int i=0; i<array2.length; i++){
            var innerArray = array2[i];
            for(int j = 0; j< innerArray.length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("_".repeat(20));

        for (var outer:array2) {
            for (var element:outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("_".repeat(20));

        for(int i=0; i<array2.length; i++){
            var innerArray = array2[i];
            for(int j=0; j<innerArray.length; j++){
                array2[i][j] = (i*10) + (j+1);
            }
        }

//        for(var outer : array2){
//            for(var inner : outer){
//                System.out.print(inner + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array2));
    }
}
