import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList <String> actors = new LinkedList<>();

        // simply adds names in the Linked list with variable name actor and type string
        actors.add("Salman Khan");
        actors.add("Hrithik Roshan");
        actors.add("Sushant Singh Rajput");
        actors.add("Sanjay Dutt");
        actors.add("Akshay Kumar");

        System.out.println(actors);

        // get is used to get the element from the linked list
        System.out.println("Retrieved Element : "+actors.get(4));

        System.out.println("First Element = "+actors.getFirst()); // gets the first element of the linked list
        System.out.println("Last Element = "+actors.getLast()); // gets the last element of the linked list

        System.out.println("Hrithik Roshan is at position: "+ actors.indexOf("Hrithik Roshan")); // returns the index of string entered
        System.out.println("Sanjay Dutt is at position: " + actors.lastIndexOf("Sanjay Dutt")); // returns the last index of string added

        // Queue retrieval method (FIFO)
        System.out.println("Element from element() = " + actors.element()); // it returns the 1st element in linkd list without removing it.
        System.out.println("Element from peek() = "+actors.peek()); // it also returns the 1st element of the linked list without removing it. it returns null if the list is empty
        System.out.println("Element from peekFirst() = "+ actors.peekFirst()); // it returns the 1st element
        System.out.println("Element from peekLast() = "+actors.peekLast()); // it returns the last element

        // traversing

        // Normal Traversing
        System.out.println("actors name starts at "+ actors.getFirst());
        for(int i = 1; i<actors.size(); i++){
            System.out.println("--> From: "+ actors.get(i-1)+" to "+actors.get(i));
        }
        System.out.println("actors name ends at "+actors.getLast());

        System.out.println("-".repeat(30));

        // Normal Traversing
        String previousActor = actors.getFirst();
        for(String hero : actors){
            System.out.println("From : "+previousActor+" -> "+hero);
            previousActor=hero;
        }

        System.out.println("-".repeat(30));

        // Iteration using ListIterator<String> iterator = actors.listIterator(1); starting index for iteration
        System.out.println("Actors starts at "+actors.getFirst()); // gets the 1st element of the list
        String previousHero = actors.getFirst(); // get's the 1st element from the list and store it into previousHero variable.
        ListIterator<String> iterator = actors.listIterator(1); // way to define iteration.

        while(iterator.hasNext()){ // iterator.hasNext() checks that if there is value in iteration.
            var hero = iterator.next(); // stores value in hero variable.
            System.out.println("-->From" + previousHero + " to "+hero);
            previousHero = hero;
        }
        System.out.println("Actors ends at "+actors.getLast()); // gets last element from the list.

    }
}
