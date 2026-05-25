import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4,1 ,3, 5));
        System.out.println("ArrayList before removing duplicate numbers : "+numbers);
        HashSet<Integer> setNumber = new HashSet<>(numbers); // set is used to removed duplicate elements as set doesn't allow user to enter duplicate.

        numbers.removeAll(numbers); // it will empty the previous list
        numbers.addAll(setNumber); // it will add all the elements in the list without duplicate elements.

        System.out.println(numbers);

    }
}
