package Zajecia1;

import java.util.Scanner;
public class Zadanie4 {
    public static void main (String[] args){
        // dane
       Double cm;
       Double inch;

        System.out.println("prosze podac liczbe");
       Scanner wejscie = new Scanner(System.in);
       cm = wejscie.nextDouble();

        inch = cm/2.54;

       System.out.println("podana dlugosc w cm to bedzie w calach:");
        System.out.println(inch);

    }
}
