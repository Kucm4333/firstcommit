package Zajecia3;

import java.util.Scanner;
public class Zadanie26 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe:");
        Scanner sc = new Scanner(System.in);
        Integer suma =0;
        int liczba = 1;
        while(liczba !=0) {
            liczba = sc.nextInt();
            suma +=liczba;
            if (liczba == 0){
                break;
            }
        }
        if (suma!=0) {
            System.out.println("suma tych liczb to: " +suma);
        }
    }
}