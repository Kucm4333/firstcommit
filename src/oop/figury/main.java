package oop.figury;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // chcemy miec kalkulator, ktory zczytuje od uzytkownika nazwe figury oraz jej niezbedne wymiary
        // i oblicza obwod i pole powierzchni

        System.out.println("Podaj figure:");
        Scanner input = new Scanner(System.in);
        String figura = input.nextLine();
        // equals porownuje nam obiekty, a == to co mamy w pamieci
        if ( figura.equals("kolo")) {
            System.out.println(" podaj promien");
            double r = input.nextDouble();
            kolo kolo = new kolo(r);
            System.out.println("wymiary kola ");
            System.out.println("obwod : " + kalkulator.obliczobwod(kolo));
            System.out.println("pole : " + kalkulator.obliczpole(kolo));
        }
        else if ( figura.equals("prostokat")) {
            System.out.println("podaj a");
            double a = input.nextDouble();
            System.out.println("podaj b");
            double b = input.nextDouble();
            prostokat prostokat = new prostokat(a, b);
            System.out.println("Wymiary prostokata");
            System.out.println("obwod " + kalkulator.obliczobwodp(prostokat));
            System.out.println("pole " + kalkulator.obliczpolep(prostokat));
        }
        else if ( figura.equals("trojkat")) {
            System.out.println("podaj boki");
            double a =  input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            trojkat trojkat = new trojkat ( a , b , c );
            System.out.println("Wymiary trojkata");
            System.out.println("obwod " + kalkulator.obwodtrojkata(trojkat));
            System.out.println(" Pole " + kalkulator.poletrojkata(trojkat));
        }
            else {
            System.out.println("nie ma takiej figury");
        }
    }
}
