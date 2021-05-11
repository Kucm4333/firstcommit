package Zajecia3;

import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args){
        Double a;
        Double b;
        String c;
        Double wynik;
        Scanner input = new Scanner(System.in);
        System.out.println("prosze podac wartosc liczby");
        a = input.nextDouble();
        System.out.println("Prosze podac druga wartosc liczby");
        b = input.nextDouble();
        System.out.println("Prosze podac znak");
        c = input.next();


        switch (c) {
            case "+": {
                wynik = a + b;
                System.out.println("wynik: " + wynik);
                break;
            }
            case "-":{
                wynik = a - b;
                System.out.println("wynik: " + wynik);
                break;
            }
            case "/":{
                wynik = a/b;
                System.out.println("wynik: " + wynik);
                break;
            }
            case "*":{
                wynik = a*b;
                System.out.println("wynik: " + wynik);
                break;
            }
            case "^": {
                wynik =Math.pow(a,b);
                System.out.println("wynik: " + wynik);
                break;
            }
            case "?": {
                wynik = Math.pow(a,(1/b));
                System.out.println("wynik: " + wynik);
                break;
            }
            default: {
                System.out.println("ERROR");
                break;
            }

        }
// if pisze sie zdecydowanie wiecej, a switch case uzywa sie rzadziej do wyizolowanych przypadkow jezeli wiemy z jakimi danymi bedzie nam dane pracowac //













    }
}
