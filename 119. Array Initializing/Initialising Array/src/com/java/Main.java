package com.java;

// Arrays
// Arrays are used store data for similar data type
// it has fixed length. and length is provided in the new int [10] or new Integer [10]
// size of array is fixed and cannot be changed.
// indexing of array starts from 0. It's like 0, 1, 2, 3. the index of 3rd element will be 2.
// there are a lot of ways to initialise array
// int [] NameOfArray = new int [Size];
// double [] NameOfArray = new double [Size];
// Integer NameOfArray [] = new Integer [Size];
// Integer NameOfArray [] = new Integer [] {1,2,3,4}
// Integer NameOfArray [] = {1,2,3,4,5}

public class Main {
    public static void main(String[] args) {
        double [] doubleArray = new double[5];
        doubleArray[2]=42.5; // decimal number added at the 3rd position of the doubleArray.
        System.out.println("The third element in doubleArray = "+doubleArray[2]);

        Integer integerArray [] = new Integer[5];
        integerArray[3] = 28; // integer added at the 4th position of the array.
        System.out.printf("The fourth element in integerArray = %d%n", integerArray[3]);

        Integer [] a = {1, 2, 3, 4};
        for(int x:a){
            System.out.println(x);
        }

        System.out.println("*********");

        Integer [] b = new Integer [] {1,2,3};
        for(int y:b){
            System.out.println(y);
        }

        System.out.println("*********");

        Integer [] c;
        c = new Integer[] {2,4,6,8};

        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }


    }
}
