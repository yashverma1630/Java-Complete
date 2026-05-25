package com.yash;
import java.util.*;

public class ListAndArrayList {
    public static void main(String[] args) {
        String[] items = {"apples", "banana", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
//        List is immutable. you can't make changes in list.
//        but in ArrayList you can.
//        So, you can convert List to ArrayList

        ArrayList <String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList <String> nextList = new ArrayList<>(List.of("Pickles", "mustard", "Cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
