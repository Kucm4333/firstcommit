package time;

import java.time.LocalDate;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String instring = input.next();

        LocalDate parsedlocaldate = LocalDate.parse(instring);
        System.out.println(parsedlocaldate.plusDays(10));
    }
}
