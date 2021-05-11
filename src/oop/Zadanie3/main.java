package oop.Zadanie3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        Kalkulator.znak = input.next();
        //Kalkulator.znak = "+";

        switch (Kalkulator.znak) {
            case "+": {
                System.out.println(Kalkulator.dodawanie(a,b));
                break;
            }
            case "-": {
                System.out.println(Kalkulator.odejmowanie(a,b));
                break;
            }
            case "*": {
                System.out.println(Kalkulator.mnozenie(a,b));
                break;
            }
            case "/": {
                System.out.println(Kalkulator.dzielenie(a,b));
                break;
            }
            default:
                System.out.println("nie ma takiego dzialania");
                break;
        }


    }
}
