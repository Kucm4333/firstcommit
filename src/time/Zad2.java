package time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Zad2 {
    public static void main(String[] args) {
        // 3 implementacje daty :
        // java.util.Date
        // java.sql.Data
        // java.time.LocalDate
        //localDate - datę, localTime - czas , LocalDateTime jedno i drugie
        Clock clock = Clock.system(ZoneId.of("America/Denver"));
        LocalDateTime now = LocalDateTime.now(clock);
        LocalDateTime localDateTime = LocalDateTime.now(clock);
        LocalDate localDate = LocalDate.now(clock);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;








        System.out.println("czas w denwer" + localDateTime);
        System.out.println(localDateTime);
        System.out.println("Std date formatter: " + dateFormatter.format(now));
        System.out.println(localDate);
    }
}
