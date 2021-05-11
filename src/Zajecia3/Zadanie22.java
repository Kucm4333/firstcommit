package Zajecia3;

import java.util.Scanner;
class zadanie22 {
    public static void main(String[] args) {
        String day;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwę dnia tygodnia");
        day = input.next();
        switch (day) {
            case "poniedziałek":
                System.out.println('1');
                break;
            case "wtorek":
                System.out.println('2');
                break;
            case "środa":
                System.out.println('3');
                break;
            case "czwartek":
                System.out.println('4');
                break;
            case "piątek":
                System.out.println('5');
                break;
            case "sobota":
                System.out.println('6');
                break;
            case "niedziela":
                System.out.println('7');
                break;
            default:
                System.out.println("ERROR");
        }
    }
}