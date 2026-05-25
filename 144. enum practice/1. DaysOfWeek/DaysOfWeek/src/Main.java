public class Main {
    public enum DaysOfWeek{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args){
        DaysOfWeek today = DaysOfWeek.TUESDAY;
        System.out.println(today);
    }
}