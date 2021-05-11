package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {


        // podajemy date w formacie yyyy-mm-dd
        Scanner input = new Scanner(System.in);
        String instring = input.next();

        LocalDate parsedlocaldate = LocalDate.parse(instring);
        DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(custom.format(parsedlocaldate));

    }
}
