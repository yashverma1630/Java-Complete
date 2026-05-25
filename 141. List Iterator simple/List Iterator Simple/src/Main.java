import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList <String> l = new LinkedList<>();

        l.add("Yash");
        l.add("Yashasvi");
        l.add("Dhruv Sen");
        l.add("Sid");
        l.add("Dhruv Malik");
        l.add("Dhruv gym");
        l.add("Aayush jhaa");

        ListIterator<String> it = l.listIterator(); // initialised iterotor. by using this you can iterate forward and backward.
        while(it.hasNext()){ // it will check if iterator has next index or not. if yes then it will printout the element.
            System.out.println(it.next());
        }

        System.out.println("-".repeat(15)); // just for clean code.

        String starting = l.getFirst();
        String last = l.getLast();

        ListIterator newIt = l.listIterator(1); // new iterator initialized
        System.out.println(starting);// this will print the 1st string manually
        while(newIt.nextIndex() < l.size() - 1){ // this will print elements till second last string.
            System.out.println(newIt.next());
        }
        System.out.println(last); // this will print the last string manually.

    }
}
