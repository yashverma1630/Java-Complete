package com.yash;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<>(); // ArrayList created

        String[] items = {"apple", "banana", "oranges","yogurt", "Kiwi", "watermelon"}; // array of grocery items.
        List <String> list = List.of(items); // array is converted into list.

        arr.addAll(list); // arr.addAll(int[] some array) will add values in array list.

        System.out.println(arr);

        System.out.println("Third item : "+ arr.get(2)); // gets the element at index 2

        if(arr.contains("Kiwi")){ // if it contains milk then it will be executed.
            System.out.println("Yes it contains the element Kiwi");
        }

        arr.add("yogurt"); // adds string to arraylist
        System.out.println("first = "+arr.indexOf("yogurt")); // it finds the 1st index of the passed item from the arraylist. from left to right
        System.out.println("last = "+arr.lastIndexOf("yogurt")); // it finds last index of the passed item from the arraylist from right to left.

        System.out.println(arr);
        arr.remove(1); // removes element from index 1.
        System.out.println(arr);
        arr.remove("yogurt"); // it will remove the 1st element it matches from left to right.
        System.out.println(arr);

        arr.removeAll(List.of("apple", "watermelon")); // it will remove all the elements passed in list from array list.
        System.out.println(arr);

        arr.retainAll(List.of("Kiwi", "yogurt")); // it will retain the elements passed in list inside array list. rest all the elements will be deleted.
        System.out.println(arr);

        arr.clear(); // it will clear the arraylist. (removes all the elements)
        System.out.println(arr);

        if(arr.isEmpty()){ // it will check if the arraylist is empty or not.
            arr.addAll(Arrays.asList(items)); // if the arraylist is empty then it will add all the items in
        }

        System.out.println(arr);

        arr.sort(Comparator.naturalOrder()); // it will sort the elements in the array list. elements with upper case will come first.
        System.out.println(arr);

        arr.sort(Comparator.reverseOrder()); // it will sort the elements in the array list in reverse order.
        System.out.println(arr);

        var groceryArr = arr.toArray(new String [arr.size()]); // Arraylist is converted to array.
        System.out.println("List is converted to Arrays : "+Arrays.toString(groceryArr));
    }
}
