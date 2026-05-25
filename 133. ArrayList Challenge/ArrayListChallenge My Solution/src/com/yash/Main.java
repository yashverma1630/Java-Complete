// Challenge :
// create ArrayList of Strings as groceries
// get input from user 0, 1 and 2
// if input = 0, then shut down the operation and print out the ArrayListl
// if input = 1, then add items in ArrayList but duplicates entries not allowed.
// if input = 2, then remove the items from groceries ArrayList.

package com.yash;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList <String> groceries = new ArrayList<>(); // groceries ArrayList

        boolean flag = true;

        while(flag) {
            System.out.println("Enter Operation to perform on ArrayList groceries ! ");
            System.out.print("Enter 0 to stop, 1 to add items and 2 to remove items : ");
            int operation = scn.nextInt(); // entry of operation 0, 1, 2
            scn.nextLine(); // to resolve the next line error
            switch (operation) {
                case 0 -> {
                    System.out.println("Operations are shut down.");
                    flag=false;
                }
                case 1 -> { // if case 1 then add the unique items in the groceries ArrayList (Note : Duplicate items not allowed)
                    System.out.print("Enter coma separated groceries items to add in list : ");
                    String str = scn.nextLine(); // enter the coma separated list
                    List<String> itemsList = List.of(str.split(",")); // coma separated String is converted into list
                    for(String addStr : itemsList){ // iterate through the list.
                        if(!groceries.contains(addStr)){ // if groceries doesn't have duplicate item then it will add that item to the groceries ArrayList
                            groceries.add(addStr.trim());
                        }
                    }

                }
                case 2 -> {
                    System.out.print("Enter coma separated groceries items to remove from list : ");
                    String str = scn.nextLine(); // coma separated string
                    List<String> remItemsList = List.of(str.split(",")); // it will convert coma separated string to list using split method

                    for(String remStr : remItemsList){ // it will iterate through remItemsList.
                        if(groceries.contains(remStr.trim())){ // if groceries ArrayList contains items entered in the remItemsList then it will remove the items from the groceries ArrayList.
                            groceries.remove(remStr.trim());
                        }
                    }

                }
            }
        }

        System.out.print(groceries); // Finally prints out the groceries ArrayList.
    }
}
