// Challenge :
// create ArrayList of Strings as groceries
// get input from user 0, 1 and 2
// if input = 0, then shut down the operation and print out the ArrayListl
// if input = 1, then add items in ArrayList but duplicates entries not allowed.
// if input = 2, then remove the items from groceries ArrayList.

package com.yash;
import java.util.*;

public class Main {
    // Method for adding items in groceries ArrayList
    public static void addItem(ArrayList<String> groceries){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter coma separated groceries items to add in list : ");
        List<String> itemsList = List.of(scn.nextLine().split(",")); // coma separated string List
        for(String addStr : itemsList){ // it will iterate through all the items in the list
            if(!groceries.contains(addStr)){ // if groceries doesn't contain the items entered in list then it will add them into groceries ArrayList
                groceries.add(addStr.trim());
            }
        }
    }

    // Method for removing items from groceries ArrayList
    public static void remItem(ArrayList<String> groceries){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter coma separated groceries items to remove from list : ");

        List<String> remItemsList = List.of(scn.nextLine().split(",")); // coma separated string List

        for(String remStr : remItemsList){ // it will iterate through all the items in the list
            if(groceries.contains(remStr.trim())){ // if groceries ArrayList contains the items entered in list then it will remove them from groceries ArrayList
                groceries.remove(remStr.trim()); // trim used to remove white spaces from left and right of the string
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList <String> groceries = new ArrayList<>(); // String ArrayList

        boolean flag = true;

        while(flag) {
            System.out.println("Enter Operation to perform on ArrayList groceries ! ");
            System.out.print("Enter 0 to stop, 1 to add items and 2 to remove items : ");
            switch (scn.nextInt()) {
                case 0 -> { // if 0 then shut down. exit from while loop
                    System.out.println("Operations are shut down.");
                    flag=false;
                }
                case 1 -> { // if 1 then add items
                    addItem(groceries);
                }
                case 2 -> { // if 2 then remove items
                    remItem(groceries);
                }
            }
        }

        System.out.print(groceries); // Finally prints the ArrayList.
    }
}
