package com.yash;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // size of array is fixed but the ArrayList is resizeable.
//        String[] array = new String[10]; // Instantiating Arrays. Arrays of 10 elements is created.
//        ArrayList <String> arrayList = new ArrayList<>(); // Instantiating ArrayList. The compiler will check that only Strings are added to the ArrayList.

//        array = new String[] {"first", "Second", "Third"};
//        ArrayList<String> arrayList1 = new ArrayList<>(List.of("first", "Second", "third"));

        // you can get the elements from array from index. array[index].
        // you can get and set the elements in array through get and set. arrayList.get(index) and arrayList.set(index, value).

        // printing an array:
//        System.out.println(Arrays.toString(array));
        //for multidimensional we use Arrays.deepToString(array2d)


        // printing an ArrayList:
//        System.out.println(arrayList);
        // for multidimensional we use simple System.out.println(arrayList2d)

        // for arrays we can use binarySearch(array, element) *Array must be sorted*
        // for arrayList we can use contains(element). containsAll(list of elements). indexOdf(element). lastIndexOf(element).
        // when -1 is returned from these methods, no matching entry was found

//        String[] arr2 = {"first", "second", "third"};
//        Arrays.sort(arr2); // sorting in arrays

//        ArrayList<String> arrayList2 = new ArrayList<>(List.of("first", "second", "third"));
//        arrayList2.sort(Comparator.naturalOrder());
//        arrayList2.sort(Comparator.reverseOrder());
        // sorting in ArrayList

        // There are times when you'll want to switch between an Array and an ArrayList,
        // and there is support for this on both the Arrays class and the ArrayList class.
//        String[] originalArray = new String[] {"first", "second", "third"};
//        var originalList = Arrays.asList(originalArray);
        // The Arrays.asList method returns an ArrayList backed by an array.
        // ArrayList created by this method is not resizable.

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: "+originalList);
        System.out.println("array: "+Arrays.toString(originalArray));

//        any method we apply on list. it will all also effect the array.

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: "+Arrays.toString(originalArray));
//        in sorting Upper case letters are considered as lower case letters.

//        as this list is backed by array. so I cannot add or remove elements.

//        originalList.remove(0);
//        originalList.add("fourth");
//        the above 2 methods don't work

//        we can't resize this ArrayList because it is created by Array. and Array is not resizable.

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);


//        Using Arrays.asList.... Returned List is not resizable gut is mutable.
//        var newList = Arrays.asList("Sunday", "Monday", "Tuesday");
//        or
//        String[] days = new String[] {"Sunday", "Monday", "Tuesday"};
//        List<String> newList = Arrays.asList(days);

//        Using List.of... Reuturned list is immutable
//        var listOne = List.of("Sunday", "Monday", "Tuesday");
//        or
//        String[] days = new String[] {"Sunday", "Monday", "Tuesday"};
//        List<String> listOne = List.of(days);

//        Creating Arrays from ArrayLists
        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] stringArray = stringLists.toArray(new String[0]);
    }
}
