// How iterator works.
// iterator has points to the starting position initially.
// iterator.hasNext() checks if the next position has value in it or not.
// iterator.next() is used to get the value in next position.
// iterator.next() gets the value from the list and goes to the empty position to point to the next element.

// iterator flow :

// Initial position of iterator-> START
// iterator.hasNext()-> true
// iterator.next() -> gets the element and goes to the empty position to point next element.
// 1st element got.
// iterator is at empty position pointing to the next element ->
// 2nd element
// iterator.hasNext() -> true
// iterator.next() --> got the element.
// iterator is at empty position and pointing to the 3rd element.
// 3rd element.


// var Iterator vs ListIterator:
// An Iterator is forwards only and only supports the remove method.
// A ListIterator allows you to navigate both forwards and backwards.
// Besides the remove method, it also supports the add and set methods,
// which function as you probably expect.
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Alice Springs");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Darwin");
        placesToVisit.add("Canberra");
        placesToVisit.add("Sydney");
        placesToVisit.add("Hobart");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Toowoomba");

        testIterator(placesToVisit);
        testListIterator(placesToVisit);

    }

    public static void testIterator(LinkedList<String> list){
        var iterator =list.iterator();

        while(iterator.hasNext()){
//            System.out.println(iterator.next()); // you can use it to get the element.

            if(iterator.next().equals("Brisbane")) iterator.remove();
        }

        System.out.println("Linked List using normal iterator: "+list);
    }

    public static void testListIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("Darwin")){
                iterator.add("Lake Wivenhoe");
            }
        }
        System.out.println("Linked List using listIterator : "+list);
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("reversed array list : "+list);

        var iterator2 = list.listIterator(3); // it will start the iterator from index 3.
    }
}
