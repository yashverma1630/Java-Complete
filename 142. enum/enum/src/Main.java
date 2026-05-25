import java.util.*;
public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUE; // assigning value to the variable of DayOfTheWeek class. the

        System.out.println(weekDay);

        for(int i=0; i<10; i++) {
            weekDay = getRandomDay();
            //System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal()); // just like the indexes the ordinal value in enum starts with 0.
            // so the ordinal value of TUE will be 2.

//            if(weekDay.equals(DayOfTheWeek.FRI)){
//                System.out.println("Found a Friday !!!");
//            }

            switchDayOfWeek(weekDay);
        }
        for (Topping topping : Topping.values()){
            System.out.println(topping.name()+" : "+topping.getPrice());
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal()+1; // ordinal is like index of array. it starts from 0 just like index of array.

        switch(weekDay){
            case WED -> System.out.println("Wednesday is Day "+weekDayInteger);
            case SAT -> System.out.println("Saturday is Day "+ weekDayInteger);
            case TUE -> System.out.println("Tuesday is Day "+weekDayInteger);
            case THU -> System.out.println("Thursday is Day "+weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)+
                    weekDay.name().substring(1).toLowerCase()+
                    "day is Day "+weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values(); // The array is created as allDays

        return allDays[randomInteger];
    }
}
