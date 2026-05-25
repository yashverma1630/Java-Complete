package com.yash;
import java.util.*;
public class Main {
    static void main(String[] args) {
//        ArrayList arr = new ArrayList(); you can define it like this as well.
        ArrayList <Object> arr = new ArrayList<>();
//        arr.add will simply add values in data.
        arr.add(new GroceryStore("Milk"));
        arr.add(new GroceryStore("Paneer"));
        arr.add(new GroceryStore("Protein Millets", "Protein Snack", 2));

        System.out.println(arr);

        arr.add(1, new GroceryStore("Protein Shake")); // adds element to index 1 and shifts other elements to right

        System.out.println(arr);

        arr.set(1, new GroceryStore("High protein paneer")); // replace the element at perticular value.

        System.out.println(arr);

        arr.remove(1); // removes element at perticular position.

        System.out.println(arr);

    }
}

class GroceryStore {
    String name;
    String type;
    Integer count;
    GroceryStore(String name, String type, int count){
        this.name=name;
        this.type=type;
        this.count = count;
    }

    GroceryStore (String name){
        this(name, "Dairy", 1);
    }

    public String toString(){
        return ("GroceryStore{ name : "+name+", type : "+type+", count : "+count+" }");
    }
}
