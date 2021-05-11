package oop.Zadanie3;

public class Kalkulator {


    private double a;
    private double b;

    public static String znak;
    public static double dodawanie(double a, double b){
        double suma = a + b;
        return suma;
    }
    public static double odejmowanie(double a, double b ){
        double roznica = a - b;
        return roznica;

    }
    public static double mnozenie ( double a, double b) {
        double mnozenie = a * b;
        return mnozenie;
    }
    public static double dzielenie ( double a, double b) {
        double dzielenie = a / b;
        return dzielenie;

    }
}
