// Array List have
package com.yash;
import java.util.*;
public class Main {
    record GroceryItem (String name, String type, int count){
        public GroceryItem(String name){
            this(name, "DAIRY", 1);
        }
    }
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(); // Array list has Object type by default

        arr.add(1);
        arr.add("something");
        arr.add(new GroceryItem("Milk"));
        System.out.println("1st Array");
        System.out.println(arr);

        ArrayList <GroceryItem> arr2 = new ArrayList <>(); // only elements added in GroceryItem class will be stored in this array.

        arr2.add(new GroceryItem("PanCake", "Cake", 1));
        arr2.add(new GroceryItem("High Protein Milk"));
        System.out.println("2nd Array");
        System.out.println(arr2);
    }
}
