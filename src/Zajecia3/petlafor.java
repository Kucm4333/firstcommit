package Zajecia3;

import java.util.Scanner;

public class petlafor {
    public static void main(String[] args) {
        Integer a, b=1;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        for ( Integer i = 1; i <= a; i++) {

            b *= i; // przypisuje b wartosc i i ją mnozy
        }
        System.out.println("i = " + b);
    }

}
