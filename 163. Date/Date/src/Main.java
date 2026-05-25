import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
//        current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date is : "+today);

//        particular date is displayed
        LocalDate someDay1 = LocalDate.of(2024,8,15);
        System.out.println(someDay1);

//        particular date is displayed using enum Month.FEBRUARY
        LocalDate someDay2 = LocalDate.of(2012, Month.FEBRUARY, 29);
        System.out.println(someDay2);

//        current time.
        LocalTime localTime = LocalTime.now();
        System.out.println("current local time is : "+localTime);

//        current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("current local date and time is : "+localDateTime);

//        local time of particular zone.
        LocalTime zoneTime = LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("zone time for America Los Angeles is : "+zoneTime);

//        you can list all the available time zones using ZoneId.getAvailableZoneIds()
//        for(String zone: ZoneId.getAvailableZoneIds()){
//            System.out.println(zone);
//        }

//        Date Time Formatter is used to remove T separation between date and time.
        LocalDateTime localDateTime2 = LocalDateTime.now();
        DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedLocalDateTime = dtFormat.format(localDateTime2);

        System.out.println("Formatted local date and time is : "+formattedLocalDateTime);

//        sample date formatter
//        yyyy-MM-dd	"1988-09-29"
//        dd/MM/yyyy	"29/09/1988"
//        dd-MMM-yyyy	"29-Sep-1988"
//        E, MMM dd yyyy	"Thu, Sep 29 1988"
    }
};;
