package Zadania;
import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args) {


        int a = 0, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wielkość tabliczki\nBok a:");
        a = input.nextInt();
        System.out.println("Bok b:");
        b = input.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print("+");
            for (int j = 1; j <= b; j++) {
                System.out.print(String.format("%6s", "-----+"));
            }
            System.out.println();
            for (int j = 1; j <= b; j++) {
                if (i * j < 10)
                    System.out.print(String.format("%6s", "|  " + (i * j) + "  "));
                else if (i * j < 100) System.out.print(String.format("%5s", "|  " + (i * j) + " "));
                else System.out.print(String.format("%5s", "| " + (i * j) + " "));
            }
            System.out.print("|");
            System.out.println();
            if (i == a) {
                System.out.print("+");
                for (int j = 1; j <= b; j++) {
                    System.out.print(String.format("%6s", "-----+"));
                }
            }
        }
    }
}
