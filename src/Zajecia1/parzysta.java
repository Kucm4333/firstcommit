package Zajecia1;

import java.util.Scanner;

public class parzysta {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Integer number;
        System.out.println("Podaj liczbę : ");
        number = sc1.nextInt();

        // pierwsza czesc zadania
        if (number % 2 == 0) {
            System.out.println("Liczba jest Zajecia1.parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
        if (number % 3 == 0) {
            System.out.println("liczba jest podzielna przez 3");
        } else {
            System.out.println("liczba nie jest podzielna przez 3");
        }
        if (number % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 5");
        } else {
            System.out.println("Liczba nie jest podzielna przez 5");
// druga czesc zadania
        }
        for ( Integer i = 2; i <= 5; i++) {
                if (i % 5 == 0 && i % 3 ==0) {
                    System.out.println("FIzzbuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");

                }
                else if(i % 5 ==0  ){
                    System.out.println("Buzz");

                }
                else{
                    System.out.println(i);
                }
        }









    }
}