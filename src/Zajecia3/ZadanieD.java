package Zajecia3;

import java.util.Scanner;
public class ZadanieD {
    public static void main(String[] args) {
        Double dystans;
        Double czas;
        Double predkosc;
        Double predkosch;
        Double predkoscm;
        Scanner input = new Scanner ( System.in);
        System.out.println("prosze podaj dystans w metrach: ");
        dystans = input.nextDouble();

        System.out.println("prosze podaj czas w godzinach: ");
        czas = input.nextDouble();

        predkosc=dystans/czas;
        System.out.println("predkosc w metrach na godzine: " + predkosc);
        predkosch=predkosc/3600;
        System.out.println("predkosc w metrach na sekunde: " + predkosch);
        predkoscm=predkosc/1609;
        System.out.println("Predkosc w milach na godzine: " + predkoscm);
        }
    }

