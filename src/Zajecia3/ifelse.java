package Zajecia3;

import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        if (number < 10){
            System.out.println("liczba jest mniejsza od 10");
        }
        else if (number == 10 ){
            System.out.println("liczba jest rowna 10");

        }
        else {
            System.out.println("liczba jest wieksza od 10");
        }
    }
}
