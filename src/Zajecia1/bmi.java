package Zajecia1;

import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Double wzrost;
        Double waga;
        Double BMI;
        System.out.println("prosze podac wzrost w metrach:");
        Scanner input = new Scanner (System.in);
        wzrost = input.nextDouble();

        System.out.println("prosze podac wage:");
        Scanner input2 = new Scanner (System.in);
        waga = input2.nextDouble();

        BMI = waga / (wzrost*wzrost);
        System.out.println("wynik: " + BMI);
    }
}
