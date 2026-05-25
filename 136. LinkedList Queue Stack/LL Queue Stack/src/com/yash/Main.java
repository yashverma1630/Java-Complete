// A Queue is a First-In, First-Out (FIFO) Data Collection
// A queue is standing in a line.

// if you want to remove an item, you poll the queue, getting the first element or person in the line.
// if you want to add an item, you offer it onto the queue, sending it to the back of the line.

// Single-ended queues always process elements from the start of the queue.
// double-ended queue allows access to both the start and end of the queue.

// A LinkedList can be used as double ended queue.
// ----------------------------------------------------
// A Stack is Last-In, First-Out (LIFO) Data Collection
// stack is a vertical pile of elements, one on top of another. real time example. Books on shelf one on top of another.
// The book that is placed on stack in the last will be picked first.
// when you add an item, you push it onto the stack.
// if you want to get an item, you'll take the top item, or pop it from the stack
// So, we use push and pop


package com.yash;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        // var placesToVisit = new LinkedList<String>(); // you can define linkedlist in this way as well. but you have to mandatorily defile type in diamond operator in case of var.

        placesToVisit.add("Sydney"); // it will add sydney at index 0.
        placesToVisit.add(0,"Canberra"); // it will add sydney at index 0 and shift other elements to the right
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit); // Method is called to add more elements
        System.out.println(placesToVisit);

        removeElements(placesToVisit); // Method is called to remove the elements
        System.out.println(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin"); // it will add element at the 1st place in Linked List
        list.addLast("Hobart"); // itw ill add element at the last place in Linked List
        // queue methods
        list.offer("Melbourne"); // enters element at the last.
        list.offerFirst("Brisbane"); // enters element at the first
        list.offerLast("Toowoomba"); // enters element at the last.
        // Stack Methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4); // it will remove element from index 4
        list.remove("Brisbane"); // it will remove element named Brisbane

        System.out.println(list);
        String s1 = list.remove(); // it will remove element from the index 0 in the Linked List
        System.out.println(s1 + "was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + "was removed"); // it will remove the 1st element in the Linked List

        String s3 = list.removeFirst(); // it will remove the last element in the Linked List
        System.out.println(s3 + "was removed");

        // Queue/Deque poll methods
        String p1 = list.poll();  // removes element from 1st place using queue method in Linked List
        System.out.println(p1 + "was removed");
        String p2 = list.pollFirst(); // removes element from 1st place using queue method in Linked List
        System.out.println(p2 + "was removed");
        String p3 = list.pollLast(); // removes element from 1st place using queue method in Linked List
        System.out.println(p3 + "was removed");

        // in stack we do push and pop
        list.push("Sydney"); // it will add element at top of stack which is index 0
        list.push("Brisbane"); // it will add element at top of stack which is index 0
        list.push("Canberra"); // it will add element at top of stack which is index 0
        System.out.println(list);

        String p4 = list.pop(); // it will remove the element from the top of stack.
        System.out.println(p4 + "was removed");

    }
}
