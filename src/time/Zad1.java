package time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Zad1 {
    public static void main(String[] args) {
        // 3 implementacje daty :
        // java.util.Date
        // java.sql.Data
        // java.time.LocalDate
        // localDate - datę, localTime - czas , LocalDateTime jedno i drugie

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;

        System.out.println(localDateTime);
        System.out.println("Std date formatter: " + dateFormatter.format(now));
        System.out.println(localDate);
    }
}
