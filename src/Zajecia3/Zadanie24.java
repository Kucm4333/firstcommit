package Zajecia3;

import java.util.Scanner;
public class Zadanie24 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe:");
        Scanner sc = new Scanner(System.in);
        Integer suma =0;
        for( Integer i = 0; i<=5; i++) {
            int liczba = sc.nextInt();
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